package com.viome.interview.business;

import java.util.Scanner;

import com.viome.interview.business.CheckCustomer;
import com.viome.interview.dao.Customer_Imp;

public class CheckCustomer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Customer_Imp obj_cc = null;
		
		
		
			System.out.println("Give Customer's First Name");
			String name_Customer = sc.next();
			
			System.out.println(name_Customer);
			obj_cc = new Customer_Imp();
			Boolean a = obj_cc.check(name_Customer);
			
			System.out.println(a);
		
			
			
			
			
		
	}
}
