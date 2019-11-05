package Gadai;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
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

				pil = d.nextInt();
				
				if(pil==1) {
					
					
				}
				else if(pil==2){

				}
				else if(pil==3){

				}
				else{
					System.out.println("\n====== EXIT ======");
					break;
				}
				
				System.out.println("\n\n");
				
			}while(pil< 1 || pil > 4);

		}
}


