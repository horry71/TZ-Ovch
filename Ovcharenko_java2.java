import java.util.Scanner;

public class Ovcharenko_java2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String a = in.nextLine();

        System.out.println("Введите вторую строку: ");
        String b = in.nextLine();

        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else System.out.println("Строки неидентичны"); {
        }
    }
}