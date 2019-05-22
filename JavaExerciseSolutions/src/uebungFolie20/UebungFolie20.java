package uebungFolie20;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UebungFolie20 {

	public static void main(String[] args) {

		while (true) {

			// Fuer diese Aufgabe brauchen wir wieder einen Reader

			BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

			// Hier definieren wir helfer-variablen, sie sollen uns helfen an sachen zu
			// erinnern bzw zwischenspichern

			boolean negativ = false; // den setzen wir auf false einfach weil wir von einem korrekten input ausgehen
			int umgedrehteZahl = 0; // das ist unsere umgedrehte zahl am Ende
			try {

				// Hier nehmen wir den input und versuchen ihn zu einem INteger umzuwandeln
				int zahlZumDrehen = Integer.parseInt(bfr.readLine());

				// wenn die Zahl 0 ist dann sagen wir es dem Benutzer
				if (zahlZumDrehen == 0) {

					System.out.println("Hey deine Zahl ist eine 0 wie soll ich das spiegeln :o");

				} else {

					// Hier beginnt der richtige teil, zuerst pruefen wir ob die Zahl negativ ist
					// und oassen unsere hifs-variable an

					if (zahlZumDrehen < 0) {

						negativ = true;

						// da wir nur positive zahlen umdrehen können machen wir unsere zahl positiv

						zahlZumDrehen = zahlZumDrehen * (-1);
					}

					// nun benutzen wir eine schleife um umseren "Algorithmus" solagne auszuführne
					// wie nötig
					while (zahlZumDrehen != 0) {

						// zuest geben wir unserer zahl eine wetiere stelle dies geht durch
						// multipilkation mit 10, das ist im ersten durchauf unnötig, jedoch esentziel
						// bei den anderen!!!

						umgedrehteZahl = umgedrehteZahl * 10;

						// Um den hinteren teil unserer zahl zu bekommen rechnen wir mod 10

						umgedrehteZahl = umgedrehteZahl + zahlZumDrehen % 10;

						// nun zum abschneiden des hinteren teils benutzen wir division durch 10, da
						// Integers keine komme zahlen sind faellt dieser teil weg

						zahlZumDrehen = zahlZumDrehen / 10;

						// das wars auch schon!

					}

					// nun pruefen wir unserer hefler variable um zusehen ob wir eine negative zahl
					// auch wieder ausgeben müssen

					if (negativ == true) {
						umgedrehteZahl = umgedrehteZahl * (-1);
					}

					// Jetzt noch die ausgabe und fertig!

					System.out.println(umgedrehteZahl);

				}

			} catch (Exception e) {

				System.out
						.println("Ooppss seams you didnt typed in a Number. System craashed x(\n\rJk i am still alive");

			}

		}
	}

}
