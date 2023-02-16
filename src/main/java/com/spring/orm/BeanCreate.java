package com.spring.orm;


import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

public class BeanCreate extends LocalSessionFactoryBean {
	
private DataSource dataSource;
private Properties hibernateProperties;
private  Class<?>[] annotatedClasses ;


	public BeanCreate(DataSource dataSource, Properties hibernateProperties, Class<?>[] annotatedClasses) {
	super();
	this.dataSource = dataSource;
	this.hibernateProperties = hibernateProperties;
	this.annotatedClasses = annotatedClasses;
}


	public DataSource getDataSource() {
	return dataSource;
}


public void setDataSource(DataSource dataSource) {
	this.dataSource = dataSource;
}


public Properties getHibernateProperties() {
	return hibernateProperties;
}


public void setHibernateProperties(Properties hibernateProperties) {
	this.hibernateProperties = hibernateProperties;
}


public Class<?>[] getAnnotatedClasses() {
	return annotatedClasses;
}


public void setAnnotatedClasses(Class<?>... annotatedClasses) {
	this.annotatedClasses = annotatedClasses;
}


	public BeanCreate() {
		// TODO Auto-generated constructor stub
	}

}
