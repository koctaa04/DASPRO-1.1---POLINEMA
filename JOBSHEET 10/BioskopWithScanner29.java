import java.util.Scanner;

public class BioskopWithScanner29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        while (true) {
            System.out.println("Menu :");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan data penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            int menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1:
                    while (true) {
                        System.out.print("Masukkan nama penonton: ");
                        String nama = scanner.nextLine();
                        System.out.print("Masukkan baris penonton: ");
                        int baris = scanner.nextInt();
                        System.out.print("Masukkan kolom penonton: ");
                        int kolom = scanner.nextInt();

                        if (baris > penonton.length || kolom > penonton[0].length) {
                            System.out.println("Input data gagal, Baris atau kolom melebihi batas");
                        } else if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Input data gagal, kotak sudah terisi");
                        } else {
                            penonton[baris - 1][kolom - 1] = nama;
                        }

                        System.out.print("Input penonton lainnya (y/n)? ");
                        String input = scanner.next();
                        if (input.equals("n")) {
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Data penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] != null) {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                            } else {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": ***1");
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih");
                    System.exit(0);
                default:
                    System.out.println("Menu tidak tersedia");
                    break;
            }
        }
    }
}
