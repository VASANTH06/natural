import java.io.*;
import java.util.*;
class Natural
{
 public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sum=0;
        int a=scan.nextInt();
        int b[]=new int[a];
        for(int i=0;i<a;i++)
        {
            b[i]=scan.nextInt();
            if(b[i]>0)
            {
                sum=sum+b[i];
            }
        }
        System.out.println(sum);
        
    }
    

}
