# Penjelasan tugas java struktur

## TryCatch.java
Pada class TryCatch terdapat main method, user melakukan input pada 2 variable string yaitu name dan age menggunakan class scanner. Kemudian convert string ke integer menggunakan try catch pada varibel string age jika varible tersebut selain string angka, maka akan masuk ke dalam catch NumberFormatException, jika merupakan string angka akan diperiksa kembali menggunkan custom exception yang telah dibuat di class Exception untuk memerika jika angka tersebut negatif maka akan masuk ke catch IllegalArgumentException di class Exception.

## ThrowAble.java
Pada class ThrowAble ini hanya terdapat 1 method yaitu method main, sebuah array integer yang didefinisikan dengan nama arr yang isinya 3 elemen, user akan memasukkan inputan integer berupa index dari array tersebut jika index yang dimasukkan melebihi index pada array atau negatif maka akan masuk ke catch throwable.

## Exception.java
Pada class Exception ini terdapat 2 method yaitu:
1. method umur yang isinya berupa if else yang mengkondisikan jika parameter integer a kurang dari 0, maka akan dibuat throw IllegalArgumentException dengan pesan "Umur tidak ada negatif", jika tidak maka akan mengembalikan nilai a.

2. method error, method ini bertujuan untuk membuat custom exception jika integer dari method umur negatif akan masuk catch yang menampilkan pesan yang telah dibuat.