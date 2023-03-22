public class Zadanie_6 {
    public static void main(String[] args) {
        int pomieszczenie1 = 3*4;
        int pomieszczenie2= 3*4;
        float pomieszczenie3= 2*3;
        int pomieszczenie4= 2*2;
        float calkowite = pomieszczenie1/4 + pomieszczenie2/4 + pomieszczenie3/4 + pomieszczenie4/4;
        System.out.println("Powierzchnia przypadająca na 1 osobę z wszystkich pokoi " + calkowite  + "metrów^2");
        System.out.println("Powierzchnię przypadającą na 1 osobe z pomieszczenia 1 " + pomieszczenie1/4 +"metrow^2");
        System.out.println("Powierzchnię przypadającą na 1 osobe z pomieszczenia 2 " + pomieszczenie2/4 + "metrów^2");
        System.out.println("Powierzchnię przypadającą na 1 osobe z pomieszczenia 3 " + pomieszczenie3/4 + "metrów^2");
        System.out.println("Powierzchnię przypadającą na 1 osobe z pomieszczenia 4 " + pomieszczenie4/4 + "metrów^2");


    }
}