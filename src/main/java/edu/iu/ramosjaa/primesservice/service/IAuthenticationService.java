package edu.iu.ramosjaa.primesservice.service;

import edu.iu.ramosjaa.primesservice.model.Customer;

import java.io.IOException;

public interface IAuthenticationService {
    Customer register(Customer customer) throws IOException;
}
