import java.util.*;
import java.util.LinkedList;


public class Methods2{
    public static void main(String args[]){
      LinkedList<String> color=new LinkedList<>();

    //add
        color.add("brown");
        color.add("green");
        color.add("pink");
        color.add("blue");
        color.add("yellow");
        color.add("purple");
        System.out.println(color);

    //removeFirst,removeLast
        color.removeFirst();
        color.removeLast();
        System.out.println(color);

    //removeFirstOccurrence,removeLasttOccurrence,
        color.add(4,"blue");
        color.add("brown");
        System.out.println(color);
        color.removeFirstOccurrence("blue");
        System.out.println(color);

        color.add(2,"brown");
        System.out.println(color);
        color.removeLastOccurrence("brown");
        System.out.println(color);

    //clear
        color.clear();
        System.out.println(color);
        System.out.println(color.size());
}
}

/*OUTPUT

[brown, green, pink, blue, yellow, purple]
[green, pink, blue, yellow]
[green, pink, blue, yellow, blue, brown]
[green, pink, yellow, blue, brown]
[green, pink, brown, yellow, blue, brown]
[green, pink, brown, yellow, blue]
[]
0
 */