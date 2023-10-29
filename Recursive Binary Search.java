import java.util.Scanner;
public class MyClass {
    static int RecursiveBSearch(int arr[],int l,int u,int k){
        if(l<=u){
        int m=(l+u)/2;
        if(arr[m]==k)
        return m;
        else{
            if(arr[m]<k)
            return RecursiveBSearch(arr,m+1,u,k);
            else
            return RecursiveBSearch(arr,l,m-1,k);
        }
        }
        else
        return -1;
}
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int ans=RecursiveBSearch(arr,0,n,k);
        System.out.println(ans);
    }
}
