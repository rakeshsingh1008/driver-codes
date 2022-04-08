import java.io.*;
import java.util.*;

public class Main {
  	// The main function reads the input in the required format.
  	// Just complete the solve function below.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {
            int n =  Integer.parseInt(br.readLine());
            String out_ = solve(n);
            System.out.println(out_);
         }
         wr.close();
         br.close();
    }
  
    static String solve(int n){
      	// Your code goes here
        // n is the given input
      
      int lenght = (int)(Math.log10(number)+1);
      
      int[] arr = new int[length];
      int i =0;
      int temp;
      
      
      while(n!= 0)
      {
        temp = n %10;
        n/=10;
        arr[i++] = temp;
      }
      
      int[] b = new int[length];
      int j = n;
      for(int i =0;i<n;i++)
      {
        b[j-1] = a[i];
        j = j -1;
      }
      
      int left = 0; int right = 0;
      if(n %2 == 0)
      {
        for(int d = 0;d<n/2;d++)
        {
          left = left*10 + b[d];
        }
        
        for(int c = n/2;c<n;c++)
        {
          right = right*10 + b[c];
        }
      }
      else{
        
        for(int d = 0;d<n/2;d++)
        {
          left = left*10 + b[d];
        }
        
        for(int c = (n/2)+1;c<n;c++)
        {
          right = right*10 + b[c];
        }
      }
      
      if(left > right)
      {
         String result = "magic number";
        return result;
      }
      else
      {
         String result = "normal number";
        return result;
      }
       
     
    }
}
