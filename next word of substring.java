import java.util.Scanner;
import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        String[] list={"is","a","strong"};
        String s="Siddhu is a strong guy and he is a strong person";
        ArrayList<String> a=new ArrayList<>();
        int n=list.length,j;
        String k[]=s.split(" ");
        for(int i=0;i<k.length-n;i++){
            int t=i;
            for(j=0;j<n;j++){
                if(!list[j].equals(k[t++]))
                break;
            }
            if(j==n){
            i+=n;
            a.add(k[i]);
            }
        }
        System.out.println(a);
    }
}
