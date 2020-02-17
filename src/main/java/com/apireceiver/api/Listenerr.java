package com.apireceiver.api;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
        import org.springframework.stereotype.Component;
@Component
public class Listenerr {


    @RabbitListener(queues="Queue")
    public void Fanoutforq1recievedMessage(String msg) {
        System.out.println("Queue name is :  queue1");

        System.out.println("Recieved Message: "  + msg);
    }
    @RabbitListener(queues="Queue1")
    public void Fanoutforq2recievedMessage(String msg) {
        System.out.println("Queue name is :  queue2");

        System.out.println("Recieved Message: "  + msg);
    }

    @RabbitListener(queues="Queue2")
    public void Fanoutforq3recievedMessage(String msg) {
        System.out.println("Queue name is :  queue2");

        System.out.println("Recieved Message: "  + msg);
    }



    @RabbitListener(queues="Queue3")
    public void DirectMessage(String msg) {
        System.out.println("Queue name is :  Queue3");

        System.out.println("Recieved Message: "  + msg);
    }

    @RabbitListener(queues="Queue4")
    public void TopicMessage(String msg) {
        System.out.println("Queue name is :  Queue4");

        System.out.println("Recieved Message: "  + msg);
    }


}