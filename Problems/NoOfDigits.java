import java.util.LinkedList;
import java.util.Scanner;
public class NoOfDigits{
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);

//method 1

         System.out.print("Enter a number:");
         int a=sc.nextInt();
         int count=0;

         while(a!=0){
            int b=a%10;
            count++;
            a=a/10;
         }
         System.out.print("No of digits: "+count);

//method 2         

         System.out.print("Enter a number:");
         int b=sc.nextInt();
         String c=Integer.toString(b);
         System.out.print("No of digits: "+c.length());
        
}

    }

   /*OUTPUT

   Enter a number:234464
   No of digits: 6
   Enter a number:2755347
   No of digits: 7
     
     */