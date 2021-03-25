package com.pbloarz.demo.repository;

import com.pbloarz.demo.model.Plan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanDao  extends JpaRepository<Plan, Integer> {
    public Plan findByCode(String code);
    public Plan findByName(String name);

}


