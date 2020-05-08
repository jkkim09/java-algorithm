package java_algorithm.algorithm5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 
 * @author jkkim
 * 
 */
public class Algorithm5 {
	public static void func1 () throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
	}
	
	public static void func2 () throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] year = new int[3];
        int[] ans = new int[3];
        year[0] = Integer.parseInt(st.nextToken());
        year[1] = Integer.parseInt(st.nextToken());
        year[2] = Integer.parseInt(st.nextToken());
        
        for (int i = 0; i < 3; i++) {
            ans[i] = year[0];
        }
        int cnt = 0;
        while (true) {
            if (Arrays.equals(year, ans)) {
                bw.write(year[0] + cnt + "\n");
                break;
            } else {
                cnt += 15;
                ans[1] += 15;
                ans[2] += 15;
                ans[1] = ans[1] > 28 ? ans[1] % 28 : ans[1];
                ans[2] = ans[2] > 19 ? ans[2] % 19 : ans[2];
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
	
	public static void main(String[] args) throws IOException {
//		func1();
		func2();
	}

}
