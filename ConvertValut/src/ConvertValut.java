import java.util.Scanner;
public class ConvertValut {
    public static void main(String[] args) {
        System.out.println("�������� �����");

        System.out.println("������� ���������� ������: ");
        double rubCount = new Scanner(System.in).nextDouble();

        System.out.println("������� ���������� ���� ����: ");
        double euroPrice = new Scanner(System.in).nextDouble();

        System.out.println("������� ���������� ���� �������: ");
        double dollarPrice = new Scanner(System.in).nextDouble();

        System.out.println(rubCount + " ������ ��� " + rubCount * (1 / euroPrice) + " ����.");
        System.out.println(rubCount + " ������ ��� " + rubCount * (1 / dollarPrice) + " ��������.");
    }
}
