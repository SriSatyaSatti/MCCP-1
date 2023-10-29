import java.util.Scanner;
public class MyClass {
    static void encryption(int arr[],int n,int s){
        for(int i=0;i<n;i++){
            arr[i]=s-arr[i];
        }
}
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            s+=arr[i];
        }
        encryption(arr,n,s);
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}
