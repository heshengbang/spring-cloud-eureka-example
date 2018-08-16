package com.hsb.spring.boot.official;

/**
 * created by heshengbang
 * Blog: https://www.heshengbang.tech
 * Twitter: https://twitter.com/heshengbang
 * Github: https://github.com/heshengbang
 * Time: 2018/8/16 16:29
 */

public class KafkaProperties {
    static final String TOPIC = "topic1";
    static final String KAFKA_SERVER_URL = "localhost";
    static final int KAFKA_SERVER_PORT = 9092;
    static final int KAFKA_PRODUCER_BUFFER_SIZE = 64 * 1024;
    static final int CONNECTION_TIMEOUT = 100000;
    static final String TOPIC2 = "topic2";
    static final String TOPIC3 = "topic3";
    static final String CLIENT_ID = "SimpleConsumerDemoClient";

    private KafkaProperties() {}
}