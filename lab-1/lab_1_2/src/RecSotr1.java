import java.util.Scanner;

public class RecSotr1 {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество сотрудников => ");
        int kol = sc.nextInt();
        sc.nextLine();

        Sotrudnik[] sotr = new Sotrudnik[kol];
        System.out.println("Введите информацию про каждого сотрудника: ");
        for (int i = 0; i <  sotr.length; i++){
            sotr[i] = new Sotrudnik();

            System.out.println("Введите фамилию " + (i+1) + " сотрудника => ");
            sotr[i].fam = sc.nextLine();

            System.out.println("Введите имя " + (i+1) + " сотрудника => ");
            sotr[i].im = sc.nextLine();

            System.out.println("Введите отчество " + (i+1) + " сотрудника => ");
            sotr[i].otch = sc.nextLine();

            System.out.println("Введите должность " + (i+1) + " сотрудника => ");
            sotr[i].doljnost = sc.nextLine();

            System.out.println("Введите количество детей сотрудника => ");
            sotr[i].kolDet = sc.nextInt();
            sc.nextLine();

            if(sotr[i].kolDet != 0){
                sotr[i].reb = new Rebenok[sotr[i].kolDet];
                System.out.println("Дети => ");
                for (int j = 0; j < sotr[i].reb.length; j++){
                    sotr[i].reb[j] = new Rebenok();

                    System.out.println("Введите имя " + (j+1) + " ребенка => ");
                    sotr[i].reb[j].imaR = sc.nextLine();

                    System.out.println("Введите возраст " + (j+1) + " ребенка => ");
                    sotr[i].reb[j].vozrastR = sc.nextInt();
                    sc.nextLine();
                }
            }
        }

        System.out.println("\nСотрудники фирмы: \nфам\tимя\tотч\t должность");
        for (int i = 0; i <  sotr.length; i++){
            System.out.println(sotr[i].fam + "\t" +  sotr[i].im + "\t" +  sotr[i].otch + "\t"
            +  sotr[i].doljnost);
            System.out.println("Дети: ");
            for (int j = 0; j < sotr[i].reb.length; j++){
                System.out.println("\t\t" + sotr[i].reb[j].imaR + "\t\t" + sotr[i].reb[j].vozrastR);
                System.out.println();
            }
        }

    }
}
