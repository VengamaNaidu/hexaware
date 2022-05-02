import java.util.Scanner;
public class ReverseString 
{
    public static void main(String[] args) 
    {
    	String r = ""; 

   	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the String : ");
   	String s = sc.next(); 

    	for(int i= s.length() - 1;i>=0;i--) 
    	{
        r = r + s.charAt(i);
    	}
    	System.out.println("Reverse String is : " +r);

    	if(r.equals(s)) 
    	{
        System.out.println("Reverse String is a palindrome");
    	}
    	else 
   	{
        System.out.println("Reverse String is Not a palindrome");
    	}
    }
}
