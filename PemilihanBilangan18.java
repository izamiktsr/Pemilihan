import java.util.Scanner;

public class PemilihanBilangan18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan sebuah angak: ");
        int angka = sc.nextInt();
        
        if (angka % 2 == 0)
        {
            System.out.println("Angka " + angka + " termasuk bilangan genap");
        }
        else
        {
            System.out.println("Angka " + angka + " termasuk bilangan ganjil");
        }
    }
}