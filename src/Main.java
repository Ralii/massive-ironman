import lejos.nxt.*;

public class Main

{
	static LiikkumisAutomatiikka magiikka;

	/*
	 * --------------------------------------------------------------------------
	 * Ohjelman päämetodi. Kutsutaan automatiikkaa ja laitetaan robotti
	 * liikkeelle
	 * --------------------------------------------------------------------------
	 */
	public static void main(String[] aArg) throws Exception {

		LCD.drawString("Ny lähtee!", 3, 4);
		magiikka = new LiikkumisAutomatiikka();
		magiikka.liikuAutomaagisesti();
	}
}
