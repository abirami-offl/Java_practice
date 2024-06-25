import java.util.*;
import java.util.Scanner;


public class Duplicate{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size :");
        int n=sc.nextInt();
        int a[]=new int[n];

        System.out.println("Enter elements :");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        //print the dupilcate elements in array

        for(int i=0;i<n;i++){
            for(int j=1;i<n;i++){
                if(a[i]==a[j]){
                     System.out.println("Duplicate element is :"+a[i]);
                     return;
                }
               
        }}

    }
}

/*OUTPUT

Enter size :4
Enter elements :44 33 33 56 
Duplicate element is :33

 */