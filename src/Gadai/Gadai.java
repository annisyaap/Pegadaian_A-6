package Gadai;

import java.util.ArrayList;
import java.util.Scanner;

public class Gadai {

	public static Scanner input;

	public Gadai() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("Detail Information\n"
				+ "==========================================");

		String namaNasabah, katProduk, deskripsiProduk;
		double hargaProduk;
		
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
			deskripsiProduk = input.nextLine();
		} while(!deskripsiProduk.contains(" "));
		
		do{
			System.out.print("Price\t\t\t: ");
			hargaProduk = input.nextDouble();
		} while (hargaProduk%10000!=0);
		
		ArrayList<Nasabah> arrNasabah = new ArrayList<>();
		
	}

}
