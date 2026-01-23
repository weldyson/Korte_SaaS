package com.example.weldyson.korteSaas.Korte_SaaS.service;


import com.example.weldyson.korteSaas.Korte_SaaS.model.Tenant;
import com.example.weldyson.korteSaas.Korte_SaaS.repository.TenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TenantService {
    @Autowired
    private TenantRepository repository;

    public Tenant save(Tenant tenant){
        return repository.save(tenant);
    }


}
