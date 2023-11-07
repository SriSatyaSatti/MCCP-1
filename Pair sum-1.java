//Two sum problem for unsorted data using brute force
import java.util.Scanner;

public class MyClass{
    static boolean search(int a[],int n,int x){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]+a[j]==x)
                   return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(search(a,n,k));
    }
}
