package com.apireceiver.api.Services;

import com.apireceiver.api.User.Customer;
import org.apache.catalina.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public abstract class UserService {
    @Autowired
    private static OrderRepository orderRepository;

    public static Customer saveDoc(Customer orderRequest){
        return orderRepository.save(orderRequest);
    }

    public Optional<Customer> findOrder(String id){
        return orderRepository.findById(id);
    }


}
