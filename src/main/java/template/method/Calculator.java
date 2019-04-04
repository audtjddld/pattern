/**
 * 
 */
package template.method;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 정명성
 * create date : 2016. 2. 12.
 * factory.method.Calculator.java
 */
public class Calculator {
	
	/**
	 * 계산 로직
	 * @author 정명성
	 * create date : 2016. 2. 12.
	 * 설명
	 * @return
	 * @throws Exception
	 */
	public int calcSum(String filePath) throws Exception {
		
		LineCallback sumCallback = new LineCallback() {
			
			@Override
			public Integer doSomethingWithLine(String line, Integer value) {
				return value + Integer.valueOf(line);
			}
		};
		
		return lineReadTemplate(filePath, sumCallback, 0);
	}
	
	

	/**
	 * @author 정명성
	 * create date : 2016. 2. 12.
	 * 설명
	 * @param numFilePath
	 * @param matcher
	 * @return
	 */
	public int calMultiply(String filePath) throws IOException {
		
		LineCallback multiplyCallback = new LineCallback() {
			
			@Override
			public Integer doSomethingWithLine(String line, Integer value) {
				return value * Integer.valueOf(line);
			}
		};
		
		return lineReadTemplate(filePath, multiplyCallback, 1);
	}
	
	
	/**
	 * 파일 읽기 template
	 * @author 정명성
	 * create date : 2016. 2. 12.
	 * 설명
	 * @param filepath
	 * @param callback
	 * @return
	 * @throws IOException
	 */
	public Integer fileReadTemplate(String filepath, BufferedReaderCallback callback) throws IOException {
		
		BufferedReader br = null;
		
		try{
			br = new BufferedReader(new FileReader(filepath));
			int ret = callback.doSomethingWithReader(br);
			return ret;
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
			throw e;
		}
		finally {
			if(br != null) {
				try { br.close(); } catch(IOException e) { System.out.println(e.getMessage()); }
			}
		}
		
	}	
	
	/**
	 * 라인 콜백을 이용한 template
	 * @author 정명성
	 * create date : 2016. 2. 12.
	 * 설명
	 * @param filepath
	 * @param callback
	 * @param initVal
	 * @return
	 * @throws IOException
	 */
	public Integer lineReadTemplate(String filepath, LineCallback callback, int initVal) throws IOException {
		BufferedReader br = null;
		try{
			br = new BufferedReader(new FileReader(filepath));
			Integer res = initVal;
			String line = null;
			while((line = br.readLine()) != null) {
				res = callback.doSomethingWithLine(line, res);
			}
			return res;
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
			throw e;
		}
		finally {
			try { br.close(); } catch(IOException e) { System.out.println(e.getMessage()); }
		}
	}
}

