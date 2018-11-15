#Spring Cloud Config Client

引入jar
```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-config</artifactId>
</dependency>
```

配置文件配置config-server的地址
```properties
spring.application.name=config-client
server.port=8881

spring.cloud.config.label=master
spring.cloud.config.profile=dev
#config-server的地址
spring.cloud.config.uri=http://localhost:8888/
```