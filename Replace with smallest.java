import java.util.Scanner;
public class MyClass {
    static void replace(int arr[],int n){
    int min=arr[0];
    arr[0]=0;
    for(int i=1;i<n;i++){
        int t=arr[i];
        arr[i]=min;
        min=Math.min(min,t);
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
