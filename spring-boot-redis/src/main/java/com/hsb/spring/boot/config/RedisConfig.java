package com.hsb.spring.boot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

/**
 * created by heshengbang
 * Blog: https://www.heshengbang.tech
 * Twitter: https://twitter.com/heshengbang
 * Github: https://github.com/heshengbang
 * Time: 2018/8/10 9:11
 */

@Configuration
public class RedisConfig {

    @Value("${spring.redis.host}")
    private String host;

    @Value("${spring.redis.port}")
    private int port;

    @Bean
    public RedisConnectionFactory redisCF(){
        //如果什么参数都不设置，默认连接本地6379端口
        JedisConnectionFactory factory = new JedisConnectionFactory();
        factory.setPort(port);
        factory.setHostName(host);
        return factory;
    }
}

//@Configuration
//@EnableCaching
//public class RedisConfig extends CachingConfigurerSupport{
//
//    private Logger logger = LoggerFactory.getLogger(this.getClass());
//
//    @Value("${spring.redis.host}")
//    private String host;
//
//    @Value("${spring.redis.port}")
//    private int port;
//
//    @Value("${spring.redis.timeout}")
//    private int timeout;
//
//    @Value("${spring.redis.password}")
//    private String password;
//
//    @Value("${spring.redis.database}")
//    private int database;
//
//    @Value("${spring.redis.pool.max-idle}")
//    private int maxIdle;
//
//    @Value("${spring.redis.pool.min-idle}")
//    private int minIdle;
//
//    /**
//     *  注解@Cache key生成规则
//     */
//    @Bean
//    public KeyGenerator keyGenerator() {
//        return (target, method, params) -> {
//            StringBuilder sb = new StringBuilder();
//            sb.append(target.getClass().getName());
//            sb.append(method.getName());
//            for (Object obj : params) {
//                sb.append(obj.toString());
//            }
//            return sb.toString();
//        };
//    }
//
//    /**
//     *  注解@Cache的管理器，设置过期时间的单位是秒
//     * @Description:
//     * @param redisTemplate
//     * @return
//     */
//    @Bean
//    public CacheManager cacheManager(RedisTemplate redisTemplate) {
//        RedisCacheManager cacheManager = new RedisCacheManager(redisTemplate);
//        Map<String, Long> expires= new HashMap<>();
//        expires.put("user", 6000L);
//        expires.put("city", 600L);
//        cacheManager.setExpires(expires);
//        // Number of seconds before expiration. Defaults to unlimited (0)
//        cacheManager.setDefaultExpiration(600); //设置key-value超时时间
//        return cacheManager;
//    }
//
//    /**
//     * redis模板，存储关键字是字符串，值是Jdk序列化
//     * @Description:
//     * @param factory
//     * @return
//     */
//    @Bean
//    public RedisTemplate<?,?> redisTemplate(RedisConnectionFactory factory) {
//        RedisTemplate<?,?> redisTemplate = new RedisTemplate<>();
//        redisTemplate.setConnectionFactory(factory);
//        //key序列化方式;但是如果方法上有Long等非String类型的话，会报类型转换错误；
//        RedisSerializer<String> redisSerializer = new StringRedisSerializer();//Long类型不可以会出现异常信息;
//        redisTemplate.setKeySerializer(redisSerializer);
//        redisTemplate.setHashKeySerializer(redisSerializer);
//
//        //JdkSerializationRedisSerializer序列化方式;
//        JdkSerializationRedisSerializer jdkRedisSerializer=new JdkSerializationRedisSerializer();
//        redisTemplate.setValueSerializer(jdkRedisSerializer);
//        redisTemplate.setHashValueSerializer(jdkRedisSerializer);
//        redisTemplate.afterPropertiesSet();
//        return redisTemplate;
//    }
//
//    /**
//     * redis连接的基础设置
//     * @Description:
//     * @return
//     */
//    @Bean
//    public JedisConnectionFactory redisConnectionFactory() {
//        JedisConnectionFactory factory = new JedisConnectionFactory();
//        factory.setHostName(host);
//        factory.setPort(port);
//        factory.setPassword(password);
//        //存储的库
//        factory.setDatabase(database);
//        //设置连接超时时间
//        factory.setTimeout(timeout);
//        factory.setUsePool(true);
//        factory.setPoolConfig(jedisPoolConfig());
//        return factory;
//    }
//
//    /**
//     * 连接池配置
//     * @Description:
//     * @return
//     */
//    @Bean
//    public JedisPoolConfig jedisPoolConfig() {
//        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
//        jedisPoolConfig.setMaxIdle(maxIdle);
//        jedisPoolConfig.setMinIdle(minIdle);
//        // jedisPoolConfig.set ...
//        return jedisPoolConfig;
//    }
//
//    /**
//     * redis数据操作异常处理
//     * 这里的处理：在日志中打印出错误信息，但是放行
//     * 保证redis服务器出现连接等问题的时候不影响程序的正常运行，使得能够出问题时不用缓存
//     * @return
//     */
//    @Bean
//    @Override
//    public CacheErrorHandler errorHandler() {
//        return new CacheErrorHandler() {
//            @Override
//            public void handleCacheGetError(RuntimeException e, Cache cache, Object key) {
//                logger.error("redis异常：key=[{}]",key,e);
//            }
//
//            @Override
//            public void handleCachePutError(RuntimeException e, Cache cache, Object key, Object value) {
//                logger.error("redis异常：key=[{}]",key,e);
//            }
//
//            @Override
//            public void handleCacheEvictError(RuntimeException e, Cache cache, Object key)    {
//                logger.error("redis异常：key=[{}]",key,e);
//            }
//
//            @Override
//            public void handleCacheClearError(RuntimeException e, Cache cache) {
//                logger.error("redis异常：",e);
//            }
//        };
//    }
//}