package Java20170406;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		// Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생
		HashMap<Key, String> hashMap = new HashMap<Key,String>();
		
		//hashMap.put(new Key("1"), "홍길동 ");
		hashMap.put(new Key(1), "홍길동");
		
		//String value = hashMap.get(new Key("1"));
		String value = hashMap.get(new Key(1));
		System.out.println(value);
		
		Object obj = new Object();
		System.out.println(obj);
		System.out.println(obj.hashCode());
	} 

}
 
