// Count and Print the alphabets having ASCII value in the range [l, r]
// Given a string str, the task is to count the number of alphabets having ASCII in the range [l, r].

// Examples: 

// Input: str = "geeksforgeeks"
//         l = 102, r = 111
// Output: Count = 6, Characters = g, f, k, o
// Characters - g, f, k, o have ascii values in the range [102, 111].

// Input: str = "GeEkS"
//         l = 80, r = 111
// Output: Count = 3, Characters = e, k, S

import java.util.Scanner;
public class MyClass{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int l=sc.nextInt();
        int u=sc.nextInt();
        int c=0;
        for(int i=0;i<s.length();i++){
        int k=s.charAt(i);
        if(k>=l && k<=u)
        c++;
        }
        System.out.println(c);
    }
}
