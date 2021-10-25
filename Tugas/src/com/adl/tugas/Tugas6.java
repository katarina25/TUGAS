package com.adl.tugas;

import java.util.Scanner;

public class Tugas6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tugas6 tugas = new Tugas6();
		//tugas.segitiga();
		tugas.urutanAngka();
	}
	
	public void segitiga() {
		int a;
		System.out.print("Masukan angka : ");
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		
		for (int i=1; i<=a; i++) {
			for (int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			System.out.println("");
		}
	}
	

	public void urutanAngka() {
		Scanner scan = new Scanner(System.in);
		System.out.print ("Masukan nilai : ");
		int n = scan.nextInt();
		int a =1;
		int b=1;
		int c =0;
		
		for (int i=0;i<=n;i++) {
			
				System.out.print(" " + a);	
			
			a=b+c;
			c=b;
			b=a;
			
		}
		
}
	

}
