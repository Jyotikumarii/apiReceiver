package com.apireceiver.api.User;
import javax.persistence.*;
import java.util.List;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Data
@ToString
@Component
@Document(collection = "customer")
public class Customer implements Serializable {
    @Id
    private String orderId;
    private List<Product> products;
    private Recepient receipient;
}