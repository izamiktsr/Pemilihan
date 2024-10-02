import java.util.Scanner;

public class Pemilihan2Percobaan2_18 {
    public static void main(String[] args) {
        // Membuat scanner untuk input
        Scanner input = new Scanner(System.in);
        System.out.println("_________________________");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("_________________________");
        System.out.println("1. RIcebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("_____________________________________");
        System.out.println("masukkan angka dari menu yang dipilh = ");
        pilihan_menu = sc.nextInt();
        sc.nextLine();
        System.out.println("Apakah punya member (y/n) ? = ");
        member = sc.nextLine();
        System.out.println("_____________________________________");

        // Input Data 
        if (member.equalsIgnoreCase(anotherString:"y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);

            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return; 
            } 

            // Menghitung totaln bayar setelah diskon 
            total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + total_bayar);
        }

        else if (member.equalsIgnoreCase(anotherString:"n")) {
            if (pilihan_menu ==1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + total_bayar);
            } else if (pilihan_menu == 2) {
                harga = 3000; 
                System.out.println("Harga ice tea = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar")
                retrun;

            }
            // Menghitung total bayar
            System.out.println("Toal bayar = " + harga);
            
        } else { 
            System.out.println("Member tidak valid");
        }    
        System.out.println("_____________________________________");
