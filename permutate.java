public class permutate {

	static int w[] = new int[9];
	static boolean used[] = new boolean[10];

	static void recur(int len) {
		int a = w[0], b = w[1], c = w[2], d = w[3], e = w[4], f=w[5], g=w[6], h=w[7], p = w[8];

		if(len==9){
			if(((a*10+b) - (c*10+d) + (g*10+h) == p*111) && ((a*10+b) - (c*10+d) == (e*10+f))) {
			System.out.println("***a="+a+" b="+b+" c="+c+" d="+d+" e="+e+" f="+f+" g="+g+" h="+h+" p="+p);
		}
		return;
		}

		for(int i=1; i<=9; i++) {
			if(used[i]) continue;
			used[i] = true;
			w[len] = i;
			recur(len +1);
			used[i] = false;
		}

	}

    public static void main(String []args) {
    	recur(0);
    }
} 