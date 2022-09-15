import java.util.InputMismatchException;
import java.util.Scanner;

public class Matrix {
    private int n;
    private int[][] arr;
    private Scanner sc = new Scanner(System.in);

    public void enterMatrixSize(){
        System.out.print("Введите размер матрицы: ");
        n = sc.nextInt();

        arr = new int[n][n];
    }

    public void fillMatrix(){
        System.out.println("Заполните матрицу: ");

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print("Введите элемент a[" + i + "][" + j + "] = ");

                try {
                    arr[i][j] = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка: Ви ввели рядок замість числа");
                    System. exit(0); // принудительно завершаем работу программы
                }
            }
        }

        sc.close();
    }

    public void printMatrix(){
        System.out.println("Матрица: ");

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // виведення максимума серед парних чисел на головній діагоналі
    public int printMaxPairMainDiagonal(){
        boolean isPair = false;
        int max = arr[0][0];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if(i == j && arr[i][j] % 2 == 0){
                    isPair = true;

                    if(arr[i][j] > max){
                        max = arr[i][j];
                    }
                }
            }
        }

        if(isPair == false){
            throw new IllegalArgumentException("Нет парных чисел");
        }

        return max;
    }
}
