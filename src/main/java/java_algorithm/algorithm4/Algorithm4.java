package java_algorithm.algorithm4;

/**
 * 
 * @author catenoid-dev1
 * 
 *
 */
public class Algorithm4 {
	public static void func1 (String target, String compare) {
		System.out.println(target);
		System.out.println(compare);

		for (int i=0; i<target.length(); i++) {
			char key1 = target.charAt(i);
			System.out.println(key1);
		}
		
		for (int j=0; j<compare.length(); j++) {
			char key2 = compare.charAt(j);
			System.out.println(key2);
		}
	}
	
	public static void main(String[] args) {
		func1("test", "stet");
	}

}
