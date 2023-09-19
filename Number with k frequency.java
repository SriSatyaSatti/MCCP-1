// Find first element that is repeated k times
import java.util.*;
public class MyClass {
    static int KFreq(int arr[],int n,int k){
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
         if(h.get(arr[i])==k)
         return arr[i];
     }
     return -1;
    }
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int k=sc.nextInt();
      int t;
      int a[]=new int[n];
      for(int i=0;i<n;i++){
          a[i]=sc.nextInt();
      }
      t=KFreq(a,n,k);
      System.out.print(t);
    }
}
