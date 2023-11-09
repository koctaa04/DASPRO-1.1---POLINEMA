/**
 * BubleShortExample29
 */
public class BubleShortExample29 {

    public static void main(String[] args) {
        int[] data = {1, 6, 3, 2, 5, 4};
        int temp = 0;

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if (data[i] < data[j]) {
                    temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                    
                }
            }
        }

        System.out.println("Hasil Pengurutan");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }

    }
}