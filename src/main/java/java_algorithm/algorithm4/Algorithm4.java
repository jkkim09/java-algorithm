package java_algorithm.algorithm4;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author jkkim
 * 
 * 알고리즘 Anagram 애너그램 (서로 다른 문자열 재배열 했을 경우) 자바로 구현하기 !!
 * 
 * Anagram이란 
 * 문자의 순서를 바꾸어 재배열 했을 경우 같아지는 단어

 */
public class Algorithm4 {
	public static boolean func1 (String target, String compare) {
		boolean check = true;
		int targetLength = target.length();
		int compareLength = compare.length();
		
		if (targetLength != compareLength) {
			return false;
		}
		
		Map<Character, Integer> map1 = new HashMap<Character, Integer>();
		for (int i=0; i<targetLength; i++) {
			char key1 = target.toLowerCase().charAt(i);
			if (!map1.containsKey(key1)) {
				map1.put(key1, 1);				
			} else {
				map1.put(key1, map1.get(key1) + 1);	
			}
		}
		
		Map<Character, Integer> map2 = new HashMap<Character, Integer>();
		for (int j=0; j<compareLength; j++) {
			char key2 = compare.toLowerCase().charAt(j);
			if (!map2.containsKey(key2)) {
				map2.put(key2, 1);				
			} else {
				map2.put(key2, map2.get(key2) + 1);	
			}
		}
		
		for (char a : map1.keySet()) {
			if (map1.get(a) != map2.get(a)) {
				check = false;
			}
		}
		return check;
	}
	
	// 출처 : https://blog.naver.com/gngh0101/221194764567
    public static boolean func2(String str, String compareStr) {

        char[] words = str.toLowerCase().toCharArray();
        char[] compareWords = compareStr.toLowerCase().toCharArray();
        Map<Character, Integer> lettersInwords = new HashMap<Character, Integer>();
        int count = 0;
        
        for (char c : words) {
            count = 1;
            if (lettersInwords.containsKey(c)) {
                count = lettersInwords.get(c) + 1;
            }
            lettersInwords.put(c, count);
        }
        for (char c : compareWords) {
            count = -1;
            if (lettersInwords.containsKey(c)) {
                count = lettersInwords.get(c) - 1;
            }
            lettersInwords.put(c, count);
        }

        for (char c : lettersInwords.keySet()) {
            if (lettersInwords.get(c) != 0) {
                return false;
            }
        }
        return true;
    }
	
	public static void main(String[] args) {
		boolean check = func1("test", "stet");
		System.out.println(check);
		boolean check2 = func2("test", "stet");
		System.out.println(check2);
	}

}
