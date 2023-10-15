package com.api.test.reqres.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.utilities.BaseFunctions;
import com.utilities.EndPoints;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteAPI extends BaseFunctions{

	@Test
	public void verifyDeleteListUsers() throws IOException {
		logInfo("To delete a record");
		RestAssured.baseURI = getProperty("BaseURL");
		Response response = RestAssured.given().params("users", "2").delete(EndPoints.deleteListUsers).thenReturn();
		if(response.getStatusCode()==204) 
			logPassed("Able to delete the record");
		else
			logFailed("Unable to delete the record");
	}
}
