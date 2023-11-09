import java.util.Scanner;

public class DoWhileCuti29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.println("Masukkan jatah cuti: ");
        jatahCuti = input.nextInt();

        do {
            System.out.println("Apakah ingin mengambil cuti (y/n)");
            konfirmasi = input.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.println("Masukkan jumlah hari cuti: ");
                jumlahHari = input.nextInt();
                if (jumlahHari<= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti anda: " + jatahCuti);
                } else {
                    System.out.println("Jatah cuti kurang");
                    System.out.println("Apakah ingin mecoba lagi (y/n)");
                    konfirmasi = input.next();
                    if (!konfirmasi.equalsIgnoreCase("y")) {
                        break;
                    }
                }
            } else if (konfirmasi.equalsIgnoreCase("n")) {
                break;
            } else {
                System.out.println("Input salah");
            }
        } while (jatahCuti > 0);
    }
}
