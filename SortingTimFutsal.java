import java.util.*;

class Pemain {
    int tinggi;
    int berat;

    Pemain(int tinggi, int berat) {
        this.tinggi = tinggi;
        this.berat = berat;
    }

    @Override
    public String toString() {
        return "Tinggi: " + tinggi + " cm, Berat: " + berat + " kg";
    }
}

public class SortingTimFutsal {

    public static void main(String[] args) {
        List<Pemain> timA = Arrays.asList(
            new Pemain(168, 50), new Pemain(170, 60), new Pemain(165, 56),
            new Pemain(168, 55), new Pemain(172, 60), new Pemain(170, 70),
            new Pemain(169, 66), new Pemain(165, 56), new Pemain(171, 72),
            new Pemain(166, 56)
        );

        List<Pemain> timB = Arrays.asList(
            new Pemain(170, 66), new Pemain(167, 60), new Pemain(165, 59),
            new Pemain(166, 58), new Pemain(168, 58), new Pemain(175, 71),
            new Pemain(172, 68), new Pemain(171, 68), new Pemain(168, 65),
            new Pemain(169, 60)
        );

        // tinggi ASC
        timA.sort(Comparator.comparingInt(p -> p.tinggi));
        tampilkanTabel(timA, "Tim A - Tinggi ASC");

        // tinggi DESC
        timB.sort((a, b) -> Integer.compare(b.tinggi, a.tinggi));
        tampilkanTabel(timB, "Tim B - Tinggi DESC");

        // sorting berat ASC
        timA.sort(Comparator.comparingInt(p -> p.berat));
        tampilkanTabel(timA, "Tim A - Berat ASC");

        // soritng berat DESC
        timB.sort((a, b) -> Integer.compare(b.berat, a.berat));
        tampilkanTabel(timB, "Tim B - Berat DESC");

        // cari nilai maksimum dan minimum
        Pemain minTinggiA = Collections.min(timA, Comparator.comparingInt(p -> p.tinggi));
        Pemain maxTinggiA = Collections.max(timA, Comparator.comparingInt(p -> p.tinggi));
        Pemain minBeratA = Collections.min(timA, Comparator.comparingInt(p -> p.berat));
        Pemain maxBeratA = Collections.max(timA, Comparator.comparingInt(p -> p.berat));

        Pemain minTinggiB = Collections.min(timB, Comparator.comparingInt(p -> p.tinggi));
        Pemain maxTinggiB = Collections.max(timB, Comparator.comparingInt(p -> p.tinggi));
        Pemain minBeratB = Collections.min(timB, Comparator.comparingInt(p -> p.berat));
        Pemain maxBeratB = Collections.max(timB, Comparator.comparingInt(p -> p.berat));

        System.out.println("\n== Nilai Maksimum dan Minimum ==");
        System.out.println("Tim A - Tinggi Min: " + minTinggiA.tinggi + " cm, Max: " + maxTinggiA.tinggi + " cm");
        System.out.println("Tim A - Berat  Min: " + minBeratA.berat + " kg, Max: " + maxBeratA.berat + " kg");

        System.out.println("Tim B - Tinggi Min: " + minTinggiB.tinggi + " cm, Max: " + maxTinggiB.tinggi + " cm");
        System.out.println("Tim B - Berat  Min: " + minBeratB.berat + " kg, Max: " + maxBeratB.berat + " kg");

        // copy tim B ke tim C
        List<Pemain> timC = new ArrayList<>();
        for (Pemain p : timB) {
            timC.add(new Pemain(p.tinggi, p.berat));
        }
        tampilkanTabel(timC, "Tim C (Salinan dari Tim B)");
    }

    public static void tampilkanTabel(List<Pemain> tim, String namaTim) {
        System.out.println("\n+-------------------------+");
        System.out.printf("| %-29s |\n", namaTim);
        System.out.println("+-------+--------+--------+");
        System.out.printf("| %-5s | %-6s | %-6s |\n", "No", "Tinggi", "Berat");
        System.out.println("+-------+--------+--------+");
        for (int i = 0; i < tim.size(); i++) {
            Pemain p = tim.get(i);
            System.out.printf("| %-5d | %-6d | %-6d |\n", i + 1, p.tinggi, p.berat);
        }
        System.out.println("+-------+--------+--------+");
    }
}
