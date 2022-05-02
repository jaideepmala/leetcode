package mala.jaideep;

import java.util.Scanner;

public class Solution {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args)  {
    	int[] a= {4,6,7,4};
    	int[] b= {6,5,3,5};
    	System.out.println(canCompleteCircuit(a,b));
		/**
		 * Your Excel object will be instantiated and called as such:
		 * Excel obj = new Excel(H, W);
		 * obj.set(r,c,v);
		 * int param_2 = obj.get(r,c);
		 * int param_3 = obj.sum(r,c,strs);
		 */
    }
	private static int canCompleteCircuit(int[] a, int[] b) {
		int n = a.length;
		int j;
		int s;
		for(int i=0;i<n;i++)
		{
			if(a[i]>=b[i]) 
			{
				j=i+1;
				s =a[i]-b[i]; 
				while(j!=i)
				{
					if(j==n)
						j=0;
					if(s+a[j]>=b[j])
						j++;
					else
						break;
					
				}
				if(j==i)
					return i;
			}
			
		}
		return -1;
		
	}
}