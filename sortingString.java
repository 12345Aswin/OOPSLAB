import java.util.Arrays;
import java.util.Scanner;

public class sortingString{
		public static void main (String[] args){
		Scanner scanner=new Scanner (System.in);
		System.out.println("\nEnter the number of strings : \n");
		int nos=scanner.nextInt();
		scanner.nextLine();
		String[] strings=new String[nos];
		System.out.println("\n Enter the strings:\n");
		
		for(int i=0;i<nos;i++){
			strings[i]=scanner.nextLine();
				}
		Arrays.sort(strings);
		System.out.println("\nsorted string\n");
		for(String str:strings){
		System.out.println(str);
		}
		scanner.close();	
}
}	
