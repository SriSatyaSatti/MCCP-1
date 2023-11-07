// Two sum problem for sorted data and two pointer
import java.util.Scanner;
public class MyClass {
    static boolean search(int a[], int n, int x) {
        int l = 0, h = n - 1;
        while (l < h) {
            int k = a[l] + a[h];
            if (k == x)
                return true;
            else if (k < x)
                l++;
            else
                h--;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(search(a, n, k));
    }
}
