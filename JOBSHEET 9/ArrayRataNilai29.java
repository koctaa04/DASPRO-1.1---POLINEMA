import java.util.Scanner;

public class ArrayRataNilai29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] nilaiMhs = new int [5];
        int mhsLulus = 0, mhsTidakLulus = 0, totalTidakLulus = 0, totalLulus = 0;
        double total = 0, rerata;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = input.nextInt();
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " lulus");
                totalLulus += nilaiMhs[i];
                mhsLulus ++;
            } else {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " tidak lulus");
                totalTidakLulus += nilaiMhs[i];
                mhsTidakLulus ++;
            }
        }
        
        System.out.println("Total nilai: " + total);
        rerata = total / nilaiMhs.length;
        double rerataLulus = (mhsLulus > 0) ? totalLulus / mhsLulus : 0;
        double rerataTidakLulus = (mhsTidakLulus > 0) ? totalTidakLulus / mhsTidakLulus :0;

        System.out.println("Nilai rata-rata: " + rerata);
        System.out.println("Jumlah mahasiswa lulus: " + mhsLulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + mhsTidakLulus);
        System.out.println("Nilai rata-rata lulus: " + rerataLulus);
        System.out.println("Nilai rata-rata tidak lulus: " + rerataTidakLulus);
    }
}
