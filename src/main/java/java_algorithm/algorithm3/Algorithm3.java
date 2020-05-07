package java_algorithm.algorithm3;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author catenoid-dev1
 * 
 *  반복되지 않는 첫 문자란
 * 	"ABBACF"     => C
 * 	"ABCDEF"     => A
 * 	"AABBCD"     => C
 *	
 */
public class Algorithm3 {
	public static String func1 (String a) {
		String[] list = a.split("");
		String returnValue = "";
		int length = list.length;	
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i=0; i<length; i++) {
			String key = list[i];
			if (map.get(key) == null) {
				map.put(key, 0);
			} else {
				map.put(key, map.get(key) + 1);
			}
		}
		
		for (String key : map.keySet()) {
			if (map.get(key) == 0) {
				returnValue = key;
				break;
			}
		}
		return returnValue;
	}
	
	public static void main(String[] args) {
		System.out.println(func1("abcbcdede"));
	}

}
