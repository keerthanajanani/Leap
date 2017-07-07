# Leap
import java.io.*;
import java.util.*;
public class Leap
{
public static void main(String args[])throws IOException
{
int n;
BufferedReader br=new Bufferedreader(new InputStreamReader(System.in));
Sytem.out.println("Enter the year");
n=Integer.parseInt(br.readLine());
if((n%4==0) || (n%==400))
{
Sytem.out.println("It is Leap year");
}
else
{
Sytem.out.println("It is not Leap year");
}
}
}

