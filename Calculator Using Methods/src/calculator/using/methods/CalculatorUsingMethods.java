package calculator.using.methods;
import java.util.Scanner;
public class CalculatorUsingMethods
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        float result = 0 , var1 , var2;
        int choice = 6;
        System.out.println("**********Calculator**********");
        while(choice != 0)
        {
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("0. Exit");
            System.out.println("------------------------------");
            System.out.print("Enter your Choice : ");
            System.out.println("------------------------------");
            choice = scan.nextInt();
            if(choice >=0 && choice <=4)
            {
                System.out.println("------------------------------");
                System.out.print("Enter First Number : ");
                var1 = scan.nextInt();
                System.out.print("Enter Second Number : ");
                var2 = scan.nextInt();
                switch(choice)
                {
                    case 1 ->                     {
                        result = addition(var1,var2);
                    }
                    case 2 ->                     {
                        result = subtraction(var1,var2);
                    }
                    case 3 ->                     {
                        result = multiplication(var1,var2);
                    }
                    case 4 ->                     {
                        if(var2!=0)
                        {
                            result = division(var1,var2);
                        }
                        else
                        {
                            System.out.println("Can't Divide by Zero!");
                        }
                    }
                    default -> {
                        System.out.println("You Entered Invalid Choice!");
                    }
                }
                System.out.println("Result of Calculation : " + result);
                System.out.println("------------------------------");
            }
        }
        System.out.println("------------------------------");
        System.out.println("***********Good Bye!**********");
        System.out.println("------------------------------");
    }
    public static float addition(float v1,float v2)
    {
        float result = v1+v2;
        return result;
    }
    public static float subtraction(float v1,float v2)
    {
        float result = v1-v2;
        return result;
    }
    public static float multiplication(float v1,float v2)
    {
        float result = v1*v2;
        return result;
    }
    public static float division(float v1,float v2)
    {
            float result = v1/v2;
            return result;  
    } 
}
