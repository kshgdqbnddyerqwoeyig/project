import java.util.Scanner;

public class Zadanie_11 {
    public static void main(String[] args) {
        int wartoscproduktu;
        Scanner dane = new Scanner(System.in);
        System.out.println("Podaj wartosc produktow: ");
        wartoscproduktu = dane.nextInt();
        double podatek1 = wartoscproduktu*0.02;
        double podatek2 = wartoscproduktu*0.04;
        double wartoscall = wartoscproduktu + podatek2 + podatek1;
        System.out.println("Cena Ostateczna : " + wartoscall);
        System.out.println("Podatek stanowy :  "  + podatek2 +  "  Podatek lokalny:  "  + podatek1);
    }
}