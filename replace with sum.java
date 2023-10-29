import java.util.Scanner;
public class MyClass {
    static void replace(int arr[],int n){
        int t[]=new int[n];
        t[0]=arr[0]+arr[1];
        t[n-1]=arr[n-1]+arr[n-2];
        for(int i=1;i<n-1;i++){
            t[i]=arr[i-1]+arr[i+1];
        }
        for(int i=0;i<n;i++){
            arr[i]=t[i];
        }
}
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        replace(arr,n);
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}
