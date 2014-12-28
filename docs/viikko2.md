Kokeilin robotille erilaisia fyysisiä rakententeita esteitä huomioivan liikkumisen mahdollistamiseksi. Aluksi hahmottelin robotille kahta vetävää pyörää ja kääntyvää etupyörää kulkusuunnan muuttamiseksi. (yksi.jpg)

Suunnitelmaa mietittyäni tulin siihen tulokseen, että on parempi tehdä robotista kahdella vetävällä moottorilla kääntyvä. Muutin etupyörän rakenteeltaan kiinteäksi. Ohjaus tapahtuu kääntämällä takapyörien moottorit eri kulkusuuntiin, jolloin robotti kääntyy joko vasemmalle tai oikealle.

Laitoin kannettavalle tietokonelle RojbOS järjestelmän toimimaan Virtual Boxin sisällä virtuaalikoneessa paikallisesti. Tutustuin Virtual Boxin RojbOS ja lejOS:in toimintaan ja katsoin dokumentaatiot pintapuolisin läpi. Suoritin myös robotin alkuperäisen rommin flashayksen lejOS:iin.

Testasin moottorin komponentteja läpitse RojbOS:in mukana tulleiden valmiiden esimerkkiohjelmistojen avulla. Moottorit toimivat odotetulla tavalla mutta kaikuluotaimen epävarmuus ja huono tarkkuus pääsivät hieman yllättämään. Kauin huonotehoisuus todennäköisesti muuttaa projektini suunnitelmaa jonkin verran. Pyrin kuitenkin ensin saamaan robotin liikkumaan itsenäisesti ja ottamaan esteet huomioon.

Katsoin robotin liikkumis ja -kaikuluotaintoiminnot läpitse valmiiden esimerkkipakettien pohjalta ja tein näille omat luokat eclipseen, niin että ne noudattavat hyviä ohjelmointiperiaatteita. Ohjelmisto koostuu nyt moottori, anturi ja -automaattisen likkumisen luokista.

Robotin automaattinen liikkuminen toimii niin, että robotti ajaa ensin suoraan kaikuluotaimen toimiessa continuous tilassa, jolloin etäisyyttä mitataan jatkuvasti. Kun este havaitaan (luotaimen etäisyysarvo < 60) arpoo robotti, että kääntyykö se oikealle vai vasemmalle. Mikäli robotti kääntyy vasemmalle varmistaa moottoriin kiinnitetty kaikuluotain kääntymisen jälkeen, että este on riittävän kaukana. Se kääntyy 45-astetta vastakkaiseen suuntaan ja luotaa etäisyyden ( < 60), mikäli este ei ole riittävän kaukana, kääntyy robotti vielä uudelleen. Tämän jälkeen kaiku kääntyy taas etuasentoon ja robotti jatkaa matkaa.

Seuraava vaihe olisi keksiä jotain lisätoiminnallisuutta robotin toimintaan, koska alkuperäistä suunnitelma a ei todennäköisesti ole mahdollista toteuttaa ottaen huomioon antureiden tarkkuuden.

Olen miettinyt kosketussensorin varustamista tilanteisiin, joissa kaiku ei huomaa estettä tai se on jostain syystä rakenteeltaan sellainen ettei sitä kyetä havaitsemaan.
