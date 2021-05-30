package com.api.test.reqres.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.utilities.BaseFunctions;
import com.utilities.EndPoints;

import io.restassured.response.Response;
import io.restassured.RestAssured;

public class GetAPI extends BaseFunctions{

	@Test
	public void getAPI() throws IOException {
		RestAssured.baseURI = getProperty("BaseURL") ;

		 Response res = RestAssured.given().param("page", "2").get(EndPoints.getListUsers);
		 if(res.getStatusCode()==200) {
			 logPassed("Status code is 200 for GET API");
			 logPassed("API Response - "+ res.prettyPrint());
		 }else {
			 logFailed("Status code is different for this GET API");
			 logFailed("API Response - "+ res.prettyPrint());
		 }
	 
		 
		 System.out.println();
	}

}
