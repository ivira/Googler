package ua.org.vera.googleApiHelper.test;

import ua.org.vera.googleApiHelper.Googler;
import ua.org.vera.googleApiHelper.Response;
import ua.org.vera.googleApiHelper.GsearchResult;
import ua.org.vera.googleApiHelper.Googler.SearchError;

import com.google.gson.Gson;

public class GoogleAJAXSearchAPI {
	
    private static String searchString = "vera";
 
    public static void main(String[] args){
    	
    	String result = null;
    	int current = 0;
    	int max = 60;
    	Gson gson = new Gson();
    	
    	try {
    		do
    		{
    			//call main search method: specify what to search and start result
    			result = Googler.searchWeb(searchString, current);
    			
    			Response response = gson.fromJson(result, Response.class);
    	        for (GsearchResult gsearchResult : response.getResponseData().getResults()) {
    	          	System.out.println("Result url #" + current + ":" +gsearchResult.getUrl());
    	          	current++;
    	        }
    		}
    		while(current < max);
		} catch (SearchError e) {
			e.printStackTrace();
		}
    }
}
