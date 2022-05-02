import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		int length=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
                String s = sc.next();
                for (char c1 : s.toCharArray()) 
			length++;
		System.out.println("Length of String is : "+length);
		
	}

} 