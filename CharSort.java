import java.util.Arrays;
import java.util.Scanner;

public class CharSort{
		public static void main (String[] args){
		Scanner scanner=new Scanner (System.in);
		System.out.println("Enter the strings:");
		String str=scanner.nextLine();
		
		char[] chars=str.toCharArray();
		
		Arrays.sort(chars);
		String sorted=new String(chars);
		
		System.out.println("\n sorted characters of the strng:"+ sorted);
		scanner.close();
}
}
