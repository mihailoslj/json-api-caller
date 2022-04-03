package rs.ac.bg.fon.np.json_api_caller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.PublicKey;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import java.sql.Date;

public class Main1 {
	
	public static final String ACCESS_KEY = "f69d49758e23676e52a93f611d845d74";
	public static final String QUERY = "Belgrade";
	
	public static void main(String[] args) {
		
		try {
			
			URL url = new URL("http://api.weatherstack.com/current"+ "?access_key=" + ACCESS_KEY +
								"&query=" + QUERY);
			
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			
			con.setRequestMethod("GET");
			
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			
			JsonObject jo = gson.fromJson(in, JsonObject.class);
			
			TrenutnoVreme tv = new TrenutnoVreme();
			
			tv.setCountry(jo.get("location").getAsJsonObject().get("country").getAsString());
			tv.setName(jo.get("location").getAsJsonObject().get("name").getAsString());
			tv.setTemperature(jo.get("current").getAsJsonObject().get("temperature").getAsInt());
			tv.setLat(jo.get("location").getAsJsonObject().get("lat").getAsDouble());
			tv.setLon(jo.get("location").getAsJsonObject().get("lon").getAsDouble());
			tv.setHumidity(jo.get("current").getAsJsonObject().get("humidity").getAsInt());
			tv.setPressure(jo.get("current").getAsJsonObject().get("pressure").getAsInt());
			
			
			in.close();
			System.out.println(tv);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
