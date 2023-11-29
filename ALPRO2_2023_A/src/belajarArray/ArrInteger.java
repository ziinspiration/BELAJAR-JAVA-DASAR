package belajarArray;

import java.util.Scanner;

public class ArrInteger {
		int N=5;
		int [] a=new int[N];
		
	void InitArray() {
		a [0]=45;
		a [1]=18;
		a [2]=39;
		a [3]=22;
		a [4]=35;
		
	}
	
	void ShowArray () {
		for (int i=0;i<N;i++) {
			System.out.println("Nilai ke : "+i+" "+a[i]);
		}
		
	}
	
	void NilaiMaks() {
		int imax=0;
		for (int i=0;i<N;i++) {
					if (a[i]>a[imax])
									imax=i;
		}
		System.out.println("Nilai terbesar= : "+ a[imax]);;
		System.out.println("di index ke = : "+ imax);
	}
	
	void InputArray() {
		//InputArray = IsiLarik
		Scanner sc= new Scanner(System.in);
		for (int i=0;i<N;i++) {
		System.out.print("elemen ke: "+i+":"); a[i]=sc.nextInt();
		}
	}
	
	void Rata() {
		int T=0;
		for (int i=0;i<N;i++){
			T=T+a[i];
		
	}
	double Rata=T/N;
	System.out.println("Rata-rata= : "+ Rata);
}
	
		int Get(int i) {//mengembalikan isi array yang ke i
			return a[i];
		}
		
		void Set(int i, int x) {//mengubah nilai elemen ke i
			a[i]=x;
		}
		
		static void Copy(ArrInteger A,ArrInteger B) {
			int x;
			for (int i=0;i<A.N;i++){
		x=A.Get(i);
		B.Set(i, x);
			
		}
	}
		
	public static void main (String[] args) {
		
		ArrInteger B= new ArrInteger () ;
		B.InitArray();
		B.ShowArray();
		B.Rata();
		B.NilaiMaks();
		ArrInteger A= new ArrInteger();
		A.InputArray();A.ShowArray(); A.Rata();
		A.NilaiMaks();
	}
}
