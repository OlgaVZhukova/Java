package Homeworks.HW2;


import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;


public class Task {
    public static void main(String[] args) {
        try {
            File file = new File("input.txt");

            if(!file.exists())
                file.createNewFile();
            
            PrintWriter pw = new PrintWriter(file);
            pw.println("b 3");
            pw.println("a 10");
            pw.close();

        } catch (IOException e) {
            System.out.print("Error: " + e);
        }
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Введите число a: ");
        double a = Scanner.nextDouble();
        System.out.println("Введите число b: ");
        double b = Scanner.nextDouble();
        Scanner.close();

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
            System.out.println(resultNegativeDegree);
        }
    }
}

