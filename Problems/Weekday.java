import java.util.*;
import java.util.Scanner;
public class Weekday{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
         int a=sc.nextInt();

//Switch case

         switch(a){
            case 1:
            System.out.print("Sunday");
            break;
            case 2:
            System.out.print("Monday");
            break;
            case 3:
            System.out.print("Tuesday");
            break;
            case 4:
            System.out.print("Wednesday");
            break;
            case 5:
            System.out.print("Thursday");
            break;
            case 6:
            System.out.print("Friday");
            break;
            case 7:
            System.out.print("Saturday");
            break;
         }

        }
    }

    /*OUTPUT 
     
    Enter a number
    6
    Friday

     */