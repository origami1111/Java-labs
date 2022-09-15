
public class Program {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();

        matrix.enterMatrixSize();
        matrix.fillMatrix();
        System.out.println();
        matrix.printMatrix();

        try {
            System.out.println("Максимальное число среди парных элементов на главной диагонале = " + matrix.printMaxPairMainDiagonal());
        }
        catch (IllegalArgumentException e){
            System.out.println("Ошибка: " + e);
        }
        finally {
            System. exit(0);
        }
    }
}
