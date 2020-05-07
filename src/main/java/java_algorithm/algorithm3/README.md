# JAVA ALGORITHM 1

1000까지 3의배수, 5의 배수 합 구하기

# Code

`````java
	private static int max = 1000; 
	
	public static void func1 () {
		int i;
		int sum = 0;
		for (i=0; i<=max; i++) {
			if (i%3 == 0) {
				sum += i;
			}
			
			if (i%5 == 0) {
				sum += i;
			}
			
			if (i%3 == 0 && i%5 == 0) {
				sum -= i;
			}
		}
		System.out.println(sum);
	}
	
	public static void func2 () {
		int sum = 0;
        for (int i = 1; i <= max; i ++) {
            if (i % 3 == 0 && i % 5 == 0)
                sum += i;
            else if (i % 3 == 0) 
                sum += i;
            else if (i % 5 == 0)
                sum += i;
        }
        System.out.println(sum);
        // 출처는 https://blog.naver.com/gngh0101/221172477823 입니다.
	}
	
	public static void func3 () {
		int sum = sumFunction(3) + sumFunction(5) - sumFunction(15);
		System.out.println(sum);
	}
	
	public static int sumFunction (int value) {
		int n = max / value;
        return value * n * (n+1) / 2;
        // 출처는 https://blog.naver.com/gngh0101/221172477823 입니다.
	}
	
	public static void main(String[] args) {
//		func1();
//		func2();
		func3();
	}
`````

# 풀이
## func1 
처음 문제를 보고 기준값(1000)에서 3, 5 배수(나누어 나머지가 없는 값) 들을 더하고 3 과 5 의 공통 배수인 15 배수를 한번 빼주면 중복으로 더한 값을 제거 할 수 있겠다는 의식의 흐름으로 코드를 풀었다 물론 플고나서 수정할 부분을 찾아 변경할 예정이었다.  

## func2
func1 에서 굳이 15의 배수를 뻴 필요없이 if-else 문으로 걸러내는 방법을 생각했는데 문제 출처인 저자님도 같은 코드가 되었다.

## func3
사실 이 방법은 몰랐다 수학적인 부분이라 ....<br>
value: 배수값<br>
n: 기준값/배수값<br>
- value * n * (n+1) / 2
을이용하면 for문을 사용할 필요없이 배수의 합이 나오는 공식이다. 그러니 3 의 배수와 5의 배수를 더하고 15의 배수는 중복이 되니 빼주면 func1, func2 와 같은 값은 나오지만 for문으로 1000 번을 반복한게 아니무로 시간 복잡도 면에서는 효과적인 방법이다.

# 기타
수학을 잘하면 개발도 잘 할 수 있지 안을까?.. 라는 생각을 한다......