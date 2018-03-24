/**
 * 
 */
package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;



/**
 * @author admin
 *
 */
@RestController
public class RestController {
	
	@GetMapping(value="/name")
	public String getName(){
		
		return "Prasad"; 
	}

}
