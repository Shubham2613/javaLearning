package hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(30);
		hs.remove(20);
		System.out.println(hs);
		
//		Iterator it = hs.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		for(Integer intDemo : hs) {
			System.out.println(intDemo);		
		}
		
		
	}

}
