package com.esprit.http.client;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.core.MediaType;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

@Stateless
@LocalBean
public class MyHTTPClient {

	public String POST(String url, String params) {

		DefaultHttpClient httpClient = new DefaultHttpClient();

		try {
			HttpPost postRequest = new HttpPost(url);
			System.out.println(url);
			System.out.println(params);
			StringEntity input = new StringEntity(params);
			input.setContentType(MediaType.APPLICATION_JSON);
			postRequest.setEntity(input);
			//postRequest.addHeader("accept", "application/json");
			// envoi
			System.out.println(postRequest);
			HttpResponse response = httpClient.execute(postRequest);
			System.out.println(response);
			System.out.println("------------------->"+response.getStatusLine().getStatusCode());
			if (response.getStatusLine().getStatusCode() != 201) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ response.getStatusLine().getStatusCode());
			}
			BufferedReader br = new BufferedReader(new InputStreamReader(
					(response.getEntity().getContent())));
			String result = "";
			String output;
			while ((output = br.readLine()) != null) {
				result += output;
			}
			return result;
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "error";

	}

	public String GET(String url) {

		String resultat = "";
		try {

			URL request = new URL(url);
			// envoi du requete
			HttpURLConnection conn = (HttpURLConnection) request
					.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");
			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(
					(conn.getInputStream())));

			String output;
			while ((output = br.readLine()) != null) {
				resultat += output;
			}
			conn.disconnect();
			return resultat;

		} catch (IOException e) {

			e.printStackTrace();

		}
		return "error";
	}

	public String PUT(String url, String params) {

		DefaultHttpClient httpClient = new DefaultHttpClient();
		try {
			HttpPut putRequest = new HttpPut(url);
			StringEntity input = new StringEntity(params);
			putRequest.setEntity(input);

			HttpResponse response = httpClient.execute(putRequest);
			if (response.getStatusLine().getStatusCode() != 201) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ response.getStatusLine().getStatusCode());
			}
			BufferedReader br = new BufferedReader(new InputStreamReader(
					(response.getEntity().getContent())));
			String result = "";
			String output;
			while ((output = br.readLine()) != null) {
				result += output;
			}
			return result;
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "error";
	}

	public String DELETE(String url) {

		DefaultHttpClient httpClient = new DefaultHttpClient();
		try {
			HttpDelete putRequest = new HttpDelete(url);
			// envoi
			HttpResponse response = httpClient.execute(putRequest);
			if (response.getStatusLine().getStatusCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ response.getStatusLine().getStatusCode());
			}
			return "true";
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "error";
	}

	public String request(String url) {

		String result = "error";

		DefaultHttpClient httpClient = new DefaultHttpClient();
		HttpGet getRequest = new HttpGet(url);
		getRequest.addHeader("accept", "application/json");

		result = processRequest(result, httpClient, getRequest);
		return result;

	}

	private String processRequest(String result, DefaultHttpClient httpClient,
			HttpUriRequest getRequest) {
		HttpResponse response;
		try {
			response = httpClient.execute(getRequest);
			if ((response.getStatusLine().getStatusCode() != 200)
					|| (response.getStatusLine().getStatusCode() != 201)) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ response.getStatusLine().getStatusCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(
					(response.getEntity().getContent())));

			String output;
			result = "";
			// System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				result += output;
			}

			httpClient.getConnectionManager().shutdown();

		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}

