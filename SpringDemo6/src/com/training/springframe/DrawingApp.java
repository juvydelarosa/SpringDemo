package com.training.springframe;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//3 using app context
		//NOTE: need to move spring.xml inside src folder
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		//will cause t.draw to print 3 points (pointA from parent + 2 points from triangle1 bean)
		//Triangle t = (Triangle)context.getBean("triangle1"); //bean in spring.xml
		
		//will cause t.draw to print 2 pts (pointA from parent + pointB from triangle2) and a NPE (pointC is not inst)
		Triangle t = (Triangle)context.getBean("triangle2"); //bean in spring.xml
		//app context can instantiate members/fields
		
		t.draw();
	}

}
