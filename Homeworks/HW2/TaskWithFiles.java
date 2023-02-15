package Homeworks.HW2;

import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Arrays;

public class TaskWithFiles {
    public static void main(String[] args) {
        try {
            File file = new File("input.txt");

            if(!file.exists())
                file.createNewFile();
            
            PrintWriter pw = new PrintWriter(file);
            pw.println("2 -2");
            pw.close();

            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");
            int[] numbers = new int[2];
            int counter = 0;
            
            for (String number : numbersString) {
                numbers[counter++] = Integer.parseInt(number);
            }
            System.out.println(Arrays.toString(numbers));
            scanner.close();
            double a = numbers[0];
            double b = numbers[1];
            double result = a;
            for (int i = 1; i < b; i++){
                result = result * a;
            }
            if (b > 0){
                System.out.println(result);
            }
            else if (b == 0){
                result = 1;
                System.out.println(result);
            }
            else {
                double resultNegativeDegree = 0;
                for (int i = 1; i < b *-1; i++){
                    result = result * a;
            }
            resultNegativeDegree = 1/result;
            System.out.println(resultNegativeDegree);}
        } catch (IOException e) {
            System.out.print("Error: " + e);
        }
    }
}

