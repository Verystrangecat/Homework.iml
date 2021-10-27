import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the number of children:");
        int c= input.nextInt();
        int m=c/10;
        if(c%10==0)
            System.out.println("The amount of madrihim is "+m );
        else
            System.out.println("The amount of madrihim is "+(m+1));
    }
}
