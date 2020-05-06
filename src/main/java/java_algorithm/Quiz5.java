package java_algorithm;
/*
 * 
 * 1. string to integer
 *
 * string 으로 존재하는 정수를 integer 로 변환하는 함수를 작성해주세요.
 * 이 문제의 의도는 string 을 iteration 하면서 경계조건, 예외 케이스 등을 잘 처리할 수 있는지에 있습니다.
 * 즉, 한 글자씩 iteration 하면서 다른 함수들을 이용해 Integer.parseInt(string) 같은 함수를 '직접' 만드시면 됩니다.
 *
 * 단계
 *
 * 1) string 의 내용이 양의 정수인 경우 integer 로 변환합니다.
 * input -> string: "123"
 * output -> integer: 123
 *
 * 2) string 의 내용이 정수가 아닌 경우는 null 을 반환해야 합니다.
 * input -> string: "123.456"
 * output -> null
 *
 * 3) string 의 내용이 음의 정수인 경우도 변환이 가능해야합니다.
 * input -> string: "-123"
 * output -> integer: -123
 * 
 *
 * 2. list rotation
 *
 * list 와 count 를 받아 count 만큼 list 를 rotation 하는 함수를 구현해주세요.
 * 이 문제의 의도는 enumerable 을 잘 다룰 수 있는가, 조건을 단순화할 수 있는가에 있습니다. 
 * 
 * 단계
 *
 * 1) list 의 크기보다 작은 0 과 같거나 큰 count 를 받아 rotation 을 합니다.
 * input -> list: [1, 2, 3, 4, 5], count: 2
 * output -> list: [3, 4, 5, 1, 2]
 *
 * 2) list 의 크기보다 큰 count 를 받아 rotation 을 합니다.
 * input -> list: [1, 2, 3, 4, 5], count: 8
 * output -> list: [4, 5, 1, 2, 3]
 *
 * 3) 0 보다 작은 count 를 받아 rotation 을 합니다.
 *
 * input -> list: [1, 2, 3, 4, 5], count: -1
 * output -> list: [5, 1, 2, 3, 4]
 *
 */
public class Quiz5 {

	public int firstFunction (String value) {
		char[] arr = value.toCharArray();
		boolean check = false;
		int leng = arr.length;
		int sum = 0;
		for (int a=0; a<leng; a++) {
			char b = arr[a];
			if (b == 46) {
				return (Integer) null;
			}
			if (b != 45) {
				int c = (int) Math.pow(10, leng - a -1);
				int d = b -'0';
				sum += d * c;		
			} else if (b == 45) {
				check = true;
			}
		}
		if (check) {
			sum = sum * -1;
		}
		return sum;
	}
	
	public int[] secondFunction (int[] arr2, int n) {
		if (n > 0) {
			for (int i = 0; i < n; i++) {
				int cr = arr2[0];
				
				for (int j = 0; j < arr2.length-1; j++) {
					arr2[j] = arr2[j+1];
				}
				
				arr2[arr2.length - 1] = cr;
			}			
		}
        return arr2;
	}
	
	public static void main(String[] args) {
			Quiz5 q5 = new Quiz5();
			
			String first = "123";
			int r = q5.firstFunction(first);
			System.out.println("��� : "+ r);
			
			int[] test2 = {1,2,3,4,5};
			int[] r2 = q5.secondFunction(test2, -1);
			for (int a : r2) {
				System.out.println(a);
			};
	}

}
