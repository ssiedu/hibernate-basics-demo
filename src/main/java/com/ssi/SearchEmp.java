package com.ssi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class SearchEmp {

	public static void main(String[] args) {

		SessionFactory sf=Utility.getSF();
		Session session=sf.openSession();
		
		Emp emp=session.get(Emp.class, 111);
		
		System.out.println(emp.getEno());
		System.out.println(emp.getEname());
		System.out.println(emp.getSal());
		System.out.println(emp.getDesg());
		
		
		session.close();
		System.out.println("DATA ADDED IN DB");

	}

}
