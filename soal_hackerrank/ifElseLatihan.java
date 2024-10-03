package soal_hackerrank;
import java.util.*;

public class ifElseLatihan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        //sebuah keran digunakan untuk mengisi ember dengan volume Y ml dalam X detik
        //jika keran tersebut tidak diubah kecepatannya (ml/detik), apakah dapat memenuhi ember dengan volume 1500 ml dalam waktu 20 detik atau kurang?
        
        // jika tidak, output kalimat 
        // "Keran dengan kecepatan [kecepatan] ml/detik tidak cukup untuk mengisi ember"

        // jika waktu yang diperlukan 20 detik pas
        // output kalimat "Keran dengan kecepatan [kecepatan] ml/detik pas untuk mengisi ember dalam 20 detik"

        // jika waktu yang diperlukan kurang dari 20 detik 
        // output kalimat  "Keran dengan kecepatan [kecepatan] ml/detik lebih dari cukup untuk mengisi ember"

        //bulatkan kecepatan pada output menjadi 2 angka di balik koma
        
        int waktu = in.nextInt(); //detik
        int volume = in.nextInt(); //ml
        double kecepatan = volume/waktu; //ml/detik

        double waktuIsi = 1500/kecepatan;

        if (waktuIsi > 20) {
            System.out.printf("Keran dengan kecepatan %.2f ml/detik tidak cukup untuk mengisi ember", kecepatan );
        } else if (waktuIsi == 20) {
            System.out.printf("Keran dengan kecepatan %.2f ml/detik pas untuk mengisi ember", kecepatan );
        } else {
            System.out.printf("Keran dengan kecepatan %.2f ml/detik lebih dari cukup untuk mengisi ember", kecepatan );
        }
    }
}
