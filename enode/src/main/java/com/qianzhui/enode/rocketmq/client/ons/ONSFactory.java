package com.qianzhui.enode.rocketmq.client.ons;

import com.qianzhui.enode.rocketmq.client.Consumer;
import com.qianzhui.enode.rocketmq.client.Producer;
import com.qianzhui.enode.rocketmq.client.RocketMQFactory;

import java.util.Properties;

/**
 * Created by junbo_xu on 2016/4/19.
 */
public class ONSFactory implements RocketMQFactory {
    @Override
    public Producer createProducer(Properties properties) {
        return new ONSProducerImpl(properties);
    }

    @Override
    public Consumer createPushConsumer(Properties properties) {
        return new ONSConsumerImpl(properties);
    }
}
