package day2.arrays;

import java.util.Scanner;

public class FindingAverageHighestLowest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Enter number of grades:");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        System.out.println("Enter the values");
        double[] grades = new double[count];
        double sum = 0.0;
        double avg = 0.0;
        double max,min;
        for (int i = 0; i < count; i++)
        {
            grades[i] = scanner.nextDouble();
        }
        for(double num:grades)
        {
            sum = sum + num;
        }
        avg = sum/count;
        System.out.println("Sum = "+sum);
        System.out.println("Average = "+avg);

        max = grades[0];
        for(int i = 0; i < count; i++)
        {
            if(max < grades[i])
            {
                max = grades[i];
            }
        }
        System.out.println("Maximum value:"+max);

        min = grades[0];
        for(int i = 0; i < count; i++)
        {
            if(min > grades[i])
            {
                min = grades[i];
            }
        }
        System.out.println("Minimum value:"+min);
    }
}
