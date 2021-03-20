package com.juarakoding.latihan1;
import java.util.Scanner;
public class latihan1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("panjang");
		int panjang = scan.nextInt();
		System.out.println("lebar");
		int lebar = scan.nextInt();
		
		int nilai = 0;
		
		for (int x = 0 ; x < panjang; x++) {	
		for (int y=2; y<=lebar; y++) {
			nilai = nilai + 1;
					
			int CounterBagi = 0;
		for (int z =1; z <=nilai; z++) {
			if (nilai % z == 0) {
							CounterBagi++;
						}
					}
					if (CounterBagi == 2) {
						System.out.print("!");
					}else {
						System.out.print("*");
					}
				}	
				System.out.println("");
		}
			
			}

}	



