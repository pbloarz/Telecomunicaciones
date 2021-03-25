package com.pbloarz.demo.repository;

import com.pbloarz.demo.model.Communication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommunicationDao  extends JpaRepository<Communication, Integer> {


}
