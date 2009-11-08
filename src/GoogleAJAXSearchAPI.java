import java.io.*;
import java.net.*;

public class GoogleAJAXSearchAPI {    
	
	private static String endpointURL = "http://ajax.googleapis.com/ajax/services/search/web";
	
	public static void main(String[] args) throws Exception {        
		URLConnection uc = new URL(endpointURL).openConnection();        
		HttpURLConnection connection = (HttpURLConnection) uc;        
		connection.setDoOutput(true);        
		connection.setRequestMethod("GET");        
		connection.connect();        
		String line;        
		InputStream inputStream = null;        
		try {            
			inputStream = connection.getInputStream();        
		} catch (IOException e) {            
			inputStream = connection.getErrorStream();        
		}        
		BufferedReader rd = new BufferedReader(new InputStreamReader(inputStream));        
		while ((line = rd.readLine()) != null) {            
			System.out.println(line);        
		}    
	}
}