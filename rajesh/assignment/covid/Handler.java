package com.rajesh.assignment.covid;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;

public class Handler {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		
		
		CovidAssignmentService assignmentService = new CovidAssignmentService();
		CovidState state = assignmentService.getmaharashtraCovidInformation();

		
		
	}

}
