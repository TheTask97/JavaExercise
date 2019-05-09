package deinErstesProgramm;

public class DeinErstesProgrammMain {

	// das ist die main Methode nur sie wird bei Programm start ausgeführt.
	// -> // <- kennzeichnet einen Kommentar und wird nicht vom Programm gelesen

	/*
	 * -> das /* kennzeichnet den einfang von einem block kommentar. Das ist
	 * einfacher als mehrere zeilen mit // zu kommentieren. Ein Block kommentar
	 * endet mit einem * gefolgt vom /
	 */

	public static void main(String[] args) {

		int ersteZahl; // hier wird eine zahl des Datentyps int (integer) deklariert sie kann mit ihrem
						// Namen benutzt werden
		ersteZahl = 5; // hier wird nun unserem dekarierten (siehe ^^^ ) int Zahl der Wert 5 zugewiesen
						// (Fachlich initialisiert)

		int zweiteZahl = 7; // beides geht auch in einem schritt und muss nicht getrennt gemacht werden wie
							// ^

		//

		int summe = ersteZahl + zweiteZahl; // natürlich kann man auch addieren (+), subtrahieren (-), multiplzieren (*)
											// und dividieren (/)
											// außerdem gibt es modulo (%)

		System.out.println(summe); // System.out.println() gibt etwas in der Konsole aus. Dabei ist es egal welchen
									// typ es hat hauptsache es existiert

		System.out.println(ersteZahl + zweiteZahl); // das obere lässt sich abkürzen und spart ressourcen! Java handelt
													// aritmetische operation vor der Ausgabe

		System.out.println(5 + 7); // das wäre ein beispiel ohne Variablen.
		System.out.println(new Integer(7) + new Integer(5)); // das ist die overkill variante die nur die angeber machen. ignor it
	}

}
