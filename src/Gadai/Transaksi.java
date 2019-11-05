package Gadai;

public class Transaksi {
	Agunan agunan;
	Nasabah nasabah;
	String status;
	double hutang;
	
	//method gadai langsung pada saat init constructor
	public Transaksi(Agunan agunan, Nasabah nasabah, String status, double harga) {
		this.agunan = agunan;
		this.nasabah = nasabah;
		this.status = status;
		this.hutang = harga;
	}	
	
	//method  mengurangi hutang set this hutang = hutang - jumlah bayar
	public void bayarHutang (int jumlah) {
		this.hutang = this.hutang - jumlah;
		if(this.hutang == 0){
			this.status = "lunas";
		}
	}
	
}
