public class test1 {
    public static void main(String[] args) {
        int x = 0;
        while (x<9) {
            x++;
            System.out.println("Perulangan saat ini: "+(x+1));

            if (x==7) {
                continue; //LONCATI 1 LOOP
            }

            System.out.println("Program lanjut");
        }
    }
}
