1.  Apa yang dimaksud dengan fungsi rekursif?

Fungsi rekursif adalah fungsi yang memanggil dirinya sendiri untuk menyelesaikan suatu masalah, dengan syarat memiliki kondisi berhenti (base case) agar tidak terjadi perulangan tanpa akhir.

Contoh pada faktorial:

Jika n == 0, maka hasilnya 1 (kondisi berhenti)

Jika n > 0, fungsi memanggil dirinya sendiri dengan nilai n - 1

2. Pada Percobaan 1, apakah hasil fungsi faktorialRekursif() dan faktorialIteratif() sama? Jelaskan perbedaannya!

Ya, hasilnya sama.
Kedua fungsi menghasilkan nilai faktorial yang sama, misalnya:

5! = 120

Perbedaan alur program fungsi rekursif dan iteratif adalah :
Pada fungsi rekursif, proses perhitungan dilakukan dengan cara fungsi memanggil dirinya sendiri secara berulang hingga mencapai kondisi berhenti, kemudian hasil dikembalikan secara bertahap. Sedangkan pada fungsi iteratif, proses perhitungan dilakukan menggunakan perulangan tanpa pemanggilan fungsi berulang, sehingga alur program berjalan lebih sederhana dan efisien dalam penggunaan memori.       |
