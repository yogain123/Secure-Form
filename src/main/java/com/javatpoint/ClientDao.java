package com.javatpoint;
import org.springframework.orm.hibernate3.HibernateTemplate;
public class ClientDao {

	HibernateTemplate template;  
	public void setTemplate(HibernateTemplate template) {  
	    this.template = template;  
	}  
	//method to save employee  
	public void saveClient(Client e){  
	    template.save(e);  
	}  
}
