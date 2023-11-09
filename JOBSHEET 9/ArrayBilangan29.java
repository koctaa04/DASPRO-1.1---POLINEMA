public class ArrayBilangan29 {
    public static void main(String[] args) {
        // inisialisasi elemen array satu satu
        int[] arrayBil1 = new int [4];
        arrayBil1[0] = 1;
        arrayBil1[1] = 2;
        arrayBil1[2] = 3;
        arrayBil1[3] = 4;

        // menampilkan elemen array
        System.out.println(arrayBil1[0]);
        System.out.println(arrayBil1[1]);
        System.out.println(arrayBil1[2]);
        System.out.println(arrayBil1[3]);

        // inisialisasi elemen array sekaligus
        double[] arrayBil2 = {1.5 , 2.3, 3.3, 4.2};

        // menampilkan elemen dengan for
        for (int i = 0; i < arrayBil2.length; i++) {
            System.out.println(arrayBil2[i]);
        }



    }
}