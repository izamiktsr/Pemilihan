import java.util.Scanner;

public class PemilihanHariDenganIf18{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = scanner.nextInt();

        if (angka >= 1 && angka <= 5) {
            System.out.println("Weekday");
        } else if (angka == 6 || angka == 7) {
            System.out.println("Weekend");
        } else {
            System.out.println("Invalid Number");
        }
    }
}