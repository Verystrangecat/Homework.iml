import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the amount of packs of chocolate that the owner bought:");
        int b= input.nextInt();
        System.out.println("Please enter the amount of packs of chocolate that the owner sold:");
        int s=input.nextInt();
        int m1=b*5;
        int m2=s*10;
        if(m2-m1<0)
            System.out.println("He lost money");
        if(m2-m1>0)
            System.out.println("He got money");
        if(m2-m1==0)
            System.out.println("Nothing changed");
    }
}
