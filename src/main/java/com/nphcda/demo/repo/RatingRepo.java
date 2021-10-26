package com.nphcda.demo.repo;

import com.nphcda.demo.entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepo extends JpaRepository<Rating, Integer> {

}
