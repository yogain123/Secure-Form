package com.javatpoint;

import java.io.IOException;
import java.util.Map;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


	@SuppressWarnings("deprecation")
	@Controller
	public class SpringMVCController {
		
		@RequestMapping(value = "/PostFormData",method = RequestMethod.POST,consumes="application/json")
		public @ResponseBody void PostFormData(@RequestBody String  clientjson) throws JsonParseException, JsonMappingException, IOException {
			Resource r=new ClassPathResource("spring-servlet.xml");  
		    BeanFactory factory=new XmlBeanFactory(r);  
		      
		    ClientDao dao=(ClientDao)factory.getBean("ClientDao"); 
		    ObjectMapper objectMapper = new ObjectMapper();
		    objectMapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		    Client client = objectMapper.readValue(clientjson, Client.class);
		    System.out.println(clientjson);
		    
		      System.out.println(client);  
		    dao.saveClient(client);
		}	
		}