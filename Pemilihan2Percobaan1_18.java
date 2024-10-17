import java.util.Scanner;

public class Pemilihan2Percobaan1_18 {
    public static void main(String[] args) {
        // Membuat scanner untuk input
        Scanner input = new Scanner(System.in);
        
        // Meminta input tahun dari user
        System.out.print("Masukkan tahun: ");
        int tahun = input.nextInt();
        
        // Menentukan apakah tahun adalah kabisat atau bukan
        if ((tahun % 4 == 0 && tahun % 100 != 0) || tahun % 400 == 0) {
            System.out.println("Tahun Kabisat");
            } else {
            System.out.println("Bukan Tahun Kabisat");
            } 
        
        
        // Menutup scanner
        input.close(); }
    }
    
        

    
