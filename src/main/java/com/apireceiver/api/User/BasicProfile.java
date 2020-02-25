package com.apireceiver.api.User;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@ToString
@Entity
public class BasicProfile implements Serializable {
    @Id
    private int id;
    private String name;
    private String phoneNumber;
    private String email;
}