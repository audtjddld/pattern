package observer.java.util.observer;

public class Demo {
	public static void main(String[] args) {
		Watcher watcher = new Watcher();
		
		KoreaWeatherCenter kwc = new KoreaWeatherCenter();
		NewyorkWeatherCenter nwc = new NewyorkWeatherCenter();
		
		watcher.addObserver(kwc);
		watcher.addObserver(nwc);
		
		System.out.println("날씨변함");
		watcher.setWeather("windy");
		
		System.out.println("날씨변함");
		watcher.setWeather("맑음");
	}
}
