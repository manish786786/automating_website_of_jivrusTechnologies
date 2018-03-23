package com.jivrus.www.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jivrus.www.DAO.ContactDAO;
import com.jivrus.www.DTO.ContactDTO;

@Component
public class ContactService {

	@Autowired
	private ContactDAO contactdao;
	
	public void service(ContactDTO dto) {
		
		contactdao.contactdao(dto);
	}
	
}
