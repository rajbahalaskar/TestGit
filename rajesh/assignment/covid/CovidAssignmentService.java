package com.rajesh.assignment.covid;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;

public class CovidAssignmentService {

	public CovidState getmaharashtraCovidInformation() throws ClientProtocolException, IOException {
		
		
		String url = "https://s3.ap-south-1.amazonaws.com/const.educloud.in/api/Maha.json";
		
		
		
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet(url);
		
		CloseableHttpResponse response1 = httpclient.execute(httpGet);
        HttpEntity entity1 = response1.getEntity();
        String content = EntityUtils.toString(entity1);
        System.out.println(content);
        Gson gson = new Gson();
        CovidState maha = gson.fromJson(content, CovidState.class);
        
        System.out.println(maha.getName());
        System.out.println(maha.getCapital());
        System.out.println(maha.getPopulation());
        System.out.println(maha.getCovid());
        
        
        return null;
	}
	
	

}



