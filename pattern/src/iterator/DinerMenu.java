package iterator;

import java.util.Iterator;

/**
 * 결국엔 배열과 리스트등 비슷한 자료 구조를 나열 함수로 각각 인터페이스를 만들고
 * 필요한 부분에서 가져다가 생성해서 사용될 수 있도록 하는 것 같음.
 * 둘다 변하는 부분이 그 부분이기 때문에
 * 캡슐화.
 * 
 * @author Administrator
 *
 */
public class DinerMenu {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	
	public Iterator createIterator() {
		return new DinerMenuIterator(menuItems);
	}
}
