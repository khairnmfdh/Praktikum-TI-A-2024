import java.util.Scanner;

public class perulangan {
    public static void main(String[] args) {

        //FOR LOOP
        int nilai;
        for (nilai = 1; nilai <= 10; nilai++) {
            System.out.println(nilai);
        }

    //WHILE LOOP
    int nilai1 = 1;
    while(nilai1<=10)
    {
        System.out.println(nilai1);
        nilai1++;
    }

    //DO-WHILE LOOP
    int nilai2 = 1;
    do
    {
        System.out.println(nilai2);
        nilai2++;
    }while(nilai2<=10);


    //FOR LOOP WITH IF ELSE
    int nilai3;
    System.out.println("pernyataan break batas 10");
    
    for(nilai3=1;nilai3<=10;nilai3++)
    {
        if (nilai3 == 5)
            break;
        else
            System.out.println(nilai3);
    }System.out.println();

    System.out.println("pernyataan continue batas 10");for(nilai3=1;nilai3<=10;nilai3++)
    {
        if (nilai3 == 5)
            continue;
        else
            System.out.println(nilai3);
    }


        // Menggunakan for loop untuk mencetak tabel perkalian 1 sampai 10
            for (int i = 1; i <= 5; i++) {
            // Loop dalam untuk angka kolom (1 sampai 5)
            for (int j = 1; j <= 5; j++) {
                System.out.print(i * j + "\t"); // Cetak hasil perkalian i dan j
            }
            System.out.println(); // Ganti baris setelah inner loop selesai
        }
                
        // Menggunakan while loop sampai user menebak angka dengan benar
        int numberToGuess = 42; // Angka yang harus ditebak
        int userGuess = 0;
        
        Scanner scanner = new Scanner(System.in);
        while (userGuess != numberToGuess) {
            System.out.print("Tebak angka (1-100): ");
            userGuess = scanner.nextInt();
            
            if (userGuess < numberToGuess) {
                System.out.println("Tebakan terlalu kecil!");
            } else if (userGuess > numberToGuess) {
                System.out.println("Tebakan terlalu besar!");
            } else {
                System.out.println("Selamat! Anda menebak angka yang benar.");
            }
        }
        
        // Menggunakan do-while loop untuk meminta password dari user
        String correctPassword = "12345";
        String userPassword;
        
        do {
            System.out.print("Masukkan password: ");
            userPassword = scanner.nextLine();
            
            if (!userPassword.equals(correctPassword)) {
                System.out.println("Password salah, coba lagi.");
            }
        } while (!userPassword.equals(correctPassword));
        
        System.out.println("Login berhasil!");
        
        scanner.close();   
    }
}


