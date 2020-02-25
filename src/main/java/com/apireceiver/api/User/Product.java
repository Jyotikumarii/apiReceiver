package com.apireceiver.api.User;
import javax.persistence.Entity;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@ToString
@Component
public class Product implements Serializable {
    @Id
    private String orderId;
    private String name;
    private Long price;
}