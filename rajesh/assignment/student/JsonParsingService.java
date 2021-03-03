package com.rajesh.assignment.student;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import net.sf.json.JSONObject;
import net.sf.json.util.JSONTokener;

public class JsonParsingService {
	
	
	public Todo  getTodoFromWebAPI() {
		
	  String url = "https://jsonplaceholder.typicode.com/todos/1"; 
	 
		CloseableHttpClient httpClient = HttpClients.createDefault();
		 
	     HttpGet request = new HttpGet(url);

		 
		 try {
			CloseableHttpResponse response = httpClient.execute(request);
            HttpEntity entity = response.getEntity();
            
            if (entity != null) {
                // return it as a String
                String result = EntityUtils.toString(entity);
                System.out.println(result);
                
           //  JSONTokener jsonObject = new JSONTokener("");
             
             
             
            }
			
			
			
		} catch (ClientProtocolException e) {
			// TO DO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TO DO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		 
		 return null;

		 
		 
		
		
		
	}

}
