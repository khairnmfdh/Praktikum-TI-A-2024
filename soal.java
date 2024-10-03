import java.util.*;

public class soal {
    public static void main(String[] args) {
        // // SOAL 1
        Scanner in = new Scanner(System.in);
        // int angka = in.nextInt();
        // boolean prime = false;
        // if (angka % 2 == 0) {
        //     System.out.println(angka + " adalah bilangan genap");
        // } else {
        //     System.out.println("Bilangan ganjil");
        // }

        // // SOAL 2 (TAHUN KABISAT)
        // System.out.print("Masukkan tahun: ");
        // int year = in.nextInt();

        // if (year % 4 == 0) {
        //     if (year % 100 == 0) {
        //         if (year % 400 == 0) {
        //             System.out.println(year + " adalah tahun kabisat.");
        //         } else {
        //             System.out.println(year + " bukan tahun kabisat.");
        //         }
        //     } else {
        //         System.out.println(year + " adalah tahun kabisat.");
        //     }
        // } else {
        //     System.out.println(year + " bukan tahun kabisat.");
        // }

        // // SOAL 3 (REMOT)
        // System.out.print("Masukkan Nomor: ");
        // System.out.println("1. ON");
        // System.out.println("2. OFF");
        // System.out.println("3. PAUSE");
        // System.out.println("4. PREV");
        // System.out.println("5. NEXT");
        // int nomor = in.nextInt();

        // switch (nomor) {
        //     case 1:
        //         System.out.println("Pernagkat Dinyalakan");
        //     case 2:
        //         System.out.println("Perangkat Dimatikan");
        //     case 3:
        //         System.out.println("Tayangan Berhenti");
        //     case 4:
        //         System.out.println("Channel Sebelumnya");
        //     case 5:
        //         System.out.println("Channel Berikutnya");
        // }

    //SOAL 4 (NILAI)
    double nilai = in.nextDouble();
    char indikator = ' ';
    if(nilai<0 || nilai>100){
        System.out.println("Nilai tidak valid");
    }else if(nilai>80){
        indikator = 'A';
    }else if(nilai>70){
        indikator = 'B';
    }else if(nilai>60){
        indikator = 'C';
    }else if(nilai>50){
        indikator = 'D';
    }else if(nilai>60){
        indikator = 'E';
    }else if(nilai < 60){
        indikator = 'F';
    }

    if(indikator == 'A' || indikator == 'B' || indikator == 'C' ){
        System.out.println("Lulus dengan Nilai Angka "+nilai+" dan Nilai Huruf "+indikator);
    }else if(indikator == 'D' || indikator =='E' || indikator == 'F'){
        System.out.println("Tidak Lulus dengan Nilai Angka "+nilai+" dan Nilai Huruf "+indikator);
    }else if(indikator == 'F'){}
    else {
        System.out.println("Masukkan kembali Nilai yang benar");
    }
    }

}