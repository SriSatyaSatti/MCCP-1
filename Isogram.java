// Check if a string is Isogram or not
// Given a word or phrase, check if it is an isogram or not. An Isogram is a word in which no letter occurs more than once

// Examples: 

// Input: Machine
// Output: True
// Explanation: “Machine” does not have any character repeating, it is an Isogram

// Input : Geek
// Output : False
// Explanation: “Geek” has ‘e’ as repeating character, it is not an Isogram

import java.util.*;
public class MyClass {
    static boolean isIsogram(String s){
     HashMap<String,Integer> h=new HashMap<>();
     for(int i=0;i<s.length();i++){
         String c=s.charAt(i)+"";
         if(h.containsKey(c)){
             int x=h.get(c);
             h.put(c,x+1);
         }else{
             h.put(c,1);
         }
     }
     for(String x:h.keySet()){
         if(h.get(x)>1)
         return false;
     }
     return true;
    }
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      String a=sc.next();
      if(isIsogram(a))
      System.out.println("Yes");
      else
       System.out.println("No");
    }
}
