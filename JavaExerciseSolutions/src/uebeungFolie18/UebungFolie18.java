package uebeungFolie18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class UebungFolie18 {

	public static void main(String[] args) throws IOException {

		/*
		 * Um etwas einzulesen brauchen wir erstmal einen InputStream
		 * (eingehendenDatenstrom) Da wir von der Konsole einlesen mˆchten benutzen wir
		 * System.in
		 */

		InputStream konsolenInput = System.in;

		// Diesen Strom kˆnnen wir mit einem InputStreamReader lesen.

		InputStreamReader konsolenLeser = new InputStreamReader(konsolenInput);

		
		// Da der InputStreamReader nur Byte lesen kann wir aber mehr als nur paar Bytes
		// wollen kˆnnen wir diesen erweitern. Zur Vef¸gung stehen: BufferedReader und
		// Scanner

		BufferedReader finalreader = new BufferedReader(konsolenLeser);

		/*
		 * Nun kˆnnen wir ganz angenehm aus der Konsole mit einem readLine lesen. Warum
		 * readLine() und nicht read() ? read lieﬂt nicht die komplette zeile! sonder
		 * nur einen Bruchteil Wenn ihr es testen wollt kˆnnt ihr einfach diesen Code
		 * auskommentieren.
		 */

		// System.out.println("Gebe jetzt deine zahl zum pr¸fen ein");
		// int readZahl = finalreader.read();
		// System.out.println("Die zahl die mit read eingelesen wurde ist:"+readZahl);
		// System.out.println("gebe deine zahl erneut ein");
		// finalreader.readLine();
		// String readLineZahl = finalreader.readLine();
		// System.out.println("Die zahl mit dem Readline:"+readLineZahl);

		// Hier ist der code f¸r die Aufgabe

		String uebungString = finalreader.readLine();

		// da readLine einen String einliest muessen wir diesen in eine Integer zahl
		// umwandeln

		int uebungZahl = Integer.parseInt(uebungString);

		// Wir pruefen ob die Zahl groeﬂer als 0 ist

		if (uebungZahl > 0) {

			// da die Zahl groeﬂer als 0 ist kommen wir hier rein und multiplizieren sie mit
			// -1 um sie zu negieren

			uebungZahl = uebungZahl * (-1);

			System.out.println(uebungZahl);

		} else if (uebungZahl == 0) {

			// wenn die zahl gleich 0 ist sagen wir das dem User

			System.out.println("Hey deine Zahl ist 0. Bitte gebe doch eine positive Zahl ein die groeﬂer als 0 ist.");

		} else {

			// und hier kommen wir reinn falls sie kleiner als 0 ist

			System.out.println("Deine Zahl ist bereits negativ! Gebe doch eine positive Zahl ein.");

		}

	}

}
