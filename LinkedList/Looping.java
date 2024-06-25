import java.util.*;
import java.util.LinkedList;
import java.util.ArrayList;


public class Looping{
    public static void main(String args[]){
      LinkedList<String> name=new LinkedList<>();
        
        name.add("aathi");
        name.add("banu");
        name.add("cham");
        name.add("vino");
        name.addFirst("abu");
        name.addLast("zayn");
        name.add(4,"vichu");
        for(String names:name){
        System.out.println(name);
        }

    }
}


/*OUTPUT

abu
aathi
banu
cham
vichu
vino
zayn

 */

