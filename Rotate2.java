//Cyclically rotate array by one using 3 techniques
import java.util.*;
public class MyClass {
    static int[] rotate(int arr[],int n){
        int t=arr[n-1];
         for(int i=n-1;i>0;i--){
             arr[i]=arr[i-1];
         }
         arr[0]=t;
         return arr;
    }
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++){
          a[i]=sc.nextInt();
      }
      a=rotate(a,n);
      for(int i=0;i<n;i++)
      System.out.print(a[i]+" ");
    }
}
