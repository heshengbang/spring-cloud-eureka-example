package com.hsb.spring.boot.config;

import com.hsb.spring.boot.entity.People;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * Blog: https://www.heshengbang.tech
 * Twitter: https://twitter.com/heshengbang
 * Github: https://github.com/heshengbang
 * Time: 2019/1/2 14:45
 * @author heshengbang
 */
@Configuration
public class KafkaProducerConfig {
    @Value("${spring.kafka.bootstrap-servers}")
    private String bootStrapServer;

    @Bean
    public KafkaTemplate<String, People> peopleKafkaTemplate() {
        Map<String, Object> props = new HashMap<>(5);
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootStrapServer);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, ObjectSerializer.class);
        props.put(ProducerConfig.COMPRESSION_TYPE_CONFIG, "snappy");
        props.put(ProducerConfig.RETRIES_CONFIG, "3");
        return new KafkaTemplate<>(new DefaultKafkaProducerFactory<>(props));
    }

    @Bean
    public KafkaTemplate<String, String> basicKafkaTemplate() {
        Map<String, Object> props = new HashMap<>(5);
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootStrapServer);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, KryoStringSerializer.class);
        props.put(ProducerConfig.COMPRESSION_TYPE_CONFIG, "snappy");
        props.put(ProducerConfig.RETRIES_CONFIG, "3");
        return new KafkaTemplate<>(new DefaultKafkaProducerFactory<>(props));
    }
}
