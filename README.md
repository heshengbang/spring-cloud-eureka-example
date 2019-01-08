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
- [swagger](https://github.com/heshengbang/spring-cloud-example/tree/master/swagger-example)
- [Feign/Spring boot/spring cloud/Eureka](https://github.com/heshengbang/spring-cloud-example/tree/master/feign-example)
- [redis](https://github.com/heshengbang/spring-cloud-example/tree/master/redis-example)
- [mybatis+mapper+page helper](https://github.com/heshengbang/spring-cloud-example/tree/master/mybatis-example)
	- `mvn clean compile checkstyle:check findbugs:check`
	
- OAuth2 #
- HBase
- elasticJob
- rabbitmq #
- druid
- zuul #
- zookeeper #
- kafka #
- Ribbon
- Hystrix
- ElasticSearch
