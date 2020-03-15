# JAVA ALGORITHM 문제

2020년 초심으로 돌아가 처음부터 다시 공부를 해보려고 한다.
정답 코드는 src/main/java 에서 확인 할 수 있습니다.

## 1번
문제: Hello Woald 출력합니다.

`````java
public class Quiz1 {
	public static void main(String[] args) {
		System.out.println("Hello Woald");
	}
}
`````

역시 첫 시작은 Hello Woald 입니다.
참고로 java application 을 실행하면 main 메소드를 실행 시킵니다

## 2번
문제: 두 정수 A와 B를 입력받고 A+B를 출력합니다.

````java
public class Quiz2 {
	public static void main(String[] args) {
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 A : ");
		a = sc.nextInt();
		System.out.print("정수B : ");
		b = sc.nextInt();
		System.out.println("A + B = "+ (a + b));
	}
}
````

## 3번
문제: 입력 받은 그대로 출력하는 프로그램을 작성합니다.

`````java
public class Quiz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
	}
}
`````