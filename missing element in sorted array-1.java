//Find Smallest Missing element from sorted array using Brute force - linear search
import java.util.*;
public class MyClass {
    static int small(int a[], int n) {
        for (int i = 0; i < n; i++) {
            if (a[i] != i)
                return i;
        }
        return n;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(small(a,n));
    }
}
