package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class reverse {
	@GetMapping(value="/ds/{a}")
	public String abc(@PathVariable String a) {
	String bc="";
	for(int i=a.length()-1;i>=0;i--) {
		bc=bc+a.charAt(i);
	}
	return bc;
	
	}
}
//	
//	class primeno {
//		@GetMapping(value="/vs/{s}")
//		public list <Integer> cs(@PathVariable int s) {
//			List<Integer>a=new  ArrayLis;
//		}
//			int count=0;
//			
//		}
//		
			
		
		
		
	
	
			
			
		
	
	


