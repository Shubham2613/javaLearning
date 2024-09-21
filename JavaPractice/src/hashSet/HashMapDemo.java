package hashSet;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("google", "www.google.com");
		hm.put("yahoo", "ww.yahoo.com");
		System.out.println(hm);
		hm.remove("google");
		System.out.println(hm);
		
		for(String key:hm.keySet()) {
			System.out.println("The key is :"+key+" 'value is' "+hm.get(key));
		}

	}

}
