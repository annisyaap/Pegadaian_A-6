package Gadai;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tampilkan Inventory
		ArrayList<Agunan> a = new ArrayList<>();
		ArrayList<Nasabah> n = new ArrayList<>();
		ArrayList<Transaksi> t = new ArrayList<>();
		
		String status="", kategoriProduk = "", deskripsiProduk = "";
		int hutang=0,id=0,harga = 0;
		
		a.add(new Agunan(id,kategoriProduk, deskripsiProduk, harga));
		t.add(new Transaksi(a.get(0),n.get(0),status,hutang));
		
		System.out.println("----------------------------------------------------------------------");
		System.out.println("| ID |       Nama       |  Product  |       Description    |  Price  |");
		System.out.println("----------------------------------------------------------------------");
		for (Transaksi t1:t) {
			System.out.println("|  " +a.get(0) + "  |         "+t.get(1)+ "\t|  "+a.get(1)+"  |       "+a.get(2) +"    |  "+t.get(3)+"  |");
		}
	}

}
