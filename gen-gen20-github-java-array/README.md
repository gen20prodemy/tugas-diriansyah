## Penjelasan tugas java struktur

# List.java
Pada class List terdapat beberapa method yaitu yang digunakan:
1. Method inputArray1D, method ini bertujuan untuk memasukkan input berupa array integer oleh user. Pertama user memasukkan panjang array integer menggunakan class scanner, lalu buat array baru dengan panjang array yang sudah ditentukan. Kemudian masukkan value pada array menggunakan looping for, perulangan dilakukan sebanyak panjang array. Kemudian kembalikan array dengan return.

2. Method inputArray2D, method ini bertujuan untuk memasukkan input berupa array integer 2 dimensi oleh user. Pertama user memasukkan panjang array integer dari array induk dan array didalamnya menggunakan class scanner, lalu buat array 2 dimensi baru dengan panjang array yang sudah ditentukan. Kemudian masukkan value pada array menggunakan looping for nested, perulangan dilakukan sebanyak panjang array. Kemudian kembalikan array dengan return.

3. Method sumArray, method ini akan mengembalikan hasil penjumlahan dari semua elemen pada array. Pertama definisikan variabel integer result = 0, kemudian buat looping foreach untuk menjumlahkan tiap elemen array dan result. Kemudia kembalikan nilai result dengan return.

4. Method sumArray2D, method ini akan mengembalikan array dari hasil penjumlahan array yang di dalam array. Pertama buat array baru dengan panjang baris pada array 2 dimensi dan variabel count untuk dijadikan index pada array yang telah dibuat. masukkan hasil penjumlah pada array di dalam array menggunakan looping foreach menggunkan method sumArray. Hasil array akan dikembalikan dengan return.

5. method reverse, method ini akan mengubah urutan dari elemen array secara terbalik. Pertama buat array integer baru dengan panjang array input. Masukkan value dari elemen array yang telah di input menggunakan looping for, value pada array index pertama akan dimasukkan kedalam array baru index terakhir. Nilai array baru akan dikembalikkan dengan return.

6. method cetakArray dengan parameter array 1 dimensi, method ini akan mencetak array ke konsol menggunakan library java.util.Arrays.

7. method cetakArray dengan parameter array 2 dimensi, method ini akan mencetak array 2 dimensi ke konsol menggunakan library java.util.Arrays.

8. method main, method ini akan menjalankan method-method sebelumnya untuk menampilkan jawaban dari input yang diberikan oleh user.

# InputReader.java
Pada class InputReader ini hanya terdapat 1 method yaitu method main, buat objek dengan menggunakan class FileReader dan BufferedReader untuk membuka dan membaca file txt. Setelah itu tampung isi file tersebut kedalam varibel menggunakan readline().

# OutputReader.java
Pada class InputReader ini hanya terdapat 3 method yaitu:
1. method main, user akan memasukkan input berupa string dengan menggunakan method yang telah dibuat yaitu inputArrStr. Lalu buat objek menggunakan class FileWriter dan BufferedWriter untuk menulis input kedalam file txt menggunakan .write().

2. method inputArrStr, method ini bertujuan untuk memasukkan input berupa array String oleh user. Pertama user memasukkan panjang array integer menggunakan class scanner, lalu buat array baru dengan panjang array yang sudah ditentukan. Kemudian masukkan value pada array menggunakan looping for, perulangan dilakukan sebanyak panjang array. Kemudian kembalikan array dengan return.

3. method cetakArray, method ini akan mencetak array ke konsol menggunakan library java.util.Arrays.