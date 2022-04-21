import java.io.*;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner ob=new Scanner(System.in);
	    String str="";
	    str=ob.nextLine();
	    int x=0,y=0;
	    int len=str.length();
	    for(int i=0;i<len;i++)
	    {
	        char ch=str.charAt(i);
	        if(ch=='z')
	        x=x+1;
	        else if(ch=='o')
	        y=y+1;
	    }
	    if(2*x==y)
	    System.out.println("Yes");
	    else
	    System.out.println("No");
	}
}
