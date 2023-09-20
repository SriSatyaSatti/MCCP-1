//Given array of n+2 elements between 1 to n
//All elements occur only once except 2
//Find those 2 repeated elements
import java.util.*;
public class MyClass {
    static ArrayList<Integer> KFreq(int arr[],int n){
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
         if(h.get(x)>1)
         c.add(x);
     }
     if(c.size()==0)
     c.add(-1);
     return c;
    }
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      ArrayList<Integer> t=new ArrayList<>();
      int a[]=new int[n];
      for(int i=0;i<n;i++){
          a[i]=sc.nextInt();
      }
      t=KFreq(a,n);
      for(Integer x:t)
      System.out.print(x+" ");
    }
}
