package com.example.quarkusmm.domain

import com.example.quarkusmm.port.CustomerService

@UseCase
class CustomerServiceImpl : CustomerService {
    override fun getMessage(): String {
        return "howdy"
    }
}