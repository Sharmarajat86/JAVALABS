import java.util.Scanner;

public class LAB09 {

    public static void main(String[] args) {
        int number1;
        int number2;
        //char ch;

        System.out.println("Enter a number1");
        Scanner sc = new Scanner(System.in);
        number1 = sc.nextInt();
        System.out.println("Enter a number2");
        Scanner sc1 = new Scanner(System.in);
        number2 = sc1.nextInt();

        System.out.println("Choose any char, As which an operator you need perform an action");
        Scanner sc3 = new Scanner(System.in);
        char ch = sc3.next().charAt(0);
        int result;

        switch (ch) {
            case '+':
                result = number1 + number2;
                System.out.println("Result sum is " + result);
                break;

            case '-':
                result = number1 - number2;
                System.out.println("Result sum is " + result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println("Result sum is " + result);
                break;

            case '%':
                result = number1 % number2;
                System.out.println("Result sum is " + result);
                break;

            case '/':
                result = number1 / number2;
                System.out.println("Result sum is " + result);
                break;

            default:
            System.out.println("Select correct operator!!!");




        }


    }
}
