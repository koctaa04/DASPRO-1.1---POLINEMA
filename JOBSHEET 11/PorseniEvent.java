import java.util.Scanner;

public class PorseniEvent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat array 2 dimensi dengan 5 baris dan 2 kolom
        String[][] dataAtlet = new String[5][2];

        // Meminta pengguna untuk memasukkan data nama atlet dan cabang olahraga
        for (int i = 0; i < dataAtlet.length; i++) {
            System.out.println("Masukkan data untuk Atlet ke-" + (i + 1) + ":");
            System.out.print("Nama Atlet: ");
            dataAtlet[i][0] = scanner.nextLine();
            System.out.println();
            // Memastikan input cabang olahraga valid
            boolean isValidCabang = false;
            while (!isValidCabang) {
                System.out.print("Cabang Olahraga (badminton, tenis meja, basket, bola voly): ");
                String cabangInput = scanner.nextLine().toLowerCase();

                // Validasi input cabang olahraga
                if (cabangInput.equals("badminton") || cabangInput.equals("tenis meja")
                        || cabangInput.equals("basket") || cabangInput.equals("bola voly")) {
                    dataAtlet[i][1] = cabangInput;
                    isValidCabang = true;
                } else {
                    System.out.println("Input tidak valid. Masukkan cabang olahraga yang valid.");
                }
            }
        }

        // Mengurutkan array secara ascending berdasarkan nama atlet (tanpa Arrays.sort)
        for (int i = 0; i < dataAtlet.length - 1; i++) {
            for (int j = 0; j < dataAtlet.length - i - 1; j++) {
                if (dataAtlet[j][0].compareTo(dataAtlet[j + 1][0]) > 0) {
                    // Swap jika nama atlet sekarang lebih besar dari nama atlet berikutnya
                    String[] temp = dataAtlet[j];
                    dataAtlet[j] = dataAtlet[j + 1];
                    dataAtlet[j + 1] = temp;
                }
            }
        }

        // Menampilkan informasi nama atlet dan cabang olahraga
        System.out.println("\nInformasi Atlet Porseni 2024:");
        for (String[] atlet : dataAtlet) {
            System.out.println("Nama: " + atlet[0] + ", Cabang: " + atlet[1]);
        }
    }
}
