import java.io.*;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner ob=new Scanner(System.in);
	    String S,rev="";
	    S=ob.nextLine();
	    int len=S.length();
	    for(int i=0;i<len;i++)
	    {
	        char y=S.charAt(i);
	        rev=y+rev;
	    }
	    if(rev.equals(S))
	    System.out.println("YES");
	    else
	    System.out.println("NO");
	 }
}
