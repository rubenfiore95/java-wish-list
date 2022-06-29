import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<String> desideri = new ArrayList<String>();
		System.out.println("Esprimi un desiderio");
		boolean flag = true;
		
		do {
			desideri.add(scan.nextLine());
			System.out.println("Vuoi aggiungere un altro desiderio?");
			String risposta = scan.nextLine();
			if(risposta.equalsIgnoreCase("si")) {
				System.out.println("Perfetto, allora dimmi un altro desiderio.");
			} else {
				flag= false;
			}
				
		} while (flag);
		
		Collections.sort(desideri);
	    System.out.println("I tuoi desideri: " + desideri);
	     
	     scan.close();
	}
  
}
