package Gadai;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tampilkan Inventory
		ArrayList<Agunan> a = new ArrayList<>();
		ArrayList<Nasabah> n = new ArrayList<>();
		ArrayList<Transaksi> t = new ArrayList<>();
		
		String status="gadai", kategoriProduk = "laptop", deskripsiProduk = "masih baru nih";
		n.add(new Nasabah("Bastian Dolly"));
		int hutang=0,id=0,harga = 0;
		
		a.add(new Agunan(id,kategoriProduk, deskripsiProduk, harga));
		t.add(new Transaksi(a.get(0),n.get(0),status,hutang));
		System.out.printf(  "%5s %18s %10s %16s %10s", "ID", "Nama", "Product", "Description", "Price");
		System.out.println();
			for (Transaksi t1:t) {
				if(t1.status== "gadai") {
					System.out.printf(  "%5s %18s %10s %16s %10s",t1.agunan.id,t1.nasabah.namaNasabah,t1.agunan.kategoriProduk,t1.agunan.deskripsiProduk ,t1.hutang);
			}
		
		}
	}

}
