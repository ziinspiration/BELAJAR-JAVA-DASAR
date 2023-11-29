package ArrayRecord;

import java.util.Scanner;
public class Mahasiswa {

	int nim;
	String nama;
	float ipk;

	void BacaMahasiswa() {
Scanner sc= new Scanner(System.in);
System.out.print("nim: "); nim=sc.nextInt();
System.out.print("nama: "); nama=sc.next();
System.out.print("ipk: "); ipk=sc.nextFloat();
}

	

	void TampilMahasiswa() {
		System.out.print("Data: "+nim+","+nama+","+ipk);
	}

	}


