
import java.util.Scanner;

public class RataNilai21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int i, j;
        float nilai, totalNilai, rataNilai;

        i = 1;
        while (i<=5) {
            System.out.println("Input nilai mahasiswa ke " + i);
            totalNilai = 0;
            for (j = 1; j<= 5; j++) {
                System.out.print("Nilai ke-" + j + " = ");
                nilai = sc.nextFloat();
                totalNilai += nilai;
            }
            rataNilai = totalNilai/5;
            i++;
            System.out.println("Rata-rata nilai mahasiswa ke " + i + " adalah " + rataNilai);
            System.out.println();
        }
    }
}