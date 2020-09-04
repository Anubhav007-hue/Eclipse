package mixedUp;
import java.util.*;

public class Question1 {
	
	
		public static void main(String[] args) {
	        int a = 4;
	        int b = 97;
	        int n = 43;
	        int mod=1000000007;

	        int x = (n / 2 - 1) + 1;
	        b =(int) ((int) b * (Math.pow(2, x))%mod);
	        a = (int) ((int)a * (Math.pow(2, x))%mod);

	        if (n % 2 == 0) {
	            b = (b - a)%mod;
	        }
	        System.out.println(a %mod+ " " + b%mod);
	    }

}
