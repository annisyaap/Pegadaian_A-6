package Gadai;

import java.util.ArrayList;
import java.util.Scanner;

public class Gadai {

	public Gadai() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Detail Information\n"
				+ "===================================");
		
		ArrayList<Nasabah> arrNasabah = new ArrayList<>();
		
		String namaNasabah, katProduk, deskripsiProduk, hargaProduk;
		do {
			System.out.print("Name\t\t\t: ");
			namaNasabah = input.nextLine();
		} while(namaNasabah.length() < 3 || namaNasabah.length() > 15);
		
		do {
			System.out.print("Product Category\t: ");
			katProduk = input.nextLine();
		} while(!katProduk.equalsIgnoreCase("Laptop") && !katProduk.equalsIgnoreCase("Motor") && !katProduk.equalsIgnoreCase("Emas"));
		
		do {
			System.out.print("Description\t\t: ");;
			deskripsi = input.nextLine();
		} while(!deskripsi.contains(" "));
		
			
		do{
			System.out.println("Price\t\t\t: ");
		
		} while ();
	}

}
