package ArrayRecord;

import java.util.Scanner;

public class Nilai {

//  TIPE DATA RECORD
  int NIM;
  String nama;
  float UTS;
  float UAS;
  char index;
  double na;

  	void SetIndex() {
  		if (na>=85)
  			index='A';
  		else if (na>=75)
  			index='B';
  		else if (na>55)
  			index='C';
  		else if (na>=45)
  			index='D';
  		else
  			index='E';
  	}
  
  void BacaNilai() {
	 Scanner sc= new Scanner(System.in); 
	 System.out.print("nim: "); NIM=sc.nextInt();
	 System.out.print("nama: "); nama=sc.next();
	 System.out.print("uts: "); UTS=sc.nextFloat();
	 System.out.print("uas: "); UTS=sc.nextFloat();
	 na=0.3*UTS+0.7+UAS;
	 SetIndex();
	 }
  void TampilNilai() {
	  System.out.println("Data: "
			  +NIM+","+nama+","+UTS+","+UAS+","+na+","+index);
  }
}

