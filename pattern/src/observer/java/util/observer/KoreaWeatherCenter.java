package observer.java.util.observer;

import java.util.Observable;
import java.util.Observer;

public class KoreaWeatherCenter implements Observer {
	private String weather;

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof Watcher) {
			this.weather = (String) arg;
			System.out.println("오늘의 날씨는 " + weather + "입니다.");
			
		}
	}
}
