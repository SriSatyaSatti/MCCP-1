//Find maximum repeating number in array of n elements
import java.util.*;
public class MyClass {
    static int highestFreq(int arr[],int n){
     HashMap<Integer,Integer> h=new HashMap<>();
     for(int i=0;i<n;i++){
         if(h.containsKey(arr[i])){
             int x=h.get(arr[i]);
             h.put(arr[i],x+1);
         }else{
             h.put(arr[i],1);
         }
     }
     int m=0;
     for(int i=0;i<n;i++){
         m=Math.max(m,h.get(arr[i]));
     }
     for(Integer x:h.keySet()){
         if(h.get(x)==m)
         return x;
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
      t=highestFreq(a,n);
      System.out.print(t);
    }
}
