import java.util.Scanner;
public class HelloWorld
{
    public static void main(String [] args) {
        // Arithmetic Operators
        // + - * / % , ++ , --
        Scanner obj=new Scanner(System.in);
        System.out.println("NAME:");
        String name = obj.nextLine(); //read String
        System.out.println("MY NAME IS :"+name);
        System.out.println("Number");
        float number=obj.nextFloat();
        float result=number+10;
        System.out.println("Number:\t"+number +"\tResult:\t" + result);
        System.out.println("Input :");
        int num1 = obj.nextInt(); //read Int
        System.out.println("Input num1 :"+num1);
        int num2 = obj.nextInt();
        System.out.println("Input num2 :"+num2);

        int num = num1 + num2;
        System.out.println("Result\t"+num);
        
    }
}