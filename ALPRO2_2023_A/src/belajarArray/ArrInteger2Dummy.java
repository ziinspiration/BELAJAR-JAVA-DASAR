package belajarArray;  // Ini adalah deklarasi paket (package) untuk kelas ArrInteger

import java.util.Scanner;  // Mengimpor pustaka (library) Scanner untuk menerima input pengguna

public class ArrInteger2Dummy {  // Mendefinisikan kelas ArrInteger
    int N = 5;  // Mendeklarasikan variabel N dengan nilai 5
    int[] a = new int[N];  // Membuat sebuah array a dengan panjang N (5) untuk menyimpan bilangan bulat

    void InitArray() {  // Mendefinisikan metode InitArray
        a[0] = 45;  // Mengisi elemen ke-0 array a dengan nilai 45
        a[1] = 18;  // Mengisi elemen ke-1 array a dengan nilai 18
        a[2] = 39;  // Mengisi elemen ke-2 array a dengan nilai 39
        a[3] = 22;  // Mengisi elemen ke-3 array a dengan nilai 22
        a[4] = 35;  // Mengisi elemen ke-4 array a dengan nilai 35
    }

    void ShowArray() {  // Mendefinisikan metode ShowArray
        for (int i = 0; i < N; i++) {  // Memulai perulangan for dari 0 hingga N-1 (0-4)
            System.out.println("Nilai ke : " + i + " " + a[i]);  // Mencetak nilai elemen array a
        }
    }

    void InputArray() {  // Mendefinisikan metode InputArray
        Scanner sc = new Scanner(System.in);  // Membuat objek Scanner untuk menerima input dari pengguna
        for (int i = 0; i < N; i++) {  // Memulai perulangan for dari 0 hingga N-1 (0-4)
            System.out.print("elemen ke: " + i + ":");  // Mencetak pesan untuk memasukkan elemen ke-i
            a[i] = sc.nextInt();  // Menerima input integer dari pengguna dan menyimpannya dalam array a
        }
    }

    public static void main(String[] args) {  // Metode utama (entry point) program
        ArrInteger2Dummy B = new ArrInteger2Dummy();  // Membuat objek B dari kelas ArrInteger
        B.InitArray();  // Memanggil metode InitArray untuk mengisi array B
        B.ShowArray();  // Memanggil metode ShowArray untuk menampilkan isi array B

        ArrInteger2Dummy A = new ArrInteger2Dummy();  // Membuat objek A dari kelas ArrInteger
        A.InputArray();  // Memanggil metode InputArray untuk mengisi array A dari input pengguna
        A.ShowArray();  // Memanggil metode ShowArray untuk menampilkan isi array A
    }
}
