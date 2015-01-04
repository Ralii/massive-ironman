import lejos.nxt.*;

/**
 * $Id: HelloWorld.java 1587 2008-05-02 17:19:41Z lgriffiths $
 * 
 * @author Lawrie Griffiths
 * 
 */
public class HelloWorld

{
	static LiikkumisAutomatiikka magiikka;
	
  public static void main (String[] aArg)
  throws Exception
  {
     LCD.drawString("Nysselähtee!",3,4);
     magiikka = new LiikkumisAutomatiikka();
     
     magiikka.liikuAutomaagisesti();
  }
}
