package com.telnet.radius.module;

import java.io.IOException;

import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;

public class SMSSender {

	public static String sendSMS(String moblieNumber, String message) throws HttpException, IOException {
		
		HttpClient client = new HttpClient();

		PostMethod post = new PostMethod("http://10.10.10.104/goip/dosend.php");

		post.addRequestHeader("Content-Type",
				"application/x-www-form-urlencoded;charset=UTF-8");

		NameValuePair[] params = { new NameValuePair("USERNAME", "root"),
				new NameValuePair("PASSWORD", "root"),
				new NameValuePair("smsnum", moblieNumber),
				new NameValuePair("Memo", message),
				new NameValuePair("smsprovider", "1"),
				new NameValuePair("method", "2") };

		post.setRequestBody(params);

		client.executeMethod(post);

		Header[] headers = post.getResponseHeaders();

		int statusCode = post.getStatusCode();

		System.out.println("statusCode:" + statusCode);

		for (Header h : headers) {
			System.out.println(h.toString());
		}

		String result = new String(post.getResponseBodyAsString().getBytes(
				"UTF-8"));

		System.out.println(result);
		
		post.releaseConnection();

		return result;
	}

}
