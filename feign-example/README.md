### feign-example
- 搭建最简单的一个feign-example也需要以下四个组成：
	- feign-example-producer：它实现最终的功能
	- feign-example-api：它定义了feign接口
	- feign-example-consumer：它将使用feign-example-api声明的接口，该接口的实际功能是由feign-example-producer提供
    - feign-example-eureka：它提供了一个平台，feign-example-producer/feign-example-consumer都注册在其上，并通过@FeignClient(name="XXX")互相知道彼此的存在，并使用对方提供的功能

- feign-example-eureka
	- 添加eureka的依赖
	- SpringBoot main class上面添加注解`@EnableEurekaServer`
	- 添加application.yaml配置文件，内容参照如下：
	```
        spring:
            application:
              name: feign-example-eureka
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

- feign-example-api
	- 添加web依赖
	- 编写接口，这里需要注意，接口上面的`@RequestMapping`以及`@GetMapping`之类的注解路径一定要留意，feign-example-producer会用到

- feign-example-producer
	- 添加依赖
	- 编写feign-example-api接口的实现类，也可以不用实现接口的形式，但是类上的URL路径一定要是feign-example-api上面一样的才能被feign-example-consumer访问到
	- Spring-boot main class上面添加注解`@EnableEurekaClient`
	- 添加配置，将自己作为一个服务，注册到feign-example-eureka服务器中，配置参考如下：
	```
        spring:
            application:
                name: feign-example-producer
        server:
          port: 9000
        eureka:
          client:
            serviceUrl:
                defaultZone: http://localhost:8000/eureka/
    ```

- feign-example-consumer
	- 添加依赖，包括Eureka和feign的依赖
	- 编写接口，该接口继承自feign-example-api这个接口，给这个接口添加注解`@FeignClient(name = "XXX")`
		- FeignClient注解中的XXX表示服务名，在本示例程序中，它指feign-example-producer，即服务提供程序的程序名
		- FeignClient中的服务名通常不会硬编码到程序中，而是写在配置文件中，通过配置的方式去告知程序要使用的服务的名字
	- 编写REST接口，接口需要实现的具体功能，通过调用上一步的接口去实现
	- 在Spring-boot main class上面添加两个注解：
		- `@EnableDiscoveryClient`表示启用服务注册与发现
		- `@EnableFeignClients(basePackages = {"com.hsb.feign.consumer.biz.service"})` 表示扫描配置的包路径下，使用了`@FeignClient`注解的地方
	- 添加配置，配置的示例如下：
	```
        spring:
          application:
            name: feign-example-consumer
        server:
          port: 7000
        eureka:
          client:
            serviceUrl:
                defaultZone: http://localhost:8000/eureka/
    ```