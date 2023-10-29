import java.util.Scanner;
public class MyClass {
    static int IterativeBSearch(int arr[],int n,int k){
        int l=0,u=n;
        while(l<u){
            int m=(l+u)/2;
            if(arr[m]==k)
            return m;
            else{
                if(arr[m]<m)
                l=m+1;
                else
                u=m-1;
            }
        }
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
        int ans=IterativeBSearch(arr,n,k);
        System.out.println(ans);
    }
}
