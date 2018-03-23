package com.jivrus.www.Controller;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jivrus.www.DTO.ContactDTO;
import com.jivrus.www.Service.ContactService;


@Component
@RequestMapping("/")
public class Controller implements Serializable {

	@Autowired
	private ContactService service;
	
	//1 request = 1method 
	@RequestMapping(value="/contact.do",method=RequestMethod.POST)
	public String contact(@ModelAttribute ContactDTO dto) {
		//call the method and pass the dto
		service.service(dto);
		
		return "views/Success.html";
		
		
	}
	
}
