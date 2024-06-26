import java.util.*;
import java.util.LinkedList;

public class Reverse{
    public static void main(String args[]){
LinkedList<Integer> number=new LinkedList<>();

number.add(12);
number.add(22);
number.add(32);
number.add(42);

System.out.print(number);

System.out.print(number.reversed());

    }
}

/*OUTPUT
 
[12, 22, 32, 42]

[42, 32, 22, 12]

 */