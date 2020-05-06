package com.example.quarkusmm.samemodule.domain

import com.example.quarkusmm.samemodule.port.CustomerService
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class CustomerServiceImpl : CustomerService {
    override fun getMessage(): String {
        return "howdy"
    }
}