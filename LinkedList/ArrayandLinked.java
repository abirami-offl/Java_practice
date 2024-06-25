import java.util.*;
import java.util.LinkedList;
import java.util.ArrayList;


public class ArrayandLinked{
    public static void main(String args[]){

    //addAll    
      LinkedList<String> color=new LinkedList<>();
        color.add("brown");
        color.add("green");
        color.add("pink");
        color.add("blue");
        color.add("yellow");
        color.add("purple");
        System.out.println(color);

    ArrayList<String> name=new ArrayList<>();
        name.add("aathi");
        name.add("banu");
        name.add("chandru");
        name.add("dharsan");
        System.out.println(name);

        name.addAll(color);
        System.out.println(name);
    }
}

/*OUTPUT

[brown, green, pink, blue, yellow, purple]
[aathi, banu, chandru, dharsan]
[aathi, banu, chandru, dharsan, brown, green, pink, blue, yellow, purple]

*/