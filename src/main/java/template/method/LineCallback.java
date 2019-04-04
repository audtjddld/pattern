/**
 * 
 */
package template.method;

/**
 * @author 정명성
 * create date : 2016. 2. 12.
 * factory.method.LineCallback.java
 */
public interface LineCallback {
	// 라인 별 작업을 정의한 콜백 인터페이스
	Integer doSomethingWithLine(String line, Integer value);
}
