// Count characters in a string whose ASCII values are prime
// Given a string S. The task is to count and print the number of characters in the string whose ASCII values are prime.

// Examples: 

// Input: S = “geeksforgeeks” 
// Output : 3 
// ‘g’, ‘e’ and ‘k’ are the only characters whose ASCII values are prime i.e. 103, 101 and 107 respectively.

// Input: S = “abcdefghijklmnopqrstuvwxyz” 
// Output: 6
import java.util.*;
import java.util.Scanner;
public class MyClass{
    static boolean isPrime(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0)
            return false;
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int c=0;
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<s.length();i++){
            h.add((int)s.charAt(i));
        }
        for(Integer i:h){
            if(isPrime(i))
            c++;
        }
        System.out.println(c);
    }
}
