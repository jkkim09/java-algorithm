package java_algorithm;


//���ڿ� �迭(string array)�� �־�����, ���� �� ����� ���λ�(prefix)�� ���̸� ã���ÿ�.
//Given an array of strings, find the longest common prefix of all strings.
//����)
//Input: [��apple��, ��apps��, ��ape��]
//Output: 2 // ��ap��
//Input: [��hawaii��, ��happy��]
//Output: 2 // ��ha��
//Input: [��dog��, ��dogs��, ��doge��]
//Output: 3 // ��dog��
public class Quiz4 {

	public int longestPrefixLength(String[] arr) {
	    if (arr.length == 0) {
	        return 0;
	    }
	    String max_prefix = arr[0];
	    for (int i = 0; i < max_prefix.length(); i++) {
	        char c = max_prefix.charAt(i);
	        for (int j = 1; j < arr.length; j++) {
	            if (i == arr[j].length() || arr[j].charAt(i) != c) {
	                return i;  
	            }
	        }
	    }
	    return max_prefix.length();
	}
	
	public static void main(String[] args) {
		Quiz4 q4 = new Quiz4();
		String[] test = {"apple","apps","ape"};
		int return_value = q4.longestPrefixLength(test);
		System.out.println(return_value);
	}

}
