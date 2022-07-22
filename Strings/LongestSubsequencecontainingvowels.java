package Strings;
import java.util.*;
public class LongestSubsequencecontainingvowels {

	    static boolean Vowel(char ch)
	    {
	    	if (ch == 'a' || ch == 'e' ||ch == 'i' || ch == 'o' ||ch == 'u')
			    return true;
		    return false;
	    }

	    static int Lcs(String X, String Y, int m, int n)
	    {
		    int L[][] = new int[m + 1][n + 1];  //m+1=11,n+1=8
		    int i, j;

	    	for (i = 0; i <= m; i++)
		    {
			    for (j = 0; j <= n; j++)
			    {
				    if (i == 0 || j == 0)
					    L[i][j] = 0;
	    			else if ((X.charAt(i - 1) == Y.charAt(j - 1)) && Vowel(X.charAt(i - 1)))
				    	L[i][j] = L[i - 1][j - 1] + 1;
	    			else
			    		L[i][j] = Math.max(L[i - 1][j],L[i][j - 1]);
			    }
	    	}
	    	return L[m][n];
	    }

	    public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);
		    String a = sc.next();
		    String b = sc.next();
	        int i = a.length();//10
		    int j = b.length();//7
	    	System.out.println(""+Lcs(a, b, i, j));
	    }
	}

