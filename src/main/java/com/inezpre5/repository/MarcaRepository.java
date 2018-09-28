package com.inezpre5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inezpre5.entity.Marca;

@Repository
public interface MarcaRepository extends JpaRepository<Marca, Integer> {

}
