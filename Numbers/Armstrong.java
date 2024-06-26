import java.util.*;
import java.util.Scanner;
public class Armstrong{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
         int n=sc.nextInt();
         int rem=0;
         int t=n;
         for(int i=1;i<n;i++){
            
            int b=t%10;
            int c=(int)Math.pow(b,3);
            rem=rem+c;
            t=t/10;
         }
         if(rem==n){
        System.out.println("It is Armstrong number");
         }
        else{
        System.out.println("It is not Armstrong number");
         }
    }}


/*OUTPUT

Enter a number
153
It is Armstrong number

Enter a number
423
It is not Armstrong number

*/    