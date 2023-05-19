package org.jsp.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveHospital {

	public static void main(String[] args) {
		Hospital h = new Hospital();
      h.setName("Appolo");
      h.setGst("gst123a");
      h.setFounder("mr.Applo mohapatra");
      Branch b1 = new Branch();
      b1.setName("Applo Bhubaneswar");
      b1.setEmail("Ab@gmail.com");
      b1.setPhone(96586468l);
      
      Branch b2 = new Branch();
      b2.setName("Applo cuttck");
      b2.setEmail("Ac@gmail.com");
      b2.setPhone(965864789);

      Branch b3 = new Branch();
      b1.setName("Applo khordha");
      b1.setEmail("AK@gmail.com");
      b1.setPhone(96587658);
      List <Branch> branches =new ArrayList<Branch>();
      branches.add(b1);
      branches.add(b2);
      branches.add(b3);
      h.setBranches(new ArrayList<Branch>(Arrays.asList(b1,b2,b3)));
      EntityManager manager = Persistence.createEntityManagerFactory("dev").createEntityManager();
  	EntityTransaction t = manager.getTransaction();
      manager.persist(h);
      t.begin();
      t.commit();
	}
}
