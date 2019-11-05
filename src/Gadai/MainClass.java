package tugas1;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Nasabah>nasabah = new ArrayList <Nasabah>(); 
		nasabah.add(new Nasabah("Putra"));
		
		ArrayList <Agunan>agunan = new ArrayList <Agunan>(); 
		agunan.add(new Agunan(1, "Laptop", "Ini laptop", 5000000 ));
		agunan.add(new Agunan(2, "Laptop", "Ini laptop", 4000000 ));

		
		ArrayList <Transaksi>transaksi = new ArrayList <Transaksi>();
		transaksi.add(new Transaksi(agunan.get(0), nasabah.get(0), "gadai", agunan.get(0).harga));
		transaksi.add(new Transaksi(agunan.get(1), nasabah.get(0), "gadai", 5000000));

		//
		
		Scanner input = new Scanner (System.in);
		//MENU 2 STARTS FROM HERE
		// Display table header transaksi
		System.out.println ("====================================================");
		String displayHeader1 = String.format("%5s %12s %12s %12s", "ID", "Kategori", "Status" , "Hutang");		
		System.out.println (displayHeader1);
		System.out.println ("====================================================");
		
		// Display table data transaksi
		
		
		for (Transaksi n : transaksi) {
			if (n.status == "gadai") {
				
				String print = String.format("%5s %12s %12s %12s", n.agunan.id, n.agunan.kategoriProduk, n.status, n.hutang);
				System.out.println (print);
			}
		}
		
		// Masukkan ID yang ingin ditebus
		System.out.print ("Masukkan ID yang ingin ditebus: ");
		int id = input.nextInt();
		
		// Find Index Object in ArrayList
		int indexArrayListTransaksi = 0;
		for(Transaksi n : transaksi) {
			if(n.agunan.id == id) {
				break;
			}
			indexArrayListTransaksi++;
		}
		
		//Masukkan jumlah yang ingin ditebus
		System.out.print ("Masukkan Jumlah yang ingin ditebus: ");
		int jumlah = input.nextInt();
		
		//METHOD MENGURANGI HUTANG DENGAN JUMLAH YANG DIBAYAR
		transaksi.get(indexArrayListTransaksi).bayarHutang(jumlah);
		
	}
}
