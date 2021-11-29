package com.niit.coredemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.niit.coredemo.model.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      // BeanFactory beanFactory=new ClassPathXmlApplicationContext("bean.xml");
    	ApplicationContext applicationContext= new ClassPathXmlApplicationContext("bean.xml");
    	
      Customer customer = (Customer) applicationContext.getBean("customer");
      System.out.println(customer);
    }
}
