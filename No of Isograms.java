// Array of Strings
// Given an array arr[] containing N strings, the task is to find the count of strings which are isograms. A string is an isogram if no letter in that string appears more than once.

// Examples:

// Input: arr[] = {“abcd”, “derg”, “erty”}
// Output: 3
// Explanation: All given strings are isograms. In all the strings no character 
// is present more than once. Hence count is 3

// Input: arr[] = {“agka”, “lkmn”}
// Output: 1
// Explanation: Only string “lkmn” is isogram. In the string “agka” 
// the character ‘a’ is present twice. Hence count is 1.

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
      int n=sc.nextInt();
      int c=0;
      for(int i=0;i<n;i++){
      String a=sc.nextLine();
      if(isIsogram(a))
      c++;
      }
      System.out.println(c);
    }
}
