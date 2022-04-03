package rs.ac.bg.fon.np.json_api_caller;

import java.io.FileWriter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class Main4 {
	public static void main(String[] args) {
		TrenutnoVreme tv = new TrenutnoVreme("Priboj", "Serbia", 4, 43.6, 19.5, 50, 1100);
		
		JsonObject jo = new JsonObject();
		
		jo.addProperty("Grad", tv.getName());
		jo.addProperty("Drzava", tv.getCountry());
		jo.addProperty("Temperatura", tv.getTemperature());
		jo.addProperty("Geo sirina", tv.getLat());
		jo.addProperty("Geo duzina", tv.getLon());
		jo.addProperty("Vlaznost", tv.getHumidity());
		jo.addProperty("Vaz pritisak", tv.getPressure());
		
		try(FileWriter fw = new FileWriter("rucni_upis.json")){
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			
			fw.write(gson.toJson(jo));
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
