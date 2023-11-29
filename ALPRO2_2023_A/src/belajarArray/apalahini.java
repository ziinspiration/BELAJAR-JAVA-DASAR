package belajarArray;


import java.util.Scanner; 
 
public class apalahini{ 
 	int N=8; 
 	char[] a=new char[N]; 
 	 
 	void IsiArray() { 	 	 
 	    Scanner sc= new Scanner(System.in);   
    System.out.print("String: ");String S=sc.nextLine();             int l=S.length();System.out.println("Panjang string: "+l);         for (int i=0;i<N;i++){              a[i]=S.charAt(i); 
        } 
} 
 	 
 	void TampilArray() {  	 	for (int i=0;i<N;i++) { 
 	 	 	 System.out.println("array ke "+i+": "+ a[i]); 
 	 	} 
 	} 
 	 
 void CariMaks() {   char maks=a[0];int imaks=0;   for (int i=1;i<N;i++) { 
 	 	 	 if (a[i]>maks) { 
 	 	 	 	 maks=a[i];  	 	 	 	 imaks=i; 
 	 	 	 } 
 	 	} 
 	 	 System.out.println("Nilai terbesar = "+maks); 
 	 	 System.out.println("Nilai terbesar di indeks = "+imaks); 
 	} 
 	 
 	void CariMaks2() { 
 	 	int imaks=0; 
 	 	for (int i=1;i<N;i++) {  	 	 	 if (a[i]>a[imaks]) {  	 	 	 	 imaks=i; 
 	 	 	 } 
 	 	} 
 	 	 System.out.println("Nilai terbesar = "+a[imaks]); 
 	 	 System.out.println("Nilai terbesar di indeks = "+imaks); 
 	} 
 	 
 void CekPalindrom() {   boolean lanjut=true; 
 	 	int i=0; 
 	 	while ((i<N/2)&& (lanjut==true)) {  	 	 	 if (a[i]==a[N-i-1])  
 	 	 	     i++; 
 	 	 	 else 
 	 	 	 	 lanjut=false; 
 	 	} 
    System.out.println("Apakah kata ini palindrom  :"+lanjut); 
} 
 
char GetElemen(int i) { 
	 	return a[i]; 
} 
 
 	void SetElemen(int i, char x) { 
 	 	a[i]=x; 
 	} 
 	 
 	static boolean IsSamaAB(ArrayChar A, ArrayChar B) { 
  boolean sama=true;   int i=0; 
  while ((i<A.N) && (sama==true)) {        if (A.GetElemen(i) == B.GetElemen(i))           i=i+1;        else sama=false; 
 	 	}  	 	 
 	 	return sama; 
    } 
 	 
 	static void SalinLarikA_B(ArrayChar A, ArrayChar B) { 
 	 	char x; 
 	 	for (int i=0;i<A.N;i++) { 
 	      	x =A.GetElemen(i); 
 	      	B.SetElemen(i, x); 
 	 	} 
 
    } 	 	B.TampilArray(); 
 	 	 
 	static void Membalikkata(ArrayChar A, ArrayChar B) { 
 	 	char x; 
 	 	for (int i=0;i<A.N;i++) {  	      	x =A.GetElemen(i);  	      	B.SetElemen(A.N-i-1, x); 
 	 	} 
 	 	B.TampilArray(); 
    } 
 	 
 	 
 	  public static void main(String[] args) { 
 	 	  ArrayChar A=new ArrayChar(); 
 	 	  ArrayChar B=new ArrayChar(); 
	 	  ArrayChar T=new ArrayChar(); 
 	   
	 	  System.out.println("Isi Array A"); 
	 	  A.IsiArray(); 
	 	  A.TampilArray(); 
	// 	  A.CariMaks(); 
 	 	  A.CariMaks2(); 
 	 	  A.CekPalindrom(); 
 	 	  Membalikkata(A, T); 
 	 	  SalinLarikA_B(T, A); 
 	 	  A.TampilArray(); 
 	 	   
 	 	  System.out.println("Isi Array A"); 
 	 	  B.IsiArray(); 
 	 	  B.TampilArray(); 
 	 	   
 	 	// SalinLarikA_B(A,B); 
 	 	 System.out.println("out: Array A dan B  sama? "+IsSamaAB(A,B)); 
 	  } 
 } 
