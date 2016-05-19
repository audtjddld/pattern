package observer.java.util.observer;

import java.util.Observable;

/**
 * https://examples.javacodegeeks.com/core-java/util/observer/java-util-observer-example/
 * http://egloos.zum.com/iilii/v/3902774
 * 
 * 변화를 통보하는 중계기
 * 
 * @author 정명성
 * @create date : 2016. 5. 6.
 * observer.java.util.observer.KoreaWeatherCenter.java
 */
public class Watcher extends Observable {

	public void setWeather(String weather) {
		setChanged();
		notifyObservers(weather);
	}
}
