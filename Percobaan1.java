public class Percobaan1 {

    static int faktorialRekursif(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * faktorialRekursif(n - 1);
        }
    }

    static int faktorialIteratif(int n) {
        int hasil = 1;
        for (int i = n; i >= 1; i--) {
            hasil = hasil * i;
        }
        return hasil;
    }

    public static void main(String[] args) {
        int angka = 5;

        System.out.println("Faktorial Rekursif dari " + angka + " = "
                + faktorialRekursif(angka));

        System.out.println("Faktorial Iteratif dari " + angka + " = "
                + faktorialIteratif(angka));
    }
}
