package java_algorithm.algorithm6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 
 * @author jkkim
 * 
 */
public class Algorithm6 {
	public static void func1 () throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int time = 0;
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
        System.out.println("입력 받은 값  a : " + a + " , b : " + b);
        
		while (a != b) {
			if (a < b) {
				if (Math.abs(a*2 - b) < Math.abs(a-b) && a*2 <= 10000) {
					a *= 2;
				} else {
					a += 1;					
				}
			} else {
				a -= 1;
			}
			time += 1;								
		}
		System.out.println("시간 : " + time);
	}
	
	public static void main(String[] args) throws IOException {
		func1();
	}

}
