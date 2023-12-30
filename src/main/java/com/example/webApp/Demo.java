package com.example.webApp;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {

	@PostMapping("/value")
	public String demo() {
		
		String a=	System.getenv("END_POINT");
		String b=	System.getenv("RDS_USER");
		String c=	System.getenv("RDS_PASS");
		String d=   System.getenv("AWS_ACCESS_KEY");
		String e=   System.getenv("AWS_SECRET_KEY");
		String f=	System.getenv("AWS_BUCKET");
		String g=	"Hello";
		String res=a+"   "+b+"   "+c+"   "+d+"   "+e+"   "+f+"   "+g;
		return res;
	}
	
	
}
