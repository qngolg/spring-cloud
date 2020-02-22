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

##调用config-server配置中心集群化的配置
```xml

  <!-- 1、需要将服务注册到注册中心中去
    2、通过服务名调用配置中心
    添加 eureka-client 注册中心 -->
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
        </dependency>
```

```properties
#配置注册中心地址
eureka.client.service-url.defaultZone=http://localhost:8081/eureka/
#设置true
spring.cloud.config.discovery.enabled=true
#设置config配置中心的server-id 即可获取配置
spring.cloud.config.discovery.service-id=config-server
```