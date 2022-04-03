package rs.ac.bg.fon.np.json_api_caller;

import java.io.FileWriter;
import java.io.PrintWriter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main2 {
	
	public static void main(String[] args) {
		TrenutnoVreme tv1 = new TrenutnoVreme("Belgrade", "Serbia", 15, 44.8, 20.5, 30, 1080);
		TrenutnoVreme tv2 = new TrenutnoVreme("Priboj", "Serbia", 4, 43.6, 19.5, 50, 1100);
		TrenutnoVreme tv3 = new TrenutnoVreme("New York", "USA", 9, 40.8, -73.2, 45, 1080);
		TrenutnoVreme tv4 = new TrenutnoVreme("Berlin", "Germany", -2, 52.5, 13.4, 10, 1050);
		
		TrenutnoVreme[] tv_niz = {tv1,tv2,tv3,tv4};

		try(PrintWriter pw = new PrintWriter(new FileWriter("niz_objekata.json"))) {
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			
			pw.println(gson.toJson(tv_niz));
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
