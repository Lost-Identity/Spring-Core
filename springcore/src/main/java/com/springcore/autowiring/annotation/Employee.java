package com.springcore.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	@Autowired
	@Qualifier("tempaddress")
	private Address address;

	public Address getAddress() {
		return address;
	}

//	@Autowired
//	@Qualifier("address")
	public void setAddress(Address address) {
		System.out.println("Setter Injection");
		this.address = address;
	}

//	@Autowired
//	@Qualifier("tempaddress")  // you cannot use this annotation here
	public Employee(Address address) {
		super();
		this.address = address;
	}

	public Employee() {
		super();
	}
	
	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	

}
