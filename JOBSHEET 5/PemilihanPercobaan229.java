import java.util.Scanner;

public class PemilihanPercobaan229 {
    public static void main(String[] args) {
        System.out.println("+===================================================+");
        System.out.println("|           PROGRAM PENILAIAN TUGAS AKHIR           |");
        System.out.println("|                                                   |");
        System.out.println("|          Berikut merupakan aturan nilai:          |");
        System.out.println("|                                                   |");
        System.out.println("|    80 < N <= 100   A   / 4     Sangat Baik        |");
        System.out.println("|    73 < N <= 80    B+  / 3.5   Lebih dari Baik    |");
        System.out.println("|    65 < N <= 73    B   / 3     Baik               |");
        System.out.println("|    60 < N <= 65    C+  / 2.5   Lebih dari Cukup   |");
        System.out.println("|    50 < N <= 60    C   / 2     Cukup              |");
        System.out.println("|    39 < N <= 50    D   / 1     Kurang             |");
        System.out.println("|         N <= 39    E   / 0     Gagal              |");
        System.out.println("+===================================================+");


        float uas, uts, kuis, tugas, nilaiAkhir;
        Scanner input29 = new Scanner(System.in);
        System.out.print("Masukkan Nilai UAS: ");
        uas = input29.nextFloat();
        System.out.print("Masukkan Nilai UTS: ");
        uts = input29.nextFloat();
        System.out.print("Masukkan Nilai KUIS: ");
        kuis = input29.nextFloat();
        System.out.print("Masukkan Nilai TUGAS: ");
        tugas = input29.nextFloat();
        nilaiAkhir = (float) ((uas * 0.4) + (uts * 0.3) + (kuis * 0.1) + (tugas * 0.2));
        
        System.out.println("+==============================+");
        System.out.println("|         NIlAI AKHIR          |");
        System.out.println("+==============================+");
        
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            System.out.println("Grade A  =  Sangat Baik");
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            System.out.println("Grade B+ =  Lebih dari Baik");
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            System.out.println("Grade B  =  Baik");
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            System.out.println("Grade C+ =  Lebih dari Cukup");
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            System.out.println("Grade C  =  Cukup");
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            System.out.println("Grade D  =  Kurang");
        } else if (nilaiAkhir > 0 && nilaiAkhir <= 39){
            System.out.println("Grade E  =  Gagal");
        } else {
            System.out.println("Nilai Tidak Valid");
        }
        // TERDAPAT 7 KONDISI NILAI 0 - 100 dan 1 KONDISI UNTUK NILAI YANG TIDAK VALID PADA KODE DIATAS

        String message = (nilaiAkhir <= 65) ? "REMIDI" : "TIDAK REMIDI";
        System.out.println("Status: " + message);

    }
}
