/**
 * 
 */
package template.method;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * @author 정명성
 * create date : 2016. 2. 12.
 * factory.method.BufferedReaderCallback.java
 */
public interface BufferedReaderCallback {
	
	Integer doSomethingWithReader(BufferedReader br) throws IOException;
}
