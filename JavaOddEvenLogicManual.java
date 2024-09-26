public class JavaOddEvenLogicManual {
    // Menampilkan Menu

    // Menggunakan Method
    // static void Menu() {
    // System.out.println("=== Menu ===");
    // System.out.println("1. Ganjil");
    // System.out.println("2. Genap");
    // System.out.println("3. Exit");
    // System.out.println("Silahkan Pilih Opsi :");
    // }

    /**
     * output jika Ganjil 7 = 1, 3, 5, 7
     * output jika Genap 8 = 2, 4, 6, 8
     * 
     * @param Limit   minimal 1, tidak boleh 0 atau dibawahnya
     * @param pilihan pilihan ganjil genap selain itu Invalid
     */

    static void printGanjilGenap(int Limit, String pilihan) {
        if (Limit < 0) {
            System.out.println("Invalid , Limit minimal 1");
            return;
        }
        if (pilihan.equalsIgnoreCase("Ganjil")) {
            for (int i = 1; i <= Limit; i += 2) {
                System.out.println(i + " ");
            }
        } else if (pilihan.equalsIgnoreCase("Genap")) {
            for (int i = 2; i <= Limit; i += 2) {
                System.out.println(i + " ");
            }
        } else {
            System.out.println(" Invalid, Hanya 'Ganjil' dan 'Genap'");
        }
    }

    /**
     * 
     * @param input bilangan
     * @return Ganjil/Genap/Invalid input !! jika input <1
     */

    static String cekGannjilGenap(int input) {
        if (input < 1) {
            return "Invalid Input";
        }
        if (input % 2 == 0) {
            return "Genap";
        } else {
            return "Ganjil";
        }
    }

    public static void main(String[] args) {
        // Menu();
        printGanjilGenap(7, "Ganjil");
        printGanjilGenap(8, "Genap");
        System.out.println(cekGannjilGenap(7));
        System.out.println(cekGannjilGenap(8));
    }
}