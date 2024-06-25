import java.util.*;
import java.util.LinkedList;



public class AsQueue{
    public static void main(String args[]){
         LinkedList<String> vegtables=new LinkedList<>();

         vegtables.add("tomato");
         vegtables.add("potato");
         vegtables.add("chilli");
         vegtables.add("beetroot");
         vegtables.add("onion");
         vegtables.add("carrot");
        System.out.println(vegtables);

        //First In First Out

        System.out.println(vegtables.removeFirst());
        System.out.println(vegtables.removeFirst());
        System.out.println(vegtables.removeFirst());
        System.out.println(vegtables.removeFirst());
        System.out.println(vegtables.removeFirst());
        System.out.println(vegtables.removeFirst());
        
    }
}

/*OUTPUT
 
[tomato, potato, chilli, beetroot, onion, carrot]
tomato
potato
chilli
beetroot
onion
carrot

 */
