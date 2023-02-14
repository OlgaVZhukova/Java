package Homeworks.HW2;

import java.util.Scanner;

public class task {
    public static void main(String[] args) {
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
                //System.out.println(result);
                System.out.println(result);
            }
            else {
                double temp = 0;
                for (int i = 1; i < b *-1; i++){
                    result = result * a;
                //System.out.printf("Число %d в степени %d равняется %f", a, b, z);
            }
            temp = 1/result;
            System.out.println(1/result);
        }
    }
}

