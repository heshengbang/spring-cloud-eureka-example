package com.hsb.spring.boot.config;

import com.hsb.spring.boot.entity.People;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.common.serialization.Serializer;
import org.springframework.stereotype.Component;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Map;

/**
 * Blog: https://www.heshengbang.tech
 * Twitter: https://twitter.com/heshengbang
 * Github: https://github.com/heshengbang
 * Time: 2019/1/2 14:58
 * @author heshengbang
 */
@Component
@Slf4j
public class ObjectSerializer implements Serializer<People> {

    @Override
    public void configure(Map<String, ?> map, boolean b) {
    }

    @Override
    public byte[] serialize(String s, People people) {
        byte[] bytes = null;
        try (ByteArrayOutputStream byteArray = new ByteArrayOutputStream();
             ObjectOutputStream outputStream = new ObjectOutputStream(byteArray)){
            outputStream.writeObject(people);
            outputStream.flush();
            bytes = byteArray.toByteArray();
        } catch (IOException e) {
            log.error("序列化时出错：", e);
        }
        return bytes;
    }

    @Override
    public void close() {
    }
}
