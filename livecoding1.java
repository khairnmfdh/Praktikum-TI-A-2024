public class livecoding1 {
    public static void main(String[] args) {
        float hargaBarang1 = 14000;
        String namaBarang1 = "Tip-ex";
        float hargaBarang2 = 5000;
        String namaBarang2 = "Pulpen";
        float hargaBarang3 = 56000;
        String namaBarang3 = "Kalkulator";
        float total = hargaBarang1 + hargaBarang2 + hargaBarang3;
        float cash = 100000;
        
        //header
        System.out.println("==============================="); //31 char
        System.out.printf("%10sTOKO FILKOM%10s\n"," "," "); //10 - 11 - 10
        System.out.println("===============================");

        //list barang dibeli
        System.out.printf(" %-15s%s", "Nama Barang","Harga");
        System.out.println("\n-------------------------------");
        System.out.printf(" %-15sRp.%,.2f",namaBarang1,hargaBarang1);
        System.out.printf("\n %-15sRp.%,.2f",namaBarang2,hargaBarang2);
        System.out.printf("\n %-15sRp.%,.2f",namaBarang3,hargaBarang3);
        System.out.println("\n-------------------------------");

        //total beli
        System.out.printf(" %-12s%-3sRp.%,.2f","Total",":",total);
        System.out.printf("\n %-12s%-3sRp.%,.2f","Cash",":", cash);
        System.out.println("\n-------------------------------");

        System.out.printf(" %-12s%-3sRp.%,.2f","Kembalian",":", cash-total);

        System.out.println("\n==============================="); //31 char
        System.out.printf("%2sTERIMA KASIH TELAH BELANJA%2s\n"," "," "); //10 - 11 - 10
        System.out.println("===============================");
    }
}
