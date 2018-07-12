package com.demo.spring;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class GetCLient2 {

	public static void main(String[] args) {
		RestTemplate rt = new RestTemplate();
		
		HttpHeaders header = new HttpHeaders();
		header.set("Accept", "application/xml");
		
		HttpEntity requestEntity = new HttpEntity<>(header);
		
		ResponseEntity<String> resp = rt.exchange("http://localhost:8080/empapp/emp?empid=100", HttpMethod.GET, requestEntity, String.class);
		System.out.println(resp.getBody());
	}

}
