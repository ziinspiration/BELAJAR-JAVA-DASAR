package ArrayRecord;

import java.util.Scanner;

public class TabMhs {
	int N=2;
	Mahasiswa[] a= new Mahasiswa[N];
	
	void IsiArray() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < N; i++) {
            a[i] = new Mahasiswa();
            System.out.print("Elemen ke-" + i + ": ");
            System.out.print("NIM: ");
            a[i].nim = sc.nextInt();
            System.out.print("Nama: ");
            a[i].nama = sc.next();
            System.out.print("IPK: ");
            a[i].ipk = (float) sc.nextFloat();
        }
    }

    void ShowArray() {
        for (int i = 0; i < N; i++) {
            System.out.println("Data ke-" + i + ": NIM: " + a[i].nim + ", Nama: " + a[i].nama + ", IPK: " + a[i].ipk);
        }
    }
	public static void main(String[] args) {
		TabMhs A=new TabMhs();
		A.IsiArray();A.ShowArray();
	}

	
}
