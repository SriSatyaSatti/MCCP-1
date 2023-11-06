//Find first and last index of given element in a sorted a array using brute force - linear search

import java.util.Scanner;

public class MyClass {
    static int[] find(int a[], int n, int x) {
        int k[] = { -1, -1 };
        for (int i = 0; i < n; i++) {
            if (a[i] == x && k[0] == -1) {
                k[0] = i;
            } else if (a[i] == x) {
                k[1] = i;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int ans[] = new int[2];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        ans = find(a, n, k);
        System.out.println(ans[0] + " " + ans[1]);
    }
}
