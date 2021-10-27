import java.util.Scanner;
import java.util.SortedMap;

public class Q8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the amount of precipitation that has fallen in January");
        double j= input.nextDouble();
        System.out.println("Please enter the amount of precipitation that has fallen in February");
        double f= input.nextDouble();
        System.out.println("Please enter the amount of precipitation that has fallen in March");
        double m= input.nextDouble();
        double avr=(m+j+f)/3;
        System.out.println("The amount of precipitation that has fallen in 3 months is: "+avr);
        if(avr>100)
            System.out.println("Very rainy"+"\n:)");

    }
}
