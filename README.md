# spring-cloud-eureka-example
A project for simple spring cloud and eureka.

This project provide three modules. Eureka Server/service producer/service consumer.


## how to start
- run eureka-server with `mvn spring-boot:run`
- same way to run spring-cloud-producer. when it has been finished, check whether localhost:8000 has a new service. that's correct!
- same way to bootstrap spring-cloud-producer, and access it with url `localhost:9002/hello/heshengbang` and you will get some information like:
> hello! heshengbang

spring-cloud-consumer through eureka-server find service that spring-cloud-produer provide. when some request come to spring-cloud-consumer, it will call spring-cloud-producer to finish this request.

## key words
- swagger #
- Feign/Spring boot/spring cloud/Eureka #
- HBase
- elasticjob
- rabbitmq
- redis
- druid
- pageHelper
- mybatis
- lombok #
- TkMapper
- p3c
- mvn clean compile checkstyle:check findbugs:check
- zuul #
- zookeeper
- OAuth2 #

Attention, the items marked by `#` had been integrated to this project, and left items will be integrate in the future.

## mybatis-generator的使用
- 创建generatorConfig.xml
- 修改其中的内容
- 执行指令：`mvn mybatis-generator:generate`