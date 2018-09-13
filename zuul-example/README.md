### Zuul极简化使用
- 组成
	- Eureka服务器
	- Web服务
	- Zuul服务
- Eureka服务器
	- 添加Eureka-server依赖
	- application.yaml中添加配置
	```xml
    spring:
      application:
        name: zuul-example-eureka
    server:
      port: 8000
    eureka:
      instance:
        hostname: localhost
      server:
        eviction-interval-timer-in-ms: 30000
        enable-self-preservation: true
      client:
        register-with-eureka: false
        fetch-registry: false
        serviceUrl:
          defaultZone: http://localhost:8000/eureka/
    ```
	- 主程序上添加@EnableEurekaServer

- web服务
	- 添加eureka-server和web依赖
	- application.yaml中添加配置，值得注意，这里的eureka服务器地址要和上一步的地址保持一致
	```xml
    spring:
      application:
        name: zuul-example-web
    server:
      port: 7000
    eureka:
      client:
        serviceUrl:
            defaultZone: http://localhost:8000/eureka/
    ```
    - 编写一个restful风格的接口

- Zuul服务
	- 添加依赖eureka-server和zuul依赖
	- 编写配置
	```xml
    spring:
      application:
        name: zuul-example-gateway
    server:
      port: 9000
    eureka:
      client:
        serviceUrl:
            defaultZone: http://localhost:8000/eureka/
    zuul:
        routes:
            path: /**
            url: http://localhost:7000/
    ```
    	- 这里相比web服务，增加了zuul的配置，path是访问zuul服务的路径，url是要映射到的地址
    	- url地址一定是在同一个服务注册中心的地址
    - 添加@EnableZuulProxy

- 验证
	- 先启动Eureka-Server/web服务/zuul服务
	- 访问localhost:7000/web/test?param=test，正常情况下，页面显示test
	- 访问localhost:9000/web/test?param=test，正常情况下，页面显示test
	- 验证成功，完成极简化Zuul使用