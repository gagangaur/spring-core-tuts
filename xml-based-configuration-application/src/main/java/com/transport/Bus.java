package com.transport;

public class Bus implements Vehicle{
	private Service service;

	public Bus() {
		// TODO Auto-generated constructor stub
		System.out.println("Bus Service Activated.");
	}
	
	public void setService(Service service) {
		this.service = service;
	}
	
	public void displayService() {
		service.service();
	}
	
}
