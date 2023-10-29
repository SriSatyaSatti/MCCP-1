// Count of Palindrome Strings in given Array of strings
// Given an array of strings arr[] of size N where each string consists only of lowercase English letter. The task is to return the count of all palindromic string in the array.

// Examples:

// Input: arr[] = {“abc”,”car”,”ada”,”racecar”,”cool”}
// Output: 2
// Explanation: “ada” and “racecar” are the two palindrome strings.

// Input: arr[] = {“def”,”aba”}
// Output: 1
// Explanation: “aba” is the only palindrome string.
import java.util.Scanner;
public class MyClass{
    static boolean isPalindrome(String k){
        StringBuffer t=new StringBuffer(k);
        t.reverse();
        if(k.equals(t.toString()))
        return true;
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        for(int i=0;i<n;i++){
            if(isPalindrome(sc.next()))
            c++;
        }
        System.out.println(c);
    }
}
