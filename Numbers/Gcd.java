import java.util.*;
public class Gcd{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two elemnets");
        int n1=sc.nextInt();
        int n2=sc.nextInt();

        while(n2!=0){
            int temp=n2;
            n2=n1%n2;
            n1=temp;
        }
        System.out.print("GCD is "+n1);
    }
}

/*OUTPUT

Enter two elemnets
55
25
GCD is 5
 
 */