package driver;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Test;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Resource r = new ClassPathResource("resources/spring.xml");
		//@SuppressWarnings("deprecation")
		//BeanFactory factory = new XmlBeanFactory(r);
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		
		Object o= ap.getBean("t");
		
		Test t = (Test)o;
		t.disp("NILESH");
		
	}

}

/*
 * <!DOCTYPE beans PUBLIC "-//SPRING//DTD BEAN 2.0//EN"
			"http://www.springframework.org/dtd/spring-beans-2.0.dtd">
 * 
 * 
 * 
 * */
 