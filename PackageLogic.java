import java.util.Scanner;

public class PackageLogic {
    // Membuat tampilan menu
    static void menu() {
        System.out.println("<=====================>");
        System.out.println("Menu Ganjil or Genap");
        System.out.println("1. Cek Ganjil or Genap");
        System.out.println("2. Print Ganjil or Genap dengan Limit");
        System.out.println("3. Exit");
        System.out.println("<=====================>");
        System.out.println("SILAH PILIH NOMOR DIATAS :");

    }

    // Mencetak angka ganjil atau genap hingga limit tertentu
    static void printGanjilGenap(int Limit, String pilihan) {
        if (Limit < 1) {
            System.out.println("Inputan Salah ");
            return;
        }
        if (pilihan.equalsIgnoreCase("Ganjil")) {
            System.out.println("Print bilangan Ganjil antara 1 - " + Limit + " !! ");
            for (int i = 1; i <= Limit; i += 2) {
                System.out.print(i + ", ");
            }
        } else if (pilihan.equalsIgnoreCase("Genap")) {
            System.err.println("Print bilangan Genap antara 1 - " + Limit + " !!");
            for (int i = 2; i <= Limit; i += 2) {
                System.out.print(i + ", ");
            }
        } else {
            System.out.println("Input Tidak Valid");
        }
        System.out.println("\n=====================");
    }

    // Cek Bilangan Ganjil or Genap

    static String cekGanjirorGenap(int input) {
        if (input < 1) {
            return "Invalid Input !!";
        }
        return (input % 2 == 0) ? "Genap" : "Ganjil";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan = 0;
        while (pilihan != 3) {
            menu();
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan Bilangan yang diinginkan :");
                    int bilangan = scanner.nextInt();
                    System.err.println(cekGanjirorGenap(bilangan));
                    System.out.println("=====================");
                    break;
                case 2:
                    System.out.println("Pilih Ganjil or Genap :");
                    String jenis = scanner.next();
                    System.out.println("Masukkan Limit :  ");
                    int limit = scanner.nextInt();
                    printGanjilGenap(limit, jenis);
                    break;
                case 3:
                    System.out.println("Keluar dari Program");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    System.out.println("=====================");
                    break;
            }
        }
    }
}