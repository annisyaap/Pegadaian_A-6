package Gadai;

public class Transaksi {
	Agunan agunan;
	Nasabah nasabah;
	String status;
	double hutang;
	
	//method gadai langsung pada saat init constructor
	public Transaksi(Agunan agunan, Nasabah nasabah, String status, double hutang) {
		this.agunan = agunan;
		this.nasabah = nasabah;
		this.status = status;
		this.hutang = hutang;
	}	
	
	//method  mengurangi hutang set this hutang = hutang - jumlah bayar
	public void bayarHutang () {
		
	}
	
}
