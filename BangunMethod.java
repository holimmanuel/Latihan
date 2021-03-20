package com.juarakoding.latihan1;

public class BangunMethod {
	private String namaBidang = "";
	private double resultkalkulasi = 0.0;
	
	public double getResultkalkulasi() {
		return resultkalkulasi;
	}
	public void setResultkalkulasi(double resultkalkulasi) {
		this.resultkalkulasi = resultkalkulasi;
	}
	
	public static double PI = 3.14;
	
	public BangunMethod(String bidang) {
		this.namaBidang = bidang;
		
	}
	public double luaslingkaran(double r) {
		double luaslingkaran = PI * r *r ;
		
		return luaslingkaran;
		
	}
		public void hasil() {
			System.out.println("luas bangun bidang"+this.namaBidang+"adalah.."+this.getResultkalkulasi());
		}
		
	}


