import com.google.soap.search.*;
import java.io.*;
public class SimpleGoogleDemo {  
	public static void main(String[] args) {    
		// Create a Google Search object, set our authorization key    
		GoogleSearch s = new GoogleSearch();    
		String clientKey="xxxxxxxxxxxxxxxxxxxxxxxxxxxx";    
		s.setKey(clientKey);    
		s.setQueryString("vera.org.ua");    
		GoogleSearchResult result = null;    
		// Depending on user input, do search or cache query, then print out result    
		try {      	
			result = s.doSearch();    
		}    
		catch (GoogleSearchFault f) {      
			System.out.println("The call to the Google Web APIs failed:");      
			System.out.println(f.toString());    
		}    // if we made it here, the search went through    
		System.out.println("Google Search Results:");    
		System.out.println("======================");    
		if (result!= null)	    
			System.out.println(result.toString());  
	}
}