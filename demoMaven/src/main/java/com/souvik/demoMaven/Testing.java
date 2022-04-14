package com.souvik.demoMaven;
import java.io.*;

import org.springframework.context.ApplicationContext;
import  org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.beans.factory.BeanFactory;  
//import org.springframework.beans.factory.xml.XmlBeanFactory;  
//import org.springframework.core.io.*;  
public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		Setinj st=(Setinj)context.getBean("obj");
		System.out.println(st);
		/*Resource r=new ClassPathResource("applicationContext.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
          
        Setinj st=(Setinj)factory.getBean("obj");
        System.out.println(st);*/
	}
	

}
