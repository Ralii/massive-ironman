import java.util.Random;

import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;

public class LiikkumisAutomatiikka {
	Liikkuminen liiku;
	Sensori sensori;
	TouchSensor touch;
	Random random;
	int moi;
	boolean escape;
	int loppu;

	public LiikkumisAutomatiikka() {
		this.liiku = new Liikkuminen();
		this.sensori = new Sensori();
		this.random = new Random();
		this.moi = 0;
		this.escape = false;
	}
	
	/*
	 * --------------------------------------------------------------------------
	 * Robotin automaattista liikkumista käsittelevä luokka. Päämetodi
	 * liikuAutoMaagisest() hoitaa liikkumista ja sensoria ohjaavien luokkvien
	 * kutsumisen
	 * --------------------------------------------------------------------------
	 */
	public void liikuAutomaagisesti() throws InterruptedException {

		while (!Button.ESCAPE.isPressed()) {
			while (!sensori.havaitseEste()) {
				if (Button.ESCAPE.isPressed()) {
					escape = true;
					break;
				}
				liiku.Eteen(1);

				/*
				 * --------------------------------------------------------------
				 * Alla oleva koodinpätkä vastaa
				 * kaikuluotainsensorin liikkumisesta robotin liikkumisen
				 * aikana. Kaikuluotain keilaa ympäristöä 45-astetta vasemmalle
				 * ja 45-astetta robotista oikealle liikkeen aikana.
				 * --------------------------------------------------------------
				 */
				if (moi == 0) {
					sensori.Oikealle(45);
					moi++;
				} else if (moi == 1) {
					sensori.Vasemmalle(45);
					moi++;
				} else if (moi == 2) {
					sensori.Vasemmalle(45);
					moi++;
				} else {
					sensori.Oikealle(45);
					moi = 0;
				}
			}
			/*
			 * ------------------------------------------------------------------
			 * Alla oleva toiminnallisuus huolehtii robotin
			 * kääntymisestä mikäli este havaitaan. Robotti arpoo
			 * kääntymissuunnan ja samalla kun robotti kääntyy, kääntyy myös
			 * sensori alkuperäistä havaittua seinää kohti tarkistaakseen, että
			 * onko seinä riittävän kaukana ensimmäisen kääntymisen jälkeen.
			 * Mikäli ei, kääntyy robotti lisää.
			 * ------------------------------------------------------------------
			 */
			if (!escape) {
				if (random.nextDouble() < 0.5) {
					liiku.Vasemmalle();
					sensori.Oikealle(45);
					if (sensori.havaitseEste()) {
						liiku.Vasemmalle();
						sensori.Vasemmalle(45);
						continue;
					}
					sensori.Vasemmalle(45);

				} else {
					liiku.Oikealle();
					sensori.Vasemmalle(45);
					if (sensori.havaitseEste()) {
						liiku.Oikealle();
						sensori.Oikealle(45);
						continue;
					}
					sensori.Oikealle(45);
				}
			}
		}
	}
}
