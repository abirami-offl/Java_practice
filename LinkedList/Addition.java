import java.util.*;
import java.util.LinkedList;
import java.util.Scanner;

public class Addition{
    public static void main(String args[]){

     //method 1
      LinkedList<Integer> number=new LinkedList<>();
      number.add(34);
      number.add(55);
      System.out.println(number);
      int sum=0;
      for( int b:number){
        sum=b+sum;
      }
      System.out.println(sum);

      //method 2

      Scanner sc=new Scanner(System.in);
      LinkedList<Integer> num=new LinkedList<>();

      System.out.print("Enter a num");
      num.add(sc.nextInt());
      System.out.print("Enter a num");
      num.add(sc.nextInt());

      int sum1=0;
      for( int v:number){
        sum1=v+sum1;
      }

      System.out.println("The sum of numbers are "+sum1);

    }
}

/* OUTPUT
 
[34, 55]
89

Enter a num66
Enter a num77
The sum of numbers are 89

 */