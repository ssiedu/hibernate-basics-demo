package com.ssi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ChangeData {
	public static void main(String[] args) {
		SessionFactory sf=Utility.getSF();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		
		Emp emp=new Emp();
		emp.setEno(112);
		
		emp.setEname("Ashish");
		emp.setDesg("Manager");
		emp.setSal(85000);
		
		session.update(emp);
		
		tr.commit();
		session.close();
		System.out.println("DATA ADDED IN DB");

	}
}
