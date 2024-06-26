import java.util.*;
import java.util.Scanner;
public class CheckInteger{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int a=sc.nextInt();
        if(a>0){System.out.print(a+" is positive integer");
    }
        else if(a<0){System.out.print(a+" is negative integer");}
        
        else{System.out.print(a+" is equal to zero");
    }
    }}

    /*OUTPUT
     
Enter the number 
5
5 is positive integer

Enter the number 
-99
-99 is negative integer

     */