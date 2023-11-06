// Find the missing term in arithmetic sequence using linear search
    import java.util.Scanner;
    public class MyClass {
        static int seq(int a[], int n) {
            int d = (a[n - 1] - a[0]) / n;
            for (int i = 1; i < n; i++) {
                if (a[i] - a[i - 1] != d)
                    return a[i - 1] + d;
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
