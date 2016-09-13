package DataAnalysis;
import java.util.Arrays;
import java.util.Scanner;

public class Data {

    public static void main(String[] args) {

        //Getting the input from the user - Array Length
        System.out.println("Please input the total number of data items: ");
        Scanner sc = new Scanner(System.in);
        int arrLen = sc.nextInt();

        int arrData[] = new int[arrLen];

        //Getting the input from the user - Array values
        for (int i = 0; i < arrData.length; i++)
        {
            System.out.println("Please input " + i + "th item: ");
            arrData[i] = sc.nextInt();
        }

        //Calculating the mean
        int sum = 0;
        for(int i=0; i < arrData.length; i++ )
        {
            sum = sum + arrData[i];
        }

        int arrMean = sum/arrData.length;


        //Calculating the min and max
        Arrays.sort(arrData);
        int arrMin = arrData[0];
        int arrMax = arrData[arrLen-1];

        //Printing the output
        for (int i = 0; i < arrData.length; i++)
        {
            System.out.println( "In the sorted array ");
            System.out.println(  i + "th item is : " + arrData[i]);
        }

        System.out.println("Mean of the numbers is : " +arrMean);
        System.out.println("Min number in the array is : " + arrMin);
        System.out.println("Max number in the array is : " + arrMax);

    }




}

