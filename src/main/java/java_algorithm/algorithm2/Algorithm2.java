package java_algorithm.algorithm2;
/**
 * 
 * @author catenoid-dev1
 * 
 * int의 max값 구하기 
 *
 */
public class Algorithm2 {
	public static int func1 () {
		int criteria = 1;
	    while ((criteria = criteria << 1) > 0) {
	    }
	    System.out.println(criteria);
	    return ~criteria;
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

}
