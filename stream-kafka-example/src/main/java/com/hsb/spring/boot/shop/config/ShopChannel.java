package com.hsb.spring.boot.shop.config;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * created by heshengbang
 * Blog: https://www.heshengbang.tech
 * Twitter: https://twitter.com/heshengbang
 * Github: https://github.com/heshengbang
 * Time: 2018/8/16 15:22
 */

public interface ShopChannel {
    /**
     * 发消息的通道名称
     */
    String SHOP_OUTPUT = "shop_output";

    /**
     * 消息的订阅通道名称
     */
    String SHOP_INPUT = "shop_input";

    /**
     * 发消息的通道
     *
     * @return
     */
    @Output(SHOP_OUTPUT)
    MessageChannel sendShopMessage();

    /**
     * 收消息的通道
     *
     * @return
     */
    @Input(SHOP_INPUT)
    SubscribableChannel recieveShopMessage();
}