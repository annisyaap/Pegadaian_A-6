package Gadai;

public class Agunan {
	int id;
	String kategoriProduk;
	String deskripsiProduk;
	double harga;
	
	public Agunan(int id, String kategoriProduk, String deskripsiProduk, double harga) {
		this.id = id;
		this.kategoriProduk = kategoriProduk;
		this.deskripsiProduk = deskripsiProduk;
		this.harga = harga;
	}

	
	public int getId() {
		return id;
	}

	public String getKategoriProduk() {
		return kategoriProduk;
	}

	public String getDeskripsiProduk() {
		return deskripsiProduk;
	}

	public double getHarga() {
		return harga;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setKategoriProduk(String kategoriProduk) {
		this.kategoriProduk = kategoriProduk;
	}

	public void setDeskripsiProduk(String deskripsiProduk) {
		this.deskripsiProduk = deskripsiProduk;
	}

	public void setHarga(double harga) {
		this.harga = harga;
	}
	
}