import java.util.*;

public class BinarySearchTim {
    public static void main(String[] args) {
        List<Integer> tinggiA = Arrays.asList(168,170,165,168,172,170,169,165,171,166);
        List<Integer> beratA = Arrays.asList(50,60,56,55,60,70,66,56,72,56);

        List<Integer> tinggiB = Arrays.asList(170,167,165,166,168,175,172,171,168,169);
        List<Integer> beratB = Arrays.asList(66,60,59,58,58,71,68,68,65,60);

        Collections.sort(tinggiA);
        Collections.sort(beratA);
        Collections.sort(tinggiB);
        Collections.sort(beratB);

        // binary Search tinggi 168 dan 160 di Tim B
        cariJumlah(tinggiB, 168);
        cariJumlah(tinggiB, 160);

        // binary Search berat 56 dan 53 di Tim A
        cariJumlah(beratA, 56);
        cariJumlah(beratA, 53);

        // cari apakah ada tinggi atau berat yang sama
        boolean adaTinggiSama = !Collections.disjoint(tinggiA, tinggiB);
        boolean adaBeratSama = !Collections.disjoint(beratA, beratB);

        System.out.println("\nAda tinggi sama? " + (adaTinggiSama ? "Ya" : "Tidak"));
        System.out.println("Ada berat sama? " + (adaBeratSama ? "Ya" : "Tidak"));
    }

    static void cariJumlah(List<Integer> list, int key) {
        int count = Collections.frequency(list, key);
        System.out.println("Jumlah pemain dengan nilai " + key + " = " + count);
    }
}
