package com.transport;

public class Car implements Vehicle{

	private Service service;
	
	public Car() {
		// TODO Auto-generated constructor stub
		System.out.println("Car Service Activated.");
	}
	
	public void setService(Service service) {
		this.service = service;
	}
	
	public void displayService() {
		service.service();
	}
	
}
