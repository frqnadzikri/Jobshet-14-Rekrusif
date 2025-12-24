import java.util.Scanner;

public class Tugas {
    
    static int hitungRekursif(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + hitungRekursif(n - 1);
        }
    }
    
    // Fungsi iteratif untuk menghitung total
    static int hitungIteratif(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total = total + i;
        }
        return total;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.println("Masukkan jumlah angka yang ingin dihitung (N): ");
        n = sc.nextInt();
        
        // Menampilkan input angka dan totalnya
        System.out.println("\n=== MENGGUNAKAN REKURSIF ===");
        for (int i = n; i >= 1; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
        }
        System.out.println("Total dari " + n + " angka yang dimasukkan adalah: " + hitungRekursif(n));
        
        System.out.println("\n=== MENGGUNAKAN ITERATIF ===");
        System.out.println("Total dari " + n + " angka adalah: " + hitungIteratif(n));
        sc.close();
    }
}
