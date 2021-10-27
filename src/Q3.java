import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the year:");
        int y= input.nextInt();
        if(y%4==0)
            System.out.println("There are 29 days in the February");
        else
            System.out.println("There are 28 days in the February");
    }
}
