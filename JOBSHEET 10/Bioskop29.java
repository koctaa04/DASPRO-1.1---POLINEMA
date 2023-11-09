
/**
 * Bioskop29
 */
public class Bioskop29 {

    public static void main(String[] args) {
        String[][] penonton = new String[4][2];
        penonton[0][0] = "Amin";
        penonton[1][0] = "Bena";
        penonton[2][0] = "Candra";
        penonton[3][0] = "Dela";
        penonton[0][1] = "Eka";
        penonton[1][1] = "Farhan";
        penonton[2][1] = "Gisel";


        System.out.println(penonton.length);
        System.out.println(penonton[1].length);
        System.out.println(penonton[2].length);
        System.out.println(penonton[3].length);

        for (int i = 0; i < 4; i++) {
            System.out.println(penonton[i][0] + " " + penonton[i][1]);
        }
        
        for (int i = 0; i < penonton.length; i++) {
            System.out.println("panjang baris ke-" + i + " = " + penonton[i].length);
        }

        for (String[] barisPenonton : penonton) {
            System.out.println("panjang baris = " + barisPenonton.length);
        }

        System.out.println("penonton pada baris ke 3: ");
        for (int i = 0; i < penonton[2].length; i++) {
            System.out.println(penonton[2][i]);
        }
        
        System.out.println("penonton pada baris ke 3: ");
        for (String penontonBaris3 : penonton[2]) {
            System.out.println(penontonBaris3);
        }

        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Penonton pada baris ke-" + i + ":" + String.join(", ", penonton[i]));
        }
    }
}