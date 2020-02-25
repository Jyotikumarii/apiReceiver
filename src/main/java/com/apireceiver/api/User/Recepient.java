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
@Document
@Component
class Recepient implements Serializable {
    @Id
    private int orderId;
    private BasicProfile basicProfile;
    private List<Address> addresses;
}

