package count;

/**
 * @author 정명성 create date : 2016. 1. 13. count.CountEight.java
 */
public class CountEight {

	static int COUNT = 0;
	
	public static void main(String[] args) {

		for (int i = 0; i < 10001; i++) {
			checkEight(i);
		}
		
		System.out.println(COUNT);
	}
	
	public static void checkEight (int i) {
		String checkNum = i + "";
		if(checkNum.indexOf("8") > -1){
			for(char c : checkNum.toCharArray()) {
				if(c == '8') {
					COUNT ++;
				}
			}
		}
	}
}
