import java.util.Scanner;

public class Zadanie_9 {
    public static void main(String[] args) {
        String name;
        int age;
        double anualPay;
        Scanner dane = new Scanner(System.in);

        System.out.println("Podaj swoję imię: ");
        name = dane.nextLine();

        System.out.println("Podaj swoj wiek: ");
        age = dane.nextInt();
        dane.nextLine();

        System.out.println("Podaj oczekiwany roczny dochod: ");
        anualPay = dane.nextInt();
        dane.nextLine();

        System.out.println("Nazywam się " + name + ". Mam " + age + " lat \ni chcę zarabiac " + anualPay);
    }
}