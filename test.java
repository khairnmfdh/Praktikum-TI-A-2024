import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        int jumlah_detik = 89634;
        int jam = 89634 / 3600; // --> 0
        int menit = (89634%3600)/60; //--> 14
        int detik_sisa = (89634%3600)%60;

        int angkaSatuDua = 2345;
        int angka_satu_dua = 5678;
        
        angkaSatuDua = 9803;

        // jumlah_detik = 896;
        // menit = jumlah_detik/60;
        // jam = menit/60;
        // detik_sisa = jumlah_detik%60;

        
        System.out.printf("%02d:%02d:%02d",jam,menit,detik_sisa);
    }
}