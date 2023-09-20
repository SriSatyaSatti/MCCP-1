//Find only repeating element in given array

import java.util.*;
public class MyClass {
    static int onlyRepeating(int arr[],int n){
     HashMap<Integer,Integer> h=new HashMap<>();
     for(int i=0;i<n;i++){
         if(h.containsKey(arr[i])){
             return arr[i];
         }else{
             h.put(arr[i],1);
         }
     }
     return -1;
    }
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int t;
      int a[]=new int[n];
      for(int i=0;i<n;i++){
          a[i]=sc.nextInt();
      }
      t=onlyRepeating(a,n);
      System.out.print(t);
    }
}
