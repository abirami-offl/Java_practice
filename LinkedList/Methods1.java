import java.util.*;
import java.util.LinkedList;

public class Methods1{
    public static void main(String args[]){
      LinkedList<String> color=new LinkedList<>();

    //add,addFirst,addLast
        color.add("brown");
        color.add("green");
        color.add("pink");
        color.add("blue");
        color.addFirst("yellow");
        color.addLast("purple");
        System.out.println(color);
       
    //getLast,getFisrt
        System.out.println(color.getLast());
        System.out.println(color.getFirst());

    //set,size   
        color.set(2,"grey");
        System.out.println(color);
        System.out.println(color.size());



    }}

    /*OUTPUT
    
    [yellow, brown, green, pink, blue, purple]
    purple
    yellow
    [yellow, brown, grey, pink, blue, purple]
    6

     */