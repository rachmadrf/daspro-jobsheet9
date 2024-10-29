import java.util.Scanner;

public class Tugas1_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;

        // Meminta input hingga N minimal 3
        do {
            System.out.print("Masukkan nilai N (minimal 3) = ");
            N = sc.nextInt();

            if (N < 3) {
                System.out.println("Nilai N harus minimal 3. Silakan coba lagi.");
            }
        } while (N < 3);

        // Membuat persegi angka
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // Cek apakah berada di baris atau kolom tepi
                if (i == 0 || i == N - 1 || j == 0 || j == N - 1) {
                    System.out.print(N + " ");
                } else {
                    System.out.print("  "); // Bagian dalam kosong
                }
            }
            System.out.println();
        }
    }
}