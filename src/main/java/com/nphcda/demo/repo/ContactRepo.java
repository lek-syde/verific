package com.nphcda.demo.repo;


import com.nphcda.demo.entity.Contact;
import com.nphcda.demo.entity.Healthcenter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContactRepo extends JpaRepository<Contact, Long> {
    List<Contact> findByStatecode(String statecode);


}
