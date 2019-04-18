package com.wush.activemq.common;

import org.apache.activemq.memory.list.MessageList;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * @ClassName: MQListerner
 * @Description: 消息监听
 * @Author: developer
 * @Date: 2019/4/16 23:17
 */

public class MQListerner implements MessageListener {

    @Override
    public void onMessage(Message message) {

        if(message instanceof TextMessage){
            TextMessage textMessage = (TextMessage)message;
            try {
                System.out.println(textMessage.getText());
            } catch (JMSException e) {
                e.printStackTrace();
            }
        }
    }
}
