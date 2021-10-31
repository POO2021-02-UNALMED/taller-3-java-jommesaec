package taller3.televisores;

public class TV {

	private Marca marca; //
	private int canal = 1;
	private int precio = 500; //
	private boolean estado;
	private int volumen = 1;
	private Control control;
	private static int numTV = 0; //
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		numTV++;
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public Marca getMarca() {
		return marca;
	}
	
	public void setControl(Control control) {
		this.control = control;
	}
	
	public Control getControl() {
		return control;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	
	public int getVolumen() {
		return this.volumen;
	}
	
	public void setCanal(int canal) {
		if (estado == true && canal >= 1 && canal <= 120) {
			this.canal = canal;
		}
		else {
			return;
		}
	}
	
	public int getCanal() {
		return this.canal;
	}
	
	static public int getNumTV() {
		return numTV;
	}
	
	public static void setNumTV(int i) {
		numTV = i;	
	}
	
	public void turnOn() {
		this.estado = true;
	}
	
	public void turnOff() {
		this.estado = false;
	}
	
	public boolean getEstado() {
		return this.estado;
	}
	
	public void canalUp(){
		if (this.getEstado() == true) {
			if (this.canal >= 1 && this.canal < 120) {
				this.canal++;
			}
		}
	}
	
	public void canalDown() {
		if (this.getEstado() == true) {
			if (this.canal > 1 && this.canal <= 120) {
				this.canal--;
			}
		}
	}
	
	public void volumenUp(){
		if (this.getEstado() == true) {
			if (this.volumen >= 0 && this.volumen < 7) {
				this.volumen++;
			}
		}
	}
	
	public void volumenDown() {
		if (this.getEstado() == true) {
			if (this.volumen > 0 && this.volumen <= 7) {
				this.volumen--;
			}
		}
	}
	
	
	
}