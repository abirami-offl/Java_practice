import java.util.*;
import java.util.Scanner;
public class Average{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total number");

        //Fint sum ou inputs and its average

        int n=sc.nextInt();
        int a[]=new int[n];
        int sum=0;
        System.out.println("Enter numbers");
         for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
         }
         for(int i=0;i<n;i++){
            sum=sum+a[i];
         }
         int avg=sum/n;
         System.out.println("Sum of numbers :"+sum);
         System.out.println("Sum of numbers :"+avg);
        }}

/*OUTPUT 
 
Enter total number
5
Enter numbers
2
8
10
20
60
Sum of numbers :100
Sum of numbers :20

 */
        