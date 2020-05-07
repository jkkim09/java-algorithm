# JAVA ALGORITHM 4
Anagram 애너그램 (서로 다른 문자열 재배열 했을 경우) 자바로 구현하기 <br>
Anagram이란 : <br>
문자의 순서를 바꾸어 재배열 했을 경우 같아지는 단어
# Code

`````java
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
`````

`````java
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
`````

# 풀이
## Info
"test" <=> "etts" 오른쪽 단어를 다시 배열 하면 왼쪽 문장과 같다 이러한 단어들을 같은디 다른지 확인하는 문제이다.

### func1
비교할 문장과 비교될 문장을 받아 각각 hashmap에 key를 단어로 하고 처음 값은 1 그리고 containsKey("key")함수로 해당 키가 있으면 해당 key 의 value를 1씩 증가시킨다. 
그리고 마지막 for문에서 두개의 hashmap의 공통 key로 value를 비교하여 다른경우가 있을경우 false 아니면 true 로 반환한다. 주의할 점은 처음 length 와 대문자를 모두 소문자로 바꾸어 확인하는 예외처리를 해야한다.

### func2
func1 은 직접 풀어보았고 func2는 출처 쪽 내용을 가져온 것입니다. func2와 func1의 다른점은 HashMap 을 한번쓴것이고 hashmap의 value를 비교되눈 값을 뺴어 마지막에 0이 아닌것을 구분하여 0이 아니면 두 단어가 다르다는 로직으로 구현한 것이다.

## 결론
일단 내가 푼것보다 func2 방법이 좀더 좋은 방법 같다.