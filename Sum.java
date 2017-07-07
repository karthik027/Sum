# Sum
import java.io.*;
import java.util.*;
public class Sum
{
public static void main(String args[])
{
int n,sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the numbers");
n=sc.nextInt();
for(int i=1;i<=n;i++)
{
sum=sum+i;
i++;
}
System.out.println(i);
}
}
