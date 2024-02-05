import java.util.Scanner;
class evod{
public static void main(String args[])
{

int n;
Scanner scanner=new Scanner(System.in);
System.out.println("Enter the number");
n=scanner.nextInt();
if(n%2==0){
System.out.println(n + "is Even");
}
else{
System.out.println(n + "is odd");
}
}
}
