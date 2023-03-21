import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> fruits = new ArrayList<String>();
        while (true) {
            System.out.println("Выберите операцию:");
            String input = scanner.next();

            switch (input) {
                case "1": {
                    System.out.println("Какую покупку вы хотите добавить?");
                    fruits.add(scanner.next());
                    break;
                }
                case "2": {
                    Shows(fruits);
                    break;



                }
                case "3": {
                    Shows(fruits);
                    System.out.println("Какую хотите удалить? Введите номер или название?");
                    String order = scanner.next();

                    try {
                        int click = Integer.parseInt(order);
                        fruits.remove(click);

                    } catch (Exception e) {
                        fruits.remove(order);
                    }

                }


            }


        }


    }

    private static void Shows(List<String> fruits) {
        System.out.println("Список покупок");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println((i + 1) + ". " + fruits.get(i));


        }


    }
}