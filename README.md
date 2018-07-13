# spring-cloud-eureka-example
A project for simple spring cloud and eureka.

This project provide three modules. Eureka Server/service producer/service consumer.


## how to start
- run eureka-server with `mvn spring-boot:run`
- same way to run spring-cloud-producer. when it has been finished, check whether localhost:8000 has a new service. that's correct!
- same way to bootstrap spring-cloud-producer, and access it with url `localhost:9002/hello/heshengbang` and you will get some information like:
> hello! hehu
spring-cloud-consumer through eureka-server find service that spring-cloud-produer provide. when some request come to spring-cloud-consumer, it will call spring-cloud-producer to finish this request.