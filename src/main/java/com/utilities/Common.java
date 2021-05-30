package com.utilities;

import java.io.StringReader;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class Common extends BaseFunctions{

	
	 public  static <T> String objectToJSONString(T object) {
	        String json = "";
	        ObjectMapper mapperObj = new ObjectMapper();
	        mapperObj.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS,false);

	        try {
	            // get object as a json string
	            json = mapperObj.writeValueAsString(object);
	        } catch (Throwable e) {
	            logException(e);
	            e.printStackTrace();
	        }

	        //		logger.info("Request Body "+ json);
	        return json;

	    }

	    public  static <T> T jsonStringToObject(String resStrbody, Class<T> obj) {
	        if(resStrbody == null)
	            return null;
	        ObjectMapper mapper = new ObjectMapper();
	        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
	        try {
	            return mapper.readValue(new StringReader(resStrbody), obj);
	        } catch (Throwable e) {
	            logException(e);
	        }
	        return null;
	    }
}
