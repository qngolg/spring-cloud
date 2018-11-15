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





