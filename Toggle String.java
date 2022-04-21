import java.io.*;
import java.util.Scanner;
public class Main
{
    public static void main(String[]args)
    {
        Scanner ob=new Scanner(System.in);
        String s=ob.nextLine(),change="";
        int len=s.length();
        for(int i=0;i<len;i++)
        {
            char ch=s.charAt(i);
            if((ch>='A')&&(ch<='Z'))
            change=change+(char)(ch+32);
            else if((ch>='a')&&(ch<='z'))
            change=change+(char)(ch-32);
            else
            change=change+ch;
        }
        System.out.println(change);
    }
}
