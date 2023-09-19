//Let n be array size and  Given array of n-1 elements in range of 1 to n
//There are no duplicates in array
import java.util.*;
public class MyClass {
    static int missing(int arr[],int n){
         for(int i=0;i<n;i++){
             if(arr[i]!=i && arr[i]!=0)
             return i;
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
      Arrays.sort(a);
      t=missing(a,n);
      System.out.print(t);
    }
}
