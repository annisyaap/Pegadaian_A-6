package Gadai;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Scanner d = new Scanner(System.in);
			
			ArrayList<Nasabah>nasabah = new ArrayList<Nasabah>();
			nasabah.add (new Nasabah("Emil"));
			
			ArrayList<Agunan>agunan = new ArrayList<agunan>();
			agunan.add (new Agunan(1,"laptop","bla bla bla", 5000000));
			
			ArrayList<Transaksi>transaksi = new ArrayList<transaksi>();
			transaksi.add (new Transaksi(agunan.get(0), nasabah.get(0),"Lunas",5000000));

			System.out.println(transaksi.get(0));

		}
}


