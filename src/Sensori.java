import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;


public class Sensori {
	UltrasonicSensor sonic;
	
	public Sensori() {
		this.sonic = new UltrasonicSensor(SensorPort.S1);
		sonic.continuous();
	}
	
	public void Vasemmalle(int aste) {
		Motor.A.rotate(aste);
	}
	
	public void Oikealle(int aste) {
		Motor.A.rotate(-aste);
	}
	
	public int haeEtaisyys() {
		return sonic.getDistance();
	}
	
	public boolean havaitseEste() {
		if(haeEtaisyys() < 60) {
			return true;
		}
		return false;
	}
}
