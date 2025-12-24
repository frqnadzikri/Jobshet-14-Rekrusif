Jawaban Pertanyaan:
1. Base Case dan Recursion Call pada Percobaan3:
Base Case:
if (tahun == 0) {
    return saldo;
}
Base case adalah kondisi yang menghentikan rekursif. Ketika tahun = 0, fungsi langsung mengembalikan nilai saldo.
Recursion Call:
else {
    return (1.11 * hitungLaba(saldo, tahun - 1));
}
Recursion call adalah bagian di mana fungsi memanggil dirinya sendiri dengan parameter tahun dikurangi 1.

2. Trace Fase Ekspansi dan Fase Substitusi hitungLaba(100000, 3):
FASE EKSPANSI:
hitungLaba(100000, 3) → 1.11 × hitungLaba(100000, 2)
hitungLaba(100000, 2) → 1.11 × hitungLaba(100000, 1)
hitungLaba(100000, 1) → 1.11 × hitungLaba(100000, 0)
hitungLaba(100000, 0) → return 100000
FASE SUBSTITUSI:
hitungLaba(100000, 0) = 100000
hitungLaba(100000, 1) = 1.11 × 100000 = 111000
hitungLaba(100000, 2) = 1.11 × 111000 = 123210
hitungLaba(100000, 3) = 1.11 × 123210 = 136763.1
Hasil Akhir: 136763.1