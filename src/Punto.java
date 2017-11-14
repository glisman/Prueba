
public class Punto {
	private int x;
	private int y;
	
	public Punto() {
		this.x =0;
		this.y=0;
	}
	
	public Punto(int x, int y){
		this.x=0;
		this.y=0;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		//return super.equals(arg0);
		boolean result = false;
		if(arg0 instanceof Punto){		
			Punto p = (Punto) arg0;			
			if(this.x == p.getX()){
				if(this.y == p.getY()){
					result=true;
				}
			}
		}
		return result;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
		return "x: "+Integer.toString(x)+" y: "+Integer.toString(y);
	}
}
