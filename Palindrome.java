import java.util.Scanner;
public class Palindrome
{
	public static void palindromeString(String str)
	{
		int n=str.length();
		int start=0;
		int length=1;
		int low,high;
		for(int i=1;i<n;i++)
		{
			low=i-1;
			high=i;
		while(low>=0 && high<n && str.charAt(low)==str.charAt(high))
		{
			if(high-low+1>length)
			{
				start=low;
				length=high-low+1;
			}
			low--;
			high++;
		}
		low=i-1;
		high=i+1;
		while(low>=0 && high<n && str.charAt(low)==str.charAt(high))
		{
			if(high-low+1>length)
			{
				start=low;
				length=high-low+1;
			}
			low--;
			high++;
		}
		}
		print(str,start,start+length-1);
	}
	public static void print(String str,int s,int l)
	{
		System.out.println(str.substring(s,l+1));
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=sc.next();
		System.out.println("Longest SubString Palindrome:");
		palindromeString(str);
	}
}
