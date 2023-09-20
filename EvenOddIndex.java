//Array of n elements contain exactly equal no of even and odd elements
//Rearrange array such that even numbers at even position and odd numbers at odd position

import java.util.*;
public class MyClass {
    static ArrayList<Integer> evenodd(int a[],int n){
        ArrayList<Integer> t1=new ArrayList<>();
        ArrayList<Integer> t2=new ArrayList<>();
        ArrayList<Integer> t=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(a[i]%2!=0)
            t1.add(a[i]);
        }
        for(int i=0;i<n;i++){
            if(a[i]%2==0)
            t2.add(a[i]);
        }
        int i=0;
        while(t.size()<n){
            t.add(t1.get(i));
            t.add(t2.get(i));
            i++;
        }
        return t;
    }
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      ArrayList<Integer> t=new ArrayList<>();
      int a[]=new int[n];
      for(int i=0;i<n;i++){
          a[i]=sc.nextInt();
      }
      t=evenodd(a,n);
      for(Integer x:t){
          System.out.println(x+" ");
      }
    }
}
