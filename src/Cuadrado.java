
public class Cuadrado extends Figura {
	private Punto puntoA;
	private Punto puntoB;
	private Punto puntoC;
	private Punto puntoD;
	

	public Cuadrado(String nombre, Punto puntoA, Punto puntoB, Punto puntoC, Punto puntoD) {
		super(nombre);
		// TODO Auto-generated constructor stub
		this.puntoA = puntoA;
		this.puntoB = puntoB;
		this.puntoC = puntoC;
		this.puntoD = puntoD;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	public Punto getPuntoA() {
		return puntoA;
	}

	public void setPuntoA(Punto puntoA) {
		this.puntoA = puntoA;
	}

	public Punto getPuntoB() {
		return puntoB;
	}

	public void setPuntoB(Punto puntoB) {
		this.puntoB = puntoB;
	}

	public Punto getPuntoC() {
		return puntoC;
	}

	public void setPuntoC(Punto puntoC) {
		this.puntoC = puntoC;
	}

	public Punto getPuntoD() {
		return puntoD;
	}

	public void setPuntoD(Punto puntoD) {
		this.puntoD = puntoD;
	}

	@Override
	public void dibujar() {
		// TODO Auto-generated method stub
		
	}

}
