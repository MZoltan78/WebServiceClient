package com.jaxws;

public class MainClient {

	public static void main(String[] args) 
	{
		
		TesztWSService ws = new TesztWSService();
		String response = ws.getTesztWSPort().sayHello("Zola");
		System.out.println("response: "+response);
		
	}

}
