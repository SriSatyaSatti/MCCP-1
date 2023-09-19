// Find first element that is repeated k times
import java.util.*;
public class MyClass {
    static ArrayList<Integer> KFreq(int arr[],int n,int k){
     HashMap<Integer,Integer> h=new HashMap<>();
     ArrayList<Integer> c=new ArrayList<>();
     for(int i=0;i<n;i++){
         if(h.containsKey(arr[i])){
             int x=h.get(arr[i]);
             h.put(arr[i],x+1);
         }else{
             h.put(arr[i],1);
         }
     }
     for(Integer x:h.keySet()){
         if(h.get(x)==k)
         c.add(x);
     }
     if(c.size()==0)
     c.add(-1);
     return c;
    }
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int k=sc.nextInt();
      ArrayList<Integer> t=new ArrayList<>();
      int a[]=new int[n];
      for(int i=0;i<n;i++){
          a[i]=sc.nextInt();
      }
      t=KFreq(a,n,k);
      for(Integer x:t)
      System.out.print(x+" ");
    }
}
