import java.util.Scanner;

public class Firma {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите количество сотрудников => ");
        int kol = sc.nextInt();
        sc.nextLine(); // очистка буфера после ввода числа

        Sotrudnik[] sotr = new Sotrudnik[kol];

        System.out.println("Введите информацию про каждого сотрудника: ");
        for (int i = 0; i < sotr.length; i++){
            sotr[i] = new Sotrudnik();

            System.out.println("Введите фамилию " + (i+1) + " сотрудника => ");
            sotr[i].fam = sc.nextLine();

            System.out.println("Введите имя " + (i+1) + " сотрудника => ");
            sotr[i].im = sc.nextLine();

            System.out.println("Введите отчество " + (i+1) + " сотрудника => ");
            sotr[i].otch = sc.nextLine();

            System.out.println("Введите должность " + (i+1) + " сотрудника => ");
            sotr[i].doljnost = sc.nextLine();

            System.out.println("Введите оклад " + (i+1) + " сотрудника => ");
            sotr[i].oklad = sc.nextInt();

            sc.nextLine();
        }

        System.out.println("\nСотрудники фирмы: \nфам\tимя\tотч\t должность \tоклад");
        for (int i = 0; i < sotr.length; i++){
            System.out.println(sotr[i].fam + "\t" + sotr[i].im + "\t" + sotr[i].otch + "\t"
                    + sotr[i].doljnost + "\t" + sotr[i].oklad);
        }
    }
}
