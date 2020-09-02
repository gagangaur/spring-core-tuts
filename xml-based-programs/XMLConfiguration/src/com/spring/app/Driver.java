package com.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	
public static void main(String[] args)
{
	ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
	FixedDeposit fDeposit = ctx.getBean("fixedDeposit",FixedDeposit.class);
	fDeposit.setAccountNumber(101);
	fDeposit.setAccntHolderName("Gagan");
	fDeposit.setAmt(10000);
	fDeposit.setInterestRate(5);
	fDeposit.setTenure(10);
	System.out.println(fDeposit.getAccountNumber());
	System.out.println(fDeposit.getAccntHolderName());
	System.out.println(fDeposit.getAmt());
	System.out.println(fDeposit.getTenure());
	System.out.println(fDeposit.getInterestRate());
	
	
}

}
	 	  	    	    	     	      	 	
