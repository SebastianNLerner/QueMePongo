
public class ClimaService {
	AccuWeatherAPI apiClima = new AccuWeatherAPI();
	List<Map<String, Object>> condicionesClimaticas = apiClima.getWeather(�Buenos Aires, Argentina�);  
	
	double obtenerTemperatura() {
	return condicionesClimaticas.get(0).get("WeatherIcon"); //Devuelve un n�mero del 0 al 1
	}
}
