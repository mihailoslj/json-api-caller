package rs.ac.bg.fon.np.json_api_caller;

import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main3 {

	public static void main(String[] args) {
		
		try (FileReader fr = new FileReader("niz_objekata.json")) {
			
			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			List<TrenutnoVreme> tv_lista = Arrays.asList(gson.fromJson(fr, TrenutnoVreme[].class));

			for (TrenutnoVreme tv : tv_lista)
				System.out.println(tv);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
