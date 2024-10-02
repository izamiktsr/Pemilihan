import java.util.Scanner;

public class Pemilihan2Percobaan1_18 {
    public static void main(String[] args) {
        // Membuat scanner untuk input
        Scanner input = new Scanner(System.in);
        
        // Meminta input tahun dari user
        System.out.print("Masukkan tahun: ");
        int tahun = input.nextInt();
        
        // Menentukan apakah tahun adalah kabisat atau bukan
        if (tahun % 4 == 0) {
            if (tahun % 100 != 0) {
                System.out.println(tahun + " adalah Tahun Kabisat.");
            } else {
                System.out.println(tahun + " bukan Tahun Kabisat.");
            }
        } else {
            System.out.println(tahun + " bukan Tahun Kabisat.");
        }
        
        // Menutup scanner
        input.close(); }
    }
        

    
