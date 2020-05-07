# JAVA ALGORITHM 3

반복되지 않는 첫 문자란 <br>
"ABBACF"     => C <br>
"ABCDEF"     => A <br>
"AABBCD"     => C <br>

# Code

`````java
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
`````

# 풀이
## info
HashMap을 용하여 key-value 라는 특성을 활용하여 문제를 풀었다.

### func1
문자열을 받아 split 함수로 배열로 만든 후 get("key") 함수로 해당 키 의 값이 없으면 0을 넣고 값이 있으면 이전 값 + 1 을하여 다시 key-value로 설정한다. 그리고 마지막으로 map의 keySet(map keys)을 사용하여 key값들을 순회하며 value가 0인 값이 있으면 반환할 값을 설정하고 해당 값을 반환한다.
