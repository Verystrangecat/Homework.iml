import java.util.Scanner;
public class Q2_1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number:");
        int n= input.nextInt();
        if(n%2==0)
            System.out.println("The number is even");
        else
            System.out.println("The number is odd");
    }
}
