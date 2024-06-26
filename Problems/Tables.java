import java.util.*;
import java.util.Scanner;
public class Tables{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int a=sc.nextInt();
        System.out.println("Enter the length of table ");
        int b=sc.nextInt();

        for(int i=1;i<=b;i++){
            int c=a*i;
        System.out.println(i+" * "+a+" = "+c);
        }
    }}

    /*OUTPUT 
     
Enter the number 
5
Enter the length of table 
10
1 * 5 = 5
2 * 5 = 10
3 * 5 = 15
4 * 5 = 20
5 * 5 = 25
6 * 5 = 30
7 * 5 = 35
8 * 5 = 40
9 * 5 = 45
10 * 5 = 50

     */