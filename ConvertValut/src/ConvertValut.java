import java.util.Scanner;
public class ConvertValut {
    public static void main(String[] args) {
        System.out.println("Конвертёр валют");

        System.out.println("Введите количество рублей: ");
        double rubCount = new Scanner(System.in).nextDouble();

        System.out.println("Введите актуальный курс евро: ");
        double euroPrice = new Scanner(System.in).nextDouble();

        System.out.println("Введите актуальный курс доллара: ");
        double dollarPrice = new Scanner(System.in).nextDouble();

        System.out.println(rubCount + " рублей это " + rubCount * (1 / euroPrice) + " евро.");
        System.out.println(rubCount + " рублей это " + rubCount * (1 / dollarPrice) + " долларов.");
    }
}
