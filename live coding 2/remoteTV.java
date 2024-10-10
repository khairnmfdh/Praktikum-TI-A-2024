import java.util.Scanner;

public class remoteTV {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("TV dinyalakan");

        // channel : min 0, max 12
        int channel = 0;
        int channelMin = 0;
        int channelMax = 12;

        // volume : min 0, max 100
        int volume = 50;
        int volumeMin = 0;
        int volumeMax = 100;

        while (true) {
            System.out.println("Tombol remot TV");
            System.out.println("1 : Naik channel"); //increment 1 
            System.out.println("2 : Turun channel"); //decrement 1
            System.out.println("3 : Naik volume"); //increment 10
            System.out.println("4 : Turun volume"); //decrement 10
            System.out.println("0 : Matikan TV");

            System.out.println("\nMasukkan angka tombol yang ingin ditekan:");
            int tombol = in.nextInt();

            switch (tombol) {
                case 1:
                    if (channel<channelMax) {
                        channel++;
                    }
                    System.out.println("Channel sekarang no-" + channel);
                    break;
                case 2:
                    if (channel>channelMin) {
                        channel--;
                    }
                    System.out.println("Channel sekarang no-" + channel);
                    break;
                case 3: 
                    if (volume<volumeMax) {
                        volume += 10;
                    }
                    System.out.println("Volume sekarang " + volume);
                    break;
                case 4:
                    if (volume>volumeMin) {
                        volume -= 10;
                    }
                    System.out.println("Volume sekarang " + volume);
                    break;
                case 0:
                    System.out.println("TV dimatikan");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Tidak terdapat tombol nomor " + tombol);
                    break;
            }

            System.out.println("");
        }
    }
}
