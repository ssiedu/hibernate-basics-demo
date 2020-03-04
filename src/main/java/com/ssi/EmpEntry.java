package com.ssi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmpEntry {

	public static void main(String[] args) {
		SessionFactory sf=Utility.getSF();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Emp e1=new Emp(111,"AAA",10000,"CLERK");
		Emp e2=new Emp(112,"BBB",20000,"SE");
		Emp e3=new Emp(113,"CCC",30000,"SSE");
		session.save(e1);
		session.save(e2);
		session.save(e3);
		tr.commit();
		session.close();
		System.out.println("DATA ADDED IN DB");

	}

}
