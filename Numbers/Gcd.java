import java.util.*;
public class Gcd{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two elemnets");
        int n1=sc.nextInt();
        int n2=sc.nextInt();

        //method 1
        
        while(n2!=0){
            int temp=n2;
            n2=n1%n2;
            n1=temp;
        }
        System.out.println("GCD is "+n1);

        //method 2

        System.out.println("Enter two elemnets");
        int a1=sc.nextInt();
        int a2=sc.nextInt();
        
          while (a1!=a2) {
            if (a1>a2) {
                a1 = a1-a2;
            }
            else{
                a2 = a2-a1;
            }
        }
        
        System.out.println("GCD is "+a1);
    }
}

/*OUTPUT

Enter two elemnets
55
25
GCD is 5

Enter two elemnets
22
86
GCD is 2

 
 */
