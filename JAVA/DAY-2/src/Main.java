public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        int a  =10;
        int b  =10;

        int A=a+b;
        int B=a-b;
        int C=a*b;
        int D=a/b;

        System.out.println("Sum of a and b is :" + A);
        System.out.println("Difference  of a and b is :" + B);
        System.out.println("Product of a and b is :" + C);
        System.out.println("Division of a and b is :" + D);


// use sout for System.out.println
        System.out.println("Taking Input");
        Scanner sc= new Scanner( System.in);
        System.out.print("Enter number1 :");
        int a=sc.nextInt();
        System.out.print("Enter number2 :");
       int b=sc.nextInt();
       int c=a+b;
        System.out.println("sum of the numbers :" + c);

    }
}