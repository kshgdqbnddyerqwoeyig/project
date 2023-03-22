import java.util.Scanner;
public class Zadanie_10 {
    public static void main(String[] args) {
        String pierwszeimie, drugieimie, ostatnieimie;

        Scanner dane = new Scanner(System.in);

        System.out.println("Podaj swoję imię: ");
        pierwszeimie = dane.nextLine();

        System.out.println("Podaj swoję drugie imię: ");
        drugieimie = dane.nextLine();

        System.out.println("Podaj swoję nazwisko: ");
        ostatnieimie = dane.nextLine();

        char firstInitial = pierwszeimie.charAt(0), middleInitial = drugieimie.charAt(0), lastInitial = ostatnieimie.charAt(0);

        System.out.println("Twoje imie: " + pierwszeimie + ". durige imie: " + drugieimie + ". nazwisko: " + ostatnieimie);
        System.out.println("Twoje inicjal: " + firstInitial + middleInitial + lastInitial);
    }
}
