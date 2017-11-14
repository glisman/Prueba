
public class Recta extends Figura {
	protected Punto puntoInicial;
	protected Punto puntoFinal;

	public Recta(String nombre, int xInicial, int yInicial, int xFinal, int yFinal) {		
		this(nombre, new Punto(xInicial, yFinal), new Punto(xFinal, yFinal));	
		Figura.aumentarNumeroDeFigura();
	}
	
	public Recta(String nombre, Punto puntoInicial, Punto puntoFinal){
		super(nombre);
		Figura.aumentarNumeroDeFigura();
		this.puntoInicial = puntoInicial;
		this.puntoFinal = puntoFinal;
	}

	@Override
	public String toString() {
		//return super.toString();
		return super.toString() + " coordenadas punto inicial: "+ this.puntoInicial.toString()+ " coordenadas punto final: "+ this.puntoFinal.toString();
	}

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		//return super.equals(arg0);
		boolean result =false;
		if((arg0 instanceof Recta)){
			//if
		}
		return result;
	}

	@Override
	public void dibujar() {
		// TODO Auto-generated method stub
		
	}

	
	
	

}
