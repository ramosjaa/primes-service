package edu.iu.ramosjaa.primesservice.service;

import edu.iu.ramosjaa.primesservice.model.Customer;

import java.io.IOException;

public interface IAuthenticationService {
    boolean register(Customer customer) throws IOException;
}
