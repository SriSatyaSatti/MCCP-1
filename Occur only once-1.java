//Find the single element that occurs only once in the sorted array using Linear Search
    import java.util.Scanner;
    public class MyClass {
                static int once(int a[], int n) {
                    for (int i = 1; i < n; i += 2) {
                        if (a[i - 1] != a[i])
                            return a[i - 1];
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
        System.out.println(once(a,n));
    }
}
