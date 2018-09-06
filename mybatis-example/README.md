### mybatis generator
- 确保数据库中表存在，如果不存在就先创建表
- 添加依赖，maven主体依赖仅需要添加tk.mybatis的`mapper`依赖既可以，如果不添加，虽然可以生成Model和Dao，但是文件中的import不会被正确
- 插件部分需要注意一下。最简化的mybatis-generator插件使用需要添加如下的插件配置：
````xml
    <plugin>
	    <groupId>org.mybatis.generator</groupId>
		<artifactId>mybatis-generator-maven-plugin</artifactId>
		<version>${mybatis.generator.version}</version>
		<configuration>
		    <configurationFile>src/main/resources/generatorConfig.xml</configurationFile>
			<overwrite>false</overwrite>
			<verbose>true</verbose>
		</configuration>
		<dependencies>
		    <!--MyBatis Generator及工具-->
			<dependency>
			    <groupId>tk.mybatis</groupId>
				<artifactId>mapper</artifactId>
				<version>${mapper.version}</version>
			</dependency>
			<dependency>
			    <groupId>mysql</groupId>
				<artifactId>mysql-connector-java</artifactId>
				<version>${mysql.version}</version>
				</dependency>
		</dependencies>
	</plugin>
````

- 编写generatorConfig.xml，这个网上一搜一大把但是那些人的并不靠谱，参考插件作者的[GitHub](https://github.com/abel533/Mapper/tree/master/generator)给出的配置
- 最后，确保generatorConfig.xml中配置的数据库连接信息正确
- 执行`mybatis-generator:generate -e`，-e这个参数可加可不加，但是如果出现错误，-e可以得到更加详细的异常信息，有助于排查问题

### mybatis基本使用
- mybatis的使用时建立在上一步已经生成文件的基础上
- 编写service/web层代码，方便测试，也可以编写单元测试去测试功能。我个人更偏向编写REST接口测试，那更加接近和前端交付的东西
- 在application.yml中添加数据库连接信息，debug级别的日志信息。类似于如下的内容：
```yaml
spring:
  datasource:
    driver-class-name: com.mysql.jdbc.Driver
    url: jdbc:mysql://localhost:3306/spring-boot?useUnicode=true&characterEncoding=utf-8&useSSL=false
    username: root
    password:

logging:
  level:
    com.hsb.mybatis.biz.dao: debug
```

- 编写Mapper扫描文件，这个非常*重要*
    - 使用mybatis和其他Dao层框架不同，使用@Repository注解并不会起作用
    - mybatis的Dao层那些Mapper根本不是一个类，而是一个接口，声明了一些方法，具体的实现并不在这里，因此添加@Repository不会起作用
    - 通常使用者可以选择使用@Mapper注解，这在mybatis中近似于替代@Repository的作用
    - 这个示例项目中深度集成了tk.mybatis的Mapper项目的功能，我选择了一种更简洁的方式来告知Spring 容器，哪些是Mapper接口文件，代码如下：
    ```java
        @Configuration
        public class TkMapperConfig {
            @Bean
            public MapperScannerConfigurer mapperScannerConfigurer () {
                MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
                mapperScannerConfigurer.setBasePackage("com.hsb.mybatis.**.dao");
                Properties properties = new Properties();
                properties.setProperty("ORDER", "BEFORE");
                mapperScannerConfigurer.setProperties(properties);
                return mapperScannerConfigurer;
            }
        }
    ```

    - 上面这段代码通过编码的方式告知了spring容器，Mapper.java文件的具体位置，这个位置是最接近文件的那个包名，可以使用通配符，但是它并不会递归扫描子包，因此最好写清楚一点

- 启动项目，测试功能

### page helper的使用
- 参考[GitHub项目主页](https://github.com/pagehelper/Mybatis-PageHelper/blob/master/README_zh.md)