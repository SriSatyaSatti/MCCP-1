import java.util.Scanner;
public class MyClass {
    static void replace(int arr[],int n){
    int max=arr[n-1];
    arr[n-1]=0;
    for(int i=n-2;i>=0;i--){
        int t=arr[i];
        arr[i]=max;
        max=Math.max(max,t);
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
