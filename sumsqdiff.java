import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class sumsqdiff{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextInt();
            int  sumsq=0;
            int  sum=0;
            int  sqsum=0;
            for(int i=1;i<=n;i++){
                
                sumsq=sumsq+(i*i);
                sum=sum+i;
                sqsum=sum*sum;
                
                

            }

            
            //System.out.println(sumsq);
           // System.out.println(sum);
           // System.out.println(sqsum);
            System.out.println(sqsum-sumsq);
	}
}
}