package com.juarakoding.latihan1;

import java.util.Scanner;

public class GanjilGenap {

	public static void main(String[] args) {
		
		int angka;
		System.out.println("Masukkan angka:");

		Scanner input = new Scanner(System.in);
		angka = input.nextInt();

		if (angka % 2 == 0)
			System.out.println(angka + " bilangan genap");
		else
			System.out.println(angka + " bilangan ganjil");
	
	}

}
