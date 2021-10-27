import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the number of flowers:");
        int f= input.nextInt();
        int b=f/5;
        if (f%5==0)
            System.out.println("The amount of the bouquets is "+b);
        else
            System.out.println("The amount of the bouquets is "+(b+1));

    }
}
