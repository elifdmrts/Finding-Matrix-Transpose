public class Main {

    // Matrisi ekrana yazdıran yardımcı fonksiyon
    public static void matrisiYazdir(int[][] matris) {
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                System.out.print(matris[i][j] + "    ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Matrisi tanımla
        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6}
        };

        // Matrisin boyutlarını al
        int satirSayisi = matris.length;
        int sutunSayisi = matris[0].length;

        // Transpoz matrisi tanımla
        int[][] transpozMatris = new int[sutunSayisi][satirSayisi];

        // Matrisin transpozunu al
        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                transpozMatris[j][i] = matris[i][j];
            }
        }

        // Matrisi ekrana yazdır
        System.out.println("Matris:");
        matrisiYazdir(matris);

        // Transpoz matrisi ekrana yazdır
        System.out.println("\nTranspoz:");
        matrisiYazdir(transpozMatris);
    }
}