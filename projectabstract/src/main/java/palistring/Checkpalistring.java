package palistring;

public class Checkpalistring {
	public static boolean checkpali(String text)
	{
	String rev=text.toLowerCase();
	int left=0;
	int right=rev.length()-1;
		if(text==null)
		{
			return false;
		}
	while(left<right)
	{
		if(rev.charAt(left)!=rev.charAt(right))
		{
			return false;
		}
	left++;
	right--;
	}
	return true;
	}
	public static void printpali(String str)
	{
		
		if(checkpali(str))
		{
			System.out.println("\""+str+"  String is Palindrome");
		}
		else
		{
			System.out.println("\""+str+"  String is not palindome");
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="Java";
String s2="Malayalam";
printpali(s1);
printpali(s2);

	}}


