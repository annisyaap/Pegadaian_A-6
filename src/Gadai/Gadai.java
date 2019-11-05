//package Gadai;

import java.util.ArrayList;
import java.util.Scanner;

public class Gadai {

	public Gadai() {
		// TODO Auto-generated constructor stub
	}

	public void menuGadai() {
		Scanner input = new Scanner(System.in);
		System.out.println("\nDetail Information\n"
				+ "==========================================");

		String namaNasabah, katProduk, deskripsiProduk, status;
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
			System.out.print("Description\t\t: ");
			deskripsiProduk = input.nextLine();
			
			String jmlhKar[] = new String[deskripsiProduk.length()];
			for (int i = 0; i < jmlhKar.length; i++) {
				jmlhKar[i]= Character.toString(deskripsiProduk.charAt(i));
			}		
			
			for (int i = 0; i < jmlhKar.length+1; i++) {
				if (jmlhKar[0].contains(" ") || jmlhKar[jmlhKar.length-1].contains(" ") ){
					System.out.print("Description\t\t: ");
					deskripsiProduk = input.nextLine();
				} 
				else if(jmlhKar[i].contains(" ")){
					break;
				} 
				break;
			}
		} while(!deskripsiProduk.contains(" "));
		
		do{
			System.out.print("Price\t\t\t: ");
			hargaProduk = input.nextDouble();
		} while (hargaProduk%10000!=0);
		
		status = "Gadai";
		int incrementID = 0;
		
		ArrayList<Nasabah> arrNasabah = new ArrayList<>();
		arrNasabah.add(new Nasabah(namaNasabah));
		
		ArrayList<Agunan> arrAgunan = new ArrayList<>();
		arrAgunan.add(new Agunan((incrementID+1), katProduk, deskripsiProduk, hargaProduk));
		
		
		
	}

}
