import java.util.Random;

import lejos.nxt.Button;


public class LiikkumisAutomatiikka {
 Liikkuminen liiku;
 Sensori sensori;
 
 public LiikkumisAutomatiikka(){
	 this.liiku = new Liikkuminen();
	 this.sensori = new Sensori();
 }

 public void liikuAutomaagisesti() throws InterruptedException {
	 Random random = new Random();
while(!Button.ESCAPE.isPressed()){	 
	while(!sensori.havaitseEste()) {
		liiku.Eteen(1);
		}
		if(random.nextDouble() < 0.5) {
			liiku.Vasemmalle();
			sensori.Oikealle(45);
			if(sensori.havaitseEste()) {
				liiku.Vasemmalle();
				sensori.Vasemmalle(45);
				continue;
			}
			sensori.Vasemmalle(45);
			
		} else {
			liiku.Oikealle();
			sensori.Vasemmalle(45);
			if(sensori.havaitseEste()) {
				liiku.Oikealle();
				sensori.Oikealle(45);
				continue;
			}
			sensori.Oikealle(45);
		}
 		}
 	}
}
