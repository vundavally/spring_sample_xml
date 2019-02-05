package service;

import modal.Customer;
import repository.CustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

// setter Injection
    /*public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }*/

    // Constuctor Injection

    public CustomerServiceImpl(){


    }

    public CustomerServiceImpl(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll() {

        return customerRepository.findAll();
    }


}
