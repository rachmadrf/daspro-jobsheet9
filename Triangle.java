
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();
        int i = 1; //dimulai dari 1 untuk menghindari baris kosong
        while (i <= N) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println(); //seharusnya ditambahkan
        }
    }
}