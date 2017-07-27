package com.tprf.api.impl;

import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthentController {
	
	@RequestMapping(value="/oauth-confirm")
	public void confimAuthent(){
		
	}

}
