package com.juarakoding.latihan1;
import java.util.Scanner;
public class switchh {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("nama binatang");
		String jawab = scan.next().toLowerCase();
		
		switch (jawab) {
		
		case "kelinci":
		case "kucing":
		case "tikus":
		System.out.println("binatang mamalia");
		
		break;
		case "katak":
		case "kadal":
		case "buaya":
		System.out.println("binatang reptil");
		
		break;
		case "burung":
		case "bebek":
		System.out.println("binatang unggas");
		break;
		default:
			System.out.println("binatang apa tuhh");
			break;
		}
			
	}

}
