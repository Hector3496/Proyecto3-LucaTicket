package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Validacion;
import com.example.demo.repository.ValidacionRepository;

@Service
public class ValidacionServiceImpl implements ValidacionService {

	@Autowired
	private ValidacionRepository repo;
	
	@Override
	public Optional<Validacion> validationOK(int id) {
		return repo.findById(id);
	}

	@Override
	public Optional<Validacion> validationDefault(int id) {
		return repo.findById(id);
	}

	@Override
	public Optional<Validacion> validationNoContent(int id) {
		return repo.findById(id);
	}

	@Override
	public Optional<Validacion> validationUnauthorized(int id) {
		return repo.findById(id);
	}

	@Override
	public Optional<Validacion> validationNotFound(int id) {
		return repo.findById(id);
	}

}
