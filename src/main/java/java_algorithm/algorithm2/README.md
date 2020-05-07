# JAVA ALGORITHM 2

int의 max값 구하기 

# Code

`````java
	public static int func1 () {
		int number = 1;
	    while ((number = number << 1) > 0) {
	    }
	    System.out.println(number);
	    return ~number;
	}
	
	public static void func2 () {
		int b = 1;
		// 00000~~~00001  = 1
		b = b << 1;
		// 00000~~~00010  = 2
		System.out.println(b);
		b = b << 1;
		// 00000~~~00100  = 4
		System.out.println(b);
		b = b << 1;
		// 00000~~~00100  = 8
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		int value = func1();
		System.out.println(value);
//		func2();
	}
`````

# 풀이
## Info 
int형이 크기는 4byte(32bits)	-2147483648 ~2147483647(20억 정도) 이다 
그러니 무한 르프로 +1을 하면 20억번 을 돌아야 값이 나오게된다. 그럼 시간 복잡도는....
그래서 생각한 것이 32bits shift 연산자를 활용한 2진수 수 표현이다.

### func1 
00000~~~00001 -> 00000~~~00010 -> 00000~~~00100 shift연산자로 1칸씩 왼쪽으로 이동시켜 음수 가 될때까지 이동시킨다 그리고 ~(not) 연산자를 사용하여 ex) 10000~~~0000 -> 01111~1111 로 바꾸어 최대값을 구한다.