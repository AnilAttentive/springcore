package com.spring.orm;

import com.spring.orm.config.ApplicationConfig;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        //giving my config class instead of file config
        context.register(ApplicationConfig.class);
        context.refresh();

        SessionFactory sessionFactory = context.getBean(SessionFactory.class);
        HibernateTemplate hibernateTemplate = new HibernateTemplate(sessionFactory);
        //For transaction writes
        hibernateTemplate.setCheckWriteOperations(false);

        Student student = new Student(54545, "DSAdfl", "sdfsdf");

        hibernateTemplate.save(student);
    }
}

