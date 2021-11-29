package org.generation.italy.utils;

public class CalcoliHalper {

	CalcoliHalper() {

	}

	static int somma(int a, int b) {
		int ris = a + b;
		return ris;
	}

	static double somma(double a, double b) {
		double ris = a + b;
		return ris;
	}

	static int differenza(int a, int b) {
		int ris;
		if (a < b)
			ris = b - a;
		else
			ris = a - b;
		return ris;
	}

	static double differenza(double a, double b) {
		double ris;
		if (a < b)
			ris = b - a;
		else
			ris = a - b;
		return ris;
	}

	static int moltiplicazione(int a, int b) {
		int ris = a * b;
		return ris;
	}

	static double moltiplicazione(double a, double b) {
		double ris = a * b;
		return ris;
	}

	static int assoluto(int a) {
		if (a < 0)
			a = -a;
		return a;
	}

	static double assoluto(double a) {
		if (a < 0)
			a = -a;
		return a;
	}

	static int minimo(int a, int b) {
		if (a < b)
			return a;
		else
			return b;
	}

	static double minimo(double a, double b) {
		if (a < b)
			return a;
		else
			return b;
	}

	static int massimo(int a, int b) {
		if (a > b)
			return a;
		else
			return b;
	}

	static double massimo(double a, double b) {
		if (a > b)
			return a;
		else
			return b;
	}
}