public class livecoding {
    public static void main(String[] args) {
        String namaBarang1, namaBarang2, namaBarang3;
        float hargaBarang1, hargaBarang2, hargaBarang3, total, cash, kembalian;
        namaBarang1 = "Tip-ex";
        hargaBarang1 = 14000;
        namaBarang2 = "Pulpen";
        hargaBarang2 = 5000;
        namaBarang3 = "Kalkulator";
        hargaBarang3 = 56000;
        total = hargaBarang1+hargaBarang2+hargaBarang3;
        cash = 100000;
        kembalian = cash - total;

        System.out.println("==============================="); //baris 1
        System.out.printf("%10s%s%10s"," ","TOKO FILKOM"," "); //baris 2
        System.out.println("\n==============================="); //baris 3
        System.out.printf("%-15s%s","Nama barang","Harga"); //baris 4
        System.out.println("\n==============================="); //baris 5
        System.out.printf("%-15sRp.%,.2f\n",namaBarang1,hargaBarang1); 
        System.out.printf("%-15sRp.%,.2f\n",namaBarang2,hargaBarang2);
        System.out.printf("%-15sRp.%,.2f\n",namaBarang3,hargaBarang3);
        System.out.println("--------------------------------");
        System.out.printf("%-12s%-3sRp.%,.2f\n","Total",":",total); 
        System.out.printf("%-12s%-3sRp.%,.2f\n","Cash",":",cash);
        System.out.println("--------------------------------");
        System.out.printf("%-12s%-3sRp.%,.2f\n","Kembalian",":",kembalian);
        System.out.println("================================"); 
        System.out.printf("%2s%s%3s", " ", "TERIMA KASIH TELAH BELANJA", " ");
        System.out.println("\n================================");
    }
}
