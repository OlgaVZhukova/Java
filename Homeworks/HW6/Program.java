package Homeworks.HW6;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);

        int rows = RequestValidation.inputNum("Введите количество строк поля. ", iScanner);
        int columns = RequestValidation.inputNum("Введите количество столбцов поля. ", iScanner);
        int walls = RequestValidation.inputNum("Введите количество стен. ", iScanner);
        while (!RequestValidation.numberWalls(rows, columns, walls)) {
            System.out.println("Количество стен превышает количество ячеек.");
            System.out.printf("Количество стен должно быть в диапазоне от 0 до %d.\n", rows * columns - 2);
            walls = RequestValidation.inputNum("Введите количество стен: ", iScanner);
        }

        int startRow = RequestValidation.inputNum("Введите индекс строки старта. ", iScanner);
        while (!RequestValidation.isRigthIndex(startRow, rows)) {
            System.out.println("Номер строки не может быть больше количества строк.");
            System.out.printf("Введите число от 1 до %d.\n", rows);
            startRow = RequestValidation.inputNum("Введите номер строки: ", iScanner);
        }

        int startColumn = RequestValidation.inputNum("Введите индекс столбца старта. ", iScanner);
        while (!RequestValidation.isRigthIndex(startColumn, columns)) {
            System.out.println("Номер столбца не может быть больше количества столбцов.");
            System.out.printf("Введите число от 1 до %d.\n", columns);
            startColumn = RequestValidation.inputNum("Введите номер столбца: ", iScanner);
        }

        int finishRow = RequestValidation.inputNum("Введите индекс строки финиша. ", iScanner);
        while (!RequestValidation.isRigthIndex(finishRow, rows)) {
            System.out.println("Номер строки не может быть больше количества строк.");
            System.out.printf("Введите число от 1 до %d.\n", rows);
            finishRow = RequestValidation.inputNum("Введите номер строки: ", iScanner);
        }

        int finishColumn = RequestValidation.inputNum("Введите индекс столбца финиша. ", iScanner);
        while (!RequestValidation.isRigthIndex(finishColumn, columns)) {
            System.out.println("Номер столбца не может быть больше количества столбцов.");
            System.out.printf("Введите число от 1 до %d.\n", rows);
            finishColumn = RequestValidation.inputNum("Введите номер столбца: ", iScanner);
        }

        iScanner.close();

        int[][] field = Methods.createField(rows, columns);
        Methods.buildingWalls(field, walls);

        field[startRow][startColumn] = 1;
        field[finishRow][finishColumn] = -2;

        int[] finish = new int[]{finishRow, finishColumn};

        int step = Methods.drawRoutes(field);
        System.out.println();

        if (RequestValidation.isRoute(field, finish)) {
            int[][] coordinates = Methods.writingRoute(field, finish, step);
            Methods.ReverseArray(coordinates);
            System.out.println();
            System.out.println("Пошаговый маршрут c координатами каждой точки: ");
            Methods.show2dArrayWith2Col(coordinates);
            System.out.println();
            Methods.elementsColoring(field, coordinates);
        } else {
            CommonMethods.show2dArray(field);
            System.out.println("Построить маршрут невозможно.");
        }
    }

}