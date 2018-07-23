## Eureka Server

### notes

- eureka-server的pom.xml中，通常只需要依赖spring-cloud-starter-eureka-server即可实现eureka-server的基本使用。但是如果打算使用eureka-server的权限控制，则需要做以下几步：
    - 在pom.xml中添加spring-boot-starter-security包依赖
    - 修改application.yaml文件：
        - 设置security.basic.enabled: true，这意味着启用基本身份认证
        - 添加security.user.name: username，登录的时候使用用户名为username
        - 添加security.user.password: password，登录的时候使用密码为password
        
- 值得注意的是，我看很多人提到使用yaml配置时容易出问题，输入键值后和冒号后，冒号后面要有空格，不然很容易报错