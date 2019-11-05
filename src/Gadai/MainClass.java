package Gadai;
import java.util.Scanner;

public class MainClass {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String namaProduk;
		String kategoriProduk;
		String deskripsiProduk;
		String namaNasabah;
		int harga;
			Scanner d = new Scanner(System.in);
			int pil;
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


				}
				else if(pil==2){

				}
				else if(pil==3){

				}
				else if(pil==48){
					System.out.println("\n====== EXIT ======");
					break;
				}
				
				System.out.println("\n\n");
				
			}while(pil< 1 || pil > 4);

		}
}


