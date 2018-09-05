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