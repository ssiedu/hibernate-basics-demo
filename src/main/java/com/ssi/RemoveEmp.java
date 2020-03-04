package com.ssi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class RemoveEmp {

	public static void main(String[] args) {
		SessionFactory sf=Utility.getSF();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		
		Emp emp=new Emp(); emp.setEno(113);
		session.delete(emp);
		
		tr.commit();
		session.close();
		System.out.println("DATA REMOVED");

	}

}
