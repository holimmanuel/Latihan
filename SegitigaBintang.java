package com.juarakoding.latihan1;

import java.util.Scanner;

public class SegitigaBintang {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukan tinggi segitiga");
		int panjang = scan.nextInt();
		
		for (int x = 0; x < panjang; x++) {

			int dummyKiri = panjang - x;
			int dummyKanan = panjang + x;

			for (int y = 0; y <= panjang * 2; y++) {

				if (y == panjang) {
				
					System.out.print("*");
				} else {

					if (y < dummyKiri) {
						
						System.out.print(" ");

					} else {
						if (y > panjang && y > dummyKanan) {
							
							System.out.print(" ");
							
						} else {
							
							System.out.print("*");
						}
					}
				}
			}
			System.out.println("");

		}
	}

}
