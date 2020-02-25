package com.apireceiver.api.User;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;

@Data
@ToString
@Component
@Document
class Recepient implements Serializable {
    @Id
    private String orderId;
    private BasicProfile basicProfile;
    private List<Address> addresses;
}

