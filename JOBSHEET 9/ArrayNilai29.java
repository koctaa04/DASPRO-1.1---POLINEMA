import java.util.Scanner;

public class ArrayNilai29 {
    public static void main(String[] args) {
        Scanner sc29 = new Scanner(System.in);
        int[] nilaiAkhir = new int [10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Masukkan Nilai ke-" + (i + 1));
            nilaiAkhir[i] = sc29.nextInt();
        }
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.println("Nilai ke-" + (i + 1) + " = " + nilaiAkhir[i]);
            if (nilaiAkhir [i] > 70 && nilaiAkhir [i] <= 100) {
                System.out.println("Nilai Mahasiswa ke - " + (i + 1) + " Lulus");    
            } else if (nilaiAkhir [i] < 70 && nilaiAkhir [i] >= 0) {
                System.out.println("Nilai Mahasiswa ke - " + (i + 1) + " Tidak Lulus");    
            } else {
                System.out.println("Nilai Mahasiswa ke - \" + (i + 1) + \" tidak valid");    
            }
        }
    }
}
