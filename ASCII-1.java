// Count the number of words having sum of ASCII values less than and greater than k
// Given a string, the task is to count the number of words whose sum of Ascii values is less than and greater than or equal to given k.

// Examples: 

// Input: str = "Learn how to code", k = 400
// Output:
// Number of words having sum of ascii less than k = 2
// Number of words having sum of ascii greater than or equal to k = 2

// Input: str = "Geeks for Geeks", k = 400
// Output:
// Number of words having sum of ascii less than k = 1
// Number of words having sum of ascii greater

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
        String str=sc.nextLine();
        String[] s=str.split(" ");
        int k=sc.nextInt();
        int c1=0,c2=0;
        for(int i=0;i<s.length;i++){
        int cal=ASCII(s[i]);
        if(cal<k)
        c1++;
        else
        c2++;
        }
        System.out.println(c1+" "+c2);
    }
}
