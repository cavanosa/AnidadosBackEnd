package com.inezpre5.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inezpre5.entity.Marca;
import com.inezpre5.repository.MarcaRepository;

@Service
public class MarcaService {
	
	@Autowired
	MarcaRepository marcaRepository;
	
	public List<Marca> getMarcas(){
		return marcaRepository.findAll();
	}
}
