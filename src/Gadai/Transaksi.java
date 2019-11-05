package Gadai;

import java.util.ArrayList;

public class Transaksi {
	Agunan agunan;
	Nasabah nasabah;
	String status;
	int hutang;
	
	//method gadai langsung pada saat init constructor
	public Transaksi(Agunan agunan, Nasabah nasabah, String status, int hutang) {
		this.agunan = agunan;
		this.nasabah = nasabah;
		this.status = status;
		this.hutang = hutang;
	}	
	
	//method  mengurangi hutang set this hutang = hutang - jumlah bayar
	public void bayarHutang (int jumlah) {
		this.hutang = this.hutang - jumlah;
		
		// ubah status
		if (this.hutang == 0) {
			this.status = "lunas";
		}
	}
	
	public int cariIndexTransaksi (ArrayList<Transaksi> transaksi, int id) {
		int indexArrayListTransaksi = 0;
		int resultIndex=0;
		while (transaksi.get(indexArrayListTransaksi) != null) {
			if(transaksi.get(indexArrayListTransaksi).agunan.id == id) {
				resultIndex = indexArrayListTransaksi;
			}
			indexArrayListTransaksi++;
		}
		return resultIndex;
	}
}
