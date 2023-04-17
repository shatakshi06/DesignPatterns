package com.corepatterns.Creational.Builder;

public class HttpClient {

	public HttpClient(HttpClientBuilder httpClientBuilder) {
		method = httpClientBuilder.method;
		userName = httpClientBuilder.userName;
		password = httpClientBuilder.password;
		headers = httpClientBuilder.headers;
		body = httpClientBuilder.body;
		url = httpClientBuilder.url;
	}
	
	

	private String method;
	@Override
	public String toString() {
		return "HttpClient [method=" + method + ", userName=" + userName + ", password=" + password + ", headers="
				+ headers + ", url=" + url + ", body=" + body + "]";
	}



	private String userName;
	private String password;
	private String headers;
	private String url;
	private String body;

	public String getMethod() {
		return method;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public String getHeaders() {
		return headers;
	}

	public String getUrl() {
		return url;
	}

	public String getBody() {
		return body;
	}

	public static class HttpClientBuilder {

		private String method;
		private String userName;
		private String password;
		private String headers;
		private String url;
		private String body;

		public HttpClientBuilder method(String method) {
			this.method = method;
			return this;
		}

		public HttpClientBuilder url(String url) {
			this.url = url;
			return this;
		}

		public HttpClientBuilder secure(String userName, String password) {
			this.userName = userName;
			this.password = password;
			return this;
		}

		public HttpClientBuilder headers(String headers) {
			this.headers = headers;
			return this;
		}

		public HttpClientBuilder body(String body) {
			this.body = body;
			return this;
		}

		public HttpClient build() {
			return new HttpClient(this);
		}

	}
}
