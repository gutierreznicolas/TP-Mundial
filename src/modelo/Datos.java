package modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class Datos implements Serializable
{
	private static final long serialVersionUID = -3895645408475502790L;
	
	public void asignarJugadores(ArrayList<Jugador> jugadores)
	{
		//SELECCION ARGENTINA
		
		jugadores.add(asignarDatosJugador("Franco Armani","Argentina","arquero","Imagenes\\franco Armani.jpg",0,0, 0, 87));
		jugadores.add(asignarDatosJugador("Nicolas Otamendi","Argentina","central derecho","Imagenes\\nicolas otamendi.jpg",9, 9, 9, 87));
		jugadores.add(asignarDatosJugador("Federico Fazio","Argentina","central izquierdo","Imagenes\\federico fazzio.jpg",2, 6, 6, 83));
		jugadores.add(asignarDatosJugador("Nicolas Tagliafico","Argentina","lateral izquierdo","Imagenes\\nicolas tagliafico.jpg",1, 6, 6, 80));
		jugadores.add(asignarDatosJugador("Gabriel Mercado","Argentina","lateral derecho","Imagenes\\gabriel mercado.jpg",2, 11, 11, 81));
		jugadores.add(asignarDatosJugador("Lucas Biglia","Argentina","volante derecho","Imagenes\\lucas biglia.jpg",2, 10, 10, 83));	
		jugadores.add(asignarDatosJugador("Ever Banega","Argentina","volante izquierdo","Imagenes\\ever banega.jpg",5, 18, 18, 83));	
		jugadores.add(asignarDatosJugador("Giovani Lo Celso","Argentina","volante central","Imagenes\\lo celso.jpg",6, 4, 4, 77));
		jugadores.add(asignarDatosJugador("Lionel Messi","Argentina","puntero izquierdo","Imagenes\\lionel messi.jpg",51, 6, 6, 94));
		jugadores.add(asignarDatosJugador("Angel Di Maria","Argentina","puntero derecho","Imagenes\\angel di maria.jpg",23, 2, 2, 86));
		jugadores.add(asignarDatosJugador("Sergio Aguero","Argentina","centro delantero","Imagenes\\sergio aguero.jpg",28, 3, 3, 88));
		//SELECCION BRASIL
		jugadores.add(asignarDatosJugador("Alisson Becker","Brasil","arquero","Imagenes\\alisson becker.jpg",0, 1, 1, 85));
		jugadores.add(asignarDatosJugador("Daniel Alves","Brasil","lateral izquierdo","Imagenes\\daniel alves.jpg",5, 11, 11, 84));
		jugadores.add(asignarDatosJugador("Marquinhos Correa","Brasil","central derecho","Imagenes\\marquinhos correa.jpg",2, 2, 2, 83));
		jugadores.add(asignarDatosJugador("Joao Miranda","Brasil","central izquierdo","Imagenes\\joao miranda.jpg",1, 9, 9, 85));
		jugadores.add(asignarDatosJugador("Danilo Da Silva","Brasil","lateral derecho","Imagenes\\danilo da silva.jpg",3, 6, 6, 80));
		jugadores.add(asignarDatosJugador("Paulinho Bezerra","Brasil","volante derecho","Imagenes\\paulinho bezerra.jpg",30,7,7,83));
		jugadores.add(asignarDatosJugador("Philippe Coutinho","Brasil","volante izquierdo","Imagenes\\philippe coutinho.jpg",26,2,2,86));
		jugadores.add(asignarDatosJugador("Carlos Casemiro","Brasil","volante central","Imagenes\\carlos casemiro.jpg",6,12,12,84));
		jugadores.add(asignarDatosJugador("Neymar Junior","Brasil","puntero izquierdo","Imagenes\\neymar junior.jpg",35,15,15,91));
		jugadores.add(asignarDatosJugador("Willian Borges","Brasil","puntero derecho","Imagenes\\willian borges.jpg",15,7,7,83));
		jugadores.add(asignarDatosJugador("Gabriel De Jesus","Brasil","centro delantero","Imagenes\\gabriel de jesus.jpg",29,9,9,83));
		//SELECCION URUGUAY
		jugadores.add(asignarDatosJugador("Fernando Muslera","Uruguay","arquero","Imagenes\\fernando muslera.jpg",0,9,9,81));
		jugadores.add(asignarDatosJugador("Jose Gimenez","Uruguay","central derecho","Imagenes\\jose gimenez.jpg",2,10,10,84));
		jugadores.add(asignarDatosJugador("Diego Godin","Uruguay","central izquierdo","Imagenes\\diego godin.jpg",4,9,9,87));
		jugadores.add(asignarDatosJugador("Gaston Silva","Uruguay","lateral izquierdo","Imagenes\\gaston silva.jpg",2,4,4,71));
		jugadores.add(asignarDatosJugador("Maximiliano Pereyra","Uruguay","lateral derecho","Imagenes\\maximiliano pereyra.jpg",1,7,7,80));
		jugadores.add(asignarDatosJugador("Arevalo Rios","Uruguay","volante central","Imagenes\\arevalo rios.jpg",0,3,3,77));
		jugadores.add(asignarDatosJugador("Carlos Sanchez","Uruguay","volante derecho","Imagenes\\carlos sanchez.jpg",5,9,9,79));
		jugadores.add(asignarDatosJugador("Cristian Rodriguez","Uruguay","volante izquierdo","Imagenes\\cristian rodriguez.jpg",26,12,12,78));
		jugadores.add(asignarDatosJugador("Maximiliano Gomez","Uruguay","puntero derecho","Imagenes\\maximiliano gomez.jpg",20,12,12,74));
		jugadores.add(asignarDatosJugador("Edinson Cavani","Uruguay","centro delantero","Imagenes\\edinson cavani.jpg",52,6,6,87));
		jugadores.add(asignarDatosJugador("Luis Suarez","Uruguay","puntero izquierdo","Imagenes\\luis suarez.jpg",37,15,15,92));
		//SELECCION COLOMBIA
		jugadores.add(asignarDatosJugador("David Ospina","Colombia","arquero","Imagenes\\david ospina.jpg",0,0,0,79));
		jugadores.add(asignarDatosJugador("Santiago Arias","Colombia","lateral derecho","Imagenes\\santiago arias.jpg",3,8,8,81));
		jugadores.add(asignarDatosJugador("Yerry Mina","Colombia","central derecho","Imagenes\\yerry mina.jpg",1,2,2,79));
		jugadores.add(asignarDatosJugador("Alberto Sanchez","Colombia","central izquierdo","Imagenes\\alberto sanchez.jpg",0,3,3,79));
		jugadores.add(asignarDatosJugador("Frank Fabra","Colombia","lateral izquierdo","Imagenes\\frank fabra.jpg",3,9,9,77));
		jugadores.add(asignarDatosJugador("Wilmer Barrios","Colombia","volante central","Imagenes\\wilmer barrios.jpg",1,8,8,77));
		jugadores.add(asignarDatosJugador("Freddy Guarin","Colombia","volante derecho","Imagenes\\freddy guarin.jpg",4,4,4,84));
		jugadores.add(asignarDatosJugador("Juan Cuadrado","Colombia","volante izquierdo","Imagenes\\juan cuadrado.jpg",6,10,10,85));
		jugadores.add(asignarDatosJugador("Edwin Cardona","Colombia","puntero izquierdo","Imagenes\\edwin cardona.jpg",8,10,10,75));
		jugadores.add(asignarDatosJugador("James Rodriguez","Colombia","puntero derecho","Imagenes\\james rodriguez.jpg",14,4,4,85));
		jugadores.add(asignarDatosJugador("Radamel Falcao","Colombia","centro delantero","Imagenes\\radamel falcao.jpg",26,3,3,84));
		//SELECCION PERU
		jugadores.add(asignarDatosJugador("Pedro Gallese","Peru","arquero","Imagenes\\pedro gallese.jpg",0,4,4,74));
		jugadores.add(asignarDatosJugador("Aldo Corzo","Peru","lateral derecho","Imagenes\\aldo corzo.jpg",5,4,4,69));
		jugadores.add(asignarDatosJugador("Alberto Rodriguez","Peru","central derecho","Imagenes\\alberto rodriguez.jpg",0,1,1,74));
		jugadores.add(asignarDatosJugador("Guillermo Ramos","Peru","central izquierdo","Imagenes\\guillermo ramos.jpg",2,8,8,70));
		jugadores.add(asignarDatosJugador("Miguel Trauco","Peru","lateral izquierdo","Imagenes\\miguel trauco.jpg",0,3,3,74));
		jugadores.add(asignarDatosJugador("Renato Tapia","Peru","volante central","Imagenes\\renato tapia.jpg",2,6,6,73));
		jugadores.add(asignarDatosJugador("Yoshimar Yotun","Peru","volante izquierdo","Imagenes\\yoshimar yotun.jpg",3,7,7,70));
		jugadores.add(asignarDatosJugador("Christian Cueva","Peru","volante derecho","Imagenes\\christian cueva.jpg",7,4,4,78));
		jugadores.add(asignarDatosJugador("Jefferson Farfan","Peru","centro delantero","Imagenes\\jefferson farfan.jpg",17,5,5,80));
		jugadores.add(asignarDatosJugador("Andre Carrillo","Peru","puntero izquierdo","Imagenes\\andre carrillo.jpg",2,5,5,78));
		jugadores.add(asignarDatosJugador("Edison Flores","Peru","puntero derecho","Imagenes\\edison flores.jpg",6,1,1,72));
		//SELECCION MEXICO
		jugadores.add(asignarDatosJugador("Guillermo Ochoa","Mexico","arquero","Imagenes\\guillermo ochoa.jpg",0,1,1,79));
		jugadores.add(asignarDatosJugador("Carlos Salcedo","Mexico","lateral derecho","Imagenes\\carlos salcedo.jpg",0,10,10,75));
		jugadores.add(asignarDatosJugador("Diego Reyes","Mexico","central derecho","Imagenes\\diego reyes.jpg",4,4,4,79));
		jugadores.add(asignarDatosJugador("Hector Moreno","Mexico","central izquierdo","Imagenes\\hector moreno.jpg",2,3,3,80));
		jugadores.add(asignarDatosJugador("Miguel Layun","Mexico","lateral izquierdo","Imagenes\\miguel layun.jpg",4,6,6,78));
		jugadores.add(asignarDatosJugador("Giovani Dos Santos","Mexico","volante derecho","Imagenes\\giovani dos santos.jpg",2,1,1,76));
		jugadores.add(asignarDatosJugador("Hector Herrera","Mexico","volante central","Imagenes\\hector herrera.jpg",6,11,11,78));
		jugadores.add(asignarDatosJugador("Andres Guardado","Mexico","volante izquierdo","Imagenes\\andres guardado.jpg",4,7,7,81));
		jugadores.add(asignarDatosJugador("Carlos Vela","Mexico","puntero derecho","Imagenes\\carlos vela.jpg",11,2,2,82));
		jugadores.add(asignarDatosJugador("Chicharito Hernandez","Mexico","centro delantero","Imagenes\\chicharito hernandez.jpg",11,3,3,80));
		jugadores.add(asignarDatosJugador("Jesus Corona","Mexico","puntero izquierdo","Imagenes\\jesus corona.jpg",6,7,7,77));
		//SELECCION COSTA RICA
		jugadores.add(asignarDatosJugador("Keylor Navas","Costa Rica","arquero","Imagenes\\keylor navas.jpg",0,1,1,86));
		jugadores.add(asignarDatosJugador("Cristian Gamboa","Costa Rica","lateral derecho","Imagenes\\cristian gamboa.jpg",1,4,4,75));
		jugadores.add(asignarDatosJugador("Johnny Acosta","Costa Rica","central derecho","Imagenes\\johnny acosta.jpg",3,10,10,72));
		jugadores.add(asignarDatosJugador("Francisco Calvo","Costa Rica","central izquierdo","Imagenes\\francisco calvo.jpg",1,6,6,73));
		jugadores.add(asignarDatosJugador("Kendall Waston","Costa Rica","lateral izquierdo","Imagenes\\kendall waston.jpg",3,9,9,75));
		jugadores.add(asignarDatosJugador("David Guzman","Costa Rica","volante derecho","Imagenes\\david guzman.jpg",0,2,2,70));
		jugadores.add(asignarDatosJugador("Celso Borges","Costa Rica","volante central","Imagenes\\celso borges.jpg",4,5,5,78));
		jugadores.add(asignarDatosJugador("Bryan Ruiz","Costa Rica","volante izquierdo","Imagenes\\bryan ruiz.jpg",5,4,4,77));
		jugadores.add(asignarDatosJugador("Christian Bolaños","Costa Rica","puntero derecho","Imagenes\\christian bolaños.jpg",4,2,2,76));
		jugadores.add(asignarDatosJugador("Marco Ureña","Costa Rica","centro delantero","Imagenes\\marco ureña.jpg",4,1,1,71));
		jugadores.add(asignarDatosJugador("Joel Campbell","Costa Rica","puntero izquierdo","Imagenes\\joel campbell.jpg",4,2,2,75));
		//SELECCION PANAMA
		jugadores.add(asignarDatosJugador("Jaime Penedo","Panama","arquero","Imagenes\\jaime penedo.jpg",0,0,0,71));
		jugadores.add(asignarDatosJugador("Adolfo Machado","Panama","lateral derecho","Imagenes\\adolfo machado.jpg",0,4,4,71));
		jugadores.add(asignarDatosJugador("Roman Torres","Panama","central derecho","Imagenes\\roman torres.jpg",2,5,5,70));
		jugadores.add(asignarDatosJugador("Felipe Baloy","Panama","central izquierdo","Imagenes\\felipe baloy.jpg",2,20,20,68));
		jugadores.add(asignarDatosJugador("Luis Ovalle","Panama","lateral izquierdo","Imagenes\\luis ovalle.jpg",0,6,6,63));
		jugadores.add(asignarDatosJugador("Gabriel Gomez","Panama","volante derecho","Imagenes\\gabriel gomez.jpg",1,9,9,72));
		jugadores.add(asignarDatosJugador("Anibal Godoy","Panama","volante central","Imagenes\\anibal godoy.jpg",0,5,5,63));
		jugadores.add(asignarDatosJugador("Alberto Quintero","Panama","volante izquierdo","Imagenes\\alberto quintero.jpg",2,8,8,73));
		jugadores.add(asignarDatosJugador("Joel Barcenas","Panama","puntero derecho","Imagenes\\joel barcenas.jpg",10,4,4,75));
		jugadores.add(asignarDatosJugador("Gabriel Torres","Panama","centro delantero","Imagenes\\gabriel torres.jpg",12,3,3,65));
		jugadores.add(asignarDatosJugador("Blas Perez","Panama","puntero izquierdo","Imagenes\\blas perez.jpg",16,20,20,67));
		//SELECCION IRAN
		jugadores.add(asignarDatosJugador("Alireza Beiranvand","Iran","arquero","Imagenes\\alireza beiranvand.jpg",0,5,5,71));
		jugadores.add(asignarDatosJugador("Ramin Rezaeian","Iran","lateral derecho","Imagenes\\ramin rezaeian.jpg",3,3,3,72));
		jugadores.add(asignarDatosJugador("Morteza Pouraliganji","Iran","central derecho","Imagenes\\morteza pouraliganji.jpg",3,3,3,71));
		jugadores.add(asignarDatosJugador("Mohammad Ansari","Iran","central izquierdo","Imagenes\\mohammad ansari.jpg",1,2,2,68));
		jugadores.add(asignarDatosJugador("Milad Mohammadi","Iran","lateral izquierdo","Imagenes\\milad mohammadi.jpg",0,1,1,70));
		jugadores.add(asignarDatosJugador("Ali Karimi","Iran","volante derecho","Imagenes\\ali karimi.jpg",0,2,2,66));
		jugadores.add(asignarDatosJugador("Saeid Ezatolahi","Iran","volante central","Imagenes\\saeid ezatolahi.jpg",2,6,6,72));
		jugadores.add(asignarDatosJugador("Ehsan Hajsafi","Iran","volante izquierdo","Imagenes\\ehsan hajsafi.jpg",3,1,1,71));
		jugadores.add(asignarDatosJugador("Alireza Jahanbakhsh","Iran","puntero derecho","Imagenes\\alireza jahanbakhsh.jpg",24,6,6,77));
		jugadores.add(asignarDatosJugador("Sardar Azmoun","Iran","centro delantero","Imagenes\\sardar azmoun.jpg",18,7,7,77));
		jugadores.add(asignarDatosJugador("Mehdi Taremi","Iran","puntero izquierdo","Imagenes\\mehdi taremi.jpg",22,7,7,73));
		//SELECCION JAPON
		jugadores.add(asignarDatosJugador("Eiji Kawashima","Japon","arquero","Imagenes\\eiji kawashima.jpg",0,1,1,74));
		jugadores.add(asignarDatosJugador("Hiroki Sakai","Japon","lateral derecho","Imagenes\\hiroki sakai.jpg",1,5,5,79));
		jugadores.add(asignarDatosJugador("Maya Yoshida","Japon","central derecho","Imagenes\\maya yoshida.jpg",6,6,6,78));
		jugadores.add(asignarDatosJugador("Gen Shoji","Japon","central izquierdo","Imagenes\\gen shoji.jpg",0,5,5,71));
		jugadores.add(asignarDatosJugador("Yuto Nagatomo","Japon","lateral izquierdo","Imagenes\\yuto nagatomo.jpg",0,4,4,75));
		jugadores.add(asignarDatosJugador("Hotaru Yamaguchi","Japon","volante derecho","Imagenes\\hotaru yamaguchi.jpg",2,2,2,73));
		jugadores.add(asignarDatosJugador("Yosuke Ideguchi","Japon","volante central","Imagenes\\yosuke ideguchi.jpg",1,1,1,69));
		jugadores.add(asignarDatosJugador("Gaku Shibasaki","Japon","volante izquierdo","Imagenes\\gaku shibasaki.jpg",1,2,2,71));
		jugadores.add(asignarDatosJugador("Keisuke Honda","Japon","puntero derecho","Imagenes\\keisuke honda.jpg",20,3,3,77));
		jugadores.add(asignarDatosJugador("Shinji Okazaki","Japon","centro delantero","Imagenes\\shinji okazaki.jpg",12,2,2,78));
		jugadores.add(asignarDatosJugador("Shinji Kagawa","Japon","puntero izquierdo","Imagenes\\shinji kagawa.jpg",12,0,0,81));
		//SELECCION COREA DEL SUR
		jugadores.add(asignarDatosJugador("Kim Seung-Gyu","Corea Del Sur","arquero","Imagenes\\kim seung-gyu.jpg",0,0,0,76));
		jugadores.add(asignarDatosJugador("Chul-Soon Choi","Corea Del Sur","lateral derecho","Imagenes\\chul-soon choi.jpg",0,3,3,69));
		jugadores.add(asignarDatosJugador("Kim Min-Jae","Corea Del Sur","central derecho","Imagenes\\kim min-jae.jpg",1,2,2,75));
		jugadores.add(asignarDatosJugador("Kim Young-Gwon","Corea Del Sur","central izquierdo","Imagenes\\kim young-gwon.jpg",0,4,4,74));
		jugadores.add(asignarDatosJugador("Kim Jin-Su","Corea Del Sur","lateral izquierdo","Imagenes\\kim jin-su.jpg",2,1,1,76));
		jugadores.add(asignarDatosJugador("Ki Sung-Yong","Corea Del Sur","volante derecho","Imagenes\\ki sung-yong.jpg",6,4,4,79));
		jugadores.add(asignarDatosJugador("Lee Keun-Ho","Corea Del Sur","volante central","Imagenes\\lee keun-ho.jpg",0,0,0,68));
		jugadores.add(asignarDatosJugador("Jang Hyun-Soo","Corea Del Sur","volante izquierdo","Imagenes\\jang hyun-soo.jpg",2,2,2,69));
		jugadores.add(asignarDatosJugador("Kwon Chang-Hoon","Corea Del Sur","puntero derecho","Imagenes\\kwon chang-hoon.jpg",14,3,3,69));
		jugadores.add(asignarDatosJugador("Hwang Ui-Jo","Corea Del Sur","centro delantero","Imagenes\\hwang ui-jo.jpg",8,1,1,63));
		jugadores.add(asignarDatosJugador("Son Heung-Min","Corea Del Sur","puntero izquierdo","Imagenes\\son heung-min.jpg",23,2,2,82));
		//SELECCION ARABIA SAUDITA
		jugadores.add(asignarDatosJugador("Abdullah Al-Mayouf","Arabia Saudita","arquero","Imagenes\\abdullah al-mayouf.jpg",0,0,0,69));
		jugadores.add(asignarDatosJugador("Yasir Al-Shahrani","Arabia Saudita","lateral derecho","Imagenes\\yasir al-shahrani.jpg",2,3,3,74));
		jugadores.add(asignarDatosJugador("Osama Hawsawi","Arabia Saudita","central derecho","Imagenes\\osama hawsawi.jpg",1,5,5,73));
		jugadores.add(asignarDatosJugador("Omar Hawsawi","Arabia Saudita","central izquierdo","Imagenes\\omar hawsawi.jpg",1,2,2,66));
		jugadores.add(asignarDatosJugador("Mansoor Al-Harbi","Arabia Saudita","lateral izquierdo","Imagenes\\mansoor al-harbi.jpg",1,1,1,66));
		jugadores.add(asignarDatosJugador("Nawaf Al-Abid","Arabia Saudita","volante derecho","Imagenes\\nawaf al-abid.jpg",5,3,3,73));
		jugadores.add(asignarDatosJugador("Abdullah Otayf","Arabia Saudita","volante central","Imagenes\\abdullah otayf.jpg",0,3,3,66));
		jugadores.add(asignarDatosJugador("Salman Al-Faraj","Arabia Saudita","volante izquierdo","Imagenes\\salman al-faraj.jpg",4,5,5,72));
		jugadores.add(asignarDatosJugador("Yahya Al-Shehri","Arabia Saudita","puntero derecho","Imagenes\\yahya al-shehri.jpg",9,0,0,68));
		jugadores.add(asignarDatosJugador("Mohammed Al-Sahlawi","Arabia Saudita","centro delantero","Imagenes\\mohammed al-sahlawi.jpg",26,1,0,69));
		jugadores.add(asignarDatosJugador("Taiseer Al-Jassam","Arabia Saudita","puntero izquierdo","Imagenes\\taiseer al-jassam.jpg",8,3,3,74));
		//SELECCION AUSTRALIA
		jugadores.add(asignarDatosJugador("Mathew Ryan","Australia","arquero","Imagenes\\mathew ryan.jpg",0,0,0,78));
		jugadores.add(asignarDatosJugador("Josh Risdon","Australia","lateral derecho","Imagenes\\josh risdon.jpg",0,11,11,70));
		jugadores.add(asignarDatosJugador("Bailey Wright","Australia","central derecho","Imagenes\\bailey wright.jpg",0,7,7,71));
		jugadores.add(asignarDatosJugador("Trent Sainsbury","Australia","central izquierdo","Imagenes\\trent sainsbury.jpg",0,7,7,74));
		jugadores.add(asignarDatosJugador("Matthew Jurman","Australia","lateral izquierdo","Imagenes\\matthew jurman.jpg",0,1,1,63));
		jugadores.add(asignarDatosJugador("Mark Milligan","Australia","volante derecho","Imagenes\\mark milligan.jpg",3,6,6,73));
		jugadores.add(asignarDatosJugador("Tomas Rogic","Australia","volante central","Imagenes\\tomas rogic.jpg",5,1,1,72));
		jugadores.add(asignarDatosJugador("Aaron Mooy","Australia","volante izquierdo","Imagenes\\aaron mooy.jpg",6,7,7,79));
		jugadores.add(asignarDatosJugador("Mathew Leckie","Australia","puntero derecho","Imagenes\\mathew leckie.jpg",10,6,6,74));
		jugadores.add(asignarDatosJugador("Tim Cahill","Australia","centro delantero","Imagenes\\tim cahill.jpg",11,5,5,70));
		jugadores.add(asignarDatosJugador("Aziz Behich","Australia","puntero izquierdo","Imagenes\\aziz behich.jpg",5,8,8,67));
		//SELECCION NIGERIA
		jugadores.add(asignarDatosJugador("Ikechukwu Ezenwa","Nigeria","arquero","Imagenes\\ikechukwu ezenwa.jpg",0,0,0,71));
		jugadores.add(asignarDatosJugador("Abdullahi Shehu","Nigeria","lateral derecho","Imagenes\\abdullahi shehu.jpg",1,10,10,72));
		jugadores.add(asignarDatosJugador("William Troost-Ekong","Nigeria","central derecho","Imagenes\\william troost-ekong.jpg",2,2,2,73));
		jugadores.add(asignarDatosJugador("Leon Balogun","Nigeria","central izquierdo","Imagenes\\leon balogun.jpg",0,8,8,76));
		jugadores.add(asignarDatosJugador("Elderson Echiejile","Nigeria","lateral izquierdo","Imagenes\\elderson echiejile.jpg",0,3,3,71));
		jugadores.add(asignarDatosJugador("Wilfred Ndidi","Nigeria","volante derecho","Imagenes\\wilfred ndidi.jpg",0,10,10,79));
		jugadores.add(asignarDatosJugador("John Obi Mikel","Nigeria","volante central","Imagenes\\john obi mikel.jpg",3,5,5,79));
		jugadores.add(asignarDatosJugador("Ogenyi Onazi","Nigeria","volante izquierdo","Imagenes\\ogenyi onazi.jpg",3,6,6,77));
		jugadores.add(asignarDatosJugador("Victor Moses","Nigeria","puntero derecho","Imagenes\\victor moses.jpg",6,5,5,80));
		jugadores.add(asignarDatosJugador("Odion Ighalo","Nigeria","centro delantero","Imagenes\\odion ighalo.jpg",8,4,4,78));
		jugadores.add(asignarDatosJugador("Alex Iwobi","Nigeria","puntero izquierdo","Imagenes\\alex iwobi.jpg",5,1,1,76));
		//SELECCION EGIPTO
		jugadores.add(asignarDatosJugador("Essam El-Hadary","Egipto","arquero","Imagenes\\essam el-hadary.jpg",1,1,1,73));
		jugadores.add(asignarDatosJugador("Ahmed Fathy","Egipto","lateral derecho","Imagenes\\ahmed fathy.jpg",0,0,0,71));
		jugadores.add(asignarDatosJugador("Ramy Rabia","Egipto","central derecho","Imagenes\\ramy rabia.jpg",0,0,0,66));
		jugadores.add(asignarDatosJugador("Ahmed Hegazy","Egipto","central izquierdo","Imagenes\\ahmed hegazy.jpg",2,5,5,74));
		jugadores.add(asignarDatosJugador("Mohamed Abdel-Shafy","Egipto","lateral izquierdo","Imagenes\\mohamed abdel-shafy.jpg",0,1,1,72));
		jugadores.add(asignarDatosJugador("Mohamed El-Nenny","Egipto","volante derecho","Imagenes\\mohamed el-nenny.jpg",2,5,5,79));
		jugadores.add(asignarDatosJugador("Saleh Gomaa","Egipto","volante central","Imagenes\\saleh gomaa.jpg",0,2,2,71));
		jugadores.add(asignarDatosJugador("Tarek Hamed","Egipto","volante izquierdo","Imagenes\\tarek hamed.jpg",0,2,2,70));
		jugadores.add(asignarDatosJugador("Mohamed Salah","Egipto","puntero derecho","Imagenes\\mohamed salah.jpg",48,2,2,85));
		jugadores.add(asignarDatosJugador("Ahmed Mahgoub","Egipto","centro delantero","Imagenes\\ahmed mahgoub.jpg",8,6,6,73));
		jugadores.add(asignarDatosJugador("Ramadan Sobhi","Egipto","puntero izquierdo","Imagenes\\ramadan sobhi.jpg",4,2,2,73));
		//SELECCION SENEGAL
		jugadores.add(asignarDatosJugador("Khadim Ndiaye","Senegal","arquero","Imagenes\\khadim ndiaye.jpg",0,0,0,78));
		jugadores.add(asignarDatosJugador("Lamine Gassama","Senegal","lateral derecho","Imagenes\\lamine gassama.jpg",0,10,10,76));
		jugadores.add(asignarDatosJugador("Kara Mbodji","Senegal","central derecho","Imagenes\\kara mbodji.jpg",1,4,4,77));
		jugadores.add(asignarDatosJugador("Kalidou Koulibaly","Senegal","central izquierdo","Imagenes\\kalidou koulibaly.jpg",5,14,14,84));
		jugadores.add(asignarDatosJugador("Saliou Ciss","Senegal","lateral izquierdo","Imagenes\\saliou ciss.jpg",3,2,2,71));
		jugadores.add(asignarDatosJugador("Badou Ndiaye","Senegal","volante derecho","Imagenes\\badou ndiaye.jpg",3,11,11,78));
		jugadores.add(asignarDatosJugador("Cheikhou Kouyate","Senegal","volante central","Imagenes\\cheikhou kouyate.jpg",3,5,5,79));
		jugadores.add(asignarDatosJugador("Idrissa Gueye","Senegal","volante izquierdo","Imagenes\\idrissa gueye.jpg",3,9,9,82));
		jugadores.add(asignarDatosJugador("Keita Balde","Senegal","puntero derecho","Imagenes\\keita balde.jpg",9,5,5,83));
		jugadores.add(asignarDatosJugador("Moussa Sow","Senegal","centro delantero","Imagenes\\moussa sow.jpg",6,2,2,77));
		jugadores.add(asignarDatosJugador("Sadio Mane","Senegal","puntero izquierdo","Imagenes\\sadio mane.jpg",22,8,8,84));
		//SELECCION MARRUECOS
		jugadores.add(asignarDatosJugador("Munir Mohamedi","Marruecos","arquero","Imagenes\\munir mohamedi.jpg",0,0,0,68));
		jugadores.add(asignarDatosJugador("Achraf Hakimi","Marruecos","lateral izquierdo","Imagenes\\achraf hakimi.jpg",3,0,0,71));
		jugadores.add(asignarDatosJugador("Mehdi Benatia","Marruecos","central derecho","Imagenes\\mehdi benatia.jpg",5,13,13,82));
		jugadores.add(asignarDatosJugador("Romain Saiss","Marruecos","central izquierdo","Imagenes\\romain saiss.jpg",4,13,13,75));
		jugadores.add(asignarDatosJugador("Nabil Dirar","Marruecos","lateral derecho","Imagenes\\nabil dirar.jpg",6,5,5,75));
		jugadores.add(asignarDatosJugador("Karim El Ahmadi","Marruecos","volante derecho","Imagenes\\karim el ahmadi.jpg",2,8,8,80));
		jugadores.add(asignarDatosJugador("Faycal Fajr","Marruecos","volante central","Imagenes\\faycal fajr.jpg",2,8,8,76));
		jugadores.add(asignarDatosJugador("Mbark Boussoufa","Marruecos","volante izquierdo","Imagenes\\mbark boussoufa.jpg",3,13,13,77));
		jugadores.add(asignarDatosJugador("Nordin Amrabat","Marruecos","puntero derecho","Imagenes\\nordin amrabat.jpg",3,8,8,79));
		jugadores.add(asignarDatosJugador("Khalid Boutaib","Marruecos","centro delantero","Imagenes\\khalid boutaib.jpg",16,8,8,72));
		jugadores.add(asignarDatosJugador("Hakim Ziyech","Marruecos","puntero izquierdo","Imagenes\\hakim ziyech.jpg",11,5,5,84));
		//SELECCION TUNEZ
		jugadores.add(asignarDatosJugador("Aymen Mathlouthi","Tunez","arquero","Imagenes\\aymen mathlouthi.jpg",0,1,1,71));
		jugadores.add(asignarDatosJugador("Hamdi Nagguez","Tunez","lateral derecho","Imagenes\\hamdi nagguez.jpg",0,2,2,70));
		jugadores.add(asignarDatosJugador("Syam Ben Youssef","Tunez","central derecho","Imagenes\\syam ben youssef.jpg",0,1,1,75));
		jugadores.add(asignarDatosJugador("Aymen Abdennour","Tunez","central izquierdo","Imagenes\\aymen abdennour.jpg",1,6,6,74));
		jugadores.add(asignarDatosJugador("Ali Maaloul","Tunez","lateral izquierdo","Imagenes\\ali maaloul.jpg",0,0,0,62));
		jugadores.add(asignarDatosJugador("Mohamed Ben Amor","Tunez","volante derecho","Imagenes\\mohamed ben amor.jpg",1,5,5,70));
		jugadores.add(asignarDatosJugador("Youssef Msakni","Tunez","volante central","Imagenes\\youssef msakni.jpg",30,4,4,71));
		jugadores.add(asignarDatosJugador("Ghaylene Chaalali","Tunez","volante izquierdo","Imagenes\\ghaylene chaalali.jpg",2,5,5,69));
		jugadores.add(asignarDatosJugador("Fakhreddine Ben Youssef","Tunez","puntero derecho","Imagenes\\fakhreddine ben youssef.jpg",8,4,4,65));
		jugadores.add(asignarDatosJugador("Wahbi Khazri","Tunez","puntero izquierdo","Imagenes\\wahbi khazri.jpg",13,11,11,80));
		jugadores.add(asignarDatosJugador("Yassine Khenissi","Tunez","centro delantero","Imagenes\\yassine khenissi.jpg",9,3,3,64));
		//SELECCION RUSIA
		jugadores.add(asignarDatosJugador("Igor Akinfeyev","Rusia","arquero","Imagenes\\igor akinfeyev.jpg",0,2,2,80));
		jugadores.add(asignarDatosJugador("Igor Smolnikov","Rusia","lateral derecho","Imagenes\\igor smolnikov.jpg",0,7,7,79));
		jugadores.add(asignarDatosJugador("Roman Neustadter","Rusia","central derecho","Imagenes\\roman neustadter.jpg",5,7,7,73));
		jugadores.add(asignarDatosJugador("Vladimir Granat","Rusia","central izquierdo","Imagenes\\vladimir granat.jpg",0,10,10,70));
		jugadores.add(asignarDatosJugador("Fiodor Kudriashov","Rusia","lateral izquierdo","Imagenes\\fiodor kudriashov.jpg",0,7,7,62));
		jugadores.add(asignarDatosJugador("Alan Dzagoev","Rusia","volante derecho","Imagenes\\alan dzagoev.jpg",7,7,7,81));
		jugadores.add(asignarDatosJugador("Aleksandr Erokhin","Rusia","volante central","Imagenes\\aleksandr erokhin.jpg",8,9,9,74));
		jugadores.add(asignarDatosJugador("Yuri Zhirkov","Rusia","volante izquierdo","Imagenes\\yuri zhirkov.jpg",1,2,2,76));
		jugadores.add(asignarDatosJugador("Aleksandr Samedov","Rusia","puntero derecho","Imagenes\\aleksandr samedov.jpg",3,5,5,79));
		jugadores.add(asignarDatosJugador("Aleksei Miranchuk","Rusia","centro delantero","Imagenes\\aleksei miranchuk.jpg",8,4,4,72));
		jugadores.add(asignarDatosJugador("Fiodor Smolov","Rusia","puntero izquierdo","Imagenes\\fiodor smolov.jpg",14,6,6,79));
		//SELECCION ALEMANIA
		jugadores.add(asignarDatosJugador("Manuel Neuer","Alemania","arquero","Imagenes\\manuel neuer.jpg",0,0,0,91));
		jugadores.add(asignarDatosJugador("Joshua Kimmic","Alemania","lateral derecho","Imagenes\\joshua kimmic.jpg",8,4,4,83));
		jugadores.add(asignarDatosJugador("Jerome Boateng","Alemania","central derecho","Imagenes\\jerome boateng.jpg",2,8,8,88));
		jugadores.add(asignarDatosJugador("Mats Hummels","Alemania","central izquierdo","Imagenes\\mats hummels.jpg",4,6,6,87));
		jugadores.add(asignarDatosJugador("Jonas Hector","Alemania","lateral izquierdo","Imagenes\\jonas hector.jpg",4,4,4,81));
		jugadores.add(asignarDatosJugador("Sami Khedira","Alemania","volante derecho","Imagenes\\sami khedira.jpg",11,3,3,84));
		jugadores.add(asignarDatosJugador("Mesut Ozil","Alemania","volante central","Imagenes\\mesut ozil.jpg",6,4,4,88));
		jugadores.add(asignarDatosJugador("Toni Kroos","Alemania","volante izquierdo","Imagenes\\toni kroos.jpg",6,4,4,88));
		jugadores.add(asignarDatosJugador("Thomas Muller","Alemania","puntero derecho","Imagenes\\thomas muller.jpg",20,6,6,86));
		jugadores.add(asignarDatosJugador("Timo Werner","Alemania","centro delantero","Imagenes\\timo werner.jpg",24,1,1,83));
		jugadores.add(asignarDatosJugador("Julian Draxler","Alemania","puntero izquierdo","Imagenes\\julian draxler.jpg",8,3,3,83));
		//SELECCION INGLATERRA
		jugadores.add(asignarDatosJugador("Jack Butland","Inglaterra","arquero","Imagenes\\jack butland.jpg",0,0,0,81));
		jugadores.add(asignarDatosJugador("Kyle Walker","Inglaterra","lateral derecho","Imagenes\\kyle walker.jpg",0,6,6,82));
		jugadores.add(asignarDatosJugador("John Stones","Inglaterra","central derecho","Imagenes\\john stones.jpg",3,1,1,80));
		jugadores.add(asignarDatosJugador("Phil Jones","Inglaterra","central izquierdo","Imagenes\\phil jones.jpg",0,2,2,81));
		jugadores.add(asignarDatosJugador("Danny Rose","Inglaterra","lateral izquierdo","Imagenes\\danny rose.jpg",0,5,5,81));
		jugadores.add(asignarDatosJugador("Jordan Henderson","Inglaterra","volante derecho","Imagenes\\jordan henderson.jpg",1,5,5,82));
		jugadores.add(asignarDatosJugador("Eric Dier","Inglaterra","volante central","Imagenes\\eric dier.jpg",1,8,8,81));
		jugadores.add(asignarDatosJugador("Dele Alli","Inglaterra","volante izquierdo","Imagenes\\dele alli.jpg",14,8,8,83));
		jugadores.add(asignarDatosJugador("Raheem Sterling","Inglaterra","puntero derecho","Imagenes\\raheem sterling.jpg",22,7,7,83));
		jugadores.add(asignarDatosJugador("Harry Kane","Inglaterra","centro delantero","Imagenes\\harry kane.jpg",42,5,5,87));
		jugadores.add(asignarDatosJugador("Marcus Rashford","Inglaterra","puntero izquierdo","Imagenes\\marcus rashford.jpg",13,6,6,80));
		//SELECCION BELGICA
		jugadores.add(asignarDatosJugador("Thibaut Courtois","Belgica","arquero","Imagenes\\thibaut courtois.jpg",0,2,2,88));
		jugadores.add(asignarDatosJugador("Jordan Lukaku","Belgica","lateral derecho","Imagenes\\jordan lukaku.jpg",1,4,4,75));
		jugadores.add(asignarDatosJugador("Toby Alderweireld","Belgica","central derecho","Imagenes\\toby alderweireld.jpg",1,3,3,85));
		jugadores.add(asignarDatosJugador("Thomas Varmaelen","Belgica","central izquierdo","Imagenes\\thomas varmaelen.jpg",0,5,5,79));
		jugadores.add(asignarDatosJugador("Jan Vertonghen","Belgica","lateral izquierdo","Imagenes\\jan vertonghen.jpg",2,7,7,84));
		jugadores.add(asignarDatosJugador("Thomas Meunier","Belgica","volante derecho","Imagenes\\thomas meunier.jpg",10,6,6,81));
		jugadores.add(asignarDatosJugador("Marouane Fellaini","Belgica","volante central","Imagenes\\marouane fellaini.jpg",5,4,4,80));
		jugadores.add(asignarDatosJugador("Yannick Carrasco","Belgica","volante izquierdo","Imagenes\\yannick carrasco.jpg",10,8,8,84));
		jugadores.add(asignarDatosJugador("Kevin De Bruyne","Belgica","puntero derecho","Imagenes\\kevin de bruyne.jpg",11,6,6,87));
		jugadores.add(asignarDatosJugador("Romelu Lukaku","Belgica","centro delantero","Imagenes\\romelu lukaku.jpg",32,5,5,87));
		jugadores.add(asignarDatosJugador("Eden Hazard","Belgica","puntero izquierdo","Imagenes\\eden hazard.jpg",22,3,3,89));
		//SELECCION ESPAÑA
		jugadores.add(asignarDatosJugador("David De Gea","España","arquero","Imagenes\\david de gea.jpg",0,0,0,88));
		jugadores.add(asignarDatosJugador("Daniel Carvajal","España","lateral derecho","Imagenes\\daniel carvajal.jpg",0,16,16,84));
		jugadores.add(asignarDatosJugador("Sergio Ramos","España","central derecho","Imagenes\\sergio ramos.jpg",6,16,16,88));
		jugadores.add(asignarDatosJugador("Gerard Pique","España","central izquierdo","Imagenes\\gerard pique.jpg",4,15,15,87));
		jugadores.add(asignarDatosJugador("Jordi Alba","España","lateral izquierdo","Imagenes\\jordi alba.jpg",3,11,11,84));
		jugadores.add(asignarDatosJugador("Koke Resurreccion","España","volante derecho","Imagenes\\koke resurreccion.jpg",6,4,4,85));
		jugadores.add(asignarDatosJugador("Sergio Busquets","España","volante central","Imagenes\\sergio busquets.jpg",1,12,12,87));
		jugadores.add(asignarDatosJugador("Thiago Alcantara","España","volante izquierdo","Imagenes\\thiago alcantara.jpg",8,7,7,87));
		jugadores.add(asignarDatosJugador("David Silva","España","puntero derecho","Imagenes\\david silva.jpg",15,8,8,87));
		jugadores.add(asignarDatosJugador("Alvaro Morata","España","centro delantero","Imagenes\\alvaro morata.jpg",18,9,9,85));
		jugadores.add(asignarDatosJugador("Isco Alarcon","España","puntero izquierdo","Imagenes\\isco alarcon.jpg",13,2,2,87));
		//SELECCION POLONIA
		jugadores.add(asignarDatosJugador("Wojciech Szczesny","Polonia","arquero","Imagenes\\wojciech szczesny.jpg",0,0,0,83));
		jugadores.add(asignarDatosJugador("Lukasz Piszczek","Polonia","lateral derecho","Imagenes\\lukasz piszczek.jpg",1,5,5,82));
		jugadores.add(asignarDatosJugador("Kamil Glik","Polonia","central derecho","Imagenes\\kamil glik.jpg",5,11,11,83));
		jugadores.add(asignarDatosJugador("Michal Pazdan","Polonia","central izquierdo","Imagenes\\michal pazdan.jpg",0,9,9,77));
		jugadores.add(asignarDatosJugador("Bartosz Bereszynski","Polonia","lateral izquierdo","Imagenes\\bartosz bereszynski.jpg",0,5,5,74));
		jugadores.add(asignarDatosJugador("Jakub Blaszczykowski","Polonia","volante derecho","Imagenes\\jakub blaszczykowski.jpg",2,1,1,80));
		jugadores.add(asignarDatosJugador("Krzysztof Maczynski","Polonia","volante central","Imagenes\\krzysztof maczynski.jpg",2,4,4,74));
		jugadores.add(asignarDatosJugador("Grzegorz Krychowiak","Polonia","volante izquierdo","Imagenes\\grzegorz krychowiak.jpg",0,2,2,80));
		jugadores.add(asignarDatosJugador("Arkadiusz Milik","Polonia","puntero derecho","Imagenes\\arkadiusz milik.jpg",7,2,2,81));
		jugadores.add(asignarDatosJugador("Robert Lewandowski","Polonia","centro delantero","Imagenes\\robert lewandowski.jpg",56,5,5,90));
		jugadores.add(asignarDatosJugador("Kamil Grosicki","Polonia","puntero izquierdo","Imagenes\\kamil grosicki.jpg",12,4,4,77));
		//SELECCION ISLANDIA
		jugadores.add(asignarDatosJugador("Hannes Halldorsson","Islandia","arquero","Imagenes\\hannes halldorsson.jpg",0,0,0,75));
		jugadores.add(asignarDatosJugador("Horour Magnusson","Islandia","lateral derecho","Imagenes\\horour nagnusson.jpg",1,0,0,69));
		jugadores.add(asignarDatosJugador("Kari Arnason","Islandia","central derecho","Imagenes\\kari arnason.jpg",5,4,4,78));
		jugadores.add(asignarDatosJugador("Ragnar Sigurosson","Islandia","central izquierdo","Imagenes\\ragnar sigurosson.jpg",1,3,3,72));
		jugadores.add(asignarDatosJugador("Birkir Saevarsson","Islandia","lateral izquierdo","Imagenes\\birkir saevarsson.jpg",0,0,0,76));
		jugadores.add(asignarDatosJugador("Emil Hallfredsson","Islandia","volante derecho","Imagenes\\emil hallfredsson.jpg",0,7,7,76));
		jugadores.add(asignarDatosJugador("Gylfi Sigurosson","Islandia","volante central","Imagenes\\gylfi sigurosson.jpg",8,3,3,82));
		jugadores.add(asignarDatosJugador("Aron Gunnarsson","Islandia","volante izquierdo","Imagenes\\aron gunnarsson.jpg",1,6,6,75));
		jugadores.add(asignarDatosJugador("Johann Guomundsson","Islandia","puntero derecho","Imagenes\\johann guomundsson.jpg",4,4,4,72));
		jugadores.add(asignarDatosJugador("Jon Boovarsson","Islandia","centro delantero","Imagenes\\jon boovarsson.jpg",7,2,2,71));
		jugadores.add(asignarDatosJugador("Birkir Bjarnason","Islandia","puntero izquierdo","Imagenes\\birkir bjarnason.jpg",5,2,2,79));
		//SELECCION SERBIA
		jugadores.add(asignarDatosJugador("Vladimir Stojkovic","Serbia","arquero","Imagenes\\vladimir stojkovic.jpg",0,7,7,70));
		jugadores.add(asignarDatosJugador("Branislav Ivanovic","Serbia","lateral derecho","Imagenes\\branislav ivanovic.jpg",6,1,1,81));
		jugadores.add(asignarDatosJugador("Nemanja Maksimovic","Serbia","central derecho","Imagenes\\nemanja maksimovic.jpg",1,3,3,69));
		jugadores.add(asignarDatosJugador("Matija Nastasic","Serbia","central izquierdo","Imagenes\\matija nastasic.jpg",0,9,9,79));
		jugadores.add(asignarDatosJugador("Aleksandar Kolarov","Serbia","lateral izquierdo","Imagenes\\aleksandar kolarov.jpg",5,6,6,80));
		jugadores.add(asignarDatosJugador("Radosav Petrovic","Serbia","volante derecho","Imagenes\\radosav petrovic.jpg",0,5,5,74));
		jugadores.add(asignarDatosJugador("Nemanja Matic","Serbia","volante central","Imagenes\\nemanja matic.jpg",2,8,8,84));
		jugadores.add(asignarDatosJugador("Adem Ljajic","Serbia","volante izquierdo","Imagenes\\adem ljajic.jpg",6,2,2,80));
		jugadores.add(asignarDatosJugador("Lazar Markovic","Serbia","puntero derecho","Imagenes\\lazar markovic.jpg",1,1,1,76));
		jugadores.add(asignarDatosJugador("Aleksandar Mitrovic","Serbia","centro delantero","Imagenes\\aleksandar mitrovic.jpg",20,3,3,75));
		jugadores.add(asignarDatosJugador("Dusan Tadic","Serbia","puntero izquierdo","Imagenes\\dusan tadic.jpg",10,5,5,81));
		//SELECCION PORTUGAL
		jugadores.add(asignarDatosJugador("Rui Patricio","Portugal","arquero","Imagenes\\rui patricio.jpg",0,4,4,82));
		jugadores.add(asignarDatosJugador("Joao Cancelo","Portugal","lateral derecho","Imagenes\\joao cancelo.jpg",3,4,4,77));
		jugadores.add(asignarDatosJugador("Pepe Ferreira","Portugal","central derecho","Imagenes\\pepe ferreira.jpg",2,10,10,85));
		jugadores.add(asignarDatosJugador("Bruno Alves","Portugal","central izquierdo","Imagenes\\bruno alves.jpg",2,4,4,77));
		jugadores.add(asignarDatosJugador("Raphael Guerreiro","Portugal","lateral izquierdo","Imagenes\\raphael guerreiro.jpg",2,0,0,80));
		jugadores.add(asignarDatosJugador("Gelson Martins","Portugal","volante derecho","Imagenes\\gelson martins.jpg",12,8,8,80));
		jugadores.add(asignarDatosJugador("Ricardo Carvalho","Portugal","volante central","Imagenes\\ricardo carvalho.jpg",0,0,0,77));
		jugadores.add(asignarDatosJugador("Joao Mario","Portugal","volante izquierdo","Imagenes\\joao mario.jpg",2,0,0,81));
		jugadores.add(asignarDatosJugador("Cristiano Ronaldo","Portugal","puntero derecho","Imagenes\\cristiano ronaldo.jpg",56,4,4,94));
		jugadores.add(asignarDatosJugador("Andre Silva","Portugal","centro delantero","Imagenes\\andre silva.jpg",19,1,1,79));
		jugadores.add(asignarDatosJugador("Bernardo Silva","Portugal","puntero izquierdo","Imagenes\\bernardo silva.jpg",8,1,1,84));
		//SELECCION FRANCIA
		jugadores.add(asignarDatosJugador("Hugo Lloris","Francia","arquero","Imagenes\\hugo lloris.jpg",0,2,2,87));
		jugadores.add(asignarDatosJugador("Djibril Sidibe","Francia","lateral derecho","Imagenes\\djibril sidibe.jpg",2,7,7,80));
		jugadores.add(asignarDatosJugador("Raphael Varane","Francia","central derecho","Imagenes\\raphael varane.jpg",0,4,4,83));
		jugadores.add(asignarDatosJugador("Samuel Umtiti","Francia","central izquierdo","Imagenes\\samuel umtiti.jpg",1,7,7,84));
		jugadores.add(asignarDatosJugador("Layvin Kurzawa","Francia","lateral izquierdo","Imagenes\\layvin kurzawa.jpg",5,2,2,80));
		jugadores.add(asignarDatosJugador("Paul Pogba","Francia","volante derecho","Imagenes\\paul pogba.jpg",8,11,11,89));
		jugadores.add(asignarDatosJugador("Ngolo Kante","Francia","volante central","Imagenes\\ngolo kante.jpg",1,4,4,86));
		jugadores.add(asignarDatosJugador("Blaise Matuidi","Francia","volante izquierdo","Imagenes\\blaise matuidi.jpg",5,6,6,83));
		jugadores.add(asignarDatosJugador("Antoine Griezmann","Francia","puntero derecho","Imagenes\\antoine griezmann.jpg",33,10,10,90));
		jugadores.add(asignarDatosJugador("Alexandre Lacazette","Francia","centro delantero","Imagenes\\alexandre lacazette.jpg",17,2,2,85));
		jugadores.add(asignarDatosJugador("Kylian Mbappe","Francia","puntero izquierdo","Imagenes\\kylian mbappe.jpg",22,4,4,82));
		//SELECCION SUIZA
		jugadores.add(asignarDatosJugador("Yann Sommer","Suiza","arquero","Imagenes\\yann sommer.jpg",0,1,1,83));
		jugadores.add(asignarDatosJugador("Stephan Lichtsteiner","Suiza","lateral derecho","Imagenes\\stephan lichtsteiner.jpg",3,8,8,81));
		jugadores.add(asignarDatosJugador("Fabian Schar","Suiza","central derecho","Imagenes\\fabian schar.jpg",3,13,13,77));
		jugadores.add(asignarDatosJugador("Manuel Akanji","Suiza","central izquierdo","Imagenes\\manuel akanji.jpg",1,6,6,72));
		jugadores.add(asignarDatosJugador("Ricardo Rodriguez","Suiza","lateral izquierdo","Imagenes\\ricardo rodriguez.jpg",7,7,7,82));
		jugadores.add(asignarDatosJugador("Denis Zakaria","Suiza","volante derecho","Imagenes\\denis zakaria.jpg",2,12,12,74));
		jugadores.add(asignarDatosJugador("Blerim Dzemaili","Suiza","volante central","Imagenes\\blerim dzemaili.jpg",2,5,5,77));
		jugadores.add(asignarDatosJugador("Granit Xhaka","Suiza","volante izquierdo","Imagenes\\granit xhaka.jpg",4,14,14,83));
		jugadores.add(asignarDatosJugador("Xherdan Shaqiri","Suiza","puntero derecho","Imagenes\\xherdan shaqiri.jpg",9,5,5,81));
		jugadores.add(asignarDatosJugador("Haris Seferovic","Suiza","centro delantero","Imagenes\\haris seferovic.jpg",10,3,3,75));
		jugadores.add(asignarDatosJugador("Steven Zuber","Suiza","puntero izquierdo","Imagenes\\steven zuber.jpg",3,2,2,79));
		//SELECCION CROACIA
		jugadores.add(asignarDatosJugador("Danijel Subasic","Croacia","arquero","Imagenes\\danijel subasic.jpg",0,3,3,83));
		jugadores.add(asignarDatosJugador("Sime Vrsaljko","Croacia","lateral derecho","Imagenes\\sime vrsaljko.jpg",0,11,11,79));
		jugadores.add(asignarDatosJugador("Dejan Lovren","Croacia","central derecho","Imagenes\\dejan lovren.jpg",2,6,6,80));
		jugadores.add(asignarDatosJugador("Domagoj Vida","Croacia","central izquierdo","Imagenes\\domagoj vida.jpg",2,6,6,77));
		jugadores.add(asignarDatosJugador("Ivan Strinic","Croacia","lateral izquierdo","Imagenes\\ivan strinic.jpg",0,3,3,76));
		jugadores.add(asignarDatosJugador("Ivan Rakitic","Croacia","volante derecho","Imagenes\\ivan rakitic.jpg",5,6,6,85));
		jugadores.add(asignarDatosJugador("Luka Modric","Croacia","volante central","Imagenes\\luka modric.jpg",3,5,5,89));
		jugadores.add(asignarDatosJugador("Marcelo Brozovic","Croacia","volante izquierdo","Imagenes\\marcelo brozovic.jpg",6,10,10,81));
		jugadores.add(asignarDatosJugador("Mario Madzukic","Croacia","puntero derecho","Imagenes\\mario madzukic.jpg",15,8,8,84));
		jugadores.add(asignarDatosJugador("Nikola Kalinic","Croacia","centro delantero","Imagenes\\nikola kalinic.jpg",9,4,4,82));
		jugadores.add(asignarDatosJugador("Ivan Perisic","Croacia","puntero izquierdo","Imagenes\\ivan perisic.jpg",13,6,6,84));
		//SELECCION SUECIA
		jugadores.add(asignarDatosJugador("Robin Olsen","Suecia","arquero","Imagenes\\robin olsen.jpg",0,3,3,76));
		jugadores.add(asignarDatosJugador("Mikael Lustig","Suecia","lateral derecho","Imagenes\\mikael lustig.jpg",4,10,10,75));
		jugadores.add(asignarDatosJugador("Victor Lindelof","Suecia","central derecho","Imagenes\\victor lindelof.jpg",1,2,2,81));
		jugadores.add(asignarDatosJugador("Andreas Granqvist","Suecia","central izquierdo","Imagenes\\andreas granqvist.jpg",5,8,8,74));
		jugadores.add(asignarDatosJugador("Ludwig Augustinsson","Suecia","lateral izquierdo","Imagenes\\ludwig augustinsson.jpg",1,5,5,77));
		jugadores.add(asignarDatosJugador("Sebastian Larsson","Suecia","volante derecho","Imagenes\\sebastian larsson.jpg",2,13,13,74));
		jugadores.add(asignarDatosJugador("Oscar Hiljemark","Suecia","volante central","Imagenes\\oscar hiljemark.jpg",3,4,4,78));
		jugadores.add(asignarDatosJugador("Emil Forsberg","Suecia","volante izquierdo","Imagenes\\emil forsberg.jpg",8,2,2,82));
		jugadores.add(asignarDatosJugador("Viktor Claesson","Suecia","puntero derecho","Imagenes\\viktor claesson.jpg",12,1,1,74));
		jugadores.add(asignarDatosJugador("Marcus Berg","Suecia","centro delantero","Imagenes\\marcus berg.jpg",41,4,4,79));
		jugadores.add(asignarDatosJugador("Ola Toivonen","Suecia","puntero izquierdo","Imagenes\\ola toivonen.jpg",5,4,4,75));
		//SELECCION DINAMARCA
		jugadores.add(asignarDatosJugador("Kasper Schmeichel","Dinamarca","arquero","Imagenes\\kasper schmeichel.jpg",0,4,4,84));
		jugadores.add(asignarDatosJugador("Andreas Christensen","Dinamarca","lateral derecho","Imagenes\\andreas christensen.jpg",1,0,0,80));
		jugadores.add(asignarDatosJugador("Simon Kjaer","Dinamarca","central derecho","Imagenes\\simon kjaer.jpg",3,5,5,81));
		jugadores.add(asignarDatosJugador("Andreas Bjelland","Dinamarca","central izquierdo","Imagenes\\andreas bjelland.jpg",1,3,3,72));
		jugadores.add(asignarDatosJugador("Riza Durmisi","Dinamarca","lateral izquierdo","Imagenes\\riza durmisi.jpg",2,4,4,77));
		jugadores.add(asignarDatosJugador("William Kvist","Dinamarca","volante derecho","Imagenes\\william kvist.jpg",0,13,13,73));
		jugadores.add(asignarDatosJugador("Christian Eriksen","Dinamarca","volante central","Imagenes\\christian eriksen.jpg",22,1,1,86));
		jugadores.add(asignarDatosJugador("Thomas Delaney","Dinamarca","volante izquierdo","Imagenes\\thomas delaney.jpg",7,7,7,80));
		jugadores.add(asignarDatosJugador("Yussuf Poulsen","Dinamarca","puntero derecho","Imagenes\\yussuf poulsen.jpg",6,4,4,78));
		jugadores.add(asignarDatosJugador("Nicolai Jorgensen","Dinamarca","centro delantero","Imagenes\\nicolai jorgensen.jpg",15,5,5,85));
		jugadores.add(asignarDatosJugador("Pione Sisto","Dinamarca","puntero izquierdo","Imagenes\\pione sisto.jpg",6,2,2,77));
		}
	public Jugador asignarDatosJugador(String nombre , String nacionalidad ,String posicion,String imagen,int goles,int faltas,int tarjetas,int promedio) 
	{
		Jugador jug=new Jugador(nombre,nacionalidad,posicion,imagen);
		jug.asignarPuntaje(goles, faltas, tarjetas, promedio);
		return jug;
	}

}
