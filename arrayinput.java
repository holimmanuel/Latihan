package com.juarakoding.latihan1;

import java.util.Scanner;

public class arrayinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); 
		System.out.print("liasukan Jumlah baris = ");
		int b= input.nextInt();
		System.out.print("Hasukan Jumlah kolom = ");
		int k= input.nextInt();
		
		int [][] nilai = new int [b][k]; 
		
		for (int i =0; i<b; i++) {
		for (int j =0; j<k; j++) {
			
			System.out.print("masukkan data : ["+i+"], ["+j+"] = ");
			nilai [b] [k]=input.nextInt();
		}
		
		System.out.println();
		
		for (int x =0; x<b; x++) {
		for (int j =0; j<k; j++) {
			
		System.out.print(nilai [i][j]+" ");
			
		}
		
		System.out.println();
		}

		}
	}
}
