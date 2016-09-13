package Temperature;
import java.util.Scanner;


public class FahrenheitToCelsius {

    public static void main(String[] args) {
        //Getting the input from the user
        System.out.println("Please input temperature in Fahrenheit : ");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        //Conversion logic
        double fahrenheit = Double.valueOf(line);
        double celsius =  5.00 * ( fahrenheit - 32.00 ) / 9.00;
        //Output the formatted temperature to the user
        System.out.println("The temperature in Celsius is :  " + String.format("%.2f", celsius));
    }
}
