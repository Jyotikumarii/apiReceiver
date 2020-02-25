package com.apireceiver.api.User;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@ToString
@Component
public class Address implements Serializable {
    @Id
    private String orderId;
    private String addressType;
    private String line1;
    private String line2;
    private String city;
    private String state;
    private String country;
}