//Find the intersection of two unsorted arrays using sorting and binary search
import java.util.Scanner;
import java.util.*;
                        public class MyClass {
                            static boolean bsearch(int a[], int n,int k) {
                                int l = 0, h = n - 1;
                                while (l <= h) {
                                    int m = (l + h) / 2;
                                    if (a[m] == k)
                                        return true;
                                    else if (a[m] < k)
                                        l = m + 1;
                                    else
                                        h = m - 1;
                                }
                                return false;
                            }
    static Set<Integer> intersection(int a[],int b[],int m,int n){
        Set<Integer> s = new HashSet<>();
        Arrays.sort(b);
        for(int i=0;i<m;i++){
            if(bsearch(b,n,a[i]));
            s.add(a[i]);
        }
        return s;
    }
        public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Set<Integer> s = new HashSet<>();
        int m=sc.nextInt();
        int a[]=new int[m];
        int n=sc.nextInt();
        int b[]=new int[n];
        for(int i=0;i<m;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        s=intersection(a,b,m,n);
        for(Integer i:s){
            System.out.println(i);
        }
    }
}
