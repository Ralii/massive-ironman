import lejos.nxt.Motor;

public class Liikkuminen {

	public Liikkuminen() {

	}

	/*
	 * --------------------------------------------------------------------------
	 * Robotin liikkumisesta vastaava luokka. Robotin käännökset aiheuttavat
	 * noin 90-asteen käännöksen haluttuun suuntaan.
	 * --------------------------------------------------------------------------
	 */
	public void Vasemmalle() throws InterruptedException {
		Motor.C.backward();
		Motor.B.forward();
		Thread.sleep(2600);
	}

	public void Oikealle() throws InterruptedException {
		Motor.C.forward();
		Motor.B.backward();
		Thread.sleep(2600);
	}

	public void Eteen(int yksikko) throws InterruptedException {
		Motor.C.backward();
		Motor.B.backward();
		Thread.sleep(yksikko * 100);
	}

	public void Taakse(int yksikko) throws InterruptedException {
		Motor.C.forward();
		Motor.B.forward();
		Thread.sleep(yksikko * 100);
	}
}
