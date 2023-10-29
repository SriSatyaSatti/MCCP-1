// Check if an array contains only one distinct element
// Given an array arr[] of size N, the task is to check if the array contains only one distinct element or not. If it contains only one distinct element then print “Yes”, otherwise print “No”.

// Examples:

// Input: arr[] = {3, 3, 4, 3, 3} 
// Output: No  
// Explanation: 
// There are 2 distinct elements present in the array {3, 4}. 
// Therefore, the output is No.

// Input: arr[] = {9, 9, 9, 9, 9, 9, 9} 
// Output: Yes 
// Explanation: 
// The only distinct element in the array is 9. 
// Therefore, the output is Yes.
import java.util.Scanner;
public class MyClass{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        a[0]=sc.nextInt();
        for(int i=1;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]!=a[0]){
            System.out.println("False");
            return;
            }
        }
        System.out.println("True");
    }
}
