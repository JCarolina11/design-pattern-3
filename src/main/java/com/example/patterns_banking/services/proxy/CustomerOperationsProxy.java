package com.example.patterns_banking.services.proxy;

public class CustomerOperationsProxy implements ICustomerOperations{

    @Override
    public Boolean verifyEmail(String email) {
        return email.endsWith("@yahoo.com");
    }
}
