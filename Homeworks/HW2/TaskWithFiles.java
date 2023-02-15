package Homeworks.HW2;

import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
//import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class TaskWithFiles {
    public static void main(String[] args) {
        //BufferedReader br = null;
        try {
            File file = new File("input.txt");

            if(!file.exists())
                file.createNewFile();
            
            PrintWriter pw = new PrintWriter(file);
            pw.println("2 3");
            //pw.println("3");
            pw.close();

            //double a;
            //double b;
            //br = new BufferedReader(new FileReader("input.txt"));
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
        } catch (IOException e) {
            System.out.print("Error: " + e);
        } /*finally {
            try {
                br.close();
            } catch (IOException e) {
            System.out.print("Error: " + e);
            }*/
        }
        //Scanner Scanner = new Scanner(System.in);
        //System.out.println("Введите число a: ");
        //double a = Scanner.nextDouble();
        //System.out.println("Введите число b: ");
        //double b = Scanner.nextDouble();
        //Scanner.close();

        /*double result = a;
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
            System.out.println(resultNegativeDegree);
        }*/
}
