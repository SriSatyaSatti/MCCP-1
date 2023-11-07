//Two sum problem for unsorted data using hashmap

import java.util.Scanner;
import java.util.*;
public class MyClass{
    static boolean search(int a[],int n,int x){
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<n;i++){
            int t=a[i]-x;
            if(h.containsKey(t))
            return true;
            h.put(a[i],i);
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(search(a,n,k));
    }
}
