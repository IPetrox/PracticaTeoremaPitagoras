package app;

import clases.TrianguloRectangulo;

public class Principal {
	
	public static void main(String[] args) {
		TrianguloRectangulo t1 = new TrianguloRectangulo(4, 6);
		TrianguloRectangulo t2 = new TrianguloRectangulo();
		double Area1= t1.Area();
		double Area2 = t2.Area();
		double Perimetro1 = t1.Perimetro();
		double Perimetro2 = t2.Perimetro();
	}

}
