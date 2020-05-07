package java_algorithm.algorithm1;
/**
 * 
 * @author jkkim
 *	
 *	1000까지 3의배수, 5의 배수 합 구하기
 */
public class Algorithm1 {
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
}
