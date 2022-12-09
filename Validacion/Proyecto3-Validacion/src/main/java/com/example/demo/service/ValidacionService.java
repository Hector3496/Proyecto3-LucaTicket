package com.example.demo.service;

import java.util.Optional;


import com.example.demo.model.Validacion;

public interface ValidacionService {

	Optional<Validacion> validationOK(int id);

	Optional<Validacion> validationDefault(int id);

	Optional<Validacion> validationNoContent(int id);

	Optional<Validacion> validationUnauthorized(int id);

	Optional<Validacion> validationNotFound(int id);
	

}
