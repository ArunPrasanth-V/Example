package example1;
import java.util.*;
public class Ex1 {
public static void main(String args[])
{
	
	StringBuffer b=new StringBuffer();
	b.append(0);
	char c='0';
	for(int i=1;i<4;i++) {
	if(c=='0')
		b.append("01");
	else
		b.append("10");
	c=b.charAt(b.length()-1);
	}
	
	System.out.println(b.charAt(5));
}
}
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
 
    	int carry=0,sum=0,s=0;
        List<Integer> arr=new ArrayList<>();
        int i=num.length-1;
    while(i>=0||k>0||carry>0)
     {
       int val=(i>=0?num[i]:0)+(k>0?k%10:0)+carry;  
          carry=val/10;
          arr.add(val%10);
          i--;k/=10;
     }
     Collections.reverse(arr);
    arr.forEach(x-> System.out.println(x));
     return arr;
    }
}

class Solutison {
    public int kthGrammar(int n, int k) {
        if(n == 1){
            return 0;
        }
        if(k>Math.pow(2, n-2)) 
        	return Math.abs(1-kthGrammar(n-1,(int)(k-Math.pow(2, n-2))));
        else 
        	return kthGrammar(n-1, k);
    }
}