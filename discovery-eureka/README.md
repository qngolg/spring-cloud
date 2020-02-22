#Spring Cloud Eureka 分布式注册中心（集群）

用途：
eureka作为注册中心，其中服务注册中心Eureka Server，当多个服务向他注册的时候，他的负载是
非常高的。这样就需要把eureka集群化

怎么做：
1、新建application-server1.properties
````properties
server.port=8081

# 注册名称
eureka.instance.hostname=server1
# 注册地址
eureka.client.service-url.defaultZone=http://server2:8082/eureka/

#表示是否注册到自己的eureka服务器上 默认为true
#eureka.client.register-with-eureka=false

#是否从eureka上获取注册信息 默认为true
#eureka.client.fetch-registry=false

spring.profiles=server1
````

2、新建application-server2.properties
```properties
server.port=8082
eureka.instance.hostname=server2
#二者分别相互注册 实现集群化
eureka.client.service-url.defaultZone=http://server1:8081/eureka/
spring.profiles=server2
```