package com.juarakoding.latihan1;

import java.util.Scanner;

public class BintangSerutTangga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukan tinggi segitiga");
		int panjang = scan.nextInt();
		
		for (int x = 0 ; x < panjang ; x++) {	
		for (int y = 0 ; y <= panjang; y++) {
				
				if (y<=x) {
					System.out.print("*");
				}else {
					System.out.print("#");
				}
				
				
			}
			
			System.out.println();
		
			
		}

	}

}
