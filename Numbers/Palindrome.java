import java.util.*;
import java.util.Scanner;
public class Palindrome{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        //method 1 for String

        String s1="madam";
        String s2="";
        for(int i=s1.length()-1;i>=0;i--){
            char ch=s1.charAt(i);
            s2=s2+ch;}
            System.out.println("Palindrome of "+s1+" is : "+s2);

        //method 2 for integer  

        int a=2345432;
        String b=Integer.toString(a);
        String s="";
        for(int i=b.length()-1;i>=0;i--){
            char c=b.charAt(i);
            s=s+c;
        }
            System.out.println("Palindrome of "+a+" is : "+b);
        }
    }

    /*OUTPUT

    Palindrome of madam is : madam
    Palindrome of 2345432 is : 2345432

     */