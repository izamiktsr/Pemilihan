import java.util.Scanner;

public class Pemilihan2Percobaan2_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("-------------------------------------");

        System.out.print("Masukkan angka dari menu yang dipilih = ");
        int pilihan_menu = sc.nextInt();
        sc.nextLine();

        System.out.print("Apakah punya member (y/n)? = ");
        String member = sc.nextLine();
        System.out.println("-------------------------------------");

        double harga = 0;
        double diskon = 0;
        double total_bayar = 0;

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");

            switch (pilihan_menu) {
                case 1:
                    harga = 14000;
                    System.out.println("Harga ricebowl = " + harga);
                    break;
                case 2:
                    harga = 3000;
                    System.out.println("Harga ice tea = " + harga);
                    break;
                case 3:
                    harga = 15000;
                    System.out.println("Harga bundling = " + harga);
                    break;
                default:
                    System.out.println("Masukkan pilihan menu dengan benar!");
                    return;
            }

            total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + total_bayar);
        } else if (member.equalsIgnoreCase("n")) {
            switch (pilihan_menu) {
                case 1:
                    harga = 14000;
                    System.out.println("Harga ricebowl = " + harga);
                    break;
                case 2:
                    harga = 3000;
                    System.out.println("Harga ice tea = " + harga);
                    break;
                case 3:
                    harga = 15000;
                    System.out.println("Harga bundling = " + harga);
                    break;
                default:
                    System.out.println("Masukkan pilihan menu dengan benar!");
                    return;
            }

            total_bayar = harga;
            System.out.println("Total bayar = " + total_bayar);
        } else {
            System.out.println("Member tidak Valid");
        }

        System.out.println("--------------------------------------");
    }
}
