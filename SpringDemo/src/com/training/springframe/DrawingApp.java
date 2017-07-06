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
		// TODO Auto-generated method stub
		// 1 using instantiation
		//Triangle t = new Triangle();
		//t.draw()
		
		//2 using bean factory
		//spring.xml just needs to be inside the project below the libs
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		//Triangle t = (Triangle)factory.getBean("triangle");
		//t.draw();
		
		//3 using app context
		//NOTE: need to move spring.xml inside src folder
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle t = (Triangle)context.getBean("triangle-alias"); //bean in spring.xml
		//app context can instantiate members/fields
		
		t.draw();
	}

}
