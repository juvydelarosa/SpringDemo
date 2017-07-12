package com.training.springframe;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware { //will allow the Triangle class to use the AppContext created in DrawingApp class
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context = null;
	
	public void draw(){
		System.out.println("Point A = (" + getPointA().getX() + ", " + getPointA().getY() + ")");
		System.out.println("Point B = (" + getPointB().getX() + ", " + getPointB().getY() + ")");
		System.out.println("Point C = (" + getPointC().getX() + ", " + getPointC().getY() + ")");
	}
	
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		// Spring automatically calls this method and provides context
		this.context = context; //added this line to allow this class to use (ie getBean) the context passed by spring
		
		/*
		 * bean container is sometimes needed to be accessed within the bean instance (ie Triangle)
		 * eg Triangle scope is Singleton and subClass Point is needed to be scoped Prototype
		 * by convention, subclasses inherit the parent class' scope, to overcome that 
		 * the subclassed need to be getBean-d within the Superclass Triangle. Hence ApplicationContextAware needs to be implemented
		 * 
		 * other Aware classes that gives bean container details can be used ie BeanClassLoaderAware
		 * */
	}

	@Override
	public void setBeanName(String beanName) { //setters are being called by spring before running the program
		// TODO Auto-generated method stub
		System.out.println("Bean name is:" + beanName);
	}
	
	
}
