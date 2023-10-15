package com.api.test.reqres.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.utilities.BaseFunctions;
import com.utilities.EndPoints;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PostAPI01 extends BaseFunctions{
	

	@Test(enabled=true)
	public void verifyPostCreateUsersAPI() throws IOException {
		RestAssured.baseURI = getProperty("BaseURL");
		
		 Response response = RestAssured.given().body("{\n" + 
				"    \"name\": \"morpheus\",\n" + 
				"    \"job\": \"leader\"\n" + 
				"}").post(EndPoints.postCreateUsers).thenReturn();
		 if(response.getStatusCode()==201)
			 logPassed("Able to verify status code of POST API");
		 else
			 logFailed("Unable to verify status code of POST API");
		 logInfo(response.asPrettyString());
		
	}
}
