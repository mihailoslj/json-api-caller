package rs.ac.bg.fon.np.json_api_caller;

import java.lang.invoke.StringConcatFactory;
import java.sql.Date;
import com.google.gson.annotations.SerializedName;

public class TrenutnoVreme {
	@SerializedName("Grad")
	private String name;
	
	@SerializedName("Drzava")
	private String country;
	
	@SerializedName("Temperatura")
	private int temperature;
	
	@SerializedName("Geo. sirina")
	private double lat;
	
	@SerializedName("Geo. duzina")
	private double lon;
	
	@SerializedName("Vlaznost")
	private int humidity;
	
	@SerializedName("Vaz. pritisak")
	private int pressure;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLon() {
		return lon;
	}

	public void setLon(double lon) {
		this.lon = lon;
	}


	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

	public int getPressure() {
		return pressure;
	}

	public void setPressure(int pressure) {
		this.pressure = pressure;
	}

	@Override
	public String toString() {
		return "TrenutnoVreme [name=" + name + ", country=" + country + ", temperature=" + temperature + ", lat=" + lat
				+ ", lon=" + lon + ", humidity=" + humidity + ", pressure=" + pressure + "]";
	}

	
	
	
}
