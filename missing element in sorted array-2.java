  //Find Smallest Missing element from sorted array using binary search
  import java.util.Scanner;
  public class MyClass {
        static int small(int a[], int n) {
            int l = 0, u = n - 1;
            while (l <= u) {
                int m = l + (u - l) / 2;
                if (a[m] == m)
                    l = m + 1;
                else
                    u = m - 1;
            }
            return l;
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
