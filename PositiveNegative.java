//2.Given array of n elements,move all positive elements to beginning and all negative elements to end
//But order of input array should be followed
import java.util.*;
public class MyClass {
    static ArrayList<Integer> move(int a[],int n){
        ArrayList<Integer> t=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(a[i]>=0)
            t.add(a[i]);
        }
        for(int i=0;i<n;i++){
            if(a[i]<0)
            t.add(a[i]);
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
      t=move(a,n);
      for(Integer x:t){
          System.out.println(x+" ");
      }
    }
}
