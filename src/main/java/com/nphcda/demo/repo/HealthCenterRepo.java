package com.nphcda.demo.repo;

import com.nphcda.demo.entity.Healthcenter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HealthCenterRepo extends JpaRepository<Healthcenter, Long> {

    Healthcenter findByOrganizationuit(String organizationunit);
    boolean existsByOrganizationuit(String organi);
}
