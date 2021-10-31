package taller3.televisores;

public class Control {
	private TV tv; //
	
	public void enlazar(TV tv) {
		this.tv = tv;
		tv.setControl(this);
		//tv.control = this.tv.control;
	}
	
//	public void setTv(TV tv) {
//		this.tv = tv;
//	}
	
	public TV getTv() {
		return this.tv; 
	}
	
	
	public void turnOn() {
		tv.turnOn();
	}
	
	public void turnOff() {
		tv.turnOff();
	}
	
	public void canalUp(){
		if (tv.getEstado() == true) {
			tv.canalUp();
		}
	}
	
	public void canalDown() {
		if (tv.getEstado() == true) {
			tv.canalDown();
			
		}
	}
	
	public void volumenUp(){
		if (tv.getEstado() == true) {

				tv.volumenUp();
			
		}
	}
	
	public void volumenDown() {
		if (tv.getEstado() == true) {
		
				tv.volumenDown();
			
		}
	}
	
	public void setCanal(int canal) {
		tv.setCanal(canal);
	}
	
	
	
}