package com.example.demo.controller.error;

import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.ConversionNotSupportedException;
import org.springframework.beans.TypeMismatchException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.validation.BindException;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.async.AsyncRequestTimeoutException;
import org.springframework.web.multipart.support.MissingServletRequestPartException;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 *
 * @author Susana Diaz
 */

/*
 * @ControllerAdvice, para habilitar configuracion automatica al inicio
 * ResponseEntityExceptionHandler, clase para proporcionar una excepcion centralizada en todos los metodos
 */

@ControllerAdvice
public class CustomGlobalExceptionHandler extends ResponseEntityExceptionHandler {		
	
	/*
	 * NO_CONTENT
	 * error 204
	 * cuando el servidor no puede encontrar contenido en la base de datos
	 */
	protected ResponseEntity<Object> handleNoHandlerContentException(
			ValidacionNoContentException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
		logger.info("------ handleNoHandlerContentException()");
		
		StringBuilder builder = new StringBuilder();	 
		builder.append("No encontrado");
		
		Map<String, Object> body = new LinkedHashMap<>();		
		body.put("timestamp", new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()));
		body.put("status", status.value());		
		body.put("error", ex.getLocalizedMessage());
		body.put("message", builder.toString());
		body.put("author", "Susana Díaz");
		
		return new ResponseEntity<Object>(body, new HttpHeaders(), HttpStatus.NO_CONTENT);
	}
	/*
	 * BAD_REQUEST
	 * error 400
	 * cuando el servidor no puede procesar la solicitud debido a un error del cliente
	 */
	@Override	
	protected ResponseEntity<Object> handleMissingServletRequestParameter(
			MissingServletRequestParameterException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
		logger.info("------ handleMissingServletRequestParameter()");
		
		StringBuilder builder = new StringBuilder();	 
		builder.append("Solicitud incorrecta");
		
		Map<String, Object> body = new LinkedHashMap<>();		
		body.put("timestamp", new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()));
		body.put("status", status.value());		
		body.put("error", ex.getLocalizedMessage());
		body.put("message", builder.toString());
		body.put("author", "Susana Díaz");

		return new ResponseEntity<Object>(body, new HttpHeaders(), HttpStatus.BAD_REQUEST);
	}
	
	/*
	 * BAD_REQUEST
	 * error 400
	 * cuando el servidor no puede procesar la solicitud debido a un error del cliente
	 */
	@Override	
	protected ResponseEntity<Object> handleServletRequestBindingException(
			ServletRequestBindingException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
		logger.info("------ handleServletRequestBindingException()");
		
		StringBuilder builder = new StringBuilder();	 
		builder.append("Solicitud incorrecta");
		
		Map<String, Object> body = new LinkedHashMap<>();		
		body.put("timestamp", new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()));
		body.put("status", status.value());		
		body.put("error", ex.getLocalizedMessage());
		body.put("message", builder.toString());
		body.put("author", "Susana Díaz");

		return new ResponseEntity<Object>(body, new HttpHeaders(), HttpStatus.BAD_REQUEST);
	}	
	
	/*
	 * BAD_REQUEST
	 * error 400
	 * cuando el servidor no puede procesar la solicitud debido a un error del cliente
	 */
	@Override	
	protected ResponseEntity<Object> handleTypeMismatch(
			TypeMismatchException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
		logger.info("------ handleTypeMismatch()");
				
		StringBuilder builder = new StringBuilder();	 
		builder.append("Solicitud incorrecta");
		
		Map<String, Object> body = new LinkedHashMap<>();		
		body.put("timestamp", new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()));
		body.put("status", status.value());		
		body.put("error", ex.getLocalizedMessage());
		body.put("message", builder.toString());
		body.put("author", "Susana Díaz");

		return new ResponseEntity<Object>(body, new HttpHeaders(), HttpStatus.BAD_REQUEST);
	}
	
	/*
	 * BAD_REQUEST
	 * error 400
	 * cuando el servidor no puede procesar la solicitud debido a un error del cliente
	 */
	@Override	
	protected ResponseEntity<Object> handleHttpMessageNotReadable(
			HttpMessageNotReadableException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
		logger.info("------ handleHttpMessageNotReadable()");
				
		StringBuilder builder = new StringBuilder();	 
		builder.append("Solicitud incorrecta");
		
		Map<String, Object> body = new LinkedHashMap<>();		
		body.put("timestamp", new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()));
		body.put("status", status.value());		
		body.put("error", ex.getLocalizedMessage());
		body.put("message", builder.toString());
		body.put("author", "Susana Díaz");

		return new ResponseEntity<Object>(body, new HttpHeaders(), HttpStatus.BAD_REQUEST);
	}
	
	/*
	 * BAD_REQUEST
	 * error 400
	 * cuando el servidor no puede procesar la solicitud debido a un error del cliente
	 */
	@Override	
	protected ResponseEntity<Object> handleMethodArgumentNotValid(
			MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
		logger.info("------ handleMethodArgumentNotValid()");
		
		StringBuilder builder = new StringBuilder();	 
		builder.append("Solicitud incorrecta");
		
		Map<String, Object> body = new LinkedHashMap<>();		
		body.put("timestamp", new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()));
		body.put("status", status.value());		
		body.put("error", ex.getLocalizedMessage());
		body.put("message", builder.toString());
		body.put("author", "Susana Díaz");

		return new ResponseEntity<Object>(body, new HttpHeaders(), HttpStatus.BAD_REQUEST);
	}
	
	/*
	 * BAD_REQUEST
	 * error 400
	 * cuando el servidor no puede procesar la solicitud debido a un error del cliente
	 */
	@Override	
	protected ResponseEntity<Object> handleMissingServletRequestPart(
			MissingServletRequestPartException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
		logger.info("------ handleMissingServletRequestPart()");
		
		StringBuilder builder = new StringBuilder();	 
		builder.append("Solicitud incorrecta");
		
		Map<String, Object> body = new LinkedHashMap<>();		
		body.put("timestamp", new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()));
		body.put("status", status.value());		
		body.put("error", ex.getLocalizedMessage());
		body.put("message", builder.toString());
		body.put("author", "Susana Díaz");

		return new ResponseEntity<Object>(body, new HttpHeaders(), HttpStatus.BAD_REQUEST);
	}
	
	/*
	 * BAD_REQUEST
	 * error 400
	 * cuando el servidor no puede procesar la solicitud debido a un error del cliente
	 */
	@Override	
	protected ResponseEntity<Object> handleBindException(
			BindException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
		logger.info("------ handleBindException()");
		
		StringBuilder builder = new StringBuilder();	 
		builder.append("Solicitud incorrecta");
		
		Map<String, Object> body = new LinkedHashMap<>();		
		body.put("timestamp", new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()));
		body.put("status", status.value());		
		body.put("error", ex.getLocalizedMessage());
		body.put("message", builder.toString());
		body.put("author", "Susana Díaz");

		return new ResponseEntity<Object>(body, new HttpHeaders(), HttpStatus.BAD_REQUEST);
	}	
		
	/*
	 * NOT_FOUND
	 * error 404
	 * cuando el servidor de origen no encuentra una representacion actual para el recurso de destino, no se reconoce la URL, la fuente no existe
	 */
	@Override	
	protected ResponseEntity<Object> handleNoHandlerFoundException(
			NoHandlerFoundException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
		logger.info("------ handleMethodArgumentNotValid()");
		
		StringBuilder builder = new StringBuilder();	 
		builder.append("No encontrado");
		
		Map<String, Object> body = new LinkedHashMap<>();		
		body.put("timestamp", new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()));
		body.put("status", status.value());		
		body.put("error", ex.getLocalizedMessage());
		body.put("message", builder.toString());
		body.put("author", "Susana Díaz");
		
		return new ResponseEntity<Object>(body, new HttpHeaders(), HttpStatus.NOT_FOUND);
	}
		
	/*
	 * METHOD_NOT_ALLOWED
	 * error 405
	 * cuando el metodo recibido es conocido por el servidor de origen, pero el recurso de destino no
	 */
	@Override
	protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(
			HttpRequestMethodNotSupportedException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
		logger.info("------ handleHttpRequestMethodNotSupported()");
		
		StringBuilder builder = new StringBuilder();	 
		builder.append("Método no permitido");
		
		Map<String, Object> body = new LinkedHashMap<>();		
		body.put("timestamp", new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()));
		body.put("status", status.value());		
		body.put("error", ex.getLocalizedMessage());
		body.put("message", builder.toString());
		body.put("author", "Susana Díaz");

		return new ResponseEntity<Object>(body, new HttpHeaders(), HttpStatus.METHOD_NOT_ALLOWED);
	}
	
	/*
	 * NOT_ACCEPTABLE
	 * error 406
	 * cuando el recurso solicitado no tiene una representacion actual aceptable
	 */
	@Override	
	protected ResponseEntity<Object> handleHttpMediaTypeNotAcceptable(
			HttpMediaTypeNotAcceptableException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
		logger.info("------ handleHttpMediaTypeNotAcceptable()");
		
		StringBuilder builder = new StringBuilder();	 
		builder.append("No aceptable");
		
		Map<String, Object> body = new LinkedHashMap<>();		
		body.put("timestamp", new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()));
		body.put("status", status.value());		
		body.put("error", ex.getLocalizedMessage());
		body.put("message", builder.toString());
		body.put("author", "Susana Díaz");

		return new ResponseEntity<Object>(body, new HttpHeaders(), HttpStatus.NOT_ACCEPTABLE);		
	}
	
	/*
	 * UNSUPPORTED_MEDIA_TYPE
	 * error 415
	 * cuando el servidor de origen se niega a atender la solicitud 
	 */	
	@Override	
	protected ResponseEntity<Object> handleHttpMediaTypeNotSupported(
			HttpMediaTypeNotSupportedException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
		logger.info("------ handleHttpRequestMethodNotSupported()");
		
		StringBuilder builder = new StringBuilder();	 
		builder.append("Tipo de medio no compatible");
		
		Map<String, Object> body = new LinkedHashMap<>();		
		body.put("timestamp", new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()));
		body.put("status", status.value());		
		body.put("error", ex.getLocalizedMessage());
		body.put("message", builder.toString());
		body.put("author", "Susana Díaz");

		return new ResponseEntity<Object>(body, new HttpHeaders(), HttpStatus.UNSUPPORTED_MEDIA_TYPE);		
	}
		
	/*
	 * INTERNAL_SERVER_ERROR
	 * error 500
	 * cuando el servidor encontro una condicion inesperada que le impidio cumplir la solicitud 
	 */
	@Override	
	protected ResponseEntity<Object> handleMissingPathVariable(
			MissingPathVariableException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {		
		logger.info("------ handleMissingPathVariable()");
		
		StringBuilder builder = new StringBuilder();	 
		builder.append("Error interno del servidor");
		
		Map<String, Object> body = new LinkedHashMap<>();		
		body.put("timestamp", new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()));
		body.put("status", status.value());		
		body.put("error", ex.getLocalizedMessage());
		body.put("message", builder.toString());
		body.put("author", "Susana Díaz");

		return new ResponseEntity<Object>(body, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);		
	}
		
	/*
	 * INTERNAL_SERVER_ERROR
	 * error 500
	 * cuando el servidor encontro una condicion inesperada que le impidio cumplir la solicitud 
	 */	
	@Override	
	protected ResponseEntity<Object> handleConversionNotSupported(
			ConversionNotSupportedException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {		
		logger.info("------ handleConversionNotSupported()");
		
		StringBuilder builder = new StringBuilder();	 
		builder.append("Error interno del servidor");
		
		Map<String, Object> body = new LinkedHashMap<>();		
		body.put("timestamp", new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()));
		body.put("status", status.value());		
		body.put("error", ex.getLocalizedMessage());
		body.put("message", builder.toString());
		body.put("author", "Susana Díaz");

		return new ResponseEntity<Object>(body, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);		
	}	
	
	/*
	 * INTERNAL_SERVER_ERROR
	 * error 500
	 * cuando el servidor encontro una condicion inesperada que le impidio cumplir la solicitud 
	 */	
	@Override	
	protected ResponseEntity<Object> handleHttpMessageNotWritable(
			HttpMessageNotWritableException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {		
		logger.info("------ handleHttpMessageNotWritable()");
		
		StringBuilder builder = new StringBuilder();	 
		builder.append("Error interno del servidor");
		
		Map<String, Object> body = new LinkedHashMap<>();		
		body.put("timestamp", new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()));
		body.put("status", status.value());		
		body.put("error", ex.getLocalizedMessage());
		body.put("message", builder.toString());
		body.put("author", "Susana Díaz");

		return new ResponseEntity<Object>(body, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);		
	}		
	
	/*
	 * SERVICE_UNAVAILABLE
	 * error 503
	 * cuando el servidor actualmente no puede manejar la solicitud debido a una sobrecarga temporal o mantenimiento programado
	 */
	@Override	
	protected ResponseEntity<Object> handleAsyncRequestTimeoutException(
			AsyncRequestTimeoutException ex, HttpHeaders headers, HttpStatus status, WebRequest webRequest) {
		logger.info("------ handleAsyncRequestTimeoutException()");
		
		StringBuilder builder = new StringBuilder();	 
		builder.append("Servicio no disponible");
		
		Map<String, Object> body = new LinkedHashMap<>();		
		body.put("timestamp", new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()));
		body.put("status", status.value());		
		body.put("error", ex.getLocalizedMessage());
		body.put("message", builder.toString());
		body.put("author", "Susana Díaz");
		
		return new ResponseEntity<Object>(body, new HttpHeaders(), HttpStatus.SERVICE_UNAVAILABLE);
	}	
}
