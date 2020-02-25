package com.apireceiver.api.User;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@ToString
@Component
public class BasicProfile implements Serializable {
    @Id
    private String orderId;
    private String name;
    private String phoneNumber;
    private String email;
}