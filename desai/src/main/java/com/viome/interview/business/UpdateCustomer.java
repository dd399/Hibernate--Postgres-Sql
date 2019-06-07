package com.viome.interview.business;

import java.util.Scanner;

import com.viome.interview.business.CheckCustomer;
import com.viome.interview.dao.Customer_Imp;

	
public class UpdateCustomer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Customer_Imp obj_cc = new Customer_Imp();
		
		System.out.println(obj_cc.update());
		
		
		
}
}