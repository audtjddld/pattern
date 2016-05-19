package observer.java.util.observer;

import java.util.Observable;
import java.util.Observer;

public class NewyorkWeatherCenter implements Observer {

	private String weather;

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof Watcher) {
			this.weather = (String) arg;
			System.out.println("today is wheater " + weather);
		}
	}
}
