// Average of ASCII values of characters of a given string
// Given a string, the task is to find the average of ASCII values of characters in the string.

// Examples:  

// Input: str =  "for"
// Output: 109
// 'f'= 102, 'o' = 111, 'r' = 114
// (102 + 111 + 114)/3 = 109 

// Input: str = "geeks" 
// Output: 105

import java.util.Scanner;
public class MyClass{
    static int ASCII(String s){
        int c=0;
        for(int i=0;i<s.length();i++){
            c+=s.charAt(i);
        }
        return c;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int k=ASCII(s);
        System.out.println(k/s.length());
    }
}
