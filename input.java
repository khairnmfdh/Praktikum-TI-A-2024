import java.util.*; //wajib ada

public class input{
    public static void main(String[] args) {

               //import
        //import package.name.Class = import 1 kelas
            //import java.util.Scanner; digunakan untuk mendapatkan input dari user
        //import package.name.* = import seluruh package
            //import java.util.*; erupakan sebuah built-in package dari JAVA
        
        //deklarasi dan inisialisasi variabel
        //[tipe data][nama] = [inisialisasi value];
       
        //output
        String nama1 = "Khai";
        int nilai = 90;
        float rerata = 98.78f;
        boolean mahasiswa_aktif = true;

        System.out.println("Hello, World!");
        System.out.println("Praktikum "+"Pemdas");
        System.out.println("Nama Saya : "+nama1);
        System.out.println("Mahasiswa Aktif: "+mahasiswa_aktif);

        //printf
        System.out.printf("Nama saya adalah %s\n", nama1);
        System.out.printf("Nilai saya adalah %d\n", nilai);
        System.out.printf("Rata-rata saya adalah %.2f\n", rerata);
        System.out.printf("Nama saya adalah %s, nilai saya %d, dan rata-rata saya %.2f\n", nama1, nilai, rerata);

        //input
        Scanner input = new Scanner(System.in);
        String nama = input.nextLine();
        int umur = input.nextInt();
        input.nextLine();
        String nim = input.nextLine();
        double gpa = input.nextDouble();
        float apaAja = input.nextFloat();
        System.out.print("Nama: "+nama+"\nNIM : "+nim+"\numur: "+umur+"\nGPA: "+gpa+"\napaAja: "+apaAja);



        //proses
        //operasi aritmatika
        // + pertambahan
        // - pengurangan
        // / pembagian
        // * perkalian
        // % modulo (sisa pembagian)

        //perpangkatan
        //Math.pow(a, b) a pangkat b
        //Math.sqrt() akar 2
        //Math.cbrt() akar 3
        //Math.abs() nilai absolut

    }
}