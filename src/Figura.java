
public abstract class Figura {
	private String nombre;
	static private int numeroDeFigura=0;
	
	
	public Figura(String nombre) {
		this.setNombre(nombre);		
	}
	
	public abstract void dibujar();


	public String getNombre() {
		return nombre;
	}


	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	static protected void aumentarNumeroDeFigura(){
		setNumeroDeFigura(getNumeroDeFigura() + 1);
	}


	public static int getNumeroDeFigura() {
		return numeroDeFigura;
	}


	private static void setNumeroDeFigura(int numeroDeFigura) {
		Figura.numeroDeFigura = numeroDeFigura;
	}
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
		return "nombre de la figura: "+this.nombre;
	}
	
	protected void finalize(){
		--numeroDeFigura;
	}
}
