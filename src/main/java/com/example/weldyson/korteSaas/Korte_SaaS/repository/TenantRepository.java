package com.example.weldyson.korteSaas.Korte_SaaS.repository;

import com.example.weldyson.korteSaas.Korte_SaaS.model.Tenant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TenantRepository extends JpaRepository<Tenant, UUID> {

}
