
public class ClimaService {
	AccuWeatherAPI apiClima = new AccuWeatherAPI();
	List<Map<String, Object>> condicionesClimaticas = apiClima.getWeather(“Buenos Aires, Argentina”);  
	
	double obtenerTemperatura() {
	return condicionesClimaticas.get(0).get("WeatherIcon"); //Devuelve un número del 0 al 1
	}
}
