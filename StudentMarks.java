 import java.util.Scanner;

    public class StudentMarks

    {

        public static void main(String[] args) 

        {

            int n, total = 0;
 	    float percentage;
            Scanner s = new Scanner(System.in);

            System.out.print("Enter no. of subject:");

            n = s.nextInt();

            int marks[] = new int[n];

            System.out.println("Enter marks out of 100:");

            for(int i = 0; i < n; i++)

            {

                marks[i] = s.nextInt();

                total = total + marks[i];

            }

            percentage = (total / (float) (n*100))*100;

            System.out.println("Sum:"+total);

            System.out.println("Percentage:"+percentage);

        }

    }
