package com.apireceiver.api.Services;
import com.apireceiver.api.User.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends MongoRepository<Customer, String> {

}