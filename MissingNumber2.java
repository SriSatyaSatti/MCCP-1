//Let n be array size and  Given array of n-1 elements in range of 1 to n
//There are no duplicates in array
import java.util.*;
public class MyClass {
    static int missing(int arr[],int n){
        HashMap<Integer,Integer> h=new HashMap<>();
         for(int i=0;i<n;i++){
            h.put(arr[i],1);
         }
         for(int i=0;i<n;i++){
             if(h.containsKey(i+1)==false)
             return i+1;
         }
         return -1;
    }
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int t;
      int a[]=new int[n];
      for(int i=0;i<n-1;i++){
          a[i]=sc.nextInt();
      }
      t=missing(a,n);
      System.out.print(t);
    }
}
