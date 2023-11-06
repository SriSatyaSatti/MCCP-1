//Find first and last index of given element in a sorted a array using binary search

import java.util.Scanner;
public class MyClass {
    static void find1(int a[],int n,int m,int x){
    int f=m;
    while(a[f]==x){
        if(f==0)
        break;
        f--;
    }
    if(a[f]!=x)
    f++;
    int l=m;
    while(a[l]==x){
        if(l==n-1)
        break;
        l++;
    }
    if(a[l]!=x)
    l--;
    System.out.println(f+" "+l);
  }
    static void find(int a[],int n,int x){
        int l=0,h=n-1;
        int res[]=new int[2];
        res[0]=-1;
        res[1]=-1;
        while(l<=h){
            int m=(l+h)/2;
            if(a[m]==x){
                find1(a,n,m,x);
                break;
            }
            else if(a[m]<x)
            l=m+1;
            else
            h=m-1;
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        find(a,n,k);
    }
}
