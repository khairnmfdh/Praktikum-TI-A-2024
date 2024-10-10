import java.util.*;

public class cariMax {
    public static void main(String[] args) {
        //TIDAK BOLEH PAKE MATH CLASS

        Scanner in = new Scanner(System.in);

        System.out.println("Berapa angka yang ingin dibandingkan: ");
        int jumlahAngka = in.nextInt();
        int angkaTerbesar = 0;
        int angkaTerkecil = 2000000;
        int total = 0;

        for (int i=0; i<jumlahAngka; i++) {
            System.out.println("Angka ke-" + (i+1) + ": ");
            int angka = in.nextInt();
            angkaTerbesar = angka>angkaTerbesar ? angka : angkaTerbesar;
            angkaTerkecil = angka<angkaTerkecil ? angka : angkaTerkecil;
            total += angka;
        }
        
        System.out.println("Angka terbesar adalah: " + angkaTerbesar);
        System.out.println("Angka terkecil adalah: " + angkaTerkecil);
        System.out.println("Rata-rata seluruh angka adalah: " + total/jumlahAngka);
    }
}
