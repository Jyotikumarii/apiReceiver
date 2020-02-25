package com.apireceiver.api;

import com.apireceiver.api.Services.UserService;
import com.apireceiver.api.User.Customer;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Listenerr {

    @Autowired
    private UserService userService;

    @RabbitListener(queues="Queue")
    public Customer Fanoutforq1recievedMessage(Customer customer) {
        UserService.saveDoc(customer);
        return customer;
    }
    @RabbitListener(queues="Queue1")
    public Customer Fanoutforq2recievedMessage(Customer customer) {
        UserService.saveDoc(customer);
        return customer;

    }

    @RabbitListener(queues="Queue2")
    public Customer Fanoutforq3recievedMessage(Customer customer) {
        UserService.saveDoc(customer);
        return customer;

    }



    @RabbitListener(queues="Queue3")
    public Customer DirectMessage(Customer customer) {
        UserService.saveDoc(customer);
        return customer;

    }

    @RabbitListener(queues="Queue4")
    public Customer TopicMessage(Customer customer) {
        UserService.saveDoc(customer);
        return customer;

    }


}