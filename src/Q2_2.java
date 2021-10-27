import java.util.Scanner;

public class Q2_2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter two numbers:");
        int n1= input.nextInt();
        int n2= input.nextInt();
        if(n1%n2==0)
            System.out.println("Can be divided without leftovers");
        else
            System.out.println("Can't be divided without leftovers");
    }
}
