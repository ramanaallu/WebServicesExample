package com.mkyong.ws;
 
import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;
 
@WebService
public class HelloWorld{
 
	@WebMethod(operationName="getHelloWorld")
	public String getHelloWorld(String name) {
		System.out.println("Hello World JAX-WS "+name);
		return "Hello World JAX-WS " + name;
	}
	
	
	public int getHello()
	{
		return 1;
	}
 
}