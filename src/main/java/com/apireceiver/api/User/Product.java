package com.apireceiver.api.User;
import javax.persistence.Entity;
import lombok.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@ToString
@Entity
public class Product implements Serializable {
    @Id
    private int id;
    private String name;
    private Long price;
}