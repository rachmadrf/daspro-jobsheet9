import java.util.Scanner;

public class Tugas2_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahAtletPerCabor = 5; // Setiap cabang olahraga memiliki 5 atlet

        System.out.print("Masukkan jumlah politeknik yang mendaftar: ");
        int jumlahPoliteknik = sc.nextInt();
        sc.nextLine(); // Membersihkan newline setelah input integer

        // Perulangan untuk setiap politeknik
        for (int p = 1; p <= jumlahPoliteknik; p++) {
            System.out.println("\nPoliteknik ke-" + p + ":");

            // Menggunakan perulangan untuk 4 cabang olahraga dengan kondisi untuk tiap nama cabor
            for (int c = 1; c <= 4; c++) {
                String namaCabor = "";
                switch (c) {
                    case 1 -> namaCabor = "Badminton";
                    case 2 -> namaCabor = "Tenis Meja";
                    case 3 -> namaCabor = "Basket";
                    case 4 -> namaCabor = "Bola Voli";
                }

                System.out.println("Cabang olahraga: " + namaCabor);
                for (int a = 1; a <= jumlahAtletPerCabor; a++) {
                    System.out.print("Masukkan nama atlet " + a + ": ");
                    String namaAtlet = sc.nextLine();
                    System.out.println("Atlet " + a + " dari " + namaCabor + ": " + namaAtlet);
                }
            }
        }
    }
}