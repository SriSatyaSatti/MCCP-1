// Print all words occurring in a sentence exactly K times
// Given a string S consisting of lowercase alphabets and an integer K, the task is to print all the words that occur K times in the string S.

// Examples:

// Input: S = “banana is in yellow and sun flower is also in yellow”, K = 2
// Output: “is” “yellow” “in”
// Explanation: The words “is”, “yellow” and “in” occurs in the string twice. 

// Input: S = “geeks for geeks”, K = 2
// Output: “geeks”
import java.util.Scanner;
import java.util.*;
public class MyClass{
    public static void main(String[] args){
        HashMap<String,Integer> h=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int K=sc.nextInt();
        String[] k=s.split(" ");
        for(int i=0;i<k.length;i++){
            if(h.containsKey(k[i])){
                int c=h.get(k[i]);
                h.put(k[i],c+1);
            }
            else{
                h.put(k[i],1);
            }
        }
        for(String a:h.keySet()){
            if(h.get(a)==K)
            System.out.println(a);
        }
        
    }
}
