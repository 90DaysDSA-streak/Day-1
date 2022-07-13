// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.sequence(N));
        }
    }
}// } Driver Code Ends


//User function Template for Java
class Solution {
	int index = 0;
	int flag = 0;
	Long res = 0L;

	long sequence(int N) {
		if (N == flag) {

			res = 1L;
			for (int i = index; i > index - flag; i--) {

				res = res * i;

			}
			index = index - N;

			return res;
		}
		flag = flag + 1;
		index = index + flag;
		sequence(N);
		flag = flag - 1;
		if (flag == 0) {
			return res;
		}

		Long addInResult = 1L;
		
		for (int i = 0; i < flag; i++) {

			addInResult = addInResult * index;
			index--;
		}

		res = res + addInResult;

		return res;

	}
}