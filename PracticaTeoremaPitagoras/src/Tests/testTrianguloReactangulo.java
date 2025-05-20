	package Tests;

	import static org.junit.jupiter.api.Assertions.*;

	import org.junit.jupiter.api.BeforeAll;
	import org.junit.jupiter.api.Test;

	import clases.TrianguloRectangulo;

	class testTrianguloRectangulo {

	static TrianguloRectangulo t1;

	@BeforeAll
	static void setup() {
	t1 = new TrianguloRectangulo();
	}

	@Test
	void testArea() {

	double resultadoObtenido = t1.Area();
	double resultadoEsperado = 0.5;

	assertEquals(resultadoObtenido, resultadoEsperado);
	}

	@Test
	void testHipotenusa() {
	double resultadoObtenido = t1.Hipotenusa();
	double resultadoEsperado = 1.414213;

	assertEquals(resultadoObtenido, resultadoEsperado,0.01);
	}

	@Test
	void testPerimetro() {
	double resultadoObtenido = t1.Perimetro();
	double resultadoEsperado = 3.414213562373095;

	assertEquals(resultadoObtenido, resultadoEsperado);
	}

	@Test
	void testArea2() {
	TrianguloRectangulo t2 = new TrianguloRectangulo(2, 4);
	double resultadoObtenido = t2.Area();
	double resultadoEsperado = 4;

	assertEquals(resultadoObtenido, resultadoEsperado);
	}

	@Test
	void testHipotenusa2() {
	TrianguloRectangulo t2 = new TrianguloRectangulo(2, 4);
	double resultadoObtenido = t2.Hipotenusa();
	double resultadoEsperado = 4.47213595499958;

	assertEquals(resultadoObtenido, resultadoEsperado);
	}
	    @Test
	void testPerimetro2() {
	    TrianguloRectangulo t2 = new TrianguloRectangulo(2, 4);
	double resultadoObtenido = t2.Perimetro();
	double resultadoEsperado = 10.47213595499958;
	assertEquals(resultadoObtenido, resultadoEsperado);
	}

	@Test
	void testExcepcion() {
	Exception E = assertThrows(IllegalArgumentException.class,() -> new TrianguloRectangulo(-1,0) );
	String mensajeEsperado = "Los catetos no pueden ser negativos";
	String mensajeObtenido = E.getMessage();
	assertEquals(mensajeObtenido, mensajeEsperado);
	}

	
	}

