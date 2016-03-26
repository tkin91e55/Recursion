public class MyFirstJavaProgram {

   /* This is my first java program.  
    * This will print 'Hello World' as the output
    */
	static int w[] = new int[9];
	static boolean used[] = new boolean[10];

	static void recur(int len) {
		int a = w[0], b = w[1], c = w[2], d = w[3], e = w[4], f=w[5], g=w[6], h=w[7], p = w[8];

		if(len==9){
			//System.out.println("***a="+a+" b="+b+" c="+c+" d="+d+" e="+e+" f="+f+" g="+g+" h="+h+" p="+p);
		return;
		}

		for(int i=1; i<=9; i++) {
			if(used[i]) continue;
			used[i] = true;
			w[len] = i;
			System.out.println("w:");
			for (int j=0; j<w.length; j++)
				{
				  System.out.print(w[j]+ " ");
				}
			System.out.println("\nused:");
			for (int j=0; j<used.length; j++)
				{
				  System.out.print(used[j]+ " ");
				}
			System.out.println("\nBefore recur: a="+a+" b="+b+" c="+c+" d="+d+" e="+e+" f="+f+" g="+g+" h="+h+" p="+p);
			recur(len +1);
			used[i] = false;
		}

	}

    public static void main(String []args) {
    	recur(0);
    }
} 