import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // init
        int count = 3;
        Theatre[] theatres = new Theatre[count];
        theatres[0] = new Theatre("Бабинский", "Иванов", "ул. Пушкина", 99);
        theatres[1] = new Theatre("Андреевский", "Петров", "ул. Папкина", 101);
        theatres[2] = new Theatre("Ващинский", "Пупкин", "ул. Главная", 95);

        //System.out.print("Введите количество театров => ");
        //int count = sc.nextInt();
        //sc.nextLine();

        // заполнение данных о театре
        //System.out.println("Введите информацию о каждом театре: ");
        //for (int i = 0; i < theatres.length; i++){
        //    theatres[i] = new Theatre();

        //    System.out.print("Введите название " + (i + 1) + " театра => ");
        //    theatres[i].name = sc.nextLine();

        //    System.out.print("Введите художественного руководителя " + (i + 1) + " театра => ");
        //    theatres[i].artDirector = sc.nextLine();

        //    System.out.print("Введите адресс " + (i + 1) + " театра => ");
        //    theatres[i].address = sc.nextLine();

        //    System.out.print("Введите рейтинг " + (i + 1) + " театра => ");
        //    theatres[i].rating = sc.nextInt();

        //    sc.nextLine();
        //}

        // поиск театра с наибольшим рейтингом
        Theatre maxRatingTheatre = theatres[0];

        for (int i = 0; i < theatres.length; i++){
            if(theatres[i].rating > maxRatingTheatre.rating){
                maxRatingTheatre = theatres[i];
            }
        }

        System.out.println("Театр с наибольшим рейтингом: ");
        System.out.println("\tНазвание \tХудожественный руководитель \tАдресс \tРейтинг");
        System.out.println("\t" + maxRatingTheatre.name + " \t" + maxRatingTheatre.artDirector + " \t" +
                maxRatingTheatre.address + " \t" + maxRatingTheatre.rating);

        // сортировка массива по названию театра в обратном порядке
        Theatre temp = theatres[0];

        for (int i = 0; i < theatres.length; i++){
            for (int j = i + 1; j < theatres.length; j++){
                if(temp.name.compareTo(theatres[i].name) > 0 ){
                    temp = theatres[i];
                    theatres[i] = theatres[j];
                    theatres[j] = temp;
                }
            }
        }

        System.out.println("\nОтсортированный массив по названию театра в обратном порядке: ");
        for (int i = 0; i < theatres.length; i++){
            System.out.println("\t" + theatres[i].name + " \t" + theatres[i].artDirector + " \t" +
                    theatres[i].address + " \t" + theatres[i].rating);
        }

        // создать поиск по фамилии художественного руководителя, исправление одного из полей и вывод всей инфомрации
        // про театр после редактирования
        int index;
        System.out.print("\nВведите фамилию художественного руководителя театра => ");
        String artDirector = sc.nextLine();

        for (int i = 0; i < theatres.length; i++){
            if(theatres[i].artDirector.equals(artDirector)){
                index = i;

                System.out.println("Выберите что нужно исправить: ");
                System.out.println("1 - Название театра \n2 - Фамилию художественного руководителя \n3 - Адресс " +
                        "\n4 - Рейтинг");
                System.out.print(" => ");
                int action = sc.nextInt();
                sc.nextLine();

                switch (action){
                    case 1:
                        System.out.print("Введите новое название театра => ");
                        theatres[i].name = sc.nextLine();
                        break;
                    case 2:
                        System.out.print("Введите фамилию нового художественного руководителя => ");
                        theatres[i].artDirector = sc.nextLine();
                        break;
                    case 3:
                        System.out.print("Введите новый адресс театра => ");
                        theatres[i].address = sc.nextLine();
                        break;
                    case 4:
                        System.out.print("Введите новый рейтинг театра => ");
                        theatres[i].rating = sc.nextInt();
                        break;
                    default:
                        System.out.print("Ошибка выбора, такого действия нет!");
                        break;
                }

                System.out.println("Информацию про театор после редактирования: ");
                System.out.println("\t" + theatres[index].name + " \t" + theatres[index].artDirector + " \t" +
                        theatres[index].address + " \t" + theatres[index].rating);
            }
        }

        // вывести информацию про театры с большим рейтингом, чем рейтинг театра под названием, которое ввел пользователь
        System.out.print("\nВведите название театра => ");
        String theatreName = sc.nextLine();
        int rating = 0;

        for (int i = 0; i < theatres.length; i++){
            if(theatres[i].name.equals(theatreName)){
                rating = theatres[i].rating;
            }
        }

        System.out.println("Театры, с большим рейтингом, чем у театра с названием '" + theatreName + "'");
        for (int i = 0; i < theatres.length; i++){
            if (theatres[i].rating > rating){
                System.out.println("\t" + theatres[i].name + " \t" + theatres[i].artDirector + " \t" +
                        theatres[i].address + " \t" + theatres[i].rating);
            }
        }

    }
}
