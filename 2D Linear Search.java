import java.util.Scanner;
public class MyClass {
    static boolean bsearch(int arr[][],int n,int k){
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(arr[i][j]==k)
            return true;
        }
    }
        return false;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int k=sc.nextInt();
        if(bsearch(arr,n,k))
        System.out.println("Found!");
        else
        System.out.println("Not Found!");
    }
}
