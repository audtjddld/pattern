package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 반복자 패턴 (iterator 패턴)
 * list 및 Array를 iterator 시킨다
 * 
 * @author Administrator
 *
 */
public class Iterators {
	public static void main(String[] args) {
		List<String> list = new ArrayList();
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}
}
