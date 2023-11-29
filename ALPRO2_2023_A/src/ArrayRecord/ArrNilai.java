package ArrayRecord;
import java.util.Scanner;
public class ArrNilai {

	int N=2;
	Nilai[] a = new Nilai[N];
	
	void IsiLarik() {	
		Scanner sc=new Scanner(System.in);
		for(int i = 0; i < N;i++) {
		Nilai x=new Nilai();
		System.out.println("elemen ke: "+i);
		x.BacaNilai();
		a[i]=x;
		
	}
		
	}
void ShowArray() {
	for(int i=0;i<N;i++) {
		System.out.println("Elemen ke "+i+": ");
			a[i].TampilNilai();
	}
}
public static void main(String[] args) {
		ArrNilai A=new ArrNilai();
		A.IsiLarik();
		A.ShowArray();
		}	
	}
