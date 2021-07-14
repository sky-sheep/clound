# clound
## client7001，client7002
服务client7001，基本的web服务
## gateway6000
网关服务，路由转发到8000端口进行认证或直接转发到7000端口跳过认证
## oauth8000
认证服务器，使用oauth2+redis，支持授权码模式，密码模式及token刷新，token存放入redis中，可将关于redis的配置注掉，将token放入内存中或将redis替换为JWT
## ribbon7000
负载均衡服务器，可将请求分发给各个服务，支持7种负载均衡算法，目前为随机分发，可修改配置类中的bean修改算法机制
