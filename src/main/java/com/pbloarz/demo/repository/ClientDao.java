package com.pbloarz.demo.repository;

import com.pbloarz.demo.model.Client;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientDao   extends JpaRepository<Client, Integer> {
   public Optional<Client> findById(Integer id);
   public Client findByRut(String rut);
   public Client findByFirstName(String firstName);
   public Client findByLastname(String lastName);
   public Client findByCellphone(String cellphone);
   public Client findByCity(String city);
   public Client findByDir(String dir);
   public Client findByEmail(String email);




}
