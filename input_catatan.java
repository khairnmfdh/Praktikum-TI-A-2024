import java.util.*; 

//import
    //import package.name.Class =
    //import java.util.Scanner  =
    //import package.name.*     =
    //import java.util.*        =

public class input_catatan{
    public static void main(String[] args) {

        //deklarasi variabel inisialisasi variabel
        //
        String nama1 = "Khai";
       
        //proses
        //operasi aritmatika
        // +
        // - 
        // / 
        // * 
        // % 


        //Math.pow(a, b) =
        //Math.sqrt()    =
        //Math.cbrt()    =
        //Math.abs()     =
        //dst

        //Math class     

        //Math =
        //   .[rumus]  =
        //[rumus]() = 

        //contoh: Math.pow(a, b)    
        //Math =
        //.pow =
        //(a, b) = ....   a-->  ....   b--> ....

        //list method pada kelas Math: https://www.w3schools.com/java/java_ref_math.asp

        //apa lagi Class yang sering dipakai di Java?

        //input

        //Memasukkan data ke variable secara manual dari kode
        int nilai = 90;
        float rerata = 98.78f;
        boolean mahasiswa_aktif = true;

        //Menggunakan data yang dimasukkan oleh user melalui .....
        Scanner input = new Scanner(System.in);
        String nama = input.nextLine();
        int umur = input.nextInt();

        //jika ingin menggunakan input.nextLine(), perhatikan input yang digunakan sebelumnya
        //jika input sebelumnya adalah yang selain nextLine(), maka wajib menuliskan?**
        //Mengapa?

        //wajib tulis apa?**
        String nim = input.nextLine();
        double gpa = input.nextDouble();
        float apaAja = input.nextFloat();
        System.out.print("Nama: "+nama+"\nNIM : "+nim+"\numur: "+umur+"\nGPA: "+gpa+"\napaAja: "+apaAja);

        //output

        //print .....
        System.out.print("Hello, World!"); 

        //print .....
        System.out.println("Hello, World!"); 

        //menggabungkan .....
        System.out.println("Praktikum "+"Pemdas");

        //menggabungkan .....
        System.out.println("Nama Saya : "+nama1); 
        System.out.println("Mahasiswa Aktif: "+mahasiswa_aktif);

        //mengoutput ....
        System.out.println(10%3+5);
        System.out.println(Math.pow(4,2));

        //coba output :  ',  ", \t

        //escape characters
        // \n  \t   


        //output format = .....
        
        //%s = ....
        //%d = ....
        //%f = ....

        System.out.printf("Nama saya adalah %s\n", nama1);
        System.out.printf("Nilai saya adalah %d\n", nilai);
        System.out.printf("Rata-rata saya adalah %.2f\n", rerata);
        System.out.printf("Nama saya adalah %s, nilai saya %d, dan rata-rata saya %.2f\n", nama1, nilai, rerata);

        //printf lanjut (ANGKA)

        //%.[jumlah angka di belakang koma]f  
        // --> .....

        //%d (diisi data float) 
        // --> ....

        //%,[jumlah angka terpisah]d 
        // --> ....

        //%0[jumlah angka yang ditampilkan]f/d 
        // --> ....

        //printf lanjut (SPASI)
        
        //%[jumlah spasi]d/f/s
        // --> ....

        //%-[jumlah spasi]d/f/s
        // --> ....
    }
}