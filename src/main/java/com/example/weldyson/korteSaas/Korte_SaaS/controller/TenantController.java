package com.example.weldyson.korteSaas.Korte_SaaS.controller;

import com.example.weldyson.korteSaas.Korte_SaaS.model.Tenant;
import com.example.weldyson.korteSaas.Korte_SaaS.repository.TenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/tenants")
public class TenantController {

    @Autowired
    private TenantRepository repository;

    @GetMapping
    public List<Tenant> listar() {
        return repository.findAll();
    }
}
