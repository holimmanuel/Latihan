package com.juarakoding.latihan1;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> binatang=new ArrayList<String>();
		Scanner input = new Scanner(System.in); 
		System.out.print("masukkan Jumlah array binatang = ");
		int b= Integer.parseInt(input.nextLine());
		System.out.println("masukkan nama binatang : ");
		for (int i=0; i<b; i++) {
			binatang.add(input.nextLine());
		}
		System.out.println("=====");
		for (int i=0; i<binatang.size(); i++) {
			System.out.println(binatang.get(i));
		
		
//		binatang.add("kucing");
//		binatang.add("rusa");
//		binatang.add("anjing");
//		binatang.add("beruang");
//		binatang.set(0,"tomcat");
////		binatang.remove(3);
//		for (int i=0; i<binatang.size(); i++) {
//			System.out.println("nama binatang :" +binatang.get(i));
//		}
//		System.out.println(binatang.get(2));
//	}
//	for(String i : binatang) {
//		System.out.println(i);
	}
}
}
