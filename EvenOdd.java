//Segregate even and odd numbers such that even should come first followed by odd 
import java.util.*;
public class MyClass {
    static ArrayList<Integer> move(int a[],int n){
        ArrayList<Integer> t=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(a[i]%2==0)
            t.add(a[i]);
        }
        for(int i=0;i<n;i++){
            if(a[i]%2!=0)
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
