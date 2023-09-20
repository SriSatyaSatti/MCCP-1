//Find first repeated element in given array of elements

import java.util.*;
public class MyClass {
    static int firstRepeated(int arr[],int n){
     HashMap<Integer,Integer> h=new HashMap<>();
     for(int i=0;i<n;i++){
         if(h.containsKey(arr[i])){
             int x=h.get(arr[i]);
             h.put(arr[i],x+1);
         }else{
             h.put(arr[i],1);
         }
     }
     for(int i=0;i<n;i++){
         if(h.get(arr[i])>1)
         return i;
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
      t=firstRepeated(a,n);
      System.out.print(t);
    }
}
