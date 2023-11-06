    //Find the single element that occurs only once in the sorted array using XOR Operator
    import java.util.Scanner;
    public class MyClass {
        static int once(int a[], int n) {
            int ans = 0;
            for (int i = 0; i < n; i++) {
                ans = ans ^ a[i];
            }
            return ans;
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
