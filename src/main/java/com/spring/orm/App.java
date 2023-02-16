package com.spring.orm;

import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws Exception {
          
       
	   ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/orm/config.xml");
	   
	  
	   LocalSessionFactoryBean bean=new LocalSessionFactoryBean();
	   bean=context.getBean("beans" , LocalSessionFactoryBean.class);
	   
            HibernateTemplate hibernateTemplate =new HibernateTemplate( (SessionFactory) bean);
                        Student student=new Student(54545, "DSAdfl","sdfsdf");
                        
                        hibernateTemplate.delete(student);
                        
                        
//               
//               hibernateTemplate.save(student);

    }
}
