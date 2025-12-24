1. Penjelasan Proses Pemanggilan Fungsi Rekursif:
Ketika memanggil hitungPangkat(2, 5), berikut adalah proses berulang yang terjadi:
Pemanggilan 1: hitungPangkat(2, 5)
   → y ≠ 0, maka: 2 × hitungPangkat(2, 4)
   
Pemanggilan 2: hitungPangkat(2, 4)
   → y ≠ 0, maka: 2 × hitungPangkat(2, 3)
   
Pemanggilan 3: hitungPangkat(2, 3)
   → y ≠ 0, maka: 2 × hitungPangkat(2, 2)
   
Pemanggilan 4: hitungPangkat(2, 2)
   → y ≠ 0, maka: 2 × hitungPangkat(2, 1)
   
Pemanggilan 5: hitungPangkat(2, 1)
   → y ≠ 0, maka: 2 × hitungPangkat(2, 0)
   
Pemanggilan 6: hitungPangkat(2, 0)
   → y = 0, maka: return 1 (BASIS REKURSIF)
Proses Pengembalian Nilai (dari dalam ke luar):
hitungPangkat(2, 0) = 1
hitungPangkat(2, 1) = 2 × 1 = 2
hitungPangkat(2, 2) = 2 × 2 = 4
hitungPangkat(2, 3) = 2 × 4 = 8
hitungPangkat(2, 4) = 2 × 8 = 16
hitungPangkat(2, 5) = 2 × 16 = 32
Hasil akhir: 2⁵ = 32
2. Kode untuk Mencetak Deret Perhitungan:
Saya sudah memperbarui kode di artifact agar menampilkan hasil dengan format yang lebih jelas. Untuk menampilkan deret perhitungan lengkap seperti "2x2x2x2x2x1", kita perlu memodifikasi fungsi atau menambahkan fungsi baru untuk mencetak prosesnya.