package org.generation.italy.utils;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean exit = false;
		int a;
		int b;
		double c;
		double d;
		Scanner in = new Scanner(System.in);
		do {
			System.out.println(
					"inserire che tipologia di operazione che vuoi effettuare: 1.sommaInt, 2.sommaDouble, 3.SottrazioneInt, 4.sottrazionedouble, 5.moltiplicazioneInt, 6moltiplicazioneDouble, 7.assolutoInt, 8.assolutoDouble, 9.minimoInt, 10.minimoDouble, 11.massimoInt, 12.massimoDouble, 13.Exit");
			int calc = in.nextInt();
			switch (calc) {
			case (1):
				System.out.println("inserisci il primo valore da sommare (intero): ");
				a = in.nextInt();
				System.out.println("inserisci il secondo valore da sommare (intero): ");
				b = in.nextInt();
				System.out.println("la somma dei 2 interi ammonta a: " + CalcoliHalper.somma(a, b));
				break;
			case (2):
				System.out.println("inserisci il primo valore da sommare (double): ");
				c = in.nextDouble();
				System.out.println("inserisci il secondo valore da sommare (Double): ");
				d = in.nextDouble();
				System.out.println("la somma dei 2 double ammonta a: " + CalcoliHalper.somma(c, d));
				break;
			case (3):
				System.out.println(
						"attenzione! se il secondo valore è maggiore del primo l'operazione verrà effettuata al contrario!");
				System.out.println("inserisci il primo valore da iniziale (intero): ");
				a = in.nextInt();
				System.out.println("inserisci il secondo valore da sottrarre (intero): ");
				b = in.nextInt();
				System.out.println("la differenza tra i 2 interi ammonta a: " + CalcoliHalper.differenza(a, b));
				break;
			case (4):
				System.out.println(
						"attenzione! se il secondo valore è maggiore del primo l'operazione verrà effettuata al contrario!");
				System.out.println("inserisci il primo valore iniziale (Double): ");
				c = in.nextDouble();
				System.out.println("inserisci il secondo valore da sotrarre (Double): ");
				d = in.nextDouble();
				System.out.println("la differenza tra i 2 double ammonta a: " + CalcoliHalper.differenza(c, d));
				break;
			case (5):
				System.out.println("inserisci il primo valore da moltiplicare (intero): ");
				a = in.nextInt();
				System.out.println("inserisci il secondo valore da moltiplicare (intero): ");
				b = in.nextInt();
				System.out.println("la moltiplicazione tra i 2 interi ammonta a: " + CalcoliHalper.moltiplicazione(a, b));
				break;
			case (6):
				System.out.println("inserisci il primo valore da moltiplicare (double): ");
				c = in.nextDouble();
				System.out.println("inserisci il secondo valore da moltiplicare (Double): ");
				d = in.nextDouble();
				System.out.println("la moltiplicazione tra i 2 double ammonta a: " + CalcoliHalper.moltiplicazione(c, d));
				break;
			case (7):
				System.out.println("inserisci il valore da positivizzare (intero): ");
				a = in.nextInt();
				System.out.println("il valore assouluto di " + a + " ammonta a: " + CalcoliHalper.assoluto(a));
				break;
			case (8):
				System.out.println("inserisci il valore da positivizzare (double): ");
				c = in.nextDouble();
				System.out.println("il valore assouluto di " + c + " ammonta a: " + CalcoliHalper.assoluto(c));
				break;
			case (9):
				System.out.println("inserisci il primo valore da confrontare (intero): ");
				a = in.nextInt();
				System.out.println("inserisci il secondo valore da confrontare (intero): ");
				b = in.nextInt();
				System.out.println("il valore minore tra i 2 è: " + CalcoliHalper.minimo(a, b));
				break;
			case (10):
				System.out.println("inserisci il primo valore da confrontare (double): ");
				c = in.nextDouble();
				System.out.println("inserisci il secondo valore da confrontare (Double): ");
				d = in.nextDouble();
				System.out.println("il valore minore tra i 2 è: " + CalcoliHalper.minimo(c, d));
				break;
			case (11):
				System.out.println("inserisci il primo valore da confrontare (double): ");
				c = in.nextDouble();
				System.out.println("inserisci il secondo valore da confrontare (Double): ");
				d = in.nextDouble();
				System.out.println("il valore maggiore tra i 2 è: " + CalcoliHalper.massimo(c, d));
				break;
			case (12):
				System.out.println("inserisci il primo valore da confrontare (double): ");
				c = in.nextDouble();
				System.out.println("inserisci il secondo valore da confrontare (Double): ");
				d = in.nextDouble();
				System.out.println("il valore maggiore tra i 2 è: " + CalcoliHalper.massimo(c, d));
				break;
			case (13):
				exit = true;
				break;
			}
		} while (exit == false);
		System.out.println("Fine Programma");
		in.close();
	}

}
