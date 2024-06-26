import java.util.*;
import java.util.Scanner;
public class Greatest{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers");
         int a=sc.nextInt();
         int b=sc.nextInt();
         int c=sc.nextInt();

        //if-else condition
         
         if(a>b&&a>c){
                System.out.print("The greatest number :"+a);
            }
         else if(b>a&&b>c){
                System.out.print("The greatest number :"+b);
         }
         else{
            System.out.print("The greatest number :"+c);
         }
    
        }}


        /*OUTPUT
         
        Enter three numbers
        66
        55
        76
        The greatest number :76

         */