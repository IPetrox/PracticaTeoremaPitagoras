package clases;

public class TrianguloRectangulo {
	
	double a;
	double b;
	double c;
	/**
	 * 
	 */
	public TrianguloRectangulo() {
		this.a = 1.0;
		this.b = 1.0;
		Hipotenusa();
	}
	/**
	 * 
	 * @param a
	 * @param b
	 * @param c
	 */
	public TrianguloRectangulo (double a, double b) {
		this.a = a;
		this.b = b;
	}
	/**
	 * 
	 * @return
	 */
	public double getA() {
        return a;
    }
	/**
	 * 
	 * @return
	 */
	public double getB() {
        return b;
    }
	/**
	 * 
	 * @return
	 */
	 public double getC() {
		return c;
	 }

	/**
	 * 
	 * @return
	 */
    public double Area() {
        double area = a*b/2;
        return area;
    }
    /**
     * 
     * @return
     */
    public double Perimetro() {
        double d = a+b+c;
        return d;
    }


	/**
	 * 
	 * @return
	 */
	public double Hipotenusa() {
		
		double c = Math.sqrt((a*a) + b*b);
        return c;
		
	}
	
    @Override
    public String toString() {
        return "TrianguloRectangulo [a=" + a + ", b=" + b + ", c=" + c + "]";
        
    }    

}
    
    
