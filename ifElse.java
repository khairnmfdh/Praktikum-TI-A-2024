public class ifElse {
    public static void main(String[] args) {

        //LOGICAL OPERATORS
        // && (AND)
        // || (OR)
        // == (sama dengan)
        // != (tidak sama dengan)
        // > (ebih dari)
        // < (kurang dari)
        // >= (lebih dari sama dengan)
        // <= (kurang dari sama dengan)
        // ! (NOT) --> mengembalikan boolean yang berkebalikan

        boolean sudahMakan = false;
        System.out.println("Sudah makan? "+(!sudahMakan));

        // ^ (XOR) INI HAMPIR TIDAK PERNAH DIPAKE UNTUK PEMDAS
        

        //if else
        int nilai = 89;


        //style format 1 (Standard)
        if (nilai>80) {
            System.out.println("Anda lulus");
        } else {
            System.out.println("Anda gagal");
        }

        //style format 2 
        if (nilai>80) 
        {
            System.out.println("Anda lulus");
        }
        else 
        {
            System.out.println("Anda gagal");
        }

        nilai = 60;
        if (nilai>80) {
            System.out.println("Anda dapat A");
        } else if (nilai>60) {
            System.out.println("Anda dapat B");
        } else {
            System.out.println("Anda dapat C");
        }

        nilai = 80;
        if (nilai>=80) {
            System.out.println("Anda dapat A");
        } else if (nilai>=60) {
            System.out.println("Anda dapat B");
        } else {
            System.out.println("Anda dapat C");
        }

        nilai = 99;
        if (nilai==100) {
            System.out.println("Nilai anda maksimal");
        }

        if ((nilai+1)==100) {
            System.out.println("Nilai anda maksimal dengan bonus point");
        }

        System.out.println(nilai);

        // switch case
        int hari = 4;

        switch (hari) {
            case 1:
                System.out.println("Hari Senin");
                break;
            case 2:
                System.out.println("Hari Selasa");
                break;
            case 3:
                System.out.println("Hari Rabu");
                break;
            case 4:
                System.out.println("Hari Kamis");
                break;
            case 5:
                System.out.println("Hari Jumat");
                break;
            case 6:
                System.out.println("Hari Sabtu");
                break;
            case 7:
                System.out.println("Hari Minggu");
                break;
            default:
                System.out.println("Tidak ada");
        }


        // ternary operator
        int angkaBesar = 10;
        int angkaKecil = 20;

        if (angkaBesar>angkaKecil) {
            System.out.println("Angka lebih besar adalah "+angkaBesar);
        } else {
            System.out.println("Angka lebih besar adalah "+angkaKecil);
        }



        int yangLebihBesar = angkaBesar>angkaKecil? angkaBesar : angkaKecil;
        System.out.println("Angka lebih besar adalah "+yangLebihBesar);




        //NESTED IF ELSE

        String warna = "Pink";
        int umur = 12;

        if (warna=="Pink") {
            if (umur>=20) {
                System.out.println("Perempuan dewasa");
            } else if (umur>=13) {
                System.out.println("Perempuan remaja");
            } else {
                System.out.println("Perempuan anak-anak");
            }
        } else if (warna=="Biru") {
            if (umur>=20) {
                System.out.println("Laki-laki dewasa");
            } else if (umur>=13) {
                System.out.println("Laki-laki remaja");
            } else {
                System.out.println("Laki-laki anak-anak");
            }
        }

        // ++variable
        // variable++
        // sama-sama artinya variable = variable + 1;

        int hey = 0;
        if (hey++>=1) {
            System.out.println("ya nambah 1 weh");
        } else {
            System.out.println("0 lah kocak");
        }

        // MENJELASKAN: POIN KEATIFAN 2
        // PERBEDAAN ++variable DENGAN variable++
        //System.out.println(hey);


        //SHORTHAND OPERATORS
        // a+=b;
        // a = a + b;

        // a-=b;
        //
        
        // a*=b;
        //

        // a/=b;
        //

        // a%=b;
        //

        int a = 10;
        int b = 12;
        if ((a%=b)>5) {
            System.out.println();
        }

        //menukar isi dari 2 variable
        int temp;
        temp = a;
        a = b;
        b = temp;

        // MENJELASKAN: POINT KEAKTIFAN 1
        // kenapa bukan pake a = b?

        System.out.println(a);

        // CHALLENGE: POIN KEAKTIFAN 1

        // BIKIN PROGRAM AGAR ANGKA A DAN B DIBANDINGKAN NILAINYA
        // A HARUS LEBIH BESAR DARIPADA B
        // TUKAR NILAINYA JIKA B>A
        // PRINT NILAI A DAN B

        // banyak banget caranya jadi yang bisa jawab berbeda daripada temannya dapat poin!
        
        a = 20;
        b = 30;

        //CHALLENGE: POIN KEAKTIFAN 2
        // BIKIN PROGRAM YANG MENGHITUNG JIKA PELANGGAN MENDAPATKAN DISKON
        // JIKA PEMBELIAN > 100, PELANGGAN DAPAT DISKON 10%
        // JIKA PEMBELIAN > 200, PELANGGAN DAPAT DISKON 20%
        // JIKA PEMBELIAN > 500, PELANGGAN DAPAT DISKON 50%
        // OUTPUT LANGSUNG JUMLAH TOTAL PEMBELIAN DENGAN DISKON
        // TETAP HARUS OUTPUT TOTAL PEMBELIAN MESKIPUN TIDAK DISKON

        // yang maju pertama dapat 2 poin
        // yang maju untuk tunjukin cara yang beda bisa dapet 1-2 poin tergantung kodenya

        double pembelian = 130;
        double total = 0;
        System.out.println(total);
    }
}
