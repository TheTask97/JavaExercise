package uebungFolie22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UebungFolie22 {

	public static void main(String[] args) {

		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

		// wir brauchen zwei arrays fuer unsere zahlen

		int[] intArrayEins = new int[5];
		int[] intArrayZwei = new int[5];

		try {

			// Nun lesen wir die ersten 5 Zahlen ein
			for (int i = 0; i < 5; i++) {

				intArrayEins[i] = Integer.parseInt(bfr.readLine());

			}

			// Nun lesen wir die letzen 5 Zahlen ein
			for (int i = 0; i < 5; i++) {

				intArrayZwei[i] = Integer.parseInt(bfr.readLine());

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		// Der naechste Schritt ist die zahlen zu multiplizieren. dafuer benoetigen wir eine doppleltschleife

		for(int i = 0; i < 5; i++) {
			
			for(int j = 0; j < 5; j++) {
				
				// Hier wird mulitpliziert und ausgegeben
				
				System.out.println(intArrayEins[i]*intArrayZwei[j]);
				
			}
			
			
		}
		
	}

}
