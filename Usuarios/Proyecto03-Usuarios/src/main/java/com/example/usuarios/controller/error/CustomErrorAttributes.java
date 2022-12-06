package com.example.usuarios.controller.error;

import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import com.example.usuarios.controller.UsuarioController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 *
 * @author Susana Diaz
 */

/*
 * Se usara para alterar el formato propio de JSon para los errores
 * El acceso es automatico
 */

@Component
public class CustomErrorAttributes extends DefaultErrorAttributes { 

	private static final Logger logger = LoggerFactory.getLogger(UsuarioController.class);
	
	/*
	 * formato fecha
	 */
	private static final DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
	
	/*
	 * errores por defecto
	 */
	@Override
	public Map<String, Object> getErrorAttributes(WebRequest webRequest, ErrorAttributeOptions options) { 
		
		logger.info("------ getErrorAttributes(): " + options);
		
		Map<String, Object> errorAttributes = super.getErrorAttributes(webRequest, options);
		logger.info("------ getErrorAttributes(): " + options);		

		/*
		 * formatear y actualizar marca de tiempo
		 */
		Object timestamp = errorAttributes.get("timestamp"); 
		
		/*
		 * si no hubiera marca de tiempo, se formatea de esta manera
		 */
		if (timestamp == null) { 
			errorAttributes.put("timestamp", dateFormat.format(new Date()));
			
		} else { 
			errorAttributes.put("timestamp", dateFormat.format((Date) timestamp));
		}
		
		/*
		 * eliminar la traza, para simplificar la salida
		 */
		errorAttributes.remove("trace"); 
		
		/*
		 * eliminar el path, para simplificar la salida
		 */
		errorAttributes.remove("path");  
		
		/*
		 * insertar @author
		 */
		errorAttributes.put("author", "Susana Díaz"); 
				
		return errorAttributes;
	}
}
