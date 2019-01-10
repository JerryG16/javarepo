package TIL.WeatherApi;

import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.Gson;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class Tester {
	private static OkHttpClient client  = new OkHttpClient();
	
	static String[] id = new String[] {"London","Hurzuf","Novinki","Gorkhā"};
	
	public static void main(String args[])
	{
		for(model m:getData(id))
		{
			System.out.println("Name : " + m.getName());
			System.out.println("Temperature : " + m.getMain().getTemp());
			System.out.println("Humidity : " + m.getMain().getHumidity());
			System.out.println("-------------------------");
		}
	}
	
	public static String getJSON(String url) throws IOException {
		  Request request = new Request.Builder()
			      .url(url)
			      .build();

		  okhttp3.Response response = client.newCall(request).execute();
		  return response.body().string();			  
	}
	
	public static ArrayList<model> getData(String[] city)
	{
		String json = null;
		ArrayList<model> list = new ArrayList<model>();
		try {
			for(String Id:city)
			{
				String key = "&APPID=0ada90165ee70bb0e4440566030268b6";
				String link = "https://api.openweathermap.org/data/2.5/weather?q=";
				link = link+Id;
				link = link+key;
				json = getJSON(link);
				Gson gson = new Gson();
				model m = gson.fromJson(json, model.class);
				list.add(m);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return list;
		
	}
}
