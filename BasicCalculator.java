package Assignment2;
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Operation to Perform ");
        System.out.println("1-Subtraction"+" 2- Addition"+ " 3- division"+" 4- multiplication"+" 5- Modulus"+" 6 -Trignometric Fuctions");
        int Operation= sc.nextInt();
        if(Operation<=5)
        {
            Scanner input1 =new Scanner(System.in);
            System.out.println("enter first integer");
            int a= input1.nextInt();
            Scanner input2=new Scanner(System.in);
            System.out.println("enter second integer");
            int b = input2.nextInt();

            switch (Operation) {

                case 1:
                {
                    int c;
                    c = a - b;
                    System.out.println("the Subtraction of 2 numbers is " + c);
                    break;
                }
                case 2:
                {
                    int c;
                    c = a + b;
                    System.out.println("the Addition of 2 numbers is " + c);
                    break;
                }
                case 3:
                {
                    int c;
                    c = a/ b;
                    System.out.println("the division of 2 numbers is " + c);
                    break;
                }
                case 4:
                {
                    double c;
                    c = a * b;
                    System.out.println("the multiplication of 2 numbers is " + c);
                    break;
                }
                case 5:
                {
                    int c;
                    c = a % b;
                    System.out.println("the modulues of 2 numbers is " + c);
                    break;
                }
                default:
                    break;
            }
        }
        else if(Operation==6) {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("enter the Trignometric function");
            System.out.println(" 1 - sin" + "  2 - cos" + "  3 - tan" + " 4 - cot" + "5 - cosec " + "6 - sec");

            int aa = sc1.nextInt();
            Scanner sc2 = new Scanner(System.in);
            System.out.println("enter the degrees");
            double n = sc1.nextDouble();


            switch (aa) {
                case 1:
                    Double s = (Math.toRadians(Math.sin(n)));
                    System.out.println("the sin of " + n + " is " + s);
                    break;
                case 2:
                    Double c = (Math.toRadians(Math.cos(n)));
                    System.out.println("the cos of " + n + " is " + c);
                    break;
                case 3:
                    Double t = (Math.toRadians(Math.tan(n)));
                    System.out.println("the tan of " + n + " is " + t);
                    break;
                case 4:
                    Double co = (Math.toRadians(Math.cos(n) / Math.sin(n)));
                    System.out.println("the cot of " + n + " is " + co);
                    break;
                case 5:
                    Double cose=    1/Math.toRadians(Math.sin(n));
                    System.out.println("the cosec of " + n + "is"+ cose);
                    break;
                case 6:
                    Double se=1/Math.toRadians(Math.cos(n));
                    System.out.println("the sec of " + n + "is"+ se);
                    break;6


                default:
                    break;


            }
        }
        else{
            System.out.println("you have entered the wrong number");

        }
    }


}
