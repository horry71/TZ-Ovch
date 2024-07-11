import java.util.Scanner;

public class project1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = in.nextInt();

        System.out.println("Введите второе число: ");
        int b = in.nextInt();

        double c = (double)a/b;

        if (a>b) {
            System.out.println(a+">"+b);
        } else if (a<b) {
            System.out.println(a+"<"+b);
        } else if (a==b) {
            System.out.println(a+"="+b);
        }

        System.out.println(("Сложение: ") + (a+b));
        System.out.println(("Вычитание: ") + (a-b));
        System.out.println(("Умножение: ") + (a*b));
        System.out.println(("Деление: ") + c);
    }
}