package com.transport;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    private static ApplicationContext context;

	public static void main( String[] args )
    {
       context = new ClassPathXmlApplicationContext("beans.xml");
        Vehicle vehicle = context.getBean("vehicle",Vehicle.class);
        vehicle.displayService();
        
    }
}
