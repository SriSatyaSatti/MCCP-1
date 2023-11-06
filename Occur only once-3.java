//Find the single element that occurs only once in the sorted array using Binary search
import java.util.Scanner;
                    public class MyClass {
                        static int once(int a[], int n) {
                            int l = 0, h = n - 1;
                            while (l <= h) {
                                int m = (l + h) / 2;
                                if (m % 2 == 0) {
                                    if (a[m] != a[m + 1])
                                        h = m - 1;
                                    else
                                        l = m + 1;
                                } else if (m % 2 == 1) {
                                    if (a[m] != a[m - 1])
                                        h = m - 1;
                                    else
                                        l = m + 1;
                                }
                            }
                            return a[l];
                        }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(once(a,n));
    }
}
