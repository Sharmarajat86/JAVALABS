import java.util.Scanner;

public class LAB07
{
    public static void main(String[] args) {

        //Program to Check if a Number is Positive, Negative, or Zero.
        System.out.println("Enter Number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("NO. is " + num);
        if(num<0)
        {
            System.out.println("Negative number");
        }
        else if(num>0) {
            System.out.println("Positive number");
        }
        else
        {
            System.out.println("The Number is zero");
        }

    }
}
