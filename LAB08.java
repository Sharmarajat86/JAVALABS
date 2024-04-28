public class LAB08
{
    public static void main(String[] args)
    {

        //program to Find the Largest Among Three Numbers:
        int a = 22;
        int b = 12;
        int c = 23;


        System.out.println("The value of a " + a);
        System.out.println("The value of b " + b);
        System.out.println("The value of c " + c);

       int  max = (a > b) ?  (a > c ? a :c) : (b > c ? b: c);
        System.out.println(max);

        int max1 = (a > b) ? a: b;
        System.out.println(max1);

    }
}
