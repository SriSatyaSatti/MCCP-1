     //Find the missing term in arithmetic sequence using binary search
      import java.util.Scanner;
      public class MyClass {
            static int seq(int a[], int n) {
                int d = (a[n - 1] - a[0]) / n;
                int l = 0, h = n - 1;
                while (l <= h) {
                    int m = (l + h) / 2;
                    if (a[m] - a[m - 1] != d)
                        return a[m] - d;
                    else if (a[m + 1] - a[m] != d)
                        return a[m] + d;
                    else if ((a[m] - a[0]) != m * d)
                        h = m - 1;
                    else
                        l = m + 1;
                }
                return -1;
            }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(seq(a,n));
    }
}
