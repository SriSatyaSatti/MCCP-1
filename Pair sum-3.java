//Two sum problem for unsorted data return values
import java.util.Scanner;

public class MyClass{
    static int[] search(int a[],int n,int x){
        int t[]=new int[2];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]+a[j]==x){
                   t[0]=a[i];
                   t[1]=a[j];
                }
            }
        }
        return t;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int t[]=new int[2];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        t=search(a,n,k);
        System.out.println(t[0]+" "+t[1]);
    }
}
