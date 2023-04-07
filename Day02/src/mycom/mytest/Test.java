package mycom.mytest;

public class Test {

	
		public static int getJari(int num) {
	        int i = 1;
	        
	        while (num > 9) {
	            num /= 10;
	            i *= 10;
	        }
	        return i;
	    }

	    public static boolean palindrome(int num) {
	        int jari = getJari(num);
	        int temp = num;
	        while (num > 9) {
	            if (num / jari != num % 10) {
	                return false;
	            }
	            num = (num / 10) % (jari / 10);
	            jari /= 100;
	        }
	        System.out.println(temp);
	        return true;
	    }

	    public static void main(String[] args){
	    	int n = 101;
	    	int m = 101;
	        int answer = 0;

	        for (int i = n; i <= m; i++) {
	            if (palindrome(i) == true)
	                answer++;
	        }
	        System.out.println(answer);
	        //return answer;
	    }

}
