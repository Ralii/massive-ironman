Kokeilin robotille erilaisia fyysisi� rakententeita esteit� huomioivan liikkumisen mahdollistamiseksi. Aluksi hahmottelin robotille kahta vet�v�� py�r�� ja k��ntyv�� etupy�r�� kulkusuunnan muuttamiseksi. (yksi.jpg)

Suunnitelmaa mietitty�ni tulin siihen tulokseen, ett� on parempi tehd� robotista kahdella vet�v�ll� moottorilla k��ntyv�. Muutin etupy�r�n rakenteeltaan kiinte�ksi. Ohjaus tapahtuu k��nt�m�ll� takapy�rien moottorit eri kulkusuuntiin, jolloin robotti k��ntyy joko vasemmalle tai oikealle.

Laitoin kannettavalle tietokonelle RojbOS j�rjestelm�n toimimaan Virtual Boxin sis�ll� virtuaalikoneessa paikallisesti. Tutustuin Virtual Boxin RojbOS ja lejOS:in toimintaan ja katsoin dokumentaatiot pintapuolisin l�pi. Suoritin my�s robotin alkuper�isen rommin flashayksen lejOS:iin.

Testasin moottorin komponentteja l�pitse RojbOS:in mukana tulleiden valmiiden esimerkkiohjelmistojen avulla. Moottorit toimivat odotetulla tavalla mutta kaikuluotaimen ep�varmuus ja huono tarkkuus p��siv�t hieman yll�tt�m��n. Kauin huonotehoisuus todenn�k�isesti muuttaa projektini suunnitelmaa jonkin verran. Pyrin kuitenkin ensin saamaan robotin liikkumaan itsen�isesti ja ottamaan esteet huomioon.

Katsoin robotin liikkumis ja -kaikuluotaintoiminnot l�pitse valmiiden esimerkkipakettien pohjalta ja tein n�ille omat luokat eclipseen, niin ett� ne noudattavat hyvi� ohjelmointiperiaatteita. Ohjelmisto koostuu nyt moottori, anturi ja -automaattisen likkumisen luokista.

Robotin automaattinen liikkuminen toimii niin, ett� robotti ajaa ensin suoraan kaikuluotaimen toimiessa continuous tilassa, jolloin et�isyytt� mitataan jatkuvasti. Kun este havaitaan (luotaimen et�isyysarvo < 60) arpoo robotti, ett� k��ntyyk� se oikealle vai vasemmalle. Mik�li robotti k��ntyy vasemmalle varmistaa moottoriin kiinnitetty kaikuluotain k��ntymisen j�lkeen, ett� este on riitt�v�n kaukana. Se k��ntyy 45-astetta vastakkaiseen suuntaan ja luotaa et�isyyden ( < 60), mik�li este ei ole riitt�v�n kaukana, k��ntyy robotti viel� uudelleen. T�m�n j�lkeen kaiku k��ntyy taas etuasentoon ja robotti jatkaa matkaa.

Seuraava vaihe olisi keksi� jotain lis�toiminnallisuutta robotin toimintaan, koska alkuper�ist� suunnitelma a ei todenn�k�isesti ole mahdollista toteuttaa ottaen huomioon antureiden tarkkuuden.

Olen miettinyt kosketussensorin varustamista tilanteisiin, joissa kaiku ei huomaa estett� tai se on jostain syyst� rakenteeltaan sellainen ettei sit� kyet� havaitsemaan.
