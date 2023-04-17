package com.corepatterns.Creational.Builder;

public class Test {

	public static void main(String[] args) {
		
		HttpClient httpClient = new HttpClient.HttpClientBuilder().method("POST")
				.secure("Shatakshi", "abcdeg").url("http://localhost:8080").build();
		System.out.println(httpClient);
	}

}
