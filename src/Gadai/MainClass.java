package Gadai;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		ArrayList<Nasabah> arrNasabah = new ArrayList<>();
		ArrayList<Agunan> arrAgunan = new ArrayList<>();
		ArrayList<Transaksi> arrTransaksi = new ArrayList<>();
		Scanner d = new Scanner(System.in);
		int pil;
		do{
		do{
			System.out.println("\n==========================================");
			System.out.println("================PEGADAIAN=================");
			System.out.println("\n1. Gadai ");
			System.out.println("2. Tebus ");
			System.out.println("3. Tampilkan Inventory ");
			System.out.println("4. Exit ");
			System.out.println("==========================================");
			System.out.println("Pilihan Menu : ");
		
			pil = d.nextInt();
			
			if(pil==1) {
					
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
				int incrementID = arrTransaksi.size();
				
				
//				arrNasabah.add(new Nasabah(namaNasabah));				
//				arrAgunan.add(new Agunan((incrementID+1), katProduk, deskripsiProduk, hargaProduk));
				arrTransaksi.add(new Transaksi(new Agunan((incrementID+1), katProduk, deskripsiProduk, hargaProduk), new Nasabah(namaNasabah),"gadai", hargaProduk ));
				
				
				

			}
			else if(pil==2){
				//MENU 2 STARTS FROM HERE
				// Display table header transaksi
				System.out.println ("====================================================");
				String displayHeader1 = String.format("%5s %12s %12s %12s", "ID", "Kategori", "Status" , "Hutang");		
				System.out.println (displayHeader1);
				System.out.println ("====================================================");
				
				// Display table data transaksi
				
				
				for (Transaksi n : arrTransaksi) {
						String print = String.format("%5s %12s %12s %12s", n.agunan.id, n.agunan.kategoriProduk, n.status, n.hutang);
						System.out.println (print);
				}
				
				// Masukkan ID yang ingin ditebus
				System.out.print ("Masukkan ID yang ingin ditebus: ");
				int id = d.nextInt();
				
				// Find Index Object in ArrayList
				int indexArrayListTransaksi = 0;
				for(Transaksi n : arrTransaksi) {
					if(n.agunan.id == id) {
						break;
					}
					indexArrayListTransaksi++;
				}
				
				//Masukkan jumlah yang ingin ditebus
				System.out.print ("Masukkan Jumlah yang ingin ditebus: ");
				int jumlah = d.nextInt();
				
				//METHOD MENGURANGI HUTANG DENGAN JUMLAH YANG DIBAYAR
				if(arrTransaksi.get(indexArrayListTransaksi).hutang==0){
					System.out.println("Agunan sudah ditebus nih! Pilih agunan lain");
					continue;
				}else{
				arrTransaksi.get(indexArrayListTransaksi).bayarHutang(jumlah);
				}
				// Display table header
				System.out.println ("====================================================");
				String displayHeader2 = String.format("%5s %12s %12s %12s", "ID", "Kategori", "Status" , "Hutang");		
				System.out.println (displayHeader2);
				System.out.println ("====================================================");
						
						// Display table data
				for(Transaksi n : arrTransaksi) {
					String print = String.format("%5s %12s %12s %12s", n.agunan.id, n.agunan.kategoriProduk, n.status, n.hutang);
					System.out.println (print);
						} 

			}
			else if(pil==3){
				System.out.println ("========================================================================");
				System.out.printf(  "%5s %18s %10s %16s %10s", "ID", "Nama", "Product", "Description", "Price");
				System.out.println ("\n========================================================================");
					for (Transaksi t1: arrTransaksi) {
						if(t1.status== "gadai") {
							System.out.printf(  "\n%5s %18s %10s %16s %10s",t1.agunan.id,t1.nasabah.namaNasabah,t1.agunan.kategoriProduk,t1.agunan.deskripsiProduk ,t1.hutang);
					}
				
				}

			}
			else if(pil==4){
				System.out.println("\n====== EXIT ======");
				break;
			}
			
			System.out.println("\n\n");
			
		}while(pil>=1 && pil <=4);
		}while(pil<1 || pil >4);
		
	}
}
