#Spring Cloud Config 

```properties
spring.application.name=config-server
server.port=8888

#git仓库地址
spring.cloud.config.server.git.uri=https://github.com/qngolg/config-server
#配置文件目录
spring.cloud.config.server.git.search-paths=config
#配置文件分支
spring.cloud.config.label=master
spring.cloud.config.server.git.username=
spring.cloud.config.server.git.password=
```

##请求url
`http://localhost:8888/foo/dev `


###http请求地址和资源文件映射如下:
```properties
/{application}/{profile}[/{label}]

/{application}-{profile}.yml
/{label}/{application}-{profile}.yml
/{application}-{profile}.properties
/{label}/{application}-{profile}.properties
```

##通过eureka注册中心 做成高可用的配置中心
```xml
    <!-- 添加 eureka-client 做config server集群 -->
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
        </dependency>
```

````properties
#在application.properties配置文件中添加eureka注册地址
eureka.client.service-url.defaultZone=http://localhost:8081/eureka
````
这样将配置中心注册到eureka注册中心上，可做成集群化，
config-client只用通过服务名来获取配置


