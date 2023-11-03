  //Find k closest elements to a given value in a sorted array
    import java.util.Scanner;
    import java.util.*;
      public class MyClass {
            static List<Integer> find(int a[], int n,int k,int x) {
                List<Integer> t = new ArrayList<>();
                int l = 0, h = n - 1;
                while ((h - l) >= k) {
                    if (Math.abs(a[l] - x) > Math.abs(a[h] - x))
                        l++;
                    else
                        h--;
                }
                for (int i = l; i <=h; i++) {
                    t.add(a[i]);
                }
                return t;
            }
                public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        List<Integer> t = new ArrayList<>();
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int x=sc.nextInt();
        t=find(a,n,k,x);
        for(Integer l:t){
            System.out.println(l);
        }
    }
}
