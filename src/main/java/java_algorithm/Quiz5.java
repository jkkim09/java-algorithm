package java_algorithm;
/*
 * 
 * 1. string to integer
 *
 * string ���� �����ϴ� ������ integer �� ��ȯ�ϴ� �Լ��� �ۼ����ּ���.
 * �� ������ �ǵ��� string �� iteration �ϸ鼭 �������, ���� ���̽� ���� �� ó���� �� �ִ����� �ֽ��ϴ�.
 * ��, �� ���ھ� iteration �ϸ鼭 �ٸ� �Լ����� �̿��� Integer.parseInt(string) ���� �Լ��� '����' ����ø� �˴ϴ�.
 *
 * �ܰ�
 *
 * 1) string �� ������ ���� ������ ��� integer �� ��ȯ�մϴ�.
 * input -> string: "123"
 * output -> integer: 123
 *
 * 2) string �� ������ ������ �ƴ� ���� null �� ��ȯ�ؾ� �մϴ�.
 * input -> string: "123.456"
 * output -> null
 *
 * 3) string �� ������ ���� ������ ��쵵 ��ȯ�� �����ؾ��մϴ�.
 * input -> string: "-123"
 * output -> integer: -123
 * 
 *
 * 2. list rotation
 *
 * list �� count �� �޾� count ��ŭ list �� rotation �ϴ� �Լ��� �������ּ���.
 * �� ������ �ǵ��� enumerable �� �� �ٷ� �� �ִ°�, ������ �ܼ�ȭ�� �� �ִ°��� �ֽ��ϴ�. 
 * 
 * �ܰ�
 *
 * 1) list �� ũ�⺸�� ���� 0 �� ���ų� ū count �� �޾� rotation �� �մϴ�.
 * input -> list: [1, 2, 3, 4, 5], count: 2
 * output -> list: [3, 4, 5, 1, 2]
 *
 * 2) list �� ũ�⺸�� ū count �� �޾� rotation �� �մϴ�.
 * input -> list: [1, 2, 3, 4, 5], count: 8
 * output -> list: [4, 5, 1, 2, 3]
 *
 * 3) 0 ���� ���� count �� �޾� rotation �� �մϴ�.
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
