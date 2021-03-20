package com.juarakoding.latihan1;

import java.util.Scanner;

public class SegitigaSetengah {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukan tinggi segitiga");
		int panjang = scan.nextInt();
		
		for (int x = 0 ; x < panjang ;x ++) {	
		for (int y = 0 ; y <= panjang; y++) {
					
				System.out.print("*");
				}
				
				System.out.println();			
		}
	}

}
