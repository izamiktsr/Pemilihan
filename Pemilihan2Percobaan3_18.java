import java.util.Scanner;

public class Pemilihan2Percobaan3_18 {
    public static void main(String[] args) {
        // Membuat scanner untuk input
        Scanner input = new Scanner(System.in);

        // Input data kategori dan penghasilan
        System.out.print("Masukkan kategori (pekerja/pebisnis): ");
        String kategori = input.nextLine();
        
        System.out.print("Masukkan penghasilan: ");
        int penghasilan = input.nextInt();
        
        // Variabel untuk pajak dan gaji bersih
        double pajak = 0;
        double gajiBersih = 0;

        // Menentukan besaran pajak berdasarkan kategori dan penghasilan
        if (kategori.equalsIgnoreCase("pebisnis")) {
            if (penghasilan <= 3500000) {
                pajak = 0.2;
            } else {
                pajak = 0.25;
            }
        } else if (kategori.equalsIgnoreCase("pekerja")) {
            if (penghasilan <= 2000000) {
                pajak = 0.1;
            } else if (penghasilan <= 3000000) {
                pajak = 0.15;
            } else if (penghasilan <= 2500000) {
                pajak = 0.15;
            } else {
                pajak = 0.2;
            }
        } else {
            System.out.println("Kategori salah.");
            System.exit(0);  // Mengakhiri program jika kategori tidak valid
        }

        // Menghitung gaji bersih
        gajiBersih = penghasilan - (penghasilan * pajak);
        
        // Menampilkan gaji bersih
        System.out.println("Gaji bersih: Rp " + gajiBersih);
        
        // Menutup scanner
        input.close();
    }
}
