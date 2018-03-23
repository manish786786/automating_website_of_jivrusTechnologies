package com.jivrus.www.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jivrus.www.DTO.ContactDTO;

@Component
public class ContactDAO {

	@Autowired
	private SessionFactory sf;
	
	// hibernate or jdbc  to save the data
	public void contactdao(ContactDTO dto) {
		
		//components of hibernate
		Session sess=sf.openSession();
		sess.save(dto);
		sess.beginTransaction().commit();
		
	}
	
	
}
