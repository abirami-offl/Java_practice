import java.util.*;
import java.util.LinkedList;


public class Decicionmaking{
    public static void main(String args[]){
      LinkedList<String> banking=new LinkedList<>();
      banking.add("Pan card");
      banking.add("Aathar card");
      banking.add("Voter id");
      banking.add("Smart card");
      banking.add("Photo");
      banking.add("Bonafide");
  
    
     if(banking.contains("Aathar card")&&banking.contains("Pan card")&&banking.contains("Voter id")||banking.contains("Smart card")){
          System.out.println("Eligible for housing loan");
      }
      else if(banking.contains("Aathar card")&&banking.contains("Pan card")&&banking.contains("Voter id")||banking.contains("Bonafide")){
        System.out.println("Eligible for educational loan");
      }
      else if(banking.contains("Aathar card")&&banking.contains("Photo")){
        System.out.println("Eligible to open new bank account");
    }
      else {
          System.out.println("Not Eligible");
      }   
  
      }
  
      }
/*OUTPUT
Eligible for housing loan
 */
  