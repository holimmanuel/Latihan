package com.juarakoding.latihan1;

import java.util.Scanner;

public class array1dimensi {

	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Masukan tinggi segitiga");
//		int n = scan.nextInt();
		
		String [] [] nilai = {
				{ "bambang","bandung" }, 
				{ "kuncoro","bali" },
				{ "asep","aceh" }};
				
		for(int i=0; i < nilai.length; i++) {
		
			System.out.println("nama : "+nilai[i][0]);
			System.out.println("alamat : "+nilai[i][1]);
			System.out.println("");
		}
		
		
	}

}
