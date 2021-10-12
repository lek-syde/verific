package com.nphcda.demo.repo;

import com.nphcda.demo.entity.VaccineDistribution;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Vaccinedistrepo extends JpaRepository<VaccineDistribution, Long> {


    VaccineDistribution findByStateCodeAndVaccinetypeAndPhase(String statecode,String vaccinetype, int phase );




}
