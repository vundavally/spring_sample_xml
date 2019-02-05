package repository;

import modal.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}
