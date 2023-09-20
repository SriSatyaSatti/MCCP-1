//Rearrange array such that even positioned greater than odd(Index 1)
import java.util.*;
public class MyClass {
    static ArrayList<Integer> move(int a[],int n){
        Arrays.sort(a);
        ArrayList<Integer> t=new ArrayList<>();
        int l=0,r=n-1;
        while(l<r){
            t.add(a[l]);
            t.add(a[r]);
            l++;
            r--;
        }
        if(l==r)
        t.add(a[l]);
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
