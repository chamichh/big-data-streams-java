package streams;

import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.ArrayList;
import java.util.Arrays;

public class Config {
	
	static void generate() {
		String text = getText();
		String[] lines = text.split("\r\n");
		for (String line : lines) {
			String[] parts = line.split(";");
			ArrayList<String> pets = new ArrayList<String>();
			if (parts.length>6)
				pets.addAll(Arrays.asList(parts[6].split(",")));
			new Person(parts[0], parts[1], parts[5], Integer.parseInt(parts[2]), 
					Integer.parseInt(parts[4]), parts[3], pets);
		}
	}
	
	static void seeExample() {
		System.out.println("There are " +Person.all.size()+ " total persons. Here are three of them:");
		System.out.println(Person.all.get(0));
		System.out.println(Person.all.get(1));
		System.out.println(Person.all.get(2));
	}
	
	
	private static String getText() {
		return "Reyna;Rich;122;Constanța;8438;F;Porter,Duke,Kobe,Benny,Chester,Whiskey\r\n" + 
				"Dr. Demetrius;Douglas;62;Florence;6677;M;\r\n" + 
				"Sevyn;Proctor;16;Antwerp;0;F;Bubba\r\n" + 
				"Juniper;Parsons;120;Lisbon;0;F;Arlo,Cooper,Romeo,Theo\r\n" + 
				"Marcellus;Rosario;80;Seville;0;M;Odin,Bruce,Ozzy,Porter,Bear\r\n" + 
				"Ainhoa;Andrews;85;Barcelona;1131;F;Riley,Finn\r\n" + 
				"Lincoln;Walker;93;Frankfurt am Main;0;M;Rocky,Jackson,Buster,Peanut,Milo\r\n" + 
				"Caden;Waters;72;Timișoara;0;M;Jake,Luke,Otis,Jax\r\n" + 
				"Kehlani;Baker;129;Leipzig;7813;F;Koda\r\n" + 
				"Dylan;Riley;86;Leipzig;8441;M;Cash,Jack,Rambo,Winston\r\n" + 
				"Austin;Cameron;21;Budapest;9348;M;Tyson,Remi\r\n" + 
				"Marley;Sparks;74;Constanța;0;F;Moose,Ziggy,Joey\r\n" + 
				"Crew;Cabrera;64;Karlsruhe;0;M;Milo\r\n" + 
				"Noah;Rojas;75;Malmö;7054;F;Mac,Bowie,Bo,Oliver\r\n" + 
				"Rosalia;Michael;116;Galați;639;F;Odie,Chip,Gucci\r\n" + 
				"Ahmed;Bowen;118;Munich;0;M;\r\n" + 
				"Jeremy;Eaton;127;Cluj-Napoca;3122;M;Chester,Remy,Copper\r\n" + 
				"Israel;Cobb;76;Düsseldorf;9918;M;Bentley,Bandit,Archie,Charlie,Ace\r\n" + 
				"Dr. Promise;Lowe;100;Essen;0;F;Rusty,George,Otis,Maverick\r\n" + 
				"Noemi;Mendez;69;Rome;1415;F;Beau,Kobe,Gucci,Peanut\r\n" + 
				"Raelyn;Brandt;123;Galați;6367;F;\r\n" + 
				"Alden;Beil;98;Iași;0;M;Tucker,George,Luke,Romeo\r\n" + 
				"Alejandro;Marin;131;Alicante;5480;M;Bailey,Riley,Benny,Copper\r\n" + 
				"Blaine;Huerta;100;Copenhagen;4846;M;Thor,Lincoln\r\n" + 
				"Flora;Moses;15;The Hague;0;F;Bruce,Remy,Odin,Samson\r\n" + 
				"Jasiah;Collins;126;Zaragoza;727;M;Winston,Ziggy,Cooper,Peanut\r\n" + 
				"Kimora;Anthony;22;Bilbao;9341;F;Bruno,Whiskey,Arlo\r\n" + 
				"Reese;Rowe;54;Szczecin;1241;M;Simba,Tucker\r\n" + 
				"Estelle;Maynard;16;Łódź;0;F;Whiskey,Otis,Oreo,Tyson,Bear,Finn\r\n" + 
				"Dr. Phillip;Porter;63;Palermo;9939;M;Hank,Leo\r\n" + 
				"Dulce;Pope;56;Leipzig;0;F;Samson,Ollie\r\n" + 
				"Dr. Kaitlyn;Small;25;Plovdiv;3118;F;Remi,Hank\r\n" + 
				"Azariah;Rosales;102;Bydgoszcz;2251;F;Bruce,Charlie,Sam,Diesel\r\n" + 
				"Adonis;Lewis;128;Prague;5414;M;Scout,Boomer,Baxter,Buddy,Bruno\r\n" + 
				"Ermias;Cantrell;44;Zagreb;8902;M;Jackson,Walter,Luke,Marley,Thor,Murphy\r\n" + 
				"Emerald;Herman;20;Sofia;8200;F;Porter,Jax,Mac,Axel,Axel\r\n" + 
				"Dr. Lennon;Duran;22;Munich;4455;M;Bandit,Buster,Milo,Baxter,Rex\r\n" + 
				"Kathryn;Espinosa;86;Karlsruhe;4048;F;Kobe,Archie\r\n" + 
				"Murphy;Deleon;15;Málaga;1578;F;Bear,Oakley,Tyson,Charlie,Ryder,Gus\r\n" + 
				"Charli;Montoya;137;Prague;5875;F;Chip,Chester\r\n" + 
				"Kaliyah;Pitts;33;Amsterdam;4442;F;Cooper,Echo,Ryder\r\n" + 
				"Dr. Teresa;Muñoz;35;Gothenburg;6766;F;Fluffy,Jasper\r\n" + 
				"Leanna;Gilmore;119;Turin;8470;F;Zeus,Bentley,Hank,Rusty,Maverick,Ranger\r\n" + 
				"Ariella;Carrillo;138;Bucharest;9876;F;Tyson,Baxter\r\n" + 
				"Dr. Lylah;Walker;99;Helsinki;4514;F;Apollo,Tyson,Bentley,Otis\r\n" + 
				"Niklaus;Cross;106;Riga;9134;M;Oreo,Ryder,Maverick,Copper,Oakley,Hank\r\n" + 
				"Emir;Anderson;84;Palermo;939;M;\r\n" + 
				"Dr. Emmeline;Landry;96;Bari;982;F;Archie,Joey,Mac,Prince,Scout\r\n" + 
				"Sylvie;Golden;41;Hanover;8367;F;\r\n" + 
				"Ray;Roach;103;Tallinn;1269;M;Tucker,Kobe,Finn,Tyson\r\n" + 
				"Emilio;Weber;29;Malmö;298;M;Teddy,Toby,Benny,Maverick,Loki,Joey\r\n" + 
				"Tripp;Haynes;65;Dublin;1182;M;Gunner,Thor,Whiskey,Remy\r\n" + 
				"Clayton;Dodson;42;Gdańsk;9116;M;Jackson,Chester,Archie,Cooper,Joey,Atlas\r\n" + 
				"Dr. Phoebe;Nelson;26;Florence;2972;F;Moose,Marley,Buddy\r\n" + 
				"Elora;Sierra;40;Marseille;0;F;King,Finn\r\n" + 
				"Dr. Rio;Elliott;124;Palermo;0;M;Cash,Tyson\r\n" + 
				"Braylon;Garrett;74;Rīga;7289;M;Bandit,Maverick,Louie,Koda,Romeo,Ace\r\n" + 
				"Dr. Hailey;Maxwell;12;Cluj-Napoca;6456;F;Ollie,Wally,Lucky,Rocco,Zeus\r\n" + 
				"Karson;Heath;90;Karlsruhe;9346;M;Thor,Miles,Sam\r\n" + 
				"Waverly;Baker;88;Tallinn;0;F;Copper\r\n" + 
				"Emelia;Maxwell;101;The Hague;8261;F;Zeus\r\n" + 
				"Lana;Bailey;32;Dresden;8825;F;Chester,Otis,Ruger,Diesel,Ryder\r\n" + 
				"Etta;Shaw;26;Dresden;1764;F;\r\n" + 
				"Kiaan;Huerta;125;Łódź;8155;M;Leo\r\n" + 
				"Ronan;Drake;49;Thessaloniki;0;M;\r\n" + 
				"Quinton;Patel;40;Cluj-Napoca;1473;M;Rocky,Marley,Blue,Bubba\r\n" + 
				"Amias;Barnett;116;Lisbon;0;M;Kobe,Oakley,Sarge,Beau,Arlo\r\n" + 
				"Dr. Paloma;Perkins;92;Athens;0;F;Odie,Odie,Archie\r\n" + 
				"Dr. Damir;Bullock;96;Dublin;5250;M;Bubba,Cody\r\n" + 
				"Dean;Stuart;48;Budapest;0;M;Echo,Oakley,Apollo,Remy\r\n" + 
				"Wes;Howard;11;Timișoara;3992;M;Harry,Gus,Odie,Buddy,Remy\r\n" + 
				"Keegan;Kirk;97;Cologne;7940;M;Bo,Tucker,Joey,Milo,Winston,Buddy\r\n" + 
				"Aubree;Myers;20;Nice;6790;F;Remi,Joey,Teddy,Jax\r\n" + 
				"Victor;Kelly;13;Lublin;3436;M;Henry,Winston,Harley,Peanut,Loki,Bowie\r\n" + 
				"Pearl;Garrison;91;Paris;9906;F;Bailey,Cash,Odie\r\n" + 
				"Conor;Palacios;68;Hamburg;1587;M;Chip\r\n" + 
				"Astrid;Whitaker;46;Lyon;0;F;Bailey,Echo\r\n" + 
				"Fernanda;Moore;86;Hamburg;7417;F;Copper,Lincoln,Ollie,Peanut\r\n" + 
				"Jillian;Stephenson;96;Toulouse;0;F;Chip,Jack,Simba\r\n" + 
				"Alfred;Vargas;130;Constanța;8750;M;Copper,Blaze,Romeo,Romeo\r\n" + 
				"Olive;Aguilar;129;Genoa;0;F;Hank,Duke,Coco,Gizmo,Rusty,Henry\r\n" + 
				"Alina;Chambers;65;Budapest;0;F;Toby,Porter\r\n" + 
				"Nathanael;Dorsey;114;Szczecin;3566;M;Leo,Dexter,Echo\r\n" + 
				"Matilda;Maynard;10;Lublin;2759;F;Thor\r\n" + 
				"Dr. Gunner;Mendoza;113;Vilnius;3301;M;\r\n" + 
				"Eden;Cunningham;13;Cologne;653;F;Bailey,Benny,Watson\r\n" + 
				"Dr. Margo;Ingram;62;Utrecht;9158;F;Kobe\r\n" + 
				"Ariel;Meyer;23;Hanover;4224;M;Oakley,Archie,Jackson\r\n" + 
				"Koa;Flores;97;Essen;9876;M;Buddy\r\n" + 
				"Bryce;Dudley;77;Bielefeld;5999;M;Axel,Henry,Gunner,Milo\r\n" + 
				"Rhett;Person;95;Copenhagen;5697;M;\r\n" + 
				"Skye;Hogan;70;Budapest;3960;F;Louie,King,Lincoln,Joey,King,Buddy\r\n" + 
				"Colson;Bullock;10;The Hague;5577;M;Hank,Benji,Milo,Remi\r\n" + 
				"Abner;Odom;82;Vilnius;4839;M;Gunner\r\n" + 
				"Paloma;Henderson;28;Mannheim;5043;F;Jasper,Watson,Ollie,Archie\r\n" + 
				"Oakleigh;Wang;117;Bielefeld;752;F;Boomer,Lincoln,Harley,Harley,Murphy\r\n" + 
				"Megan;Wade;61;Copenhagen;7276;F;Baxter,Duke,Chase,George\r\n" + 
				"Elijah;Faulkner;61;Palermo;9055;M;Duke,Thor,Dexter,Copper,Oliver,Titan\r\n" + 
				"Dr. David;Bridges;139;Aarhus;3791;M;Benji\r\n" + 
				"Averi;Gould;104;Duisburg;2444;F;Dexter\r\n" + 
				"Mohammad;Terry;126;Bremen;8700;M;Oscar\r\n" + 
				"Enrique;Blackburn;63;Poznań;0;M;\r\n" + 
				"Dr. Sierra;Acevedo;133;Marseille;0;F;Jackson,Bruno,Oliver\r\n" + 
				"Ryan;Floyd;77;Bochum;3398;F;\r\n" + 
				"Angelica;Saunders;27;Budapest;9339;F;\r\n" + 
				"Dennis;Salinas;105;Helsinki;6987;M;Diesel,Remy,Finn,Odie,Max\r\n" + 
				"Allen;Singleton;92;Palermo;0;M;Louie,Zeke,Tucker,Jack,Rambo,Oreo\r\n" + 
				"Conor;Huffman;30;Varna;0;M;Ollie,Remy,Jackson,Walter,Bruno\r\n" + 
				"Lane;Hardy;61;Naples;1245;M;Atlas\r\n" + 
				"Edison;Mcfarland;80;Leipzig;0;M;Oreo,Cooper,Blaze,Rambo,Baxter,Toby\r\n" + 
				"Macie;Carlson;94;Turin;0;F;Gucci,Rudy,Simba,Tucker,Blue\r\n" + 
				"Joey;Olson;94;Aarhus;7402;M;Harley,Bo,Loki,Odin,Chase\r\n" + 
				"Anaya;Farmer;121;Alicante;3194;F;Otis,Prince,Prince\r\n" + 
				"Dr. Adrian;Robertson;34;Catania;0;M;Louie,Samson,Cash,Buster\r\n" + 
				"Briggs;Wall;53;Marseille;0;M;Charlie,Lincoln,Cash\r\n" + 
				"Shiloh;Barron;68;Bratislava;6965;F;Bear,Luke,Kylo\r\n" + 
				"Cecelia;Chang;75;Marseille;7697;F;Watson,Watson,Benny,Rudy,Shadow\r\n" + 
				"Calvin;Mckay;117;Naples;8607;M;Bubba,Apollo,Bubba\r\n" + 
				"Dr. Orion;Robles;75;Barcelona;979;M;Harry,Bubba\r\n" + 
				"Briar;Mayo;112;The Hague;6729;M;Shadow,Porter\r\n" + 
				"Ila;Burch;89;Milan;0;F;Toby,Murphy,Diesel,Romeo\r\n" + 
				"Kallie;Baxter;77;Gdańsk;4472;F;Theo\r\n" + 
				"Natalie;Logan;45;Paris;0;F;Prince,Harry\r\n" + 
				"Shiloh;Morse;135;Mannheim;0;F;Peanut\r\n" + 
				"Zariyah;Barajas;29;Palermo;0;F;Odie,Maverick,Blaze,Oliver\r\n" + 
				"Addisyn;Cline;109;Łódź;6816;F;Bailey,Oscar,Buddy\r\n" + 
				"Amelie;Joseph;62;Brno;1381;F;Bentley,Harley,Porter,Gizmo,Walter\r\n" + 
				"Kamila;Harrington;60;Bucharest;6053;F;Bowie,Koda,Diesel,Rudy,Benji,Wally\r\n" + 
				"Analia;Holt;120;Seville;4504;F;Porter,Lincoln,Samson\r\n" + 
				"Derek;Joseph;130;Lyon;1720;M;Duke,Blaze,Zeus,Rex,Lincoln\r\n" + 
				"Mark;Wilkins;81;Karlsruhe;0;M;Mac,Blaze,Winston,Jake,Rocky\r\n" + 
				"Dr. Livia;Campos;30;Lisbon;3490;F;Rex\r\n" + 
				"Jax;Casey;128;Poznań;974;M;Sam,Titan,Tyson\r\n" + 
				"Johnny;Zimmerman;110;Sofia;8449;M;Simba,Ryder\r\n" + 
				"Lacey;Lin;34;Malmö;0;F;Ranger,Chip,Ruger\r\n" + 
				"Riley;O’neal;15;Düsseldorf;0;F;Odin,Rusty,Moose,Baxter,Jake\r\n" + 
				"Riley;Navarro;108;Las Palmas;7821;F;Rocky,Lincoln\r\n" + 
				"Callen;Baker;121;Constanța;201;M;Luke,Benny,Charlie\r\n" + 
				"Nikolai;Costa;89;Dortmund;1190;M;Koda,Sarge,Buster,Oakley,Henry,Tyson\r\n" + 
				"Asher;Maynard;105;Rīga;635;M;Romeo\r\n" + 
				"Foster;Hudson;15;Riga;4345;M;Atlas\r\n" + 
				"Dr. Larry;Todd;55;Helsinki;1660;M;Coco,Buster,Rudy,Harley,Boomer\r\n" + 
				"Royce;Clements;57;Milan;0;M;\r\n" + 
				"Irene;Berg;132;Bielefeld;9536;F;Porter,Chip,Ollie,Max\r\n" + 
				"Dr. Vincenzo;Chavez;57;Catania;3623;M;Blaze,Rocket,Jack,Rocky\r\n" + 
				"Kameron;Espinosa;35;Poznań;1385;M;\r\n" + 
				"Dr. Ali;Wilkinson;71;Turin;1829;M;Thor,Bruno,Gus,Toby\r\n" + 
				"Cristian;Howe;30;Budapest;8214;M;Benji,Beau,Riley,Mac\r\n" + 
				"Moises;Nicholson;61;Sintra;9024;M;\r\n" + 
				"Eric;Torres;115;Bilbao;813;M;Jake,Oreo,Simba,Cooper,Jackson\r\n" + 
				"Ayden;Padilla;46;Gothenburg;4141;M;\r\n" + 
				"Keilani;Bernard;39;Tallinn;8642;F;Coco,Benny,Coco\r\n" + 
				"Dr. Lee;Rios;114;Wrocław;0;M;Prince,Rudy,Bear\r\n" + 
				"Imani;Solis;43;Bratislava;796;F;Tyson,Bandit,Tucker\r\n" + 
				"Blaise;Gould;30;Nantes;976;M;Prince,Koda,Murphy,Rudy,Duke\r\n" + 
				"Valerie;Copeland;80;Iași;0;F;Luke,Chase,Duke\r\n" + 
				"Alexander;Hanna;57;Prague;4257;M;Oscar\r\n" + 
				"Ruby;Davila;98;Bielefeld;0;F;Scout,Jax,Harry,Odin\r\n" + 
				"Dr. Lauryn;Vargas;84;Gothenburg;9459;F;Chip\r\n" + 
				"Leilany;Myers;103;Las Palmas;0;F;Koda,Max,Moose,Porter,Bentley\r\n" + 
				"Kiaan;Herman;115;Antwerp;4006;M;Simba,Teddy,Copper,Charlie,Moose,Fluffy\r\n" + 
				"Dominic;Sampson;113;Lisbon;2145;M;Rambo,Ozzy\r\n" + 
				"Marisol;Valdez;109;Palma de Mallorca;3087;F;Ozzy,Arlo,Ace,Bubba,Jack\r\n" + 
				"Trevor;Krueger;57;Cluj-Napoca;580;M;Jake,Harley\r\n" + 
				"Ila;Montoya;88;Varna;7113;F;Cody,Ollie,Ollie,Cash,Zeke\r\n" + 
				"Juliet;Holloway;54;Budapest;4983;F;Maverick,Apollo,Bentley,Odin,Hank,Gizmo\r\n" + 
				"Hadley;Carrillo;55;Karlsruhe;4411;F;\r\n" + 
				"Laila;Bowen;49;Essen;0;F;Sarge,Walter,Marley,Finn,Otis,Levi\r\n" + 
				"Dr. Collin;Nguyen;108;Wuppertal;9618;M;\r\n" + 
				"Frederick;Meza;64;Rome;9466;M;\r\n" + 
				"Jonathan;Poole;53;Thessaloniki;5517;M;\r\n" + 
				"Corinne;Blackburn;63;Mannheim;0;F;Dexter\r\n" + 
				"Malik;Morton;56;Vila Nova de Gaia;9947;M;Sam,Jake,Sarge,Watson,Bandit,Walter\r\n" + 
				"Chana;Kaur;124;Nice;2604;F;Remi,Oakley,Marley,Koda,Chester\r\n" + 
				"Lorelai;Hail;85;Turin;4205;F;Gus,Gunner,Gucci,Toby,Cash\r\n" + 
				"Kensley;Johnston;131;Nuremberg;5671;F;\r\n" + 
				"Blake;Delarosa;59;Seville;0;F;Cody,Rex,Teddy,Scout\r\n" + 
				"Josephine;Haley;102;Utrecht;2783;F;Ace,Riley,Cash\r\n" + 
				"Kyree;Ramos;60;Palermo;5833;M;Remi\r\n" + 
				"Alexis;Reid;113;Córdoba;350;F;\r\n" + 
				"Giovanni;Ashley;131;Lisbon;0;M;Bear,Shadow\r\n" + 
				"Juniper;Howell;114;Wrocław;6505;F;Gucci,Apollo,Luke\r\n" + 
				"Dr. Averie;Mcdonald;113;Milan;431;F;Max,Bo,Koda\r\n" + 
				"Clara;Mccarty;53;Bonn;0;F;\r\n" + 
				"Dr. Melvin;Schultz;70;Düsseldorf;2887;M;Benny,Rocky,Zeus,Wally\r\n" + 
				"Kamden;Lynn;22;Vilnius;8858;M;\r\n" + 
				"Kassidy;Weaver;76;Bonn;8918;F;Tucker,Toby,Henry,Archie,Levi,Duke\r\n" + 
				"Aziel;Yu;73;Szczecin;7405;M;Rocket\r\n" + 
				"Solomon;Bautista;56;Naples;3220;M;Baxter,Jack,Blue,Wally,Sam\r\n" + 
				"Israel;Townsend;122;Plovdiv;1235;M;Tank\r\n" + 
				"Oakleigh;Xiong;26;Sigulda;0;F;Odin\r\n" + 
				"Daxton;Baxter;114;Bonn;2380;M;Axel,Rudy,Mac,Echo\r\n" + 
				"Dr. Dilan;Dean;92;Utrecht;0;M;Rusty,King,Luke,Kylo,Bo\r\n" + 
				"Zachariah;Stephenson;117;Hanover;2455;M;\r\n" + 
				"Andi;Williams;42;Bochum;3978;F;Lucky\r\n" + 
				"Dr. Lukas;Boyle;61;Milan;0;M;Cash,Blue,Fluffy,Murphy\r\n" + 
				"Jude;Owen;33;Poznań;3621;M;Romeo,Gus,Koda\r\n" + 
				"Cayson;Mitchell;86;Naples;0;M;Apollo,Bubba,Rudy,Porter,Beau\r\n" + 
				"Theodora;Mueller;26;Palermo;3596;F;Gus\r\n" + 
				"Janiyah;Gross;70;Berlin;7020;F;\r\n" + 
				"Emmett;Horn;110;Palermo;6614;M;Luke,Winston,Ryder\r\n" + 
				"Joshua;Harper;94;Madrid;1016;M;Scout,Rex\r\n" + 
				"Dr. Dakota;Esquivel;25;Rome;4512;M;\r\n" + 
				"Isabelle;Chen;115;Bratislava;470;F;\r\n" + 
				"Dr. Hudson;Wilkins;15;Münster;6731;M;Bentley,Kylo\r\n" + 
				"Paula;Franco;84;Zaragoza;7154;F;Lucky,Thor,Samson,Maverick\r\n" + 
				"Gwen;Mcdaniel;26;Rīga;1018;F;\r\n" + 
				"Dr. Jay;Liu;47;Bremen;0;M;Ziggy,Tyson\r\n" + 
				"Dr. Salem;Andersen;21;Madrid;2439;M;Riley,Apollo,Prince,Oreo\r\n" + 
				"Cory;Yoder;12;Gothenburg;0;M;Simba,Gus\r\n" + 
				"Madden;Hardy;26;Bochum;9504;M;Toby,Dozer,Theo,King,Rocky,Koda\r\n" + 
				"Kaden;Collins;55;Alicante;5562;M;Jasper,Diesel,Hank,Rex\r\n" + 
				"Logan;Valdez;20;Valmiera;8104;F;\r\n" + 
				"Damari;Mills;138;Malmö;2757;M;Max,Tank\r\n" + 
				"Jadiel;Parra;63;Duisburg;1840;M;Bailey,Bubba\r\n" + 
				"Amaris;Bean;105;Warsaw;2668;F;Remy,Kobe\r\n" + 
				"Alexandria;Ware;59;Galați;1543;F;Odin,Oliver\r\n" + 
				"Dr. Layne;Donaldson;73;Marseille;2355;F;Dexter,Murphy,Louie,Kylo,Luke,Thor\r\n" + 
				"Liliana;Garrison;47;Genoa;8448;F;Rusty,Dozer\r\n" + 
				"Fabian;Robbins;88;Vienna;6502;M;Jax,Murphy,Dexter\r\n" + 
				"Ellie;Buchanan;20;Seville;0;F;Ranger,Archie\r\n" + 
				"Zayden;Patel;33;Bonn;3141;M;Rambo,Atlas,Ruger,Ace\r\n" + 
				"Cooper;Nicholson;31;Antwerp;6787;M;Sam,Buddy,Ace,Jack,Bowie,Rambo\r\n" + 
				"Dr. Arjun;Mitchell;55;Las Palmas;3390;M;Rocky,Sarge,Charlie\r\n" + 
				"Clyde;Strickland;52;Florence;6263;M;Jackson,Koda,Gus,Bandit\r\n" + 
				"Lena;Fitzpatrick;107;Naples;7883;F;Rocky,Buster,Rocket,Sarge,Ozzy,Hank\r\n" + 
				"Bentlee;Parker;104;Brno;0;M;Odie,Kobe\r\n" + 
				"Deborah;Le;45;The Hague;2017;F;Theo,Diesel\r\n" + 
				"Dane;Glenn;67;Münster;9932;M;Gunner,Rocco,Otis\r\n" + 
				"Deacon;Barrett;115;Stuttgart;5782;M;Diesel,Rusty,Maverick,Cooper,Jasper\r\n" + 
				"Cohen;Baxter;113;Brno;5868;M;Scout\r\n" + 
				"Kashton;Cortes;116;Marseille;0;M;Chase,Archie,Teddy,Mac,Odie,Joey\r\n" + 
				"Dr. Kai;Peralta;121;Palermo;0;F;Ryder,Axel,Tyson\r\n" + 
				"Taylor;Mejia;125;Nice;6134;F;Archie,Odie,Dozer\r\n" + 
				"Hadleigh;Juarez;16;Düsseldorf;0;F;Charlie,Odie,Moose,Odin,Kylo,Cooper\r\n" + 
				"Karsyn;Long;73;Szczecin;8799;M;Milo,Rex,Rambo,Cody\r\n" + 
				"Novalee;Stokes;127;Madrid;2304;F;Jackson,Jax\r\n" + 
				"Jamie;Klein;27;Duisburg;8552;F;Dozer\r\n" + 
				"Baker;Gaines;98;Turin;3738;M;Ziggy,Benji,Romeo,Boomer,Rusty,Oakley\r\n" + 
				"Wynter;Branch;72;Timișoara;7891;F;King,Ruger,Louie,Jack,Bruce\r\n" + 
				"Justice;Dougherty;116;Bologna;0;M;Diesel,Gucci,Titan,Bailey\r\n" + 
				"Issac;Watson;100;Kraków;6064;M;Koda,Jax,Miles,Walter,Cooper,Diesel\r\n" + 
				"Davian;Kirby;99;Dublin;2173;M;Miles,Winston,Ollie,Toby,Buddy,Watson\r\n" + 
				"Daphne;Mosley;47;Valencia;9039;F;\r\n" + 
				"Eliseo;Barr;29;Sofia;3565;M;Bo,Loki,Romeo\r\n" + 
				"Nathan;Park;74;Essen;0;M;Charlie,Ziggy,Arlo,Titan,Copper,Cody\r\n" + 
				"Helena;Scott;20;Hanover;2582;F;Ranger,Archie,Murphy,Rex,Oakley\r\n" + 
				"Ty;Avery;74;Szczecin;5738;M;Cooper\r\n" + 
				"Easton;Houston;48;Sintra;2032;M;\r\n" + 
				"Genesis;Vega;101;The Hague;1995;M;Jasper,Gus,Levi\r\n" + 
				"Rio;Yoder;124;Karlsruhe;1174;M;Coco,Zeus,Bailey,Thor,Porter\r\n" + 
				"Dr. Kaylani;Mack;116;Duisburg;9355;F;Samson\r\n" + 
				"Ariel;Nicholson;75;Córdoba;3320;F;Bear,Peanut\r\n" + 
				"Damien;Ballard;39;Seville;2320;M;\r\n" + 
				"Amira;Stone;115;Bielefeld;0;F;\r\n" + 
				"Angel;Rodriguez;49;Stuttgart;1366;M;Loki,Bruce,Jackson,Prince\r\n" + 
				"Avayah;Yates;58;Bilbao;0;F;Jasper,Thor,Baxter\r\n" + 
				"Desmond;Green;39;Iași;9896;M;Rusty,Dozer,Rocket,Riley,Walter,Rocco\r\n" + 
				"Dr. Eithan;Waters;126;Barcelona;4253;M;Diesel,Harley,Atlas,Blue,Louie,Gunner\r\n" + 
				"Meilani;Bailey;120;Bydgoszcz;9338;F;Bubba,Harry,Buddy\r\n" + 
				"Adele;Hutchinson;61;Constanța;0;F;Boomer\r\n" + 
				"Whitney;Malone;22;Antwerp;5517;F;\r\n" + 
				"Dominik;Zhang;54;Szczecin;965;M;Coco,Zeke,Bowie,Scout,Chester,Sam\r\n" + 
				"Ellie;Solomon;118;Lublin;4961;F;Toby\r\n" + 
				"Uriah;Lu;75;Cologne;0;M;Ryder,Fluffy\r\n" + 
				"Nixon;Sierra;90;Utrecht;0;M;\r\n" + 
				"Selena;O’neal;100;Palermo;6671;F;Max,Louie\r\n" + 
				"Ben;Mcdaniel;13;Rotterdam;928;M;Beau,Titan,Teddy\r\n" + 
				"Leslie;Marshall;106;Rīga;0;F;Miles,Jax,Bear,Copper\r\n" + 
				"Sarah;Shelton;74;Bucharest;2154;F;Apollo,Romeo,Charlie,Chase\r\n" + 
				"Sam;Steele;93;Nantes;250;M;Bandit,Walter\r\n" + 
				"Marleigh;Barry;128;Antwerp;0;F;\r\n" + 
				"Briar;Bernal;47;Las Palmas;0;F;\r\n" + 
				"Dr. Cleo;Baldwin;38;Bucharest;0;F;Rocket,Jax,Jack,Archie\r\n" + 
				"Dr. Rey;Barnes;75;Munich;0;M;Louie\r\n" + 
				"Junior;Hancock;94;Mannheim;2161;M;Ollie,Rambo,Romeo\r\n" + 
				"Emery;O’connell;29;Toulouse;5685;F;Gunner,Bailey\r\n" + 
				"Amayah;Lim;39;Genoa;1122;F;Murphy,Thor,Louie,Tank\r\n" + 
				"Jovanni;Martinez;29;Milan;1947;M;Leo,Buddy,Bo\r\n" + 
				"Marcel;Mann;67;Thessaloniki;4705;M;Koda,Sarge,King\r\n" + 
				"Jayla;Davenport;75;Utrecht;0;F;\r\n" + 
				"Erin;Joseph;87;Plovdiv;2589;F;\r\n" + 
				"Heaven;Garner;124;Prague;0;F;Bandit,Bruno,Bailey,Ruger,Walter,Diesel\r\n" + 
				"Graham;Garrison;101;Brno;4105;M;Remy\r\n" + 
				"Titus;Prince;88;Dortmund;2045;M;Tucker,Copper,Ozzy,Remy,Ace,Riley\r\n" + 
				"Edward;English;130;Galați;1853;M;Coco,Cooper,Jax,Ruger,Riley\r\n" + 
				"Ensley;Aguilar;83;Bratislava;0;F;Duke,Scout,Ace,Sarge\r\n" + 
				"Sunny;Rollins;67;Galați;1769;F;Rocco,Marley,Harry\r\n" + 
				"Dr. Oscar;Knapp;35;Mannheim;7742;M;Chester,Louie,Murphy\r\n" + 
				"Dr. Everett;May;121;Duisburg;4543;M;Odin,Cody\r\n" + 
				"Amaris;Pacheco;127;Valmiera;2796;F;Chip,Teddy,Theo\r\n" + 
				"Brady;Hess;139;Bremen;6660;M;Cody,Shadow,Ziggy,Murphy,Buster,Oscar\r\n" + 
				"Melany;Butler;21;Sintra;209;F;Dexter,Blue,Gunner\r\n" + 
				"Dr. Alfred;Clements;126;Riga;0;M;\r\n" + 
				"Jason;Velazquez;28;Bremen;0;M;Chip,Rocky\r\n" + 
				"Aria;Rich;97;Dortmund;6274;F;Bo\r\n" + 
				"Eden;Carey;15;Munich;3671;M;Boomer,Rex,Bear\r\n" + 
				"Morgan;Donovan;66;Bilbao;4302;F;Shadow,Tank,Arlo,Baxter,Fluffy,Rex\r\n" + 
				"Jadiel;Reynolds;93;Bologna;3655;M;Samson,Dexter,Cooper,Apollo,King,Tank\r\n" + 
				"Blaire;Bush;10;Münster;9944;F;Romeo,Odin,Jax\r\n" + 
				"Kylian;Hood;118;Tallinn;8021;M;Harry,Harley,Jake,Fluffy,Romeo\r\n" + 
				"Ellianna;Truong;68;Genoa;0;F;Buddy,Duke,Henry\r\n" + 
				"Mac;Patrick;116;Catania;8008;M;Duke,Remy,Sam,Cooper,Jake,Gizmo\r\n" + 
				"Donald;Davidson;32;Warsaw;9142;M;Ollie,Toby,Rudy,Blaze,Zeke,Joey\r\n" + 
				"Saint;Cummings;87;Thessaloniki;7461;M;\r\n" + 
				"Dr. Leonardo;Jensen;60;Mannheim;5540;M;Beau,Winston,Atlas\r\n" + 
				"Wade;Ball;40;Wuppertal;6484;M;\r\n" + 
				"Yamileth;Morgan;16;Gothenburg;0;F;Simba,Romeo,Remi,Louie,Henry\r\n" + 
				"Watson;Gill;124;Lublin;0;M;\r\n" + 
				"Whitley;Cole;134;Vienna;5084;F;Louie\r\n" + 
				"Drew;Higgins;130;Dublin;0;F;\r\n" + 
				"Adonis;Morrison;57;Bonn;3921;M;Toby,Echo,Chester,Ziggy,Dexter,Harry\r\n" + 
				"Aarya;Wood;104;Tallinn;9889;F;Fluffy\r\n" + 
				"Jessie;Cline;70;Valmiera;5333;F;Oreo,Baxter,Winston\r\n" + 
				"Carmen;Camacho;90;Alicante;0;F;Porter\r\n" + 
				"Malayah;Garrett;61;Frankfurt am Main;1089;F;Rocco\r\n" + 
				"Coraline;Bond;51;Nuremberg;5185;F;Rudy\r\n" + 
				"Aurelia;Christian;31;Thessaloniki;2724;F;Buddy,Toby,Winston\r\n" + 
				"Briana;Gallegos;47;Wrocław;5963;F;Titan,Rocket\r\n" + 
				"Dr. Marlee;Mathews;118;Antwerp;8088;F;Benji,Oakley,Bruno,Remi,Jax,Apollo\r\n" + 
				"Marie;Avalos;117;Lyon;5813;F;Ace,Jackson,Kobe,Jasper\r\n" + 
				"Yara;Mccann;12;Las Palmas;9467;F;Miles,Fluffy\r\n" + 
				"Egypt;Tapia;62;Palma de Mallorca;0;F;Zeke,Oliver,Ruger,Ace,Dozer,Wally\r\n" + 
				"Cannon;Dickson;68;Münster;0;M;Apollo,Remy\r\n" + 
				"Tobias;Robbins;92;Toulouse;2217;M;Cody,Rambo,Peanut,Bo,Gunner,Kylo\r\n" + 
				"Allen;Stout;27;Lisbon;9694;M;\r\n" + 
				"Meredith;Strong;111;Brno;8468;F;Copper,Blaze,Finn,Kobe\r\n" + 
				"Kye;Brewer;126;Dortmund;9480;M;\r\n" + 
				"Wes;Curry;96;Berlin;9225;M;Archie,Whiskey,Rocco,Hank\r\n" + 
				"Jamie;Stevens;69;Antwerp;0;M;Lincoln\r\n" + 
				"Brecken;Underwood;114;Helsinki;2052;M;Bowie\r\n" + 
				"Aiden;Hodge;51;Seville;9588;M;Harry,Porter\r\n" + 
				"Duncan;Brandt;76;Bremen;0;M;\r\n" + 
				"Dr. Jaxon;Stewart;70;Wrocław;5283;M;Gizmo\r\n" + 
				"Dr. Maverick;Price;76;Valencia;0;M;Fluffy,Gus,Benji\r\n" + 
				"Maryam;Ferguson;69;Florence;8772;F;Loki\r\n" + 
				"Jade;Bowen;47;Sintra;6663;F;Romeo,Ryder,Remi,Murphy,Oreo,Chase\r\n" + 
				"Scout;Torres;84;Bari;9296;F;\r\n" + 
				"Garrett;Flowers;72;Poznań;0;M;Murphy,Charlie,Bandit,Ziggy,Chester\r\n" + 
				"Brody;Hunt;85;Nantes;0;M;Chip,Arlo,Jack,Louie,Teddy\r\n" + 
				"Hadlee;Brewer;28;Gothenburg;6417;F;Jackson,George\r\n" + 
				"Winston;Mckay;127;Barcelona;0;M;Bruce\r\n" + 
				"Madden;Reyna;77;Karlsruhe;0;M;Chase,Archie\r\n" + 
				"Victor;Owens;99;Hamburg;0;M;Odie,Rocky,Ruger,Rambo,Rocket\r\n" + 
				"Valery;Cooper;42;Galați;8079;F;Theo,Miles,Marley\r\n" + 
				"Sullivan;Miranda;41;Tallinn;9088;M;Bo,Teddy\r\n" + 
				"Lionel;Dean;102;Malmö;0;M;\r\n" + 
				"Angie;Thomas;94;Bremen;9017;F;Shadow,Sarge,Chase,Miles,Lincoln\r\n" + 
				"Brinley;Vo;117;Bucharest;3238;F;Arlo,Theo,Zeke\r\n" + 
				"Killian;Buckley;98;Timișoara;6427;M;Zeus,Joey,Duke\r\n" + 
				"Jesus;Noble;21;Rome;6714;M;Oreo,Thor,Kobe,Chester\r\n" + 
				"Kelvin;Mitchell;44;Leipzig;9104;M;Bentley,Jax,Kobe,Blue,Shadow\r\n" + 
				"Dr. Brody;Patel;97;Nice;565;M;Beau,Copper,Blue,Rocky,Oakley,Loki\r\n" + 
				"Caden;Beard;118;Tallinn;5077;M;Joey,Odin,Sarge,Samson,Oliver\r\n" + 
				"Dr. Wilson;Sawyer;23;Turin;0;M;Ruger,Loki,Thor\r\n" + 
				"Dr. Leona;Bryant;95;Thessaloniki;0;F;\r\n" + 
				"Lauryn;Ingram;45;Duisburg;0;F;Leo,Lincoln,Boomer\r\n" + 
				"Tatum;Skinner;43;Copenhagen;5641;F;Thor\r\n" + 
				"Hassan;Zavala;33;Bremen;8504;M;Rambo,Bubba\r\n" + 
				"Hazel;Duran;31;The Hague;3467;F;Chase,Boomer,Finn,Buddy,Odin\r\n" + 
				"Esteban;Orozco;76;Vienna;5686;M;Miles,Sarge\r\n" + 
				"Dr. Walter;Olsen;23;Warsaw;5429;M;Toby,Shadow,Fluffy\r\n" + 
				"Rebekah;Mueller;47;Alicante;3193;F;Titan\r\n" + 
				"Jamir;Carrillo;124;Valencia;6406;M;Levi,Arlo,Ziggy,Diesel,Echo,Rocky\r\n" + 
				"Karter;Nelson;97;Dresden;6451;F;Watson\r\n" + 
				"Addisyn;Beck;12;Constanța;3337;F;Lincoln\r\n" + 
				"Dallas;Hail;22;Gothenburg;2131;M;\r\n" + 
				"Rachel;Velasquez;44;Toulouse;7526;F;Odin,Atlas,George\r\n" + 
				"Liana;Hoffman;50;Bonn;9250;F;Marley\r\n" + 
				"Cali;Page;85;Helsinki;866;F;Milo,Buddy,Lucky,Blaze\r\n" + 
				"Ellianna;Gordon;138;Gothenburg;5081;F;Remi,Bailey,Moose,Samson\r\n" + 
				"Dr. Meadow;Barnett;55;Sigulda;3381;F;Apollo,Simba,Ryder,Tank,Bo\r\n" + 
				"Lilian;Chambers;51;Genoa;1585;F;Luke,Winston,Bandit,Tucker,Teddy\r\n" + 
				"Graysen;Barr;89;Bonn;360;M;Blue,Milo,Moose\r\n" + 
				"Maren;Vega;110;Cluj-Napoca;4997;F;Loki,Axel,Ryder,Ozzy,Buster\r\n" + 
				"Brian;Cruz;123;Zaragoza;8049;M;Fluffy\r\n" + 
				"Ashley;Shannon;34;Bilbao;0;F;Finn,Beau,Titan,Joey\r\n" + 
				"Remy;Mckee;135;Naples;9969;F;Blaze\r\n" + 
				"Linda;Riley;57;Amsterdam;1861;F;Mac,Bubba,Romeo\r\n" + 
				"Ariel;Li;96;Münster;0;F;Dexter,Dozer,Axel\r\n" + 
				"Edith;Hurley;127;Łódź;0;F;Jack,Watson,Axel,Rocky,Ranger,Toby\r\n" + 
				"Aiden;Colón;50;Dublin;0;M;Wally,Dozer,Apollo,Theo\r\n" + 
				"Bodie;Roy;116;Copenhagen;0;M;\r\n" + 
				"Jonathan;O’neal;71;Rīga;0;M;Gunner,Benny,Winston,Ziggy,Sarge\r\n" + 
				"Valentina;Lee;83;Kraków;0;F;George,Ace\r\n" + 
				"Joe;Ross;107;Nice;3505;M;Tyson,Benji,Bowie,Diesel,Zeus,Bo\r\n" + 
				"Brooke;Huber;46;Naples;0;F;Ace,Gus\r\n" + 
				"Zahir;Herring;49;Münster;0;M;Buddy,Dexter\r\n" + 
				"Adriana;Buckley;117;Frankfurt am Main;2503;F;Baxter,Bo,Harry,Titan,Oscar,Miles\r\n" + 
				"Dr. Azrael;Vance;65;Vilnius;0;M;Boomer,Bailey\r\n" + 
				"Annalise;Alvarez;59;Lyon;0;F;Marley,Ziggy,Scout,Remy,Moose,Lincoln\r\n" + 
				"Jamir;Parks;95;Vienna;7937;M;Rocket,Titan,Coco,Miles,Buddy,Bo\r\n" + 
				"Milo;Reyes;102;Wuppertal;3919;M;Duke,Ollie,Rocco,Oscar,Chester,Simba\r\n" + 
				"Oaklynn;Chan;66;Sofia;0;F;Sarge,Echo,Watson,Moose,Bailey\r\n" + 
				"Blake;Berry;44;Madrid;8360;F;Zeke,Max,Teddy,Maverick\r\n" + 
				"Kylen;Hanson;22;Florence;6607;M;\r\n" + 
				"Galilea;Parker;48;Bari;5551;F;Jackson,Oreo,Murphy\r\n" + 
				"Zoey;Erickson;94;Dortmund;8141;F;King,Zeke,George\r\n" + 
				"Santino;Costa;33;Rīga;8000;M;Zeus,Charlie,Riley,Maverick,Ryder,Jake\r\n" + 
				"Judah;Hurst;132;Malmö;4083;M;Rex,Lucky,Lucky,Scout,Copper\r\n" + 
				"Dr. Trenton;Hendricks;53;Turin;0;M;\r\n" + 
				"Lucas;Mcclain;26;Rome;1872;M;Copper,Chip,Chester,Cody,Oscar,Toby\r\n" + 
				"Kameron;Strong;77;Cluj-Napoca;9001;M;Bowie,Rocky,Ryder,Buddy\r\n" + 
				"Luciano;Bruce;62;Nuremberg;0;M;Odie\r\n" + 
				"Brecken;Campbell;93;Münster;0;M;Harry,Watson,Rex,Miles\r\n" + 
				"Dr. Celine;Mahoney;62;Palma de Mallorca;0;F;Ziggy\r\n" + 
				"Kyrie;Diaz;102;Bratislava;9479;M;Ace,Samson,Remi,Zeus,Rudy,Bo\r\n" + 
				"Brody;Booker;43;Münster;1871;M;Moose,Fluffy,Duke,Sarge,Lincoln\r\n" + 
				"Dr. Carson;Jefferson;40;Las Palmas;0;M;\r\n" + 
				"Samson;Lugo;102;Prague;0;M;Charlie,Gus\r\n" + 
				"Rowen;Blake;50;Plovdiv;0;M;Harley\r\n" + 
				"Maisie;Gaines;30;Duisburg;0;F;Henry,Gucci,Gucci,Dexter\r\n" + 
				"Kashton;Piñeda;65;Duisburg;6451;M;Walter,Ranger,Watson,Atlas,Scout,Atlas\r\n" + 
				"Laura;Hanson;24;Thessaloniki;111;F;\r\n" + 
				"Nadia;Wilson;88;Nuremberg;1099;F;Oreo,Sarge,Coco,Gucci\r\n" + 
				"Elianna;Sellers;103;Lyon;1204;F;Arlo,Chester,Ryder,Shadow,Hank\r\n" + 
				"Dakari;Bennett;10;Lyon;6904;M;Rex\r\n" + 
				"Zakai;York;122;Sintra;7337;M;Baxter\r\n" + 
				"Gary;Taylor;57;Bratislava;0;M;Bear,Shadow,Axel,Ace,Dozer\r\n" + 
				"Justice;Archer;85;Naples;7059;F;Oscar,Jack,Dexter,Baxter\r\n" + 
				"Ibrahim;Coffey;102;Madrid;3463;M;Maverick,Scout,Walter\r\n" + 
				"Cedric;Wiley;123;Bydgoszcz;9662;M;Wally,Walter,Boomer,Oliver,Lincoln,Bandit\r\n" + 
				"Casey;Cisneros;58;Berlin;0;M;Thor,Benji,Jax,Kylo,Archie,Milo\r\n" + 
				"Ariella;Cochran;86;Poznań;1152;F;Riley,Koda,George,Diesel\r\n" + 
				"Raymond;Yang;136;Naples;7793;M;Kobe,Wally,Gizmo,Jake,Jake\r\n" + 
				"Averi;Robertson;40;Gdańsk;0;F;Joey,Murphy,Ziggy,Max,Peanut,Beau\r\n" + 
				"Jude;Stevens;118;Nice;8449;M;Moose,Boomer,Simba\r\n" + 
				"Dr. Kyler;Boyer;120;Malmö;1843;M;Gucci,Ranger\r\n" + 
				"Adler;Miranda;139;Florence;9175;M;Gucci,Chester,Scout,Shadow\r\n" + 
				"Celia;Stewart;64;Varna;6318;F;\r\n" + 
				"Dr. Indie;Burton;108;Riga;0;F;Romeo,Prince,Dexter\r\n" + 
				"Sonny;Choi;35;Catania;2534;M;Joey,Rex,Romeo,Tyson,Porter,Gizmo\r\n" + 
				"Zachary;Macias;76;Copenhagen;5918;M;Wally,Blue,Chase,Buster,Ryder\r\n" + 
				"Averi;Boone;46;Wuppertal;3918;F;Chip,Baxter,Odin,Teddy,Ruger,Ruger\r\n" + 
				"Isabel;Wolfe;42;Marseille;3649;F;Lucky,Harry,Whiskey,Buster\r\n" + 
				"Cataleya;Carroll;106;Nice;9768;F;Harry,Henry,Tucker,Archie\r\n" + 
				"Travis;Daniels;119;Palermo;7237;M;Rusty,Ziggy,Benny,Rocket,Oliver\r\n" + 
				"Naya;Kelly;22;Mannheim;1042;F;\r\n" + 
				"Journee;Bailey;138;Palma de Mallorca;0;F;\r\n" + 
				"Carl;Pennington;57;Genoa;0;M;Jax,Zeke,Rex,Cash\r\n" + 
				"Barrett;Macdonald;57;Szczecin;0;M;Harley,Lincoln,Ruger,George,Rudy,Beau\r\n" + 
				"Sky;Liu;86;Florence;527;F;Joey\r\n" + 
				"Valentin;Miles;49;Munich;7627;M;Bruno,Rex,Teddy,Charlie\r\n" + 
				"Emilio;Mckinney;124;Gdańsk;7518;M;\r\n" + 
				"Nico;O’connell;113;Szczecin;1215;M;Titan\r\n" + 
				"Sutton;Hinton;63;Hanover;0;M;Gus,Jake,Sam,Ace,Blue,Joey\r\n" + 
				"Dr. Ford;James;111;Nantes;353;M;Levi,Rocky,Ozzy,Gucci\r\n" + 
				"Michael;Hodge;13;Cologne;5804;M;Rocky,Prince,Tucker,Cody\r\n" + 
				"Gracelyn;Hampton;82;Paris;5028;F;Zeke,King\r\n" + 
				"Felix;Arnold;37;Utrecht;7163;M;Milo,Dexter\r\n" + 
				"Lacey;Miller;42;Szczecin;4073;F;Henry\r\n" + 
				"Santino;Cuevas;94;Nice;277;M;Oakley,Cash,Oreo,Max,Oreo,Scout\r\n" + 
				"Maggie;Dorsey;75;Varna;6217;F;Chase,Jax,Loki,Shadow\r\n" + 
				"Dr. Turner;Anderson;137;Dortmund;0;M;Harry,Harley,Ace,Jax\r\n" + 
				"Jayleen;Silva;37;Münster;0;F;Mac,Rocket,Buddy,Baxter,Gucci,Echo\r\n" + 
				"Dorian;Ryan;38;Dresden;5252;M;Rusty,Ruger,Buddy\r\n" + 
				"Manuel;Smith;30;Galați;0;M;Rocky,Rambo\r\n" + 
				"David;Dunn;52;Barcelona;4690;M;Mac,Copper,Chester,Ozzy\r\n" + 
				"Roman;Salazar;17;Varna;0;M;\r\n" + 
				"Dr. Everleigh;Sampson;76;Riga;492;F;Rudy,Jack,Tank\r\n" + 
				"Adrian;Gutierrez;41;Helsinki;0;M;Benji,George,Sam,Ranger,Lincoln\r\n" + 
				"Karter;Jacobs;61;Sigulda;1632;M;\r\n" + 
				"Leyla;Lynn;55;Utrecht;5215;F;Ranger,Moose\r\n" + 
				"Kylan;Herring;12;Hamburg;6376;M;Benji,Echo,King,Toby,Gunner\r\n" + 
				"Curtis;Wright;53;Malmö;1021;M;Toby,Ozzy,Hank,Gizmo\r\n" + 
				"Katie;Knight;45;Palma de Mallorca;7303;F;Jake,Jackson,Leo,Benji,Odie,Echo\r\n" + 
				"Haven;Bowen;98;Mannheim;0;F;Finn,Oscar,Axel\r\n" + 
				"Alfred;Cervantes;136;Tallinn;6266;M;\r\n" + 
				"Edison;Washington;39;Hamburg;9193;M;Oliver,Arlo,Bruno,Murphy,Gizmo,Bowie\r\n" + 
				"Kole;Huffman;104;Bilbao;0;M;Gucci,Bandit,Jasper,Louie\r\n" + 
				"Nancy;Dean;59;Barcelona;8062;F;Bandit,Rex,Boomer,Arlo\r\n" + 
				"Ariya;Trujillo;20;Bucharest;0;F;Buster,Harley,Winston,Jack\r\n" + 
				"Jaelynn;Williamson;27;Palermo;0;F;Copper,Simba,Harley,Oakley\r\n" + 
				"Ariel;Page;51;Mannheim;0;M;Winston,Shadow,Bentley,Joey,Prince,Winston\r\n" + 
				"Odin;Warner;136;Łódź;0;M;Sam,Ranger,Oliver,Charlie,Sarge,Oakley\r\n" + 
				"Ledger;Allen;109;Wrocław;0;M;Duke,Odin\r\n" + 
				"Araceli;Mora;116;Bilbao;4209;F;\r\n" + 
				"Talia;Whitaker;55;Rotterdam;3889;F;Prince\r\n" + 
				"Nicole;Blair;81;Brno;6092;F;Oscar,Winston\r\n" + 
				"Phoebe;Moses;71;Galați;0;F;Milo,Milo\r\n" + 
				"Abigail;Case;88;Valencia;9297;F;Henry\r\n" + 
				"Vincenzo;Walter;39;Dortmund;1885;M;\r\n" + 
				"Emily;Arroyo;96;Zaragoza;0;F;\r\n" + 
				"Brooklyn;Chan;127;Barcelona;6646;F;Samson,Zeus\r\n" + 
				"Colson;Mendoza;75;Florence;7358;M;Louie,Marley,Otis,Porter,Gunner\r\n" + 
				"Clementine;Hinton;134;Rotterdam;0;F;Remy,Samson,Remy,Bruce\r\n" + 
				"Dr. Robin;Owen;118;Zaragoza;5372;M;Mac\r\n" + 
				"Arturo;Estes;30;Bonn;2792;M;Bruce,Dozer\r\n" + 
				"Nala;Corona;110;Bielefeld;0;F;Benny,Levi,Harry,Axel,Leo\r\n" + 
				"Madelynn;Rowe;54;Gothenburg;2241;F;\r\n" + 
				"Saint;Buchanan;113;Plovdiv;0;M;Rusty,Bo,Samson\r\n" + 
				"Kyro;Blackwell;139;Düsseldorf;0;M;Sam,Beau,Lucky,Harry\r\n" + 
				"Lyric;Stanley;135;Málaga;7207;F;\r\n" + 
				"Noemi;Mcmillan;88;Rīga;0;F;Riley,Ozzy,Sarge,Toby\r\n" + 
				"Axton;Xiong;99;Florence;8635;M;Theo\r\n" + 
				"Dr. Sierra;Moon;16;Nice;0;F;Boomer\r\n" + 
				"Dr. Conrad;Vega;40;Zagreb;6527;M;\r\n" + 
				"Brinley;Short;31;Cluj-Napoca;0;F;Luke,Oakley,King,Bo,Charlie,Zeke\r\n" + 
				"Brylee;Gonzales;133;Rome;0;F;Boomer,Odin\r\n" + 
				"Beatrice;Frost;85;Toulouse;0;F;\r\n" + 
				"Dr. Rosalyn;Harding;92;Nice;5611;F;Beau\r\n" + 
				"Dr. Margaret;Olson;138;Vila Nova de Gaia;6717;F;Tank\r\n" + 
				"Dr. Jakari;Brennan;72;Bilbao;0;M;\r\n" + 
				"Isabella;Ramos;83;Turin;494;F;Toby,Simba\r\n" + 
				"Nayeli;Ventura;89;Paris;6241;F;Oreo,Chase,Charlie,Leo,Ollie,Miles\r\n" + 
				"Gustavo;Kelley;81;Constanța;7489;M;Bo,Oakley\r\n" + 
				"Diana;Barker;112;Poznań;0;F;Archie,Fluffy,Riley,Boomer,Zeus,Joey\r\n" + 
				"Jeffery;Bass;61;Bonn;4601;M;Milo\r\n" + 
				"Dr. Alison;Meza;36;Wrocław;2300;F;Oreo,Chase,Chester,Miles\r\n" + 
				"Amara;Saunders;62;Amsterdam;0;F;Maverick,Luke,Gizmo,Rusty,Levi\r\n" + 
				"Dr. Madilynn;Palmer;111;Munich;0;F;Beau,Lincoln,Levi,Remy\r\n" + 
				"Emory;Thornton;113;Bonn;0;F;Koda\r\n" + 
				"Dr. Eden;Gentry;44;Barcelona;122;F;Ziggy\r\n" + 
				"Conor;Small;120;Antwerp;251;M;Duke\r\n" + 
				"Gerald;Parsons;47;Bydgoszcz;0;M;\r\n" + 
				"Junior;Strong;136;Valmiera;9842;M;Shadow,Tucker,Jax,Bo,Bandit\r\n" + 
				"Eithan;Hoffman;103;Gothenburg;0;M;Arlo,Scout\r\n" + 
				"Clarissa;Watson;136;Madrid;6082;F;Murphy,Beau,Finn,Ollie,Jackson\r\n" + 
				"Finley;Ashley;126;Bari;5624;M;Jack\r\n" + 
				"Ishaan;Spears;48;Dresden;551;M;Rusty,Dexter,George\r\n" + 
				"Jane;Winters;39;Nice;0;F;Bentley,Bowie,Odie,Ollie,Bruno,Ollie\r\n" + 
				"Iris;Stevenson;107;Prague;0;F;\r\n" + 
				"Esperanza;Fitzpatrick;34;Nice;2448;F;Thor,Marley\r\n" + 
				"Bjorn;Bishop;64;Gothenburg;8740;M;Joey,Watson\r\n" + 
				"Abdullah;Wood;81;Galați;0;M;Thor,Koda\r\n" + 
				"Dr. Meadow;Barr;121;Vienna;0;F;Samson,Mac,Cody,Walter,Miles,Bowie\r\n" + 
				"Greyson;Kane;130;Sofia;9568;M;Rocco,Zeke,Rex,Atlas,Axel,Porter\r\n" + 
				"Riley;Stephenson;19;Utrecht;921;F;\r\n" + 
				"Camilo;Mullins;58;Łódź;5950;M;Jackson\r\n" + 
				"Renata;Small;122;Bari;8160;F;Mac,Dozer,Boomer,Lincoln\r\n" + 
				"Adelaide;Woods;41;Gdańsk;2266;F;Remi,Odin,Jasper,Boomer,Koda,Chester\r\n" + 
				"Haven;Massey;46;Zagreb;0;F;Winston\r\n" + 
				"Hugo;Holt;33;Leipzig;3115;M;Baxter,Rex,Odin,Kylo\r\n" + 
				"Chase;Fields;86;Bucharest;592;M;\r\n" + 
				"Ambrose;Pope;55;Brno;4050;M;\r\n" + 
				"Andi;Crawford;62;Varna;376;F;Miles,Bear\r\n" + 
				"Emanuel;Carpenter;83;Milan;9788;M;Axel\r\n" + 
				"Roselyn;Zhang;28;Bonn;4262;F;Buster,Bailey,Benji,Riley\r\n" + 
				"Bria;Benitez;67;Nantes;0;F;Dozer,Chip,Chester\r\n" + 
				"Dr. Fernando;Ochoa;19;Rotterdam;2026;M;Leo,Oakley\r\n" + 
				"Novalee;Church;66;Madrid;5588;F;Otis\r\n" + 
				"Zane;Armstrong;90;Essen;0;M;Boomer,Ollie\r\n" + 
				"Gabriella;Boyle;30;Toulouse;0;F;Riley,Buster,Titan\r\n" + 
				"Dr. Amy;Robertson;62;Poznań;0;F;Koda,Lincoln,Whiskey,Baxter,Harry,Oakley\r\n" + 
				"Dr. Makai;Ashley;95;Helsinki;0;M;Axel,Peanut,Wally,Rocco,Dexter\r\n" + 
				"Odin;Gomez;64;Essen;9291;M;\r\n" + 
				"Alivia;Houston;137;Seville;338;F;Luke,Cash,Jack\r\n" + 
				"Harmony;Torres;113;Gothenburg;2727;F;Charlie,Axel,Mac,Oreo\r\n" + 
				"Jamison;Mann;25;Helsinki;0;M;Gunner,Joey,Odin,Cody,Thor,Boomer\r\n" + 
				"Dr. April;Henderson;64;Copenhagen;2925;F;Walter,Mac,Levi,Rocco,Zeke,Diesel\r\n" + 
				"Dustin;Todd;47;Galați;5275;M;Lucky,Toby,Rocket,Odin\r\n" + 
				"Emberly;Singh;24;Nuremberg;1348;F;Chester,Kobe,Duke,Echo\r\n" + 
				"Hayley;Olsen;84;Murcia;8739;F;\r\n" + 
				"Alberto;Ibarra;32;Rīga;7424;M;Lucky\r\n" + 
				"Nataly;Ellis;111;Szczecin;2212;F;Benji\r\n" + 
				"Dr. Lyric;Griffin;101;Kraków;0;F;Charlie,Romeo,Chester\r\n" + 
				"Kara;Navarro;99;Sofia;6096;F;Scout\r\n" + 
				"Nathaniel;Evans;67;Bremen;180;M;\r\n" + 
				"Kelvin;Carpenter;52;Alicante;0;M;Miles,Oakley,Ryder,Benji,Tyson\r\n" + 
				"Chaim;Walls;105;Bilbao;8097;M;Milo,Rusty,Tank,Finn\r\n" + 
				"Dr. Danna;Tucker;131;Bologna;0;F;Ozzy,Atlas,Watson,Duke\r\n" + 
				"Rowen;Hansen;121;Gothenburg;9528;M;Remy,Peanut,Oscar,Ziggy\r\n" + 
				"Dr. Declan;Conway;17;Thessaloniki;0;M;Sam,Rocky,Kylo\r\n" + 
				"Dr. Asher;Trejo;133;Karlsruhe;2308;M;Shadow,Watson,Walter,Fluffy,Koda\r\n" + 
				"Juliet;Carrillo;13;Helsinki;0;F;Ace,Shadow,Jack\r\n" + 
				"Lilly;Harris;76;Brno;6088;F;Gunner,Charlie,Levi\r\n" + 
				"Guadalupe;Cantu;44;Constanța;9376;F;Jackson,Thor,Bo\r\n" + 
				"Cole;Carr;76;Stockholm;7166;M;\r\n" + 
				"Haley;Hull;79;Paris;9136;F;Duke,Tank,George\r\n" + 
				"Hope;Cain;61;Madrid;1461;F;Bandit,Shadow,Blaze,Max\r\n" + 
				"Elianna;Morrow;58;Thessaloniki;8513;F;Odin,Tucker,Max,Winston,Theo,Tyson\r\n" + 
				"Cecelia;Strong;22;Seville;3068;F;Copper,Titan,Scout,Buster\r\n" + 
				"Parker;Nichols;41;Alicante;2864;F;Jake,Archie,Milo,Jasper\r\n" + 
				"Major;Hardy;42;Dresden;3889;M;Echo,Buddy,Atlas,Remy\r\n" + 
				"Dr. Maverick;Quintero;98;Frankfurt am Main;2136;M;\r\n" + 
				"Dior;Crosby;72;Düsseldorf;7818;F;Oakley,Echo\r\n" + 
				"Dr. Jalen;Gaines;108;Cologne;8172;M;Winston,Ace\r\n" + 
				"Abdullah;Pearson;102;Sofia;4259;M;Prince,Rocket,Gus\r\n" + 
				"Marilyn;Velazquez;92;Lyon;0;F;Bubba,Arlo,Scout,Theo,Copper,Rusty\r\n" + 
				"Mauricio;Mathews;133;Naples;0;M;Oliver,Chase,Theo,Oakley\r\n" + 
				"Allie;Rosario;38;Berlin;9200;F;Walter,Bentley,Bo\r\n" + 
				"Edith;Hoffman;40;Bochum;0;F;Fluffy,Blue,Wally,Coco\r\n" + 
				"Theodora;Mays;123;Nantes;4728;F;\r\n" + 
				"Dr. Ricky;Moran;102;Catania;0;M;\r\n" + 
				"Ember;Wilkinson;99;Copenhagen;7140;F;Gizmo,Maverick,Wally,Riley,George\r\n" + 
				"Jonas;Leon;26;Bydgoszcz;154;M;Rusty,King\r\n" + 
				"Franco;Bender;90;Alicante;8139;M;Winston,Bo,Coco\r\n" + 
				"Jace;Calhoun;97;Hanover;3085;M;\r\n" + 
				"Amoura;Gaines;78;Berlin;1366;F;Baxter,Remy,Charlie\r\n" + 
				"Salvador;Warren;25;Galați;0;M;Harry,Rambo,Harley\r\n" + 
				"Fisher;Fernandez;28;Bratislava;0;M;Echo,Peanut,Hank,Bruce,Shadow,Remy\r\n" + 
				"Colin;Marin;95;Frankfurt am Main;4536;M;Copper,Rocco,Remy,Boomer,Kylo\r\n" + 
				"Emerald;Ashley;33;Plovdiv;5115;F;Titan,Watson,Rambo\r\n" + 
				"Aarav;Norris;68;Bydgoszcz;0;M;Koda,Rex,Cooper\r\n" + 
				"Helen;Spears;76;Frankfurt am Main;4768;F;Ryder,Coco\r\n" + 
				"Dr. Gage;Novak;10;Toulouse;3630;M;\r\n" + 
				"Kaylani;Sandoval;127;Paris;0;F;Winston,Beau,Apollo\r\n" + 
				"Gia;Bell;96;Lublin;4522;F;\r\n" + 
				"Eliseo;Parrish;19;Budapest;5748;M;Oreo,Oakley\r\n" + 
				"Adalyn;Cummings;49;Barcelona;3989;F;\r\n" + 
				"Haven;Brandt;135;Bucharest;5131;F;George,Coco,Bubba\r\n" + 
				"Mae;Moses;31;Munich;0;F;Jasper,Rudy,Jake,Miles\r\n" + 
				"Reuben;Charles;63;Aarhus;0;M;Ozzy,Titan,Romeo\r\n" + 
				"Mccoy;Tran;19;Düsseldorf;3508;M;Ruger,Rocket,Jackson\r\n" + 
				"Clyde;Peters;70;Seville;0;M;Kobe,Rusty,Dexter,Benny,Axel\r\n" + 
				"Arturo;Berger;129;Karlsruhe;5990;M;Oreo,Rusty,Otis,Rocco,Duke,Bruce\r\n" + 
				"Peter;Wise;44;Munich;0;M;Max,Gunner,Rocky,Theo,Charlie,Henry\r\n" + 
				"Lucian;Armstrong;130;Rome;1644;M;Miles,Wally,Tyson,Jasper,Benji,Harley\r\n" + 
				"Legacy;Adkins;43;Cluj-Napoca;2185;M;Tank,Rocky,Watson,Luke,Simba\r\n" + 
				"Brinley;Cook;39;Turin;2639;F;\r\n" + 
				"Clayton;Andersen;45;Copenhagen;3852;M;Chester,Gizmo,Buddy,Chase,Bear,Luke\r\n" + 
				"Milana;Dawson;43;Vienna;5133;F;Winston,Samson,Baxter\r\n" + 
				"Luca;Mosley;88;Münster;231;M;Joey,Cooper,Atlas,Simba\r\n" + 
				"Anika;Rowland;63;Stockholm;6537;F;King,Oliver\r\n" + 
				"Ambrose;Bryant;137;Vienna;2560;M;Winston,Hank,Ozzy,Milo\r\n" + 
				"Dr. Messiah;Peralta;56;Alicante;864;M;Diesel,Jake\r\n" + 
				"Lexie;Copeland;53;Bucharest;4987;F;Odin,Jax,Henry,Harley,Oreo,Duke\r\n" + 
				"Karsyn;Jennings;13;Frankfurt am Main;0;M;Bentley,Romeo,Teddy,Mac,Miles,King\r\n" + 
				"Janelle;Hess;101;Berlin;4658;F;Bailey,Charlie,Murphy,Buddy\r\n" + 
				"Journey;Schmitt;76;Palermo;0;F;Koda,Cody,Oreo,Ranger,Bailey,Teddy\r\n" + 
				"Amos;Schroeder;21;Dresden;0;M;Buster\r\n" + 
				"Finnley;Pitts;85;Riga;0;M;Dozer,Max,Bailey\r\n" + 
				"Grady;Buchanan;10;Leipzig;0;M;Whiskey,Murphy,Marley,Leo,Cash,Jax\r\n" + 
				"Cyrus;Blackburn;54;Vienna;0;M;Ruger,Moose,Baxter,Sam,Moose,George\r\n" + 
				"Kane;Dean;10;Berlin;8438;M;Beau,Axel,Otis\r\n" + 
				"Kassidy;Goodman;105;Lublin;1272;F;Watson,Odie,Bubba,Atlas,Simba,Rusty\r\n" + 
				"Sergio;Crosby;91;Valmiera;2308;M;Coco\r\n" + 
				"Rachel;Kennedy;58;Sigulda;0;F;Rocket,Finn,Cooper,Theo,Echo\r\n" + 
				"Melissa;Wright;86;Thessaloniki;9670;F;Marley,Prince,Rocky,Jax,Blue\r\n" + 
				"Lance;Collier;15;Bologna;8179;M;\r\n" + 
				"Julian;Stuart;76;Malmö;0;M;Copper\r\n" + 
				"Tanner;George;48;Warsaw;0;M;\r\n" + 
				"Sergio;Norman;19;Murcia;7745;M;Cooper\r\n" + 
				"Graham;Manning;102;Budapest;1424;M;Odin,Benji,Jax,Rudy,Henry,Buster\r\n" + 
				"Ramona;Evans;41;Vilnius;4878;F;Oscar,Lincoln,Ranger\r\n" + 
				"Salvatore;Vargas;79;Antwerp;0;M;\r\n" + 
				"Danny;Landry;91;Plovdiv;0;M;Watson,Rusty,Ozzy,Bear,Tank,Axel\r\n" + 
				"Anastasia;Lambert;35;Riga;3558;F;Gucci,Ace,Bowie,Jack\r\n" + 
				"Amaris;Brown;94;Iași;5500;F;King,Finn,Rocky,Archie,Rudy,Bruce\r\n" + 
				"Johnathan;Richardson;38;Berlin;738;M;Bo,Sam,Ziggy,Chase,Luke\r\n" + 
				"Brendan;Bartlett;135;Munich;0;M;Joey,Atlas,Coco,Maverick,Joey,Odin\r\n" + 
				"Scott;Frye;19;Thessaloniki;880;M;Simba,Bubba\r\n" + 
				"Liv;Delarosa;137;Wrocław;4398;F;Hank,Toby\r\n" + 
				"Jake;Hardin;60;Mannheim;0;M;Copper\r\n" + 
				"Dr. Kylian;Pittman;15;Alicante;3013;M;Oreo,Bailey,Milo,Gizmo\r\n" + 
				"Catalina;Skinner;15;Aarhus;0;F;King\r\n" + 
				"Beckham;Herrera;102;Budapest;2416;M;Theo\r\n" + 
				"Henry;Atkins;112;Plovdiv;889;M;Tucker,Archie,Walter,Max,Bowie,Porter\r\n" + 
				"Junior;Ward;69;Utrecht;3958;M;Harry,Mac,Bubba,Luke,Benji\r\n" + 
				"Jaylah;Lindsey;54;Rome;5538;F;Ozzy\r\n" + 
				"Payton;Hess;52;Duisburg;3062;F;Apollo,Remi,Cash,Leo,Baxter\r\n" + 
				"Skyler;Shaw;35;Vilnius;5313;M;\r\n" + 
				"Kayleigh;Mcdowell;30;Rome;6702;F;Echo,Louie,Kylo,Lincoln,Buddy\r\n" + 
				"Judah;Browning;78;Florence;0;M;\r\n" + 
				"Talia;Mann;13;Nantes;6236;F;Henry,Ruger,Oreo\r\n" + 
				"Valery;Gallagher;100;Vilnius;0;F;Whiskey,Jack,Miles,Henry,Koda\r\n" + 
				"Abigail;Bryant;33;Lublin;2528;F;\r\n" + 
				"Asa;Andrade;136;Cluj-Napoca;6929;M;Harry\r\n" + 
				"Rosalie;Underwood;47;Genoa;0;F;Diesel,Porter,Luke,Dexter,Max\r\n" + 
				"Douglas;Watts;124;Düsseldorf;3568;M;Harley,Tyson,Max,Jack\r\n" + 
				"Ari;Maldonado;41;Hamburg;5067;F;\r\n" + 
				"Thomas;Sawyer;59;Palma de Mallorca;9184;M;Harley,Harry\r\n" + 
				"Brielle;Goodman;26;Szczecin;0;F;Baxter,Marley,Ollie\r\n" + 
				"Penny;Salas;79;Copenhagen;3282;F;Samson,Benny,Sam,Tank,Porter\r\n" + 
				"Khloe;Phelps;48;Galați;5713;F;Boomer,Theo,Winston,Samson,Oreo\r\n" + 
				"Jorge;Foster;83;Genoa;0;M;Milo,Miles\r\n" + 
				"Leona;Mills;28;Rome;9071;F;\r\n" + 
				"Dr. Trace;Norris;83;Nuremberg;8783;M;Bruno,Leo,Kylo,Axel\r\n" + 
				"Dr. Magdalena;Moyer;29;Antwerp;0;F;Jasper,Riley,Samson,Tyson,Louie,Harry\r\n" + 
				"Claire;Patterson;110;Karlsruhe;6784;F;\r\n" + 
				"Mario;Cantu;125;Bari;9423;M;George,Prince,Jax\r\n" + 
				"Cali;Webster;124;Sigulda;6200;F;Oscar,Benny,Wally\r\n" + 
				"Aniya;Mayer;71;Brno;6735;F;Dozer,Chip,Jax,Rusty,Boomer\r\n" + 
				"Maci;Felix;76;Łódź;0;F;Whiskey\r\n" + 
				"Jonathan;Livingston;18;Hanover;9836;M;Zeke\r\n" + 
				"Iker;Avery;131;Gothenburg;4066;M;\r\n" + 
				"Rodrigo;Travis;114;Sofia;0;M;Jack,Ozzy,Gunner\r\n" + 
				"Elena;Shepherd;69;Aarhus;437;F;Walter,Hank,Walter\r\n" + 
				"Kairi;Hunt;133;Madrid;7007;F;Ziggy,Shadow\r\n" + 
				"Lilianna;Douglas;100;Duisburg;4616;F;Arlo,Maverick,Riley,Tank\r\n" + 
				"Alessandro;Singleton;116;The Hague;0;M;\r\n" + 
				"Guadalupe;Wilson;34;Sigulda;6231;F;Zeus,Tank,Mac,Teddy,Riley\r\n" + 
				"Mara;Hess;100;Mannheim;0;F;Bentley,Sam,Harley,Rocket,Oliver,Blaze\r\n" + 
				"Alejandro;Boyd;67;Nantes;8566;M;Kylo,Wally,Maverick\r\n" + 
				"Holland;Sandoval;72;Dresden;1153;F;Dexter,Ozzy,Beau\r\n" + 
				"Davina;Cohen;59;Warsaw;0;F;\r\n" + 
				"Dr. Talia;Bush;72;Madrid;0;F;Winston\r\n" + 
				"Dax;Griffin;20;Nuremberg;5611;M;Oakley\r\n" + 
				"Zayne;Mcbride;131;Catania;0;M;\r\n" + 
				"Nadia;Mcdaniel;56;Sofia;6327;F;\r\n" + 
				"Aarya;Enriquez;122;Naples;6029;F;Rocket,Ruger,Atlas,Gus,Harry,Dexter\r\n" + 
				"Cadence;O’neill;24;Leipzig;5795;F;Bowie,Jack,Odin,Duke,Levi,Loki\r\n" + 
				"Ira;Wong;38;Rotterdam;3266;M;Peanut,Odin\r\n" + 
				"Lincoln;West;47;Alicante;0;M;Henry\r\n" + 
				"Nikolas;Person;100;Rīga;0;M;Scout,Kobe,Simba,Jackson,Porter\r\n" + 
				"Cason;Villa;130;Mannheim;1866;M;Echo,Kobe,Beau\r\n" + 
				"Nancy;Donaldson;17;Duisburg;0;F;Bubba,Scout,Ziggy,Archie\r\n" + 
				"Gracie;Powell;62;Gdańsk;6591;F;Archie\r\n" + 
				"Denver;Woodward;125;Gdańsk;4865;M;Rex,Zeus\r\n" + 
				"Sylvie;Dominguez;122;Bonn;2759;F;Jack,Harley,Marley,Axel,Winston,Jackson\r\n" + 
				"Alaric;Haley;66;Toulouse;1315;M;Bear\r\n" + 
				"Dr. Chandler;Alvarado;81;Poznań;0;M;Watson\r\n" + 
				"Dominic;Garza;31;Berlin;736;M;\r\n" + 
				"Jaycee;Ryan;15;Sintra;7425;F;\r\n" + 
				"Adele;Shaw;99;Lublin;0;F;Dozer,Milo,Coco,Axel,Sam,Ruger\r\n" + 
				"Rylan;Barrett;77;Rome;494;F;Bear\r\n" + 
				"Cannon;Wood;71;Paris;4545;M;Buddy,Walter,Jackson,Oakley,Fluffy\r\n" + 
				"Bruce;Benitez;92;Palma de Mallorca;818;M;\r\n" + 
				"Izaiah;Duffy;121;Vila Nova de Gaia;3964;M;Oakley,Coco,Archie\r\n" + 
				"Jerry;Howe;50;Valencia;7431;M;Lincoln,Benny,Charlie,Bear\r\n" + 
				"Cadence;Donovan;28;Bonn;2418;F;Ziggy,Tyson,King,Chip,Chip,Samson\r\n" + 
				"Brantley;Calderon;36;Timișoara;7443;M;Sarge,Kobe,Fluffy\r\n" + 
				"Adam;Mcmahon;11;Plovdiv;3553;M;Remi,Bailey,Lucky\r\n" + 
				"Tori;Banks;65;Stockholm;4166;F;Thor,Loki\r\n" + 
				"Lauren;Russo;11;Karlsruhe;965;F;Maverick,Finn,Jax\r\n" + 
				"Bennett;Vincent;17;Vilnius;4350;M;Rocky,Whiskey,Cody,Blue,Mac\r\n" + 
				"Stephen;Pope;25;Berlin;0;M;\r\n" + 
				"Emerie;Francis;41;Florence;6737;F;Remi,Riley,Oliver,Henry\r\n" + 
				"Mavis;Blankenship;120;Naples;7869;F;\r\n" + 
				"Erin;Mason;28;Cluj-Napoca;5183;F;Murphy,Bubba,Lucky,Fluffy,Archie,Ruger\r\n" + 
				"Drew;Hogan;33;Bucharest;2173;F;Buddy,Baxter,Theo,Remy,Bruce,Finn\r\n" + 
				"Emmie;Santiago;25;Thessaloniki;0;F;Shadow,Teddy,Ruger,Buddy\r\n" + 
				"Dustin;Patterson;44;Bochum;0;M;Sarge,Whiskey,Odin,Simba\r\n" + 
				"Jaime;Knox;80;Athens;4254;M;Chester\r\n" + 
				"Kathryn;Hughes;64;Düsseldorf;4787;F;Walter,Fluffy,Ollie,Ziggy,Axel\r\n" + 
				"Cassandra;Little;57;Iași;0;F;Samson,Fluffy,Maverick,Fluffy,Bailey\r\n" + 
				"Myles;Mccormick;41;Düsseldorf;0;M;\r\n" + 
				"Meredith;Huynh;90;Hamburg;3774;F;Jack\r\n" + 
				"Emanuel;Rollins;56;Constanța;5422;M;Archie,Tucker,Loki,Ollie\r\n" + 
				"Ace;Liu;23;Łódź;6114;M;Harley,Teddy,Miles,Peanut,Tucker,Max\r\n" + 
				"Ayan;Weber;69;Tallinn;1937;M;Zeus,Dozer,Jackson,Porter,Tucker\r\n" + 
				"Raul;Knox;52;Thessaloniki;6176;M;Coco,Benji,Teddy,Chase,Bowie\r\n" + 
				"Princeton;Goodwin;48;Utrecht;4093;M;Oakley,Jake,Cooper,Odie,Diesel,Tank\r\n" + 
				"Harrison;Holmes;17;Leipzig;1003;M;Samson\r\n" + 
				"Grace;Fowler;137;Gdańsk;0;F;Cash,Toby\r\n" + 
				"Cara;Hicks;105;Budapest;0;F;Oreo,Odie,Gucci\r\n" + 
				"Stevie;Mora;124;Brno;5418;F;Oscar,Hank,Buster,Tyson,Jake,Axel\r\n" + 
				"Tony;Wallace;22;Cologne;1128;M;Oscar,Bentley\r\n" + 
				"Korbin;Yates;79;Córdoba;6949;M;Benji,King,Oreo,Titan\r\n" + 
				"Cason;Moon;20;Münster;0;M;Harry,Moose,Moose,Ryder\r\n" + 
				"Zainab;Franklin;108;Rome;6018;F;Oliver,Gucci,Benny\r\n" + 
				"Layne;Giles;108;Łódź;0;F;Louie,Gucci\r\n" + 
				"Dr. Paloma;Mora;10;Nantes;0;F;Jake,Arlo,Rusty,Jake,Bentley,Bruno\r\n" + 
				"Gunner;Perry;131;Brno;0;M;King\r\n" + 
				"Saylor;Flowers;103;Las Palmas;1290;F;\r\n" + 
				"Malakai;Orr;76;Lyon;4116;M;Bruce,Peanut,Shadow,Tank,Arlo\r\n" + 
				"Jedidiah;Higgins;49;Düsseldorf;2397;M;Tank,Cash,Remi\r\n" + 
				"Kristopher;Melton;100;Sigulda;9213;M;\r\n" + 
				"Lachlan;Brennan;77;Bilbao;9910;M;\r\n" + 
				"Dr. Emmalynn;Bartlett;25;Timișoara;0;F;Tucker\r\n" + 
				"Mohammed;Collins;58;Milan;2912;M;King,Bruno\r\n" + 
				"Elliott;Norman;123;Munich;9153;M;Jasper,Luke\r\n" + 
				"Royce;Huerta;85;Valmiera;5066;M;Loki,Axel,Ruger\r\n" + 
				"Dr. Gustavo;Peterson;137;Tallinn;8334;M;Chase,Bailey,Arlo\r\n" + 
				"Emir;Petersen;62;Málaga;7756;M;Otis,Leo,Titan\r\n" + 
				"Dr. Carolyn;Lopez;120;Lublin;0;F;Lincoln,Ozzy,Lincoln,Riley,Blue,Loki\r\n" + 
				"Dr. Aleena;Velasquez;41;Prague;7073;F;Oscar,Rusty,Teddy,Louie,Baxter,George\r\n" + 
				"Dr. Oaklee;Gates;84;Berlin;9813;F;Jax,Bo,Ace\r\n" + 
				"Taylor;Hickman;51;Sofia;2805;F;Maverick,Ryder,Ace\r\n" + 
				"Jaxtyn;Arellano;13;Rome;0;M;Lucky,Cash,Diesel\r\n" + 
				"Angelica;Phelps;20;Nice;0;F;Apollo,Ziggy,Luke,Fluffy,Diesel\r\n" + 
				"Claire;Boyer;69;Duisburg;0;F;Bentley,Theo,Bentley,Ryder,Marley,Kobe\r\n" + 
				"Van;Zamora;48;Thessaloniki;0;M;Oliver\r\n" + 
				"Casen;Fitzpatrick;19;Valencia;2214;M;Bailey,Jax,Bear,Jax,Loki,Kylo\r\n" + 
				"Denver;Peralta;132;Constanța;5423;F;Thor,Gizmo,Cash,Tucker,Buddy,Rocco\r\n" + 
				"Danielle;Huffman;62;Budapest;6188;F;Scout,Oreo,Dexter,Bandit,Rudy\r\n" + 
				"Dr. Cullen;Tyler;82;Poznań;0;M;Jasper\r\n" + 
				"Kaison;Lamb;76;Lublin;0;M;Bear\r\n" + 
				"Niko;Mccall;78;Rotterdam;1402;M;Ranger\r\n" + 
				"Adonis;Dunlap;65;Barcelona;9094;M;Gizmo,Zeus,Tyson,Rocket,Jax,Luke\r\n" + 
				"Waverly;Curry;137;Valmiera;4512;F;Bear,Oliver\r\n" + 
				"Norah;Patel;41;Warsaw;860;F;Sam,Zeus,Oakley,Jax,Gucci,Sam\r\n" + 
				"Mara;Greene;52;Tallinn;265;F;Finn\r\n" + 
				"Bryan;Rasmussen;119;Bari;7327;M;Levi,Luke\r\n" + 
				"Nasir;Bautista;32;Frankfurt am Main;1776;M;Jackson,Rocket,Bruce,Remi\r\n" + 
				"Axl;Atkinson;32;Sofia;0;M;Miles,Remy,Gunner,Oakley,Ozzy\r\n" + 
				"Evelyn;Lewis;65;Seville;863;F;Maverick,Arlo,Jake,Simba,Buddy,Riley\r\n" + 
				"Ocean;Manning;65;Rome;8880;M;Copper,Oliver\r\n" + 
				"Amiyah;Mcdaniel;80;Szczecin;0;F;Milo,Walter\r\n" + 
				"Emmanuel;Sanchez;53;Wuppertal;2217;M;Jackson,Oakley,Bentley,Marley\r\n" + 
				"Jasmine;Ramirez;38;Turin;0;F;Copper,Ace\r\n" + 
				"Lauren;Mcintyre;44;Palermo;2520;F;Rocky,Oliver,Boomer,Cooper,Bandit,Watson\r\n" + 
				"Charlie;Curtis;129;Galați;1317;M;Benny,Watson,Chip,Chase,Tucker\r\n" + 
				"Dr. Ariyah;Jacobson;95;Frankfurt am Main;2244;F;Ace\r\n" + 
				"Ophelia;Valentine;86;Frankfurt am Main;7696;F;Otis,Rex,Odie,Kylo\r\n" + 
				"Rachel;White;72;Berlin;5095;F;Echo,Tank,Jake,Fluffy\r\n" + 
				"Karsyn;Blackburn;33;Kraków;4119;M;Duke,Scout,Zeus,Prince\r\n" + 
				"Skyla;Keith;61;Cluj-Napoca;1661;F;Oakley,Ozzy,Jasper\r\n" + 
				"Cooper;Burch;113;Gdańsk;1132;M;Winston,Theo,Wally,Titan,Max,Koda\r\n" + 
				"Onyx;Dodson;67;Rotterdam;4185;M;Walter,Oliver,Rocco\r\n" + 
				"Emma;Heath;121;Bratislava;8364;F;Baxter\r\n" + 
				"Titan;Gill;73;Vilnius;7752;M;Archie,Blue\r\n" + 
				"Isabel;Day;104;Dublin;0;F;Duke,Chester,Duke\r\n" + 
				"Dr. Naomi;Estrada;101;Łódź;0;F;\r\n" + 
				"Holden;Collins;57;Catania;0;M;Tyson,Zeke,Rocky,Murphy,Gizmo\r\n" + 
				"Dr. Drew;White;94;Madrid;0;F;Fluffy,Mac,Maverick\r\n" + 
				"Madison;Henderson;93;Gothenburg;0;F;\r\n" + 
				"Anthony;Bonilla;57;The Hague;5954;M;Bandit,Diesel,Odie\r\n" + 
				"Colette;Harvey;16;Stockholm;9046;F;Chester,Buddy,Thor,Shadow\r\n" + 
				"Amanda;Hebert;98;Rotterdam;7202;F;Mac,Ziggy,Marley,Riley,Oreo\r\n" + 
				"Mercy;Schwartz;111;Nuremberg;8673;F;Ollie,Cash,Jake,Zeke\r\n" + 
				"Martha;Higgins;62;Varna;6667;F;Porter\r\n" + 
				"Abner;Lopez;16;Toulouse;0;M;Ollie,George\r\n" + 
				"Eden;Ali;116;Turin;7443;M;Cooper\r\n" + 
				"Ulises;Bender;98;Málaga;9065;M;Gizmo,Rambo,Lincoln,Diesel,Bandit\r\n" + 
				"Roland;Bates;83;Bremen;6696;M;\r\n" + 
				"Dr. Stanley;Ayers;76;Amsterdam;5264;M;Gizmo,Jackson,Otis,Cooper,Gucci\r\n" + 
				"Kyleigh;Mcintosh;126;Catania;246;F;\r\n" + 
				"Alexandria;Bailey;38;Zagreb;1106;F;Atlas,Charlie,Tank,Cooper,Bentley\r\n" + 
				"Roselyn;Terry;54;Lisbon;0;F;Gunner,Tank,Otis,Samson,Miles,Echo\r\n" + 
				"Jayceon;Mcdaniel;103;Madrid;8848;M;Shadow,Zeus,Cody\r\n" + 
				"Lane;Wyatt;96;Palermo;6001;M;\r\n" + 
				"Isaias;Finley;115;Nice;0;M;Walter,Boomer,Romeo,Lucky\r\n" + 
				"Dr. Connor;Mason;129;Bremen;4338;M;Cash,Dozer,Jackson,Moose\r\n" + 
				"Tate;Adams;68;Tallinn;8200;M;Kylo,Whiskey,Max,Sam,Axel\r\n" + 
				"Wrenley;Lamb;36;Córdoba;4125;F;Toby,Gizmo,Milo,Joey,Bandit\r\n" + 
				"Sara;Serrano;61;Düsseldorf;0;F;\r\n" + 
				"Colette;Simmons;15;Thessaloniki;0;F;\r\n" + 
				"Ayleen;Cline;110;Mannheim;8747;F;Winston,Beau,Bubba\r\n" + 
				"Sage;Armstrong;20;Córdoba;3803;F;Ollie,Henry,Buster,Sarge\r\n" + 
				"Sarah;Petersen;44;Bucharest;997;F;Harley\r\n" + 
				"Charley;Sheppard;139;Athens;255;F;Tyson,Harry,Arlo\r\n" + 
				"Dr. Callen;Hoover;131;Zagreb;0;M;Ace,Bailey\r\n" + 
				"Briar;Tapia;88;Münster;0;F;\r\n" + 
				"Kenna;Rocha;84;Stuttgart;0;F;Chip,Koda,Benny,Bruce\r\n" + 
				"Paisley;Byrd;57;Sigulda;2249;F;\r\n" + 
				"Ameer;Oliver;111;Tallinn;2571;M;Murphy,Winston\r\n" + 
				"Sophia;Koch;48;Szczecin;5651;F;Copper,Finn,Cody,Oakley,Miles,Bandit\r\n" + 
				"Dr. Harlan;Hawkins;56;Barcelona;7362;M;Apollo,Toby,Hank,Baxter,Oakley,Bentley\r\n" + 
				"Kelvin;Sellers;61;Nice;0;M;Henry,Lucky,Loki,Ryder,Ollie\r\n" + 
				"Azariah;Barnett;77;Bucharest;0;F;Rex,Jasper,Rocky,Rocky,Romeo,Romeo\r\n" + 
				"Ivy;Farmer;89;Catania;0;F;Rusty,Cody,Bear,Rusty,Thor,Bentley\r\n" + 
				"Lukas;Thornton;109;Zagreb;0;M;Toby,Coco,Rocco\r\n" + 
				"Dr. Madeleine;Foley;35;Tallinn;5342;F;Diesel,Shadow\r\n" + 
				"Haley;Burnett;65;Bonn;3502;F;Henry,Zeus,Bailey,Oakley,Ryder,Tank\r\n" + 
				"Ansley;Foley;137;Madrid;0;F;Zeke,Ziggy,Fluffy\r\n" + 
				"Enoch;Pierce;23;Murcia;0;M;Peanut,Harley\r\n" + 
				"Matteo;Owens;35;Sigulda;0;M;Marley,Toby,Ollie\r\n" + 
				"Colson;Carlson;76;Bielefeld;454;M;Tucker\r\n" + 
				"Angelina;Franklin;50;Essen;2620;F;Oscar,Winston,Apollo,Dozer,Ryder,Odie\r\n" + 
				"Harper;Delacruz;60;Dresden;3441;F;Remy,Chip,Blue\r\n" + 
				"Joziah;Bartlett;46;Thessaloniki;9530;M;Gucci,Apollo,Max,Watson\r\n" + 
				"Mitchell;Cardenas;50;Münster;0;M;Maverick,Otis,Buddy,Jasper\r\n" + 
				"Livia;Johnston;131;Athens;0;F;Dexter,Archie,Louie,Diesel\r\n" + 
				"Casey;Harrington;48;Prague;7218;M;Sarge,Buddy,Chester\r\n" + 
				"London;Buchanan;57;Marseille;8465;M;Ruger,Marley,Tyson,Beau,Jack\r\n" + 
				"Maximilian;Knox;104;Madrid;826;M;Jake,Ace,Marley,Bear\r\n" + 
				"Adeline;Pham;102;Málaga;0;F;Diesel,Maverick,Fluffy,Blue,Dexter,Gus\r\n" + 
				"Leandro;Page;12;Amsterdam;0;M;Romeo\r\n" + 
				"Fiona;Riley;115;Nuremberg;0;F;Oreo,Tyson,Bruno,Miles,Oakley,Teddy\r\n" + 
				"Remi;Blair;119;Prague;7928;M;Tyson,Wally,Gucci,Walter,Scout\r\n" + 
				"Braylee;Rhodes;74;Toulouse;9710;F;Buddy,Jack,Gunner,Jackson\r\n" + 
				"Alfred;Hernandez;62;Vienna;2347;M;Baxter,Louie,Luke\r\n" + 
				"Salvador;Meyer;112;Marseille;1137;M;Chip,Zeke,Dozer,Theo,Tucker,Winston\r\n" + 
				"Roselyn;Peterson;139;Las Palmas;0;F;Maverick,Bear,Tyson\r\n" + 
				"Chana;Fisher;30;Las Palmas;0;F;Rudy,Shadow\r\n" + 
				"Fisher;Allison;24;Sigulda;4532;M;Samson,Kylo,Koda,Marley,Archie\r\n" + 
				"Galilea;Norris;135;Münster;3916;F;\r\n" + 
				"Carl;Mccormick;62;Bielefeld;3419;M;Loki,Jasper,Loki,Blue,Ranger\r\n" + 
				"Finn;Brandt;78;Milan;0;M;Shadow,Ozzy,Rusty,Whiskey\r\n" + 
				"Adele;Stevenson;43;Lisbon;0;F;\r\n" + 
				"Dr. Kaiya;Fry;30;Naples;6074;F;Watson,Otis\r\n" + 
				"Audrey;O’connor;23;Málaga;6966;F;\r\n" + 
				"Calum;Moreno;33;Sintra;4412;M;\r\n" + 
				"Santiago;Mccormick;61;Madrid;8675;M;Bear,Sam,Blaze,Oliver,Jake\r\n" + 
				"Ella;Bennett;20;Galați;0;F;Walter,Sam,Oakley,Ace,Toby,Blue\r\n" + 
				"Ramona;Jacobs;85;Utrecht;0;F;Bruce,Winston\r\n" + 
				"Maryam;Mann;19;Naples;8573;F;\r\n" + 
				"Wyatt;Mcintosh;75;Vienna;1947;M;Chase\r\n" + 
				"Danielle;Harvey;30;Nice;0;F;Blue,Tank,Bo,Blaze,Prince\r\n" + 
				"Giovanni;Robinson;57;Toulouse;3905;M;Benny\r\n" + 
				"Reed;Galindo;48;Szczecin;7549;M;\r\n" + 
				"Freyja;Michael;125;Bydgoszcz;7528;F;\r\n" + 
				"Arturo;Vasquez;119;Riga;0;M;Bruno\r\n" + 
				"Dr. Carmelo;Herman;133;Stuttgart;9388;M;Porter,Maverick,Jasper,Ollie\r\n" + 
				"Stella;Richard;122;Vilnius;0;F;Oakley,Blaze,Porter,Max,Winston\r\n" + 
				"Ashlynn;Randall;53;Sigulda;3415;F;Oreo,Boomer,Boomer,Coco,Echo\r\n" + 
				"Leroy;Leach;37;Cluj-Napoca;1900;M;Whiskey,Tyson,Henry,Ozzy,Bear\r\n" + 
				"Keira;Kelley;59;Milan;0;F;\r\n" + 
				"Mckenna;Goodwin;127;Bielefeld;272;F;Sarge,Hank,Buddy,Mac,Thor,Dozer\r\n" + 
				"Dr. Sariyah;Horton;128;Milan;1267;F;George,Ollie,Titan,Rudy,Remi,Thor\r\n" + 
				"Roberto;Gregory;93;Munich;0;M;Diesel,Jake,Blue,Arlo\r\n" + 
				"Shane;Willis;92;Amsterdam;4720;M;\r\n" + 
				"Dr. Brycen;Mclaughlin;131;Palma de Mallorca;0;M;Zeus,Mac\r\n" + 
				"Niko;Monroe;93;Wuppertal;0;M;Leo,Finn\r\n" + 
				"Krew;Wheeler;117;Bydgoszcz;3124;M;Romeo,Lucky,Duke,Samson\r\n" + 
				"Bridget;Benitez;39;Vila Nova de Gaia;406;F;Toby,Charlie,Rocco\r\n" + 
				"Dr. Arielle;Jarvis;115;Palma de Mallorca;6600;F;Bo,Bubba,Benny,Louie,Ollie\r\n" + 
				"Colette;Todd;120;Bratislava;9425;F;Odie,Gucci\r\n" + 
				"Reid;Short;133;Turin;0;M;Koda,Apollo\r\n" + 
				"Van;Villegas;20;Leipzig;9161;M;\r\n" + 
				"Pierce;Bush;87;Alicante;288;M;Romeo,Thor,Bruce,Otis\r\n" + 
				"Rayna;Piñeda;34;Málaga;3972;F;Koda,Walter,Titan\r\n" + 
				"Mack;Benson;77;Valmiera;8651;M;Remy,Ozzy\r\n" + 
				"Dr. Murphy;Ibarra;92;Nuremberg;2385;F;Oscar,Gizmo,Beau,Baxter,Chester,Simba\r\n" + 
				"Shay;Preston;68;Sintra;0;F;Loki,Archie\r\n" + 
				"Theodora;Phan;49;Bonn;206;F;Ozzy\r\n" + 
				"Rocco;Nava;29;Bucharest;6306;M;Jake,Finn,Gus,Bubba,Ryder,Boomer\r\n" + 
				"Sariyah;Duke;81;Hanover;3724;F;Lucky,Boomer,Murphy,Cash,Diesel,Loki\r\n" + 
				"Ezequiel;Benson;74;Sofia;1232;M;Gucci,Ruger,Dozer,Gucci,Maverick,Oliver\r\n" + 
				"Oakley;Harrison;47;Nantes;0;F;Chip,Bear\r\n" + 
				"Steven;Simpson;115;Vilnius;0;M;Porter,Ryder,Zeus,Lincoln,Shadow,Tyson\r\n" + 
				"Dr. Griffin;Cantu;59;Bydgoszcz;9089;M;Marley,Joey\r\n" + 
				"Paislee;Mckenzie;93;Rome;6045;F;Marley,Chase,Cody,Bentley,Winston\r\n" + 
				"Payton;Kelly;103;Thessaloniki;947;F;Harry,Whiskey,Louie,Gunner,Whiskey\r\n" + 
				"Jolene;Allen;137;Florence;0;F;Louie,Benji,Boomer\r\n" + 
				"Finnley;Abbott;133;The Hague;1478;M;\r\n" + 
				"Jaxton;Snyder;89;Rome;0;M;Beau,Bear,Coco,Blue,Lincoln\r\n" + 
				"Dr. Gabriel;Ramos;135;Antwerp;3145;M;Koda,Ruger,Shadow,Kobe,Marley\r\n" + 
				"Junior;Valentine;39;Nuremberg;9718;M;Bowie,Wally,Sarge,Moose,Sam,Tank\r\n" + 
				"Paxton;Byrd;47;Barcelona;8963;M;Lucky,Rocket\r\n" + 
				"Nataly;Morales;36;Valmiera;0;F;Bruce,Thor,Bentley,Ryder,Bo\r\n" + 
				"Harold;Jackson;128;Essen;0;M;Lincoln,Buddy,Buddy,Maverick,Boomer\r\n" + 
				"Beckett;Dawson;79;Thessaloniki;0;M;Sam,Odie\r\n" + 
				"Dr. Jesse;Lugo;44;Hanover;1941;M;Romeo,Walter\r\n" + 
				"Zayn;Woodward;29;Timișoara;3380;M;Benji\r\n" + 
				"Keilani;Franklin;87;Helsinki;6123;F;Harry,Jack\r\n" + 
				"Zayn;Malone;21;Poznań;0;M;Maverick,Rex,Kylo,Oscar,Toby,Echo\r\n" + 
				"Otis;Gaines;32;Budapest;3666;M;Leo,Dozer,Koda,Copper,Joey,Harley\r\n" + 
				"Gordon;Bryan;119;Lublin;4017;M;Hank,Bailey,Whiskey\r\n" + 
				"Christina;Davenport;111;Nuremberg;9565;F;Rocket,Cody,Remy\r\n" + 
				"Dr. Finn;Warner;125;Zagreb;0;M;\r\n" + 
				"Gregory;Crawford;97;Cluj-Napoca;0;M;Rudy,Ziggy,Harley,Luke,Finn\r\n" + 
				"Everett;Duke;10;Málaga;0;M;Bo,Teddy,Oliver,Rocket,Joey,Tucker\r\n" + 
				"Talon;Nolan;85;Brno;0;M;Ollie,Watson,Harley,Echo,Oreo,Gus\r\n" + 
				"Calvin;Ramirez;112;Karlsruhe;5652;M;Chip\r\n" + 
				"Aubree;Rocha;31;Helsinki;0;F;Bruno,Simba,Bandit,Diesel,Copper,Tank\r\n" + 
				"Dr. Molly;Camacho;135;Bilbao;9518;F;Ace,Odie,Buddy,Walter,Loki\r\n" + 
				"Chance;Porter;87;Poznań;3461;M;Prince,Luke,Whiskey\r\n" + 
				"Paisleigh;Webster;130;Zagreb;6065;F;Kobe,Murphy,Rocco,Rocco,Luke,Loki\r\n" + 
				"Haley;Marquez;119;Poznań;154;F;Prince,Charlie\r\n" + 
				"Damon;Palacios;50;Antwerp;8286;M;\r\n" + 
				"Miriam;Yang;83;Düsseldorf;1018;F;Ranger\r\n" + 
				"Esther;Ballard;90;Lisbon;9258;F;Zeke,Oakley,Echo,Baxter,Beau\r\n" + 
				"Blaire;Stephens;93;Vilnius;633;F;Baxter,Bo,Oliver,Gus,Bruno,Luke\r\n" + 
				"Dr. Lorenzo;Walsh;13;Frankfurt am Main;1109;M;Odie,Jack,Copper\r\n" + 
				"Elliot;George;129;Seville;0;F;Benny,Miles,Rambo,Hank,Dozer,Cash\r\n" + 
				"Dr. Christopher;Livingston;61;Frankfurt am Main;9729;M;Cody,Bubba,Theo,Watson,Prince\r\n" + 
				"Boden;Fowler;49;Varna;8278;M;Ruger,Gunner,Miles,Simba\r\n" + 
				"Bristol;Shah;27;Mannheim;0;F;Remi\r\n" + 
				"Aitana;Ryan;126;Mannheim;0;F;Ace,Levi,Gucci,Levi\r\n" + 
				"King;Calderon;52;Valmiera;9126;M;Rambo\r\n" + 
				"Dominick;Calhoun;59;Zagreb;6186;M;Bruce\r\n" + 
				"Elias;Stanley;100;Frankfurt am Main;6225;M;Cooper\r\n" + 
				"Amos;Mendoza;81;Helsinki;7367;M;Ranger,Ryder\r\n" + 
				"Brooklyn;Dickson;89;Dublin;5861;F;Zeus,Dozer,Rocket,Riley,Diesel\r\n" + 
				"Cullen;Atkinson;136;Vienna;787;M;Titan,Bruce\r\n" + 
				"Avianna;Leblanc;22;Florence;4578;F;Watson,Rocco,Bailey,Kylo,Arlo,Fluffy\r\n" + 
				"Remy;Schmidt;110;Alicante;0;M;Gunner,Fluffy\r\n" + 
				"Thiago;Kane;45;Catania;7793;M;Jackson,Arlo,Ryder,Atlas,Harley\r\n" + 
				"Landen;Martin;17;Florence;4921;M;Bentley,Titan,Kobe,Gucci,Fluffy\r\n" + 
				"Kinsley;Chapman;81;Copenhagen;2777;F;Porter,Ollie,Ryder,Jack\r\n" + 
				"Aaliyah;Rowe;79;The Hague;1819;F;\r\n" + 
				"Dr. Orlando;Lugo;19;Riga;0;M;\r\n" + 
				"Cassius;Good;78;Rotterdam;0;M;Rambo,Charlie,Whiskey\r\n" + 
				"Florence;Melton;83;Nantes;9249;F;Miles,Bentley\r\n" + 
				"Zayden;Lucas;28;The Hague;0;M;Charlie,Theo,Leo\r\n" + 
				"Alessia;Klein;133;Bydgoszcz;0;F;\r\n" + 
				"Malani;Montes;96;Genoa;7454;F;Romeo\r\n" + 
				"Allison;Villarreal;44;Zaragoza;0;F;Kylo\r\n" + 
				"Sophia;Atkinson;85;Gothenburg;485;F;Chester,Mac,Odie\r\n" + 
				"Gavin;Hubbard;50;Galați;2120;M;Coco,Tank,Otis,Murphy\r\n" + 
				"Kyleigh;Hail;79;Murcia;6991;F;Koda,Bruno,Otis,Ruger,Rudy\r\n" + 
				"Paisleigh;Swanson;96;Sintra;2002;F;Otis,Samson,Baxter,Jack,Blue,Gucci\r\n" + 
				"Warren;Hoover;98;Timișoara;9647;M;Duke,Oreo,Bandit,Romeo,Rusty\r\n" + 
				"Harlee;Kennedy;19;Varna;0;F;Rambo,Maverick\r\n" + 
				"Deandre;Stuart;87;Madrid;4934;M;Maverick,Ranger,Remi,Bailey,Ozzy\r\n" + 
				"Mylo;Farley;43;Rīga;0;M;Remy,Benji\r\n" + 
				"Stephanie;Simon;90;Bari;8456;F;Jake\r\n" + 
				"Rose;Livingston;45;Valmiera;6394;F;Murphy,Cooper,Rusty,Hank,Winston\r\n" + 
				"Dr. Kelvin;Barnes;98;Zagreb;3279;M;Duke,Rocket,Ranger,Cooper,Fluffy,Winston\r\n" + 
				"Luisa;Bowen;67;Brno;0;F;Oscar,Ace,Zeus,Riley\r\n" + 
				"Grant;Goodwin;78;Bilbao;3843;M;\r\n" + 
				"Tanner;Carr;37;Catania;5047;M;Loki\r\n" + 
				"Emely;Ali;42;Frankfurt am Main;5117;F;Ziggy,Ace,Ruger,Ruger,Ruger\r\n" + 
				"Clyde;Vu;27;Iași;2026;M;Titan,Riley,Walter\r\n" + 
				"Matthew;Conway;76;Valencia;5349;M;\r\n" + 
				"Axel;Schwartz;133;Riga;4273;M;Odie,Rocket,Whiskey,Finn\r\n" + 
				"Gabrielle;Frost;12;Budapest;3687;F;Archie\r\n" + 
				"Bobby;Mann;99;Dortmund;3846;M;Baxter,Levi\r\n" + 
				"Meghan;Ray;47;Riga;8101;F;Leo\r\n" + 
				"Khaleesi;Stanton;37;Lisbon;9147;F;Tank,Gucci,Zeus,Coco\r\n" + 
				"Titus;Moreno;53;Nuremberg;8139;M;\r\n" + 
				"Capri;Guerra;115;Budapest;852;F;Scout,Henry,Dexter,Atlas,Bowie\r\n" + 
				"Adalee;Manning;126;Lyon;4989;F;Archie,Rudy,Jasper,Odin\r\n" + 
				"Jason;Pruitt;113;Mannheim;2844;M;Peanut\r\n" + 
				"Ellis;Stein;84;Mannheim;1132;M;Odin,Rudy,Scout,Leo\r\n" + 
				"Aliza;Hill;122;Kraków;6674;F;Oakley,Benny\r\n" + 
				"Victoria;Mcfarland;71;Warsaw;0;F;\r\n" + 
				"Alexa;Mckenzie;120;Łódź;8459;F;Benny\r\n" + 
				"Erick;Bennett;91;Antwerp;9613;M;Cash\r\n" + 
				"Milena;Thornton;115;Hanover;3901;F;Lucky,Odin,Miles\r\n" + 
				"Lola;Cano;90;Hamburg;8657;F;\r\n" + 
				"Cayson;Andersen;18;Lyon;7879;M;Moose,Samson,Titan\r\n" + 
				"Kaydence;Yates;110;Łódź;7735;F;Atlas,Simba,Chester,Jake,Coco,Jack\r\n" + 
				"Melissa;Stein;103;Vila Nova de Gaia;7243;F;Whiskey,Bruno,Rambo,Odie\r\n" + 
				"Anders;Moses;52;Berlin;7128;M;Gus,Benji,Max,Kylo,Bo,Watson\r\n" + 
				"Dr. Zaria;Hutchinson;40;Bilbao;7245;F;Dexter,Sarge,Leo,Axel,Coco\r\n" + 
				"Sonny;Kelley;123;Sintra;0;M;Otis,Loki\r\n" + 
				"Landry;Moreno;113;Thessaloniki;4078;M;Copper,Charlie\r\n" + 
				"Ibrahim;Anderson;75;Milan;8035;M;\r\n" + 
				"Emilio;Brennan;138;Sintra;2335;M;\r\n" + 
				"Mariah;Fuentes;55;Bologna;0;F;Coco,Cooper,Atlas,Benji\r\n" + 
				"Nicolas;Charles;34;Barcelona;7244;M;Ranger\r\n" + 
				"Dr. Jemma;Wagner;37;Berlin;6527;F;Lincoln,Boomer,Joey\r\n" + 
				"Ezra;Manning;69;Plovdiv;320;F;Bandit,Chip,Oscar,Rambo,Prince,Rex\r\n" + 
				"Ahmir;Davidson;124;Duisburg;1287;M;Ruger,Chase,Arlo,Blaze,Blaze\r\n" + 
				"Vada;Bowman;116;Sintra;0;F;Otis,Otis\r\n" + 
				"Drew;Thornton;83;Bochum;3662;M;Bo,Sam\r\n" + 
				"Elliot;Zimmerman;84;Bratislava;2763;M;Romeo,Bubba,Moose\r\n" + 
				"Tobias;Richardson;18;Paris;0;M;Tyson,Cooper,Bruce,Porter\r\n" + 
				"Noah;Costa;29;Rome;0;F;Arlo,Murphy,Cooper,Marley,Apollo,Rudy\r\n" + 
				"Jensen;Gardner;135;Antwerp;2520;M;Walter,Charlie\r\n" + 
				"Dr. Jaxxon;Mullen;113;Bucharest;147;M;Rocket\r\n" + 
				"Oaklee;Medina;37;Stuttgart;0;F;\r\n" + 
				"Gabrielle;Leon;110;Timișoara;8136;F;\r\n" + 
				"Dr. Winston;Haley;50;Valencia;0;M;Lincoln,Gucci,Hank,Whiskey\r\n" + 
				"Maggie;Yates;102;Lisbon;8214;F;\r\n" + 
				"Emery;Miller;80;Cluj-Napoca;7069;F;Prince,Duke\r\n" + 
				"Samantha;Suarez;42;Gothenburg;3921;F;Mac,Coco,Peanut,Diesel\r\n" + 
				"Vera;Blackwell;15;Nice;0;F;Gus\r\n" + 
				"Jamal;Parra;121;Vilnius;2887;M;Apollo,Rocco,Chase,Zeke,Axel\r\n" + 
				"Viviana;Phelps;104;Vienna;1416;F;Bubba,Odin,Hank,Oliver,George,Simba\r\n" + 
				"Titan;Potts;92;Poznań;1135;M;\r\n" + 
				"Haisley;Gates;75;Palma de Mallorca;5548;F;Levi,Bruno,Zeke,Dozer,Boomer,Bear\r\n" + 
				"Sylvie;Zavala;65;Leipzig;0;F;Rex,Ranger,Miles\r\n" + 
				"Lorelei;Lara;95;Marseille;2300;F;Jake,Tank\r\n" + 
				"Dr. Denver;Henry;38;Thessaloniki;4822;M;Rex,Peanut\r\n" + 
				"Dr. Peyton;Aguilar;128;Aarhus;0;F;Finn,Oakley,Benny,Coco,Beau\r\n" + 
				"Dr. Aislinn;Jaramillo;40;Palma de Mallorca;4116;F;Loki,Rocky\r\n" + 
				"Axton;Hanna;129;Szczecin;0;M;Ranger,Romeo,Riley,Koda,Buster,Leo\r\n" + 
				"Maia;Patterson;33;Córdoba;6805;F;Fluffy\r\n" + 
				"Terrance;Shah;98;Rotterdam;0;M;Ziggy,Cody\r\n" + 
				"Arianna;Good;68;Rīga;0;F;Archie,Gizmo\r\n" + 
				"Zayden;Wilkinson;34;Amsterdam;7372;M;Rambo\r\n" + 
				"Bentley;Flores;113;Catania;0;M;\r\n" + 
				"Colter;Delarosa;72;Bydgoszcz;1649;M;\r\n" + 
				"Emma;Lewis;134;Murcia;1656;F;Simba,George,Archie,Otis\r\n" + 
				"Lilian;Spencer;128;Wuppertal;5130;F;Toby\r\n" + 
				"Koa;Mcmahon;111;Las Palmas;9942;M;Fluffy,Gizmo,Benji,Rusty,Remi\r\n" + 
				"Harley;Burch;27;Plovdiv;0;M;Winston\r\n" + 
				"Gregory;Brandt;96;Thessaloniki;6206;M;Tucker,Axel,Whiskey,Gucci,Benji\r\n" + 
				"Adley;Weber;77;Athens;0;F;Leo,Oscar,Charlie,Bowie\r\n" + 
				"Silas;Swanson;61;Gothenburg;0;M;Porter,Chip\r\n" + 
				"Hayden;Hendrix;123;The Hague;3373;M;Samson,Echo\r\n" + 
				"Killian;Holloway;104;Sofia;679;M;Sarge,Diesel,Watson\r\n" + 
				"Alejandra;Dunlap;133;Bonn;0;F;\r\n" + 
				"Hunter;Snow;49;Stuttgart;0;F;Beau,Archie,Maverick,Blue,Dexter,Ruger\r\n" + 
				"Jazmine;Castillo;42;Lublin;5822;F;Joey,Shadow,Luke,Mac\r\n" + 
				"Maximiliano;Marquez;102;Bologna;6966;M;Chester,Maverick,Ruger,Fluffy,Scout,Kylo\r\n" + 
				"Madalynn;Castillo;75;Rome;6764;F;Whiskey,Duke,Bailey,Fluffy\r\n" + 
				"Nash;Dawson;53;Rīga;0;M;\r\n" + 
				"Alistair;Vu;122;Varna;8299;M;Odie,Copper,Sarge,Theo,Gunner,Loki\r\n" + 
				"Shiloh;Huff;59;Stuttgart;0;M;Gus,Rocket,Bowie,Ryder\r\n" + 
				"Ariyah;Torres;128;Leipzig;0;F;Bentley,Miles,Teddy,Benny,Jake\r\n" + 
				"Aubriella;Bridges;74;The Hague;0;F;Charlie,Kylo,George,Loki,Benji,Milo\r\n" + 
				"Dr. Lennon;Cantu;111;Nuremberg;423;M;George,Archie,Prince\r\n" + 
				"Carmen;Joseph;101;Galați;0;F;Sam,Bo,Maverick,Wally\r\n" + 
				"Karsyn;Maldonado;22;Budapest;9616;F;Bubba,Rocco,Dexter,Buddy\r\n" + 
				"Emmie;Hubbard;82;Dortmund;5249;F;Bear,King,Prince,Murphy\r\n" + 
				"Carlos;Duke;130;Palermo;860;M;Samson,Ruger,Charlie,Kylo\r\n" + 
				"Jonas;Navarro;58;Münster;0;M;Rex,Chester,Oreo\r\n" + 
				"Iker;Paul;37;Valencia;406;M;Chester,King,Cody,Jackson\r\n" + 
				"Dr. Idris;Dickson;126;Brno;0;M;Milo\r\n" + 
				"Douglas;Colón;109;Wrocław;1729;M;Gus,Buster,Rocco,Lincoln\r\n" + 
				"Olivia;Sweeney;128;Bilbao;9809;F;Benny\r\n" + 
				"Samira;Jaramillo;108;Bydgoszcz;0;F;Romeo,Jackson,Koda,Rocky,Finn,Bowie\r\n" + 
				"Angie;Norman;116;Toulouse;1379;F;Benji,Diesel,Tucker,Ace,Blaze,Gucci\r\n" + 
				"Etta;Yates;112;Palma de Mallorca;2064;F;George,Lincoln,Whiskey,Simba\r\n" + 
				"Rivka;Patterson;27;Mannheim;0;F;Tucker\r\n" + 
				"Solomon;Mejia;41;Berlin;8105;M;Moose,Mac,Boomer,Max,Ranger\r\n" + 
				"Kallie;Liu;45;Bydgoszcz;0;F;\r\n" + 
				"Zoe;Stanley;21;Galați;0;F;Wally\r\n" + 
				"Aries;Gonzales;126;Palermo;8482;M;Whiskey,Mac\r\n" + 
				"Janiyah;Conway;60;Naples;7438;F;Benji,Mac,Luke\r\n" + 
				"Rhett;Robertson;64;Bratislava;0;M;Bowie,King,Chase,Wally\r\n" + 
				"Rebekah;Hess;73;Szczecin;898;F;Bentley,Bailey,Bruno,Rusty\r\n" + 
				"Crystal;Stevenson;87;Rīga;538;F;Duke,Gus,Harley\r\n" + 
				"Abdullah;Jackson;69;Szczecin;360;M;\r\n" + 
				"Reina;Powell;62;Toulouse;7884;F;Luke\r\n" + 
				"Noor;Nielsen;112;Stockholm;0;F;Jack,Blaze,Odie\r\n" + 
				"Colin;Barrett;71;Gothenburg;5016;M;Blue,Lucky,Riley,Louie,Gunner,Remi\r\n" + 
				"Bryan;Adams;28;Mannheim;0;M;Arlo,Harry,Shadow,Ryder\r\n" + 
				"Myles;Carlson;67;Düsseldorf;9957;M;\r\n" + 
				"George;Burnett;15;Naples;0;M;Blaze,Sam\r\n" + 
				"Case;Rivers;111;Wuppertal;0;M;Otis,Archie,Teddy,Charlie,Echo\r\n" + 
				"Corbin;Riley;61;Gdańsk;0;M;Ozzy,Leo,Rudy,Teddy\r\n" + 
				"Abram;Raymond;79;Plovdiv;0;M;Apollo,Bear,Blue\r\n" + 
				"Amayah;Bentley;138;Bydgoszcz;0;F;Koda,Rocco,Oakley,Baxter,Whiskey\r\n" + 
				"Tinsley;Wood;115;Rotterdam;8888;F;Chase,Arlo,Odin\r\n" + 
				"Lyanna;Arias;108;Poznań;7484;F;Bear,Ollie\r\n" + 
				"Callum;Sanchez;65;Tallinn;717;M;Coco,Harley,Archie,Dexter,Beau\r\n" + 
				"Dr. Coen;Dougherty;117;Dublin;3619;M;Arlo,Bentley\r\n" + 
				"Angela;Harrell;19;Berlin;0;F;Moose,Bruno\r\n" + 
				"Lainey;Craig;94;Rotterdam;1652;F;Kobe,Arlo,George,Axel,Cooper\r\n" + 
				"Baylor;Rodriguez;29;Catania;7038;M;Diesel,Atlas,Chip,Louie,Echo,Atlas\r\n" + 
				"Coen;Singleton;48;Essen;0;M;Jack,Fluffy\r\n" + 
				"Mekhi;Wyatt;10;Utrecht;3820;M;\r\n" + 
				"Dr. Teagan;Thompson;119;Budapest;0;F;\r\n" + 
				"Averie;Sutton;26;Marseille;6035;F;Joey,Ryder,Mac,Scout,Harry,Loki\r\n" + 
				"Tony;Howe;28;Nuremberg;9491;M;Murphy,Jackson\r\n" + 
				"Sienna;Huber;137;Athens;7822;F;Rocket,Henry,Gus,Remy,Rocky\r\n" + 
				"Zaniyah;Gibbs;27;Cluj-Napoca;0;F;Cash,Echo,Tucker,Maverick,Zeus,Zeus\r\n" + 
				"Zachary;Dyer;87;Kraków;0;M;\r\n" + 
				"Cedric;Bartlett;133;Bari;0;M;Rocco,Chester,Otis,Rocky\r\n" + 
				"Jesus;Trejo;58;Bilbao;8997;M;Rusty,Odie,Cooper\r\n" + 
				"James;Pacheco;67;Thessaloniki;0;M;Copper,Rusty,Diesel\r\n" + 
				"Jade;Conway;57;Amsterdam;6871;F;Romeo,Simba,Rex,Diesel,Lucky\r\n" + 
				"Skylar;Choi;62;Paris;0;F;Simba,Fluffy,Bentley,Chester,Bubba,Whiskey\r\n" + 
				"Aubriella;Cook;22;The Hague;2449;F;Toby,Arlo\r\n" + 
				"Michaela;Freeman;11;Wuppertal;0;F;Copper,Bentley,Coco,Oakley\r\n" + 
				"Sydney;Glass;94;Valencia;0;F;Echo,King,Blaze,Rex,Moose,Henry\r\n" + 
				"Joanna;Stevenson;25;Utrecht;0;F;Cooper,Copper,Kylo\r\n" + 
				"Killian;Dickson;131;Nantes;0;M;Remy\r\n" + 
				"Niklaus;Ayers;38;Copenhagen;0;M;Tyson\r\n" + 
				"Zendaya;Murphy;123;Constanța;2603;F;Bruce,Odin,Cooper\r\n" + 
				"Dr. Samir;Peters;48;Riga;4946;M;Blue,Copper,Marley\r\n" + 
				"Cesar;Sweeney;93;Cluj-Napoca;0;M;Oreo,Benny,Murphy,Kobe,Blue,Toby\r\n" + 
				"Dr. Bria;Serrano;121;Münster;4847;F;\r\n" + 
				"Ashlyn;Carey;126;Vienna;708;F;Harry,Bubba,Sarge,Sam,Ozzy,Sam\r\n" + 
				"Ansley;Thompson;102;Zaragoza;5227;F;Sam,Hank,Winston,Teddy,Tucker,Bentley\r\n" + 
				"Dr. Trey;Robertson;75;Dresden;4540;M;Kobe\r\n" + 
				"Veda;Gonzales;89;Cologne;0;F;Arlo,Rex\r\n" + 
				"Nelson;Navarro;84;Alicante;0;M;Lucky,Walter,Ziggy,Titan,Bear,Finn\r\n" + 
				"Kenzo;Christian;40;Bielefeld;2863;M;Blue,Rocky,Jax,Fluffy\r\n" + 
				"Mackenzie;Dean;16;Malmö;3529;F;Rudy,Cash\r\n" + 
				"Harlee;Green;67;Prague;0;F;Miles\r\n" + 
				"Gabriella;Peterson;18;Munich;0;F;Zeus,Romeo\r\n" + 
				"Ila;Golden;47;Palma de Mallorca;6393;F;\r\n" + 
				"Yasmin;Vu;12;Catania;0;F;\r\n" + 
				"Christian;Camacho;24;Dresden;9310;M;\r\n" + 
				"Fernando;Roy;11;Mannheim;9521;M;Finn,Zeus,Thor,Hank,Harley,Bandit\r\n" + 
				"Shiloh;Hines;138;Dresden;6372;M;Sarge,Jax,Buddy\r\n" + 
				"Chloe;Nava;64;Antwerp;0;F;Otis,Winston\r\n" + 
				"Callahan;Mann;53;Sigulda;0;M;\r\n" + 
				"Greta;Burton;82;Brno;1772;F;Riley\r\n" + 
				"Dr. Bridget;Brady;37;Prague;2715;F;Jax\r\n" + 
				"Ahmed;Cline;131;Naples;0;M;Louie,Otis,Riley,Bruno\r\n" + 
				"Kamden;Landry;112;Lisbon;5733;M;Jake,Axel,Loki\r\n" + 
				"Madisyn;Friedman;60;Essen;0;F;Benny\r\n" + 
				"Saige;Dyer;12;Rīga;8053;F;\r\n" + 
				"Aubrie;Muñoz;97;Warsaw;9046;F;Ozzy,Gucci,Teddy\r\n" + 
				"Evangeline;Beltran;39;Łódź;3089;F;Odin,Finn,Joey,Tank\r\n" + 
				"Kensley;Ponce;102;Bremen;8079;F;Maverick,Copper,Levi,Ryder\r\n" + 
				"Annika;Pope;115;Galați;0;F;\r\n" + 
				"Maia;Jackson;18;Bielefeld;7938;F;\r\n" + 
				"Raylan;Friedman;88;Vienna;2117;M;Atlas\r\n" + 
				"Averi;Rasmussen;99;Bochum;4599;F;\r\n" + 
				"Chana;Dominguez;37;Cluj-Napoca;0;F;Bruno,Rusty,Lucky,Gucci\r\n" + 
				"Tripp;Bravo;131;Poznań;1486;M;Murphy,Lucky\r\n" + 
				"Dr. Kaleb;Morris;59;Nice;0;M;Rex\r\n" + 
				"Aspyn;Kelley;58;Córdoba;4307;F;Jackson,Coco,Harley,Chip,Finn,Gizmo\r\n" + 
				"Sam;Garrett;68;Stockholm;0;M;Henry,Bruno,Bubba\r\n" + 
				"Brycen;Fuentes;16;Bonn;211;M;\r\n" + 
				"Etta;Stewart;39;Lublin;9544;F;\r\n" + 
				"Marcus;Donaldson;122;Gdańsk;0;M;Scout\r\n" + 
				"Liberty;Muñoz;36;Sintra;0;F;Echo,Ruger,Zeke,Hank,Watson\r\n" + 
				"Johan;Gregory;73;Thessaloniki;0;M;Diesel\r\n" + 
				"Lee;Navarro;124;Marseille;0;M;\r\n" + 
				"Nala;Dalton;121;Gothenburg;515;F;\r\n" + 
				"Blaze;Diaz;31;Warsaw;0;M;Oliver,Blaze,Lincoln,Mac\r\n" + 
				"Emani;Zavala;57;Málaga;7460;F;Levi,Toby,Moose,Bo,Boomer,Murphy\r\n" + 
				"Mitchell;Larsen;27;Paris;5131;M;Atlas,Bo,Bailey,Archie\r\n" + 
				"Cecelia;Cortéz;103;Düsseldorf;1735;F;Tyson,Jasper\r\n" + 
				"Dr. Amias;Bullock;32;Prague;0;M;\r\n" + 
				"Jamal;Holt;17;Antwerp;0;M;Dozer,Ziggy,Odin,Ryder\r\n" + 
				"Sage;Walton;112;Nuremberg;0;F;Odin,Remy,Tyson,Rocco,Boomer\r\n" + 
				"Jonathan;Sosa;77;Riga;9041;M;Odin,Cody,Louie,Louie,Jack,Ace\r\n" + 
				"Nylah;Cortéz;102;Munich;7884;F;Prince,Samson,Shadow\r\n" + 
				"Kalel;Barber;106;Malmö;303;M;Max,Bandit,Tank,Oakley\r\n" + 
				"Mae;Silva;110;Vilnius;8933;F;Max,Thor,Loki,Fluffy\r\n" + 
				"Annabella;Lynn;38;Wuppertal;625;F;\r\n" + 
				"Gia;Berry;59;Lisbon;5143;F;Blue,Gucci\r\n" + 
				"August;Zuniga;56;Iași;5976;M;Riley\r\n" + 
				"Reese;Edwards;102;Helsinki;3154;M;\r\n" + 
				"Gracelynn;Lin;95;Nuremberg;8560;F;Bowie\r\n" + 
				"Amira;Mckay;86;Bochum;7945;F;Levi,Oscar,King,Charlie,Bentley,Ruger\r\n" + 
				"Treasure;Moran;108;Łódź;2239;F;Rusty,Rocky,Odie,Baxter,Chip\r\n" + 
				"Alexander;Ochoa;34;Toulouse;7264;M;Diesel,Cody,Axel,Jasper,Prince\r\n" + 
				"Keith;Frye;113;Córdoba;7485;M;Watson,Toby,Mac,Prince,Odie\r\n" + 
				"Katie;Nguyen;69;Poznań;389;F;Lincoln,Dexter,Diesel,Teddy,Toby,Thor\r\n" + 
				"Phillip;Mckenzie;67;Dublin;4976;M;Diesel,Atlas,Simba,Otis,Cody,Teddy\r\n" + 
				"Melvin;Portillo;41;Murcia;0;M;King,Jackson,Rambo,Zeus,Beau\r\n" + 
				"Destiny;Barr;71;Riga;1323;F;Lucky,Hank\r\n" + 
				"Zoya;Nicholson;47;Madrid;7871;F;Teddy,Cody,Rusty,Ollie,Walter\r\n" + 
				"Noah;Benton;24;Duisburg;0;M;Harley,Milo,Joey,Rocky,Bruno\r\n" + 
				"Eli;Chandler;119;Dublin;5020;M;Fluffy,Romeo,Chase,Bruce,Leo,Bandit\r\n" + 
				"Kareem;Camacho;71;Sofia;2144;M;Buster,Hank,Ranger,Bandit,Archie\r\n" + 
				"Anahi;Giles;139;Wuppertal;9973;F;Coco,Maverick\r\n" + 
				"Jayden;Vance;103;Florence;0;M;\r\n" + 
				"Sam;Spears;55;Berlin;0;M;Blue,Bubba,Rambo\r\n" + 
				"Lana;Bell;47;Vilnius;4598;F;Otis,Ace,Baxter,Harley,Rocket,Harley\r\n" + 
				"Alan;Quintero;78;Málaga;7372;M;Gizmo,Dexter,Cody,Rex\r\n" + 
				"Dr. Alvin;Franco;64;Hanover;2030;M;Harley\r\n" + 
				"Khalid;Howard;80;Szczecin;9240;M;Sam\r\n" + 
				"Natasha;Woods;96;Paris;9854;F;Rusty,Romeo,Ollie,Scout,Wally,Mac\r\n" + 
				"Bethany;Peck;71;Catania;2081;F;Rusty,Duke,Blue,Shadow,Thor\r\n" + 
				"Elyse;Glenn;24;Hanover;2820;F;Benny,Watson,Odie,Jake\r\n" + 
				"Gracelyn;Lloyd;19;Kraków;0;F;\r\n" + 
				"Emberly;Douglas;117;Zagreb;4326;F;Titan,Rocco,Arlo\r\n" + 
				"Valentin;Greene;67;Vilnius;521;M;Blaze,Echo,Kobe,Oreo,Chester,Moose\r\n" + 
				"Raphael;Roth;97;Vilnius;5431;M;Thor,Romeo,Apollo\r\n" + 
				"Wynter;Murillo;130;Sintra;0;F;\r\n" + 
				"Dion;Marquez;53;Gothenburg;3404;M;Beau,Charlie\r\n" + 
				"Austin;Hickman;32;Gothenburg;0;M;Duke,Cooper,Blue,Mac\r\n" + 
				"Dr. Avi;Long;39;Galați;871;M;Marley,Bear,Apollo\r\n" + 
				"Elsa;Potts;63;Sigulda;1344;F;\r\n" + 
				"Kendra;Kemp;37;Prague;118;F;Bruno\r\n" + 
				"Holly;Beil;36;Zagreb;0;F;Axel,Harry,Chip,Jackson,Rusty\r\n" + 
				"Marcelo;Duffy;52;Bremen;0;M;Lincoln\r\n" + 
				"Dr. Casey;Barr;110;Vila Nova de Gaia;0;M;\r\n" + 
				"Brody;Barajas;24;Lublin;8081;M;Arlo,Shadow,Rex,Jax,Benny\r\n" + 
				"Keira;Rodgers;138;Nice;0;F;Kobe,Sam,Baxter,Luke,Marley,Jax\r\n" + 
				"Chandler;Mercado;117;Nuremberg;9227;F;Murphy,Teddy,Mac,Cooper,Duke,Jack\r\n" + 
				"Aaliyah;Galvan;66;Galați;0;F;Atlas,Watson,Duke,Copper,Cooper,Cooper\r\n" + 
				"Walker;Hurst;124;Warsaw;778;M;Tank,Diesel,Scout,Maverick,Odin\r\n" + 
				"Zhuri;Rich;61;Dresden;1145;F;Levi,Simba,Kylo\r\n" + 
				"Dr. Zendaya;Cervantes;71;Düsseldorf;184;F;Otis,Thor,Shadow\r\n" + 
				"Olive;Madden;13;Duisburg;8008;F;Whiskey,Watson,Watson,Echo,Zeus\r\n" + 
				"Alison;Allison;65;Munich;6633;F;Fluffy,Bear\r\n" + 
				"Arjun;Richard;97;Iași;0;M;\r\n" + 
				"Eliana;Ferguson;89;Budapest;9514;F;Ryder,Teddy,Gucci,Ace,Rocket\r\n" + 
				"Chaya;Cisneros;75;Cluj-Napoca;0;F;Ollie\r\n" + 
				"Jair;Greer;106;Malmö;6777;M;Chip,Samson,Finn,Oreo,Rambo\r\n" + 
				"Autumn;Mccann;67;Bonn;0;F;\r\n" + 
				"Jude;Roman;42;Copenhagen;0;M;Prince,Rocket,Samson\r\n" + 
				"Siena;Hanson;57;The Hague;0;F;\r\n" + 
				"Grey;Holt;24;Prague;0;M;Gucci,Titan,Oscar,Jack\r\n" + 
				"Elsie;Sampson;64;Rīga;4413;F;Maverick,Gunner,Gucci,Rusty,Thor\r\n" + 
				"Roger;Hayes;74;Milan;7543;M;Bruce\r\n" + 
				"Milan;Vance;18;Bratislava;8469;F;Bear,Arlo,Oliver,Dozer\r\n" + 
				"Kassidy;Maldonado;77;Málaga;0;F;\r\n" + 
				"Aspyn;Blair;65;Brno;3256;F;Gunner,Oreo,Rocco,Benny,Oliver,Porter\r\n" + 
				"Emerson;Harrell;35;Florence;5251;F;Lucky,Tucker\r\n" + 
				"Valentina;Williams;130;Paris;9133;F;Porter,Dexter,Leo,Tank,Kylo\r\n" + 
				"Madalyn;Washington;135;Paris;0;F;Mac,Chase,Max\r\n" + 
				"Jimmy;Stout;110;Thessaloniki;8269;M;\r\n" + 
				"Remington;Black;109;Dublin;3653;M;Dexter,Baxter\r\n" + 
				"Noelle;Andrade;122;Genoa;0;F;\r\n" + 
				"Dr. Averi;Blake;40;Palermo;8220;F;Fluffy,Coco,Blaze,Shadow,Dozer\r\n" + 
				"Alena;Meyers;55;Lublin;3041;F;Ollie,Bentley,Bear,Blue,Cody,Rocco\r\n" + 
				"Elisa;Tang;69;Valencia;0;F;Whiskey,Harley,Axel,Tucker,Whiskey,Bear\r\n" + 
				"Julissa;Bryant;133;Hanover;0;F;Arlo,Whiskey,Chester,Blue\r\n" + 
				"Ensley;Person;97;Munich;2093;F;Bentley,Beau\r\n" + 
				"Dallas;Boone;51;Budapest;0;F;\r\n" + 
				"Corbin;Baldwin;11;Paris;8473;M;\r\n" + 
				"Lillian;Haley;59;Utrecht;5472;F;Archie,Romeo,Bear,Simba,Remy,Lucky\r\n" + 
				"Zora;Sandoval;130;Plovdiv;0;F;Bailey,Atlas,Peanut,Remi\r\n" + 
				"Clementine;Villanueva;16;Turin;5271;F;Lucky,Benny,Luke,Ranger\r\n" + 
				"Kataleya;Rangel;120;Valencia;7771;F;Loki,Rusty,Leo\r\n" + 
				"Marcelo;Higgins;49;Zaragoza;0;M;Tucker,Milo,Rusty,Jack\r\n" + 
				"Dr. Brooklynn;Hanson;122;Bremen;4759;F;Wally,Atlas,Titan,Loki,Koda,Jake\r\n" + 
				"Jamir;Pennington;24;Kraków;1035;M;Riley,Bandit,Teddy,Rex,Rocco\r\n" + 
				"Rebecca;Alexander;11;Szczecin;9037;F;Benji\r\n" + 
				"Freya;Harmon;28;Seville;3030;F;Wally,Ruger\r\n" + 
				"Dr. Zain;Gross;12;Copenhagen;0;M;Bentley,Blaze,Loki\r\n" + 
				"Alani;Baldwin;30;Bydgoszcz;4502;F;Dozer,Chase,Ollie,Rocco,Harley,Tyson\r\n" + 
				"Dr. Rebecca;Coffey;46;Bochum;7049;F;Gus,Buster,Blaze,Boomer,Diesel\r\n" + 
				"Dominick;Moore;128;Sintra;5335;M;Toby,Chase\r\n" + 
				"Tripp;Mendez;43;Rīga;3781;M;\r\n" + 
				"Franklin;Fernandez;71;Brno;2493;M;\r\n" + 
				"Ivory;Knapp;31;Las Palmas;3223;F;Tyson,Otis,Tucker,Peanut,Toby\r\n" + 
				"Logan;Campos;34;Sofia;2202;M;Finn,Jax,Tucker,Leo\r\n" + 
				"Yamileth;Schmitt;21;Bilbao;0;F;Baxter,King,Sam,Joey\r\n" + 
				"Nancy;Warner;107;Wrocław;4117;F;Archie,Rocky,Beau,Bo\r\n" + 
				"Karen;King;40;Mannheim;3283;F;Walter,Copper,Teddy,Loki\r\n" + 
				"Murphy;Carrillo;60;Palma de Mallorca;5308;M;Rudy,Gizmo\r\n" + 
				"Zara;Huff;90;Riga;7076;F;\r\n" + 
				"Sullivan;Sutton;48;Lublin;3151;M;Tank,Duke,Toby,Blaze\r\n" + 
				"Alayah;Lee;81;Valmiera;3322;F;Levi,Milo,Rocky\r\n" + 
				"Joel;Austin;118;Toulouse;4039;M;Coco,Rocky,Bear,Bandit,Simba\r\n" + 
				"Gemma;Waller;77;Bologna;5913;F;Prince,Murphy,Echo,Maverick,Kylo\r\n" + 
				"Davian;Meza;113;Tallinn;4949;M;Prince,Buddy,Max,Maverick\r\n" + 
				"Turner;Long;49;Bari;481;M;Thor,Mac,Romeo,Joey,Rudy,Toby\r\n" + 
				"Jaxtyn;Johnson;60;Seville;6541;M;Ranger,Wally,Sam,Dozer,Walter\r\n" + 
				"Holden;Warren;89;Wrocław;0;M;Tank,Tyson,Theo,Bear,Marley\r\n" + 
				"Bear;Howell;32;Nice;2623;M;\r\n" + 
				"Charlotte;Russell;65;Frankfurt am Main;0;F;Prince,Rambo,Tyson\r\n" + 
				"Gunner;Cochran;45;Rome;4540;M;Rusty,Levi,Shadow\r\n" + 
				"Anna;Powers;44;Aarhus;8428;F;Chip,Oreo,Chester,Lincoln,Koda\r\n" + 
				"Beckett;Eaton;122;Sofia;0;M;\r\n" + 
				"Dr. Emmalynn;Reid;134;Riga;222;F;Fluffy,Oreo,Zeke,Toby,Rudy\r\n" + 
				"Makai;Xiong;116;Rotterdam;5921;M;Beau,Rudy,Remi,Bentley,Henry\r\n" + 
				"Julian;Copeland;93;Hamburg;4084;M;Harley\r\n" + 
				"Dr. Abdullah;O’neal;63;Szczecin;9531;M;\r\n" + 
				"Dr. Madelyn;Landry;73;Córdoba;0;F;\r\n" + 
				"Sarai;Santana;11;Hamburg;0;F;Otis\r\n" + 
				"Rowan;Daniels;20;Cologne;1890;F;Marley,Remy,Zeus,Porter,Oliver\r\n" + 
				"Dr. Marco;Huang;23;Vila Nova de Gaia;5908;M;Bo,Cooper,Jake,Rocco,Scout\r\n" + 
				"Kyleigh;Sullivan;131;Tallinn;0;F;Beau,Lucky,Tank,Ozzy,Levi,Finn\r\n" + 
				"Finn;Love;117;Munich;2722;M;Fluffy,Luke\r\n" + 
				"Jayda;Freeman;104;Gothenburg;6076;F;Jackson,Harry,Buddy,Milo,Chester,Gizmo\r\n" + 
				"Kaylie;Salas;45;Poznań;0;F;Rocco,Gizmo,Ranger,Ziggy\r\n" + 
				"Amirah;Byrd;62;Constanța;9272;F;Benny\r\n" + 
				"Caden;Ramirez;115;Toulouse;0;M;Blue\r\n" + 
				"Oscar;Johnson;44;Naples;1387;M;Henry,Levi,Louie,Max,Gus\r\n" + 
				"Willie;Ortega;139;Stockholm;8797;M;Zeus,Rocket,Kobe,Sam\r\n" + 
				"Alvin;Vang;121;Florence;7930;M;Bruno,Chip\r\n" + 
				"Dr. Scarlett;Lawson;62;Timișoara;2569;F;Winston,Buster,Porter,Hank,Porter\r\n" + 
				"Aislinn;Jefferson;134;Leipzig;1194;F;Jasper,Walter,Ace\r\n" + 
				"Noel;Nava;119;Plovdiv;2039;M;\r\n" + 
				"Leilani;Gregory;17;Vienna;3261;F;Tank,Theo,George,Oreo,Odin,Rusty\r\n" + 
				"Atlas;Austin;72;Sigulda;9532;M;Oreo,Peanut\r\n" + 
				"Egypt;Atkinson;113;Bilbao;9209;F;Blue\r\n" + 
				"Brycen;Tran;28;Stuttgart;9580;M;\r\n" + 
				"Xander;Wilkerson;136;Vilnius;6574;M;Gucci,Toby,Blaze,Rocket\r\n" + 
				"Jadiel;Frank;28;Córdoba;8512;M;Theo,Simba,Porter,Tank,Benny\r\n" + 
				"Shepard;Dejesus;68;Riga;3620;M;Ozzy,Jasper,Oreo,Theo,Porter,Sam\r\n" + 
				"Yusuf;Krueger;36;Tallinn;2797;M;Toby,Boomer,Gucci,Benny\r\n" + 
				"Ximena;Rosario;52;Vila Nova de Gaia;0;F;Odie,Samson,Copper,Apollo,Simba,Finn\r\n" + 
				"Frankie;Cruz;45;Madrid;5724;M;Henry,Ace,Gucci,Kylo,Harley\r\n" + 
				"Dr. Nylah;Preston;31;Rīga;2679;F;Harry,Watson,Bear\r\n" + 
				"Graysen;Marin;18;Dublin;5026;M;\r\n" + 
				"Fletcher;Perkins;23;Wuppertal;313;M;Otis,Copper,Hank,Blue\r\n" + 
				"Mario;Burgess;36;Budapest;5348;M;Atlas,Gunner,Kobe\r\n" + 
				"Boden;Burnett;104;Gdańsk;0;M;\r\n" + 
				"Karter;Terry;85;Bari;0;M;\r\n" + 
				"Harris;Escobar;69;Palermo;0;M;Harry\r\n" + 
				"Dr. Joseph;Beltran;99;Hanover;0;M;Tucker,Thor\r\n" + 
				"Paulina;Cortes;47;Helsinki;6310;F;Boomer,Oreo,Simba,Rocco,Luke\r\n" + 
				"Juan;Steele;105;Bari;1581;M;Gucci,King,Porter,Baxter,Boomer,Jackson\r\n" + 
				"Bryan;Blackburn;107;Sigulda;5593;M;Kobe,Henry,Beau,Jax\r\n" + 
				"Elaina;Villegas;104;Malmö;2079;F;Peanut,Murphy,Cody,Odie,Apollo,Remi\r\n" + 
				"Addilyn;Stanton;98;Naples;9055;F;\r\n" + 
				"Elliot;Guevara;100;Berlin;6447;M;\r\n" + 
				"Camryn;Ayers;32;Florence;0;F;Axel,Teddy\r\n" + 
				"Moshe;Simmons;117;Cologne;0;M;Rusty,Charlie,Zeus,Oscar\r\n" + 
				"Valerie;Andrade;96;Lisbon;3800;F;Odie,Finn,Otis,Marley,Tank\r\n" + 
				"Millie;Watson;74;Gdańsk;948;F;\r\n" + 
				"Greyson;Gallagher;44;Bratislava;0;M;Dexter,Koda,Benny\r\n" + 
				"Dr. Enrique;Bates;124;Las Palmas;4459;M;Bo,Bo\r\n" + 
				"Baylor;Roman;56;Athens;0;M;Zeke\r\n" + 
				"Melvin;Cordova;96;Las Palmas;2800;M;Porter\r\n" + 
				"Fabian;Barron;74;Barcelona;1815;M;Ollie,Diesel,Ruger,Maverick,Odin\r\n" + 
				"Alfredo;Chandler;66;Amsterdam;0;M;Titan\r\n" + 
				"Sariyah;Mccormick;30;Dublin;8488;F;Benji,Louie,Chase\r\n" + 
				"Wesley;Best;89;Vila Nova de Gaia;6918;M;\r\n" + 
				"Dr. Adele;Cantu;75;Nice;5759;F;Miles\r\n" + 
				"Cody;Fletcher;96;Valencia;158;M;Rocket,Odin,Remi,Beau,Prince\r\n" + 
				"Everlee;Campbell;29;Palermo;0;F;Peanut,Blue,Remy,Samson\r\n" + 
				"Amanda;Ávila;13;Florence;1892;F;Koda,Tucker\r\n" + 
				"Clare;Bradley;99;Wrocław;0;F;Joey,Axel,Watson,Ozzy,Kylo\r\n" + 
				"Promise;Mcmillan;19;Seville;1537;F;Shadow\r\n" + 
				"Tony;Beasley;102;Warsaw;4122;M;Atlas,Jackson\r\n" + 
				"Summer;Hardy;136;Nantes;0;F;Wally,Copper,Romeo\r\n" + 
				"Jorge;Kaur;93;Thessaloniki;0;M;Dozer,Diesel,Remi,Whiskey,Teddy,Mac\r\n" + 
				"Alani;Stone;76;Catania;8121;F;Oreo\r\n" + 
				"Johnathan;Carter;120;Wuppertal;0;M;Blue,Blaze,Kylo,Kylo,Luke\r\n" + 
				"Leia;Phelps;104;Bydgoszcz;1213;F;Ollie,Rudy,Zeke,Rocco\r\n" + 
				"Mikayla;Byrd;132;Bydgoszcz;1090;F;Toby,Prince,Simba,Remi\r\n" + 
				"Kashton;Jarvis;121;Palma de Mallorca;8929;M;Louie,Benji,Gunner\r\n" + 
				"Matteo;Hurley;51;Poznań;8831;M;\r\n" + 
				"Dallas;Cox;93;The Hague;5933;F;Echo,Miles,Boomer,Murphy,Dozer\r\n" + 
				"Leonardo;Mcdonald;124;Constanța;6994;M;\r\n" + 
				"Emely;Mullen;89;Bologna;0;F;Zeke,Oreo,Tank,Harry,Archie\r\n" + 
				"Scarlette;Chung;21;Rotterdam;0;F;Winston,King,Odie,Bentley\r\n" + 
				"Valerie;Rosales;63;Munich;1151;F;\r\n" + 
				"Evelynn;Cantu;68;Catania;2837;F;\r\n" + 
				"Allison;Blair;93;Nice;8405;F;Jack,Chase,Kobe,Rocket,Porter\r\n" + 
				"Alejandro;Mann;104;Gdańsk;0;M;Loki,Loki,Samson,Walter\r\n" + 
				"Julie;Parsons;57;Turin;0;F;Bowie,Rusty,Loki,Miles\r\n" + 
				"Morgan;Hudson;13;Warsaw;5087;F;Sarge,Bubba,Oscar,Odie,Rocket\r\n" + 
				"Zachariah;Beil;28;Essen;9497;M;\r\n" + 
				"Willow;Lim;112;Timișoara;8296;F;Dexter\r\n" + 
				"Kayla;Gibson;16;Kraków;0;F;Oscar,Fluffy,Gunner,Leo,Ranger,Tyson\r\n" + 
				"Logan;Torres;131;Galați;0;F;Bowie,Otis,Henry,Ruger,Miles,Boomer\r\n" + 
				"Valery;Farley;115;Naples;5927;F;\r\n" + 
				"Sutton;Case;128;Łódź;0;M;Sarge,Murphy\r\n" + 
				"Liberty;Henry;136;Hamburg;0;F;Whiskey,Louie,Prince,Levi,Tucker,Finn\r\n" + 
				"Alessia;Mitchell;98;Zagreb;5408;F;Tucker,Tyson,Copper,Moose,Ollie,Oreo\r\n" + 
				"Gwendolyn;Thornton;27;Constanța;0;F;Oscar\r\n" + 
				"Reginald;Stevenson;111;Constanța;9815;M;\r\n" + 
				"Leroy;French;24;Warsaw;9001;M;Otis,Bruce,Jake\r\n" + 
				"Haisley;Herrera;136;Bratislava;4819;F;Charlie,Zeus,Winston,Watson,Cash\r\n" + 
				"Norah;Peralta;35;Naples;6241;F;Boomer,Harley\r\n" + 
				"Titan;Harrell;44;Poznań;7125;M;\r\n" + 
				"Abel;Padilla;120;Bratislava;0;M;Lincoln\r\n" + 
				"Dr. Leland;Mccann;30;Seville;0;M;Baxter\r\n" + 
				"Ellianna;Fox;87;Bratislava;327;F;\r\n" + 
				"Kaitlyn;Shaw;134;Palma de Mallorca;0;F;\r\n" + 
				"Capri;Ali;10;Lublin;1911;F;Watson,Ace,Loki,Bailey\r\n" + 
				"Maxton;Berger;81;Tallinn;4362;M;Dexter,Titan\r\n" + 
				"Colt;Ryan;128;Madrid;6446;M;Benny,Leo,Bruno,Cooper\r\n" + 
				"Dr. Shiloh;Frye;16;Lublin;8674;F;Mac,George\r\n" + 
				"Everleigh;Bradley;44;Helsinki;6950;F;Murphy,Rocky\r\n" + 
				"Kimber;Morrow;30;Stockholm;0;F;Porter,Loki,Lucky,Thor\r\n" + 
				"Dorian;Bryant;136;Riga;1287;M;\r\n" + 
				"Arthur;Rosas;94;Iași;8139;M;\r\n" + 
				"Amelie;Schmitt;34;Vila Nova de Gaia;1652;F;\r\n" + 
				"Dr. Cayden;Whitney;60;Plovdiv;8871;M;Bubba,Jackson,Benny,Finn\r\n" + 
				"Elsa;Leon;82;Plovdiv;5627;F;Archie,Bear,Teddy,Benji\r\n" + 
				"Heidi;Medina;94;Gothenburg;8849;F;Charlie,Oakley,Boomer,Ziggy\r\n" + 
				"Nia;Person;17;Paris;0;F;\r\n" + 
				"Mario;Taylor;98;Paris;0;M;Rocky,Oakley,Arlo\r\n" + 
				"Alaina;Castaneda;31;Hamburg;4426;F;Buster\r\n" + 
				"Lucy;Mullen;54;Iași;6680;F;Boomer,Shadow,Remi,Ozzy,Boomer\r\n" + 
				"Nathalie;Hammond;116;Alicante;654;F;Bailey,Lucky,Lincoln,Rocky\r\n" + 
				"Layne;Potter;131;Bucharest;664;F;Bear,Cash,Boomer,Whiskey\r\n" + 
				"Paris;Berg;10;Valencia;0;F;Cody,Bailey,Benny\r\n" + 
				"Kiana;Melton;24;Iași;4220;F;Kylo,Bubba,Harley,Cooper,Buddy,Rudy\r\n" + 
				"Alejandra;Gardner;98;Paris;0;F;\r\n" + 
				"Kylen;Joseph;32;Las Palmas;3711;M;Scout,Leo,Baxter,Prince,Loki,Tucker\r\n" + 
				"Eithan;Singh;39;Catania;7329;M;\r\n" + 
				"Finnley;Esparza;57;Paris;3489;M;Gus\r\n" + 
				"Freyja;Franco;94;Malmö;0;F;Chase,Atlas,Harley,Loki\r\n" + 
				"Eddie;Calderon;39;Rīga;6259;M;Ziggy,Jackson,Baxter,Chase,Bubba\r\n" + 
				"Mark;Flynn;36;Aarhus;6762;M;\r\n" + 
				"Valery;Barker;75;Rome;2690;F;\r\n" + 
				"Nikolai;Norman;112;Kraków;7501;M;Simba\r\n" + 
				"Dr. Leona;Pitts;62;Münster;0;F;Oliver,Remi,Otis,Tank,Buster\r\n" + 
				"Cali;Buchanan;37;Karlsruhe;0;F;Miles,Beau,Ryder,Louie\r\n" + 
				"Raymond;Mccarty;62;Madrid;5762;M;Mac,Simba,Arlo,Zeus,Jake\r\n" + 
				"Leila;Holland;125;Berlin;1320;F;Odin,Copper,Harry\r\n" + 
				"Griffin;Cannon;70;Rīga;9994;M;Walter,Walter,Chip\r\n" + 
				"Adrianna;Castaneda;15;Vilnius;394;F;Henry\r\n" + 
				"Felicity;Figueroa;26;Alicante;9520;F;Jack,Copper,Ollie,Whiskey,Rusty,Maverick\r\n" + 
				"Dr. Madden;Mckay;127;Helsinki;0;M;Leo,Rusty,Rambo,Gus\r\n" + 
				"Derrick;Mayo;96;Málaga;3305;M;\r\n" + 
				"Dr. Axl;Waters;130;Duisburg;1620;M;Mac,Jasper\r\n" + 
				"Ryan;Church;53;Wuppertal;0;M;Diesel,Gus,Ranger\r\n" + 
				"Boone;Hull;36;Palma de Mallorca;9174;M;\r\n" + 
				"Lorenzo;Farley;104;Stuttgart;2313;M;Loki,Odie\r\n" + 
				"Alayna;Andrade;57;Munich;3679;F;\r\n" + 
				"Karen;Davidson;38;Poznań;0;F;Leo,Atlas,Cody,Gizmo,Milo\r\n" + 
				"Nathanael;Stephenson;82;Amsterdam;3807;M;Joey,Chip,Bailey,Porter,Rudy,Tyson\r\n" + 
				"Dr. Aileen;Henry;55;Málaga;0;F;Theo,Louie,Duke,Max,Jasper,King\r\n" + 
				"Kyleigh;Cain;14;Wuppertal;7067;F;\r\n" + 
				"Promise;Vu;58;Bari;0;F;Charlie,Milo,Cooper,Oreo\r\n" + 
				"Andi;Estes;82;Seville;1140;F;Coco,Winston\r\n" + 
				"Paisley;Pace;64;Malmö;2221;F;Gizmo,Henry,Benny\r\n" + 
				"Jimena;Herman;42;Seville;4725;F;Peanut,Oliver,Fluffy,Zeke\r\n" + 
				"Angie;Ramsey;87;Athens;0;F;Rocky,Bailey,Winston,Chip,Bear,Shadow\r\n" + 
				"Jasiah;Franklin;23;Zagreb;0;M;Max,Ruger,Harry,Beau,Oscar\r\n" + 
				"Jalen;Sosa;111;Valmiera;2383;M;Jasper,Luke,Milo,Watson,Dozer,Blue\r\n" + 
				"Leia;Hess;17;Cologne;3048;F;Titan,Odin,Oliver,Koda\r\n" + 
				"Jaylin;Roman;90;Szczecin;7180;F;Bailey,Harley,Harry,Axel,Sarge\r\n" + 
				"Maddison;Cain;29;Poznań;0;F;Murphy\r\n" + 
				"Fiona;Graves;82;Sofia;3637;F;Gunner,Axel,Riley,Sam\r\n" + 
				"Rodney;Parra;128;Valmiera;5810;M;Oakley,Bandit,Fluffy\r\n" + 
				"Adeline;Burch;80;Frankfurt am Main;2767;F;Kylo,Cody,Buddy,Bear\r\n" + 
				"Raiden;Moore;20;Sintra;6180;M;Finn\r\n" + 
				"Bethany;Carter;21;Lisbon;430;F;Theo,Beau,Dexter,Thor,Sam\r\n" + 
				"Solomon;Colón;49;Naples;8927;M;Miles,Baxter\r\n" + 
				"Jordan;Case;13;Düsseldorf;0;F;Rambo,Rusty\r\n" + 
				"Grey;Perez;107;Karlsruhe;1208;M;Copper\r\n" + 
				"Yosef;Potts;93;Vila Nova de Gaia;4302;M;Odin,Zeke,Copper,Bubba\r\n" + 
				"Annika;Horn;84;Dresden;734;F;Loki,Loki\r\n" + 
				"Azariah;Burton;88;Athens;6264;M;Mac,Teddy,Koda\r\n" + 
				"Gregory;Hickman;114;Málaga;0;M;Ozzy,Apollo,Miles,Dexter\r\n" + 
				"Eliseo;Leblanc;52;Duisburg;0;M;Zeke,Blue,Bo\r\n" + 
				"Jolie;Ingram;11;Vilnius;5422;F;Baxter,Marley,Odin,Cooper,Otis,Diesel\r\n" + 
				"Ledger;Sheppard;85;Thessaloniki;1394;M;Coco\r\n" + 
				"Moises;Marin;119;Toulouse;4041;M;Jack,King\r\n" + 
				"Jefferson;Allen;111;Varna;0;M;Chester,Scout,Harley,Archie\r\n" + 
				"Wesley;Cruz;63;Berlin;748;M;Ruger,Benji,Rocco\r\n" + 
				"Donald;O’donnell;69;Vienna;4965;M;Chip\r\n" + 
				"Ty;Bishop;113;Bonn;1121;M;Fluffy\r\n" + 
				"Samuel;Bishop;136;Szczecin;4064;M;Kobe,Oakley,Copper\r\n" + 
				"Charli;Mathews;65;Bratislava;4322;F;Louie,Samson,Gus,Bear,Jackson,Thor\r\n" + 
				"Isaiah;Meyers;62;Warsaw;972;M;Copper,Tank,Benji,Charlie,Charlie\r\n" + 
				"Riley;Benson;58;Łódź;8199;F;Louie,Hank,Prince,Gizmo\r\n" + 
				"Graysen;Cisneros;11;Munich;0;M;Remi,King,Simba,Watson,Titan\r\n" + 
				"Ali;Elliott;46;Dortmund;8207;M;\r\n" + 
				"Zola;Odom;19;Rīga;0;F;Ruger,Buddy,Hank,Odie\r\n" + 
				"Nicolas;Phan;119;Valencia;0;M;Rudy,Fluffy,Titan,Winston\r\n" + 
				"Khalil;Decker;67;Genoa;5093;M;Tyson,Remy,Henry,Oliver,Ziggy,Porter\r\n" + 
				"Jared;Monroe;32;Paris;898;M;Samson,Bowie,Harry,Archie\r\n" + 
				"Rivka;Truong;72;Gothenburg;0;F;Ranger\r\n" + 
				"Mina;Parra;82;Bucharest;8086;F;Marley,Loki\r\n" + 
				"Yasmin;Huber;66;Brno;2303;F;Oscar,Henry\r\n" + 
				"Kylen;Peña;77;Łódź;7847;M;Blaze\r\n" + 
				"Houston;Farrell;103;Cologne;0;M;Zeke,Lucky,Cody,Ranger\r\n" + 
				"Presley;Schneider;126;Timișoara;1751;F;Ace,Walter\r\n" + 
				"Dr. Korbyn;Mahoney;112;Wrocław;0;M;Marley\r\n" + 
				"Nina;Friedman;87;Bari;0;F;Teddy,Ziggy,Chip,Rocky\r\n" + 
				"Jagger;Mccullough;127;Münster;0;M;\r\n" + 
				"Amir;Conley;13;Florence;5616;M;Baxter,Jackson,Kylo\r\n" + 
				"Chelsea;Beltran;135;Prague;0;F;Kobe,Bo,Tank,Thor,Otis\r\n" + 
				"Jazlyn;Hayes;32;Bochum;7485;F;\r\n" + 
				"Dr. Ayan;Portillo;74;Budapest;0;M;Bandit,Otis,Charlie,Odin,Oakley\r\n" + 
				"Jay;Moon;129;Essen;5194;M;Remy,Ozzy\r\n" + 
				"Raiden;Dejesus;35;Galați;0;M;Boomer,Charlie,Ranger,Finn,Gunner,Rusty\r\n" + 
				"Michelle;Bullock;78;Galați;0;F;Ruger\r\n" + 
				"Averi;Lee;69;Aarhus;1673;F;Tyson,Otis,Blaze,Chase\r\n" + 
				"Kaylani;Quinn;66;Bydgoszcz;1717;F;Ranger,Shadow,Chase,Copper,Gizmo,Rex\r\n" + 
				"Chandler;Savage;77;Málaga;0;F;Lucky\r\n" + 
				"Alonso;Mcpherson;55;Genoa;9274;M;Milo,Samson,Kobe,Buster,Benny,Ruger\r\n" + 
				"Jovie;Herman;129;Gothenburg;8155;F;Copper,Bandit,Lincoln,Harley\r\n" + 
				"Lacey;Burton;69;Sigulda;9141;F;Baxter,Rex,Zeke\r\n" + 
				"Emory;Sanford;112;Gothenburg;0;F;\r\n" + 
				"Donovan;Whitney;47;Seville;5820;M;Buddy,Duke,Louie,Buster,Rudy,Levi\r\n" + 
				"Jonas;Livingston;48;Cluj-Napoca;8788;M;Leo,Bear\r\n" + 
				"Andi;Duran;117;Amsterdam;0;F;\r\n" + 
				"Charlie;Rogers;75;Turin;8839;M;Chip,Chip,Cooper,Ace,Rambo,Chester\r\n" + 
				"Warren;Hansen;27;Constanța;0;M;Leo,Jasper,Harry\r\n" + 
				"Skyler;Chavez;84;Iași;639;M;Kylo,Tank,Finn,Marley,Echo,Otis\r\n" + 
				"Tadeo;O’neal;62;Frankfurt am Main;3810;M;Scout\r\n" + 
				"Dr. Briar;Neal;87;Genoa;0;F;Sarge,Loki,Jack\r\n" + 
				"Dr. Adriel;Valencia;79;Alicante;9351;M;Odie\r\n" + 
				"Heaven;Abbott;138;Varna;0;F;Max,Boomer\r\n" + 
				"Steven;O’neill;67;Thessaloniki;0;M;Gunner,Benji,Ace\r\n" + 
				"Harris;Fernandez;14;Paris;0;M;\r\n" + 
				"Dr. Frank;Pennington;43;Helsinki;1382;M;Remi,Luke,Dexter\r\n" + 
				"Faith;Cantu;80;Alicante;7370;F;\r\n" + 
				"Avery;Caldwell;22;Thessaloniki;5818;F;Chip\r\n" + 
				"Eliel;Copeland;82;Valencia;0;M;\r\n" + 
				"Zachary;Moran;135;Genoa;0;M;Maverick,Rudy\r\n" + 
				"Dario;Garza;18;Essen;366;M;\r\n" + 
				"Miranda;Chang;62;Frankfurt am Main;5389;F;\r\n" + 
				"Adler;Merritt;63;Varna;6766;M;Joey,Boomer,Oliver\r\n" + 
				"Nia;Benjamin;113;Prague;2441;F;\r\n" + 
				"Jamal;Hodges;82;Mannheim;4616;M;Gus,Koda,Ziggy,Oscar\r\n" + 
				"Paul;Brady;34;Antwerp;549;M;Ruger,Atlas,Kobe,Oscar,Titan\r\n" + 
				"Denise;Johnson;128;Bonn;6152;F;Peanut,Marley,Finn\r\n" + 
				"Edward;Travis;106;Dortmund;0;M;Gunner\r\n" + 
				"Dr. Desmond;James;80;Bonn;0;M;Ozzy,Louie,Remy,Copper,Walter,Coco\r\n" + 
				"April;Brooks;123;Bari;0;F;Jax,Oreo,Rudy,Cash,Peanut\r\n" + 
				"Adalyn;Moran;116;Bologna;528;F;\r\n" + 
				"Frankie;Jennings;136;Berlin;4631;M;Marley,Cody,Bubba,Chip,Riley\r\n" + 
				"Eliezer;Trujillo;13;Cologne;1114;M;Murphy,Toby,Odie,Zeke,Gucci\r\n" + 
				"Siena;Valentine;53;Málaga;0;F;Louie,Jasper,Sarge\r\n" + 
				"Aspyn;Archer;111;Catania;602;F;Oakley,Joey,Blue\r\n" + 
				"Dr. Isaac;Nelson;99;Marseille;3431;M;Jackson,Sarge,Scout\r\n" + 
				"Raul;Atkinson;137;Córdoba;3631;M;Buster,King\r\n" + 
				"Flynn;Green;121;Bucharest;0;M;Remy,Luke,Oakley\r\n" + 
				"Annika;Sosa;42;Bielefeld;1819;F;Ace,Chip,Leo,Rocket,Otis,Gunner\r\n" + 
				"Declan;Cervantes;51;Lisbon;1731;M;\r\n" + 
				"Carl;Santos;126;Vienna;9167;M;Winston,Jasper,Gucci,Chester,Gunner\r\n" + 
				"Amayah;Monroe;60;Genoa;0;F;Finn,Buddy,Bear,Baxter\r\n" + 
				"Jamison;Orr;78;Copenhagen;0;M;Rudy,Beau,Jake\r\n" + 
				"Dr. Dash;Turner;79;Bari;0;M;Kylo,Louie,Rudy,Luke\r\n" + 
				"Arturo;Pham;26;Seville;0;M;\r\n" + 
				"Meghan;O’connell;107;Rīga;9041;F;Jack,Remi,Henry\r\n" + 
				"Serenity;Olson;111;Florence;0;F;Benny,Axel,Boomer,Oreo,Maverick,Buster\r\n" + 
				"Dr. Silas;Sparks;46;Nantes;7579;M;Gus\r\n" + 
				"Dr. Alvin;Morales;110;Bologna;4800;M;Oscar,Echo,Finn\r\n" + 
				"Vienna;Marquez;40;Palermo;938;F;Remy,Lincoln,Oakley,Winston,Harry\r\n" + 
				"Gwendolyn;Galindo;126;Lyon;5834;F;Dexter,Bailey,Maverick,Bandit,Bruce,Marley\r\n" + 
				"Paisley;Lewis;94;Wuppertal;9638;F;Boomer,Buster,Kobe,Jake\r\n" + 
				"Manuel;Blevins;102;Córdoba;7949;M;Copper\r\n" + 
				"Amari;Pugh;76;Alicante;0;F;Sarge,Ace,Bruce,Baxter,Axel\r\n" + 
				"Arturo;Cisneros;17;Vila Nova de Gaia;0;M;\r\n" + 
				"Kyree;Duffy;56;Hamburg;2939;M;\r\n" + 
				"Millie;Washington;108;Lyon;6774;F;Tucker\r\n" + 
				"Kaylani;Powell;67;Łódź;4887;F;Peanut,Gunner,Oreo\r\n" + 
				"Laurel;Todd;12;Córdoba;0;F;Buster,Cash,Buster,Rocket,Samson\r\n" + 
				"Dr. Maxine;Carrillo;93;Poznań;0;F;Maverick,Joey,Diesel,Odin,Sarge,Levi\r\n" + 
				"Jakobe;Williamson;89;Brno;8623;M;Mac,Ace\r\n" + 
				"Charlotte;Hayes;80;Bonn;0;F;\r\n" + 
				"Carl;Ware;83;Iași;441;M;Toby,Dozer,Levi,Jasper\r\n" + 
				"Shiloh;Waller;107;Brno;0;M;Fluffy,Jake,Gunner,Lincoln,Zeke\r\n" + 
				"Hadlee;Payne;32;Dresden;3969;F;Loki,Harley,Bailey,Buster,Thor\r\n" + 
				"Ansley;Magana;74;Sofia;4901;F;Chester\r\n" + 
				"Kannon;Wilson;129;Timișoara;0;M;\r\n" + 
				"Dr. Kylian;Mendez;78;Bochum;0;M;\r\n" + 
				"Ashley;Suarez;38;Naples;7755;F;Titan,Bowie\r\n" + 
				"Titus;Alfaro;99;Catania;2294;M;Sam,Bowie,Buddy,Atlas\r\n" + 
				"Nikolai;Burton;60;Bari;6513;M;Charlie,Bandit,Archie,Romeo\r\n" + 
				"Jordan;Sawyer;111;Sigulda;4561;M;Benny,Wally,Louie\r\n" + 
				"Emily;Mccoy;123;Córdoba;9618;F;Rocky,Baxter\r\n" + 
				"Dr. Leandro;Ochoa;127;Stockholm;6360;M;Gunner,Loki\r\n" + 
				"Dr. Danielle;Singh;133;Las Palmas;6018;F;Lucky,Rocket,Thor,Buster\r\n" + 
				"Trace;Duke;100;Málaga;6967;M;Blue,Leo,Ryder,Jax\r\n" + 
				"Tiana;Gonzales;129;Sofia;5672;F;Levi,Benny\r\n" + 
				"Camryn;Walton;12;Athens;0;F;Oakley,Remi,Oreo,Rocket,Gunner,Rocco\r\n" + 
				"Quincy;James;11;Szczecin;8358;M;Harry,Bowie,Bruno,Bandit\r\n" + 
				"Louise;Brewer;16;Szczecin;854;F;Jack,Winston,Bo,Leo,Bruce\r\n" + 
				"Caden;Russell;41;Florence;2149;M;Riley,Tyson,Thor,Zeus\r\n" + 
				"Jessie;Jenkins;106;Malmö;8440;F;\r\n" + 
				"Justice;Klein;107;Essen;1532;F;Moose\r\n" + 
				"Paisleigh;Acosta;135;Aarhus;3756;F;Bruce,Remy,Watson,Oakley\r\n" + 
				"Dr. Itzel;Duarte;108;Sofia;8711;F;\r\n" + 
				"Curtis;Park;106;Naples;0;M;Luke,Rudy\r\n" + 
				"Joey;Thompson;60;Rome;3138;M;\r\n" + 
				"Wynter;Garner;114;Wuppertal;5421;F;Sarge,Remy,Watson,Murphy,Rocket,Sarge\r\n" + 
				"Joyce;Allen;119;Vila Nova de Gaia;9211;F;Cash,Mac,Gucci,Bailey,Bear\r\n" + 
				"Blakely;Parra;64;Murcia;0;F;Jackson,Rex\r\n" + 
				"Dr. Jianna;Sanford;100;Brno;8544;F;Walter,Benji,Ziggy,Harry,Romeo,Zeus\r\n" + 
				"Giuliana;Schroeder;118;Bologna;4530;F;Gucci,Buster,Thor,Peanut,Bowie,Blaze\r\n" + 
				"Wallace;Vargas;35;Paris;651;M;Sarge,Cash,Oscar\r\n" + 
				"Joy;Wyatt;98;Stuttgart;5890;F;Fluffy,Shadow,Lucky,Oakley\r\n" + 
				"Griffin;Bell;11;Essen;0;M;Fluffy,Porter,Murphy,Rocky,Baxter\r\n" + 
				"Yaretzi;Reid;38;Szczecin;7797;F;Loki\r\n" + 
				"Houston;Hoffman;132;Lublin;2290;M;Duke,Echo\r\n" + 
				"Joseph;Buckley;123;Karlsruhe;2731;M;Maverick,Henry,Levi,Bentley,Henry,Axel\r\n" + 
				"Duncan;Santos;104;Brno;3102;M;Moose\r\n" + 
				"Ailani;Mckee;81;Lublin;0;F;Diesel\r\n" + 
				"Della;Richardson;32;Alicante;4659;F;Bowie\r\n" + 
				"Elisa;Richardson;35;Paris;8923;F;\r\n" + 
				"Donovan;Cherry;69;Bonn;0;M;Remi,Sam,Apollo,Blue\r\n" + 
				"Zavier;Mccann;85;Iași;7645;M;Gucci,Toby\r\n" + 
				"Maria;Poole;76;Brno;0;F;\r\n" + 
				"Alfred;Montes;133;Hamburg;0;M;Gus,Koda\r\n" + 
				"Adley;Boyer;57;Riga;0;F;Buster,Harry,Ozzy,Maverick,Porter\r\n" + 
				"Bellamy;Mercado;84;Riga;3135;M;\r\n" + 
				"Rey;Fleming;123;Gothenburg;1874;M;Beau,Jack,Duke,Ollie,Cody,Watson\r\n" + 
				"Marley;Meadows;97;Essen;3037;M;Leo,Kylo,Scout\r\n" + 
				"Nico;Jordan;84;Vienna;0;M;Harley,Boomer,Echo,Arlo,Axel,Apollo\r\n" + 
				"Philip;Rowe;132;Wrocław;5648;M;Ace\r\n" + 
				"Drew;Hart;55;Timișoara;8458;M;Shadow,Riley,Thor,Cooper,Beau,Jasper\r\n" + 
				"Jeffrey;Noble;47;Timișoara;0;M;Whiskey,Charlie,Kylo,Cody,Tucker,Rocco\r\n" + 
				"Shiloh;Mcmillan;32;Bochum;7343;F;Marley,Leo,Loki,Dozer,Rambo\r\n" + 
				"Vicente;Jacobs;57;Münster;7121;M;Titan\r\n" + 
				"Hayes;Lee;67;Athens;0;M;Murphy,Chip,Beau\r\n" + 
				"Dr. Cynthia;Nuñez;53;Sigulda;0;F;Bruce,Tank,Kylo,Lucky\r\n" + 
				"Dr. Seven;Glenn;51;Brno;0;M;Rocky,Bubba,Bruno\r\n" + 
				"Kiaan;Arellano;137;Rīga;2970;M;Scout,Benji,Leo,Watson,Kobe,Cooper\r\n" + 
				"Kole;Eaton;11;Zagreb;7888;M;Samson,Milo,Bailey,Murphy\r\n" + 
				"Conrad;Shah;50;Marseille;3465;M;Max\r\n" + 
				"Easton;Duke;122;Iași;1037;M;\r\n" + 
				"Russell;Parsons;80;Leipzig;0;M;Bruno,Ollie,Tucker\r\n" + 
				"Lauryn;Schneider;73;Bilbao;0;F;Koda,Arlo,Louie,Jackson,Henry,Cash\r\n" + 
				"Dr. Oakley;Vazquez;107;Budapest;3428;F;Toby,Bandit,Ace\r\n" + 
				"Jamie;Nash;110;Kraków;0;M;Fluffy,Remi\r\n" + 
				"Dr. Kade;Buckley;99;Rome;0;M;Oscar\r\n" + 
				"Ishaan;Greene;13;Florence;3953;M;Chester,Sarge\r\n" + 
				"Briar;Monroe;55;Łódź;8113;F;\r\n" + 
				"Jaylah;Ho;48;Lyon;6786;F;\r\n" + 
				"Jaxtyn;Vaughn;109;Iași;4452;M;Oscar\r\n" + 
				"Jalen;Estrada;83;Leipzig;7550;M;Riley,Cooper\r\n" + 
				"Aziel;Harrington;92;Nantes;5643;M;Rocky,Bowie,Ryder,Simba,Buddy\r\n" + 
				"Aurora;Wilcox;89;Turin;0;F;\r\n" + 
				"Gianna;Cook;125;Dublin;1034;F;Fluffy,Echo,Gucci,Cash,Baxter\r\n" + 
				"Averi;Klein;98;Catania;0;F;\r\n" + 
				"Dr. Bellamy;Adkins;114;Seville;5939;F;Jack,Ryder,Whiskey\r\n" + 
				"Meadow;Sosa;15;Brno;9166;F;Rudy,Archie,Rambo,Zeke\r\n" + 
				"Jakobe;Hanna;75;Thessaloniki;5209;M;Ace,Jack,Jasper,Gunner,Miles\r\n" + 
				"Yara;Barton;75;Nantes;0;F;George,Rocky\r\n" + 
				"Brylee;Garrett;58;Gothenburg;0;F;Bailey\r\n" + 
				"Donald;Arias;93;Düsseldorf;2889;M;\r\n" + 
				"Koa;Ware;79;Tallinn;0;M;Cooper,Sam\r\n" + 
				"Christina;Christensen;134;Nuremberg;3672;F;\r\n" + 
				"Kaylani;Stanton;87;Thessaloniki;3760;F;Rocco,Buster,Charlie,Blue,Baxter,Moose\r\n" + 
				"Harley;Holt;117;Rotterdam;4473;M;Rocket,Jasper,Archie\r\n" + 
				"Dexter;Garza;112;Galați;0;M;Oliver,Tucker,Otis\r\n" + 
				"Remington;Frye;46;Turin;4344;F;Ace,Cooper\r\n" + 
				"Imani;Gilbert;30;Athens;5677;F;Oscar,Oreo,Bandit\r\n" + 
				"Aidan;Kaur;128;Cluj-Napoca;0;M;Theo,Rocco,Leo,Charlie\r\n" + 
				"Kaiden;Lindsey;85;Madrid;3330;M;Rocket,Copper\r\n" + 
				"Blaise;Murphy;51;Sintra;0;M;Ace,Jackson,Whiskey,Diesel\r\n" + 
				"Skye;Valentine;34;Gdańsk;0;F;\r\n" + 
				"Maya;Osborne;18;Naples;2466;F;Jackson,Samson,Cody,Bailey,Jackson,Sam\r\n" + 
				"Truett;Todd;22;Iași;0;M;Rocket,Rex,Teddy,Peanut,Beau\r\n" + 
				"Greta;Wheeler;61;Gothenburg;0;F;Rambo\r\n" + 
				"Chelsea;Frederick;115;Paris;0;F;Otis,Mac,Benny,Riley,Hank,Echo\r\n" + 
				"Mikayla;Wolfe;95;Bonn;0;F;Archie,Marley,Archie\r\n" + 
				"Adan;Crawford;74;Cluj-Napoca;0;M;Titan,Dozer,Moose,Rex,Hank\r\n" + 
				"Kian;Kelley;108;Valencia;372;M;Sam\r\n" + 
				"Braylee;Miles;87;Zagreb;0;F;\r\n" + 
				"Benicio;Gilmore;94;Paris;0;M;Benny,Rusty,Ace,Kylo,Jackson\r\n" + 
				"Randy;Hoffman;104;Aarhus;1607;M;\r\n" + 
				"Avianna;Schroeder;44;Stockholm;0;F;Remi,Bubba,Harry,Beau,Harley,Blue\r\n" + 
				"Kamden;Marsh;34;Rome;7837;M;Echo,Ozzy\r\n" + 
				"Lilyana;Rivas;125;Florence;0;F;\r\n" + 
				"Ishaan;Christian;75;Lyon;3673;M;\r\n" + 
				"Sterling;Aguilar;123;Hanover;0;M;Remy,Kylo,Dozer,Baxter,Scout\r\n" + 
				"Axel;Huffman;60;Athens;8666;M;\r\n" + 
				"Raya;Bernal;61;Milan;0;F;Watson,King,Ozzy,Peanut\r\n" + 
				"Laurel;Harris;118;Wuppertal;0;F;\r\n" + 
				"Bowen;Carroll;43;Leipzig;4983;M;\r\n" + 
				"Dr. Aviana;Welch;64;Sofia;0;F;Ziggy\r\n" + 
				"Dr. Karsyn;Hudson;48;Bologna;0;M;Chip,Chip\r\n" + 
				"Dr. Yareli;Wallace;67;Stuttgart;6075;F;Bowie,Walter,Rudy,Bentley,Duke,Arlo\r\n" + 
				"Ivanna;Eaton;30;Rīga;7974;F;Zeus,Ziggy,Luke,Bubba,Ziggy,Oreo\r\n" + 
				"Dr. Corey;Good;58;Prague;220;M;Fluffy,Benji,Teddy,Harry,Simba\r\n" + 
				"Dr. Gatlin;Berg;113;Sigulda;0;M;Rusty,Gucci\r\n" + 
				"Grace;Corona;138;Helsinki;9670;F;Mac,Rocco\r\n" + 
				"Rodney;Freeman;92;Alicante;1594;M;Shadow,Apollo,Cooper,Atlas,Chase,Buddy\r\n" + 
				"Averi;Ramsey;108;Naples;0;F;Maverick,Watson,Buster,Rocco\r\n" + 
				"Colette;Cline;130;Kraków;4327;F;Kobe\r\n" + 
				"Darren;Choi;54;Cluj-Napoca;7230;M;Rocky,Whiskey\r\n" + 
				"Banks;Brewer;107;Córdoba;8417;M;Zeus,Coco,Miles\r\n" + 
				"Aniya;Conway;101;Lublin;2690;F;Oreo,Finn,Ziggy,Benji,Chester,Bailey\r\n" + 
				"Johnny;Woodard;54;Sintra;7593;M;Cody,King,Remy,Luke\r\n" + 
				"Ocean;Waters;116;Zaragoza;0;M;\r\n" + 
				"Thomas;Benson;88;Mannheim;5889;M;Luke,Otis\r\n" + 
				"Marlowe;Ortiz;93;Hamburg;509;F;Tank,Rocket,Chip,Diesel,Oliver,Maverick\r\n" + 
				"Watson;Robbins;121;Szczecin;9927;M;Marley,Ranger,Ollie,Cooper,Ace,Ryder\r\n" + 
				"Jaycee;Saunders;21;Bari;0;F;Ziggy,Teddy\r\n" + 
				"Mateo;Mays;53;Łódź;5710;M;Rambo,Peanut,Odin,Benji\r\n" + 
				"Dr. Zeke;Bauer;130;Gothenburg;4755;M;Whiskey,Leo,Koda\r\n" + 
				"Aron;Chavez;132;Valencia;3021;M;Ruger,Marley\r\n" + 
				"Gia;Potter;15;Cluj-Napoca;0;F;Luke,Diesel\r\n" + 
				"Quincy;Peters;62;Lyon;0;M;Rocco,Bowie,Cash,Benji,Rocky\r\n" + 
				"Lucca;Armstrong;123;Helsinki;2577;M;Rocky,Jake,Wally\r\n" + 
				"Marcel;Wise;43;Bonn;1157;M;\r\n" + 
				"Tomas;Chung;45;Hanover;2614;M;Beau\r\n" + 
				"Julius;Pittman;67;Poznań;1555;M;Tucker,Blue,Oscar,Louie,Whiskey\r\n" + 
				"Emmitt;Meza;78;Düsseldorf;0;M;Baxter,Leo,Blue,Oakley,Copper\r\n" + 
				"Dr. Maisie;Moreno;93;Wrocław;3530;F;Kobe\r\n" + 
				"Dr. Kaia;Cole;18;Marseille;1402;F;Luke,Diesel,Miles\r\n" + 
				"Dr. Ephraim;Larsen;11;Wrocław;1074;M;Mac,Gizmo\r\n" + 
				"Cain;Shannon;34;Dublin;2115;M;Bubba,Zeus,Apollo,Peanut\r\n" + 
				"Raya;Khan;128;Bydgoszcz;9157;F;\r\n" + 
				"Gatlin;Chandler;92;Marseille;7342;M;Rudy,Theo,Finn\r\n" + 
				"Avi;Koch;41;The Hague;9025;M;Simba\r\n" + 
				"Kase;Floyd;120;Hamburg;0;M;Rusty,Tucker,Cody,Bentley,Beau\r\n" + 
				"Adaline;Blankenship;123;Iași;0;F;Bentley,Copper,Finn,Walter\r\n" + 
				"Brynleigh;Neal;23;Rome;0;F;Cash,Echo,Echo,Copper,Gucci,Bear\r\n" + 
				"Canaan;Yates;126;Bonn;0;M;Sarge,Max,George,Sam,Harry\r\n" + 
				"Rosalyn;Guevara;60;Amsterdam;0;F;\r\n" + 
				"Randy;Blanchard;123;Palma de Mallorca;0;M;Chester,Oscar,Lincoln,Cash\r\n" + 
				"Angelina;Finley;22;Szczecin;0;F;Dozer,Jackson,Hank,Louie,Blue,Samson\r\n" + 
				"Jaelynn;Randall;57;Copenhagen;0;F;Wally,Chip\r\n" + 
				"Dr. Lawrence;Beck;123;Bucharest;8802;M;Jack,Archie,Buddy,Ziggy,Fluffy\r\n" + 
				"Imani;Douglas;111;Barcelona;1626;F;Walter,Oscar,Harley,Tucker,Oscar,Maverick\r\n" + 
				"Ethan;Decker;101;Lisbon;0;M;Mac,Blue,Finn,Copper,Rex,Blue\r\n" + 
				"Andrea;Davis;57;Tallinn;7206;F;Mac,Chester,Dozer,Rusty,Remy,Buster\r\n" + 
				"Kyro;Hart;62;Bochum;8884;M;Maverick\r\n" + 
				"Avalynn;Dickerson;134;Tallinn;2155;F;Rusty,Bubba\r\n" + 
				"Romeo;Park;120;Gothenburg;0;M;Prince,Buster,Chester\r\n" + 
				"Dr. Bryan;Quintero;127;Athens;9800;M;Rocket,George,Cooper,Remy,Odie,Oakley\r\n" + 
				"Kate;Huynh;104;Catania;3188;F;Buddy,Watson,Ace\r\n" + 
				"Mikaela;Cannon;47;Thessaloniki;4733;F;Boomer\r\n" + 
				"Reginald;Arnold;90;Madrid;1300;M;Odin\r\n" + 
				"Dr. Malcolm;Peterson;136;Dortmund;7692;M;Bandit,Maverick,Lucky,Mac,Mac\r\n" + 
				"Andres;Felix;89;Cluj-Napoca;8230;M;Miles,Milo,Jasper\r\n" + 
				"Giovanna;Berry;62;Zagreb;0;F;Boomer,Charlie,Gus,Remi,Oscar\r\n" + 
				"Oakleigh;Medina;36;Dortmund;5861;F;Marley,Murphy,Jax,Cody\r\n" + 
				"Conor;Zamora;70;Bilbao;9089;M;\r\n" + 
				"Dr. Zayden;Kline;118;Utrecht;3276;M;Tyson,Rusty\r\n" + 
				"Jerry;Chen;79;Kraków;3857;M;Chip,Gizmo\r\n" + 
				"Cruz;Costa;30;Vilnius;3725;M;Kobe\r\n" + 
				"Rosemary;Avery;17;Murcia;6756;F;Hank,Zeke,Gunner,Bandit\r\n" + 
				"David;Mcbride;57;Plovdiv;9681;M;Maverick\r\n" + 
				"Emberly;Blankenship;87;The Hague;8816;F;Sam,Hank,Diesel,Bandit,Lincoln\r\n" + 
				"Terrance;Fernandez;27;Rome;0;M;Fluffy,Toby,Walter,Simba\r\n" + 
				"Dr. Kaysen;Campbell;102;Rīga;1721;M;Bruno,Joey,Gunner,Arlo\r\n" + 
				"Dr. Noe;Knapp;116;Sintra;7739;M;\r\n" + 
				"Dr. Bryce;Martinez;14;Plovdiv;8933;M;Remy,King,Ryder,Marley,Shadow,Arlo\r\n" + 
				"Dr. Holland;Edwards;54;Valencia;713;F;Moose,Odin\r\n" + 
				"Dream;Avery;112;Naples;7701;F;Benji,Benji,Echo,Peanut\r\n" + 
				"Aniya;Stout;123;Murcia;0;F;Kylo,Oliver,Rusty,Scout,Lincoln,Buster\r\n" + 
				"Jimmy;Sanford;33;Münster;6689;M;Louie,Odin,Diesel,Rambo,Harley\r\n" + 
				"Dallas;Hoover;35;Bremen;0;F;Titan\r\n" + 
				"Scott;Weiss;96;Zagreb;0;M;Harry,Simba,Rocket\r\n" + 
				"Rhys;Wallace;134;Bielefeld;1881;M;Otis,Marley,Louie,Bubba\r\n" + 
				"Brittany;Davenport;80;Galați;0;F;Henry,Porter,Milo\r\n" + 
				"Ayden;Welch;102;Paris;0;M;Oscar,Ziggy,Kylo\r\n" + 
				"Winston;Durham;11;Barcelona;0;M;Charlie,Peanut\r\n" + 
				"Reina;Becker;56;Wuppertal;3497;F;\r\n" + 
				"Ambrose;Ali;42;Sigulda;0;M;Oreo,Cody,Bailey,Chip\r\n" + 
				"Adeline;Cantrell;82;Warsaw;806;F;Baxter,Odin\r\n" + 
				"Helena;Carrillo;100;Bucharest;6884;F;Rocco,Sam\r\n" + 
				"Maisie;Cisneros;114;Szczecin;0;F;Baxter\r\n" + 
				"Rohan;Acosta;109;Prague;883;M;Ranger,Copper,Diesel\r\n" + 
				"Dr. Van;Diaz;10;Varna;1812;M;Odin,Bubba,Benny\r\n" + 
				"Hector;Owens;121;Cluj-Napoca;4622;M;\r\n" + 
				"Charles;Gould;47;Antwerp;3977;M;Coco,Ace\r\n" + 
				"Lacey;Shepard;91;Münster;0;F;Gizmo,Gunner,Max\r\n" + 
				"Malakai;Melton;135;Madrid;6111;M;Whiskey,Jackson,Murphy,Ace,Chase,Buddy\r\n" + 
				"Wren;Raymond;104;Palermo;0;F;Cash,Dozer,Henry,Blue\r\n" + 
				"Harlem;Wilkinson;121;Utrecht;7982;M;King,Luke,Oreo,Chester,Toby\r\n" + 
				"Dr. Daxton;Heath;68;Prague;8423;M;Toby,Bowie,Jax,Oliver,Zeke\r\n" + 
				"Iyla;Stout;76;Toulouse;7681;F;Chase,Dexter,Zeus,Jax,Ryder\r\n" + 
				"Killian;Wade;123;Catania;181;M;\r\n" + 
				"Case;Brown;127;Bologna;337;M;Harry\r\n" + 
				"Braxton;Yang;108;Bochum;721;M;Copper,Chase,Marley,Titan\r\n" + 
				"Korbin;Davenport;97;Hamburg;4229;M;Ziggy,Chester,Chester,Shadow,Walter\r\n" + 
				"Dr. Nia;Gould;92;Plovdiv;3871;F;Zeus,Apollo\r\n" + 
				"Luis;Glover;54;Rome;0;M;Joey,Hank\r\n" + 
				"Madilynn;Hodges;22;Palermo;3981;F;Cash\r\n" + 
				"Kadence;Robbins;93;Palma de Mallorca;0;F;Ryder,Rex,Blaze\r\n" + 
				"Kohen;Kennedy;21;Barcelona;0;M;\r\n" + 
				"John;Hancock;60;Valencia;7454;M;Remi,Atlas,Copper\r\n" + 
				"Dr. Moises;Huffman;38;Rotterdam;8326;M;Copper,Bandit,Simba\r\n" + 
				"Mckinley;Salinas;49;Helsinki;9504;F;Baxter,Diesel\r\n" + 
				"Ryann;Houston;80;Málaga;0;F;Bandit,Otis,Beau,Oreo\r\n" + 
				"Delaney;Compton;38;Palermo;4074;F;Moose,Blaze,Miles,Harry\r\n" + 
				"Gabrielle;Lawson;95;Budapest;6906;F;\r\n" + 
				"Gemma;Rush;96;Thessaloniki;6030;F;Rocco,Chester,Tank\r\n" + 
				"Mariam;Phillips;138;Murcia;2867;F;Cooper,Miles,Buddy\r\n" + 
				"Madelyn;Vazquez;128;Paris;0;F;Ranger,Whiskey\r\n" + 
				"Dr. Denisse;Dudley;89;Córdoba;0;F;Cash,Remi\r\n" + 
				"Landon;Delarosa;98;Catania;4434;M;Tank,Buster,Prince\r\n" + 
				"Nathanael;Hodges;44;Varna;8763;M;Buster,Sam\r\n" + 
				"Abner;Villarreal;123;Barcelona;7150;M;Rocco\r\n" + 
				"Sophia;Patel;61;Lisbon;0;F;Fluffy\r\n" + 
				"Mazikeen;Cobb;73;Bratislava;9314;F;Chip,Odin\r\n" + 
				"Johan;Morgan;127;Bratislava;0;M;\r\n" + 
				"Jacoby;Jimenez;36;Plovdiv;889;M;Benny,Watson\r\n" + 
				"Noah;Coleman;95;Munich;9746;F;Loki,Peanut,Cody,Rusty,Buster\r\n" + 
				"Rylie;Ware;128;Timișoara;3187;F;Atlas,Maverick,Milo,Buster,Jake\r\n" + 
				"Jaylah;Richmond;75;Córdoba;4928;F;Tucker,Jack\r\n" + 
				"Julia;Wood;40;Münster;0;F;Buddy\r\n" + 
				"Clayton;Ryan;59;Paris;0;M;Blaze,Odin,King,Bailey\r\n" + 
				"Bobby;Blair;102;Wuppertal;0;M;Titan,Leo,Ollie,Benji,Samson\r\n" + 
				"Boston;Lim;83;Bielefeld;6067;M;Rex,Luke,Teddy\r\n" + 
				"Ellie;Medina;100;Málaga;2014;F;Samson,Jax,Titan,Jasper,Ranger,George\r\n" + 
				"Dr. Clark;Koch;15;Zagreb;8589;M;Bandit,Oliver,Ryder\r\n" + 
				"Liam;Yu;98;Marseille;7853;M;Loki,Ruger,Odin\r\n" + 
				"Spencer;Houston;45;Catania;0;M;Lucky\r\n" + 
				"Ameer;Knox;35;Zagreb;0;M;\r\n" + 
				"Elora;French;40;Prague;3143;F;Beau,Lincoln,Zeus,Oscar,Leo\r\n" + 
				"Jianna;Cline;39;Florence;8183;F;Tank,Milo,Tucker,Apollo,Gizmo\r\n" + 
				"Bailey;Terrell;137;Las Palmas;6811;F;Walter,Odin,Jasper,Titan,Apollo,Oakley\r\n" + 
				"Yusuf;Truong;79;Nantes;2641;M;Finn,Odie,Oakley,Copper,Tucker\r\n" + 
				"Kylan;Pierce;137;Bonn;4142;M;Jackson\r\n" + 
				"Andrew;White;56;Gothenburg;9032;M;Bubba,Diesel\r\n" + 
				"Aziel;Wilson;41;Florence;6484;M;Oscar,Chester\r\n" + 
				"Kai;Oliver;96;Thessaloniki;9120;F;Tucker,Walter\r\n" + 
				"Dr. Kennedy;Hail;39;Essen;6830;F;Tyson,Rudy,Joey,Watson,Milo,Dozer\r\n" + 
				"Atticus;Dougherty;91;Dublin;0;M;Titan,George,Gunner\r\n" + 
				"Raiden;Lindsey;27;Frankfurt am Main;6947;M;Titan,Teddy\r\n" + 
				"Uriel;Valdez;103;Wrocław;4871;M;George,Mac,Ruger,Sam,Riley,Fluffy\r\n" + 
				"Celia;Chambers;71;Sigulda;0;F;Maverick\r\n" + 
				"Adan;Tanner;27;Milan;0;M;Rex,Bruno,Louie,Dozer,Blaze,Dozer\r\n" + 
				"Jaime;Lam;131;Stuttgart;0;M;Luke,Odin,Baxter,Rudy,Kylo\r\n" + 
				"Irene;Bruce;74;Bielefeld;5162;F;Dexter,Buddy,Oliver\r\n" + 
				"Dr. Remi;Burke;69;Tallinn;1647;M;Cooper,Luke,Chase,Leo\r\n" + 
				"Reese;Cano;113;Bilbao;322;F;Coco\r\n" + 
				"Adelynn;Browning;63;Frankfurt am Main;7106;F;\r\n" + 
				"Thalia;Bernal;67;Rotterdam;198;F;\r\n" + 
				"Eileen;Hood;72;Marseille;0;F;Rudy,Jack,Zeke,King,Henry,Bo\r\n" + 
				"Lian;Lloyd;49;Helsinki;5833;M;Arlo\r\n" + 
				"Kinley;Brady;65;Galați;9833;F;Porter\r\n" + 
				"Davina;Mckay;106;Hanover;834;F;Ranger,Cody,Jake,Mac\r\n" + 
				"Leandro;Shaw;104;Madrid;0;M;Luke,Gucci,Baxter\r\n" + 
				"Hakeem;Gibson;96;Murcia;0;M;Cooper,Lincoln,Oscar,Copper,Otis\r\n" + 
				"Irene;Choi;126;Szczecin;5640;F;\r\n" + 
				"Frances;Esquivel;111;Valencia;2179;F;Tyson,Charlie\r\n" + 
				"Brantley;Guzman;58;Zagreb;6857;M;Archie,Blaze,Murphy,Sam,Blue,George\r\n" + 
				"Martin;Hammond;99;Leipzig;4545;M;Peanut,Rocco,Bear,Whiskey\r\n" + 
				"Theodore;Warner;139;Bari;0;M;Archie,Titan,Dozer,Gunner\r\n" + 
				"Charlotte;Coleman;53;Bratislava;5291;F;Kylo,Duke,Louie\r\n" + 
				"Freyja;Lozano;27;Düsseldorf;1198;F;Titan,Levi,Marley\r\n" + 
				"Novah;Wilkinson;11;Łódź;6169;F;Marley\r\n" + 
				"Maximus;Yates;104;Gdańsk;4651;M;Koda,Archie,Jasper,Echo\r\n" + 
				"Onyx;Pugh;105;Alicante;3843;M;Shadow,Joey,Harley,Shadow\r\n" + 
				"Violet;Proctor;115;Alicante;2465;F;\r\n" + 
				"Kenji;Smith;41;Sigulda;0;M;Theo,Riley,Porter\r\n" + 
				"Chance;Hill;15;Tallinn;3165;M;Henry,Loki,Winston\r\n" + 
				"Rosalia;Williamson;58;Athens;0;F;Blue,Buddy\r\n" + 
				"Mario;Bryant;52;Poznań;4109;M;Riley,Watson,Luke,Chase,Remi\r\n" + 
				"Gideon;Felix;33;Szczecin;0;M;Bubba,Teddy\r\n" + 
				"Kaydence;Joseph;71;Düsseldorf;2190;F;Porter,Gus,Bandit,Chip,Loki,Titan\r\n" + 
				"Erin;Harvey;37;Iași;6378;F;Levi,Boomer,Gucci\r\n" + 
				"Reese;Daniel;45;Kraków;581;M;\r\n" + 
				"Dr. Briella;Rhodes;75;Bari;0;F;Joey,Bruno\r\n" + 
				"Maya;Duran;35;Vienna;0;F;Rambo\r\n" + 
				"Murphy;Shannon;28;Bydgoszcz;0;F;Kylo,Luke,Murphy,Maverick,King\r\n" + 
				"Charlie;Dunn;109;Munich;6446;F;Harry,Lucky,Marley\r\n" + 
				"Yasmin;Hines;81;Vienna;4862;F;Oscar,Watson\r\n" + 
				"Kaisley;Kirk;18;Szczecin;0;F;Teddy\r\n" + 
				"Derek;Johnston;122;Wuppertal;480;M;Rudy,Rambo,Chester,Lincoln\r\n" + 
				"Kenzie;Baldwin;125;Duisburg;813;F;Benny,Peanut,Dexter,Atlas,Rambo\r\n" + 
				"Kaitlyn;Butler;39;Bucharest;1271;F;\r\n" + 
				"Solomon;Gillespie;87;Nuremberg;9176;M;Buster\r\n" + 
				"Aila;Fitzgerald;119;Essen;1268;F;\r\n" + 
				"Karsyn;Daugherty;69;Prague;154;M;Blaze,Oreo,Bailey,Benji\r\n" + 
				"Jane;Boone;32;Thessaloniki;0;F;Charlie,Oreo,Gizmo,Sarge,Gunner,Joey\r\n" + 
				"Kye;Fox;53;Bologna;1377;M;George,Atlas,Oscar,Arlo,Whiskey,Tucker\r\n" + 
				"Augustine;Herrera;67;Valencia;634;M;Gunner\r\n" + 
				"Declan;Townsend;113;Las Palmas;0;M;\r\n" + 
				"Lexi;Deleon;84;Vilnius;4105;F;Henry,Archie,Bo,Zeus,Miles,Miles\r\n" + 
				"Frankie;Blevins;112;Riga;166;M;Boomer,Dozer,Jack,Maverick\r\n" + 
				"Rio;Pacheco;88;Poznań;0;M;Whiskey,Tucker,Blue,Rambo,Marley,Zeus\r\n" + 
				"Lucille;Lewis;33;Plovdiv;0;F;Chip,Loki,Miles,Rocky\r\n" + 
				"Dr. Jianna;Marsh;133;Düsseldorf;7338;F;Boomer,Jax,Rudy,Dexter,Buddy\r\n" + 
				"Rory;Roberts;57;Zaragoza;2241;F;Axel,Riley,Copper,Atlas,Rex,Luke\r\n" + 
				"Danny;Mejia;100;Athens;3417;M;Rudy,Moose,Harry,Levi,Boomer\r\n" + 
				"Leif;Mckinney;59;Córdoba;8778;M;Bear,Blue,Peanut,Zeke\r\n" + 
				"Luciana;Christian;110;Berlin;4178;F;Tyson,Winston,King\r\n" + 
				"Shane;Joseph;105;Hamburg;1166;M;Cash,King,Ziggy,Miles\r\n" + 
				"Hadassah;Mccullough;138;Barcelona;7888;F;Maverick,Murphy,Sarge,Marley,Gunner,Rex\r\n" + 
				"Kaiser;Duncan;130;Rotterdam;4165;M;Leo,Scout,Jax\r\n" + 
				"Samuel;Sloan;87;Szczecin;0;M;Rocket,Fluffy,Leo,Tank\r\n" + 
				"Miller;Howard;94;Duisburg;4826;M;Loki,Levi,Simba,Otis\r\n" + 
				"Karter;Strickland;80;Florence;0;F;Bandit,Romeo,Copper\r\n" + 
				"Ian;Carson;77;Turin;2492;M;Murphy,Cody,Tyson,Archie,Harley,Teddy\r\n" + 
				"Jamal;Pearson;40;Malmö;180;M;Sarge,Atlas,Levi,Lincoln,Odin\r\n" + 
				"Luca;Gould;31;Budapest;9096;M;Copper,Bo,Bruce,Benny,Fluffy\r\n" + 
				"Adalee;Waller;112;Marseille;0;F;Benny\r\n" + 
				"Axton;Mccormick;131;Rome;0;M;Echo,Riley,Samson\r\n" + 
				"Felix;Hoffman;16;Leipzig;5499;M;Bandit\r\n" + 
				"Krew;Hughes;121;Las Palmas;0;M;\r\n" + 
				"Hendrix;Norman;28;Paris;0;M;\r\n" + 
				"Dr. Hassan;Summers;16;Málaga;0;M;Shadow,Luke,Tank,Copper\r\n" + 
				"Violet;Correa;137;Iași;0;F;Henry\r\n" + 
				"Presley;Sharp;17;Málaga;3990;F;\r\n" + 
				"Crosby;Galvan;75;Turin;0;M;Samson,Remi,Samson,Remi,Teddy\r\n" + 
				"Lauryn;Norton;82;Bucharest;0;F;Remy\r\n" + 
				"Aya;Evans;10;Duisburg;2066;F;Maverick,Koda,Apollo,Ace,Jackson\r\n" + 
				"Dr. Antonella;Barr;16;Budapest;0;F;Theo,Koda,Riley,Cooper\r\n" + 
				"Hadlee;Ayers;94;Bologna;9542;F;\r\n" + 
				"Aiden;Newton;76;Milan;9870;M;Archie,Ruger,Toby,Oliver,Bubba,Teddy\r\n" + 
				"Angie;Aguirre;79;Nantes;5148;F;Benji,Gus,Scout,Buddy,Chase,Hank\r\n" + 
				"Francesca;Bravo;40;Stockholm;6792;F;\r\n" + 
				"Carl;Le;114;Copenhagen;9950;M;Samson,Baxter,Blaze,Milo\r\n" + 
				"Reina;Brown;23;Bonn;0;F;Buddy,Leo,Prince\r\n" + 
				"Lilian;Powell;41;Szczecin;5191;F;Zeke,Copper,Marley,Gizmo,Benny,Romeo\r\n" + 
				"Lana;Morrison;51;Bucharest;5182;F;Sarge,Cody,Loki,Marley,Ruger\r\n" + 
				"Emerie;Savage;13;Cologne;5268;F;Toby,Arlo,Wally\r\n" + 
				"Tripp;Strong;74;Dresden;790;M;Toby,Wally\r\n" + 
				"Tatum;Salgado;24;Palma de Mallorca;2312;F;Maverick,Max,Winston\r\n" + 
				"Tiana;Jones;64;Brno;8246;F;Louie,Moose\r\n" + 
				"Holden;Novak;113;Karlsruhe;4640;M;Scout,Ollie,Jack,Cash,Moose\r\n" + 
				"Halle;Leblanc;126;Gothenburg;0;F;Louie,Gizmo,Simba,Cash\r\n" + 
				"Davina;Mckenzie;59;Constanța;6214;F;Kobe,Max,Milo,Beau,Simba,Milo\r\n" + 
				"Rodney;Morton;83;Gothenburg;7338;M;Bubba,Shadow,Gucci,George\r\n" + 
				"Kolton;Wiley;33;Mannheim;7991;M;\r\n" + 
				"Junior;Norris;51;Nuremberg;9242;M;Mac,Dexter,Hank,Theo\r\n" + 
				"Graysen;Solis;89;Riga;0;M;Theo,Titan,Tyson,Copper\r\n" + 
				"Ila;Rosario;27;Turin;8308;F;\r\n" + 
				"Ronald;Melton;76;Kraków;0;M;Theo,Winston,Theo,Sam,Diesel,Chip\r\n" + 
				"Maximilian;Mccullough;64;Vila Nova de Gaia;2278;M;Prince,Prince,Ryder,Oliver,Boomer,Atlas\r\n" + 
				"Brandon;Gonzales;52;Düsseldorf;2624;M;Jake,Buddy\r\n" + 
				"Ada;Barnes;29;Barcelona;8491;F;\r\n" + 
				"Simon;Black;107;Lisbon;3985;M;Bowie,Otis,Bruno,Kylo,Bandit\r\n" + 
				"Lance;Crosby;125;Seville;6021;M;Gucci\r\n" + 
				"Hallie;Hester;130;Marseille;3498;F;Ace,King,Remy,Ryder,Joey\r\n" + 
				"Ember;Hanna;120;Palma de Mallorca;6314;F;\r\n" + 
				"Adley;Weaver;79;Zagreb;3494;F;Bubba,Chip,Echo,Luke,Whiskey,Henry\r\n" + 
				"Bryce;Stafford;101;Nuremberg;8353;M;\r\n" + 
				"Vihaan;Bryan;115;Cologne;0;M;Thor,Ace\r\n" + 
				"Lucas;Liu;100;Galați;8843;M;Duke,Dozer,King,Chip,Mac\r\n" + 
				"Briana;Bradley;101;Paris;6251;F;Kylo,Porter,Beau\r\n" + 
				"Stephanie;Perkins;125;Münster;5856;F;Baxter,Harry,Bowie,Tyson,Remi\r\n" + 
				"Emery;Gibson;31;Genoa;2416;F;Bo,Rocket,Zeus\r\n" + 
				"Ahmad;Powell;46;Poznań;2636;M;Kylo,Odie,Fluffy\r\n" + 
				"Ellen;Gardner;41;Vienna;224;F;Luke\r\n" + 
				"Musa;Caldwell;80;Murcia;3491;M;Jack\r\n" + 
				"Dr. Maxine;Cunningham;17;Florence;9696;F;Winston,Dozer,Kylo,Luke\r\n" + 
				"Cecelia;Yu;89;Iași;0;F;Joey,Zeke\r\n" + 
				"Kiara;Ayers;121;Budapest;3050;F;Odie,Riley,Gizmo,Blaze\r\n" + 
				"Dr. John;Sullivan;12;Bielefeld;5395;M;Sarge,Tyson,Chester,Cody,Kylo,Hank\r\n" + 
				"Georgia;Fisher;53;The Hague;0;F;\r\n" + 
				"Adley;Snyder;23;Copenhagen;0;F;Echo\r\n" + 
				"Peyton;Bowen;76;Bucharest;4425;M;Kylo,Rusty,Bubba,Odie\r\n" + 
				"Aarav;Zavala;20;Rīga;9318;M;Rocco\r\n" + 
				"Cheyenne;Maynard;110;Bratislava;8713;F;Tank\r\n" + 
				"Dr. Jaylin;Casey;27;Palermo;8138;F;Archie,Chase,Oakley,Jackson\r\n" + 
				"Helena;Johnston;73;Poznań;9051;F;\r\n" + 
				"Kenna;Mcconnell;73;Turin;9359;F;Bandit,Odin\r\n" + 
				"Malachi;O’brien;31;Malmö;3425;M;Axel,Benny,Coco\r\n" + 
				"Haylee;Villarreal;79;Szczecin;3631;F;Bowie\r\n" + 
				"Taylor;Marin;43;Vila Nova de Gaia;277;F;Tucker,Prince,Scout,Thor,Wally,Rudy\r\n" + 
				"Addilyn;Mccullough;56;Łódź;7575;F;Leo,Sarge,Miles\r\n" + 
				"Brodie;Ware;13;Cluj-Napoca;5215;M;Rudy,Bubba,Loki,Watson\r\n" + 
				"Alaia;Burnett;34;Genoa;2077;F;Oliver,Winston,Marley,Milo\r\n" + 
				"Giovanni;Trejo;33;Wuppertal;4498;M;Archie,Theo\r\n" + 
				"Paul;Alvarez;38;Frankfurt am Main;677;M;\r\n" + 
				"Marlowe;Peck;41;Gothenburg;9286;F;Dozer,Cash\r\n" + 
				"Legend;Alvarado;24;Prague;0;M;Romeo,Kylo,Jasper,Whiskey,Odie\r\n" + 
				"Sylas;Acosta;137;Zaragoza;4855;M;\r\n" + 
				"Zhuri;Carlson;112;Bilbao;7905;F;Gus\r\n" + 
				"Kora;Zavala;46;Lyon;8205;F;\r\n" + 
				"Bristol;Schmidt;102;Bielefeld;4410;F;Remy,Kobe,Watson\r\n" + 
				"Dr. Francis;Rivera;68;Iași;4250;M;Joey\r\n" + 
				"Enoch;Felix;34;Cluj-Napoca;0;M;Max\r\n" + 
				"Lillian;Lloyd;87;Aarhus;0;F;Bear,Apollo,Rudy\r\n" + 
				"Santos;Farmer;34;Paris;3871;M;Oakley,Rudy,Koda,Blue,Chester,Hank\r\n" + 
				"Scarlett;Vargas;71;Lublin;6518;F;Echo\r\n" + 
				"Jasmine;Long;35;Dresden;0;F;George,Archie,Cooper\r\n" + 
				"Colby;Moreno;103;Lisbon;1943;M;Romeo,Cody\r\n" + 
				"Dr. Jeffrey;Sweeney;57;Constanța;0;M;Rudy,Rocky,Teddy,Jasper\r\n" + 
				"Eden;Orozco;114;Wrocław;0;F;Remy,Tucker,Cooper,Blaze\r\n" + 
				"Promise;Weber;51;Florence;0;F;Gunner,Koda,Oreo,Kylo\r\n" + 
				"Dr. Azrael;Meyer;88;Szczecin;9233;M;Max,Ziggy,Bear,Oakley\r\n" + 
				"Dr. Tanner;Golden;44;Utrecht;1732;M;Oreo,Leo,Walter,Scout\r\n" + 
				"Emerald;O’connor;134;Genoa;0;F;Chase,Loki,Rocco,George\r\n" + 
				"Bradley;James;93;Murcia;242;M;Dexter,Cash\r\n" + 
				"Cody;Wyatt;97;Münster;0;M;Ollie,Benji\r\n" + 
				"Mathew;Burch;26;Paris;5986;M;Koda,Joey,Jake,Blaze\r\n" + 
				"Zechariah;Alvarado;11;Sofia;0;M;Maverick,Kylo,Porter,Ruger,Cash\r\n" + 
				"Imani;Stevenson;89;Leipzig;6118;F;Buster,Porter,Walter,Scout\r\n" + 
				"Benjamin;Hester;61;Łódź;1048;M;Charlie,Remi,Jack,Ranger\r\n" + 
				"Bruno;Neal;104;Helsinki;7392;M;Porter,Romeo,Lucky\r\n" + 
				"Bryson;Nuñez;48;Seville;0;M;Miles,Titan,Louie,Buddy,Marley,Peanut\r\n" + 
				"Hank;Lamb;113;Seville;0;M;Oreo,Rocco\r\n" + 
				"Terry;Benjamin;81;Milan;9113;M;Harley\r\n" + 
				"Francesca;Pham;123;Berlin;6878;F;Dozer,Arlo,Bailey,Tyson\r\n" + 
				"Daisy;Mosley;55;Bucharest;7085;F;Teddy\r\n" + 
				"Logan;Blackburn;47;Rome;0;M;Tucker,Lucky\r\n" + 
				"Kori;Vincent;110;Mannheim;1932;F;Jasper,Fluffy,Jackson,Milo\r\n" + 
				"Dr. Julian;Brown;106;Dortmund;7711;M;Lucky,Mac,Finn,Maverick,Atlas,King\r\n" + 
				"Emmett;Sawyer;105;Zaragoza;9273;M;Archie,Ranger\r\n" + 
				"Callum;Mejia;62;Madrid;0;M;Shadow,Simba,Dozer,Remi\r\n" + 
				"Kamari;Archer;22;Münster;0;M;\r\n" + 
				"Reginald;Savage;51;Utrecht;4835;M;Teddy,Kylo\r\n" + 
				"Bryant;Fleming;98;Riga;629;M;Apollo,Ozzy\r\n" + 
				"Messiah;Kaur;13;Szczecin;7053;M;Rocky,Gucci\r\n" + 
				"Christian;Hunt;36;Timișoara;8335;M;Riley,Henry,Luke,Copper,Lucky\r\n" + 
				"Benicio;Haynes;106;Cologne;6931;M;Arlo,Miles,Odin,Thor,Rocket,Bruno\r\n" + 
				"Cameron;Marsh;112;Madrid;0;F;Simba\r\n" + 
				"Cory;Finley;75;Poznań;8082;M;Harry\r\n" + 
				"Kobe;Diaz;127;Prague;7616;M;Teddy,Duke,Luke,Scout\r\n" + 
				"Dr. Kiana;Sharp;117;Copenhagen;6814;F;Peanut,Harry,Simba,Rocco,Gunner\r\n" + 
				"Quentin;Woods;38;Prague;0;M;Benny,Gizmo,Bubba,Theo\r\n" + 
				"Poppy;Lowe;49;Naples;533;F;\r\n" + 
				"Yehuda;Webster;13;Budapest;6680;M;Louie,Ace,Wally,Cooper\r\n" + 
				"Raelyn;Dean;22;Galați;6580;F;Gunner,Miles\r\n" + 
				"Emmitt;Medina;40;Stockholm;3028;M;Ryder\r\n" + 
				"Azariah;Cortes;105;Valmiera;1195;F;Archie,Zeke,Oreo,Sarge,Levi,Atlas\r\n" + 
				"Emmett;Cruz;84;Utrecht;3390;M;Dexter,Sam\r\n" + 
				"Cannon;Patton;68;Münster;0;M;Chase,Ryder,Atlas,Sam,Thor\r\n" + 
				"Stephen;Stone;123;Bochum;0;M;Bear,Porter\r\n" + 
				"Bruce;Hancock;56;Córdoba;0;M;Jackson,Bowie,Marley\r\n" + 
				"Nathaniel;Stephens;75;Rīga;1410;M;Whiskey,Bubba,Tyson,Bruce,Chip,Diesel\r\n" + 
				"Dr. Zion;Peck;65;Alicante;0;M;Leo,Murphy,Luke,Prince\r\n" + 
				"Mekhi;Casey;66;Catania;0;M;Rudy,Dozer,Kobe,Tyson,Gucci,Bo\r\n" + 
				"Bristol;Klein;83;Münster;2504;F;Samson,Bandit,Finn,Titan,Milo\r\n" + 
				"Lachlan;Kirby;16;Cologne;2659;M;Blue,Rudy,Bentley,Cooper,Bruno\r\n" + 
				"Dr. Alanna;Xiong;24;Constanța;0;F;Remi,Jackson,Harley\r\n" + 
				"Easton;Valentine;62;Vila Nova de Gaia;7344;M;Arlo,Lincoln,Teddy,Sarge,Simba\r\n" + 
				"Jon;Person;43;Sofia;1801;M;Walter,Otis,Cooper,Gizmo\r\n" + 
				"Adan;Vargas;16;Berlin;5447;M;Thor,Diesel,Milo,Jake\r\n" + 
				"Sadie;Shaw;99;Riga;5857;F;Wally,Otis,Porter,Copper,Henry\r\n" + 
				"Clementine;Tucker;24;Amsterdam;0;F;\r\n" + 
				"Nala;Pruitt;121;Constanța;8442;F;Joey\r\n" + 
				"Devon;Calderon;136;Hamburg;563;M;Peanut,Harry,Gunner,Buster\r\n" + 
				"Rylan;Miller;97;Genoa;0;M;Rambo,Jackson,Gunner\r\n" + 
				"Jamari;Atkins;74;Valencia;2498;M;Whiskey,Cash,Chip,Luke,Fluffy\r\n" + 
				"Emmie;Novak;36;Dortmund;1384;F;King,Oscar\r\n" + 
				"Armani;Gross;56;Munich;0;M;Charlie,Odin,Gizmo,Sarge,George\r\n" + 
				"April;Pruitt;123;Florence;0;F;Max,Peanut,Shadow\r\n" + 
				"Ricardo;Cameron;60;Málaga;482;M;Finn,Bowie,Lucky,Jack,Zeus,Bo\r\n" + 
				"Camilla;Massey;129;Constanța;6950;F;Max,Remy\r\n" + 
				"Marilyn;Newman;72;Bochum;0;F;George\r\n" + 
				"Dr. Daniella;Andrade;89;Stockholm;0;F;Marley\r\n" + 
				"Alondra;Frederick;67;Hamburg;6143;F;Charlie\r\n" + 
				"Dr. Taylor;Dyer;101;Sintra;1910;M;Cooper,Arlo,Bruce\r\n" + 
				"Hadley;Blackburn;15;Catania;0;F;Bruno,Charlie,Koda,Bubba,Whiskey\r\n" + 
				"Aryan;Schmidt;138;Zaragoza;1530;M;Bailey,Mac,Kylo,Levi\r\n" + 
				"Alijah;Cantrell;25;Bochum;8459;M;Oreo\r\n" + 
				"Byron;Calderon;44;Karlsruhe;7672;M;\r\n" + 
				"Ricky;Baxter;60;Dresden;2381;M;Coco,Tucker,Sarge\r\n" + 
				"Londyn;Haley;74;The Hague;9911;F;Copper,Marley,Chip,Chip,Oliver,Whiskey\r\n" + 
				"Elyse;Donaldson;78;Milan;690;F;\r\n" + 
				"Dr. Serena;Gomez;43;Wuppertal;2381;F;Maverick,Tank,Oakley,Hank,Axel\r\n" + 
				"Sage;Evans;43;Cluj-Napoca;0;M;Theo,Rocco,Diesel,Benji\r\n" + 
				"Dr. Molly;Bradford;77;Copenhagen;4493;F;\r\n" + 
				"Calvin;Floyd;65;Bari;1750;M;Louie,Oakley\r\n" + 
				"Elianna;Corona;12;Iași;0;F;Tank,Coco,Jackson\r\n" + 
				"Dr. Esteban;Pugh;13;Lyon;0;M;Levi,Walter,Diesel,Henry,Fluffy,Ryder\r\n" + 
				"Kelvin;Montes;130;Las Palmas;0;M;Finn\r\n" + 
				"Dr. Braelyn;Kennedy;32;Bucharest;0;F;\r\n" + 
				"Dr. Alex;Bean;38;Varna;8859;M;\r\n" + 
				"Quincy;Clayton;115;Seville;0;M;Odin,Toby,Cooper,Beau,Kylo,Rocket\r\n" + 
				"Salvatore;Delarosa;127;Galați;6510;M;Coco,Dexter\r\n" + 
				"Yehuda;Mejia;90;Thessaloniki;4203;M;Miles,Ozzy,Sam\r\n" + 
				"Sincere;Fowler;132;Berlin;0;M;\r\n" + 
				"Kimora;Malone;20;Constanța;7782;F;Simba,Ollie,Toby,Samson,Ozzy,Gizmo\r\n" + 
				"Hunter;Holloway;130;Bologna;0;F;Duke\r\n" + 
				"Hugo;Drake;59;Nice;4893;M;Gizmo,Chase\r\n" + 
				"Zoe;Benitez;116;Szczecin;7001;F;Chip,Dexter,Mac,Benji,Ace\r\n" + 
				"Karla;Waller;71;Dortmund;4496;F;Gucci,Bandit,Bruce,Luke,Copper,Bentley\r\n" + 
				"Paisley;Gallagher;119;Bielefeld;0;F;\r\n" + 
				"Abner;Dyer;118;Seville;8312;M;Gunner,Sam\r\n" + 
				"Jovanni;Conrad;119;Stuttgart;0;M;Rocket,Oakley,Murphy,Lucky,Bubba,Gus\r\n" + 
				"Valentino;Xiong;88;Tallinn;8260;M;Ziggy,Gunner,Teddy\r\n" + 
				"Emmett;Hubbard;54;Turin;0;M;Chip,Murphy,Harley,Cooper\r\n" + 
				"Darwin;Sandoval;138;Seville;0;M;Bubba,Prince,Maverick\r\n" + 
				"Jayden;Rowland;124;Nice;0;M;Walter\r\n" + 
				"Jayceon;Harrison;101;Cologne;5971;M;Shadow,Jax\r\n" + 
				"Hakeem;Pham;89;Galați;1361;M;Boomer,Loki,Maverick,Oreo,Samson,Chip\r\n" + 
				"Ronin;Knight;21;Catania;0;M;\r\n" + 
				"Oaklynn;Hill;130;Münster;5245;F;King,Gucci,Chester,Zeus,Miles,Arlo\r\n" + 
				"Elodie;Owen;13;Athens;2002;F;Bruce,Boomer,Ryder,Coco\r\n" + 
				"Bridget;Mcintosh;36;Duisburg;439;F;\r\n" + 
				"Koda;Foster;124;Florence;7492;M;Moose,Thor\r\n" + 
				"Yusuf;Nicholson;23;Tallinn;4585;M;Atlas,Archie,Teddy,Bowie,Simba\r\n" + 
				"Dr. Felipe;Graves;58;Rīga;1927;M;Rocket,Levi,Otis,Peanut,Gunner\r\n" + 
				"Zendaya;Lopez;82;Duisburg;0;F;Echo\r\n" + 
				"Ophelia;George;20;Seville;6091;F;Bowie\r\n" + 
				"Ezra;Sierra;112;Málaga;2759;F;\r\n" + 
				"Dr. Amelie;Randall;34;Brno;0;F;Porter,Fluffy,Toby,Finn\r\n" + 
				"Zoe;Cross;114;Poznań;523;F;Shadow\r\n" + 
				"Dr. Jade;Mullins;17;Hanover;2702;F;Watson,Scout\r\n" + 
				"Kason;Bullock;58;Gdańsk;0;M;Bruce,Jackson,Bo,Charlie,Rocco,Rudy\r\n" + 
				"Ian;Mckenzie;118;Bilbao;6175;M;Rudy,Oreo,Cooper,Ryder\r\n" + 
				"Delilah;Alvarado;139;Turin;6815;F;Marley,Oscar,Joey\r\n" + 
				"Ryland;Bryan;14;Karlsruhe;1757;M;Porter\r\n" + 
				"Jesus;Lynch;88;Bilbao;9134;M;Cooper,Arlo,Gucci,Odin,Kobe,Koda\r\n" + 
				"Remi;Gregory;25;Bremen;0;M;Oreo\r\n" + 
				"Theodora;Jennings;64;Bilbao;0;F;\r\n" + 
				"Maison;Tang;43;Palermo;2159;M;Toby,Shadow\r\n" + 
				"Charlee;Blevins;53;Budapest;0;F;Bailey,Cody,Bruce,Beau,Peanut,Wally\r\n" + 
				"Dr. Jair;Alvarez;116;Iași;7507;M;Buster,Harry,Samson,Riley,Simba\r\n" + 
				"Bryant;Barron;96;Bilbao;4265;M;Dexter,Tank,Bailey,Porter,Baxter\r\n" + 
				"Abdiel;Boyer;132;Catania;9097;M;\r\n" + 
				"Juan;Valdez;33;Bydgoszcz;2049;M;Joey,Ollie,Winston,Axel,Bentley\r\n" + 
				"Macy;Baldwin;55;Brno;3070;F;Hank,Chester,Teddy\r\n" + 
				"Presley;Church;60;Bochum;0;F;Diesel,Cody,Oliver\r\n" + 
				"Royal;Davis;106;Lyon;5451;M;Fluffy,Prince,Archie,Maverick,Harry\r\n" + 
				"Felipe;Rasmussen;66;Florence;7325;M;\r\n" + 
				"Jefferson;Massey;36;Brno;0;M;Lucky,Archie\r\n" + 
				"Jamari;Bowers;82;Hanover;2517;M;Baxter,Buddy,Rudy,Fluffy,Ozzy,Gus\r\n" + 
				"Sara;Trujillo;84;Bilbao;3907;F;Romeo,Simba,Dexter,Harley,Rusty,Maverick\r\n" + 
				"Carolyn;Estrada;92;Bilbao;8012;F;\r\n" + 
				"Rylee;Wilkerson;11;Bologna;4322;F;Winston,Hank,Oliver,Titan,Bandit\r\n" + 
				"Alex;Roach;47;Seville;0;M;Hank,Jake,Gunner,Axel,Tank\r\n" + 
				"Dr. Catherine;Dawson;54;Aarhus;2190;F;Otis,Marley,Simba,Buster,Jax\r\n" + 
				"Kaden;Hogan;41;Amsterdam;1249;M;King,Charlie,Murphy,Zeke,Bentley\r\n" + 
				"Katie;Rogers;54;Wuppertal;0;F;Diesel,Dexter,Murphy\r\n" + 
				"Ishaan;Nielsen;77;Athens;2267;M;Riley,Rudy,Scout,Beau\r\n" + 
				"Haylee;Dougherty;14;Mannheim;0;F;Diesel,Prince\r\n" + 
				"Sara;Zuniga;95;Plovdiv;0;F;Remy,Beau,Rex,Blaze,Oliver\r\n" + 
				"Dr. Corbin;Silva;115;Münster;2644;M;Louie,Hank,Marley\r\n" + 
				"Desmond;Brown;11;Bari;7615;M;Hank,Fluffy\r\n" + 
				"Arlo;Craig;84;Frankfurt am Main;6474;M;Odie,Joey\r\n" + 
				"Wallace;Fowler;14;Nuremberg;0;M;Charlie,Beau,Atlas,Diesel,Tucker,Kylo\r\n" + 
				"Diego;Zuniga;119;Mannheim;2935;M;Gizmo\r\n" + 
				"Amelie;Henry;66;Łódź;3396;F;Copper,Miles,Marley,Ryder\r\n" + 
				"Olive;Sparks;42;Bielefeld;6035;F;Duke\r\n" + 
				"Logan;Bridges;77;Alicante;7764;F;Bubba,Bruce,Murphy,Jack\r\n" + 
				"Malakai;Knox;17;Thessaloniki;9827;M;Ollie,Rocky,Jackson\r\n" + 
				"Peyton;Whitaker;93;Lisbon;0;M;Gunner,Moose,Ranger,Dexter\r\n" + 
				"Donald;Sutton;29;Catania;0;M;Whiskey,Walter,Theo\r\n" + 
				"Grace;Kemp;33;Mannheim;347;F;Duke,Archie,Cash,Jasper\r\n" + 
				"Blake;Truong;121;Thessaloniki;3741;F;Kobe,Prince\r\n" + 
				"Dr. Aries;Vasquez;27;Valencia;3289;M;Cooper,Cody,Oakley,Milo,Louie,Tank\r\n" + 
				"Madelynn;Travis;89;Riga;7468;F;Charlie,Romeo,Copper\r\n" + 
				"Daleyza;Padilla;15;Plovdiv;6665;F;Ace,Milo\r\n" + 
				"Will;Austin;35;Málaga;5640;M;Loki,Prince,Ryder,Luke,Bowie,Rex\r\n" + 
				"Andy;Cobb;110;Essen;5555;M;\r\n" + 
				"Killian;Short;60;Palermo;888;M;Bruce\r\n" + 
				"Jordan;Salas;127;Wuppertal;715;M;Whiskey,Duke,Diesel\r\n" + 
				"Lyric;Sparks;20;Brno;8808;M;Zeus,Rex\r\n" + 
				"Travis;Henson;71;Frankfurt am Main;7431;M;Ace\r\n" + 
				"Rosalee;Blackwell;77;Utrecht;6209;F;Kobe,Cash,Bruce,Whiskey,King\r\n" + 
				"Jillian;Harper;132;Rome;7927;F;Jax,Ace,Murphy\r\n" + 
				"Gerald;Evans;77;Catania;0;M;Watson,Charlie\r\n" + 
				"Genesis;Frazier;97;Gdańsk;282;M;Harley,Gus,Ollie\r\n" + 
				"Demetrius;Zavala;66;Rome;0;M;\r\n" + 
				"Jalen;Mora;21;Lublin;1672;M;\r\n" + 
				"Sadie;Ochoa;131;Valencia;0;F;Ranger,Ryder,Tyson\r\n" + 
				"Julio;Boyer;73;Paris;5516;M;Bentley,Koda\r\n" + 
				"Richard;Donaldson;97;Lublin;0;M;Odie,Milo,Jackson,Hank,Ace\r\n" + 
				"Dr. Raven;Charles;79;Iași;5634;F;Dozer,Bentley,Arlo\r\n" + 
				"Aliza;Davila;27;Stuttgart;0;F;Milo,Atlas,Hank,Cooper,Blaze\r\n" + 
				"Everly;Andrews;68;Plovdiv;2024;F;Gizmo\r\n" + 
				"Caden;Ventura;129;Athens;4613;M;Leo,Theo,Kylo,Bubba\r\n" + 
				"Johanna;Woods;59;Bucharest;0;F;Ryder,Sam,Chase\r\n" + 
				"Alena;Fitzpatrick;49;Frankfurt am Main;0;F;Wally,Porter\r\n" + 
				"Faith;Peck;36;Vila Nova de Gaia;8926;F;Zeus\r\n" + 
				"Ben;Pierce;51;Bilbao;4839;M;Bear,Archie\r\n" + 
				"Isaias;Hamilton;96;Iași;7357;M;Oliver,Otis\r\n" + 
				"Dr. Henrik;Barron;133;Dublin;9615;M;Arlo\r\n" + 
				"Arianna;Lambert;132;Bochum;6901;F;Loki,Remi,Rambo,Bentley,Gizmo,Murphy\r\n" + 
				"Selene;Henderson;21;The Hague;3986;F;Dexter\r\n" + 
				"Celeste;Arellano;138;Galați;6520;F;Romeo,Fluffy,Oreo\r\n" + 
				"Yamileth;Estrada;73;Münster;0;F;Dozer,Chase\r\n" + 
				"Tori;Raymond;113;Łódź;0;F;Oliver,Archie,Moose,Tyson\r\n" + 
				"Ariella;Cannon;105;Duisburg;0;F;\r\n" + 
				"Aila;Dean;113;Duisburg;8081;F;Ranger\r\n" + 
				"Atlas;Heath;125;Hamburg;5102;M;\r\n" + 
				"Cash;Johns;100;Nuremberg;0;M;Buster,Louie\r\n" + 
				"Jamison;Roberson;81;Madrid;0;M;Murphy,Sam,Rocket\r\n" + 
				"Amara;Shaw;128;Malmö;8735;F;Joey,Harry,Theo,Rudy,Bentley,Zeke\r\n" + 
				"Madisyn;Jensen;44;Nuremberg;5163;F;Rex,Jack\r\n" + 
				"Dr. Alia;Beck;65;Galați;9121;F;Cash,Blue,King,Odin,Levi,Buster\r\n" + 
				"Kamila;Moyer;125;Malmö;1740;F;\r\n" + 
				"Dr. Ryker;Dougherty;125;Riga;2938;M;Jack,Max,Lucky\r\n" + 
				"Graysen;Hull;55;Toulouse;3703;M;Prince,Levi,Blaze,Toby,Samson\r\n" + 
				"Adalyn;Beltran;129;Münster;0;F;Porter,Apollo,Ziggy,Mac\r\n" + 
				"Dr. Gia;Wilkins;53;Valencia;2412;F;Porter\r\n" + 
				"Ellen;Barrera;24;Sintra;6578;F;Miles,Harley\r\n" + 
				"Sawyer;Roth;12;The Hague;839;M;Rambo,Lucky,Dexter,Benji\r\n" + 
				"Dani;Barnett;53;Hanover;155;F;Blue,Chase,Rocket,Chase\r\n" + 
				"Garrett;Espinoza;118;Berlin;9047;M;Bentley,Oakley\r\n" + 
				"Kamilah;Sheppard;138;Nantes;4227;F;Riley,Gizmo,Dozer,Benji,Marley\r\n" + 
				"Case;Bartlett;10;Dublin;0;M;Jackson,Murphy\r\n" + 
				"Cruz;Malone;10;Sigulda;0;M;Romeo,Jasper,Zeke,Ziggy\r\n" + 
				"Jaiden;Young;49;Hamburg;6347;M;Romeo,Ranger,Kobe,Oscar\r\n" + 
				"Reina;Marin;48;Karlsruhe;0;F;Cash,Watson,Max,Max\r\n" + 
				"Dr. Cecelia;Gill;49;Stuttgart;1244;F;Cody,Ruger\r\n" + 
				"Milan;Benton;130;Naples;4392;F;\r\n" + 
				"Dr. Jakobe;Weiss;118;The Hague;4269;M;\r\n" + 
				"Kyson;Zimmerman;48;Córdoba;4393;M;\r\n" + 
				"Paxton;Ponce;138;Poznań;1297;M;\r\n" + 
				"Patrick;Tanner;109;Bremen;6024;M;Dozer,Baxter,Max,Axel\r\n" + 
				"Kaylani;Copeland;97;Munich;0;F;\r\n" + 
				"Kalani;O’donnell;118;Szczecin;0;F;Henry,Whiskey,Chase,Beau,Theo,Ruger\r\n" + 
				"Graham;Wise;102;Tallinn;9298;M;Luke,Oliver,Ryder\r\n" + 
				"Henry;Best;109;Antwerp;6169;M;Zeus,Cash,Cody,Cash\r\n" + 
				"Lennon;Cochran;76;Wrocław;9943;F;Sam,Peanut,Chester,Ranger,Henry,Peanut\r\n" + 
				"Lawrence;Mccoy;70;Wrocław;1012;M;Buster,Jack,Titan,Jake\r\n" + 
				"Hadassah;Townsend;95;Rome;473;F;Hank,Duke,Jasper,Sam,Moose,Simba\r\n" + 
				"Chaim;Chandler;48;Helsinki;224;M;Ace,Winston,Zeus,Buddy,Tank\r\n" + 
				"Alden;Cain;110;Copenhagen;622;M;Walter,Rudy,Cash\r\n" + 
				"Julissa;Trevino;83;Milan;3283;F;\r\n" + 
				"Zachariah;Rasmussen;98;Las Palmas;3588;M;Whiskey,Harry,Dexter\r\n" + 
				"Rosa;Anthony;125;Aarhus;0;F;Ryder\r\n" + 
				"Jaxton;Lambert;104;Zagreb;0;M;Louie,Watson,Odie,Gunner\r\n" + 
				"Moses;Xiong;13;Budapest;0;M;Cody,Maverick,Watson,Benji,Rocky,Bubba\r\n" + 
				"Sloan;Villanueva;130;Bilbao;0;F;\r\n" + 
				"Hamza;Mckinney;50;Marseille;5686;M;Oscar,Henry,Sam,Bentley\r\n" + 
				"Zaylee;Lang;29;Palermo;0;F;Loki,Baxter,Gucci\r\n" + 
				"Dilan;Hensley;71;Palermo;0;M;King,Fluffy,Gizmo,Porter,Gunner\r\n" + 
				"Dr. Allyson;Allison;51;Aarhus;2618;F;Riley,Jackson,Ozzy\r\n" + 
				"Marleigh;Quinn;115;Munich;5751;F;Archie,Jax,Remy,Copper,Bowie,Beau\r\n" + 
				"Royal;Mitchell;47;Bonn;156;F;\r\n" + 
				"Paloma;Wall;83;Valmiera;1939;F;Walter,Ruger,Thor,Gizmo,Ruger,Jax\r\n" + 
				"Alessia;Strong;24;Antwerp;7802;F;Ryder\r\n" + 
				"Carlos;Hanson;63;Duisburg;3395;M;Boomer,Ozzy,Chester,Scout,Jake,Oreo\r\n" + 
				"Madelynn;Perkins;121;Milan;4279;F;Lincoln\r\n" + 
				"Dr. Rayne;Lopez;15;Munich;7573;F;Coco\r\n" + 
				"Dr. Remi;Herrera;54;Riga;0;M;Leo\r\n" + 
				"Melvin;Stephens;110;Hanover;7852;M;Walter,Romeo,Riley,Lincoln\r\n" + 
				"Adley;Malone;55;Mannheim;7312;F;Rambo,Axel,Jasper\r\n" + 
				"Wallace;Duarte;18;Paris;1303;M;Toby,Moose,Dexter,Oscar,Bentley\r\n" + 
				"Kori;Stuart;36;Bonn;8589;F;Maverick,Echo,Leo,Loki,Bowie\r\n" + 
				"Saylor;Day;48;Palermo;7819;F;Odin\r\n" + 
				"Dr. Emmett;Stevenson;69;Essen;4272;M;Gus,Joey\r\n" + 
				"Francisco;Clark;52;Budapest;1845;M;Sarge,Loki,Gucci,Chase,Bowie\r\n" + 
				"Brylee;Kline;68;Leipzig;9860;F;Tucker,Axel,Jack,Loki,Remi\r\n" + 
				"Joelle;Ramsey;91;Constanța;0;F;Riley,Bentley\r\n" + 
				"Ryan;Yoder;87;Copenhagen;7893;F;\r\n" + 
				"Kassidy;Brady;63;Bochum;9489;F;Copper\r\n" + 
				"Khari;Mann;60;Cluj-Napoca;6497;M;Rudy,Remy\r\n" + 
				"Tucker;Bowen;124;Essen;0;M;Atlas,Odin,Rudy,Jack,Cash\r\n" + 
				"Royal;Jarvis;130;Rome;3734;F;Rusty,Henry\r\n" + 
				"Amani;Mays;69;Dublin;0;F;Hank\r\n" + 
				"Ariel;Wilkins;51;Zagreb;7440;F;Romeo,Ziggy,Zeke\r\n" + 
				"Maliyah;Allen;111;Madrid;0;F;\r\n" + 
				"Janiyah;Prince;16;Gothenburg;1455;F;Buddy,Rocco,Scout,Murphy\r\n" + 
				"Kian;Bullock;109;Vilnius;6153;M;\r\n" + 
				"Rafael;Gonzales;119;Málaga;0;M;Gunner,Gucci,Sarge,Theo\r\n" + 
				"Dr. Kace;Bean;95;Dublin;4914;M;Walter,Jackson\r\n" + 
				"Oakley;Sloan;12;Amsterdam;0;F;Rusty,Rocco,Rocky\r\n" + 
				"Tripp;Schwartz;98;Turin;8306;M;Marley\r\n" + 
				"Esme;Blanchard;47;Wuppertal;0;F;Titan\r\n" + 
				"Ashton;Atkins;56;Rotterdam;1225;M;Benny\r\n" + 
				"Zainab;Mills;115;Madrid;0;F;Gucci,Lucky,Levi\r\n" + 
				"Ashley;Hartman;114;Palermo;1589;F;\r\n" + 
				"Yehuda;Abbott;60;Vilnius;3987;M;Milo,Leo,Bentley,Bailey,Whiskey,Theo\r\n" + 
				"Lexie;Roy;23;Aarhus;0;F;\r\n" + 
				"Graham;Daugherty;117;Prague;0;M;Shadow,Leo,Scout\r\n" + 
				"Kristian;Baxter;88;Las Palmas;9352;M;Bubba\r\n" + 
				"Madilyn;Howe;108;Amsterdam;0;F;Murphy,Bruno,George,Blaze,Cooper,Gizmo\r\n" + 
				"Presley;Mcintyre;50;Antwerp;0;F;Ruger,Toby,Kylo,Jax,Chester,Walter\r\n" + 
				"Jensen;Fitzpatrick;92;Helsinki;8112;M;Bear,Simba,Tyson,Tank\r\n" + 
				"Charlotte;Ramsey;86;Bucharest;1453;F;Ruger,Arlo,Marley,Romeo\r\n" + 
				"Sarah;Bernard;46;Sofia;8806;F;Chester\r\n" + 
				"Charles;Haley;52;Toulouse;7732;M;Jasper,Peanut\r\n" + 
				"Ephraim;Edwards;114;Timișoara;0;M;Copper,Harley,Shadow,Buster,Ace\r\n" + 
				"Donovan;Warren;91;Wrocław;4363;M;Bubba\r\n" + 
				"Joziah;Wilkins;128;Bonn;0;M;Rex,Leo,Charlie,Gucci,Peanut,Apollo\r\n" + 
				"Kaliyah;Butler;83;Bydgoszcz;7374;F;Rex,Rocco,Dozer,Dozer,Bowie,Boomer\r\n" + 
				"Shiloh;Acevedo;82;Cologne;2293;M;Benny,Benny\r\n" + 
				"Crystal;Butler;130;Varna;0;F;Beau,Chase,Bubba,Teddy,Bo\r\n" + 
				"Davian;Vo;93;Zaragoza;6222;M;Jake,Bentley\r\n" + 
				"Finley;Crane;44;Wuppertal;2512;F;Luke\r\n" + 
				"Zhuri;Carr;109;Gothenburg;1969;F;Cash,Kobe,Murphy,Ryder,Lucky,Benji\r\n" + 
				"Dr. Winnie;Khan;139;Bologna;9890;F;Walter,Tucker,Atlas,Duke,Thor\r\n" + 
				"Coen;Dillon;110;Leipzig;5071;M;Beau,Kylo,Peanut,Boomer\r\n" + 
				"Finley;Moses;52;Helsinki;3756;M;Samson,Odie\r\n" + 
				"Leonidas;Garcia;68;Barcelona;2280;M;Tyson,Lucky,Buddy,Chip,King\r\n" + 
				"Colton;Mueller;64;Athens;9321;M;Bear,Marley\r\n" + 
				"Esmeralda;Shah;50;Varna;3647;F;Marley\r\n" + 
				"Genevieve;Davenport;124;Bratislava;8039;F;\r\n" + 
				"Emery;Manning;25;Nantes;8791;M;\r\n" + 
				"Ashlynn;Banks;44;Essen;6398;F;Rocket,Apollo,Chip,Lincoln\r\n" + 
				"Arturo;Wade;130;Galați;1546;M;Rusty,Bruno\r\n" + 
				"Daniel;Hudson;51;Florence;3988;M;Oscar,Chester,Cooper,Zeus,Finn,Bandit\r\n" + 
				"Sage;Jennings;107;Marseille;552;M;\r\n" + 
				"Robert;Shepard;63;Riga;0;M;Romeo,Chip,King,Blaze,Benny\r\n" + 
				"Jaden;Walsh;42;Lyon;2861;M;Hank,Max,Lucky,Bubba,Ziggy,Fluffy\r\n" + 
				"Gabriela;Fitzpatrick;49;Warsaw;6237;F;Arlo,Ryder,Lincoln,Titan,Simba,Theo\r\n" + 
				"Mya;Stephenson;28;Dortmund;2356;F;Teddy,Gizmo,Rusty,Echo,Oscar\r\n" + 
				"Carmelo;Mcdonald;40;Milan;0;M;Milo,Moose,Prince\r\n" + 
				"Lyra;Woodward;110;Bologna;0;F;Toby,Otis,Diesel\r\n" + 
				"Wallace;Hill;88;Bochum;1925;M;Gunner,Kobe\r\n" + 
				"Dr. Jonathan;Paul;87;Bydgoszcz;5934;M;Riley,Arlo,Samson\r\n" + 
				"Braelynn;Andersen;33;Genoa;4395;F;Winston,Levi,Henry,Scout,Levi\r\n" + 
				"Elisha;Farmer;43;Lisbon;8080;M;Loki,Sam,Marley\r\n" + 
				"Holly;Chung;104;Turin;0;F;Marley,Joey,Fluffy,Rudy,Chester,Diesel\r\n" + 
				"Armani;Floyd;27;Toulouse;9903;F;Remi,Leo,Bruce,Gucci,Jackson\r\n" + 
				"Jordyn;Taylor;109;The Hague;6139;F;Rudy,Samson,Simba\r\n" + 
				"Dr. Emerson;Prince;82;Wuppertal;2941;M;Jack,Murphy,King,Charlie\r\n" + 
				"Forest;Abbott;110;Zaragoza;0;M;Archie,Ryder,Baxter,Jackson,Kobe\r\n" + 
				"Kenia;Lynn;121;Riga;8719;F;Murphy,Watson,Buddy\r\n" + 
				"Aarav;Snyder;116;Alicante;471;M;Lincoln,Tucker,Marley,Whiskey\r\n" + 
				"Shepherd;Moyer;110;Bilbao;1594;M;Ollie\r\n" + 
				"Sky;Gould;110;Alicante;4394;F;Louie,Rocco,Lucky\r\n" + 
				"Princess;Rosario;62;Bratislava;8251;F;Koda,Ace,Riley,Coco,Chase,Teddy\r\n" + 
				"Iliana;Li;131;Kraków;9510;F;Remi,Ace,Watson\r\n" + 
				"Asher;Matthews;68;Thessaloniki;4724;M;Fluffy,Simba,Buddy,Winston,Bo,Riley\r\n" + 
				"Corbin;Carrillo;111;Palma de Mallorca;4762;M;Tucker,Jackson,Ollie\r\n" + 
				"Emmalynn;Blankenship;14;Riga;5828;F;Rocket,Bear,Benji\r\n" + 
				"Jeffrey;Ballard;96;Nantes;2890;M;Finn,Oakley,Odin,Joey,Chip\r\n" + 
				"Helena;Norris;29;Poznań;0;F;Romeo,Maverick,Dexter,Miles,Duke\r\n" + 
				"Barrett;Alvarado;137;Amsterdam;9334;M;Rambo,Atlas,Bear,Ryder,Thor\r\n" + 
				"Tristen;Alfaro;57;Helsinki;5101;M;Ziggy\r\n" + 
				"Harleigh;Melendez;115;Lisbon;6171;F;\r\n" + 
				"Natalia;Rosas;57;Córdoba;9474;F;Sam,Bailey,Benny,Bo,Jax,Remy\r\n" + 
				"Dominik;Robertson;134;Lublin;0;M;Ozzy,Jax,Kobe,Gizmo\r\n" + 
				"Jones;Watkins;23;The Hague;8735;M;Kobe,Jasper,Oakley,Peanut,Bowie,Loki\r\n" + 
				"Niko;Edwards;23;Thessaloniki;9412;M;Cash,Tyson,Watson,Lincoln\r\n" + 
				"Talon;Vang;47;Szczecin;8670;M;\r\n" + 
				"Zoe;Craig;45;Nice;7693;F;Blaze,Bruce,Odin,Louie,Rocky,Sarge\r\n" + 
				"Zachary;Gibbs;85;Florence;2548;M;Koda,Chester\r\n" + 
				"Mark;Xiong;118;Essen;2316;M;Jax,Toby,Otis,Oscar,Bear,Cash\r\n" + 
				"Sylas;Cervantes;42;Genoa;9475;M;Harley,Bentley,Ozzy\r\n" + 
				"Meadow;Phelps;28;Bydgoszcz;9334;F;Peanut,Theo,Gizmo\r\n" + 
				"Everleigh;Woodard;136;Catania;8170;F;Chase,Gucci\r\n" + 
				"Khalani;Brewer;48;Vienna;9343;F;\r\n" + 
				"Korbin;Gomez;116;Wuppertal;4493;M;\r\n" + 
				"Wesson;Lam;113;Milan;4549;M;Bubba,Jake,Miles,Peanut,Dozer\r\n" + 
				"Dr. Rosa;Simmons;55;Rīga;1999;F;Lincoln,Gus,Ozzy,Arlo,Rocky,Oscar\r\n" + 
				"Mario;Camacho;42;Essen;0;M;Gus,Tyson\r\n" + 
				"Cheyenne;Waller;126;Rome;0;F;Fluffy,Max,Jackson,Ollie,Oliver,Bruce\r\n" + 
				"Kenna;Wu;95;Nantes;5791;F;Miles,Cash,Tyson,Bailey,King\r\n" + 
				"Marlon;Dunlap;31;Barcelona;0;M;Tyson,Jack,Levi,Bentley,Buster,Dexter\r\n" + 
				"Everlee;Ware;132;Varna;0;F;Cooper,Joey,Theo,Winston\r\n" + 
				"Bridget;Hall;53;Utrecht;8487;F;Prince,Porter,Joey,Levi,Jax,Jackson\r\n" + 
				"Mary;Hensley;50;Vilnius;0;F;Hank,Rudy,Romeo,Simba,Odie,Marley\r\n" + 
				"Jerry;Garrett;64;Riga;8143;M;Bailey,Apollo,Murphy,Ozzy\r\n" + 
				"Shiloh;Meyers;33;Sigulda;4049;F;Chip,Fluffy,Sam,Ruger\r\n" + 
				"Bella;Sierra;28;Vienna;1529;F;Rocco,Watson\r\n" + 
				"Ellis;Adkins;69;Gothenburg;1953;M;\r\n" + 
				"Emerie;Gentry;78;Hanover;9487;F;Rusty,Bo\r\n" + 
				"Simon;Clark;53;Vienna;6389;M;\r\n" + 
				"April;Bradford;35;Bratislava;6132;F;Chase\r\n" + 
				"Deandre;Castaneda;87;Łódź;2620;M;Echo,Jackson\r\n" + 
				"Celine;Dorsey;20;Munich;0;F;Dozer,Samson\r\n" + 
				"Thiago;Walter;24;Antwerp;8873;M;\r\n" + 
				"Belen;Booth;89;Paris;4643;F;Louie\r\n" + 
				"Santana;Mckee;20;Stockholm;8919;M;\r\n" + 
				"Dr. Aubrey;Cobb;118;Copenhagen;5102;F;Toby,Lincoln\r\n" + 
				"Lewis;Pitts;57;Bratislava;0;M;Mac,Rocco\r\n" + 
				"Royce;House;17;Munich;5752;M;Hank,Benny,Archie,Harley,Chester,Cash\r\n" + 
				"Miley;Crawford;30;Utrecht;8789;F;Buster\r\n" + 
				"Jasiah;Cordova;94;Szczecin;8651;M;Coco,Louie\r\n" + 
				"Dr. Adelyn;Wade;57;Warsaw;0;F;Titan,Ozzy,Zeus,Benny,Tucker\r\n" + 
				"Shawn;Watson;15;Palermo;2854;M;Whiskey,Joey,Levi,Henry,Atlas\r\n" + 
				"Angela;Mcdaniel;63;Cluj-Napoca;4355;F;Hank\r\n" + 
				"Gabrielle;Hardy;124;Stockholm;6601;F;Porter,Thor,Oreo\r\n" + 
				"Blake;Simmons;37;Nice;4537;M;\r\n" + 
				"Astrid;Henry;105;Prague;1305;F;Chester,Blue\r\n" + 
				"Kinslee;Stokes;56;Dresden;9993;F;Bandit,Diesel,Kylo,Marley\r\n" + 
				"Jaxson;Curry;83;Hamburg;0;M;Lincoln,Zeus,Bubba,Henry,Rocco\r\n" + 
				"Archie;Boyle;86;Gdańsk;710;M;Buddy,Arlo,Fluffy,Chase,Diesel,Romeo\r\n" + 
				"Winter;Rojas;31;Mannheim;0;F;Moose,Odie\r\n" + 
				"Sophia;Moody;72;Sigulda;8880;F;Mac,Charlie,George\r\n" + 
				"Stetson;Clements;102;Riga;8367;M;Rocket,Gunner,Chip,Cooper,Finn,Loki\r\n" + 
				"Kataleya;Sparks;132;Tallinn;0;F;Odin,Shadow,Bruce,Lucky\r\n" + 
				"Dr. Alaina;Melendez;48;Malmö;0;F;Rusty,Theo,Lincoln\r\n" + 
				"Corbin;Richmond;64;Cluj-Napoca;819;M;Arlo,Gunner,Teddy\r\n" + 
				"Alani;Villa;86;Gothenburg;0;F;Wally,Jax\r\n" + 
				"Jordyn;Ramsey;90;Vienna;6698;F;Chase,Blaze,Chip,Oakley,Riley\r\n" + 
				"Stanley;Chase;38;Vienna;3816;M;Louie,Teddy,Dozer,Bear\r\n" + 
				"Nia;Rivera;111;Thessaloniki;4381;F;Porter,Titan\r\n" + 
				"Kori;Love;71;Rotterdam;5794;F;\r\n" + 
				"Jaycee;Allison;28;Bielefeld;9858;F;\r\n" + 
				"Gary;Knox;16;Galați;0;M;Ruger,Buster,Henry\r\n" + 
				"Mathias;Randall;23;Cluj-Napoca;7267;M;Archie,Zeke,Toby\r\n" + 
				"Lylah;Peterson;132;Iași;6051;F;Jax,Rocco,Jake,Benji,Diesel,Chip\r\n" + 
				"Dr. Maximus;Moore;44;Frankfurt am Main;8632;M;Joey,Max,Otis,Prince,Archie\r\n" + 
				"Legacy;O’connor;43;Palermo;5661;F;Tyson\r\n" + 
				"Mateo;Hickman;114;Florence;0;M;Bo,Rambo\r\n" + 
				"Selena;Lewis;100;Sofia;8184;F;Bear,Duke,Boomer\r\n" + 
				"Angelina;Enriquez;43;Hanover;5943;F;Rusty,Chase,Thor,Scout,Tank\r\n" + 
				"Alonzo;Henson;114;Dresden;0;M;Oakley,Rocky,Oreo,Benny,Buster\r\n" + 
				"Brittany;Rivera;42;Düsseldorf;0;F;Buddy,Tyson\r\n" + 
				"Cameron;Maynard;115;Sofia;6101;F;Duke,Oreo,Bowie,Oreo,Cody\r\n" + 
				"Raul;Finley;114;Berlin;0;M;Otis,Arlo\r\n" + 
				"Julie;O’brien;104;Cologne;2832;F;Bear\r\n" + 
				"Stormi;Ashley;71;Berlin;2301;F;Chip,Blue,Jack,Rocco,Bear,Leo\r\n" + 
				"Bennett;Santana;13;Bologna;0;M;Sarge,Ollie,Romeo\r\n" + 
				"Noah;Fischer;46;Dublin;6720;M;Walter,Titan,Bailey,Kobe,Ziggy,Blue\r\n" + 
				"Amina;Hardy;73;Helsinki;7512;F;Lincoln,Samson,Lincoln\r\n" + 
				"Robin;Benton;70;Malmö;5825;F;Gunner\r\n" + 
				"Journi;Singleton;40;Kraków;1440;F;Arlo,Tucker\r\n" + 
				"Grayson;Reynolds;123;Seville;349;M;Ranger,Bandit\r\n" + 
				"Fisher;Tran;11;Amsterdam;6088;M;\r\n" + 
				"Krew;Benson;41;Bremen;7517;M;Oakley,Kylo,Milo\r\n" + 
				"Kristopher;Haley;114;Stockholm;1707;M;Tyson,Dozer,Toby,Gucci\r\n" + 
				"Cameron;Lu;73;Toulouse;6788;M;Thor,Blaze\r\n" + 
				"Sabrina;Harmon;57;Wrocław;6962;F;Jax\r\n" + 
				"Kole;Shaw;103;Nice;3928;M;Beau,Jackson,Kobe\r\n" + 
				"Jett;Mccormick;93;Frankfurt am Main;1786;M;Blaze,Jasper,Baxter,Winston,Remy\r\n" + 
				"Alexis;Vasquez;110;Szczecin;0;F;Tank\r\n" + 
				"Lilly;Roman;98;Lisbon;0;F;Whiskey,Tyson,Oakley\r\n" + 
				"Harlan;Kennedy;16;Karlsruhe;7348;M;Simba\r\n" + 
				"Lara;Marin;22;Constanța;0;F;\r\n" + 
				"Novalee;Meadows;124;Bielefeld;0;F;Bear,Jackson,Otis,Arlo,Leo\r\n" + 
				"Abdiel;Duran;49;Milan;7964;M;\r\n" + 
				"Murphy;Franco;59;Prague;0;F;Milo,Chester,Rocky,Odin\r\n" + 
				"Maison;Sanders;25;Düsseldorf;1073;M;Rudy,Fluffy,Ollie\r\n" + 
				"Rhea;Castaneda;77;Valmiera;3735;F;Arlo,Oreo,Beau,Thor,Echo,Bentley\r\n" + 
				"Amaia;Lara;120;Hanover;1990;F;Coco\r\n" + 
				"Mario;Mullen;49;Rome;1076;M;Buddy,Leo\r\n" + 
				"Kennedi;Cochran;110;Dublin;1925;F;Harry\r\n" + 
				"Wallace;Harrington;126;Nuremberg;4359;M;\r\n" + 
				"Uriel;Sherman;34;Thessaloniki;0;M;Oakley\r\n" + 
				"Kash;Charles;98;Rotterdam;1121;M;Prince,Tucker,Bruno,Peanut\r\n" + 
				"Yusuf;Sherman;36;Rome;0;M;Cooper\r\n" + 
				"Carmelo;Webster;14;Dortmund;0;M;Chester\r\n" + 
				"Anna;Ibarra;127;Galați;8834;F;Gizmo,Walter\r\n" + 
				"Kenneth;Meyers;104;Dresden;0;M;Jax,Bruno,Ollie,Otis\r\n" + 
				"Clara;Mclaughlin;56;Florence;1034;F;Romeo,Rudy,Chase,Bubba\r\n" + 
				"Dr. Rene;Bryant;98;Thessaloniki;7120;M;Lucky\r\n" + 
				"Cassius;Jensen;52;Naples;0;M;Rusty,Titan,Samson,Marley,Arlo,Bruno\r\n" + 
				"Noelle;Tanner;100;Dresden;1602;F;\r\n" + 
				"Dr. Ira;Nelson;110;Helsinki;0;M;Bo,Diesel\r\n" + 
				"Alayah;Page;36;Wrocław;1515;F;Walter,Jackson,Harry,Henry,Loki\r\n" + 
				"Jace;Campos;13;Prague;9404;M;Otis,Samson,Walter,Rudy,Chase\r\n" + 
				"Rory;Kirby;98;Münster;0;M;Ryder,Oscar,Charlie\r\n" + 
				"Paola;Norris;79;Las Palmas;8771;F;Marley,Rudy,Ruger,Walter\r\n" + 
				"Dr. Cecelia;Lynch;73;Brno;213;F;Leo,Copper,Rocket\r\n" + 
				"Diego;Collins;92;Sigulda;0;M;Ryder\r\n" + 
				"Dylan;Quinn;81;Naples;923;F;Moose,Benji,Zeus,George,Bandit\r\n" + 
				"Janelle;Walker;106;Duisburg;0;F;Moose,Watson,Buddy,Sarge\r\n" + 
				"Helena;Mosley;44;Florence;0;F;Ollie,Remy,Tank,Buddy,Boomer\r\n" + 
				"Paulina;Huang;39;Sigulda;0;F;George,Porter,Bentley,Otis\r\n" + 
				"Jamir;Xiong;43;Prague;1095;M;Riley\r\n" + 
				"Kelly;Chandler;14;Bremen;0;F;Odin,Gucci,Chase,Blaze,Chase\r\n" + 
				"Kinley;Todd;97;Berlin;8572;F;\r\n" + 
				"Isabella;Barnett;66;Turin;7233;F;Cash,Boomer,Gus\r\n" + 
				"Clarissa;Robbins;62;Lyon;3694;F;Loki,Wally,Dozer\r\n" + 
				"Bryan;Lopez;35;Wrocław;4204;M;Ozzy,Ace\r\n" + 
				"Kobe;Maynard;128;Lyon;0;M;\r\n" + 
				"Dr. Quentin;Jenkins;22;Nantes;3005;M;Apollo,Moose,Loki,Apollo,Echo,Koda\r\n" + 
				"Nala;Boyd;27;Sofia;0;F;Jax,Remi,Bubba\r\n" + 
				"Harold;Galindo;52;Zaragoza;6366;M;Kobe,Duke,Romeo,Bentley,Harry,Harry\r\n" + 
				"Jovie;Hartman;31;Stuttgart;2588;F;Ziggy\r\n" + 
				"Elliott;Horn;24;Athens;6985;F;Harley\r\n" + 
				"Major;Hutchinson;121;Szczecin;0;M;Samson,Benny,Riley,Kobe,Winston,Jackson\r\n" + 
				"Lilly;Howard;120;Murcia;0;F;Joey,Bailey,Remy\r\n" + 
				"Macie;Turner;21;Zagreb;3739;F;King,Oscar,Oliver,Tyson,Toby\r\n" + 
				"Gracelynn;Cervantes;18;Marseille;5249;F;Zeus,Teddy,Thor,Milo\r\n" + 
				"Grace;Lugo;121;Alicante;8905;F;Axel,Rocco,Cody,Henry\r\n" + 
				"Kenia;Wolf;96;Tallinn;8785;F;Arlo,Odie,Jasper,Bandit,Levi,Harry\r\n" + 
				"Tanner;Vargas;125;The Hague;2936;M;King,Bandit,Lincoln\r\n" + 
				"Wesson;Drake;116;Las Palmas;8108;M;Teddy,Tyson,Zeke\r\n" + 
				"Kaleb;Shaffer;86;Wuppertal;4354;M;Odie,Arlo,Zeus,Charlie,Sam,Jake\r\n" + 
				"Keith;Figueroa;44;Bari;0;M;Miles,Teddy,Jax\r\n" + 
				"Layne;Cross;35;Barcelona;0;M;Oscar\r\n" + 
				"Eden;Hunt;111;Brno;4827;M;Max,Bowie,Wally,Gizmo\r\n" + 
				"Novalee;Li;74;Lisbon;0;F;Echo,Odin,Loki\r\n" + 
				"Dior;Bradford;117;Vilnius;9696;F;Odin,Axel,Otis\r\n" + 
				"Monica;Frank;89;Dublin;1875;F;\r\n" + 
				"Gianni;Lynch;25;Timișoara;0;M;Oscar\r\n" + 
				"Archer;Cordova;30;Zaragoza;0;M;Lincoln,Jasper,Jackson,Benji,Blaze,Marley\r\n" + 
				"Rosie;Dillon;117;Nice;0;F;Simba,Peanut,Loki,Kobe,Bear,Titan\r\n" + 
				"Mordechai;Meza;69;Łódź;577;M;Rusty,Benji,Ziggy,Remi,Henry,Theo\r\n" + 
				"Silas;Mora;96;Athens;0;M;Tyson,Toby,Milo\r\n" + 
				"Elaina;Duarte;55;Zaragoza;4014;F;Fluffy\r\n" + 
				"Adaline;Singh;112;Cologne;0;F;Fluffy,Lucky\r\n" + 
				"Jaiden;Bass;69;Dublin;8731;M;Arlo,Joey,Ruger\r\n" + 
				"Sara;Clark;120;Lublin;0;F;Oliver,Remy,Blaze,Mac\r\n" + 
				"Connor;Correa;43;Stockholm;0;M;Baxter,Blue\r\n" + 
				"Jayleen;Decker;75;Seville;3568;F;Gucci,Shadow\r\n" + 
				"Aislinn;Morgan;86;Alicante;0;F;Porter,Levi\r\n" + 
				"Matilda;Gill;139;Valencia;3708;F;Ziggy,Rocco,Koda,Wally,Murphy,Rex\r\n" + 
				"Ryleigh;Wong;103;Seville;2062;F;Miles,Milo\r\n" + 
				"Nathaniel;Todd;100;Varna;1387;M;Benji,Ollie,King\r\n" + 
				"Dawson;Daniel;127;Seville;0;M;Rocco,Toby,Wally,Theo,Chip,Porter\r\n" + 
				"Warren;Adkins;17;Brno;9085;M;Jake,Moose,Loki,Tyson,Rusty\r\n" + 
				"Judah;Sandoval;27;Leipzig;8785;M;Bandit,Max,Theo,Kylo\r\n" + 
				"Rex;Kirby;57;Riga;9102;M;Jake,Ziggy,Bear,Samson\r\n" + 
				"Adonis;Knox;127;Bydgoszcz;3363;M;Lincoln\r\n" + 
				"Alexandria;Lucero;64;Vilnius;0;F;Mac,Miles\r\n" + 
				"Adriel;Frazier;21;Murcia;4078;M;Gizmo\r\n" + 
				"Jamir;Potts;135;Murcia;6431;M;Atlas,Blaze,Tucker,Levi,Cooper,Murphy\r\n" + 
				"Harrison;Cardenas;50;Rīga;6923;M;Miles,Arlo,Charlie\r\n" + 
				"Serenity;Hancock;136;Cluj-Napoca;0;F;Rocket,Odin\r\n" + 
				"Alia;Rosario;53;Iași;0;F;Thor\r\n" + 
				"Ramona;Carlson;130;Prague;4418;F;\r\n" + 
				"Baker;Benjamin;121;Copenhagen;3519;M;Finn,Cody,Toby,Sarge,Zeke\r\n" + 
				"Sydney;Zavala;96;Bremen;0;F;Gucci,Odie,Jackson,Murphy\r\n" + 
				"Troy;Small;93;Hanover;5878;M;\r\n" + 
				"Logan;Melendez;114;Valmiera;8513;M;Mac,Henry\r\n" + 
				"Reed;Gentry;119;Bologna;5057;M;Odie,Scout,Ozzy,Remi,Ranger,Kylo\r\n" + 
				"Kannon;Carey;34;Szczecin;5023;M;Harley,Rambo,Walter,Oakley\r\n" + 
				"Carmen;Boyer;42;Gdańsk;0;F;Samson,Atlas,Joey,Rex\r\n" + 
				"Mckenna;Reyes;93;Nuremberg;0;F;Moose,Lucky,Tucker,Miles\r\n" + 
				"Mekhi;Dudley;65;Bremen;0;M;Joey,Whiskey,Tyson\r\n" + 
				"Enrique;Brown;47;Milan;0;M;\r\n" + 
				"Dr. Easton;Herrera;131;Riga;4288;M;Bruno,Coco,Bubba\r\n" + 
				"Colter;Cannon;64;Bologna;8812;M;Beau\r\n" + 
				"Corbin;Mcclain;81;Munich;0;M;Oscar,Copper,Harry,Blue,Levi\r\n" + 
				"Bryant;Mason;91;Zaragoza;4423;M;Zeke,Bandit,Miles,Riley,Bruno,Diesel\r\n" + 
				"Jaelynn;Stewart;130;Zaragoza;7163;F;Marley,Diesel,Remy,Moose,Riley\r\n" + 
				"Thea;Curtis;41;Alicante;2510;F;Ruger,Copper,Rusty,Lucky,Porter\r\n" + 
				"Elisa;Bartlett;72;Aarhus;2493;F;Bentley,Arlo,Hank\r\n" + 
				"Ainsley;Farrell;107;Lublin;8206;F;Tucker,Copper\r\n" + 
				"Callahan;Jenkins;137;Málaga;1349;M;Rudy\r\n" + 
				"Dr. Quinton;Caldwell;131;Galați;0;M;Ace\r\n" + 
				"Lucas;Espinosa;46;Stuttgart;0;M;Henry,Peanut\r\n" + 
				"Hadleigh;Winters;14;Galați;7251;F;Archie,Bo\r\n" + 
				"Mack;Padilla;81;Catania;5630;M;Whiskey\r\n" + 
				"Sutton;Fleming;24;Sintra;1058;M;Joey,Baxter\r\n" + 
				"Rocco;Murphy;54;Galați;6937;M;Remi,Beau,Blue,Ruger,Milo,Henry\r\n" + 
				"Fallon;Howell;111;Zagreb;0;F;Lucky,Apollo\r\n" + 
				"Emir;Macdonald;82;Vilnius;0;M;Ozzy,Bear\r\n" + 
				"Malaya;Roberts;11;Bratislava;6397;F;Whiskey,Teddy,Teddy,Odin\r\n" + 
				"Sevyn;Wang;47;Duisburg;3534;F;Benji,Tucker,Rocco,Otis,Odin\r\n" + 
				"Allen;Holt;115;Valencia;0;M;Bruno\r\n" + 
				"Nehemiah;Joseph;81;Bratislava;8704;M;Rocky,Ziggy,Bear,Duke,Jack\r\n" + 
				"Mikayla;Pierce;35;Rīga;1481;F;\r\n" + 
				"Dr. Jaime;Maldonado;103;Vila Nova de Gaia;6679;M;\r\n" + 
				"Antonella;Cantrell;20;Plovdiv;4160;F;\r\n" + 
				"Phillip;Craig;97;Nantes;0;M;Maverick,Henry\r\n" + 
				"Kade;Schneider;116;Budapest;7429;M;Luke,Ziggy,Henry\r\n" + 
				"Cora;Casey;117;Utrecht;8118;F;Sam,Tank,Gucci,Otis,Jax,Riley\r\n" + 
				"Chana;Gibbs;49;Vilnius;8570;F;Maverick\r\n" + 
				"Oaklynn;O’neill;115;Prague;4865;F;\r\n" + 
				"Roselyn;Rosales;115;Sintra;7199;F;\r\n" + 
				"Nyla;Dickson;127;Sofia;0;F;Porter,Rocco,Prince,Gunner,Apollo,Watson\r\n" + 
				"Davion;Cunningham;121;Athens;722;M;\r\n" + 
				"Malani;Singleton;33;Karlsruhe;3040;F;Samson,Loki,Loki,Watson,Rocket,Otis\r\n" + 
				"Santino;Ávila;109;Malmö;1841;M;Milo,Kylo,Fluffy\r\n" + 
				"Annie;Carson;45;Madrid;6537;F;Samson,Theo,Archie,Peanut\r\n" + 
				"Fallon;Rosales;38;Bremen;2538;F;Copper,Gizmo\r\n" + 
				"Waverly;Cline;50;Duisburg;6554;F;Remy,Kylo,Tucker\r\n" + 
				"Knox;Blevins;49;Varna;5928;M;Levi,Finn,Teddy,Sam,Ziggy,Gunner\r\n" + 
				"Morgan;Alvarado;30;Duisburg;4497;F;Dexter,Gizmo,Romeo,Chase\r\n" + 
				"Antonella;Howard;11;Turin;611;F;Dozer,Oscar\r\n" + 
				"Axl;Bates;12;Brno;2871;M;Buster,Thor,Ziggy,Gucci,Remi\r\n" + 
				"Willow;Becker;86;Catania;3413;F;Hank,Rex\r\n" + 
				"Kayleigh;Delgado;74;Valmiera;4672;F;\r\n" + 
				"Cairo;Zimmerman;47;Vila Nova de Gaia;2360;M;Cooper,Gus,Bentley\r\n" + 
				"Jamari;Dunlap;113;Leipzig;0;M;Boomer\r\n" + 
				"Cora;Greer;23;Bydgoszcz;4528;F;Dozer\r\n" + 
				"Alessandro;Byrd;136;Utrecht;9985;M;\r\n" + 
				"Huxley;Mathis;42;Düsseldorf;395;M;Maverick,Moose\r\n" + 
				"Brinley;Wood;45;Tallinn;7373;F;Romeo,Tyson\r\n" + 
				"Devon;Gonzales;44;Tallinn;6094;M;Peanut,Moose\r\n" + 
				"Rose;Owens;67;Bologna;0;F;Simba\r\n" + 
				"Dylan;Bonilla;48;Utrecht;0;F;Henry,Winston,Riley,Apollo,George\r\n" + 
				"Kynlee;Santana;64;Utrecht;4815;F;Rex,Beau,Wally,Jack,Maverick\r\n" + 
				"Jamir;Knight;132;Lyon;9584;M;Sam\r\n" + 
				"Zayne;Massey;98;Valencia;7020;M;Blaze,Marley,Copper\r\n" + 
				"Lennon;Macias;63;Catania;0;F;Milo,Loki,Rocket\r\n" + 
				"Zendaya;Bean;29;Plovdiv;0;F;Gunner,Lucky,Winston,Harry\r\n" + 
				"Archer;Matthews;57;Gdańsk;0;M;Bruce,Kobe,Teddy,Riley,Blue,Cash\r\n" + 
				"Malakai;Vega;108;Alicante;0;M;Max,Walter,Rex\r\n" + 
				"Trenton;Elliott;133;Brno;8103;M;Bubba\r\n" + 
				"Selena;Tapia;61;Zaragoza;1317;F;Loki,Rocco,Bo,Kobe,Jake,Loki\r\n" + 
				"Luciano;Carlson;118;Madrid;0;M;Tank,Coco,Tucker,Jack,Rusty\r\n" + 
				"Ava;Walls;51;Kraków;7962;F;Porter,Ollie,Ziggy,Bruno,Odie,Archie\r\n" + 
				"Delilah;Schwartz;101;Naples;9349;F;Titan,Riley,Romeo,Dozer\r\n" + 
				"Javier;Morris;136;Copenhagen;0;M;Jake,Chip\r\n" + 
				"Camilla;Dudley;64;Prague;709;F;Hank,Wally,Fluffy\r\n" + 
				"Jessie;Magana;139;Aarhus;0;F;Oscar,Miles,Leo\r\n" + 
				"Astrid;Mcpherson;60;Murcia;660;F;Theo,Luke,Chester\r\n" + 
				"Mae;Zavala;132;Helsinki;0;F;Shadow,Rambo,Walter,Remi,Jackson\r\n" + 
				"Ayaan;Stone;95;Zaragoza;404;M;\r\n" + 
				"Ellianna;Mitchell;43;Seville;0;F;Boomer\r\n" + 
				"Aidan;Valencia;128;Dresden;5222;M;Atlas,Harry,Gizmo,Thor,Teddy,Bo\r\n" + 
				"Grady;Malone;55;Essen;3306;M;Mac,Jake,Max,Arlo,Bo\r\n" + 
				"Rocky;Gillespie;58;Wuppertal;0;M;Luke,Bruce,Coco,Oreo,Milo\r\n" + 
				"Luna;Bernard;30;Sofia;3877;F;Rusty,Teddy,Benny,Rex,Walter\r\n" + 
				"Freyja;Lynch;35;Wuppertal;7485;F;\r\n" + 
				"Korbyn;Houston;55;Tallinn;6140;M;Jax,Gucci\r\n" + 
				"Siena;Daniel;101;Athens;0;F;Shadow,Otis,Watson,Arlo\r\n" + 
				"Jaime;Mendez;138;Dresden;9206;M;Bo,Cash,Apollo,Charlie\r\n" + 
				"Isabelle;Ford;46;Iași;0;F;Duke,Marley,Milo,Watson\r\n" + 
				"Kylen;Villalobos;51;Genoa;996;M;Theo\r\n" + 
				"Dr. Samantha;Stevens;128;Bari;7448;F;Ranger,Miles,Sarge,Archie\r\n" + 
				"Amari;Hess;139;Münster;5493;M;Diesel,Ryder,Jack,Chip\r\n" + 
				"Hakeem;Benton;98;Brno;0;M;Tank,Lucky,Rocky\r\n" + 
				"Ben;Vang;66;Frankfurt am Main;0;M;Jake,Baxter\r\n" + 
				"London;Santos;85;Lisbon;5950;F;Buster,Beau\r\n" + 
				"Baylor;Bartlett;54;Stuttgart;9472;M;Rocky,Buster,Baxter,Blaze,Maverick,Cody\r\n" + 
				"Journey;Hampton;109;Seville;1744;F;\r\n" + 
				"Mercy;Ho;34;Sofia;2737;F;Rocky,Jack,Tyson\r\n" + 
				"Dr. Addisyn;Bernard;37;Naples;4136;F;Thor,Dozer,Luke,George,Miles\r\n" + 
				"Presley;Hendricks;47;Zaragoza;1895;F;Koda,Samson,Sarge\r\n" + 
				"Dax;Vasquez;132;Barcelona;1393;M;\r\n" + 
				"Dr. Oaklee;James;113;Mannheim;1386;F;Jack,Mac\r\n" + 
				"Joseph;Hurley;100;Budapest;0;M;Mac,Cash,Bentley\r\n" + 
				"Jeremiah;Arroyo;106;Karlsruhe;0;M;Titan,Bailey,Lincoln\r\n" + 
				"Keegan;Mays;10;Sofia;177;M;Moose\r\n" + 
				"Dr. Eliza;Matthews;76;Gothenburg;0;F;\r\n" + 
				"Hayden;Vo;81;Sofia;0;M;Odie,Loki\r\n" + 
				"Dr. Ellen;Corona;93;Bielefeld;5322;F;\r\n" + 
				"Dr. Kamari;Ayala;125;Athens;4124;F;Chase\r\n" + 
				"Lana;Gillespie;41;Amsterdam;0;F;\r\n" + 
				"Ryan;Herring;78;Düsseldorf;525;M;Beau,Zeus\r\n" + 
				"Quinn;Reed;72;Barcelona;0;F;Remy,Odin,Blaze,Romeo\r\n" + 
				"Cassandra;Moyer;38;Bari;5282;F;Harry,Harley,Bentley,Jackson,Teddy,Lincoln\r\n" + 
				"Dr. Leon;Casey;99;The Hague;0;M;Leo,Scout,Dozer\r\n" + 
				"Jonah;Roman;62;Antwerp;5597;M;Bruno,Charlie,Peanut,Ace\r\n" + 
				"Zyaire;Mcdonald;110;Valencia;8463;M;\r\n" + 
				"Gracie;Powell;91;Iași;2326;F;Apollo\r\n" + 
				"Felix;Richard;113;Varna;9592;M;Jack,Bailey,Marley,Thor\r\n" + 
				"Skylar;Robbins;79;Dortmund;1853;F;Koda,Oliver,Echo,Samson,Ozzy\r\n" + 
				"Hassan;Oliver;110;Sofia;5801;M;Lincoln,Boomer,Baxter,Remi\r\n" + 
				"King;Buchanan;63;Las Palmas;7554;M;Benny,Buddy,Leo,Henry\r\n" + 
				"Callum;Bryan;37;Leipzig;2345;M;Bear\r\n" + 
				"Dr. Jack;Kennedy;72;Bochum;0;M;Arlo,Prince,Henry,Simba,Ozzy,Max\r\n" + 
				"Carolina;Wilkerson;47;Vila Nova de Gaia;7137;F;Loki,Benji\r\n" + 
				"Aden;Boyd;124;Barcelona;9317;M;Leo,Rambo,Copper,Remy\r\n" + 
				"Isla;Stafford;58;Lyon;0;F;Ozzy,Ranger,Gus\r\n" + 
				"Troy;Ford;28;Cluj-Napoca;9456;M;Joey,Titan,Ryder,Milo,Theo\r\n" + 
				"Dr. Jonas;Gallagher;15;Palermo;0;M;Benji,Rambo,Rocco\r\n" + 
				"Armani;Chan;34;Amsterdam;6823;F;Sarge,Bowie\r\n" + 
				"Dr. Colter;Colón;82;Poznań;9541;M;Bandit,Buddy,Chip\r\n" + 
				"Zachariah;Burke;122;Turin;5844;M;Harley,Henry,Mac,Cody,Kobe\r\n" + 
				"Ophelia;Massey;56;Seville;0;F;Kylo,Prince,Leo,Jack,Jax,Miles\r\n" + 
				"London;Dunlap;29;Bremen;5617;F;Echo\r\n" + 
				"Rosalia;Thornton;97;Vienna;0;F;Chip,Thor,Beau,Rex\r\n" + 
				"Dayana;Stuart;102;Vienna;0;F;Whiskey\r\n" + 
				"Paityn;Ávila;84;Constanța;1655;F;Cody,Axel,Blaze,King\r\n" + 
				"Emilio;Rollins;84;Rīga;7724;M;Mac,Gucci,Cody,Porter,Rusty\r\n" + 
				"Charlie;Powers;94;Naples;0;M;Duke,Bruce,Odie,Thor\r\n" + 
				"Raegan;Montes;61;Nuremberg;8908;F;Bo,Lucky,George\r\n" + 
				"Marcel;Rivers;13;Iași;0;M;\r\n" + 
				"Finnley;Knight;52;Amsterdam;0;M;Buddy,Jake,Bailey,Remy,Bentley\r\n" + 
				"Jalen;Woodward;74;Palermo;0;M;Otis,Tucker,Buster,Loki,Rambo\r\n" + 
				"Krew;Glenn;112;Vilnius;8456;M;Ollie,George,Oliver,Coco\r\n" + 
				"Paul;Arellano;125;Bielefeld;6827;M;Lucky,Theo,Harry,Gunner\r\n" + 
				"Kyler;Webster;13;Naples;6655;M;\r\n" + 
				"Carmen;Wilson;60;Aarhus;956;F;Archie,Rocco,Ozzy,Titan,Gunner,Prince\r\n" + 
				"Sawyer;Leblanc;11;Lublin;0;F;Boomer,Kylo\r\n" + 
				"Mazikeen;Coffey;107;Palma de Mallorca;1911;F;Bear\r\n" + 
				"Dr. Azariah;Delgado;31;Seville;4466;M;Archie,Max,Toby,Rocket,Chase\r\n" + 
				"Cash;Mathis;54;Las Palmas;3398;M;Hank,Rocket,Rex,Rocket,Porter,Bear\r\n" + 
				"Emerson;Le;111;Vienna;114;F;Levi,Diesel\r\n" + 
				"Memphis;Macdonald;18;Dublin;0;M;\r\n" + 
				"Angela;Mckay;32;Bologna;0;F;\r\n" + 
				"Nixon;Erickson;118;Düsseldorf;9093;M;Beau,Louie,Benny,King,Ozzy,Baxter\r\n" + 
				"Maxine;Lowery;65;Milan;0;F;Kobe,Wally,Rusty,Rambo,Simba,Coco\r\n" + 
				"Denver;Myers;112;Gdańsk;3693;F;\r\n" + 
				"Alena;Pratt;125;Athens;5918;F;Fluffy\r\n" + 
				"Jaxen;Allen;94;Copenhagen;0;M;Beau,Blaze,Chase,King,Jack,Rocket\r\n" + 
				"Addilynn;Drake;83;Stuttgart;0;F;Diesel,Luke,Cooper,Diesel,Lincoln\r\n" + 
				"Elliot;Brown;109;Nice;0;F;Chester,Bandit\r\n" + 
				"Anakin;Walter;105;Riga;0;M;Odie,Rocky,Jackson\r\n" + 
				"Emerie;Andrade;65;Utrecht;7721;F;Tank,Finn,Joey,Gus,Lucky\r\n" + 
				"Gustavo;Ford;38;Milan;0;M;Bandit,Blue\r\n" + 
				"Dr. Westin;Ferguson;54;Valmiera;3140;M;Winston,Jax,Bubba,Harley\r\n" + 
				"Grey;Hodges;26;Utrecht;3784;M;\r\n" + 
				"Elora;Lee;99;Naples;9471;F;Loki,Oakley,Jasper\r\n" + 
				"Corey;Crawford;50;Zaragoza;0;M;Remi\r\n" + 
				"Lyric;Riley;62;Palermo;4055;M;Oreo,Bentley,Thor,Cody,Benji\r\n" + 
				"Dr. Juan;Jefferson;107;Valencia;5476;M;\r\n" + 
				"Zachariah;Galvan;25;Bucharest;0;M;Charlie\r\n" + 
				"Victoria;Mccarthy;112;Essen;8831;F;Beau,Bear,Tank,Otis,Porter,Jasper\r\n" + 
				"Kendrick;Gregory;31;Riga;0;M;\r\n" + 
				"Isaiah;Costa;110;Dublin;7642;M;Romeo,Henry\r\n" + 
				"Alijah;Banks;36;Hamburg;0;M;\r\n" + 
				"Talia;Phan;117;Galați;454;F;Baxter,Kobe,Oliver,Max,Sam,Apollo\r\n" + 
				"Lee;Murphy;82;Bucharest;8478;M;Romeo,Oscar,Gizmo,Gunner\r\n" + 
				"Dr. Romina;Conway;64;Copenhagen;0;F;Riley,Simba,Rambo\r\n" + 
				"Joelle;Arroyo;122;Szczecin;9176;F;Cody,Theo,Wally\r\n" + 
				"Sarah;Marshall;35;Cluj-Napoca;117;F;Samson\r\n" + 
				"Brooklynn;Delarosa;37;Sofia;6443;F;Cody,Chase,Duke\r\n" + 
				"Erin;Hamilton;106;Genoa;0;F;\r\n" + 
				"Jaxton;Davis;79;Valmiera;8888;M;\r\n" + 
				"Anne;Sanford;51;Timișoara;0;F;Tyson,Rudy,Bentley,Gus,Jack,Buddy\r\n" + 
				"Dr. Bryson;Hunt;101;Frankfurt am Main;1488;M;Leo,Titan\r\n" + 
				"Eve;Ballard;111;Tallinn;0;F;Benny\r\n" + 
				"Scarlette;Harper;72;Bari;0;F;Charlie\r\n" + 
				"Corbin;Escobar;81;Malmö;0;M;Chip,Chip,Chase,Zeus\r\n" + 
				"Gerardo;Jordan;77;Constanța;151;M;Watson,Ziggy,Baxter\r\n" + 
				"Dr. Zhuri;Norman;97;Toulouse;1556;F;Bowie,Gus\r\n" + 
				"Layne;Brady;127;Vilnius;9247;M;Bruno,Ranger\r\n" + 
				"Salem;Diaz;62;Sofia;0;F;Oliver,Ziggy,Buddy,Moose,Simba\r\n" + 
				"Danna;Mathis;104;Warsaw;0;F;\r\n" + 
				"Skylar;Pruitt;51;Bologna;9956;F;Cody,Toby,Archie,Lucky,Bo,Oscar\r\n" + 
				"Dr. Terry;Crosby;121;Milan;7210;M;Beau,Gizmo,Cooper\r\n" + 
				"Jimmy;Chase;110;Vila Nova de Gaia;6321;M;Porter,Tucker,Rambo,Ollie,Buster,Benny\r\n" + 
				"Josephine;Wilkins;35;Vienna;4804;F;Jackson\r\n" + 
				"Caiden;Hodges;61;Essen;2997;M;Bear\r\n" + 
				"Henley;Randolph;109;Hanover;0;F;Gizmo\r\n" + 
				"Rome;Mullins;99;Hamburg;3517;M;Koda,Gucci,Bruce\r\n" + 
				"Bronson;Morris;32;Łódź;3572;M;Bandit,Echo,Oreo\r\n" + 
				"Kyler;Singleton;76;Bochum;0;M;Ryder,Gizmo,Harley,Oscar,Gunner,Miles\r\n" + 
				"Isabel;Williams;72;Palermo;0;F;\r\n" + 
				"Macy;Glass;80;Florence;3594;F;Chester\r\n" + 
				"Harvey;Rosales;59;Bologna;4069;M;Romeo,Jackson,Ziggy,Odie,Porter,Bear\r\n" + 
				"Anastasia;Pierce;77;Duisburg;0;F;Koda,Rocco,Fluffy,Tucker\r\n" + 
				"Bianca;Klein;126;Bari;0;F;\r\n" + 
				"Raya;Gould;49;Hamburg;0;F;Coco,Jax,Max,Rusty\r\n" + 
				"Braelyn;Roy;34;Szczecin;7125;F;Bubba,Remi,Tyson,Thor,Lucky\r\n" + 
				"Julissa;Klein;91;Łódź;1887;F;Walter,Maverick,Ruger,Benji,Dozer,Bailey\r\n" + 
				"Dr. Jada;Vincent;11;Nuremberg;0;F;Oliver,Bailey,Diesel\r\n" + 
				"Kira;Blackwell;74;Málaga;3847;F;\r\n" + 
				"Dr. Taylor;Shepard;20;Essen;7883;M;Jackson,Walter,Bubba,Hank,Rocky\r\n" + 
				"Kali;Chapman;42;Essen;7190;F;Echo,Remy,Watson,Jake,Odin,Oreo\r\n" + 
				"Gage;Booker;79;Murcia;3444;M;\r\n" + 
				"Dr. Jayda;Ayala;51;Varna;852;F;Lucky,Bubba,Milo,Atlas,Riley\r\n" + 
				"Alessandro;Carrillo;57;Bologna;9981;M;Tucker,Cash,Ozzy\r\n" + 
				"Lina;Kane;119;Frankfurt am Main;0;F;Boomer,Tucker,Harley,Theo\r\n" + 
				"Kabir;Sandoval;132;Nantes;1653;M;Cody,Remy,Sarge,Jake,Dozer\r\n" + 
				"Dr. Luciano;Sellers;126;Hanover;6079;M;George,Sam,Jasper,Winston,Chip,Oliver\r\n" + 
				"Madalyn;Banks;48;Stockholm;1489;F;Echo,Rocket,Odin,Louie,Axel\r\n" + 
				"Amari;Hunter;34;Münster;0;F;\r\n" + 
				"Mckinley;Pierce;24;Bielefeld;341;F;Odie\r\n" + 
				"Lennox;Vaughn;133;Bochum;0;M;Bear,Louie\r\n" + 
				"Dr. Wallace;Sellers;25;Nantes;0;M;Bubba,Mac,Louie,Rusty,Rocket,Rambo\r\n" + 
				"Mckinley;Doyle;68;Wrocław;0;F;\r\n" + 
				"Mazikeen;Rice;126;Vila Nova de Gaia;2076;F;Max,Oreo,Max,Buster\r\n" + 
				"Dr. Andrew;Villegas;100;Dublin;4816;M;Bruno,Ziggy\r\n" + 
				"Issac;Guzman;116;Łódź;0;M;Rocket,Dozer,Benji\r\n" + 
				"Bennett;Rogers;23;Cologne;5443;M;Henry,Marley,Prince,Jax,Bear,Louie\r\n" + 
				"Ansley;Glass;34;Dublin;4367;F;Gizmo,Walter,Romeo\r\n" + 
				"Aliya;George;27;Zaragoza;0;F;Rudy,Theo,Bentley,Loki\r\n" + 
				"Alexander;Hogan;111;Rome;0;M;Koda,Echo,Cash,Oscar,Ace\r\n" + 
				"Raegan;Wood;104;Karlsruhe;3444;F;Remy,Jackson,Oreo\r\n" + 
				"Mara;David;110;Rotterdam;0;F;Chester,Chester,Rocco\r\n" + 
				"Nicholas;Peterson;79;Naples;6065;M;Toby,Max,Louie,Harry,Gus\r\n" + 
				"Jaxen;Armstrong;131;Hamburg;0;M;Ranger,Finn,Maverick,Riley,Boomer\r\n" + 
				"Canaan;Kent;136;Stockholm;2279;M;Jake,Charlie\r\n" + 
				"Marvin;Campbell;110;Bratislava;6525;M;Milo,Harley,Watson\r\n" + 
				"Tanner;Monroe;128;Dresden;0;M;\r\n" + 
				"Emily;Duke;76;Barcelona;1984;F;Porter,Dexter,Walter,Rocky\r\n" + 
				"Raelyn;Prince;94;Riga;4343;F;Atlas,Cooper\r\n" + 
				"Makai;Guerra;108;Galați;6764;M;Marley,Lincoln,Simba\r\n" + 
				"Bobby;Conway;112;Wrocław;3023;M;Wally,Samson,Blaze\r\n" + 
				"David;Alvarez;95;Palermo;3805;M;Rambo,Fluffy\r\n" + 
				"Solomon;Quintana;67;Córdoba;628;M;Benji,Apollo\r\n" + 
				"Summer;Williamson;119;Paris;3444;F;Jasper,Rocco,Rambo,Diesel,Porter,Murphy\r\n" + 
				"Gianna;Ramos;41;Málaga;6620;F;Boomer\r\n" + 
				"Sadie;Yoder;30;Thessaloniki;9804;F;\r\n" + 
				"Haylee;Graves;19;Gdańsk;7426;F;\r\n" + 
				"Dalton;Maxwell;14;Bilbao;5712;M;\r\n" + 
				"Jad;Christian;27;Cologne;3058;M;Jackson,Riley,Lincoln,Bandit,Jackson\r\n" + 
				"Paulina;Baxter;29;Thessaloniki;5863;F;\r\n" + 
				"Lukas;Jacobson;53;Dortmund;9293;M;Bruno,Bailey,Diesel,Hank,Romeo,Cody\r\n" + 
				"Juan;Calhoun;121;Wrocław;2966;M;Dozer,Shadow,Fluffy,Diesel,Copper,Harry\r\n" + 
				"Dr. Timothy;Avalos;36;Łódź;0;M;Beau,Dexter,Blue,Odie,Porter,Peanut\r\n" + 
				"Jazmine;Hanson;24;Florence;1638;F;Otis,Ruger,Gus,Ryder,Tucker\r\n" + 
				"Kaden;Luna;56;Sigulda;9762;M;Bowie,Theo\r\n" + 
				"Yasmin;Deleon;122;Bari;0;F;Loki,Toby,Koda,Marley\r\n" + 
				"Zakai;Singleton;34;Zaragoza;2164;M;Ruger,Sam\r\n" + 
				"Kailani;Kelly;112;Thessaloniki;4816;F;Harry\r\n" + 
				"Walker;Robinson;26;Toulouse;9652;M;\r\n" + 
				"Larry;Nash;66;Gdańsk;9588;M;Buddy,Cody\r\n" + 
				"Dr. Harlee;Jacobson;41;Lisbon;2204;F;Harley,Theo\r\n" + 
				"Milani;Walker;112;Bari;255;F;Levi,Kylo\r\n" + 
				"Mckenzie;Reid;14;Vila Nova de Gaia;2535;F;Leo,Oreo,Rocco,Jasper,Bo,Dexter\r\n" + 
				"Dr. Gunnar;Tang;75;Łódź;9960;M;\r\n" + 
				"Israel;Lloyd;50;Thessaloniki;2771;M;Harley,Luke,Walter,Miles,Bentley,Cooper\r\n" + 
				"Brian;Small;46;Vilnius;5149;M;Apollo,Luke,Rambo,Murphy\r\n" + 
				"Mark;Pruitt;61;Aarhus;4010;M;Arlo,Lucky\r\n" + 
				"Giana;Harrington;135;Bielefeld;5835;F;Ryder,Marley,Rambo\r\n" + 
				"Ace;Valenzuela;72;Lyon;0;M;\r\n" + 
				"Grey;Benitez;138;Marseille;8447;M;Rocco,Blaze,Riley,Tyson\r\n" + 
				"Kyle;Coffey;106;Łódź;6229;M;Moose,Lincoln,Harry,Zeke\r\n" + 
				"Cesar;Murillo;80;Vila Nova de Gaia;0;M;Samson,Dozer,Samson,Murphy,Buster\r\n" + 
				"Emberly;Macdonald;69;Rome;0;F;Sarge\r\n" + 
				"Emersyn;Ingram;90;Antwerp;3122;F;Marley,Samson,Duke,Lucky,Oliver\r\n" + 
				"Leanna;Pace;46;Aarhus;8966;F;\r\n" + 
				"Waverly;Torres;13;Rome;6325;F;Loki,Coco,Samson,Thor\r\n" + 
				"Dr. Gideon;Liu;134;Bremen;0;M;Shadow,Copper\r\n" + 
				"Dr. Lainey;Buck;111;Cluj-Napoca;3911;F;Rusty,Ozzy,Jack\r\n" + 
				"Gianna;Spears;74;Amsterdam;2746;F;Chase,Bubba,Oscar,Sarge,Lucky,Whiskey\r\n" + 
				"Riley;O’connell;67;Bielefeld;7651;F;Chip,Jack,Benny,Bowie,Bruno,Simba\r\n" + 
				"Cassidy;Robles;104;Kraków;0;F;Theo,Blue\r\n" + 
				"Stella;Hudson;110;Rome;5651;F;Ruger,Marley,Mac\r\n" + 
				"Major;Stephens;42;Rome;7393;M;Bruce,Teddy\r\n" + 
				"Jovie;Dunlap;36;Szczecin;0;F;Gus\r\n" + 
				"Wayne;Nichols;108;Nantes;0;M;Henry,Oscar,Tyson,Watson,King\r\n" + 
				"Tatum;Molina;70;Duisburg;5080;M;Teddy,Theo,Otis,Sarge\r\n" + 
				"Fletcher;Bruce;62;Marseille;0;M;Beau,Prince,Boomer\r\n" + 
				"Dr. Julian;Dudley;51;Bremen;4368;M;Henry,Chase\r\n" + 
				"Kalel;Mcconnell;69;Cologne;7965;M;Bandit,Bentley,Dexter\r\n" + 
				"Dr. Dylan;Robertson;46;Lyon;4946;F;Sarge\r\n" + 
				"Eve;Jackson;44;Szczecin;0;F;Arlo,Henry,Walter,Remi,Theo\r\n" + 
				"Jaziel;Leon;57;Riga;1728;M;\r\n" + 
				"Kailani;Huynh;97;Las Palmas;8411;F;Oreo,Remi,Porter,Miles,Axel,Bailey\r\n" + 
				"Hank;Hancock;35;Hanover;8711;M;Echo,Rudy,Whiskey\r\n" + 
				"Avery;Flynn;96;Milan;8302;M;Rocco,Echo,Titan,Romeo,Blue\r\n" + 
				"Lyla;Garcia;95;Lisbon;6742;F;\r\n" + 
				"Justice;Tang;36;Tallinn;0;M;Jax,Joey,Levi\r\n" + 
				"Sophie;Mcdaniel;12;Rīga;2428;F;Rocky\r\n" + 
				"Hendrix;Park;14;Amsterdam;0;M;Baxter,Buster,Simba,Gus,Bear,Atlas\r\n" + 
				"Dexter;Coffey;12;Dortmund;1908;M;\r\n" + 
				"Miguel;Moyer;109;Cluj-Napoca;4298;M;Peanut,Koda\r\n" + 
				"Augustine;Wright;19;Zagreb;4390;M;Bubba\r\n" + 
				"Calvin;Nava;97;Gothenburg;0;M;Cody,Ziggy,Buddy,Benny,Rocky\r\n" + 
				"Dr. Opal;Harding;95;Vila Nova de Gaia;5362;F;Bruce\r\n" + 
				"Dr. Marilyn;Buck;39;Gothenburg;7702;F;\r\n" + 
				"Shay;Jacobs;73;Alicante;1020;F;Koda,Zeus,Arlo\r\n" + 
				"Kira;Wright;97;Nuremberg;1487;F;Whiskey,Benny,Buddy,Maverick\r\n" + 
				"Zaria;Webster;36;Stockholm;0;F;Luke\r\n" + 
				"Elaina;Palmer;88;Vilnius;0;F;Levi\r\n" + 
				"Abdullah;Lucero;75;Marseille;5124;M;Ziggy\r\n" + 
				"Jair;Alvarado;120;Szczecin;3898;M;Louie\r\n" + 
				"Mila;Guevara;12;Lisbon;3866;F;Benny,Shadow\r\n" + 
				"Jakob;Villa;133;Wrocław;5472;M;Jackson,Lucky,Theo\r\n" + 
				"Jax;Gillespie;13;Budapest;4251;M;Rambo,Tank,Jax,Chester,Rambo\r\n" + 
				"Dakota;Robles;11;Zaragoza;8516;F;\r\n" + 
				"Harmoni;Levy;53;Rīga;3361;F;Diesel,Max,Remy,Theo,Benny\r\n" + 
				"Jimmy;Shannon;109;Malmö;1572;M;Zeus\r\n" + 
				"Roman;Knapp;10;Barcelona;9565;M;\r\n" + 
				"Aliza;Cortéz;30;Hamburg;8409;F;Rambo,Samson,Jax,Kobe\r\n" + 
				"Davion;Morris;122;Bydgoszcz;0;M;Archie\r\n" + 
				"Dior;Felix;18;Vila Nova de Gaia;2479;M;Charlie,Murphy\r\n" + 
				"Nyla;Klein;26;Wrocław;1283;F;Fluffy,King,Walter,Duke,Gucci,Ace\r\n" + 
				"Ailani;Enriquez;94;Naples;737;F;Baxter,Sam,Ruger\r\n" + 
				"Dr. Omari;Guzman;75;Bratislava;6074;M;Tank,Lincoln,Tank\r\n" + 
				"Kaiya;Aguilar;88;Lublin;0;F;Atlas,Porter,Chester,Jack,Harley,Tank\r\n" + 
				"Phoebe;Rosas;48;Sigulda;0;F;Ace,Peanut,Rocket,Joey,Otis,Luke\r\n" + 
				"Levi;Thornton;135;Gdańsk;624;M;Jackson,Axel,Finn,Simba,Gucci,Kobe\r\n" + 
				"Jack;Rocha;138;Palma de Mallorca;5962;M;Miles\r\n" + 
				"Ronin;Lawrence;65;Alicante;7159;M;George,Apollo,Simba\r\n" + 
				"Kaden;Bautista;38;Lisbon;1480;M;Mac,Bear\r\n" + 
				"Felipe;Lang;17;Warsaw;1427;M;Teddy,Maverick,Gus,Baxter\r\n" + 
				"Ares;Massey;23;Iași;0;M;Sarge,Jake,Buster,Toby,Ozzy\r\n" + 
				"Izabella;Booth;33;Athens;1738;F;Rambo,Mac,Miles,Bruce,Titan\r\n" + 
				"Sierra;Christensen;85;Łódź;0;F;Oliver\r\n" + 
				"Callahan;Luna;106;Zagreb;3343;M;Bowie,George,Gucci,Remy,Marley\r\n" + 
				"Dr. Brynleigh;Neal;36;Varna;7515;F;Jax,Samson,Oakley,Scout,Toby\r\n" + 
				"Dr. Amiyah;Briggs;126;Rome;0;F;\r\n" + 
				"Kaiser;Ahmed;91;Alicante;8307;M;Jack,Gunner,Remi,Winston,Gus,Luke\r\n" + 
				"Cohen;O’neill;107;Florence;2383;M;Riley,Peanut,King,Apollo\r\n" + 
				"Ariella;Russo;10;Frankfurt am Main;0;F;Romeo\r\n" + 
				"Isaac;Delarosa;24;Stuttgart;9059;M;Thor,Echo,Lincoln,Odin,Thor\r\n" + 
				"Ares;Hayden;73;Düsseldorf;4406;M;Gizmo\r\n" + 
				"Belen;Holt;76;Poznań;0;F;\r\n" + 
				"Dennis;Randolph;114;Las Palmas;0;M;King,Cody,Sam,Kylo\r\n" + 
				"Kashton;Underwood;42;Frankfurt am Main;2593;M;Romeo,Sarge,Oakley,Titan\r\n" + 
				"Jimmy;Garrison;36;Varna;5126;M;Loki\r\n" + 
				"Colter;Carrillo;92;Malmö;3568;M;Sam,Dozer,Tyson,Remy,Bruce,Lincoln\r\n" + 
				"Dayana;Mckee;119;Berlin;949;F;\r\n" + 
				"Flora;Cardenas;134;Dresden;8745;F;Sam,Rusty,Bowie\r\n" + 
				"Dakota;Rogers;16;Alicante;1934;M;Walter,Odin,Diesel,Harry,Simba\r\n" + 
				"Ambrose;Hubbard;13;Aarhus;3524;M;Buster,Rocket\r\n" + 
				"Gatlin;Lee;134;Sintra;0;M;Copper,Koda\r\n" + 
				"Daisy;Cunningham;89;Bydgoszcz;414;F;Beau,Zeke\r\n" + 
				"Langston;Woodard;114;Amsterdam;993;M;Oakley\r\n" + 
				"Lennox;Bond;119;Tallinn;0;M;Charlie,Rex,Watson,Bentley,Simba,Dexter\r\n" + 
				"Nathaniel;Hodge;42;Alicante;1158;M;Rocco,Ryder,Archie,Hank\r\n" + 
				"Titus;Stewart;107;Bucharest;0;M;Rex,Oliver,Chester,Leo,Chase,Beau\r\n" + 
				"Elliana;Travis;18;Antwerp;1228;F;Tank,Echo,Rusty,Ozzy\r\n" + 
				"Harmoni;Brown;79;Lisbon;3848;F;Oliver,Cooper,Teddy\r\n" + 
				"Laylah;Bradley;65;Seville;0;F;Ollie\r\n" + 
				"Elyse;Boyd;86;Thessaloniki;1980;F;Baxter,Milo\r\n" + 
				"Elyse;Bartlett;72;Timișoara;0;F;Rex\r\n" + 
				"Nala;Mejia;43;Warsaw;2977;F;Samson,Bear,Harry,Prince,Romeo\r\n" + 
				"Dr. Laylani;Medrano;128;Lisbon;2498;F;Gucci,Bubba,Chip\r\n" + 
				"Camilo;Dodson;139;Bochum;6685;M;Boomer\r\n" + 
				"Cillian;Crane;73;Alicante;0;M;Max,Romeo,Blue,Fluffy,Beau\r\n" + 
				"Frida;Rich;109;Palermo;3319;F;Simba\r\n" + 
				"Kenia;Powers;111;The Hague;0;F;Remi,Lincoln\r\n" + 
				"Briar;Quintero;125;Frankfurt am Main;0;M;Titan\r\n" + 
				"Philip;Cross;93;Galați;0;M;\r\n" + 
				"Wesley;Brewer;102;Zagreb;9986;M;Apollo\r\n" + 
				"Axton;Lloyd;43;Milan;3867;M;Atlas,Kylo,Maverick,Louie,Boomer,Rocket\r\n" + 
				"Karson;Odom;129;Alicante;9845;M;Remi,Wally,Miles,Theo,Ruger,Gus\r\n" + 
				"Daisy;Wilcox;51;Münster;0;F;Oreo,Zeke,King,Gizmo,Riley\r\n" + 
				"Madalynn;Zavala;34;Bucharest;954;F;\r\n" + 
				"Janelle;Gillespie;127;Málaga;7995;F;\r\n" + 
				"Dr. Johnathan;Hudson;94;Vila Nova de Gaia;7779;M;Jasper,Moose,Rusty,Dexter,Bubba\r\n" + 
				"Andrea;Little;93;Galați;495;F;Leo,Gucci\r\n" + 
				"Charleigh;David;65;Córdoba;8149;F;Ziggy,Benny\r\n" + 
				"Justice;Escobar;91;Utrecht;4795;M;\r\n" + 
				"Veronica;Arroyo;104;Dublin;4667;F;\r\n" + 
				"Benicio;Johns;29;Karlsruhe;5086;M;Milo,Milo,Baxter,Jack\r\n" + 
				"Justin;Robertson;120;Varna;0;M;Jake,Odie,Leo,Oliver,Jackson\r\n" + 
				"Brooke;Arroyo;57;Riga;7342;F;Apollo,Jackson,Toby,Samson,Teddy\r\n" + 
				"Isaac;Hess;121;Hamburg;0;M;Ranger,Gucci,Murphy,Marley\r\n" + 
				"Orion;Mccullough;118;Berlin;6429;M;Oliver,Whiskey,Rusty,Gus,Jax,Finn\r\n" + 
				"Mohammed;Collier;116;Sigulda;7616;M;Arlo,Titan,Winston,Sarge,Ollie\r\n" + 
				"Dr. Axton;Fry;112;Paris;752;M;Bubba,Ranger,Copper\r\n" + 
				"Angelo;Archer;118;Valmiera;5616;M;\r\n" + 
				"Blaire;Fox;91;Varna;0;F;Theo,George,Samson\r\n" + 
				"Jovie;Lamb;16;Berlin;3718;F;\r\n" + 
				"Hope;Nolan;107;Antwerp;0;F;Harley,Oscar\r\n" + 
				"Dr. Jayda;Palmer;47;Frankfurt am Main;6600;F;Oreo,Murphy,Oscar,Coco,Teddy\r\n" + 
				"Maddison;Villarreal;100;Alicante;5166;F;Henry,Prince,Dexter\r\n" + 
				"Aniya;Morton;79;Mannheim;0;F;Bruce,Joey,Zeke,Bruce\r\n" + 
				"Camilla;Mcconnell;33;Málaga;9006;F;Gunner,Baxter,Echo,Henry\r\n" + 
				"Jude;Miller;36;Utrecht;7305;M;Jackson,Benji,Bandit\r\n" + 
				"Sergio;Bond;34;Rīga;9702;M;Ace,Rusty,Cash\r\n" + 
				"Dr. Idris;Mccoy;110;Stuttgart;4486;M;Lucky,Coco\r\n" + 
				"Aiden;Rodgers;26;Duisburg;1943;M;Marley,Ollie,Rocco,Diesel\r\n" + 
				"Evan;Byrd;89;Milan;6145;M;Dozer,Echo\r\n" + 
				"Karina;Henson;39;Paris;8906;F;\r\n" + 
				"Langston;Gray;39;Constanța;6293;M;Lincoln,Bentley,Jasper,Mac,Gucci\r\n" + 
				"Nicholas;Avalos;23;Murcia;2782;M;Leo,Luke,Rocket,Apollo,Scout,Jackson\r\n" + 
				"Kallie;Mosley;131;Tallinn;0;F;Bailey\r\n" + 
				"Amaia;Wall;39;Munich;2751;F;Harley\r\n" + 
				"Dr. Archer;Hart;135;Bochum;1610;M;Titan,Jake\r\n" + 
				"Nathalia;Hancock;107;Stuttgart;0;F;Jack,Riley,Murphy,Remi\r\n" + 
				"Easton;Villarreal;51;Berlin;0;M;Louie,Remy\r\n" + 
				"Kyler;Savage;135;Bielefeld;6734;M;Jackson,Coco,Titan,Beau\r\n" + 
				"Luisa;Fletcher;38;Marseille;5821;F;\r\n" + 
				"Arjun;Bowen;57;Naples;0;M;Blue,Toby,Rudy\r\n" + 
				"Jayleen;Elliott;60;Toulouse;0;F;Bowie\r\n" + 
				"Javier;Andersen;51;Málaga;4633;M;Echo,Harley,Buddy,Remi,Gunner\r\n" + 
				"Morgan;Lawrence;125;Sofia;4352;M;\r\n" + 
				"Eddie;Rogers;102;Antwerp;0;M;Buddy,Miles,Benji,Diesel,Baxter,Zeus\r\n" + 
				"Jameson;Mcdonald;101;Aarhus;7622;M;\r\n" + 
				"Arianna;Enriquez;33;Berlin;8245;F;Koda,Buddy\r\n" + 
				"Alaric;Collier;117;Bologna;1998;M;Toby\r\n" + 
				"Hamza;Hickman;121;Gothenburg;2069;M;Ryder,Joey,Chip,Riley\r\n" + 
				"Amanda;Bradley;88;Plovdiv;1422;F;Odie,Zeke\r\n" + 
				"Everlee;Pearson;138;Plovdiv;2336;F;Gus,Diesel,Theo,Dexter\r\n" + 
				"Dr. Idris;Jensen;40;Nice;4734;M;Ollie,Bowie,Benji,Jasper,Echo\r\n" + 
				"Sutton;Wallace;27;Bonn;8334;F;Odie\r\n" + 
				"Steven;Powell;133;Seville;1139;M;Chester,Jax,Odin\r\n" + 
				"Dr. Aarya;Moss;114;Brno;9635;F;Peanut,Sam,Bandit,Max,Rocky\r\n" + 
				"Madison;Orr;133;Prague;0;F;Rusty,Chip\r\n" + 
				"Lyric;Cortéz;87;Vilnius;0;M;Buddy,Harley\r\n" + 
				"Dr. Emilia;Foster;122;Lublin;0;F;\r\n" + 
				"Bonnie;Boyle;30;Bielefeld;6643;F;\r\n" + 
				"Nayeli;Francis;50;Bratislava;1560;F;Oakley,Peanut\r\n" + 
				"Jessie;Hart;37;Lublin;450;F;Kobe,Theo\r\n" + 
				"Iris;Hunter;106;Kraków;9287;F;Ollie,Buddy,Maverick,Romeo\r\n" + 
				"Alisson;Kaur;115;Barcelona;9860;F;Porter,Jake,Sarge\r\n" + 
				"Egypt;Zuniga;128;Naples;441;F;Oscar,Ziggy,Jax,Gus\r\n" + 
				"Paula;Ellison;18;Wrocław;6256;F;Prince,Chester,Murphy,Odie,Simba\r\n" + 
				"Harlem;Avalos;48;Rotterdam;1311;M;Blaze,Tucker,Romeo,Bentley,Winston,Ozzy\r\n" + 
				"Ambrose;Floyd;11;Wuppertal;0;M;Oreo,Rocket,Buster,Diesel,Charlie,Thor\r\n" + 
				"Mason;Bruce;39;Palma de Mallorca;6138;M;\r\n" + 
				"Kelvin;Mcmahon;28;Varna;4348;M;Marley,Remy\r\n" + 
				"Marlon;Anthony;49;Barcelona;866;M;Cody,Tyson,Rocky,Rocco,Oliver\r\n" + 
				"Remy;Burch;50;Naples;0;M;\r\n" + 
				"Walker;Rowe;58;Mannheim;0;M;Prince,Bandit\r\n" + 
				"Reyna;Vaughan;77;Naples;5424;F;Dexter,Dozer,Coco,Ace,Samson,Chip\r\n" + 
				"Ellis;Tang;118;Antwerp;6307;F;Rudy,Archie,Gunner,Chase\r\n" + 
				"Huxley;Tanner;108;Copenhagen;6063;M;Sarge\r\n" + 
				"Alessia;Ho;127;Turin;0;F;Riley,Gizmo,Lincoln,Diesel,Tyson\r\n" + 
				"Jakobe;Esquivel;133;Cluj-Napoca;0;M;Apollo,Marley,Tyson,Chase\r\n" + 
				"Zaire;Avery;82;Nuremberg;1501;M;Ollie,Levi,Jasper,Bear\r\n" + 
				"Valentino;Elliott;21;Łódź;217;M;\r\n" + 
				"Dulce;Hoffman;14;Wrocław;0;F;Samson\r\n" + 
				"Dr. Henry;Mathis;64;Paris;0;M;Rusty,Romeo,Oreo,Chase\r\n" + 
				"Emmy;Callahan;56;Bielefeld;2362;F;Chip,Buddy,Loki,Whiskey,Buddy\r\n" + 
				"Remy;Vargas;99;Gothenburg;983;M;Ace,Arlo\r\n" + 
				"Jovanni;Fleming;56;Rome;6552;M;Jackson,Fluffy,Moose,Zeke,Tank\r\n" + 
				"Ivory;Mendoza;105;Dresden;7178;F;Bear,Jake,Chip,Lucky\r\n" + 
				"Alaiya;Christensen;102;Varna;9031;F;Cash,Jackson,Ozzy,Bailey\r\n" + 
				"Hailey;Hudson;132;Varna;9101;F;Beau\r\n" + 
				"Dane;Briggs;19;Murcia;3101;M;Diesel\r\n" + 
				"Penelope;Lee;83;Mannheim;0;F;Murphy\r\n" + 
				"Raymond;Maddox;40;Helsinki;5940;M;Rudy,Riley\r\n" + 
				"Jemma;Hull;84;Bratislava;3841;F;Jake\r\n" + 
				"Canaan;Avalos;115;Bonn;2663;M;Oscar,Walter,Rocco,Gucci,Sam\r\n" + 
				"Adrianna;Guzman;63;Bochum;6019;F;Dexter,Moose,Sarge,Rocket,Otis,Harry\r\n" + 
				"Marvin;Barker;62;Rotterdam;0;M;Chester,Mac,Boomer,Bruce\r\n" + 
				"Dr. Valeria;Lim;90;Marseille;9434;F;Thor,Diesel,Leo,Cooper,Finn\r\n" + 
				"Annabelle;Luna;129;Paris;3475;F;Maverick,Gus,Diesel,Jax\r\n" + 
				"Dr. Keenan;Maldonado;58;Wuppertal;3093;M;Dexter,Tank,Jake,Miles,Porter\r\n" + 
				"Kalani;Huffman;39;Nice;658;F;Whiskey\r\n" + 
				"Dr. Keenan;Graves;43;Sigulda;1031;M;Rocky,Charlie,Jack,Jax,Walter\r\n" + 
				"Marie;Burnett;130;Las Palmas;5880;F;Ranger,Teddy,Tyson,Copper,Harry,Blaze\r\n" + 
				"Ari;Jones;30;Las Palmas;1378;F;Lincoln,Ruger,Ace,Ryder,Gus,Louie\r\n" + 
				"Harlem;Pope;107;Münster;9083;M;Bandit,Toby,Harley\r\n" + 
				"Ryker;Lu;95;Bydgoszcz;4028;M;Luke,Winston,Jax,Jasper\r\n" + 
				"Andre;Branch;56;Alicante;8469;M;Rocket,Moose,Diesel,Archie,Marley\r\n" + 
				"Adaline;Copeland;106;Bucharest;3585;F;Hank,Bowie,Ozzy,Bowie\r\n" + 
				"Paisley;Morse;22;Antwerp;0;F;Max\r\n" + 
				"Lachlan;Medrano;19;Galați;0;M;Coco,Watson,Jax,Bo,Jackson\r\n" + 
				"Alayna;Hopkins;104;Iași;2143;F;Jackson,Cooper,Bruce,Blaze,Teddy,Finn\r\n" + 
				"Allison;Duncan;40;Münster;9551;F;Chase\r\n" + 
				"Kendall;Church;81;Constanța;6097;F;Leo\r\n" + 
				"Benson;Lynch;104;Bydgoszcz;6336;M;Milo,Luke\r\n" + 
				"Keily;Carroll;68;Bucharest;3252;F;Whiskey\r\n" + 
				"Lauren;Molina;129;Lublin;1259;F;Jasper,Echo,Buddy,Moose,Tank,Murphy\r\n" + 
				"Kellan;Nicholson;138;Varna;5965;M;Remy,Ziggy\r\n" + 
				"Levi;Yates;96;Malmö;0;M;Cody\r\n" + 
				"Andre;Hampton;63;Bari;9806;M;Bentley,Leo,Echo,Oscar,Oakley\r\n" + 
				"Colt;Shepherd;129;Dresden;8618;M;Rex,Watson,Cooper,Chase,Copper\r\n" + 
				"Macy;Peck;115;Rome;369;F;Rudy\r\n" + 
				"Gabriela;Wiley;124;Constanța;3436;F;Bailey,Axel,Mac,Milo,Toby\r\n" + 
				"Lennon;Velez;130;Plovdiv;0;F;Cooper,Buddy,Cody,Toby,Oreo,Oakley\r\n" + 
				"Israel;Zamora;44;Lisbon;6881;M;\r\n" + 
				"Jonathan;Hansen;76;Iași;0;M;Mac,Bruno,Benny,Atlas,Walter,Copper\r\n" + 
				"Nalani;Schneider;56;Malmö;0;F;Dozer,Remy,Lucky\r\n" + 
				"Camila;Benton;105;Stockholm;2343;F;Jax,Louie,Teddy,Chester,Atlas\r\n" + 
				"Dr. Callan;Hudson;19;Szczecin;0;M;Prince\r\n" + 
				"Mohammad;Gibson;19;Palma de Mallorca;2561;M;Copper,Winston,Axel,Bear,Wally\r\n" + 
				"Kyro;Knapp;98;Lyon;4319;M;Milo,Theo\r\n" + 
				"Irene;Burnett;56;Leipzig;5188;F;Ozzy,Diesel\r\n" + 
				"Athena;Cobb;33;Seville;1714;F;Oakley,Jackson\r\n" + 
				"Camilo;Hodges;60;Leipzig;8384;M;Oakley,Blaze,Bo,Toby\r\n" + 
				"Dr. Alexandra;Bailey;136;Toulouse;0;F;Oliver,Simba,Teddy\r\n" + 
				"Jalen;Yoder;136;Stuttgart;4206;M;Jackson,Ruger,Sarge\r\n" + 
				"Theo;Hall;19;Zaragoza;0;M;Dexter,Bailey,Apollo,Blue,Rocco,Bailey\r\n" + 
				"Carolyn;Liu;124;Riga;0;F;Ruger,Remi,Benji,Porter\r\n" + 
				"Rylee;Morrison;76;Berlin;0;F;\r\n" + 
				"Avayah;Chang;43;Bremen;8481;F;Bo\r\n" + 
				"Lorenzo;Johnson;18;Stuttgart;9134;M;Rusty,Rocky,Boomer,Winston,Sam\r\n" + 
				"Wade;Kane;98;Murcia;868;M;Rocco\r\n" + 
				"Alani;Hunter;67;Wuppertal;1539;F;\r\n" + 
				"Abigail;Magana;112;Riga;0;F;Oscar,Ziggy,Oakley,Arlo,Ranger,Lucky\r\n" + 
				"Cillian;Sheppard;103;Amsterdam;0;M;Gunner,Finn,Cooper,Romeo,Buster,Dozer\r\n" + 
				"Uriel;Holloway;63;Dublin;0;M;Ruger,Blue,Baxter,Jake,Watson,Tank\r\n" + 
				"Brock;Ball;59;Utrecht;8805;M;\r\n" + 
				"Wesley;Higgins;79;Turin;0;M;Buddy,Hank,Oakley,Bailey\r\n" + 
				"Nayeli;Jefferson;110;Bologna;6939;F;Titan,Boomer,Harry,Remy\r\n" + 
				"Otto;Bryant;89;Palermo;2769;M;Murphy,Miles\r\n" + 
				"Taylor;Fox;126;Lisbon;2541;F;Tucker,Odie,Gunner\r\n" + 
				"Ellen;Moreno;80;Nice;0;F;\r\n" + 
				"Watson;Morgan;47;Malmö;6459;M;Blaze,Duke\r\n" + 
				"Vanessa;Donaldson;107;Valmiera;6276;F;Beau,Bo,Miles,Marley,Porter\r\n" + 
				"Mac;Thornton;60;Iași;3700;M;\r\n" + 
				"Theodora;Peterson;75;Sintra;0;F;Blaze\r\n" + 
				"Palmer;Dawson;13;Turin;6087;F;Rambo\r\n" + 
				"Caspian;Reyes;78;Vilnius;1499;M;Bear,Chester,Bo,Milo,Lucky,Rex\r\n" + 
				"Isabel;Hood;46;Lisbon;0;F;Toby,Jax,Boomer,Fluffy\r\n" + 
				"Dr. Kye;Bowers;50;Milan;3082;M;Bentley,Gunner,Finn,Buddy\r\n" + 
				"Danny;Tapia;78;Wrocław;4537;M;Thor\r\n" + 
				"Dr. Kylo;Avery;70;Valmiera;5092;M;\r\n" + 
				"Skye;Wolfe;108;Marseille;238;F;Odie,Remi,Bear,Joey,Harry\r\n" + 
				"Alina;Soto;108;Athens;6623;F;Scout,Tank,Wally,Rusty,Oliver\r\n" + 
				"Jamari;Finley;107;Rīga;0;M;Rocky,Moose,Finn,Ryder,Gunner\r\n" + 
				"Sylvia;Haley;45;Constanța;983;F;Toby,Sarge,Rocky,Bailey,Bubba,Rocco\r\n" + 
				"Pierce;Boone;122;Hamburg;7604;M;Thor,Charlie,Gucci,Prince,Fluffy,Oliver\r\n" + 
				"Baylor;Booth;11;Zaragoza;4619;M;Otis,Bentley\r\n" + 
				"Ezequiel;Tucker;92;Málaga;0;M;Bailey,Tank\r\n" + 
				"Nadia;Blackwell;104;Córdoba;2648;F;Bentley\r\n" + 
				"Dr. Jace;Daniels;35;Paris;2301;M;Shadow,Samson,Teddy,Sam\r\n" + 
				"Braylen;Christensen;124;Gdańsk;3112;M;\r\n" + 
				"Dr. Nicole;Benjamin;116;Nantes;9662;F;Fluffy,Levi,Louie,Mac,Kobe\r\n" + 
				"Dr. Alan;Brady;132;Łódź;2654;M;Axel,Rocco,Sarge,Koda\r\n" + 
				"Ainhoa;Burch;28;Seville;8434;F;\r\n" + 
				"Zaylee;Howard;40;Warsaw;3371;F;Wally,Rusty,Oscar,Porter,Harry\r\n" + 
				"Ila;Hester;29;Genoa;251;F;\r\n" + 
				"Jasper;Curtis;104;Florence;0;M;Bandit,Hank,Fluffy,Bandit,Henry\r\n" + 
				"Jason;Correa;66;The Hague;0;M;Maverick,Remy\r\n" + 
				"Ariah;Magana;138;Dortmund;5615;F;Lucky,Baxter,Gizmo\r\n" + 
				"Dr. Sloane;Odom;122;Constanța;6553;F;Sam,Bruce,Rocky,Sarge,Bowie\r\n" + 
				"Aliana;Lin;113;Zagreb;1986;F;Loki,Walter,Marley,Buster,Chase\r\n" + 
				"Elisha;Jackson;83;Bilbao;1602;M;Dozer\r\n" + 
				"Henley;Burnett;35;Poznań;254;F;Shadow,Jack,Dozer\r\n" + 
				"Kali;Harvey;50;Riga;9130;F;Winston,Leo\r\n" + 
				"Guillermo;Brewer;112;Gdańsk;413;M;Gus,Rex\r\n" + 
				"Blair;Snow;99;Hamburg;0;F;\r\n" + 
				"Rhett;Sweeney;80;Rīga;0;M;Jack,Zeus,Tucker,Finn\r\n" + 
				"Silas;Dodson;63;Sintra;7332;M;Porter,Cody,Benny,Buddy\r\n" + 
				"Julio;Kelley;76;Bari;0;M;Rex,Odie,Beau,Lucky,Samson,Harry\r\n" + 
				"Dr. Lola;Mcpherson;110;Valencia;9339;F;King,Max,Gizmo,Riley,Shadow\r\n" + 
				"Bishop;Randall;123;Turin;8057;M;\r\n" + 
				"Orion;Morales;95;Stockholm;3881;M;Lucky,Rocco,Coco,Loki,Hank\r\n" + 
				"Korbin;Fitzgerald;26;Tallinn;9378;M;Hank,George\r\n" + 
				"Kenzie;Mccarthy;21;Budapest;4935;F;Oliver,Oliver,Whiskey,George\r\n" + 
				"Dr. Tessa;Hail;41;Bremen;3652;F;Zeke\r\n" + 
				"Daniela;Griffith;43;Berlin;1977;F;Chase\r\n" + 
				"Sierra;Combs;37;Stuttgart;0;F;\r\n" + 
				"Harris;Peck;80;Vienna;0;M;Cash,Atlas,Lucky,Riley\r\n" + 
				"Camila;Huynh;29;Marseille;7985;F;Wally\r\n" + 
				"Archer;Andrade;139;Münster;5613;M;Tucker,Tucker,Cooper\r\n" + 
				"Noah;Fitzgerald;43;Aarhus;2389;M;George,Bruno\r\n" + 
				"Jayda;Howell;100;Lyon;8429;F;Odin,Duke,Leo,Walter\r\n" + 
				"Milan;Cummings;93;Vienna;0;F;Lincoln,Teddy,Chester\r\n" + 
				"Gary;Sexton;99;Dublin;0;M;Buster,Wally,Bo\r\n" + 
				"Dr. Hugh;Burns;50;Murcia;0;M;\r\n" + 
				"Nash;Callahan;60;Milan;0;M;Mac,Bentley\r\n" + 
				"Phoebe;Mcbride;115;Alicante;2708;F;\r\n" + 
				"Eliza;Burton;84;Gothenburg;3285;F;Rex,Hank,Bowie,Winston,Joey,Jack\r\n" + 
				"Alberto;Nelson;131;Málaga;6365;M;Boomer,Oreo\r\n" + 
				"Kathryn;Lewis;57;Gdańsk;2622;F;Jax,Max\r\n" + 
				"Nylah;Warren;73;Tallinn;7710;F;Ziggy,Tyson,Joey,Samson,Harry\r\n" + 
				"Jazmin;Dalton;35;Iași;909;F;Buddy\r\n" + 
				"Khalil;Benjamin;92;Rīga;0;M;Winston\r\n" + 
				"Landry;Pope;110;Gdańsk;6156;M;\r\n" + 
				"Emmanuel;Frost;119;Palma de Mallorca;9479;M;Max,Rocco,Oscar,Oscar,Jack,Duke\r\n" + 
				"Dr. Conrad;Allen;95;Leipzig;1842;M;Riley,Watson,Otis,Ziggy\r\n" + 
				"Cruz;Berry;48;Zagreb;329;M;Kylo,Harry,Rocket,Blaze,King,Tucker\r\n" + 
				"Frankie;Walters;14;Leipzig;0;M;Rex,Ace,Prince,Gus,Theo,Benny\r\n" + 
				"Sean;Bond;60;Antwerp;7438;M;\r\n" + 
				"Ryann;Strong;27;Zagreb;1975;F;\r\n" + 
				"Jonah;Castillo;131;Constanța;3165;M;Gucci,Murphy,Moose,Bear\r\n" + 
				"Piper;Richmond;25;Iași;7399;F;Mac,Zeus\r\n" + 
				"Lawrence;Felix;80;Alicante;7946;M;Louie,Buster,Luke,Cooper\r\n" + 
				"Ezequiel;Marsh;107;Vila Nova de Gaia;786;M;Ozzy\r\n" + 
				"Morgan;Walsh;84;Palermo;862;F;Remy,Tank,Teddy,Leo,George\r\n" + 
				"Jace;Higgins;139;Amsterdam;4278;M;Shadow,Jax,Rex,Atlas\r\n" + 
				"Kai;Moon;15;Madrid;1615;M;Romeo,Echo\r\n" + 
				"Dr. Judith;Mcfarland;80;Bonn;0;F;Wally,Rudy,Oscar\r\n" + 
				"Jesse;Ward;48;Genoa;0;M;Kylo,Moose\r\n" + 
				"Sterling;Robertson;42;Budapest;3703;M;Arlo,Joey,Sam,Jax\r\n" + 
				"Alaina;Noble;98;Murcia;8143;F;Toby\r\n" + 
				"Dr. Austin;Johns;120;Bari;0;M;Ryder,Rocky\r\n" + 
				"Ronald;Hoffman;97;Utrecht;7202;M;Beau,Joey,Henry,Bruce,Zeus,Miles\r\n" + 
				"Alvin;Fisher;51;Las Palmas;0;M;\r\n" + 
				"Layne;Warren;86;Seville;0;F;Jasper,Cooper,Teddy,Bandit\r\n" + 
				"Melody;Franklin;82;Tallinn;5984;F;\r\n" + 
				"Cairo;Duke;18;Düsseldorf;3005;M;\r\n" + 
				"Caroline;Armstrong;110;Dresden;5634;F;Porter,Odin,Sarge\r\n" + 
				"Xavier;Meadows;24;Bari;0;M;Benny\r\n" + 
				"Aliyah;Bruce;11;Varna;7002;F;Cooper,Rudy,Watson,Bowie\r\n" + 
				"Trevor;Mendez;63;Frankfurt am Main;1188;M;Remy,Buster,Cooper,Buddy,Kobe\r\n" + 
				"Saul;Singleton;35;Aarhus;0;M;Lincoln\r\n" + 
				"Ricky;Waller;84;Dresden;0;M;Oakley\r\n" + 
				"Dr. Joe;Conway;12;Valencia;0;M;Oreo,Blaze,Buddy,Ace,Mac,King\r\n" + 
				"Dr. Ira;Cook;38;Zaragoza;384;M;Jack,Gucci,Coco,Whiskey,Buddy,Dozer\r\n" + 
				"Erin;Lambert;131;Bari;0;F;Oakley,Ryder,Bear,Jackson\r\n" + 
				"Dr. Jeremias;Yang;135;Gdańsk;5200;M;Buddy,Apollo,Chase,George,Miles,Hank\r\n" + 
				"Ember;Rocha;103;Cologne;7173;F;Oakley\r\n" + 
				"Marcellus;Peters;114;Nantes;0;M;Watson,George\r\n" + 
				"Karson;Vo;35;Nuremberg;4201;M;Gizmo,Joey,Theo\r\n" + 
				"Magdalena;Curry;80;Plovdiv;0;F;Rex,Buster,Atlas\r\n" + 
				"Alexander;Flores;137;Gdańsk;9646;M;Watson,Tyson,Samson,Buddy\r\n" + 
				"Alayah;Francis;98;Helsinki;1888;F;Buddy\r\n" + 
				"Mack;Mccann;60;Wuppertal;9969;M;Maverick,Koda\r\n" + 
				"Jayceon;Simpson;129;Palma de Mallorca;0;M;\r\n" + 
				"Owen;Scott;11;Vila Nova de Gaia;0;M;Gunner,Koda,Mac\r\n" + 
				"Dr. Angie;Gray;57;Karlsruhe;658;F;Jasper,Dozer,Walter\r\n" + 
				"Marley;Arnold;82;Bucharest;5504;F;\r\n" + 
				"Lucia;Ball;65;Bologna;0;F;\r\n" + 
				"Dr. Ayla;Jarvis;36;Palermo;3212;F;Jake,Echo,Odie,Zeus,Rocco,Leo\r\n" + 
				"Alisson;Schmitt;103;Wrocław;6765;F;Rusty,Odie,Sam,Otis,Samson\r\n" + 
				"Roman;French;80;Karlsruhe;1204;M;Blue\r\n" + 
				"Juliette;Frost;29;Barcelona;720;F;\r\n" + 
				"Dr. Sarah;Peck;86;Budapest;1696;F;Whiskey,Zeke,Bo\r\n" + 
				"Roselyn;Nash;100;Helsinki;9240;F;\r\n" + 
				"Kamilah;Nava;84;Rīga;2094;F;Finn,Cash,Oscar\r\n" + 
				"Charleigh;Finley;69;Málaga;570;F;Ozzy\r\n" + 
				"Nash;Spence;15;Wuppertal;0;M;Axel,Buster,Winston,Dexter,Mac,Charlie\r\n" + 
				"Dr. Paris;Spence;32;Milan;0;F;Porter,King,Jax,Moose\r\n" + 
				"Clementine;Dalton;95;Cologne;7245;F;Murphy,Chip,Whiskey,King,Sarge\r\n" + 
				"Raina;Snow;18;Bratislava;2920;F;Hank,Murphy,Milo,Samson,Loki\r\n" + 
				"Carly;Dawson;20;Varna;1366;F;Bruno,Atlas,Remi,Tyson,Riley,Harry\r\n" + 
				"Muhammad;Solis;111;Varna;532;M;Duke,Loki,Bear,Sam,Gunner,Rocky\r\n" + 
				"Madeleine;Ruiz;70;Leipzig;8340;F;Rusty\r\n" + 
				"Nathan;Mcpherson;132;Rotterdam;6777;M;Diesel,Odie,Beau,Koda\r\n" + 
				"Dr. Camilla;Little;36;Dresden;0;F;Tucker,Zeke,Gucci\r\n" + 
				"Javier;Mckinney;82;Brno;6814;M;Copper,Porter,Winston,Riley\r\n" + 
				"Sonny;Sparks;26;Vilnius;3943;M;Odin,Rocco,Arlo,Moose,Rex\r\n" + 
				"Jakob;Russell;101;Rotterdam;7082;M;Gus,Blue,Oliver,George,Coco\r\n" + 
				"Quentin;Perez;57;Toulouse;6711;M;\r\n" + 
				"Lilyana;Hurley;100;Sintra;0;F;Simba,Joey,Bruce,Kobe,Harley,Bailey\r\n" + 
				"Kellen;Roberts;13;Poznań;0;M;Dozer,Oakley,Chip,Wally,Bailey,Milo\r\n" + 
				"Hendrix;Kim;39;Aarhus;0;M;George,Jackson,Moose,Porter,Simba\r\n" + 
				"Rey;Wiley;110;Szczecin;0;M;Chip\r\n" + 
				"Dr. Scarlette;Christian;12;Copenhagen;9504;F;\r\n" + 
				"Gunner;Donaldson;116;Palermo;2703;M;Bruce,Benny,Teddy\r\n" + 
				"Walker;Alvarado;102;Sigulda;0;M;Oakley,Gucci\r\n" + 
				"Clarissa;Trejo;124;Rotterdam;6425;F;Jasper,Joey,Rambo,Sarge,Tucker\r\n" + 
				"Emmy;Farrell;34;Valmiera;0;F;\r\n" + 
				"Dr. Daisy;Little;37;Iași;8857;F;Gizmo,Bubba,Ozzy,Murphy,Bowie,Leo\r\n" + 
				"Adele;Blackburn;136;Wuppertal;6790;F;Jack,Finn,Peanut,Zeke\r\n" + 
				"Lilian;Person;114;Brno;5929;F;Odie,Ruger,Odie,Koda\r\n" + 
				"Edith;Cohen;57;Barcelona;1775;F;Arlo,Jax\r\n" + 
				"Karter;Morales;126;Lyon;1613;F;Apollo,Charlie,Loki,Jack,Blaze,Axel\r\n" + 
				"Dr. Hadley;Ho;11;Hamburg;0;F;\r\n" + 
				"Arabella;Williams;106;Kraków;6427;F;Buster,Prince\r\n" + 
				"Grayson;Henderson;83;Paris;5773;M;Jax,Porter,Otis,Odie,Leo,Winston\r\n" + 
				"Anika;Meadows;93;Bielefeld;0;F;Maverick,Harry\r\n" + 
				"Tessa;Rosales;118;Thessaloniki;6934;F;\r\n" + 
				"Zander;Price;46;Málaga;7116;M;Porter,Gus,Diesel,Zeus\r\n" + 
				"Meilani;Shelton;32;Vienna;1939;F;Sam,Loki,Koda,Archie\r\n" + 
				"Theodora;Hanson;68;Budapest;3867;F;Riley,Milo,Harley,Titan,Gus\r\n" + 
				"Jaelynn;Curry;62;Vienna;470;F;Jax,Axel,Chip,Prince\r\n" + 
				"Zariah;Hill;118;Turin;4952;F;Dexter,Romeo,Dozer,Rocco,Atlas,Oakley\r\n" + 
				"Avalynn;Hawkins;92;Essen;1047;F;Kylo\r\n" + 
				"Dominick;Luna;30;Bratislava;0;M;Jack,Cooper\r\n" + 
				"Jayden;Sanford;101;Turin;0;M;King\r\n" + 
				"Jane;Casey;82;Sigulda;1008;F;Cash\r\n" + 
				"Adriana;Hamilton;19;Poznań;0;F;Ryder\r\n" + 
				"Ali;Vazquez;70;Warsaw;6776;M;Bruce,Chester,Luke,Ranger\r\n" + 
				"Cole;Tapia;48;Bremen;8808;M;\r\n" + 
				"Ava;Duke;51;Düsseldorf;9979;F;\r\n" + 
				"Arya;Mullins;36;Malmö;9016;F;Porter,Titan,Tyson,Buster\r\n" + 
				"Kaylee;Crawford;36;Bremen;8898;F;\r\n" + 
				"Joe;Lewis;86;Hanover;0;M;\r\n" + 
				"Megan;Turner;78;Genoa;0;F;Bowie,Chester,Diesel\r\n" + 
				"Aleena;Moore;18;Mannheim;0;F;Cody,Samson\r\n" + 
				"Mohammed;Padilla;82;Paris;7157;M;Murphy,Thor,Prince,Leo,Chester\r\n" + 
				"Adan;Fuentes;31;Varna;2388;M;Koda,Ziggy,Bruno,Gucci,Oscar\r\n" + 
				"Landry;Ayala;130;Athens;5179;F;King,Ryder\r\n" + 
				"Kailey;Case;97;Utrecht;2030;F;\r\n" + 
				"Dr. Galilea;Hull;36;Varna;0;F;\r\n" + 
				"Tristan;Singh;12;Kraków;0;M;\r\n" + 
				"Johanna;Flores;10;Gdańsk;9232;F;Ziggy,Joey,Bandit,Chester,Ollie,Ruger\r\n" + 
				"Axel;Mcdaniel;63;Lyon;5580;M;Benji,Watson\r\n" + 
				"Dr. Sarai;Perez;27;Berlin;0;F;Max\r\n" + 
				"Alvaro;Hill;15;Duisburg;0;M;Toby,Copper\r\n" + 
				"Lauren;Walsh;90;Berlin;7839;F;Marley,Gucci,Diesel,Coco,Charlie\r\n" + 
				"Anais;Griffin;28;Hanover;8269;F;Copper,Boomer,Watson\r\n" + 
				"Dr. Charleigh;Decker;49;Nantes;0;F;Coco,Prince,Rudy\r\n" + 
				"Martin;Riley;42;Utrecht;0;M;\r\n" + 
				"Chanel;Burton;66;Copenhagen;8844;F;\r\n" + 
				"Reese;Rios;24;Warsaw;4842;F;Bowie,Bentley,Maverick,Atlas,Jake\r\n" + 
				"Colson;Patton;107;Budapest;2197;M;Romeo,Ranger,Riley,Rambo\r\n" + 
				"Hadley;Ibarra;11;Malmö;549;F;Watson\r\n" + 
				"Alan;Hammond;80;Duisburg;113;M;\r\n" + 
				"Cooper;Santiago;22;Córdoba;1808;M;\r\n" + 
				"Dr. Harleigh;Hurst;63;Bari;1487;F;\r\n" + 
				"Vincenzo;O’donnell;96;Iași;1763;M;Maverick,Zeus,Baxter,Ziggy,Chester,Zeus\r\n" + 
				"Dr. Russell;Ellis;66;Berlin;3722;M;\r\n" + 
				"Dr. Nyomi;Cunningham;50;Cologne;0;F;Harry,Jack,Ranger,Jackson\r\n" + 
				"Kalel;Welch;29;Rotterdam;9041;M;Scout,Buddy,Bubba,Zeke,Boomer\r\n" + 
				"Connor;Moyer;86;Galați;0;M;Chester,Gizmo,Bruce,Bentley,Shadow,Gus\r\n" + 
				"Enoch;Gordon;65;Mannheim;352;M;Harley,Bubba,Archie,Apollo,Simba\r\n" + 
				"Keily;Fields;119;Las Palmas;4344;F;Teddy,Bubba\r\n" + 
				"Frances;Brennan;103;Bucharest;8150;F;Zeke,Ranger,Whiskey,Archie\r\n" + 
				"Rylie;Hill;33;Vienna;0;F;Fluffy,Buster,Theo,Scout,Max,Rudy\r\n" + 
				"Dominick;Salinas;126;Berlin;958;M;Maverick,Rocco,Zeus,Marley,Bailey,Jax\r\n" + 
				"Laurel;Soto;36;Amsterdam;0;F;\r\n" + 
				"Saint;Galindo;128;Córdoba;5900;M;Remi,Ranger,Rudy\r\n" + 
				"Jaliyah;Lambert;91;Madrid;0;F;Remi,Watson,Ace,Levi,Leo\r\n" + 
				"Dr. Dean;Bennett;128;Bucharest;1986;M;George,Bentley,Teddy,Milo,Ranger\r\n" + 
				"Rosalee;Moyer;138;Hamburg;5069;F;Ace,Benny,Bruno,Gus,Diesel,Rex\r\n" + 
				"Drew;Hanna;135;Vienna;0;F;Blaze\r\n" + 
				"Lilliana;Barnett;123;Sintra;0;F;Peanut,Simba,Theo\r\n" + 
				"Kyle;Blackburn;90;Barcelona;0;M;Kylo,Watson,Rambo,Levi,Maverick,Benny\r\n" + 
				"Reed;O’neal;19;Las Palmas;0;M;Marley,Oscar,Bear,Gucci\r\n" + 
				"Alonso;Myers;137;Naples;0;M;Jake,Bruce,Prince,Bruno,Zeus,Hank\r\n" + 
				"Eithan;Johnston;64;Plovdiv;0;M;Gunner,Archie,Miles,Benji\r\n" + 
				"Brinley;Griffin;24;Dublin;9961;F;Boomer,Oakley,Benji,Lucky,Chip,Mac\r\n" + 
				"Jaxon;Cannon;22;Las Palmas;7444;M;Chase,Odin,Tucker,Gizmo\r\n" + 
				"Kylan;Arellano;130;Bucharest;9460;M;Dozer,Watson,Gus,Buster\r\n" + 
				"Haylee;Ramsey;127;Marseille;2947;F;Jackson,Kylo,Lucky,Oreo,Rocco,Jax\r\n" + 
				"Stevie;Hanson;79;Varna;0;F;Benny,Bo,Arlo,Benny\r\n" + 
				"Maddison;Hopkins;14;Kraków;1173;F;\r\n" + 
				"Dr. Silas;Sullivan;25;Paris;0;M;Bruce,Odie,Marley,Benny\r\n" + 
				"Mackenzie;Walsh;67;Murcia;0;F;Odin\r\n" + 
				"Blair;Gregory;65;Amsterdam;0;F;Oscar\r\n" + 
				"Leif;Mahoney;95;Hamburg;0;M;Rocco,Duke\r\n" + 
				"Isaias;Jacobs;98;Milan;1881;M;Gus,Apollo,Wally,Moose,Samson\r\n" + 
				"Rory;Foley;27;Lublin;3934;M;\r\n" + 
				"Baker;Baldwin;59;Zagreb;7792;M;Rudy,Cody,George,Ruger,Archie\r\n" + 
				"Leif;Colón;18;Genoa;8973;M;Ryder,Tucker,Jake\r\n" + 
				"Felicity;Ramsey;65;Varna;0;F;Ryder,Luke\r\n" + 
				"Aldo;Hayes;28;Bari;1203;M;\r\n" + 
				"Briella;Vasquez;97;Sintra;5296;F;Dexter,Ruger,Levi,Rambo,Dozer\r\n" + 
				"Ty;Michael;36;Duisburg;8816;M;Romeo,Prince,Jack\r\n" + 
				"Kathryn;Soto;43;Turin;0;F;Kobe,Otis,Harry,Archie,Sam,Oakley\r\n" + 
				"Jovanni;Middleton;132;Varna;4270;M;Murphy,Titan,Mac\r\n" + 
				"Siena;Sosa;128;Copenhagen;0;F;King,Bruce,Dozer,Gunner,Archie\r\n" + 
				"Jada;Maynard;66;Utrecht;6665;F;Diesel,Gizmo,Chester,Titan,Romeo\r\n" + 
				"Cash;Maddox;67;Constanța;950;M;Ace,Zeke,Benny\r\n" + 
				"Novalee;Lewis;16;Galați;9081;F;Odin,Dexter,Sam,Gucci,Miles,Ace\r\n" + 
				"Mercy;Salinas;33;Cluj-Napoca;0;F;\r\n" + 
				"Antonella;Rowland;120;Bonn;4154;F;Watson\r\n" + 
				"Kade;Williamson;15;Toulouse;1386;M;Blue\r\n" + 
				"Mariah;Gentry;17;Lublin;7159;F;Otis\r\n" + 
				"Hunter;Jones;27;Hanover;7303;F;George,Miles,Porter,Odie,Romeo,Tank\r\n" + 
				"Rowan;Jennings;105;Berlin;2505;F;Lincoln,Chester,George,Oliver\r\n" + 
				"Dr. Patrick;Richmond;102;Essen;5802;M;Cody,Finn,Teddy\r\n" + 
				"Camilla;Gentry;121;Helsinki;3714;F;Buster,George,Finn\r\n" + 
				"Alayna;Christensen;40;Athens;4309;F;Oscar,Cooper,Remy,Arlo\r\n" + 
				"Gabriella;Horton;93;Berlin;7010;F;\r\n" + 
				"Trinity;Park;89;Malmö;4457;F;Henry,Echo,Tank,Odin,Riley\r\n" + 
				"Israel;Burgess;35;Tallinn;5462;M;Lucky,Bo\r\n" + 
				"Hunter;Macdonald;134;Toulouse;9188;M;Ryder\r\n" + 
				"Lennon;Doyle;43;Nuremberg;877;F;Oscar,Remi\r\n" + 
				"Adriel;Hood;20;Duisburg;0;M;Moose,Tank,Samson,Ranger\r\n" + 
				"Irene;Barton;101;Düsseldorf;5742;F;Jake,Wally\r\n" + 
				"Talon;Zimmerman;59;Brno;0;M;Whiskey,Loki,Zeke,Kylo,Mac\r\n" + 
				"Rogelio;Stephenson;54;Bydgoszcz;4983;M;Rocky,Lucky,Bentley,Buddy,Rambo\r\n" + 
				"Dr. Casen;Cobb;65;Lyon;0;M;Gizmo\r\n" + 
				"Helena;Mathis;77;Zagreb;7928;F;Simba\r\n" + 
				"Mira;Jarvis;26;Stuttgart;265;F;\r\n" + 
				"Sophia;Rosales;28;Bonn;0;F;Jax,Axel,Titan,Hank\r\n" + 
				"Jerry;Lowe;107;Sigulda;1160;M;Remi,Samson,Titan,Bo,Romeo\r\n" + 
				"Taylor;Benjamin;123;Bratislava;7311;F;Rocco,Gus,Rocco,Axel\r\n" + 
				"Haven;Meyer;17;Bucharest;0;F;Miles,Hank,Lincoln\r\n" + 
				"Amelie;Hammond;25;Zagreb;0;F;\r\n" + 
				"Emmy;Ochoa;88;Bratislava;0;F;\r\n" + 
				"Malani;Hammond;53;Gothenburg;4975;F;Benny,Kobe,Teddy,Archie,Rex,Chester\r\n" + 
				"Dr. Colt;Villegas;92;Stockholm;615;M;\r\n" + 
				"Myra;Herrera;21;Münster;1349;F;Gus,Tank,Apollo\r\n" + 
				"Thomas;Estes;15;Valencia;1949;M;Rudy,Theo\r\n" + 
				"Kassidy;Hale;54;Hamburg;0;F;Theo,Dexter\r\n" + 
				"Kamdyn;Mcgee;49;Essen;8955;M;Riley,Diesel,Otis,Bruce,Jax\r\n" + 
				"Eliana;Dyer;112;Zaragoza;0;F;Echo,Ryder\r\n" + 
				"Aarav;Nelson;69;Gothenburg;4514;M;Duke,Kylo\r\n" + 
				"Ibrahim;Velez;56;Wuppertal;8714;M;Romeo,Moose,Murphy,Arlo,Harley\r\n" + 
				"Junior;Mullen;91;Nice;404;M;\r\n" + 
				"Erin;Willis;137;Aarhus;270;F;Levi,Rusty\r\n" + 
				"Londyn;Hood;100;Helsinki;8427;F;Peanut,Tucker,Atlas,Winston,Rex\r\n" + 
				"Jared;House;107;Iași;7806;M;\r\n" + 
				"Kenneth;Gregory;57;Gothenburg;0;M;Simba\r\n" + 
				"Corinne;Boyer;14;Lyon;0;F;Rocco,Gus,Ace,Miles\r\n" + 
				"Madalyn;Shepard;40;Frankfurt am Main;2676;F;Cooper\r\n" + 
				"Oaklyn;Patterson;111;Poznań;9334;F;Marley,Baxter,Kylo,Copper,Theo,Teddy\r\n" + 
				"Dakari;Joseph;32;Prague;0;M;Lucky,Bandit,Luke,Benny,Odie,Maverick\r\n" + 
				"Blaine;Doyle;119;Rotterdam;788;M;Jackson,Blaze,Kobe,Kobe\r\n" + 
				"Santino;Morrison;111;Utrecht;0;M;Riley,Ace\r\n" + 
				"Anaya;Gallegos;103;Athens;0;F;Peanut,Jackson,Luke,Porter\r\n" + 
				"Siena;Kelley;113;Iași;5851;F;Samson,Buddy\r\n" + 
				"Kasen;Pennington;121;Berlin;2871;M;Jasper,Oreo,Chip,Rex,Tank\r\n" + 
				"Sasha;Rosas;128;Constanța;5538;F;Gus,Ozzy,Zeus,Diesel\r\n" + 
				"Stella;Cuevas;116;Barcelona;5433;F;Fluffy,Watson,Kobe,Joey,Beau\r\n" + 
				"Ophelia;Zamora;120;Galați;4665;F;Harley,Bandit,Gus,Blue,Blue,Beau\r\n" + 
				"Daisy;Schwartz;18;Cologne;9758;F;Marley,Charlie\r\n" + 
				"Harlan;Bowman;37;Sofia;5302;M;Titan,Bruno\r\n" + 
				"Ainsley;Murphy;102;Genoa;611;F;Wally\r\n" + 
				"Charlie;Cabrera;93;Toulouse;0;M;Porter,Tucker,Tucker\r\n" + 
				"Tiffany;Soto;90;Leipzig;8978;F;Cody,Milo\r\n" + 
				"Dr. Asher;Ramirez;104;Malmö;5580;M;\r\n" + 
				"Kira;Hinton;16;Dresden;6274;F;Theo,Cody,Blaze,Remi,Bailey\r\n" + 
				"Caspian;Terrell;65;Utrecht;0;M;Gus,Teddy,Walter,Jake\r\n" + 
				"Johan;Schmitt;118;The Hague;0;M;Scout,Rocky,Luke,Marley,Rocky\r\n" + 
				"Ryann;Lawrence;139;Bucharest;9622;F;\r\n" + 
				"Anika;Lara;16;Catania;9950;F;Otis,Bruce,Harley,Cooper,Odie,Leo\r\n" + 
				"Lilah;Erickson;16;Bilbao;4650;F;Kylo,Rusty,Moose,Marley,Bubba,Blue\r\n" + 
				"Zion;Carter;118;Bochum;0;M;Whiskey,Jack,Baxter,Jax\r\n" + 
				"Eve;Ball;59;Palma de Mallorca;0;F;Oliver,Ruger,Bowie,Benny\r\n" + 
				"Cynthia;Owens;69;Dortmund;2604;F;Marley,Levi,Chester,Porter,Henry,Cash\r\n" + 
				"Muhammad;Tapia;133;Milan;6698;M;Cooper,Porter,Apollo,Toby,Louie\r\n" + 
				"Baylor;Hall;45;Barcelona;0;M;\r\n" + 
				"Molly;Bates;94;Stockholm;5138;F;Walter,Oscar,Marley,Koda,Louie\r\n" + 
				"Thea;Howe;45;The Hague;6507;F;Atlas,Apollo,Blue,Duke,Apollo\r\n" + 
				"Dr. Annabella;Ventura;39;Rome;8013;F;Coco,Jax,Titan\r\n" + 
				"Gia;Burns;138;Prague;0;F;Tyson,Buster,Milo,Cooper,Romeo\r\n" + 
				"Alfredo;Choi;136;Murcia;6609;M;Gus\r\n" + 
				"Jazmin;Horton;81;Constanța;7724;F;Chip,Buster\r\n" + 
				"Kalel;Baxter;62;Seville;5167;M;Odie,Ace\r\n" + 
				"Kyler;Craig;131;Alicante;2815;M;Copper,Cooper,Samson,Milo\r\n" + 
				"Kyson;Figueroa;11;Brno;8936;M;Ranger,Tyson,Simba\r\n" + 
				"Eloise;Yang;139;Hamburg;5457;F;Benji,Shadow,Louie,Theo\r\n" + 
				"Cruz;Guevara;118;Naples;6030;M;Buddy,Romeo,Benny,Archie\r\n" + 
				"Sydney;Warren;49;Antwerp;9939;F;Rocket\r\n" + 
				"Charli;Dixon;45;Constanța;5592;F;Buddy,Rusty\r\n" + 
				"Leilani;Vaughan;12;Rotterdam;9783;F;Sam,King,Sarge\r\n" + 
				"Alondra;Spears;23;Bielefeld;6601;F;Baxter\r\n" + 
				"Colin;Conrad;57;The Hague;4767;M;Tyson,Otis,Baxter,Odin\r\n" + 
				"Dr. Jensen;Grimes;45;Leipzig;0;M;Bubba,Echo,Jax\r\n" + 
				"Chaya;Pacheco;100;Stockholm;7460;F;Riley,Winston\r\n" + 
				"Scarlette;Joseph;128;Marseille;7121;F;King,Atlas,Remi,Bubba,Scout\r\n" + 
				"Aidan;Burch;90;Berlin;6714;M;Apollo,George,Walter,Tyson,Maverick,Titan\r\n" + 
				"Haylee;Leblanc;52;Bilbao;612;F;Winston\r\n" + 
				"Dr. Hunter;Carpenter;51;Florence;8999;M;Leo,Blaze\r\n" + 
				"Haven;Farmer;104;Sofia;0;F;\r\n" + 
				"Ridge;Reese;136;Lisbon;415;M;Odie,Lincoln,Ryder,Jackson\r\n" + 
				"Jaxon;Boyle;104;Leipzig;0;M;\r\n" + 
				"Brett;Rhodes;52;Wuppertal;898;M;Romeo,Wally\r\n" + 
				"Ainhoa;Pennington;40;Vila Nova de Gaia;2398;F;Harley\r\n" + 
				"Dr. Brooklyn;Franklin;80;Bilbao;8991;F;Beau,Dexter,Bubba\r\n" + 
				"Tommy;Davila;138;Karlsruhe;4862;M;Oliver,Rocky,Ranger,Walter\r\n" + 
				"Dr. David;Fitzgerald;118;Tallinn;7519;M;Louie,Bandit,Moose,Max\r\n" + 
				"Noe;Branch;132;Münster;2110;M;Baxter,Buddy,Joey,Theo\r\n" + 
				"Kalani;Cochran;65;Essen;0;F;Zeke,Henry\r\n" + 
				"Dr. Andrea;Gallegos;72;Varna;0;F;Odin\r\n" + 
				"Dr. Junior;Phan;34;Munich;6398;M;Rocky\r\n" + 
				"Carl;Mckinney;49;Rome;6864;M;King\r\n" + 
				"Dr. Amaia;Frost;135;Bonn;0;F;Chester,Gucci,Echo,Diesel,Jack\r\n" + 
				"Lennon;Marks;93;Bilbao;1311;F;Leo,Charlie,Cash\r\n" + 
				"Asher;Cruz;67;Bilbao;1836;M;Cooper,Fluffy\r\n" + 
				"Gerardo;Ellison;123;Catania;0;M;Toby,Blaze,Tucker,Thor\r\n" + 
				"Rose;Castro;117;Duisburg;6896;F;Bruno,Echo,Beau\r\n" + 
				"Carl;Castaneda;117;Düsseldorf;1543;M;Watson\r\n" + 
				"Gia;Flynn;55;Palermo;0;F;Copper,Zeus,Finn\r\n" + 
				"Dr. Fernando;Wong;38;Malmö;5913;M;Cash,Bowie\r\n" + 
				"Kason;Winters;139;Catania;7055;M;Bruno,Oreo,Echo,Kylo,Ace,Henry\r\n" + 
				"Aileen;Shepard;54;Vilnius;0;F;\r\n" + 
				"Greyson;Jaramillo;110;Riga;0;M;Diesel,Ollie,Buddy\r\n" + 
				"Kiana;Meyer;103;The Hague;0;F;Maverick,Kobe,Otis,Whiskey,Tucker,Rusty\r\n" + 
				"Clark;Patterson;97;Bari;8279;M;\r\n" + 
				"Armani;Rivers;62;Tallinn;8677;M;Peanut,Ryder,Ranger\r\n" + 
				"Halle;Butler;45;The Hague;8832;F;Finn,Chester,Bandit\r\n" + 
				"Julio;Hester;73;Riga;0;M;Oakley,Maverick,Rocco,Bear\r\n" + 
				"Rosalia;Beltran;10;Málaga;0;F;Buster,Tyson,Coco\r\n" + 
				"Berkley;Camacho;82;Turin;6211;F;Bubba,Cash,Fluffy,Rocket\r\n" + 
				"Ailani;Barker;110;Lisbon;0;F;Ozzy,Peanut,Rocco,Chase,Simba\r\n" + 
				"Dr. River;Wong;72;Seville;4227;M;\r\n" + 
				"Aria;Dalton;115;Tallinn;7151;F;Cody,Atlas\r\n" + 
				"Santos;Clayton;137;Seville;9615;M;Buddy,Whiskey,Theo\r\n" + 
				"Kristopher;Palacios;19;Plovdiv;3021;M;Coco,Loki,Jasper\r\n" + 
				"Atticus;Haynes;48;Bari;1170;M;\r\n" + 
				"Aidan;Rios;127;Brno;0;M;Rocky,Romeo,Bruce,Ryder\r\n" + 
				"Archie;Henson;27;Nuremberg;2563;M;Harry,Ranger,Baxter,Ruger,Samson,Sam\r\n" + 
				"Keaton;Terrell;114;Murcia;2666;M;Bruno,Hank,Ruger,Axel,Diesel\r\n" + 
				"Sylas;Craig;43;Rīga;4142;M;Copper,Chester,Harley\r\n" + 
				"Jackson;Pope;98;Munich;9659;M;Cody\r\n" + 
				"Beckham;Cain;132;Karlsruhe;0;M;Gunner,Dozer\r\n" + 
				"Canaan;Mccarthy;78;Brno;5167;M;Atlas\r\n" + 
				"Santos;Holt;46;Lyon;0;M;Blaze,Hank,Joey,Axel,Jackson\r\n" + 
				"Legacy;Duncan;52;Nice;0;F;Gunner,Otis,Teddy,Bo,Chester,Wally\r\n" + 
				"Ariel;Castro;58;Catania;1023;F;Bentley\r\n" + 
				"Paloma;Mcbride;53;Paris;6284;F;Benny,Tank,Chip,Walter,Apollo\r\n" + 
				"Dr. Koda;Walls;63;Budapest;0;M;Henry,Romeo\r\n" + 
				"Onyx;Beck;60;Vila Nova de Gaia;1867;M;Buddy,Riley,Maverick,Archie,Axel,Oscar\r\n" + 
				"Landry;Salgado;91;Catania;4446;M;\r\n" + 
				"Callie;Ruiz;71;Amsterdam;3738;F;Rudy,Porter,Walter\r\n" + 
				"Dr. Musa;Richardson;78;Zaragoza;0;M;Oliver,Mac,Jake,Odie,Harley,Bailey\r\n" + 
				"Celia;Villarreal;126;Bari;377;F;Mac,Maverick\r\n" + 
				"Ricky;Hendrix;136;Łódź;0;M;\r\n" + 
				"Jensen;Higgins;117;Stuttgart;4683;M;Ollie,Thor,Titan,Simba,Jax,Max\r\n" + 
				"Sergio;Stark;89;Düsseldorf;4076;M;Benny,Bear,Chip,Winston,Arlo\r\n" + 
				"Dr. Bradley;Levy;31;Gothenburg;8312;M;Diesel,Rocket,Miles,Rex,Bo\r\n" + 
				"Kehlani;Magana;45;Brno;9076;F;Hank,Remy,Cash\r\n" + 
				"Dayton;Harris;90;Seville;7314;M;Peanut,Ollie,Shadow,Blue,Simba,Thor\r\n" + 
				"Sarah;Stewart;37;Timișoara;188;F;Watson\r\n" + 
				"Adelyn;Shepard;33;Bologna;9001;F;Dexter,Rusty,Ollie,Bowie,Atlas,Louie\r\n" + 
				"Dr. Gabriella;Harper;78;Hamburg;8178;F;Rocco,Buster\r\n" + 
				"Carolina;Reid;53;Lyon;467;F;Loki,Jasper,Thor,Oreo\r\n" + 
				"Aislinn;Reynolds;93;Sigulda;381;F;Rocky,Echo,Coco,Copper,Boomer,Bo\r\n" + 
				"Lyanna;Welch;40;Dortmund;0;F;Toby,Copper\r\n" + 
				"Alianna;Correa;133;Dresden;6663;F;Baxter\r\n" + 
				"Dr. Silas;Nicholson;38;Karlsruhe;0;M;Bear,Benny,Joey,Henry,Max,Romeo\r\n" + 
				"Deacon;Casey;102;Bologna;3675;M;Watson,Bentley,Rocket\r\n" + 
				"Whitley;Long;100;Valmiera;0;F;Ranger,Tyson,Jasper,Buster,Benji,Kylo\r\n" + 
				"Emmaline;Alvarez;97;Bremen;9414;F;Simba,Copper,Milo,Whiskey,Rudy\r\n" + 
				"Emory;West;108;Stuttgart;9276;F;Apollo\r\n" + 
				"Adrianna;Bentley;10;Bielefeld;0;F;Prince,Joey,Finn,Atlas,Charlie,Dozer\r\n" + 
				"Giselle;Marks;56;Kraków;6095;F;Atlas,Samson,Odie,Oakley,Benji,Romeo\r\n" + 
				"Jeffery;Roman;117;Vila Nova de Gaia;5852;M;Walter,Gizmo\r\n" + 
				"Dr. Kyle;Spears;77;Málaga;0;M;Theo,Watson,Sarge\r\n" + 
				"Eva;Maxwell;86;Córdoba;9271;F;Atlas,Marley,Simba\r\n" + 
				"Dr. Issac;Cantrell;84;Budapest;3604;M;Chip,Bear\r\n" + 
				"Mathew;Lyons;139;Warsaw;2316;M;Wally,Scout\r\n" + 
				"Julia;Koch;118;Vienna;0;F;Otis,Oliver\r\n" + 
				"Dr. Wade;Fitzgerald;17;Vienna;3857;M;\r\n" + 
				"Kaylee;Randolph;45;Timișoara;0;F;Whiskey,Rocky,Beau,Kylo,Otis\r\n" + 
				"Frederick;Webb;58;Duisburg;0;M;Axel,Whiskey,Odie,Rocco,Arlo,Dexter\r\n" + 
				"Alistair;Esparza;15;Paris;4238;M;Teddy,Shadow,Remi,Charlie,Bandit,Finn\r\n" + 
				"Zachariah;Baker;49;Utrecht;4400;M;Remy,Bruce,Scout,Ozzy\r\n" + 
				"Faye;Barajas;77;Bucharest;0;F;Finn,Oreo,Charlie,Chester,King\r\n" + 
				"Sawyer;Alvarado;93;Prague;239;F;Ranger,Buddy,Remi,Winston\r\n" + 
				"Sawyer;Kirk;39;Münster;0;F;Whiskey,Rambo\r\n" + 
				"Jasiah;Hobbs;61;Dublin;6641;M;Luke,Copper,Chase,Scout,Baxter,Remy\r\n" + 
				"Alexa;Jackson;83;Palermo;9045;F;Chase\r\n" + 
				"Titan;Goodwin;12;Wrocław;0;M;Jake,Sam,Bubba\r\n" + 
				"Braelyn;Ashley;126;Münster;5919;F;Rudy,Bandit,Titan,Zeus,Thor\r\n" + 
				"Layne;Velez;60;Lyon;9430;M;Harry\r\n" + 
				"Clay;Meyers;37;Murcia;3644;M;Koda,Titan,Bailey,Moose,Joey\r\n" + 
				"Norah;Ponce;97;Toulouse;4723;F;Sam,Archie\r\n" + 
				"Saylor;Chase;124;Florence;0;F;Hank\r\n" + 
				"Zahir;Daugherty;26;Milan;9846;M;Axel\r\n" + 
				"Donald;Lucero;126;Karlsruhe;6529;M;Rocky,Gus\r\n" + 
				"Dr. Noah;Wiggins;65;Madrid;7763;F;Whiskey,Benny,Jack,Remi,Buster,Chase\r\n" + 
				"Dr. Aria;Nixon;46;Hanover;3394;F;Marley,Bowie\r\n" + 
				"Alexandra;Bryan;77;Utrecht;2880;F;Ozzy,Bowie,Otis\r\n" + 
				"Dr. Khaleesi;Person;102;Cluj-Napoca;1566;F;Cody,Rocco,Lincoln,Toby,Mac,Tucker\r\n" + 
				"Brittany;Taylor;44;Riga;2769;F;Toby,Chip,Blue\r\n" + 
				"Dr. Yareli;Yates;121;Leipzig;2055;F;Benji,Simba\r\n" + 
				"Francisco;Carrillo;112;Zagreb;187;M;Bear,Marley,Duke,Odie,Gus,Walter\r\n" + 
				"Kace;Guerrero;123;Córdoba;3330;M;\r\n" + 
				"Kaleb;Chung;88;Bonn;0;M;Henry,Duke,Bandit\r\n" + 
				"Iker;Perry;23;Genoa;8272;M;Beau\r\n" + 
				"Bentlee;Buckley;47;Stockholm;0;M;Axel\r\n" + 
				"Dr. Bronson;Barajas;11;Murcia;0;M;Joey,Ollie\r\n" + 
				"Matilda;Bartlett;93;Wrocław;9160;F;Rudy,Porter,Odie,Hank,Mac,Buddy\r\n" + 
				"Dr. Dash;Reilly;27;Plovdiv;0;M;Blaze,George,Kylo\r\n" + 
				"Princess;Valencia;69;Bremen;5526;F;Apollo,Toby\r\n" + 
				"Giovanni;Marquez;62;Vila Nova de Gaia;0;M;Bowie,Simba,Diesel,Odin,Atlas\r\n" + 
				"Alan;Cantrell;57;Karlsruhe;0;M;Diesel,Theo\r\n" + 
				"Dr. Haisley;Jennings;85;Helsinki;9581;F;Gunner,Gizmo,Ryder,Mac,Loki,Samson\r\n" + 
				"Madeleine;Shelton;21;Wrocław;7138;F;Jake\r\n" + 
				"Dr. Sariyah;Salazar;103;Rotterdam;3568;F;King\r\n" + 
				"Brett;Manning;108;Lyon;3114;M;Prince,Boomer,Sam,Bo,Whiskey,Wally\r\n" + 
				"Dr. Bo;Peralta;135;Hamburg;6287;M;Echo,Ace,Echo\r\n" + 
				"Kinslee;Preston;139;Bratislava;8441;F;\r\n" + 
				"Lennox;Truong;127;Vila Nova de Gaia;8611;F;\r\n" + 
				"Keith;Cabrera;125;Malmö;2990;M;Gucci,Murphy,Bailey,Tucker,King\r\n" + 
				"Baylor;Calhoun;122;Hamburg;0;M;Titan,George,Ryder,Apollo,Apollo\r\n" + 
				"Kenzo;Phillips;95;Wuppertal;836;M;Tyson,Rusty\r\n" + 
				"Treasure;Le;92;Bari;861;F;Murphy,Bear,Jackson,Ziggy\r\n" + 
				"Jasper;Rivers;31;Vila Nova de Gaia;2879;M;Cooper,Sarge,Lucky,Apollo\r\n" + 
				"Alec;Moyer;114;Gothenburg;0;M;Cooper,Winston,Prince,Leo,Wally\r\n" + 
				"Naya;Lawson;86;Hanover;8647;F;Moose,Loki,Moose,Prince\r\n" + 
				"Archer;Silva;88;Łódź;9476;M;Jax,Gunner,Louie,Joey\r\n" + 
				"Jack;Sweeney;55;Nantes;1780;M;\r\n" + 
				"Dr. Yaretzi;Gardner;79;Bratislava;1061;F;\r\n" + 
				"Lawson;Brady;139;Essen;359;M;Kobe,Chester,Buster,Axel,Moose,Oreo\r\n" + 
				"Tadeo;Esquivel;122;Bielefeld;215;M;\r\n" + 
				"Megan;Powell;87;Bari;4411;F;\r\n" + 
				"Chaim;Andrade;120;Duisburg;4562;M;Dozer,Oakley\r\n" + 
				"Jayce;Walter;101;Riga;0;M;Samson,Blue,Duke,Miles\r\n" + 
				"Annabella;Mcclure;128;Dortmund;5777;F;Kobe,Ace,Odin,Ace,Bear\r\n" + 
				"Addilynn;Sandoval;10;Galați;0;F;Benny,Tyson,Koda,Oreo\r\n" + 
				"Avayah;Dyer;113;Rīga;1722;F;Chester,Loki\r\n" + 
				"Stefan;Farrell;73;Kraków;0;M;Zeus,Ace,Tyson,Arlo\r\n" + 
				"Isaac;Lewis;87;Plovdiv;0;M;Gus,Ozzy,Gizmo,Titan,Henry,Oscar\r\n" + 
				"Livia;Bryant;132;Bydgoszcz;0;F;Scout,Kylo,Echo,Theo,Theo\r\n" + 
				"Daleyza;Calderon;137;Dortmund;0;F;\r\n" + 
				"Matias;Dennis;61;Düsseldorf;0;M;Prince,Shadow\r\n" + 
				"Wes;Poole;37;Tallinn;0;M;Oliver,Joey,Ozzy,Blue,Bruno,Bear\r\n" + 
				"Nathaniel;Washington;23;Hanover;3079;M;\r\n" + 
				"Willa;Brooks;11;Zaragoza;5134;F;Ollie,Ziggy,Samson,Bailey,Samson,Zeus\r\n" + 
				"Bruce;Schmidt;120;Bochum;1769;M;Axel\r\n" + 
				"Emilia;Shields;23;Leipzig;0;F;Chase,Rudy,Rambo,Odin,Ollie\r\n" + 
				"Lennox;Wagner;51;Florence;8382;M;Jax,Milo,Jasper,Tucker,Koda,Blaze\r\n" + 
				"Priscilla;Peña;102;Dortmund;7957;F;Oscar,Rudy,Duke,Jax,Bruce,Ryder\r\n" + 
				"Alfred;Ho;77;Rotterdam;0;M;Remy,Chase\r\n" + 
				"Holly;Burch;91;Naples;4935;F;Max,Ranger\r\n" + 
				"Samira;Holloway;135;Madrid;8661;F;Romeo\r\n" + 
				"Dr. Genesis;Fitzpatrick;119;Hanover;6618;M;Gizmo\r\n" + 
				"Forest;Deleon;48;Milan;0;M;\r\n" + 
				"Siena;Aguilar;20;Stockholm;0;F;\r\n" + 
				"Dr. Ensley;Bauer;56;Rome;5355;F;Bentley,Toby,Koda\r\n" + 
				"Maryam;Leal;116;Zaragoza;8863;F;Watson\r\n" + 
				"Amanda;Lim;19;Lyon;1213;F;Scout,Rudy\r\n" + 
				"Murphy;Fuller;121;Bydgoszcz;4410;M;Apollo,Rocky,Bailey,Axel,Hank\r\n" + 
				"Kailey;Murray;70;Marseille;0;F;Apollo,Jasper,Harley\r\n" + 
				"Adan;Harrison;23;Sigulda;3353;M;Whiskey\r\n" + 
				"Yasmin;Richardson;35;Cologne;3200;F;Archie\r\n" + 
				"Paisley;Koch;109;Palma de Mallorca;8021;F;\r\n" + 
				"Kaliyah;Blankenship;84;Sofia;7160;F;\r\n" + 
				"Dr. Jake;Stephenson;25;Aarhus;173;M;Bo,Bubba,Miles,Koda\r\n" + 
				"Sutton;Wheeler;15;Amsterdam;163;M;\r\n" + 
				"Aisha;Lloyd;77;The Hague;8186;F;Henry,Otis,Atlas,Teddy,Beau\r\n" + 
				"Dr. Jordan;Winters;99;Łódź;7421;F;Atlas,Lincoln,Murphy\r\n" + 
				"Alani;Davenport;23;Zagreb;4063;F;Apollo,Tucker,Atlas,Oliver,Oakley,Mac\r\n" + 
				"Dr. June;Murphy;61;Rome;0;F;Oliver,Odie,Thor,Dozer\r\n" + 
				"Alayna;Mercado;114;Nuremberg;8479;F;Archie,Buddy,Scout,Oreo,Titan,Dexter\r\n" + 
				"Valeria;Santana;121;Alicante;9188;F;Oakley\r\n" + 
				"Dr. Samantha;Haynes;114;Bydgoszcz;0;F;Charlie,George\r\n" + 
				"Joshua;Livingston;55;Milan;394;M;\r\n" + 
				"Luke;Macias;86;Sintra;1401;M;Charlie,Theo,Rocket,Jackson\r\n" + 
				"Layton;Newton;99;Stockholm;0;M;Diesel\r\n" + 
				"Sylvie;Fernandez;112;Vilnius;316;F;Peanut,Jack,Benji,Bowie\r\n" + 
				"Azariah;Sherman;122;Utrecht;0;F;Beau,Ryder,Jasper\r\n" + 
				"Dr. Lena;Novak;69;Münster;2393;F;Lincoln,Oliver,Louie,King,Buster\r\n" + 
				"Aliyah;Gray;17;Valmiera;0;F;Koda,Thor,Rex,Teddy,Watson\r\n" + 
				"Sariah;Wolf;42;Naples;0;F;Diesel,Bowie,Leo,Riley,Ozzy,Gucci\r\n" + 
				"Dr. Jane;Guerra;54;Warsaw;3815;F;Copper,Apollo,Louie\r\n" + 
				"Halo;Webb;87;Munich;5154;F;Thor,Echo\r\n" + 
				"Paola;Cole;58;Sofia;2276;F;\r\n" + 
				"Aileen;Newman;76;Sigulda;8116;F;Shadow,Beau,Mac\r\n" + 
				"Seven;Mcclain;68;Wuppertal;9799;M;Atlas,Oliver\r\n" + 
				"Winston;Sandoval;128;Rome;0;M;Prince,Peanut,Porter,Harley,Rambo\r\n" + 
				"Khalani;Castro;60;Utrecht;1017;F;Arlo,Tyson\r\n" + 
				"Greyson;Stafford;77;Leipzig;0;M;Bubba,Odin\r\n" + 
				"Davina;Lester;53;Karlsruhe;9887;F;\r\n" + 
				"Aarya;Wolf;44;Genoa;0;F;Sam,Rocco,Rocket,Theo,Dexter\r\n" + 
				"Noah;Faulkner;61;Prague;8869;F;Bo,Samson,Buddy\r\n" + 
				"Dr. Clementine;Huynh;124;Catania;7990;F;Odin,Whiskey,Boomer,Porter,Koda\r\n" + 
				"Zainab;Lloyd;109;Utrecht;0;F;Riley,Bentley\r\n" + 
				"Sky;Middleton;21;Cluj-Napoca;610;F;Milo\r\n" + 
				"Yousef;Franklin;59;Mannheim;0;M;Axel,Apollo,King\r\n" + 
				"Ashley;Avalos;63;Utrecht;7925;F;Jake,Rex,Jax,Lucky\r\n" + 
				"Damir;Phan;34;Plovdiv;7873;M;Moose,Ziggy,Bear\r\n" + 
				"Ryann;Cantrell;138;Hanover;3545;F;Dexter,Winston,Rocket,Rusty,Ranger\r\n" + 
				"Dr. Colter;Dudley;125;Utrecht;0;M;Scout,Odie,Tyson,Jake\r\n" + 
				"Davina;Castillo;110;Amsterdam;7269;F;Bandit,Lincoln\r\n" + 
				"Adelaide;Houston;117;Valencia;0;F;Arlo,Ryder\r\n" + 
				"Dr. Amaris;Rollins;35;Bremen;0;F;\r\n" + 
				"Alvaro;Avalos;46;Málaga;2890;M;\r\n" + 
				"Miguel;Page;124;Karlsruhe;0;M;Bailey,Milo,Remi\r\n" + 
				"Piper;Cole;130;Karlsruhe;0;F;Koda,Beau\r\n" + 
				"Chandler;Rhodes;42;The Hague;8300;M;Remy,Moose,Tucker,Harley,Oliver\r\n" + 
				"Ayleen;Palacios;94;Stuttgart;0;F;Zeke,Levi,Bentley,Scout\r\n" + 
				"Elliot;Huffman;107;Amsterdam;8020;M;Sam,Dexter,Oreo,Bear,Buddy,Boomer\r\n" + 
				"Landry;Frazier;99;Leipzig;3602;F;Baxter,Watson,Joey\r\n" + 
				"Kayla;Webb;23;Alicante;4491;F;Scout\r\n" + 
				"Princess;Gibbs;75;Constanța;4126;F;Apollo,Rocket,Duke\r\n" + 
				"Dr. Liv;Hurst;123;Prague;8110;F;Remy,Blue,Wally,Cody,Thor,Chip\r\n" + 
				"Jaylin;Shelton;63;Turin;2108;F;Charlie,Archie,Otis,Rudy,Levi,Otis\r\n" + 
				"Liam;Kelley;114;Stockholm;8407;M;Henry,King,Mac\r\n" + 
				"Dr. Darwin;Parks;69;Palma de Mallorca;9335;M;Jasper\r\n" + 
				"Jose;Medrano;67;Düsseldorf;5289;M;\r\n" + 
				"Selene;Bell;108;Rotterdam;2080;F;Riley\r\n" + 
				"Luella;French;96;Wrocław;0;F;Koda,Whiskey,Ziggy,Bear,Ryder\r\n" + 
				"Elena;Bryant;55;Münster;4659;F;Zeke,Jasper,Bentley,Ranger,Oakley,Dozer\r\n" + 
				"Forrest;Pitts;127;Vilnius;9888;M;Ace\r\n" + 
				"Xander;Mathews;84;Frankfurt am Main;0;M;Kobe,Rex\r\n" + 
				"Mercy;Ford;47;Riga;8853;F;\r\n" + 
				"Fletcher;Cunningham;22;Murcia;972;M;Moose\r\n" + 
				"Dr. Lochlan;Fletcher;93;Amsterdam;8480;M;Rocket,Sam\r\n" + 
				"Halo;Reed;26;Sigulda;0;F;Theo,Atlas,Copper,Jax,Oliver,Dozer\r\n" + 
				"Elliott;Ruiz;80;Rīga;0;F;Buddy,Remi,Bear\r\n" + 
				"Darian;Howe;31;Frankfurt am Main;3527;M;Sam,Louie,Ace,Porter,Bo\r\n" + 
				"Zane;Fitzgerald;137;Frankfurt am Main;0;M;Hank,Dexter\r\n" + 
				"Rayan;Berg;30;Bydgoszcz;5186;M;Kobe,Cooper,Rocket,Ace,Chase\r\n" + 
				"Kenji;Curry;115;Nantes;2776;M;Jake,Romeo,Dozer,Otis\r\n" + 
				"Briana;Hester;103;Palermo;6286;F;Simba,Murphy,Toby,Gunner,Porter,Zeke\r\n" + 
				"Musa;Pace;115;Zaragoza;0;M;Dexter,Porter,Chip\r\n" + 
				"Ailani;Burch;133;Varna;308;F;\r\n" + 
				"Brodie;Tran;118;Bydgoszcz;0;M;Walter,Archie,Rocket,Gucci,Tank,Copper\r\n" + 
				"Priscilla;Rose;52;Lyon;5005;F;\r\n" + 
				"Reed;Mendoza;38;Bratislava;0;M;Rocket,Zeke,Jack,Maverick,Rocco,Wally\r\n" + 
				"Giselle;Wheeler;119;Milan;0;F;Jake\r\n" + 
				"Jorge;Burnett;95;Bonn;5527;M;Samson,Romeo,Lucky\r\n" + 
				"Lorelai;Castillo;68;Málaga;0;F;Benji\r\n" + 
				"Dr. Clare;Anderson;55;Bonn;9167;F;Maverick\r\n" + 
				"Dr. Landon;Fleming;89;Paris;4494;M;Buster,Ziggy\r\n" + 
				"Emmalyn;Sparks;50;Paris;0;F;Maverick,Titan,Ace,Boomer\r\n" + 
				"Esperanza;Colón;70;Galați;6014;F;Boomer,Luke,Cash\r\n" + 
				"Emery;Mcgee;128;Catania;8698;M;Sam,Ollie,Luke,Gus,Odie\r\n" + 
				"Dr. Kynlee;Clark;92;Bydgoszcz;6268;F;Koda,Harley\r\n" + 
				"Gabriel;Huynh;110;Bremen;7186;M;Benji,Cash,Rocco,Tyson,Dexter,Rocket\r\n" + 
				"Alaya;Johnston;53;Milan;4860;F;Rocky,Henry,Murphy,Ruger\r\n" + 
				"Tyler;Savage;45;Frankfurt am Main;8473;M;Oreo,Echo,Ollie\r\n" + 
				"Hunter;Bass;96;Bochum;0;F;Ryder,King,Blue\r\n" + 
				"Saul;Everett;13;Vienna;6753;M;Rex,Samson,Gunner,Bandit,Jake\r\n" + 
				"Jaxen;Corona;129;Bilbao;6112;M;Shadow,Bruno,Odie,Tucker,Ruger\r\n" + 
				"Alexis;Moses;53;The Hague;9561;M;Remi,Tucker,Jake\r\n" + 
				"Rose;Sutton;122;Dresden;3583;F;Cody,Echo,Chase,Bubba\r\n" + 
				"Clay;Rollins;14;Naples;8819;M;Gus,Leo,Porter\r\n" + 
				"Briella;Stout;61;Poznań;1976;F;Charlie\r\n" + 
				"Mina;Greer;73;Hanover;0;F;Coco,Peanut,Louie\r\n" + 
				"Nalani;Charles;57;Dresden;2372;F;\r\n" + 
				"Ulises;Weeks;23;Turin;0;M;Arlo,Sam,Bruce\r\n" + 
				"Gerald;Proctor;116;Munich;0;M;Peanut,Loki,Bruce\r\n" + 
				"Andrea;Pierce;36;Sintra;0;F;Leo,Kobe,Toby,Chip,Boomer\r\n" + 
				"Kayleigh;Leonard;20;Prague;0;F;Dexter,Benny,Rocco\r\n" + 
				"Macie;Hill;51;Lyon;7767;F;Mac,Buster\r\n" + 
				"Dr. Capri;Howell;97;Bremen;2956;F;Odie,Kobe,Rex\r\n" + 
				"Abner;Mcmahon;96;Málaga;0;M;Buddy\r\n" + 
				"Hendrix;Fitzgerald;127;Leipzig;360;M;Finn,Kylo\r\n" + 
				"Soren;David;30;Mannheim;276;M;Apollo\r\n" + 
				"Adelaide;Lynn;95;Münster;3693;F;Harry\r\n" + 
				"Jase;Bean;109;Genoa;0;M;Milo\r\n" + 
				"Janiyah;Howell;91;Plovdiv;0;F;\r\n" + 
				"Azalea;Brown;105;Stuttgart;469;F;\r\n" + 
				"Yahir;Shaw;74;Varna;8568;M;Fluffy,Sarge,Moose,Rambo,Tank,Boomer\r\n" + 
				"Aspen;Ochoa;13;Bydgoszcz;0;F;Hank,Blue,Cooper,Chase\r\n" + 
				"Houston;Santana;46;Vilnius;3167;M;Tank,Otis,Rex,Miles,Jake\r\n" + 
				"Anahi;Quintana;126;Düsseldorf;2028;F;Baxter,Bo,Leo,Echo,Prince,Peanut\r\n" + 
				"Kieran;Powell;129;Prague;3677;M;Baxter\r\n" + 
				"Alice;Barnes;104;Naples;451;F;Porter\r\n" + 
				"Marlon;Hopkins;51;Genoa;3044;M;\r\n" + 
				"Nathan;Coleman;118;Cologne;0;M;Watson,Zeke,Cooper,Buster,Louie\r\n" + 
				"Kieran;Weeks;42;Stockholm;5885;M;Titan,Kobe,Scout,Whiskey\r\n" + 
				"Journey;Zuniga;129;Poznań;647;F;Prince,Otis,Kylo,Kylo,Ollie\r\n" + 
				"Ayden;English;59;Varna;7662;M;Remi,Marley,Bo,Gus\r\n" + 
				"Rogelio;Garrett;135;Wuppertal;2353;M;Peanut,Bo\r\n" + 
				"Donald;Bauer;96;Hamburg;1541;M;Cooper,Titan\r\n" + 
				"Brecken;Crawford;129;Catania;2442;M;Jackson,Bowie,Jasper,Rambo,Jake,Bubba\r\n" + 
				"Ray;Lee;61;Brno;0;M;Diesel,Odin,Chip,Lucky,Hank,Rocket\r\n" + 
				"Bexley;Gonzales;25;Stockholm;0;F;Gizmo,King\r\n" + 
				"Kamdyn;Moon;15;Sintra;348;M;Cody,Rudy,Axel,Fluffy,Beau\r\n" + 
				"Carolyn;Hendricks;118;Valencia;4583;F;Chase,Sarge,Benji,Copper,Beau,Bruce\r\n" + 
				"Landon;Chan;102;Madrid;5858;M;Jack,Bubba,Bowie,Bubba\r\n" + 
				"Nolan;Arnold;136;The Hague;0;M;Ozzy\r\n" + 
				"Aleena;Gilbert;129;Riga;475;F;Archie,Rocco,Winston,Jasper,Tyson,Simba\r\n" + 
				"Killian;Rocha;111;Malmö;6471;M;Charlie,Rudy,Hank\r\n" + 
				"Cole;Salgado;40;Lublin;5678;M;Whiskey,Bruno\r\n" + 
				"Huxley;Mcgee;25;Sintra;3785;M;Tank,King,Max,Riley,Baxter\r\n" + 
				"Dr. Brodie;Salinas;98;Cluj-Napoca;0;M;\r\n" + 
				"Austin;Atkinson;106;Stuttgart;9720;M;Harry\r\n" + 
				"Marianna;Grant;125;Zaragoza;7754;F;Tucker,Titan,Prince,Zeke,Dozer\r\n" + 
				"Dr. Troy;Pace;119;Mannheim;6979;M;Leo\r\n" + 
				"Paityn;Stone;17;Dresden;3916;F;Beau,Bandit,Chase,Atlas,Tank\r\n" + 
				"Dani;Cantrell;72;Kraków;0;F;Dexter,Cody\r\n" + 
				"Taylor;Wade;37;Bremen;2085;F;\r\n" + 
				"Violet;Norton;101;Frankfurt am Main;3306;F;Gizmo,Finn,Rex,Riley,Louie\r\n" + 
				"Caroline;Beasley;137;Paris;7416;F;Kobe,King,Fluffy,Rex\r\n" + 
				"Mark;Hess;131;Sintra;0;M;Oreo,Moose,Duke\r\n" + 
				"Stevie;Lewis;30;Copenhagen;0;F;Riley,Milo,Tank,Dozer\r\n" + 
				"Keyla;Chambers;131;Toulouse;8765;F;Joey,Benny,George,Bowie,Gucci\r\n" + 
				"Aries;Carter;88;Kraków;4626;M;Watson,Zeke\r\n" + 
				"Eliana;Lynch;54;Aarhus;2442;F;Bo,Bailey,Scout,Gucci,Diesel\r\n" + 
				"Lee;Acosta;61;Constanța;992;M;Koda\r\n" + 
				"Violet;Sanchez;48;Dortmund;5140;F;Bentley,Remi,Rocco\r\n" + 
				"Carmen;Hubbard;133;Sintra;8663;F;Ace,Ryder,Cooper,Rocket,Teddy,Benji\r\n" + 
				"Mazikeen;Delarosa;120;Leipzig;9083;F;Cash,Odin,Gus,Luke,Coco,Shadow\r\n" + 
				"Alaia;Lang;37;Münster;0;F;Bruce,Archie,Bo,Rex,Ziggy,Leo\r\n" + 
				"Maximilian;Kramer;56;Palermo;3642;M;Lucky,Rambo,Chip\r\n" + 
				"Adelaide;Larson;111;Vila Nova de Gaia;7651;F;Buster,Fluffy,Winston\r\n" + 
				"Lyra;Baker;60;Gothenburg;649;F;Cody,Scout,Oreo,Bubba,Tucker,Otis\r\n" + 
				"Noah;Hurst;111;Bremen;1793;F;Leo,Chase,Kylo,Benji\r\n" + 
				"Daniella;Cox;88;Milan;5345;F;\r\n" + 
				"Luke;Willis;129;Wuppertal;7926;M;Joey,Louie,Ollie,Bowie\r\n" + 
				"Judah;Beltran;26;Warsaw;3239;M;Milo,Ace,Bear\r\n" + 
				"Jane;Corona;93;Rotterdam;108;F;Tyson,Harry,Gizmo\r\n" + 
				"Corey;Valentine;136;Duisburg;0;M;Bandit,Axel\r\n" + 
				"Dr. Cassidy;Gates;110;Hanover;891;F;Bear\r\n" + 
				"Laney;Villalobos;41;Thessaloniki;1644;F;Rocky,Thor,Ozzy,Ollie\r\n" + 
				"Neil;Mcbride;109;Lisbon;1107;M;Harley\r\n" + 
				"Liv;Ingram;100;Budapest;0;F;Arlo,Beau,Fluffy,Oscar,Romeo,Ranger\r\n" + 
				"Callie;Pitts;127;Stockholm;716;F;Luke,Moose,Jackson,Theo,Arlo\r\n" + 
				"Ari;Poole;51;Madrid;2185;F;Riley,George,Beau\r\n" + 
				"Monica;Mclean;106;Bydgoszcz;3252;F;Beau,Kylo,Boomer,Teddy,Benny\r\n" + 
				"Zahir;Serrano;48;Bochum;5857;M;Ace\r\n" + 
				"Israel;Moreno;137;Naples;4819;M;Ozzy\r\n" + 
				"Addison;Delgado;92;Cluj-Napoca;0;F;Bubba,Tyson,Jax,Moose\r\n" + 
				"Macie;Stark;49;Szczecin;0;F;Chase,Buddy,Oscar,Mac,Ruger\r\n" + 
				"Niko;Lambert;133;Hanover;1084;M;Kylo,Jack,Tank\r\n" + 
				"Braxton;Ochoa;138;Lublin;0;M;Bentley,Simba,Charlie,Copper\r\n" + 
				"Kenneth;Ortiz;67;Dublin;3331;M;Atlas,Rocco,Diesel,Koda\r\n" + 
				"Marcus;Golden;15;Duisburg;4600;M;Oliver,Gunner,Kylo,Wally,Simba,Riley\r\n" + 
				"Laney;Khan;86;Milan;0;F;\r\n" + 
				"Ivan;Armstrong;27;Duisburg;0;M;Chip,Rex\r\n" + 
				"Conner;Mosley;85;Gothenburg;0;M;Jackson,Zeus,Hank,Hank,Marley,Apollo\r\n" + 
				"Jaxen;Bartlett;100;Bucharest;5369;M;Mac,Bentley,Henry\r\n" + 
				"Dr. Araceli;Rhodes;43;Stuttgart;488;F;\r\n" + 
				"Johanna;Tyler;121;Lyon;4286;F;Rex\r\n" + 
				"Dr. Flynn;Goodwin;32;Zagreb;0;M;Riley,Atlas\r\n" + 
				"Aubrey;Cabrera;97;Duisburg;1295;F;Cash,Blue\r\n" + 
				"Juan;Arias;19;Rīga;8855;M;Rudy,Ace,Harley,Simba,Chip\r\n" + 
				"Reese;Long;137;Florence;5682;M;Romeo,Lincoln\r\n" + 
				"Shiloh;Rosas;43;Frankfurt am Main;0;M;Rocket,Kobe,Gucci,Levi,Buster\r\n" + 
				"Savannah;Guzman;125;Bydgoszcz;7797;F;Tank,Arlo,Cooper\r\n" + 
				"Lina;Fuller;39;Catania;5851;F;Harley,Gus,Miles\r\n" + 
				"Margaret;Sanders;56;The Hague;7356;F;Echo,Dozer,Murphy,Gunner\r\n" + 
				"Jennifer;Rich;23;Bratislava;8803;F;Baxter\r\n" + 
				"Dalary;Wells;109;Poznań;0;F;Rambo,Chester,Charlie,Oakley,Baxter,Bentley\r\n" + 
				"Hendrix;Faulkner;30;Cologne;3127;M;Zeke,Zeus,Riley\r\n" + 
				"Dr. Hayden;Ali;99;Dublin;4818;M;Arlo\r\n" + 
				"Ariana;Shields;11;Bochum;9922;F;George,Miles,Bentley\r\n" + 
				"Lauryn;Gallagher;31;Duisburg;1114;F;\r\n" + 
				"Milena;Casey;117;Stockholm;0;F;\r\n" + 
				"Rayan;Rosario;32;Utrecht;0;M;Riley\r\n" + 
				"Jayda;Greer;63;Bydgoszcz;2979;F;Charlie,Hank,Oscar,Thor,Boomer\r\n" + 
				"Harmony;Hayden;18;Milan;7387;F;\r\n" + 
				"Anika;Palmer;63;Bratislava;5531;F;\r\n" + 
				"Leroy;Huffman;10;Córdoba;3562;M;Apollo,Mac,Wally\r\n" + 
				"Christina;Pearson;18;Amsterdam;2603;F;Chester,Loki\r\n" + 
				"Zechariah;Miranda;34;Naples;2347;M;Koda\r\n" + 
				"Journey;Torres;50;Timișoara;8854;F;Finn,Porter,Odie\r\n" + 
				"Diana;Sanford;87;Rotterdam;0;F;Max,Murphy\r\n" + 
				"Xavier;Gould;26;Zaragoza;0;M;Bailey,Cooper,Peanut,Ollie,Axel\r\n" + 
				"Peyton;Sloan;41;Zaragoza;8888;M;Mac,Boomer,Marley\r\n" + 
				"Kyson;Bates;23;Bonn;0;M;Axel,Jackson\r\n" + 
				"Dr. Jonathan;Nava;38;Córdoba;1087;M;Oliver,Whiskey,Miles\r\n" + 
				"Dr. Yaretzi;Rich;100;Stockholm;1990;F;Ranger,Oliver\r\n" + 
				"Dr. Della;Crawford;69;Copenhagen;9730;F;Bruce,Arlo,Ranger,Bruce\r\n" + 
				"Jackson;Brooks;98;Rome;4589;M;Theo,Louie,Miles\r\n" + 
				"Jennifer;Mcclain;88;The Hague;3939;F;Buddy\r\n" + 
				"Jaxtyn;Bradshaw;17;Duisburg;4687;M;Oscar\r\n" + 
				"Luka;Lara;88;Dublin;0;M;Diesel,Tank,Echo,Beau\r\n" + 
				"Raven;Barnes;17;Rotterdam;201;F;Cody,Mac,Axel,Rocket,Ozzy,Harry\r\n" + 
				"Julie;Pace;65;Dortmund;2862;F;Walter\r\n" + 
				"Aisha;Williams;60;Antwerp;0;F;Dexter,Mac,Bo,Maverick,Baxter,Bandit\r\n" + 
				"King;Curry;87;Tallinn;0;M;Apollo,Buddy,Lucky,Cody\r\n" + 
				"Rylan;Hawkins;80;Florence;3202;M;\r\n" + 
				"Aislinn;Cano;93;Paris;8895;F;Maverick,Shadow\r\n" + 
				"Heaven;Lawson;134;Copenhagen;3489;F;Gus,Teddy,Max,Bruce,Ollie\r\n" + 
				"Dr. Kai;Mcclain;28;Düsseldorf;0;F;Gucci,Bear,Moose,Atlas,Sam\r\n" + 
				"Ezekiel;Robertson;129;Sintra;0;M;Mac,Bailey,Chase,Tyson,Max,Rudy\r\n" + 
				"Zakai;Peters;78;Düsseldorf;5247;M;\r\n" + 
				"Taylor;Avalos;31;Gdańsk;0;M;Rocco,Bo,Benji,Zeke\r\n" + 
				"Zachariah;Melendez;98;Szczecin;5059;M;Teddy,Ryder,Benji\r\n" + 
				"Dr. Emmaline;Ávila;32;Münster;0;F;\r\n" + 
				"Hunter;Ashley;86;Berlin;6213;F;Finn,Atlas,Tyson,Oliver\r\n" + 
				"Liv;Saunders;118;Iași;0;F;Zeus,Copper,Jackson\r\n" + 
				"Nathaniel;Roberts;64;Córdoba;7840;M;Bear,Ollie,Louie,Rocco\r\n" + 
				"Logan;Richards;107;Utrecht;6657;M;Blaze,Beau,Lucky,Murphy,Loki,Luke\r\n" + 
				"Reyna;Cook;32;Zaragoza;5603;F;Milo,Archie,Copper,Romeo,Ollie\r\n" + 
				"Dr. Rio;Baxter;113;The Hague;6008;M;Maverick,Theo,Oreo,Rocket\r\n" + 
				"Ezra;Wise;137;Córdoba;7518;F;Luke,Tyson,Harley\r\n" + 
				"Dr. Zaniyah;Terry;49;Copenhagen;3391;F;Zeus,Murphy,Archie,Axel,Finn\r\n" + 
				"Henley;Dixon;52;Timișoara;0;F;Bentley,Archie\r\n" + 
				"Jasiah;Bradley;29;Bilbao;5095;M;Leo,Echo,Oliver,Walter,Remy\r\n" + 
				"Kenneth;Ford;131;Rīga;7070;M;Chase,Whiskey,Ryder\r\n" + 
				"Dr. Ernesto;Orr;64;Naples;6388;M;Ozzy,Benji,Rocket\r\n" + 
				"Conner;Velazquez;84;Antwerp;1994;M;Blue,Murphy\r\n" + 
				"Aliya;Noble;100;Karlsruhe;3086;F;Oreo,Henry\r\n" + 
				"Ivy;Warren;81;Lyon;0;F;Lincoln,Bubba,Louie\r\n" + 
				"Cedric;Gibson;95;Riga;8300;M;Romeo,Henry,Charlie\r\n" + 
				"Dr. Regina;Shannon;17;Malmö;9270;F;\r\n" + 
				"Izabella;Kirk;57;Timișoara;1181;F;Blaze\r\n" + 
				"Dr. Melina;Weber;114;Cologne;5826;F;\r\n" + 
				"Kyle;Jennings;27;Dortmund;3393;M;Chip,Kobe\r\n" + 
				"Kadence;Chambers;120;Thessaloniki;1730;F;Bailey,Rocket,Odie,Buster,Moose\r\n" + 
				"Nylah;Salgado;82;Sofia;0;F;\r\n" + 
				"Dr. Kyle;Mcgee;64;Munich;0;M;Ruger,Otis,Bailey,Louie,Louie\r\n" + 
				"Asher;Booth;102;Kraków;6001;M;\r\n" + 
				"Langston;Contreras;124;Lublin;5027;M;Odie,Toby\r\n" + 
				"Amir;Peters;17;Antwerp;0;M;Jax,Rudy,Benji,Lucky,Watson,Tank\r\n" + 
				"Kase;Duncan;40;Rotterdam;0;M;Jasper,Rocco,Tank,Fluffy\r\n" + 
				"Aliana;Hawkins;86;Cluj-Napoca;5251;F;\r\n" + 
				"Denver;Richardson;107;Aarhus;1099;F;Mac,Fluffy,Murphy,Oliver,Thor,Sarge\r\n" + 
				"Clarissa;Vega;122;Frankfurt am Main;1749;F;Murphy,Ozzy,Jackson,Gizmo,Arlo\r\n" + 
				"Jeremias;Wade;10;Gdańsk;4972;M;Henry,Baxter,Chase,Levi,Winston\r\n" + 
				"Dr. Dario;Tucker;93;Munich;1715;M;\r\n" + 
				"Bodhi;Patton;20;Lisbon;0;M;Bo,Harry,Oscar,Ziggy,Bowie\r\n" + 
				"Jett;Moody;123;Turin;0;M;Chase,Ziggy,Tyson,Chip\r\n" + 
				"Araceli;Bonilla;47;Turin;0;F;Kobe,Maverick\r\n" + 
				"Cade;Williams;92;Vilnius;9263;M;Buddy,Walter,Tucker,Oliver,Zeke\r\n" + 
				"Ava;Allen;129;Bonn;8625;F;Rambo,Bear,Henry,George\r\n" + 
				"Kash;Xiong;22;Prague;3221;M;Sarge,Blaze,Odin,Archie,Buddy\r\n" + 
				"Troy;Johnston;74;Essen;0;M;Atlas,Murphy,Bandit,Henry,Arlo\r\n" + 
				"Julia;Sweeney;29;Hanover;9669;F;Simba,Dozer\r\n" + 
				"Sariyah;Russo;124;Hanover;6236;F;\r\n" + 
				"Idris;Graves;52;Warsaw;4419;M;Baxter,Duke,Coco,Oliver,Samson\r\n" + 
				"Abner;Hardy;104;Bydgoszcz;3451;M;\r\n" + 
				"Caden;Nolan;57;Mannheim;3722;M;Cash,Harry,Bailey,Hank,George\r\n" + 
				"Mila;Johns;138;Antwerp;6040;F;Rambo,Rex\r\n" + 
				"Kelvin;Vance;101;Paris;1820;M;Ace,Rex,Porter\r\n" + 
				"Dr. Hugo;York;78;Cluj-Napoca;0;M;\r\n" + 
				"Heath;Bass;62;Brno;0;M;Winston,Titan,Arlo\r\n" + 
				"Ariya;Santana;129;Seville;0;F;Odin\r\n" + 
				"Paityn;Contreras;110;Wuppertal;8149;F;Jackson,Rocco,Koda,Joey,Toby,Jasper\r\n" + 
				"Ivanna;Tyler;69;Sigulda;8307;F;Theo,Chester,Ruger\r\n" + 
				"Conner;Burnett;28;Malmö;2269;M;Rudy\r\n" + 
				"Malayah;Dominguez;77;Essen;0;F;Jax,Leo,Bruno\r\n" + 
				"Royal;Harrell;30;Rīga;7977;M;\r\n" + 
				"Samir;Navarro;35;Bologna;4265;M;Rudy,Oreo\r\n" + 
				"Brynlee;Ponce;32;Las Palmas;0;F;Porter,Odie,Duke,Rocket\r\n" + 
				"Clare;Cook;42;Hanover;6170;F;George,George\r\n" + 
				"Bonnie;Beasley;121;Athens;6352;F;Dozer,Finn,Whiskey,Joey,George,Blaze\r\n" + 
				"Cecelia;Marks;100;Florence;0;F;Milo\r\n" + 
				"Addilynn;Schmitt;79;Budapest;6429;F;Archie,Ziggy,Toby,Finn,Lucky,Boomer\r\n" + 
				"Korbin;Parsons;93;Prague;997;M;Dozer\r\n" + 
				"Aisha;Garza;104;Bilbao;3926;F;Porter,Archie,Gucci,Buddy,Marley\r\n" + 
				"Karson;Mora;37;Paris;1550;M;Tucker,Rex,Ozzy,Tank\r\n" + 
				"Yara;Parra;132;Stockholm;6666;F;Remy,Odin\r\n" + 
				"Anais;Holmes;48;Rotterdam;4871;F;\r\n" + 
				"Ari;Moon;94;Sintra;0;F;\r\n" + 
				"Kasen;Dixon;28;Frankfurt am Main;0;M;Scout,Gus,Diesel,Bowie\r\n" + 
				"Kendrick;Webb;19;Thessaloniki;8621;M;Toby,Oreo,Bailey,Beau,Bentley,Lucky\r\n" + 
				"Madison;Delgado;85;Bucharest;7268;F;Jack,Oreo,Rambo\r\n" + 
				"Donovan;Mora;123;Thessaloniki;7691;M;Jasper,Shadow,Theo,Prince,Sam\r\n" + 
				"Catalina;Day;132;Rīga;7134;F;Rocket,Bruno,Remy,Watson,Kobe,Toby\r\n" + 
				"Valentino;Mckee;18;Athens;784;M;\r\n" + 
				"Tessa;Fleming;108;Munich;5286;F;Louie\r\n" + 
				"Zander;Jacobson;32;Riga;4377;M;Gucci,Chester,Koda,Otis\r\n" + 
				"Frances;Chapman;62;Wrocław;5924;F;Atlas,Harry,Porter,Cooper,Oliver\r\n" + 
				"Noah;Ellison;46;The Hague;0;F;Koda,Axel,Zeke\r\n" + 
				"Makenzie;Macias;23;Budapest;1199;F;Bruce,Shadow,Jackson\r\n" + 
				"Jasiah;Jarvis;21;Genoa;7698;M;Thor\r\n" + 
				"Niko;Davis;11;Helsinki;0;M;Maverick,Rex\r\n" + 
				"Rayne;Patrick;128;Alicante;0;F;Kobe,Lincoln,Ace,Remi,Milo,Chip\r\n" + 
				"Hannah;Landry;56;Plovdiv;197;F;Titan,Leo,Fluffy,Bruno,Rex\r\n" + 
				"Brycen;Alvarado;108;Stuttgart;9395;M;\r\n" + 
				"Miguel;Washington;25;Cologne;1030;M;Oliver\r\n" + 
				"Kaylee;Ballard;134;Utrecht;3294;F;\r\n" + 
				"Dream;Quintero;86;Hanover;3400;F;Blaze,Peanut,Oscar,Toby,Joey\r\n" + 
				"Denver;Wu;22;Seville;0;F;Rudy,Wally\r\n" + 
				"Rome;Duke;68;Kraków;6821;M;Buddy,Maverick,Koda,Rocket\r\n" + 
				"Reed;Bowen;37;Varna;0;M;Henry,Walter\r\n" + 
				"Justin;Parks;19;Varna;0;M;Gizmo,Porter\r\n" + 
				"Davina;Wang;121;Lyon;4937;F;Dexter\r\n" + 
				"Alianna;Hinton;63;Bucharest;599;F;Luke,Peanut,Murphy,Atlas,Toby,Blue\r\n" + 
				"Leilani;Whitaker;12;Varna;1423;F;Oakley,Bentley,Riley\r\n" + 
				"Kiara;Bowman;44;Essen;0;F;Rocco,Bo,Oakley,Tank\r\n" + 
				"Drake;Kemp;11;Stockholm;4984;M;Rudy,Shadow,Kylo,Theo,Peanut\r\n" + 
				"Nicholas;Bullock;18;Dortmund;0;M;Henry,Rex,Thor,Ozzy\r\n" + 
				"Dr. Elliott;Andrews;53;The Hague;7766;F;Arlo\r\n" + 
				"Journi;Kirk;32;Alicante;3350;F;\r\n" + 
				"Maeve;Cantu;139;Dresden;2728;F;Echo\r\n" + 
				"Nala;Blackwell;136;Turin;5253;F;Oliver,Bailey,Wally,Oscar,Marley\r\n" + 
				"Benson;Taylor;48;Bielefeld;0;M;\r\n" + 
				"Francesca;Higgins;51;Łódź;6508;F;Max,Porter,Jack,King,Ziggy\r\n" + 
				"Aleah;Mcintyre;71;Utrecht;0;F;\r\n" + 
				"Emory;Greer;25;Aarhus;5453;F;Coco,Shadow,Chip,Wally,Winston,Rusty\r\n" + 
				"Brycen;Corona;76;Catania;0;M;Ace,Sarge,Hank,Peanut,Odie,Miles\r\n" + 
				"Rowen;Salazar;49;Münster;0;M;Baxter,Moose,Bowie,Peanut\r\n" + 
				"Jedidiah;Dalton;88;Varna;0;M;\r\n" + 
				"Avery;Tucker;73;Nuremberg;473;M;Teddy,Walter,Odie,Harley\r\n" + 
				"Dr. Aron;Conley;100;Berlin;6349;M;Bruno,Rocco,Bruno,Oliver,Beau,Henry\r\n" + 
				"Wells;Simpson;79;Wuppertal;9631;M;Tank,Toby,Prince,Kobe,Cash,Ace\r\n" + 
				"Everett;Woodward;37;Gdańsk;0;M;Bruce,Walter\r\n" + 
				"Amari;Shepard;40;Sintra;5713;M;Simba,Zeus,Bandit,Wally\r\n" + 
				"Raelyn;Novak;12;Szczecin;0;F;Kobe,Whiskey,Ruger,Simba,Samson,Toby\r\n" + 
				"Dayana;Whitaker;80;Bydgoszcz;9167;F;\r\n" + 
				"Ahmir;Tate;64;Bonn;0;M;Toby,Tank\r\n" + 
				"Ariel;Ayala;123;Hamburg;2585;F;Oakley\r\n" + 
				"Ezra;Gomez;90;Thessaloniki;5638;F;Koda\r\n" + 
				"Harley;Rowe;74;Zagreb;5260;M;Dozer,Finn\r\n" + 
				"Bjorn;Camacho;84;Sintra;380;M;Samson,Remy,Louie,Ozzy,Archie,Otis\r\n" + 
				"Jaxon;Higgins;98;Palermo;1297;M;Wally,Sarge,Gunner\r\n" + 
				"Kace;Travis;66;Rotterdam;0;M;Axel,Miles,Sam\r\n" + 
				"Franco;Reeves;81;Leipzig;7187;M;Arlo\r\n" + 
				"Dr. Ayan;Trujillo;126;Essen;523;M;Axel,Whiskey,Joey,Blaze,Samson,Sam\r\n" + 
				"Noel;Garrison;71;Stockholm;458;M;Zeus,Cooper,Wally\r\n" + 
				"Faith;Hoover;67;Sintra;0;F;Buster,Thor,Zeus,Arlo,Dexter,Thor\r\n" + 
				"Ruben;Davenport;53;Genoa;7168;M;Coco,Baxter\r\n" + 
				"Dr. Dustin;Nixon;63;Vilnius;7508;M;Remy,Cooper,Ozzy,Jax,Cody,Beau\r\n" + 
				"Maryam;Joseph;77;Sintra;197;F;Teddy\r\n" + 
				"Alfredo;Vincent;103;Málaga;1853;M;Moose,Finn,Levi,Max\r\n" + 
				"Tristen;Atkins;102;Palermo;0;M;Oscar,Harry,Ozzy\r\n" + 
				"Taylor;Bauer;92;Paris;5435;M;Bo,Fluffy,Zeke,Peanut,Simba\r\n" + 
				"Aubrie;Piñeda;96;Lyon;3175;F;\r\n" + 
				"Milo;Guerra;130;Poznań;0;M;Beau,Luke\r\n" + 
				"Dr. Cecelia;Stanton;32;Bonn;6038;F;Gus,Rocky,Apollo,Prince,Jackson\r\n" + 
				"Rayan;Benitez;51;Berlin;386;M;Chester,Watson,Archie\r\n" + 
				"Dr. Maddox;Medrano;139;Riga;0;M;Peanut,Bruno,Ozzy,Rocky,Marley,Cody\r\n" + 
				"Leslie;Melton;15;Rīga;512;F;Rudy\r\n" + 
				"Zaylee;Dunn;99;Marseille;2377;F;Buster,Ozzy,Bailey,Baxter,Whiskey,Buddy\r\n" + 
				"Julius;Stephens;50;Copenhagen;8353;M;\r\n" + 
				"Dane;Chang;129;Paris;4953;M;Jasper\r\n" + 
				"Baker;Velez;93;Paris;1629;M;Oliver,Odin,Moose\r\n" + 
				"Rebecca;Harrington;85;Sintra;2831;F;Ollie,Oliver\r\n" + 
				"Melani;Black;82;Düsseldorf;722;F;Dozer,Moose,Oakley,Gizmo,Benny,Ozzy\r\n" + 
				"Dr. Joaquin;Taylor;134;Stockholm;0;M;Gizmo,Tyson\r\n" + 
				"Aspyn;Mendez;78;Thessaloniki;0;F;Harley,Bailey\r\n" + 
				"Elise;Rodriguez;89;Stuttgart;6031;F;Oliver,Arlo,Rusty,Fluffy\r\n" + 
				"Fletcher;Gibson;45;Thessaloniki;6628;M;Ace,Wally\r\n" + 
				"Promise;Wiggins;28;Gothenburg;0;F;Bentley,Rocco,Rocky,Levi,Ace,Bentley\r\n" + 
				"Vance;Paul;105;Málaga;4018;M;Toby,Bo,Sarge,Koda\r\n" + 
				"Lennox;Anthony;139;Vila Nova de Gaia;9140;F;Tucker,Otis\r\n" + 
				"Kylee;Meyer;125;The Hague;3052;F;Bowie,Jackson,Kylo,Murphy,Fluffy,Blue\r\n" + 
				"Nala;Nava;88;Dortmund;5369;F;Bowie,Ryder,Winston\r\n" + 
				"Rowan;Valencia;40;Amsterdam;4724;F;\r\n" + 
				"Tru;Travis;52;Helsinki;7109;M;Baxter\r\n" + 
				"Rebekah;Young;98;Paris;9601;F;\r\n" + 
				"Anaya;Patel;97;Vila Nova de Gaia;0;F;Chip,Duke,Teddy,Blaze,Cooper,Watson\r\n" + 
				"Bishop;Rush;70;Karlsruhe;0;M;Gizmo,Bentley,Cody\r\n" + 
				"Paloma;Dudley;109;Riga;9178;F;Axel\r\n" + 
				"Liana;Bell;45;Riga;0;F;Zeke,Kylo,Gus,Gucci\r\n" + 
				"Trey;Sweeney;25;Poznań;3927;M;Cash,Max,Rudy\r\n" + 
				"Tommy;Bowen;127;Szczecin;9178;M;Atlas,Samson,Tucker\r\n" + 
				"Jon;Frank;114;Hanover;7430;M;\r\n" + 
				"Dr. Kennedi;Hail;88;Genoa;0;F;Tyson,Blaze,Charlie,Tyson\r\n" + 
				"Dr. Kara;Rich;82;Bologna;0;F;Arlo,Titan\r\n" + 
				"Kash;Sharp;57;Genoa;7725;M;Scout,Titan,Beau,Bailey,Coco\r\n" + 
				"Ariyah;Richardson;77;Alicante;0;F;Tucker,Chip,Fluffy\r\n" + 
				"Dr. Cali;Browning;46;Brno;0;F;Copper,Jasper\r\n" + 
				"Emmanuel;Blackwell;26;Wrocław;1489;M;Duke,Prince,Jasper,Otis,Buster\r\n" + 
				"Kyra;Davila;65;Antwerp;0;F;Max,Duke\r\n" + 
				"Emerson;Guevara;86;Rotterdam;0;M;Rambo,Axel,Miles,Harry,Tucker,Dexter\r\n" + 
				"Jeremy;Clements;38;Athens;0;M;Mac,Jackson,Henry,Shadow,Bear,Apollo\r\n" + 
				"Giselle;Molina;15;The Hague;2781;F;Winston,Wally,Rusty,Gunner,Blue\r\n" + 
				"Zola;Franklin;125;Vila Nova de Gaia;0;F;Walter,Odin\r\n" + 
				"Laney;Benitez;120;Marseille;5234;F;Dozer\r\n" + 
				"Lainey;Nava;52;Iași;8297;F;\r\n" + 
				"Mira;Coleman;78;Rome;0;F;Odin\r\n" + 
				"Harlem;Copeland;131;Thessaloniki;6504;M;\r\n" + 
				"Karsyn;Brock;69;Valmiera;5335;M;Theo,Oliver,Beau,Romeo,Tank,Lincoln\r\n" + 
				"Dorian;Carpenter;89;Stockholm;4430;M;Oscar,Bruno,Scout,Buster\r\n" + 
				"Kellen;Hickman;116;Milan;2456;M;Moose,Maverick,Gunner,Harley,Gus\r\n" + 
				"Eleanor;Owens;114;Rotterdam;0;F;Moose,Thor,Jake,Jasper,Duke,Dexter\r\n" + 
				"Nellie;Johnston;82;Zaragoza;8369;F;Wally,Winston,Luke\r\n" + 
				"Stephanie;Alexander;39;Zaragoza;5496;F;Bailey,Murphy,Fluffy,Harry,Miles\r\n" + 
				"Stephen;Sexton;31;Frankfurt am Main;0;M;Chester\r\n" + 
				"Gracie;Yang;11;Budapest;4746;F;Rudy,Kobe,Oreo,Beau,Leo\r\n" + 
				"Averie;Gill;111;Bonn;7486;F;Beau\r\n" + 
				"Bella;Buck;126;Cluj-Napoca;0;F;Rambo,Jackson,Rudy,Ziggy\r\n" + 
				"Dr. Nathan;Simpson;82;Dresden;1729;M;Rocket,Oakley,Finn,Jake,Rocky\r\n" + 
				"Amaya;Collins;46;Lisbon;0;F;Mac,Riley,Peanut,Milo,Otis,Finn\r\n" + 
				"Aubrie;Wilkinson;114;Timișoara;0;F;Wally,Shadow\r\n" + 
				"Dior;Rivers;78;Barcelona;0;F;Sam,Rex,Ranger,Remi,Charlie,Beau\r\n" + 
				"Flynn;Summers;110;Lisbon;422;M;Gizmo,Oreo,Oliver,Tank\r\n" + 
				"Curtis;Ayers;83;Sofia;3616;M;Lincoln,Beau,Gunner\r\n" + 
				"Bentley;Golden;120;Lublin;0;M;Prince,Louie,Theo\r\n" + 
				"Kassidy;Davis;44;Seville;9243;F;Luke,Max,Chip,Milo\r\n" + 
				"Scarlette;Jackson;17;Dresden;0;F;Beau,Maverick,Bruce,Odin,Mac,Atlas\r\n" + 
				"Hunter;Carson;30;Copenhagen;0;M;Tyson,George,Blaze,Oliver,Titan\r\n" + 
				"Nia;Chen;105;Zaragoza;4224;F;Romeo,Lucky,Murphy\r\n" + 
				"Dr. Kyro;Liu;116;Brno;9157;M;Ollie\r\n" + 
				"Demetrius;Tate;113;Palma de Mallorca;8346;M;Max,Apollo,Ziggy,Coco,Coco,Jack\r\n" + 
				"Penny;Marsh;108;Kraków;7645;F;Odie,Levi,Tyson,Sarge,Tucker\r\n" + 
				"Elise;Moreno;80;Iași;0;F;\r\n" + 
				"Finley;Thornton;116;Zagreb;2870;M;King,Jack,Buster,Copper,Copper\r\n" + 
				"Dr. Jeremy;Chandler;12;Dortmund;6217;M;Copper\r\n" + 
				"Josue;Merritt;91;Wrocław;5475;M;Harley,Tucker,Otis,Zeus\r\n" + 
				"Cannon;Mcbride;31;Iași;0;M;\r\n" + 
				"Ramon;Romero;98;Kraków;6696;M;Sarge,Bandit,Marley,Watson,Thor,Henry\r\n" + 
				"Damien;Spence;33;Poznań;3702;M;\r\n" + 
				"Dr. Bianca;Parks;35;Munich;5435;F;Gucci,Prince,Bowie,Zeke\r\n" + 
				"Kamilah;Mathis;45;Palermo;0;F;King\r\n" + 
				"Dr. Teagan;Swanson;108;Karlsruhe;0;F;Apollo\r\n" + 
				"Dr. Cody;Roy;105;Amsterdam;7304;M;Gunner,Blue,Porter,Duke\r\n" + 
				"Dr. Zev;Robinson;11;Vilnius;8913;M;\r\n" + 
				"Wren;Rangel;116;Iași;4295;F;Diesel,Blaze,Remy,Kobe,Remi,Rex\r\n" + 
				"Dr. Khari;Sandoval;33;Paris;0;M;Benji\r\n" + 
				"Jemma;Brandt;103;Sintra;0;F;Bo,Winston\r\n" + 
				"Albert;Hoover;126;Barcelona;2924;M;Bandit,Samson,Peanut,Boomer\r\n" + 
				"Dr. Cal;Fields;61;Sigulda;0;M;Oscar,Rocket,Cash,Dozer\r\n" + 
				"Bryan;Robbins;43;Leipzig;0;M;Tank,Blaze,Ozzy\r\n" + 
				"Turner;Muñoz;91;Dortmund;2125;M;\r\n" + 
				"Mallory;Wiley;79;Copenhagen;0;F;Mac,Baxter,Teddy\r\n" + 
				"Trevor;Moss;33;Cologne;7230;M;Miles,Marley,Thor,Bruno\r\n" + 
				"Dr. Sage;Mclaughlin;13;Budapest;2765;F;Tank,Blaze,Bowie,Remy,Watson\r\n" + 
				"Ellis;Stark;113;Lublin;8165;M;\r\n" + 
				"Ares;Collins;14;Cologne;6295;M;\r\n" + 
				"Blaze;Clay;84;Timișoara;0;M;Jackson,Louie,Boomer\r\n" + 
				"Lawson;Medina;58;Naples;0;M;Ace,Sarge,Leo,Shadow,Jake\r\n" + 
				"Harlem;Jimenez;40;Catania;3492;M;Otis,Koda,Cash,Archie,Oreo,Atlas\r\n" + 
				"Aliana;Bowers;43;Hamburg;6590;F;Simba,Oreo,Wally,Boomer,Bear\r\n" + 
				"Franklin;Simmons;56;Bologna;0;M;Watson,Zeus,Lincoln,Kobe,Cash\r\n" + 
				"Aiden;Beard;127;Plovdiv;7741;M;Samson,Theo\r\n" + 
				"Genesis;Huerta;119;Karlsruhe;0;F;Ruger,Harley,King,Zeke,Porter,Oreo\r\n" + 
				"Royalty;Hoffman;85;Barcelona;0;F;Buster,Moose\r\n" + 
				"Ximena;Simpson;134;Thessaloniki;6996;F;Moose,Titan,Lincoln\r\n" + 
				"Parker;Craig;17;Stuttgart;2853;M;Ruger,Jack,Wally\r\n" + 
				"Rene;Meyers;68;Helsinki;0;M;Odie,Ace,Oakley,Fluffy,Sarge,Sam\r\n" + 
				"Ricky;Mays;76;Düsseldorf;1071;M;Copper,Benji,Thor,Wally,Dozer,Whiskey\r\n" + 
				"Dr. Lexie;Villalobos;113;Thessaloniki;0;F;Simba,Benji,Milo\r\n" + 
				"Bryant;Hinton;82;Galați;514;M;Buster,Blue\r\n" + 
				"Brynn;Strong;132;Lublin;1768;F;\r\n" + 
				"Lilianna;Wong;52;Helsinki;0;F;Walter,Bentley,Tank,Arlo,Atlas,Boomer\r\n" + 
				"Braelyn;Ávila;81;Vienna;8254;F;Tucker,Moose,Luke,Rex,Ace\r\n" + 
				"Bristol;Mckenzie;81;Genoa;3238;F;Ryder,Archie,Koda,Rex,Hank\r\n" + 
				"Gracelyn;Snow;61;Riga;2821;F;Bo,Bubba,Rusty,Koda,Bruce\r\n" + 
				"Jax;Lynch;84;Bucharest;7825;M;Jasper,Bo,Otis,Bowie\r\n" + 
				"Vincent;Rocha;112;Galați;0;M;Bubba,Gizmo,Jackson\r\n" + 
				"Madelyn;Estes;56;Nuremberg;6364;F;Rocky\r\n" + 
				"Trenton;Rowe;83;Palermo;0;M;\r\n" + 
				"Tatum;Lowery;104;Valencia;6917;F;Arlo,Louie,Oreo,Lucky,Bruno,Dozer\r\n" + 
				"Dr. Jamir;Diaz;122;Bonn;9395;M;Zeke,Bruno,Rocket,Rambo,Benny\r\n" + 
				"Esperanza;Nuñez;122;Bremen;4102;F;Henry,Levi,Bruce\r\n" + 
				"Valentin;Stevens;112;Leipzig;0;M;Tucker\r\n" + 
				"Jamie;Valencia;75;Valmiera;3276;F;Watson,Remi,Louie,Hank\r\n" + 
				"Mikayla;Townsend;36;Stuttgart;2167;F;Luke,Lucky,Watson,Buster,Lucky,Zeke\r\n" + 
				"Raylan;Hayes;120;Amsterdam;4917;M;Gizmo,Riley,Fluffy,Chester\r\n" + 
				"Harlow;Blackwell;131;Frankfurt am Main;2266;F;Lucky,Gizmo,Ruger,Sarge,Tucker,Bruce\r\n" + 
				"Skye;Zuniga;97;Rome;3509;F;Chase,Rex,Loki,Simba,Mac,Peanut\r\n" + 
				"Jayce;Bryant;136;Bilbao;0;M;\r\n" + 
				"Lionel;Hodge;42;Murcia;0;M;\r\n" + 
				"Galilea;Phan;133;Stuttgart;3775;F;Bear,Marley,Maverick,Tyson,Jake,Remi\r\n" + 
				"Rafael;Vasquez;95;Marseille;0;M;Arlo,Rambo,Zeke,Finn,Oreo\r\n" + 
				"Everlee;Wong;53;Catania;0;F;Bear,Remy,Oreo,Atlas,Fluffy,Blaze\r\n" + 
				"Everleigh;Mclean;93;Bratislava;0;F;Otis,Ollie,Whiskey\r\n" + 
				"Corinne;Fisher;85;Málaga;5650;F;Dozer,Bubba\r\n" + 
				"Karson;Odom;133;Cluj-Napoca;2002;M;Sam,Archie,Blue,Gunner\r\n" + 
				"Mallory;Conrad;137;Karlsruhe;2863;F;Dozer,Chase,Watson\r\n" + 
				"Fernando;Bailey;93;Lublin;0;M;Bo,Benny,Theo\r\n" + 
				"Lillian;Mullins;23;Antwerp;6060;F;\r\n" + 
				"Amirah;Navarro;57;Duisburg;0;F;King,Rusty,Oscar,Shadow,Tank,Moose\r\n" + 
				"Kaison;Dennis;77;Catania;2712;M;Rocket\r\n" + 
				"Ocean;Guzman;21;Bielefeld;0;M;Boomer,Ranger,Leo,Oakley\r\n" + 
				"Jayleen;Kramer;38;Lyon;6588;F;Samson\r\n" + 
				"Theodore;Mendez;71;Catania;5776;M;Koda,Buster,Chip,Whiskey,Titan,Harry\r\n" + 
				"Henrik;Rodgers;138;Catania;2373;M;\r\n" + 
				"Lena;Porter;16;Poznań;3178;F;Henry,Loki,Blaze,Tyson,Ranger\r\n" + 
				"Dr. Bear;Logan;138;Barcelona;175;M;Rex,Bailey\r\n" + 
				"Jaylin;Velasquez;45;Nuremberg;0;F;Shadow,Ace,Jack,Dozer\r\n" + 
				"Indie;Rojas;120;Szczecin;5643;F;Lucky,Henry\r\n" + 
				"Mila;Sheppard;96;Athens;0;F;Apollo,Harry,Sarge,Whiskey,Jackson\r\n" + 
				"Christina;Price;64;Kraków;0;F;Oscar,Bailey,Samson\r\n" + 
				"Olivia;Everett;134;Dresden;0;F;Joey\r\n" + 
				"Lily;Kelly;84;Dresden;0;F;Apollo,Fluffy,Loki\r\n" + 
				"Samir;Bean;110;The Hague;2209;M;Blue,Rocco\r\n" + 
				"Dr. Neil;Gomez;42;Copenhagen;3870;M;Cooper,Jasper,Titan,Echo,Porter,Dozer\r\n" + 
				"Kaleb;Luna;106;Mannheim;214;M;Jax,Benji\r\n" + 
				"Paula;Juarez;70;Wrocław;0;F;Gus\r\n" + 
				"Raiden;Person;96;Lisbon;4870;M;Oliver,Charlie,Rocky,Hank,Loki\r\n" + 
				"Stephen;Holland;118;Szczecin;1967;M;Gunner,Ozzy,Loki\r\n" + 
				"Myla;Mcbride;14;Leipzig;6578;F;Chester,Rocco,Toby,Bowie,Remy,Baxter\r\n" + 
				"Teresa;Hall;69;Riga;3966;F;Bubba\r\n" + 
				"Helena;Arias;125;Wrocław;1581;F;Harley\r\n" + 
				"Lacey;Buchanan;31;Bonn;6190;F;\r\n" + 
				"Frances;Howe;106;Malmö;4295;F;Axel,Blue,Rocco\r\n" + 
				"Dr. Levi;Doyle;103;Bonn;0;M;Bear,Dexter,Levi,Loki\r\n" + 
				"Niko;Norman;126;Rīga;9303;M;Oakley,Baxter,Axel,Luke,Odin\r\n" + 
				"Caiden;Clarke;123;Milan;8385;M;Rocky,Gizmo,Gus,Coco\r\n" + 
				"Jericho;Ayala;83;Brno;0;M;Lucky,Chester\r\n" + 
				"Corinne;Fields;69;Cologne;4975;F;Cooper,Romeo,Zeus,Otis\r\n" + 
				"Gerald;Vasquez;74;Gdańsk;0;M;Sarge,Simba,Theo\r\n" + 
				"June;Foster;120;Marseille;6951;F;\r\n" + 
				"Jaxon;Herring;91;Dortmund;0;M;George,Teddy,Atlas,Theo\r\n" + 
				"Ari;Corona;78;Bonn;1314;F;Tank,Mac\r\n" + 
				"Aislinn;Wheeler;137;Valmiera;6001;F;\r\n" + 
				"Tanner;Walls;127;Milan;6456;M;Zeus,Ranger,Rudy\r\n" + 
				"Pierce;Matthews;13;Copenhagen;0;M;Gizmo,Zeus,Sarge,Levi\r\n" + 
				"Adam;Stevenson;117;Hamburg;0;M;Buster\r\n" + 
				"Kannon;Armstrong;39;Hanover;0;M;Rambo,Bentley,Lincoln\r\n" + 
				"Dr. Amira;Mccall;101;Toulouse;1957;F;Chester\r\n" + 
				"Arlo;Harris;30;Copenhagen;0;M;\r\n" + 
				"Katelyn;Myers;91;Milan;0;F;Baxter,Rusty,Oscar\r\n" + 
				"Jose;Villa;127;Sintra;0;M;Sarge,Marley,Cooper,Bubba,Loki\r\n" + 
				"Izabella;Anderson;22;Seville;1242;F;Blaze\r\n" + 
				"Denise;Friedman;131;Sigulda;0;F;Hank,Boomer,Kylo,Watson,Odin,Prince\r\n" + 
				"Anahi;Gibson;39;Amsterdam;0;F;\r\n" + 
				"Dominic;Gross;57;Naples;9405;M;Rudy,Loki,Porter,Kobe,Loki\r\n" + 
				"Simon;Reilly;115;Münster;8889;M;Ollie,Duke\r\n" + 
				"Daleyza;Ávila;58;Athens;0;F;Toby,Luke,Dozer,Odie,Echo,Harley\r\n" + 
				"Dr. Kira;Ellison;58;Leipzig;0;F;Leo\r\n" + 
				"Juniper;Underwood;126;Madrid;0;F;Archie\r\n" + 
				"Keanu;Stephenson;13;Leipzig;2457;M;Copper,Odin\r\n" + 
				"Thiago;Church;33;Vienna;0;M;Bo,Henry,Chip,Riley,Bowie\r\n" + 
				"Bryce;Wilkins;69;Hanover;7085;M;Copper,Bowie,Rocco\r\n" + 
				"Mack;Oliver;130;Lyon;8575;M;Dexter,Oscar,Benji,Prince,Watson\r\n" + 
				"Rachel;Cummings;75;Turin;2691;F;\r\n" + 
				"Jaliyah;Ellison;132;Bratislava;5334;F;Prince,Odie\r\n" + 
				"Colette;Gregory;102;Milan;0;F;Loki,Echo,Charlie\r\n" + 
				"Kayden;Truong;113;Sintra;7263;M;Bear,Bruce\r\n" + 
				"Dr. June;Sanchez;27;Malmö;0;F;Duke,Remi\r\n" + 
				"Kinsley;Houston;41;Vienna;0;F;Ace,Murphy,Luke,Ozzy,Bear,Murphy\r\n" + 
				"Millie;Herrera;10;Bochum;0;F;Peanut,Moose,George,Cody,Remy\r\n" + 
				"Jorge;Villalobos;29;Stuttgart;1398;M;Murphy,Rambo,Remy\r\n" + 
				"Teagan;Dixon;61;Gdańsk;0;F;Blaze,Romeo,King,Rocket,Arlo,Cash\r\n" + 
				"Camila;Welch;139;Sintra;571;F;Henry,Sarge,Jack,Harry,Milo,Miles\r\n" + 
				"Onyx;Lim;50;Frankfurt am Main;1061;M;Riley,Bandit,Bruno\r\n" + 
				"Dr. Liv;Fitzpatrick;81;Berlin;0;F;Zeke,Miles,Ranger,Bo\r\n" + 
				"Karter;Cunningham;103;Málaga;8384;M;Charlie,Chip\r\n" + 
				"Jaxon;Kennedy;102;Helsinki;7714;M;Gizmo\r\n" + 
				"Haley;Person;135;Córdoba;0;F;Bailey,Joey,Wally\r\n" + 
				"Dr. Warren;Lucas;10;Kraków;0;M;Oscar,Levi\r\n" + 
				"Wilder;Keller;23;Palermo;0;M;\r\n" + 
				"Dr. Juelz;Donaldson;47;Córdoba;0;M;Ace,Maverick,Bowie,Duke,Oreo,Tank\r\n" + 
				"Dr. Harley;Mosley;70;Zaragoza;0;M;Baxter,Louie,Loki,Ranger,Fluffy,Marley\r\n" + 
				"Zechariah;Mcclure;16;Sintra;2323;M;Remi\r\n" + 
				"Jane;Adams;96;Essen;2964;F;Rambo,Buddy\r\n" + 
				"Santiago;Sanchez;29;Lyon;5131;M;Levi,Bowie,Charlie,Tyson,Jax\r\n" + 
				"Angelina;Alfaro;77;Dresden;6092;F;\r\n" + 
				"Jamir;Fuentes;117;Bydgoszcz;1056;M;Harry,Oakley,Jake\r\n" + 
				"Marina;Chan;29;Genoa;6891;F;Atlas,Tank\r\n" + 
				"Eve;Macias;109;Bari;7341;F;Blaze\r\n" + 
				"Skyla;Miranda;63;Zagreb;2952;F;Romeo,Samson,Oreo\r\n" + 
				"Naomi;Schultz;74;Thessaloniki;9385;F;Lucky,Tucker,Max,Cooper,Ziggy,Murphy\r\n" + 
				"Dr. Zhuri;Pugh;32;Nuremberg;5587;F;Jasper,Gizmo\r\n" + 
				"Ian;Cantrell;34;Szczecin;8879;M;Scout,Finn\r\n" + 
				"Gianni;Finley;38;Alicante;3878;M;Otis\r\n" + 
				"Alessandra;Gregory;124;Bari;6209;F;Hank,Blaze,Gizmo,Wally,Chase,Chip\r\n" + 
				"Calum;Robertson;133;Iași;8579;M;Dexter,Rocket,Henry,Henry\r\n" + 
				"Kashton;Brennan;13;Córdoba;3781;M;\r\n" + 
				"Justice;Guerra;18;Hanover;9606;F;Cody\r\n" + 
				"Corey;Colón;79;Bonn;0;M;Theo,Arlo,Luke,Leo\r\n" + 
				"Danielle;Lyons;54;Copenhagen;8848;F;Lucky,Bruno,Oliver,Simba,Otis\r\n" + 
				"Dr. Flynn;Bradley;123;Lublin;3058;M;Marley,Winston,Jasper,Watson\r\n" + 
				"Marilyn;Harris;129;Thessaloniki;7247;F;Max,Echo,Boomer\r\n" + 
				"Oscar;Wang;135;Bremen;2986;M;Loki,Chase,Bowie\r\n" + 
				"Dr. Valentino;Caldwell;137;Berlin;4676;M;Coco,Echo,Luke,Boomer,Simba,Coco\r\n" + 
				"Jeremias;Gaines;85;Plovdiv;4446;M;\r\n" + 
				"Leia;Green;121;Gothenburg;7054;F;Ace,Romeo,Miles,Ranger,Kylo,Rocky\r\n" + 
				"Aarav;French;135;Bochum;1334;M;\r\n" + 
				"Aleah;Acevedo;130;Bucharest;0;F;Ziggy,Otis,Ruger,Levi,Henry\r\n" + 
				"Emerson;Bartlett;58;Hanover;9960;F;Sam,Joey\r\n" + 
				"Fox;Mckenzie;72;Münster;1338;M;Odin,Simba\r\n" + 
				"Kole;Li;115;Munich;2716;M;Whiskey,Henry,King\r\n" + 
				"Blakely;Conner;94;Szczecin;6968;F;Oreo,Baxter,Winston\r\n" + 
				"Ansley;Avery;117;Zaragoza;9246;F;Lincoln,Zeke\r\n" + 
				"Julieta;Vang;69;Gothenburg;2359;F;Oreo,Ollie\r\n" + 
				"April;Valentine;12;Florence;7346;F;Odie\r\n" + 
				"Leonard;Leon;68;Aarhus;7794;M;Bruno\r\n" + 
				"Dr. Jagger;Carr;47;Paris;7606;M;Oliver,Luke,Fluffy,Shadow,Thor\r\n" + 
				"Scout;Allison;67;Szczecin;1852;F;\r\n" + 
				"Gary;Barnes;136;Thessaloniki;221;M;Gunner\r\n" + 
				"Dr. Dax;Velasquez;118;Cologne;3359;M;Gucci,Leo,Gucci\r\n" + 
				"Bennett;Jarvis;41;Toulouse;8512;M;Louie,Jasper,Watson,Murphy\r\n" + 
				"Dr. Azalea;Vargas;41;Karlsruhe;1738;F;Levi,Bruce,Prince,Diesel,Buster\r\n" + 
				"Camden;Mills;63;Berlin;218;M;Romeo,Oakley,Arlo,Ryder,Odie\r\n" + 
				"Dr. Yosef;Hood;10;Münster;1259;M;Rocky,Dozer,Teddy,Rocky\r\n" + 
				"Denisse;Landry;90;Valmiera;0;F;Simba,Scout,Jack\r\n" + 
				"Andy;Olson;50;Rome;8273;M;Chip\r\n" + 
				"Annalise;Swanson;68;Plovdiv;5077;F;Fluffy,Chester,Louie,Ryder,Rocket\r\n" + 
				"Mateo;Bravo;78;Leipzig;0;M;Rocket,Mac\r\n" + 
				"Ian;Correa;15;Łódź;5558;M;\r\n" + 
				"Ali;Stafford;42;Lublin;6971;M;King,Harry,Rudy,Scout,Arlo\r\n" + 
				"Dr. Eduardo;Sawyer;126;Bari;2240;M;Fluffy,Apollo,Bear,Harry,Jackson\r\n" + 
				"Kylie;Cantrell;121;Düsseldorf;8001;F;Kobe\r\n" + 
				"Dominic;Parks;59;Hamburg;5746;M;Lincoln,Remi,Oakley\r\n" + 
				"Zander;Randolph;70;Rome;2746;M;Bowie,Moose,Koda,Baxter,Archie,Kobe\r\n" + 
				"Mae;Mclaughlin;115;Paris;2685;F;Copper,Henry\r\n" + 
				"Dr. Adler;Holt;98;Nuremberg;1683;M;Murphy,Bailey\r\n" + 
				"Chandler;Rhodes;72;Łódź;9203;M;\r\n" + 
				"Ashley;Dixon;134;Bochum;7895;F;Ryder,Kobe,Copper,Axel\r\n" + 
				"Adonis;Love;76;Dresden;2479;M;\r\n" + 
				"Karter;Byrd;121;Kraków;6651;M;Rocket,Lincoln,Oscar,Harry\r\n" + 
				"Israel;Nielsen;129;Athens;6103;M;Jackson,Apollo,Rambo,Oakley,Fluffy\r\n" + 
				"Evelyn;Randolph;116;Bari;0;F;Charlie,Benji,Harley,Ozzy\r\n" + 
				"Amina;Stafford;92;Stockholm;2822;F;Louie,Joey,Kylo,Gunner,Diesel,Ozzy\r\n" + 
				"Baylor;Romero;12;Bucharest;1563;M;Dexter,Jackson,Winston,Gunner\r\n" + 
				"Ephraim;Walsh;101;Athens;6064;M;Romeo,Kobe\r\n" + 
				"Adriana;Lewis;107;Sigulda;5378;F;Watson,Finn,Oliver,Luke,Henry,Max\r\n" + 
				"Dilan;Black;49;Nice;0;M;Ryder,Watson,Copper,Tank,Dozer\r\n" + 
				"Marley;Mccann;11;Nantes;0;M;Oliver,Remy,Rambo,Chip\r\n" + 
				"Daniel;Vincent;128;Sigulda;0;M;Gus,Jack,Gucci,Jack,Titan,Romeo\r\n" + 
				"Dr. Emani;Quintero;63;Madrid;0;F;Jax\r\n" + 
				"Autumn;Whitaker;115;Munich;5405;F;Romeo,Teddy\r\n" + 
				"Clayton;Pruitt;41;Helsinki;7735;M;Maverick,Ryder,Boomer,Tank,Dozer\r\n" + 
				"Bruno;Perez;134;Dortmund;8797;M;Kylo\r\n" + 
				"Remington;Lawrence;137;Lublin;7390;F;Blue,Ziggy,Maverick,Blaze\r\n" + 
				"Ellis;Dodson;110;Hanover;1199;F;Beau\r\n" + 
				"Shiloh;Glenn;132;Szczecin;5156;F;Rocco,Whiskey,Milo,Wally\r\n" + 
				"Cannon;Boyd;85;Catania;9820;M;Cooper\r\n" + 
				"Dr. Jake;Shaffer;10;Vila Nova de Gaia;0;M;Archie\r\n" + 
				"Avianna;Burton;27;Rīga;0;F;Porter,George,Prince,Rocco\r\n" + 
				"Kylen;Stewart;35;Bielefeld;2735;M;\r\n" + 
				"Talia;Castro;15;Bilbao;8163;F;Rocky,Bowie,Sarge,Ace\r\n" + 
				"Brock;Lester;37;Athens;9911;M;Wally,Odie\r\n" + 
				"Sutton;Rosales;73;Bydgoszcz;1080;M;Sarge,Theo,Luke,Charlie,King,Dexter\r\n" + 
				"Ainsley;Trejo;20;Wrocław;9081;F;Murphy,Samson,Odie,Sarge,Theo\r\n" + 
				"Bobby;Cooper;50;Malmö;0;M;Theo,Sam,Bentley\r\n" + 
				"Aylin;Gilbert;99;Utrecht;4661;F;Kobe,Murphy,Kobe,Thor,George,Beau\r\n" + 
				"Loretta;Glenn;60;Hanover;8022;F;Bo,Buster,Odin,Scout\r\n" + 
				"Turner;Murphy;127;Constanța;7006;M;Baxter,Walter\r\n" + 
				"Amari;Mcconnell;57;Barcelona;0;M;\r\n" + 
				"Mack;Huff;130;Catania;2181;M;Axel,Otis\r\n" + 
				"Stella;Mcgee;16;Milan;8414;F;Tank,Apollo,Wally,Rex\r\n" + 
				"Brendan;Nixon;55;Amsterdam;0;M;Scout,Whiskey,Charlie\r\n" + 
				"Dr. Stormi;Frank;27;Rīga;6808;F;Rocky,Louie,Sarge,Jake,Kobe,Ozzy\r\n" + 
				"Milena;Chase;120;Lisbon;8837;F;Bentley,Buddy,Copper,Whiskey,Lucky,Ozzy\r\n" + 
				"Milena;Carrillo;135;Malmö;0;F;King,Teddy,Walter,Bentley,Zeus\r\n" + 
				"Emersyn;Bush;93;Bologna;8890;F;Copper\r\n" + 
				"Noah;Lin;20;Paris;0;M;Bear,Zeke,Bubba,Remy,Otis,Ace\r\n" + 
				"Oliver;Olson;132;Gdańsk;0;M;Henry\r\n" + 
				"Kallie;Park;90;Palma de Mallorca;0;F;Watson,Leo,Fluffy,Bailey,Henry,Dozer\r\n" + 
				"Kinsley;Ray;128;Turin;2341;F;Jake,Gizmo,Koda,Jax,Charlie,Atlas\r\n" + 
				"Anne;Cisneros;127;Amsterdam;8967;F;Harley,Samson,Gucci,Watson,Zeke,Watson\r\n" + 
				"Isabella;Payne;68;Cluj-Napoca;4766;F;\r\n" + 
				"Dr. Brynn;Cline;92;Wrocław;7071;F;Baxter,Rusty,Oliver,Archie,Bear\r\n" + 
				"Harmoni;Walton;32;Marseille;9820;F;Ryder\r\n" + 
				"Aurora;Holloway;24;Zagreb;7047;F;King,Joey,Rocco\r\n" + 
				"Stephen;Simpson;98;Vilnius;9247;M;Hank,Jack,Milo,Jake,Rocky\r\n" + 
				"Malayah;Mccall;17;Warsaw;9661;F;Gizmo\r\n" + 
				"Apollo;Shah;88;Valmiera;2516;M;Benji,Fluffy,Bruce\r\n" + 
				"Giavanna;Rasmussen;81;Valencia;9622;F;Arlo,Diesel,Teddy,Walter\r\n" + 
				"Azalea;Banks;88;Prague;6946;F;Oreo,Fluffy,Fluffy,Milo,Leo,Dexter\r\n" + 
				"Canaan;Castillo;138;The Hague;613;M;Milo,Beau,Simba,Gunner,Remi,Otis\r\n" + 
				"Jasper;Clements;42;Barcelona;691;M;Maverick,Toby,Walter,Benji,Samson\r\n" + 
				"Jade;Brooks;71;Mannheim;5989;F;\r\n" + 
				"Conrad;Valenzuela;103;Berlin;767;M;Rudy\r\n" + 
				"Kannon;Villegas;121;Münster;0;M;Maverick,Jackson,Arlo,Ranger,Gizmo\r\n" + 
				"Anne;Hardy;12;Sintra;0;F;Echo,Shadow,Lucky,Winston\r\n" + 
				"Juliette;Petersen;74;Bilbao;3880;F;Copper\r\n" + 
				"Serenity;Shaffer;42;Prague;884;F;Winston,Porter,Jackson,Zeus,Beau\r\n" + 
				"Piper;Beil;71;Szczecin;5478;F;Buddy,Boomer,Murphy,Ryder\r\n" + 
				"Eve;Boyle;65;Berlin;8940;F;Harry,Oreo,Bear,Toby,Echo\r\n" + 
				"Leland;Stark;16;Palma de Mallorca;0;M;\r\n" + 
				"Dr. Marshall;Huber;73;Marseille;9065;M;Simba,Coco,Wally,Bandit,Remy\r\n" + 
				"Liana;Wolfe;125;Łódź;3777;F;Rocket,Scout\r\n" + 
				"Callie;Frederick;19;Bremen;8748;F;\r\n" + 
				"Ivy;Ali;49;Palma de Mallorca;0;F;George,Duke\r\n" + 
				"Lilliana;Mckay;68;Budapest;0;F;Riley,Rex\r\n" + 
				"Julio;Luna;97;Barcelona;8027;M;\r\n" + 
				"Jillian;Ahmed;97;Vienna;8291;F;Mac,Fluffy\r\n" + 
				"Kira;Goodman;63;Florence;4630;F;Boomer,Rocket\r\n" + 
				"Ari;Ellis;105;Frankfurt am Main;0;F;Winston,Hank,Rusty,Bubba\r\n" + 
				"Baylor;Lu;22;Dresden;0;M;Jake,Rocky\r\n" + 
				"Florence;Fuentes;91;Bilbao;0;F;Boomer,Kobe,Odie,Oliver,Blaze\r\n" + 
				"Layton;Tang;138;Kraków;0;M;Milo\r\n" + 
				"Grant;Baldwin;104;The Hague;880;M;Winston,Ollie\r\n" + 
				"Dr. Myles;Calderon;57;Bologna;5460;M;King,Porter,Milo,Bruce\r\n" + 
				"Jameson;Evans;15;Gothenburg;3936;M;Echo,Sam\r\n" + 
				"Dilan;Meadows;73;Nice;4827;M;Rusty,Baxter\r\n" + 
				"Arturo;Lucero;102;Karlsruhe;4256;M;Teddy,Rusty,Levi\r\n" + 
				"Cataleya;Dillon;31;Antwerp;9682;F;Tucker,Bo,Bruno,Rocco\r\n" + 
				"Tobias;Wheeler;117;Naples;0;M;Max,Romeo,Henry,Chester\r\n" + 
				"Leilani;Cardenas;24;Poznań;7870;F;Cash\r\n" + 
				"Dr. Brock;Hawkins;16;Duisburg;8721;M;Luke,Milo,Harry,Tyson,Luke,Remi\r\n" + 
				"Joanna;Frye;81;Dresden;2235;F;Boomer,Chase\r\n" + 
				"Frances;Zimmerman;109;Sintra;3998;F;Lincoln\r\n" + 
				"Zakai;Melendez;20;Utrecht;3610;M;Jake,Jasper,Marley,Chester\r\n" + 
				"Jacqueline;Michael;121;Rīga;917;F;Leo,George,Rocco,Axel\r\n" + 
				"Murphy;Cortes;55;Bochum;0;M;Cash,Toby\r\n" + 
				"Arabella;Warren;29;Helsinki;1037;F;\r\n" + 
				"Dr. Oakley;Garrett;136;Bilbao;0;M;Gucci,Rusty,Zeus,Cash,Titan,Cooper\r\n" + 
				"Kamryn;Webster;21;Lyon;1659;F;Coco\r\n" + 
				"Zahir;Keller;119;Rotterdam;5356;M;Bo,Rudy,Jake\r\n" + 
				"Janiyah;Cross;50;Bonn;0;F;Bear\r\n" + 
				"Julieta;Harper;105;Łódź;6728;F;Sarge\r\n" + 
				"Roberto;Palmer;74;Dublin;5238;M;Oreo,Ollie,Rocco,Blue,Jack\r\n" + 
				"Joyce;Glass;18;Nantes;9943;F;Bubba,Jack,Gus\r\n" + 
				"Aurora;Lowe;25;Cologne;8668;F;Benji,Max\r\n" + 
				"Mateo;Sanford;116;Cologne;0;M;\r\n" + 
				"Mikayla;Buchanan;124;Bologna;7406;F;Maverick,Milo,Leo,Chase,Duke,Loki\r\n" + 
				"Bennett;Glenn;32;Gdańsk;0;M;Dexter,Titan,Diesel\r\n" + 
				"Dr. Alejandro;Massey;56;Wuppertal;1626;M;Gucci,Tucker,Ace,Whiskey,Cash\r\n" + 
				"Arya;Williamson;53;Sofia;0;F;Bear,Walter,Leo\r\n" + 
				"Saige;Stanley;129;Alicante;1247;F;Ranger,Rex\r\n" + 
				"Karina;Lindsey;94;Dortmund;0;F;Kylo,Odin\r\n" + 
				"Darren;Jones;23;Marseille;4912;M;Rex,Romeo,Otis,Theo\r\n" + 
				"Hadley;Randolph;85;Milan;7724;F;Jax,Hank,Diesel,Remy\r\n" + 
				"Princess;Byrd;106;Constanța;7732;F;Jack,Rocco,Echo\r\n" + 
				"Ledger;Gregory;76;Bucharest;0;M;Ziggy,Atlas,Copper,Diesel,Buddy,Oreo\r\n" + 
				"Royce;Richard;96;Sintra;4647;M;Peanut,Scout,Otis,Jack\r\n" + 
				"Finn;Finley;115;Constanța;347;M;Gizmo,Benny\r\n" + 
				"Ian;Choi;116;Bielefeld;4608;M;Chase,Odin,Echo,Jake,Whiskey\r\n" + 
				"Rose;Hood;44;Bremen;0;F;Chase,Rambo,Bandit\r\n" + 
				"Kohen;Conner;18;Valmiera;0;M;Copper,Whiskey,Levi,Luke,Rambo\r\n" + 
				"Jade;Noble;29;Turin;0;F;Levi,Blaze,Chase\r\n" + 
				"Jude;Preston;70;Sigulda;2034;M;Archie,Archie,Axel,Sarge\r\n" + 
				"Dr. Briana;Foster;48;Münster;0;F;\r\n" + 
				"Matilda;George;30;Nantes;3458;F;Walter,Bowie\r\n" + 
				"Dr. Atreus;Yu;78;Frankfurt am Main;3276;M;Cody\r\n" + 
				"Tatum;Barron;135;Bielefeld;9338;M;Coco,Odie,King,Simba\r\n" + 
				"Max;Conner;42;Hamburg;6855;M;\r\n" + 
				"Cory;Young;112;Łódź;2770;M;\r\n" + 
				"Heaven;Gates;66;Amsterdam;7865;F;Ruger,Hank,Bruno,Buster,Rudy,Odie\r\n" + 
				"Kace;Pruitt;22;Córdoba;1173;M;Bruce,Gucci,Ace,Romeo,Odin\r\n" + 
				"Brantley;Glass;61;Vienna;0;M;Bailey\r\n" + 
				"Zayd;Valencia;127;Dortmund;1161;M;Rocco\r\n" + 
				"Boden;Conrad;14;Galați;0;M;Bear\r\n" + 
				"Emma;Dejesus;100;Genoa;8354;F;Dexter,Shadow,Shadow,Ollie,George,Rocket\r\n" + 
				"Maddison;Wu;113;Cluj-Napoca;0;F;Echo,Axel,Samson,Henry\r\n" + 
				"Kareem;Jarvis;37;Palermo;7734;M;Walter,Harry,Hank,Peanut,Sam,Bruno\r\n" + 
				"Emmy;Khan;38;Dortmund;0;F;Otis,Oreo,Chester,Copper,Ace,Cooper\r\n" + 
				"Jaiden;Stevens;45;Constanța;8232;M;Leo\r\n" + 
				"Omar;Bonilla;126;Brno;2530;M;Chester,Remy\r\n" + 
				"Elliot;Flynn;100;Sigulda;9368;M;Simba,Buster,Ziggy,Blue,Rocky\r\n" + 
				"Dr. Bella;Neal;65;Timișoara;5096;F;Gunner,Gucci,Kobe\r\n" + 
				"Wayne;Maxwell;12;Szczecin;0;M;Boomer,Bubba,Sam,Wally,Beau,Blue\r\n" + 
				"Dr. Ellison;Velez;55;Antwerp;5376;F;Cash,Baxter\r\n" + 
				"Rio;Clark;111;Seville;8817;M;Bailey,Dozer,Fluffy,Bo\r\n" + 
				"Isaiah;Hahn;73;Hanover;5984;M;Copper,Chase,Peanut,Oliver\r\n" + 
				"Abdiel;Schmitt;14;Rome;6923;M;Axel\r\n" + 
				"Jeffery;Mcdonald;62;Utrecht;7610;M;Harry,Bruce,Watson\r\n" + 
				"Rhea;Dickerson;26;Valencia;0;F;Apollo,Samson,Boomer,Coco\r\n" + 
				"Zoya;Barrera;74;Iași;0;F;Jackson\r\n" + 
				"Finley;Bentley;132;Vienna;8681;M;\r\n" + 
				"Marcos;Lyons;138;Amsterdam;862;M;\r\n" + 
				"Dominick;Pennington;102;Warsaw;8754;M;Shadow,Oliver,Ryder\r\n" + 
				"Logan;Garcia;20;Galați;7214;F;Wally,Simba,Rex,Copper,Finn\r\n" + 
				"Arian;Wolfe;91;Nuremberg;3043;M;Koda,Tank,Jake,Coco,Murphy,Jack\r\n" + 
				"Dr. Cory;Shaw;72;Seville;3062;M;Simba\r\n" + 
				"Leighton;Dean;57;Madrid;0;F;Rocco,Dozer\r\n" + 
				"Briggs;Peralta;107;Bremen;8973;M;Cash,Rocky,Scout,Peanut\r\n" + 
				"Huxley;Hoover;48;Murcia;0;M;Gucci,Rusty\r\n" + 
				"August;Daniels;120;Düsseldorf;8509;F;Chester\r\n" + 
				"Dr. Ellianna;Lang;90;Florence;4180;F;\r\n" + 
				"Bobby;Benton;25;Valencia;2449;M;Odie,Rambo,Ranger\r\n" + 
				"Jenna;Stout;110;Malmö;8112;F;Ollie,Ziggy\r\n" + 
				"Moshe;Acevedo;121;Plovdiv;1805;M;Cody\r\n" + 
				"Zoya;Graham;20;Wrocław;9941;F;Otis,Rex,Gizmo,Arlo,Moose,Scout\r\n" + 
				"Dr. Ellis;Hale;24;Barcelona;7345;F;Odie,Oreo,Oakley,Apollo,Remy,Tucker\r\n" + 
				"Karla;Taylor;52;Lublin;8446;F;Harry,Lucky,Porter,Leo,Louie\r\n" + 
				"Lucille;Gonzalez;57;Cluj-Napoca;9357;F;Rocket,Murphy,Winston\r\n" + 
				"Daleyza;Howe;35;Naples;0;F;Whiskey,Theo\r\n" + 
				"Celia;Massey;34;Rome;5510;F;Luke\r\n" + 
				"Maria;Bailey;86;Gothenburg;2075;F;Louie,Prince,Toby,Benny,Simba,Prince\r\n" + 
				"Stephanie;Ponce;100;Bucharest;6023;F;Rocket,Gucci,Bailey\r\n" + 
				"Dr. Selene;Crawford;41;Alicante;4020;F;Zeus,Watson\r\n" + 
				"Ben;Crane;67;Zagreb;6461;M;Bailey\r\n" + 
				"Dr. Serenity;Duncan;56;Dresden;4049;F;Gunner,Rudy\r\n" + 
				"Carter;Salinas;99;Paris;7291;M;George,Murphy,Zeus,Moose,Otis,King\r\n" + 
				"Tanner;Wallace;111;Berlin;0;M;Oscar,Beau\r\n" + 
				"Kash;Patrick;28;Varna;0;M;Beau,Ranger,Shadow,Gizmo,Teddy,Bowie\r\n" + 
				"Jessie;Krueger;15;Amsterdam;8137;F;Prince,Blaze,Porter\r\n" + 
				"Heath;Manning;136;Toulouse;2252;M;Ryder,Kylo,Ranger\r\n" + 
				"Rachel;Rosario;110;Duisburg;3611;F;\r\n" + 
				"Julissa;Webster;96;Warsaw;2331;F;Winston\r\n" + 
				"Mack;Tyler;111;Dortmund;7192;M;Zeke,Thor,Rex,Max,Diesel\r\n" + 
				"Ryker;Douglas;25;Plovdiv;0;M;Boomer,Bubba,Jackson\r\n" + 
				"Annabella;Morton;100;Lisbon;4413;F;Kylo,Benji,Benji,Max\r\n" + 
				"Ellie;Bowman;86;Bari;8422;F;Koda,Axel,Harley\r\n" + 
				"Braden;Potter;51;Bucharest;8708;M;Chase\r\n" + 
				"Fernanda;Madden;80;Hanover;0;F;Archie,Ruger\r\n" + 
				"Creed;Boyle;72;Kraków;0;M;Hank,Benji,Bruce,Romeo\r\n" + 
				"Mary;Peterson;121;Essen;8837;F;Fluffy,Chip,Maverick,Buddy,Benji\r\n" + 
				"Lyric;Hull;76;Timișoara;0;M;King,Benji,Bear,Oakley,Beau,Riley\r\n" + 
				"Ayan;Valentine;138;Antwerp;0;M;Benji,Milo,Jax\r\n" + 
				"Nasir;Woodard;76;Budapest;0;M;Blaze,Luke,Romeo,Simba,Jack\r\n" + 
				"Anika;Callahan;132;Stockholm;8506;F;George\r\n" + 
				"Aaron;Tucker;25;Sintra;0;M;\r\n" + 
				"Wade;Massey;18;Plovdiv;9005;M;\r\n" + 
				"Dr. Thiago;Mckee;113;Bologna;670;M;\r\n" + 
				"Nico;Rosales;12;Constanța;8081;M;Lucky,Toby,Jax\r\n" + 
				"Sarai;Trevino;50;Marseille;4668;F;Gunner\r\n" + 
				"Ahmad;Mosley;117;Cologne;6783;M;Prince,Fluffy,Bentley\r\n" + 
				"Haley;Washington;124;Wrocław;0;F;Apollo,Oakley,Rocket,Shadow,Loki,Dexter\r\n" + 
				"Ismael;Blankenship;52;Madrid;1997;M;Bandit,Peanut,Murphy,Fluffy,Louie,Harry\r\n" + 
				"Aspyn;Leblanc;92;Nice;0;F;Marley,Thor\r\n" + 
				"Koda;Cannon;92;Copenhagen;5402;M;Rocket,Koda,Zeke,Rambo,Watson\r\n" + 
				"Bodie;Williams;35;Mannheim;9045;M;Peanut,Riley\r\n" + 
				"Haven;Barron;138;Catania;3214;F;Jasper,Apollo,Diesel,Walter,Ace,Bailey\r\n" + 
				"Karter;Dejesus;121;Münster;0;M;\r\n" + 
				"Lincoln;Mathews;92;Prague;7478;M;Marley,Atlas,Mac\r\n" + 
				"Lauren;Holt;53;Prague;357;F;Bentley,Louie\r\n" + 
				"Mackenzie;Cox;135;Bratislava;0;F;Thor,Miles,Benny,Ozzy\r\n" + 
				"Jamari;Diaz;69;Marseille;0;M;Rambo\r\n" + 
				"Jianna;Stout;113;The Hague;3010;F;Duke,Jax,Watson,Koda\r\n" + 
				"Arabella;Burnett;31;Toulouse;7512;F;Cash,Sam,Mac\r\n" + 
				"Ezekiel;Hensley;123;Iași;6538;M;\r\n" + 
				"Calum;Higgins;95;Warsaw;4669;M;Koda,Gizmo,Kylo,Rocky,Gucci\r\n" + 
				"Brinley;Ross;37;Budapest;2700;F;Samson,Bubba,Cooper\r\n" + 
				"Dr. Callahan;Fisher;40;Rome;0;M;Charlie\r\n" + 
				"Chandler;Rivera;33;Catania;0;F;Ryder,Beau,Finn,Remy,Max,Harley\r\n" + 
				"Kaliyah;Torres;14;Düsseldorf;3959;F;Ryder,Ryder,Benny,Benny\r\n" + 
				"Mariah;Santos;46;Varna;8546;F;Leo,Tank\r\n" + 
				"Jaxx;Weber;53;Iași;1005;M;Finn,Marley,Marley\r\n" + 
				"Dior;Kirk;134;Budapest;0;F;Archie,Sam\r\n" + 
				"Marcelo;House;128;Sigulda;0;M;Simba,Ollie,Blue,Whiskey,Chester\r\n" + 
				"Donovan;Houston;25;Rome;0;M;\r\n" + 
				"Emory;Suarez;43;Bydgoszcz;9820;M;Beau,Marley,George,Maverick,Sarge\r\n" + 
				"Abraham;Hill;137;Barcelona;0;M;Beau,Lincoln,Rocky,Beau\r\n" + 
				"Russell;Cameron;40;Rotterdam;279;M;Levi,Apollo,Ryder\r\n" + 
				"Wallace;Daniels;74;Bari;0;M;\r\n" + 
				"Rayna;Ward;122;Hanover;3797;F;Bubba\r\n" + 
				"Lucille;Murphy;10;Copenhagen;3160;F;\r\n" + 
				"Dr. Sophie;Singleton;123;Munich;0;F;Rusty,Whiskey,Romeo,Rocket,Kylo,Jax\r\n" + 
				"Robert;Townsend;116;Szczecin;2757;M;Rocky,Wally,Bo,Marley,Rocco\r\n" + 
				"Kamilah;Bradford;104;Dortmund;8845;F;Shadow,Simba,Louie,Harry,Oscar,Copper\r\n" + 
				"Mya;Francis;32;Turin;0;F;Cody,Miles,Oliver\r\n" + 
				"Alaia;Fowler;90;Bratislava;427;F;Peanut,Henry,Jasper\r\n" + 
				"Zola;Perez;126;Lublin;6897;F;Tucker\r\n" + 
				"Bentley;Campos;102;Wrocław;4386;M;Tyson\r\n" + 
				"Jon;Bullock;79;Nice;4017;M;Duke,Whiskey\r\n" + 
				"Arianna;Huff;34;Bratislava;0;F;Oakley\r\n" + 
				"James;Villanueva;131;Madrid;3576;M;Walter,Hank\r\n" + 
				"Mara;Estes;38;Prague;0;F;Walter,Winston,Shadow\r\n" + 
				"Kabir;Mann;90;Vienna;1389;M;Louie\r\n" + 
				"Miles;Reeves;118;Düsseldorf;0;M;Odin,Gus\r\n" + 
				"Kane;Monroe;98;Łódź;647;M;\r\n" + 
				"Celine;Rogers;126;Galați;9123;F;Jackson,Otis,King,Gucci,Copper\r\n" + 
				"Dr. Ana;Coffey;134;Athens;8554;F;\r\n" + 
				"Denver;Barber;92;Seville;0;F;\r\n" + 
				"Dr. Ivory;Hill;44;Helsinki;4003;F;Bailey\r\n" + 
				"Cannon;Lugo;75;Riga;0;M;Blue,Murphy,Sam\r\n" + 
				"Olivia;Gonzalez;50;Copenhagen;0;F;Axel,Cody,Luke,George,Copper,Benji\r\n" + 
				"Maren;Golden;61;Bari;7846;F;Koda,Ryder,Teddy,Fluffy,Beau,Henry\r\n" + 
				"Dr. Maverick;Briggs;60;Florence;2077;M;\r\n" + 
				"Destiny;Camacho;131;Stuttgart;887;F;Kobe,Diesel,Jax,Bo,Ruger,Shadow\r\n" + 
				"Ryleigh;Jarvis;132;Mannheim;9965;F;Ranger,Watson,Bowie,Gucci,Bruno\r\n" + 
				"Nikolas;Dougherty;21;Palma de Mallorca;0;M;Bear\r\n" + 
				"Mack;Moyer;68;Warsaw;179;M;Cooper,Loki,Bo,Ace,Harry\r\n" + 
				"Amaia;Lyons;129;Brno;2413;F;Jasper,Hank,Harley\r\n" + 
				"Celia;Castillo;97;Lublin;1980;F;Harley,Arlo,Atlas\r\n" + 
				"Giana;Summers;17;Bochum;0;F;Baxter,Sam,Chester,Jasper,Tank,Kylo\r\n" + 
				"Crew;Ochoa;16;Bari;161;M;Bear,Levi,Ruger,Atlas,Shadow\r\n" + 
				"Brianna;Pollard;28;Dortmund;8811;F;Buddy\r\n" + 
				"Dr. Hadleigh;Short;78;Valmiera;0;F;\r\n" + 
				"Camryn;Reyna;10;Stockholm;0;F;Peanut,Walter,Otis,Odie,Zeus,Miles\r\n" + 
				"Dr. Yasmin;Chase;80;Cologne;0;F;Shadow,Prince,Baxter,Atlas\r\n" + 
				"Malachi;Mercado;118;Essen;0;M;Blaze,Diesel\r\n" + 
				"Talon;Lucero;79;Antwerp;1455;M;Koda,Rex,Fluffy,Rocco\r\n" + 
				"Miguel;Heath;39;Paris;4606;M;Louie,Teddy,Louie,Tyson,Louie,Marley\r\n" + 
				"Rebekah;Briggs;90;Catania;862;F;Oreo,Ranger\r\n" + 
				"Robert;Moody;21;Cologne;9909;M;Porter,Charlie,Rocco,Porter,Copper\r\n" + 
				"Karina;Andrews;108;Alicante;4111;F;Odie,Walter,Apollo\r\n" + 
				"Annabella;Deleon;50;Malmö;6819;F;\r\n" + 
				"Jamir;Peralta;131;Nantes;8604;M;Milo,Benji,Zeus,Mac\r\n" + 
				"Aubree;Hampton;23;Lisbon;0;F;Theo,Lincoln,Jax,Remy,Samson\r\n" + 
				"Anya;Vasquez;139;Madrid;6075;F;Loki\r\n" + 
				"Eden;Flowers;62;Tallinn;4284;M;Benny,Rex,Rusty,Rambo,George\r\n" + 
				"Mateo;Small;11;Nice;287;M;Oscar,Zeke,Max,Louie\r\n" + 
				"Bryant;Barber;30;Murcia;0;M;Oliver,Oscar,Axel\r\n" + 
				"Alessia;Patel;47;Murcia;5028;F;Bandit,Odie,Rocky\r\n" + 
				"Dr. Amelie;Good;116;Sintra;6065;F;Teddy,Rex\r\n" + 
				"Ariel;Christensen;85;Stockholm;5295;M;\r\n" + 
				"Dr. Catherine;Boyer;105;Berlin;0;F;Hank,Henry\r\n" + 
				"Grant;Russell;48;Bydgoszcz;0;M;Boomer,Atlas,Coco\r\n" + 
				"Ezekiel;Klein;36;Nice;0;M;Oreo,Bubba\r\n" + 
				"Brooklynn;Clayton;69;Szczecin;376;F;Loki,Louie,Peanut\r\n" + 
				"Carter;Knapp;11;Catania;3291;M;Koda,Bowie\r\n" + 
				"Dr. Clark;Calderon;80;Vienna;8577;M;Jack,Otis\r\n" + 
				"Emmie;Navarro;120;Bydgoszcz;6312;F;Beau,Joey,Bo,Copper,Rocky\r\n" + 
				"Lionel;Pittman;114;Malmö;0;M;Bowie,Marley\r\n" + 
				"Joziah;Montes;106;Bydgoszcz;0;M;Kylo\r\n" + 
				"Cillian;Mcclain;110;Lublin;0;M;\r\n" + 
				"Kaison;Raymond;99;Szczecin;0;M;Louie,Max,Loki,Koda,Teddy,Walter\r\n" + 
				"Nixon;Lane;29;Warsaw;0;M;Ozzy,Chester,Milo,Atlas\r\n" + 
				"Priscilla;Bautista;44;Lublin;0;F;Duke,Apollo,Arlo,Walter,Chase,Prince\r\n" + 
				"Yusuf;Robles;98;Sintra;2226;M;\r\n" + 
				"Jaxtyn;Underwood;58;Turin;5077;M;Bruno\r\n" + 
				"Messiah;Frank;98;Sintra;0;M;Loki,Moose,Ozzy,Dexter,Copper,Rambo\r\n" + 
				"Lena;Malone;11;Kraków;7828;F;Walter,Chase,Baxter,Jackson\r\n" + 
				"Cleo;Hensley;86;Brno;0;F;Oreo,Cody,Peanut,Odie\r\n" + 
				"Brian;Barton;44;Antwerp;0;M;Milo,Murphy,Luke,Cody,Chase\r\n" + 
				"Asa;Mejia;139;Bochum;9083;M;Bentley,Rocco,Bo,Maverick\r\n" + 
				"Priscilla;Bernard;57;Timișoara;853;F;\r\n" + 
				"Lola;Valenzuela;116;Sigulda;4547;F;Ranger,Remi\r\n" + 
				"Mckinley;Williamson;85;Bucharest;4445;F;Lucky,Lincoln,Jake,Romeo,Chase,Ozzy\r\n" + 
				"Marcelo;Coffey;89;Kraków;6527;M;Chip,Rusty\r\n" + 
				"Alayna;Jackson;107;Frankfurt am Main;3762;F;\r\n" + 
				"Stevie;O’connell;52;Varna;559;F;Ryder,Zeus,Echo,Coco,Bo,Bo\r\n" + 
				"Charleigh;Webb;59;Lisbon;0;F;Odie,Gunner,Marley,Jasper,Oliver\r\n" + 
				"Phoebe;Olson;72;Bari;0;F;Ruger,Tucker,Rex,Oakley\r\n" + 
				"Moises;Hartman;22;Barcelona;0;M;Max,Ollie\r\n" + 
				"Millie;Lamb;84;Bremen;4300;F;Ranger,Prince,Porter\r\n" + 
				"Johanna;Parks;37;Szczecin;279;F;Oreo,Oreo,Copper,Cash\r\n" + 
				"Jeremiah;Atkins;41;Iași;6792;M;Theo,Louie,Rex,Benny,Bubba,Harley\r\n" + 
				"Dr. Aliana;Levy;51;Kraków;0;F;Finn,George,Bruce,Buster,Buddy\r\n" + 
				"Flynn;Trejo;115;Bydgoszcz;4559;M;Bruno\r\n" + 
				"Chloe;Soto;50;Nice;6182;F;Peanut,George\r\n" + 
				"Joseph;Sellers;82;Poznań;7589;M;\r\n" + 
				"Vihaan;Dennis;82;Murcia;0;M;Bubba,Bubba,Rocco,Hank\r\n" + 
				"Frederick;Noble;59;Milan;9821;M;Duke,Sam,Chip,Benji,Remy\r\n" + 
				"Brock;Ventura;118;Malmö;0;M;\r\n" + 
				"Zayne;Gardner;16;Amsterdam;258;M;Lucky,Bear,Theo,Bentley\r\n" + 
				"Jordan;Andrews;95;Wuppertal;6105;F;Buster,Ace\r\n" + 
				"Felicity;Watts;82;Palermo;3376;F;Oreo,Zeus,Apollo,Sam\r\n" + 
				"Natalie;Corona;127;Palma de Mallorca;1614;F;Oakley,Bruno,Fluffy,Ollie\r\n" + 
				"Alani;Moon;126;Constanța;9268;F;Theo,Winston,Simba,Blue,Sarge\r\n" + 
				"Blair;Howell;122;Bochum;9732;F;Sam,Samson,Harry,Bruce,Rocket\r\n" + 
				"Ellie;Yang;10;Genoa;6193;F;Miles,Copper,Watson,Bowie\r\n" + 
				"Dr. Athena;Shields;124;Kraków;5808;F;Rambo,Bailey,Ziggy\r\n" + 
				"Troy;Hanson;42;Bydgoszcz;0;M;Kobe,Hank\r\n" + 
				"Dr. Charles;Hale;32;Bologna;3207;M;\r\n" + 
				"Eva;Chavez;10;Nuremberg;3274;F;King,Bowie,Boomer,Dozer\r\n" + 
				"Dr. Elliot;Pacheco;43;Tallinn;0;M;Bear,Romeo,Bruce,Lincoln,Gunner,Whiskey\r\n" + 
				"Sarai;Carter;67;Lublin;0;F;Prince,Gus,Bandit,Remy,Levi,Echo\r\n" + 
				"Ira;Hopkins;117;Málaga;1733;M;Prince,Louie,Thor,Remi,Louie,Porter\r\n" + 
				"Lilianna;Sawyer;71;Nice;0;F;Gizmo,Titan,Prince,Kobe,Cooper,Jake\r\n" + 
				"Saoirse;Villarreal;115;Las Palmas;0;F;Finn,Ruger,Benny,Miles,Leo,Cooper\r\n" + 
				"Shay;Williams;49;Varna;5535;F;Apollo,Toby,Finn,Rocco,Winston\r\n" + 
				"Teagan;Mitchell;98;Bilbao;0;F;Titan\r\n" + 
				"Nora;Silva;90;Toulouse;0;F;Luke,Atlas\r\n" + 
				"Aaron;Donaldson;112;Frankfurt am Main;3405;M;Bailey,Finn,Sam,George,Cody,Riley\r\n" + 
				"Dr. Leah;Burton;32;Toulouse;0;F;Jasper,Rambo,Gunner,Titan,Sarge,Echo\r\n" + 
				"Darian;Sierra;67;Gdańsk;0;M;Scout,Bentley,Benny\r\n" + 
				"Dr. Miriam;Mcdowell;12;Leipzig;9567;F;Benny,Ruger,Rocco,Teddy\r\n" + 
				"Dr. Noelle;Ellis;117;Budapest;320;F;Winston,Benji,Oscar,Beau,Peanut,Oreo\r\n" + 
				"Nova;Waters;74;Lyon;725;M;\r\n" + 
				"Eliana;Middleton;112;Constanța;5235;F;Bubba,Odin,Tyson,Apollo,Wally,Bo\r\n" + 
				"Julien;Blackwell;95;Constanța;9328;M;Toby,Diesel,Hank,Louie\r\n" + 
				"Paloma;Portillo;31;Nice;430;F;Jax,Cooper,Baxter,Simba,Rusty,Benji\r\n" + 
				"Elise;Moran;101;Tallinn;5547;F;Cody,Zeke,Porter,Ryder\r\n" + 
				"Gunner;Hanson;75;Madrid;7714;M;Odin\r\n" + 
				"Belen;Webb;27;Málaga;0;F;Simba,Titan,Max,Peanut,Ranger,Jake\r\n" + 
				"Ira;Villalobos;80;Budapest;0;M;Gunner,Bear,Leo,Chase,Koda,Milo\r\n" + 
				"Moses;Golden;82;Timișoara;8383;M;Axel,King,Ziggy,Jake,Kylo\r\n" + 
				"Huxley;Montgomery;75;Bonn;8969;M;Fluffy,Gucci\r\n" + 
				"Marilyn;Watts;11;Copenhagen;0;F;Bubba,Chase,Toby,Bruno,Boomer,Luke\r\n" + 
				"Dr. Xzavier;Gallegos;26;Nice;3903;M;Ollie,Bandit,Wally\r\n" + 
				"Bexley;Dennis;46;Dortmund;2226;F;Cash,Marley\r\n" + 
				"Jessica;Wolfe;19;Amsterdam;2576;F;Buster,Rudy,Prince,Ziggy,Winston,Zeus\r\n" + 
				"Cain;Mejia;133;Sofia;0;M;Henry,Dexter,Harley,Jasper,Chase,Whiskey\r\n" + 
				"Dr. Avianna;Logan;97;Genoa;0;F;Axel,Bruno\r\n" + 
				"Genevieve;Coffey;110;Duisburg;2551;F;Tucker,Oreo,Cooper\r\n" + 
				"Casey;Freeman;22;Antwerp;2797;M;Bowie,Rusty,Ryder\r\n" + 
				"Moises;Maldonado;127;Gdańsk;441;M;Kobe\r\n" + 
				"Andrew;Houston;121;Naples;0;M;\r\n" + 
				"Callahan;Gregory;55;Dortmund;426;M;Loki,Walter,Gucci,Gucci,Rambo,Echo\r\n" + 
				"Dr. Roy;Sandoval;131;Milan;1892;M;Jackson,Bruce,Cash,Blaze,Cooper\r\n" + 
				"Samantha;Lamb;43;Alicante;3553;F;Axel\r\n" + 
				"Nia;Lester;112;Rīga;5375;F;Samson,Titan\r\n" + 
				"Hassan;Olson;35;Plovdiv;1686;M;Chip\r\n" + 
				"Tatum;Murphy;114;Sofia;0;F;\r\n" + 
				"Benicio;Dickerson;135;Córdoba;3507;M;Zeus,Tyson,Tyson,Duke,Archie\r\n" + 
				"Dr. Camila;Villarreal;58;Bydgoszcz;1651;F;Romeo,Loki,Jake\r\n" + 
				"Dr. Prince;Clark;58;Bilbao;2527;M;Blue\r\n" + 
				"Opal;Cook;136;Leipzig;0;F;Zeke,Bear\r\n" + 
				"Priscilla;Bush;61;Leipzig;2788;F;Bowie,Ruger,Shadow,Jake\r\n" + 
				"Dr. Naomi;Morgan;37;Lisbon;0;F;Maverick,Rex,Otis,Moose,Harley\r\n" + 
				"Dr. Nicholas;Nolan;124;Frankfurt am Main;0;M;Ozzy,Ollie,Romeo,Odin,Cooper,Harry\r\n" + 
				"Anaya;Combs;10;Catania;7716;F;Rocky,Tyson,Diesel\r\n" + 
				"Zoe;Lloyd;80;Bochum;0;F;Blue\r\n" + 
				"Ares;Mckinney;62;Dortmund;2072;M;Henry,Jasper,Oscar\r\n" + 
				"Oliver;Lim;106;Alicante;6932;M;Peanut,Walter\r\n" + 
				"Mabel;Caldwell;45;Frankfurt am Main;9733;F;Ollie,Joey,Remy,Scout,Cooper,Atlas\r\n" + 
				"Jake;Hickman;106;Tallinn;7140;M;Bubba,Rocco,Boomer\r\n" + 
				"Artemis;Yoder;48;Marseille;8122;F;Romeo,Sam,Rusty,Ozzy\r\n" + 
				"Raul;Powers;124;Helsinki;9868;M;Wally,King,Bandit\r\n" + 
				"Savannah;Lawrence;33;Warsaw;0;F;Simba,Moose,Whiskey,Diesel,Ruger\r\n" + 
				"Tiana;Roberson;54;Malmö;0;F;Joey,Teddy\r\n" + 
				"Denver;Bravo;137;Milan;4976;F;Samson\r\n" + 
				"Dr. Ronan;Powers;45;Warsaw;0;M;Rocket,Blue\r\n" + 
				"Dash;Pugh;86;Duisburg;0;M;Baxter,Cash,Scout\r\n" + 
				"Dr. Trenton;Espinosa;25;Cologne;6234;M;Ryder,Lucky,Bear\r\n" + 
				"Davian;Grimes;18;Seville;4541;M;Remi\r\n" + 
				"Dr. Paul;Cox;88;Lyon;0;M;Cody,Simba\r\n" + 
				"Ava;Mcconnell;23;Nantes;0;F;Remy,Simba,Baxter\r\n" + 
				"Rafael;Richards;78;Sofia;0;M;\r\n" + 
				"Dr. Alyssa;Bowers;127;Lyon;5437;F;Ziggy,Remi,Miles,Odin\r\n" + 
				"Dr. Lauryn;Vu;103;Karlsruhe;3709;F;\r\n" + 
				"Waverly;Newman;125;Dresden;7766;F;Milo,Bear,Bruno\r\n" + 
				"Miguel;Brock;126;Warsaw;0;M;Buster,Max\r\n" + 
				"Dr. Ruby;Gill;116;Łódź;7986;F;Ozzy,Sarge,Rusty,Rusty,Mac,Ziggy\r\n" + 
				"Jolene;Brennan;93;Wrocław;4659;F;Joey,Wally,Gus,Echo,Tank,Sam\r\n" + 
				"Boston;Fuller;96;Bilbao;0;M;Whiskey,Bandit,Jack\r\n" + 
				"Dr. Aurelia;Norman;72;Bochum;5513;F;Zeus,Copper,Walter\r\n" + 
				"Duke;Schroeder;125;Prague;9470;M;Benny\r\n" + 
				"Yusuf;Conrad;39;Alicante;8757;M;Teddy\r\n" + 
				"Dr. Avery;Ponce;31;Málaga;982;M;Sarge\r\n" + 
				"Oliver;Hawkins;123;Bochum;0;M;Max,Bruce,Whiskey\r\n" + 
				"Oaklee;Montes;27;Bologna;7531;F;Bandit,Bo,Ziggy,Baxter,Loki\r\n" + 
				"Samira;Flynn;89;Gothenburg;6496;F;\r\n" + 
				"Ensley;Hughes;75;Las Palmas;9651;F;Bruno,Leo\r\n" + 
				"Dallas;Berg;38;Nuremberg;1268;F;Benny,Zeus,Copper,Bear,Dozer,King\r\n" + 
				"Dr. Aarav;Deleon;89;Budapest;5126;M;\r\n" + 
				"Kamdyn;Schmidt;120;Essen;0;M;Ranger,Bentley,Apollo,Milo,Ranger\r\n" + 
				"Averi;Donovan;100;Toulouse;6415;F;Buster,Gucci,Murphy,Ruger,Shadow\r\n" + 
				"Khalid;Savage;75;Dublin;0;M;Luke,Oliver\r\n" + 
				"Dr. Moshe;Owen;34;Munich;0;M;\r\n" + 
				"Kiara;Bonilla;16;Las Palmas;2475;F;Atlas,Ozzy,Samson,Riley,Samson,Tucker\r\n" + 
				"Dr. Ronan;Huber;12;Poznań;7550;M;Benji\r\n" + 
				"Chaim;Barron;23;Cologne;9147;M;Ranger,Loki,Cash,Bear,Lucky,Axel\r\n" + 
				"Roland;Powell;85;Copenhagen;0;M;Louie,Jake,Lincoln,Lucky\r\n" + 
				"Octavia;Kelly;12;Paris;8476;F;Bear,King,Copper,Bo,Watson\r\n" + 
				"Briggs;Marks;101;Hanover;0;M;Lincoln\r\n" + 
				"Opal;Lawrence;71;Galați;3931;F;Benji,George,Rusty,Lucky,Benji\r\n" + 
				"Kassidy;Robinson;127;Valencia;9107;F;Ozzy,Gunner,George,Remy\r\n" + 
				"Sincere;Freeman;85;Bologna;2322;M;\r\n" + 
				"Dr. Brandon;Hull;96;Murcia;360;M;Watson,Joey\r\n" + 
				"Leia;Humphrey;43;Nuremberg;5996;F;\r\n" + 
				"Raymond;Duarte;26;Copenhagen;3781;M;Teddy,Rusty,Scout\r\n" + 
				"Sunny;Anthony;15;Frankfurt am Main;2912;F;Gunner,Jake\r\n" + 
				"Alanna;Preston;87;Bratislava;8975;F;Odin,Ollie,Watson,Sam\r\n" + 
				"Alexis;Mccarty;82;Timișoara;7619;M;Duke,Dozer,Oakley\r\n" + 
				"Ariya;Richard;78;Nice;5009;F;Joey,Hank\r\n" + 
				"Leslie;Barry;87;Dresden;8929;F;Rocky,Miles\r\n" + 
				"Axton;Hale;119;Antwerp;3804;M;Odie,Dozer\r\n" + 
				"Ariyah;Flores;52;Turin;8055;F;Blue,Sarge,Sarge,Titan,Kylo\r\n" + 
				"Michaela;Parker;115;Aarhus;0;F;Ryder,Samson,Beau,Moose\r\n" + 
				"Lila;Huynh;16;Toulouse;473;F;Kobe,Zeke,Gucci,Teddy\r\n" + 
				"Benson;Hurst;102;Riga;7084;M;Scout,Odie,Romeo,Echo,Dozer\r\n" + 
				"Dr. Jackson;English;32;Tallinn;2240;M;Echo,Hank,Simba,Samson\r\n" + 
				"Cade;Gross;45;Athens;8985;M;\r\n" + 
				"Benicio;Gray;71;Frankfurt am Main;0;M;Henry,Max,Simba\r\n" + 
				"Dr. Kellan;Alvarez;13;Sintra;2006;M;\r\n" + 
				"Elle;Richard;41;Galați;6658;F;Max,Bandit,Blue,Benny\r\n" + 
				"Jaylee;Hahn;37;Kraków;6496;F;Maverick,Baxter,Prince,Thor,Marley,Marley\r\n" + 
				"Aleena;Ray;94;Paris;0;F;Luke,Gunner,Bentley,Koda\r\n" + 
				"Royal;Sampson;102;Bremen;0;M;\r\n" + 
				"Jaiden;Mathis;96;Córdoba;6247;M;Rudy,Jax,Porter,Samson,Dexter\r\n" + 
				"Ayden;Farrell;94;Marseille;3350;M;Bruno\r\n" + 
				"Ellis;Travis;69;Palermo;4991;F;Bailey,Porter,Miles,Maverick\r\n" + 
				"Jasiah;Fletcher;33;Turin;4561;M;Scout,Koda\r\n" + 
				"Khalid;Trejo;44;Valencia;4115;M;Ruger,Remy,Lucky,Oakley\r\n" + 
				"Ryan;Brewer;36;Palma de Mallorca;0;M;Finn,Jax,Theo,Bentley,Boomer,Leo\r\n" + 
				"Keyla;Spence;47;Alicante;1089;F;Scout,Bubba,Oliver,Leo\r\n" + 
				"Kaydence;Hester;40;Düsseldorf;5867;F;Zeke,Benji,Samson,Blaze\r\n" + 
				"Dr. Melvin;Massey;66;Gothenburg;1117;M;\r\n" + 
				"Elias;Reid;111;Rīga;0;M;Lucky,Leo,Rocco,Rudy\r\n" + 
				"Anahi;Rasmussen;117;Sofia;3167;F;Bailey,Mac,Remy,Gucci\r\n" + 
				"Titus;Roach;130;Münster;4254;M;Prince\r\n" + 
				"Dr. Hayley;Butler;110;Nuremberg;0;F;Sam,Wally,Otis,Jake\r\n" + 
				"Harvey;Wilson;47;Bochum;7471;M;Otis,Rex\r\n" + 
				"Araceli;Franklin;20;Athens;0;F;Gucci,Romeo,Whiskey,Bailey,Chester\r\n" + 
				"Alma;Day;78;Rotterdam;0;F;Levi,Theo,Atlas,Kobe,Riley,Ryder\r\n" + 
				"Keilani;Mosley;100;Valencia;4554;F;Bo,Wally,Cody,Koda,Gucci\r\n" + 
				"Marianna;Hancock;89;Antwerp;4950;F;Cooper,Rambo\r\n" + 
				"Itzayana;Porter;133;Dublin;0;F;Marley,Bubba\r\n" + 
				"Johan;Wells;54;Córdoba;4223;M;Ace,Gunner,Odin\r\n" + 
				"Liam;Fisher;22;Cologne;0;M;Jackson,Blue,Ziggy,Cooper\r\n" + 
				"Aurelia;Brennan;53;Córdoba;1968;F;George,Wally,Benji,Benji\r\n" + 
				"Sean;Harvey;51;Aarhus;8457;M;Winston\r\n" + 
				"Madelynn;Collier;50;Varna;2648;F;Finn,Prince,Joey\r\n" + 
				"Averi;Tanner;37;Lublin;7345;F;Louie,Kylo,Tyson,Marley,Theo,Murphy\r\n" + 
				"Gage;Dennis;135;Madrid;0;M;\r\n" + 
				"Ezra;Branch;77;Turin;1018;F;Cash,Dozer,Coco,Jackson\r\n" + 
				"Lexie;Jones;107;Barcelona;0;F;Titan,Otis\r\n" + 
				"Andrea;Hernandez;54;Poznań;9026;F;\r\n" + 
				"Edith;Powers;130;Lisbon;0;F;Jack,Jax,Bubba,Oreo\r\n" + 
				"Elyse;Vaughn;126;Rome;0;F;Jackson,Jackson,Hank,Gucci,Zeke\r\n" + 
				"Kailey;Shannon;61;Vienna;9699;F;Watson\r\n" + 
				"Dr. Esperanza;Hendricks;119;Stuttgart;7141;F;Leo,Atlas,Jake,Winston,Bowie,Louie\r\n" + 
				"Boden;Andrews;28;Rome;493;M;Benji,Ranger,Fluffy,Echo\r\n" + 
				"Brooks;Reese;49;Plovdiv;5052;M;Koda,Rudy,Remy,Lucky,Bruce,Chip\r\n" + 
				"Wes;Greer;84;Bucharest;8070;M;Cooper,Duke,Mac\r\n" + 
				"Laney;Weber;107;Aarhus;1962;F;Beau,Max,Kylo\r\n" + 
				"Brodie;Woods;79;Wrocław;6060;M;Kylo,Remi,Zeus\r\n" + 
				"Ensley;Wheeler;100;Bologna;0;F;Tucker,Dexter,Echo,Bailey,Dozer,Remi\r\n" + 
				"Dr. Colson;Fields;138;Catania;0;M;Sam,Rocky\r\n" + 
				"Dr. Paulina;Lang;124;Wuppertal;9471;F;Simba,Gucci,Bo,Dexter,King,Theo\r\n" + 
				"Bridger;Patel;15;Helsinki;9443;M;Chip,Cooper,Jake,Oliver,Ryder,Rocky\r\n" + 
				"Ryleigh;Bentley;69;Hanover;9335;F;Ozzy,Bowie,Jax,Max\r\n" + 
				"Conor;Vu;14;Bilbao;4345;M;Finn,Finn,Simba,Archie\r\n" + 
				"Elsa;Baxter;110;Zagreb;0;F;Rambo,Gus,Prince,Lincoln,Diesel\r\n" + 
				"Henry;Mullins;33;Dresden;0;M;Buddy,Miles,Loki,Rocky,Harley,Blue\r\n" + 
				"Kamila;Ryan;92;Genoa;825;F;Harry,Copper,Oakley,Mac\r\n" + 
				"Grant;Dunn;64;Essen;4464;M;Sam,Zeus,Duke,Winston,Echo,Beau\r\n" + 
				"Dr. Sariah;Noble;109;Aarhus;2733;F;Cooper\r\n" + 
				"Dr. Marcellus;Guevara;74;Dortmund;427;M;Atlas,Jackson,Marley\r\n" + 
				"Mohammed;Walls;11;Iași;9436;M;Baxter,Joey,Fluffy,Bentley\r\n" + 
				"Luke;Lowery;116;Hamburg;9404;M;Rusty,Bowie,Levi,Archie\r\n" + 
				"Rosie;Hamilton;50;Prague;6564;F;Atlas,Romeo,Kobe,Rocco\r\n" + 
				"Marlowe;Russell;134;Düsseldorf;2121;F;\r\n" + 
				"Dr. Callan;Petersen;101;Thessaloniki;0;M;\r\n" + 
				"Destiny;Armstrong;27;Bilbao;6826;F;Jake,Buddy,Oreo\r\n" + 
				"Dr. Alma;Brady;64;Vilnius;0;F;Cooper\r\n" + 
				"Aurelia;Marquez;129;Sofia;0;F;Jackson,Romeo,Zeke,Harry,Harley,Chase\r\n" + 
				"Issac;Liu;31;Bilbao;7747;M;Bruno,Arlo,Beau,Cody,Romeo\r\n" + 
				"Elyse;Rocha;71;Sofia;0;F;Remy,Harry,Rocco,Toby\r\n" + 
				"Maddox;Schwartz;44;Naples;9379;M;Echo\r\n" + 
				"Melody;Wiggins;73;Duisburg;0;F;Sarge,Blue,Titan,Rudy,Apollo,Riley\r\n" + 
				"Raegan;Hanson;101;Constanța;213;F;Loki,Otis,Watson\r\n" + 
				"Chaim;Salinas;103;Prague;8771;M;\r\n" + 
				"Wes;Hinton;65;Gdańsk;0;M;\r\n" + 
				"Seven;O’donnell;74;Genoa;4282;M;Otis,Rocket,Baxter,Blaze\r\n" + 
				"Kenzo;Blankenship;17;Nice;0;M;\r\n" + 
				"Avi;Marin;125;Berlin;3256;M;Bowie,Kylo\r\n" + 
				"Meredith;Cortes;125;Copenhagen;1776;F;Hank,Archie\r\n" + 
				"Jadiel;Terrell;87;Rome;1668;M;Gus\r\n" + 
				"Chase;Zhang;119;Antwerp;9940;M;Toby,Sarge,Sam\r\n" + 
				"Meilani;Campbell;37;Galați;9292;F;Rex,Rex,Samson,Luke,Blaze\r\n" + 
				"Xiomara;Martinez;42;Hamburg;8563;F;Scout,Winston,Archie,Kobe\r\n" + 
				"Christian;Nava;69;Copenhagen;5150;M;Kobe,Sam\r\n" + 
				"Jay;Cantrell;123;Wuppertal;4661;M;\r\n" + 
				"Nasir;Harrison;109;Essen;4012;M;Oscar,Blue,Porter,Axel,Mac\r\n" + 
				"Dr. Keaton;Hardin;120;Riga;9980;M;Zeus\r\n" + 
				"Lila;Kent;125;Riga;987;F;Gucci,Zeus,Harley\r\n" + 
				"Dr. Lucille;Kramer;63;Seville;8006;F;Watson\r\n" + 
				"Jett;Turner;39;Nice;8921;M;Rocket,Echo,Tank\r\n" + 
				"Keith;Hail;18;Valmiera;964;M;Ruger,Odin,King,Cooper,Atlas,Toby\r\n" + 
				"Milena;Gregory;46;Catania;5430;F;Rex,Mac\r\n" + 
				"Jenna;Small;93;Palma de Mallorca;0;F;Joey,Gus\r\n" + 
				"Brantley;Cole;122;Bilbao;0;M;Tucker,Axel,Rocco,Tank\r\n" + 
				"Lennon;Richmond;138;Berlin;4579;M;Ryder,Otis\r\n" + 
				"Opal;Ramos;94;Athens;0;F;Sarge,Bo,Rocket,Cash,Gus\r\n" + 
				"Marceline;Kennedy;77;Catania;9696;F;Henry\r\n" + 
				"Dr. Lea;Marquez;60;Bologna;3161;F;Romeo,George,Titan\r\n" + 
				"Harmoni;Roach;73;Berlin;0;F;Peanut,Bo,Simba,Jake\r\n" + 
				"Dr. Jayleen;Walker;119;Rotterdam;7241;F;\r\n" + 
				"Asher;Stanton;123;Varna;7338;M;Samson,Leo,Finn,Bowie,Boomer\r\n" + 
				"Xzavier;Mullen;60;Zagreb;0;M;\r\n" + 
				"Ayaan;Hill;95;Las Palmas;5703;M;Chester,Sam,Marley,Teddy\r\n" + 
				"Niko;Stuart;28;Bratislava;1464;M;Bear,Jack,Murphy\r\n" + 
				"Noemi;Vaughan;46;Thessaloniki;5061;F;Duke,Simba,Ace,Titan,Bo\r\n" + 
				"Amaya;Underwood;38;Bielefeld;4188;F;Fluffy,Charlie,Tank,Riley\r\n" + 
				"Brynn;Shah;99;Zaragoza;4498;F;Boomer,Watson,Harry,Louie\r\n" + 
				"Jasiah;Fry;35;Valmiera;2439;M;Toby,Buster,Joey,Ozzy\r\n" + 
				"Dr. Kelsey;Bender;66;Athens;9808;F;Ozzy,Winston,Baxter,Kobe,Teddy,Bowie\r\n" + 
				"Paloma;Ingram;18;Dortmund;0;F;Jack,Jake,Cash\r\n" + 
				"Remington;Church;87;Dortmund;8374;F;Leo,Watson,Bentley,Dozer,Chester,Bandit\r\n" + 
				"Sophie;Kerr;49;Málaga;5022;F;Diesel,Gunner,Max,Moose,Benji\r\n" + 
				"Anais;Adkins;134;Leipzig;0;F;Ace,Jackson,Bowie,Boomer,Walter,Teddy\r\n" + 
				"John;Gilbert;30;Valencia;1465;M;Whiskey,Miles,Rusty,Benny\r\n" + 
				"Frankie;Cline;54;Florence;7079;M;\r\n" + 
				"Elian;Owens;114;Aarhus;8239;M;Koda,Bandit,King,Rocky,Theo,Rocket\r\n" + 
				"Xzavier;Glenn;139;Valmiera;2929;M;Rusty\r\n" + 
				"Porter;Stephenson;34;Dresden;0;M;Remi\r\n" + 
				"Salvador;Moody;116;Cluj-Napoca;1084;M;\r\n" + 
				"Paxton;Garcia;33;Helsinki;7213;M;Ozzy,Jack,Rudy,Jasper\r\n" + 
				"Dr. Winter;Banks;130;Bonn;3799;F;Benji\r\n" + 
				"Rylie;Kerr;35;Bonn;383;F;Benny,Blaze\r\n" + 
				"Dr. Danna;Manning;21;Gothenburg;4279;F;Loki\r\n" + 
				"Milana;Goodwin;52;Lublin;0;F;Rocco,Baxter,Thor,Milo\r\n" + 
				"Thalia;Rich;68;Palma de Mallorca;0;F;Harley,Rudy\r\n" + 
				"Orion;Park;24;Sofia;3165;M;Samson,Echo,Tyson,Riley\r\n" + 
				"Connor;Franco;119;Hamburg;5494;M;Dozer,Boomer\r\n" + 
				"Martha;Smith;71;Stuttgart;0;F;Buster,Rocco,Jackson,Dexter,Archie\r\n" + 
				"Royalty;Berger;114;Vila Nova de Gaia;9860;F;Joey\r\n" + 
				"Luca;Yang;74;Malmö;0;M;Chester,Benny,Joey,Gunner,Echo\r\n" + 
				"Dr. Santiago;Wilson;42;Antwerp;3138;M;Beau,Odin,Maverick,Gucci,Harry,Jax\r\n" + 
				"Magnolia;Kennedy;65;Düsseldorf;3962;F;\r\n" + 
				"Vienna;Allison;74;Bilbao;0;F;Henry,Maverick,Sam,Duke,Duke\r\n" + 
				"Zyair;Murphy;73;Nuremberg;0;M;Lincoln,Gizmo,Chip,Cody,Jasper,Rusty\r\n" + 
				"Hadley;Sexton;118;Stuttgart;5607;F;Oliver,Titan,Thor,Wally,Charlie,Marley\r\n" + 
				"Kinley;Conway;92;Iași;0;F;Jake\r\n" + 
				"Brinley;Anthony;101;Zagreb;5979;F;George,Joey,Scout\r\n" + 
				"Dariel;Armstrong;74;Sintra;2685;M;Remi,Jack,Oscar,Bowie,Jack\r\n" + 
				"Ben;Fields;24;Bari;5107;M;Lincoln,Oliver,Bear,Miles,Oscar,Winston\r\n" + 
				"Francesca;Flores;70;Duisburg;604;F;Duke,Arlo,Blaze\r\n" + 
				"Aaliyah;Sanford;13;Brno;5329;F;\r\n" + 
				"Amari;Avalos;88;Cologne;1900;M;Ace,Dozer,Baxter,Fluffy,Arlo\r\n" + 
				"Dr. Felipe;Friedman;72;Constanța;3292;M;Bear,Rocco,Rudy,Watson,Remi\r\n" + 
				"Summer;Lindsey;73;Málaga;0;F;Apollo,Titan,Koda\r\n" + 
				"Wells;Romero;132;Brno;7880;M;George,Axel\r\n" + 
				"Soren;Estes;114;The Hague;0;M;Jake,Marley\r\n" + 
				"Keaton;Woods;139;Amsterdam;0;M;Diesel,Wally,Benny,Cash\r\n" + 
				"Emmalyn;Heath;56;Rotterdam;652;F;Rocket\r\n" + 
				"Nikolas;Allison;79;Sintra;9465;M;\r\n" + 
				"Gia;Moreno;16;Prague;6138;F;Jackson\r\n" + 
				"Lennon;Montoya;50;Leipzig;0;M;Remi,Baxter,Milo,Bruno,Boomer,Bandit\r\n" + 
				"Erik;Crosby;33;Malmö;7808;M;Blue,Moose,Teddy,Rusty\r\n" + 
				"Whitney;Cochran;47;Valencia;0;F;Benji,Joey\r\n" + 
				"Richard;Michael;106;Plovdiv;0;M;Theo,Kylo\r\n" + 
				"Abner;Chung;46;Gothenburg;0;M;\r\n" + 
				"Trinity;Jacobson;133;Murcia;248;F;Titan,Finn,Buddy,Duke,Leo\r\n" + 
				"Kataleya;Morrow;113;Zaragoza;418;F;Echo,Bear,Jack,Levi,Harley\r\n" + 
				"Armando;Garrett;41;Dublin;4380;M;Oliver,Max,Jake,Arlo,Beau,Oreo\r\n" + 
				"Milana;Huffman;70;Lublin;3162;F;\r\n" + 
				"Eliza;Castillo;62;Bucharest;5271;F;Tank,Ruger,Loki,King,Jax\r\n" + 
				"Ivory;Schneider;125;Cologne;0;F;Oliver,Ollie,Prince\r\n" + 
				"Parker;Dougherty;52;Plovdiv;6230;M;Otis,Max,Jackson\r\n" + 
				"Charlotte;Turner;18;Leipzig;5912;F;Chase,Rambo,Cash\r\n" + 
				"Eliseo;Vance;87;Dortmund;8263;M;Duke,Prince,Prince,Walter,Rocco\r\n" + 
				"Dr. Jared;Sanford;52;Aarhus;0;M;Baxter,Bentley,Joey,Jax,Scout,Prince\r\n" + 
				"Dominick;Salinas;67;Bologna;0;M;Copper,Samson\r\n" + 
				"Cameron;Lozano;60;Amsterdam;3470;M;Max,Apollo\r\n" + 
				"Huxley;Bentley;60;Budapest;5103;M;Watson,Ozzy,Marley\r\n" + 
				"Dr. Veda;Oliver;80;Tallinn;0;F;Diesel\r\n" + 
				"Arlo;Crane;126;Cologne;2006;M;Jake,Milo,Bubba,Buster\r\n" + 
				"Jimmy;Stone;35;Bonn;0;M;Oscar,Lincoln\r\n" + 
				"Megan;Spears;29;Nice;8933;F;\r\n" + 
				"Charles;Malone;117;Sofia;5813;M;Rusty\r\n" + 
				"Kimora;Pruitt;96;Hanover;0;F;Peanut,Toby,Dozer,Zeke,Archie,Winston\r\n" + 
				"Hayes;Myers;127;Valencia;0;M;Rocco\r\n" + 
				"Alijah;King;84;Murcia;2003;M;Rudy,Ace,Levi\r\n" + 
				"Legacy;Hicks;74;Sofia;0;F;Charlie,Sam,Diesel,Bandit,Ace,Rocky\r\n" + 
				"Mathew;Bates;111;Constanța;0;M;Otis,Tyson,Rex\r\n" + 
				"Peter;Holt;64;Vilnius;0;M;Tank\r\n" + 
				"Santana;Cruz;50;Murcia;0;M;Coco,George,Tucker,Rusty,Cody,Romeo\r\n" + 
				"Amira;Bernal;85;Sintra;0;F;\r\n" + 
				"Dr. Tinsley;Jacobs;124;Tallinn;0;F;\r\n" + 
				"Lennon;Moss;57;Rotterdam;6285;M;Sarge,Hank,Beau\r\n" + 
				"Peter;Stevenson;87;Zagreb;0;M;Ryder,Gus\r\n" + 
				"Layne;Rosas;132;Zaragoza;8784;F;Beau\r\n" + 
				"Royce;Robertson;13;Lyon;0;M;Atlas\r\n" + 
				"Jay;Fitzpatrick;138;Paris;9535;M;Axel\r\n" + 
				"Aniyah;Pacheco;125;Turin;0;F;\r\n" + 
				"Walker;Valenzuela;122;Lublin;0;M;Chester,Cooper,Rocket,Samson,Porter\r\n" + 
				"Saylor;Madden;14;Bydgoszcz;5318;F;Finn,Rocky,Whiskey,Remi,Leo,Cooper\r\n" + 
				"Rayan;Schwartz;53;Toulouse;3350;M;Gunner,Ace,Odie\r\n" + 
				"Stevie;Barton;78;Riga;0;F;Winston,Jasper,Walter,Peanut,Arlo\r\n" + 
				"Oaklynn;May;39;Kraków;5589;F;Axel,Bentley,Zeke,Riley\r\n" + 
				"Bryan;Benjamin;46;Nantes;7983;M;Rocky,Tucker,Porter,Chase,Samson,Boomer\r\n" + 
				"Dr. Xavier;Beasley;49;Wuppertal;3129;M;Bandit,Copper,Walter,Odie,Whiskey\r\n" + 
				"Leonel;Zamora;103;Bielefeld;3926;M;Jasper\r\n" + 
				"Dylan;Gray;126;Wuppertal;3920;M;Maverick,Leo,Zeke,Remi\r\n" + 
				"Abram;Zimmerman;37;Nantes;0;M;\r\n" + 
				"Dr. Lukas;Frederick;48;Palermo;7559;M;Baxter\r\n" + 
				"Elena;Trejo;132;Bochum;2742;F;Boomer,Bowie,Hank,Prince\r\n" + 
				"Alaiya;Vazquez;28;Szczecin;4465;F;\r\n" + 
				"Emerald;Christensen;64;Paris;725;F;Gunner\r\n" + 
				"Aliza;Moran;82;Münster;9082;F;Harry\r\n" + 
				"Dr. Aurora;Snow;62;Córdoba;2475;F;\r\n" + 
				"Hayes;Fitzpatrick;87;Gdańsk;0;M;Ranger\r\n" + 
				"Dr. Meadow;Rocha;11;Bochum;6394;F;Joey,Ranger,Bentley\r\n" + 
				"Angelina;Winters;68;Duisburg;149;F;Winston,Ruger,Henry,Titan\r\n" + 
				"Kalani;Carr;123;Bilbao;0;F;\r\n" + 
				"Bentlee;Elliott;122;Seville;995;M;\r\n" + 
				"Melani;Bailey;30;Antwerp;0;F;Harley,Theo,Samson,Beau\r\n" + 
				"Cullen;Nichols;93;Thessaloniki;7824;M;Bubba,Cash\r\n" + 
				"Briar;Pacheco;103;Łódź;0;M;Romeo,Buddy,Bo,Blaze\r\n" + 
				"Arianna;Hammond;23;Madrid;2916;F;Rambo,Ozzy,Ollie,Copper\r\n" + 
				"Bryan;King;27;Palma de Mallorca;5077;M;\r\n" + 
				"Dr. Mitchell;Lu;114;Szczecin;3798;M;Jake\r\n" + 
				"Ensley;Sosa;35;Gothenburg;5419;F;Rex,Ryder,Fluffy,Bruno,Oscar\r\n" + 
				"Kennedi;Blankenship;116;Athens;504;F;Baxter\r\n" + 
				"Kori;Chen;20;Florence;0;F;Blue,Bentley,Whiskey\r\n" + 
				"Zaylee;Macias;100;Milan;0;F;Bruno,Dexter,Coco,Levi,Finn\r\n" + 
				"Dr. Octavia;Branch;58;Vienna;939;F;Gus,Jasper,Tank,Boomer,Bubba,Miles\r\n" + 
				"Branson;Warner;19;Bucharest;7114;M;Riley,Benji\r\n" + 
				"Esmeralda;Gomez;79;Sintra;9604;F;Louie,Duke\r\n" + 
				"Aliza;Matthews;63;Bratislava;0;F;Arlo,Milo\r\n" + 
				"Karla;Patton;54;Bielefeld;0;F;\r\n" + 
				"Eliseo;Vu;19;Madrid;2832;M;Jax,Miles\r\n" + 
				"Damon;Sanchez;46;Brno;1066;M;Apollo,Sam,King,Theo,Bruno,Cooper\r\n" + 
				"Maurice;Christian;37;Murcia;4152;M;Moose,Jax,Jax,Oscar,Buster\r\n" + 
				"Dr. Bridger;White;73;Thessaloniki;6772;M;Jack,Gucci,Scout\r\n" + 
				"Beckham;Nicholson;70;Barcelona;0;M;\r\n" + 
				"Kye;Mathis;130;Munich;552;M;\r\n" + 
				"Alvaro;Patel;46;Nice;4516;M;Atlas,Bruce,Ryder,Zeke,Bandit,Arlo\r\n" + 
				"Monica;Jimenez;99;Plovdiv;6616;F;Max,Tyson,Peanut,Buddy\r\n" + 
				"Dr. Everest;Fitzpatrick;101;Stockholm;9475;M;\r\n" + 
				"Liam;Nelson;55;Alicante;1819;M;Loki\r\n" + 
				"Nyomi;Henson;63;Prague;0;F;Jackson,Mac,Boomer,Porter\r\n" + 
				"Norah;Brewer;134;Thessaloniki;0;F;Chip,Duke,Moose,Charlie,Koda\r\n" + 
				"Novalee;Cline;47;Łódź;8704;F;\r\n" + 
				"Amy;Leon;100;Hamburg;0;F;Rex,Axel,Miles,King\r\n" + 
				"Jackson;Valenzuela;41;Dublin;5465;M;Fluffy,Harley\r\n" + 
				"Emery;Wells;85;Naples;0;F;George,Bruce,Blaze,Oliver,Hank\r\n" + 
				"Malik;Leal;123;Tallinn;2857;M;Atlas,Jackson,Murphy,Apollo,Harley,Jackson\r\n" + 
				"Krew;Ware;101;Helsinki;2808;M;Bubba,Lucky\r\n" + 
				"Braylen;Kramer;89;Leipzig;4358;M;Zeke\r\n" + 
				"Khalani;Brewer;95;Murcia;0;F;Oscar\r\n" + 
				"Aziel;Ellis;112;Warsaw;9391;M;Teddy,Gunner,Milo,Ryder,Whiskey,Jasper\r\n" + 
				"Dr. Valentina;Dalton;52;Nice;8733;F;Rudy\r\n" + 
				"Blaire;Sullivan;19;Copenhagen;6985;F;Oakley,Chase\r\n" + 
				"Teagan;Duncan;136;Düsseldorf;2861;F;Harley,Rusty,Arlo,Kylo\r\n" + 
				"Lillie;Bowers;49;Aarhus;7079;F;Charlie,Milo,Chip,Jasper\r\n" + 
				"Kasen;Blanchard;117;Nice;7684;M;Atlas,Hank,Chase\r\n" + 
				"Caiden;Mitchell;124;Bratislava;8289;M;Toby,Thor,Blaze,Toby,Bailey,Fluffy\r\n" + 
				"Maximilian;Shepard;47;Nuremberg;0;M;Henry,Bear,Riley,Gizmo\r\n" + 
				"Genevieve;Adkins;113;Málaga;9197;F;Mac,Bandit,Beau,Shadow\r\n" + 
				"Solomon;Olson;66;Bydgoszcz;1199;M;Benny,Finn,Mac,Rambo\r\n" + 
				"Dr. Catherine;Dunn;81;Karlsruhe;0;F;Bruce,Chip,Otis,Rambo,Axel\r\n" + 
				"Ty;Lowe;88;Constanța;3085;M;\r\n" + 
				"Langston;Woodard;111;Düsseldorf;883;M;\r\n" + 
				"Alia;Spence;95;Amsterdam;2727;F;Teddy,Bubba,Dexter,Wally,Murphy\r\n" + 
				"Major;Shelton;83;Málaga;8316;M;Bruce,Levi,Benji\r\n" + 
				"Khalid;Sexton;89;Tallinn;7116;M;Lucky,Toby,Tyson\r\n" + 
				"Korbyn;Briggs;41;Plovdiv;1916;M;Odin,Lincoln,Jasper,Coco\r\n" + 
				"Elliana;Pham;64;Iași;2124;F;Beau,George,Jasper,Remy\r\n" + 
				"Keenan;Sheppard;97;Essen;8185;M;\r\n" + 
				"Maxton;Holt;73;Warsaw;4678;M;Echo,Duke,Diesel,Copper,Henry\r\n" + 
				"Collin;Chung;42;Plovdiv;4485;M;Riley\r\n" + 
				"Conner;Gray;88;Naples;7234;M;Bubba,Chester\r\n" + 
				"Marie;Vega;11;Bilbao;8252;F;Beau\r\n" + 
				"Jamir;Mckenzie;77;Dublin;2214;M;\r\n" + 
				"Albert;Huff;86;Wuppertal;0;M;Loki,Hank,Buster,Rocky,Beau\r\n" + 
				"Wesson;Brock;10;Munich;840;M;Kobe,Fluffy\r\n" + 
				"Addyson;Roth;130;Bremen;4944;F;Tucker,Ruger,Blaze,Harley,Boomer\r\n" + 
				"Kobe;Galindo;48;Rīga;5672;M;Ace\r\n" + 
				"Emily;Petersen;91;Hamburg;8032;F;Ruger,Harley,Rocket,Dozer,Bruno\r\n" + 
				"Kira;Porter;106;Córdoba;1450;F;Oakley,Chase,Axel,Moose,Rusty\r\n" + 
				"Rocky;Kelley;58;Tallinn;9253;M;Walter,Bubba,Zeus,George,Atlas\r\n" + 
				"Cannon;Lucero;61;Tallinn;0;M;Jack,Atlas,Gunner,Lincoln,Harley\r\n" + 
				"Dr. Ibrahim;Mckinney;88;Catania;0;M;Wally,Tucker\r\n" + 
				"Gary;Ryan;122;Tallinn;4817;M;Benny,Cody,Apollo\r\n" + 
				"Cassandra;Alfaro;103;Rome;0;F;Buster,Rocky,Louie,Louie,Rudy\r\n" + 
				"Chloe;Pearson;137;Szczecin;3701;F;Otis,Otis\r\n" + 
				"Solomon;Rosales;125;Bilbao;0;M;Ranger,Simba,Koda,Charlie,Rudy\r\n" + 
				"Oakley;Horton;84;Vilnius;0;M;Whiskey,Bentley,Scout,Miles,Buddy,Buddy\r\n" + 
				"Hugo;Meyers;106;Essen;0;M;Ollie\r\n" + 
				"Stephen;Mcfarland;93;Stuttgart;4371;M;Otis,Bailey\r\n" + 
				"Ezra;Schroeder;133;Warsaw;0;F;Rusty,Tyson,Prince,Atlas,Atlas,Gunner\r\n" + 
				"Felix;Wilson;16;Antwerp;1892;M;George,Teddy,Rusty,Harley,Watson\r\n" + 
				"Foster;Buckley;10;Copenhagen;2690;M;Copper,Wally,Sam,Harley,Oreo,Cooper\r\n" + 
				"Mira;Gordon;63;Bari;0;F;Bo,Max,Atlas,Theo\r\n" + 
				"Dr. Olive;Melendez;68;Varna;0;F;Kobe\r\n" + 
				"Kira;Underwood;131;Munich;1336;F;\r\n" + 
				"Adriel;Mitchell;56;Munich;7375;M;Luke\r\n" + 
				"Jeffrey;Moses;138;Toulouse;0;M;Simba,Loki,Marley,Blue\r\n" + 
				"Adam;Mcdaniel;42;Gdańsk;0;M;\r\n" + 
				"Dakota;Rosales;20;Marseille;5796;F;Kobe,Odie,Benny,Riley,Boomer\r\n" + 
				"Kye;Norman;14;Sigulda;6433;M;\r\n" + 
				"Jamie;Horton;15;Dublin;4050;M;Maverick,Gizmo,Riley,Copper\r\n" + 
				"Ezra;Mccall;124;Vilnius;7129;F;Joey,Baxter,Moose,Murphy,Simba\r\n" + 
				"Raegan;Vance;137;Bochum;9249;F;Blue,Kylo,Odin\r\n" + 
				"Braden;Hopkins;22;Dublin;0;M;Murphy\r\n" + 
				"Kabir;Olson;21;Nantes;0;M;Bruno,Duke\r\n" + 
				"Lorelei;Burke;52;Cluj-Napoca;0;F;\r\n" + 
				"Dr. Caleb;Walls;139;Sigulda;0;M;\r\n" + 
				"Nina;Wiley;93;Marseille;3049;F;Joey,Scout,Lucky,Theo\r\n" + 
				"Dr. Milo;Bullock;52;Budapest;1410;M;Rocky,Baxter,Sam,Sam\r\n" + 
				"Bryan;Kline;88;Brno;3569;M;Dexter,Harry\r\n" + 
				"Samuel;Graham;139;Málaga;0;M;Charlie,Loki,Kylo,Ryder,Loki\r\n" + 
				"Rylan;Mills;25;Vilnius;0;F;Chip,Jack,Coco,Ozzy,Hank\r\n" + 
				"August;Schaefer;25;The Hague;0;M;\r\n" + 
				"Joey;Newton;25;Valencia;5809;M;Cody,Bo\r\n" + 
				"Siena;Cruz;21;Galați;2828;F;\r\n" + 
				"Dr. Lana;Byrd;64;Florence;0;F;Sam,Gus,Teddy,Echo,Baxter,Echo\r\n" + 
				"Dr. Melanie;Sims;27;Bochum;0;F;Jax,Bruce,Simba,Louie,Oakley,Jasper\r\n" + 
				"Emelia;Santana;110;Munich;8516;F;Murphy,Thor,Blaze,Rusty\r\n" + 
				"Colton;Armstrong;27;Toulouse;0;M;Archie,Mac,Oakley,Romeo\r\n" + 
				"Makai;Hurst;60;Nantes;1750;M;\r\n" + 
				"Rowen;Romero;41;Bochum;8238;M;\r\n" + 
				"Francisco;Vincent;124;Toulouse;0;M;\r\n" + 
				"Alice;Kane;86;Gdańsk;9410;F;Oakley,Romeo,Jax,King,Joey\r\n" + 
				"Macy;Todd;46;Murcia;0;F;Jax\r\n" + 
				"Ares;Haley;121;Wuppertal;5390;M;Henry,Milo,Joey\r\n" + 
				"Gwen;Waller;92;Rīga;7046;F;Titan,Levi,Lincoln,Leo\r\n" + 
				"Albert;Ryan;105;Seville;0;M;\r\n" + 
				"Leighton;Palacios;52;Dublin;5394;F;Samson,Samson\r\n" + 
				"Cash;Bennett;125;Aarhus;3218;M;Leo,Oliver,Otis,Beau,Bear\r\n" + 
				"Maya;Peña;118;Athens;2282;F;Fluffy,Watson,Bailey,Cody,Duke,Shadow\r\n" + 
				"Jennifer;Reese;124;Malmö;2657;F;Porter,Winston,Baxter,Teddy,Jax,Moose\r\n" + 
				"Dorothy;Adams;96;Stuttgart;7394;F;Peanut,Bo,Ace,Oscar,Tucker\r\n" + 
				"Lilith;Woods;80;Galați;1069;F;Toby,Peanut,Blaze,Jasper\r\n" + 
				"Gwendolyn;Garza;91;Lisbon;4299;F;Luke,Watson,Atlas\r\n" + 
				"Nova;Stanton;122;Catania;8047;F;Boomer\r\n" + 
				"Kyng;Conway;20;Zaragoza;1626;M;Louie,Murphy,Hank,Odin,Peanut,Ozzy\r\n" + 
				"Nancy;Terrell;40;Varna;0;F;Coco,Loki,Jake\r\n" + 
				"Christina;Clark;130;Zaragoza;1455;F;Jackson\r\n" + 
				"Dr. Bellamy;Mendez;10;Bari;2939;F;Rambo,Wally,Bentley,Jax,Rusty\r\n" + 
				"Ariel;Nichols;76;Dresden;6179;F;\r\n" + 
				"Atlas;Scott;63;Łódź;0;M;Cooper,Ace,Harley,Echo,Archie\r\n" + 
				"Jericho;Hayes;110;Gdańsk;0;M;Oscar,Rocky,Otis,Benny,Ozzy,Benny\r\n" + 
				"Ryan;Roach;105;Aarhus;6284;F;Boomer,Copper,Murphy,Bandit,Tucker,Koda\r\n" + 
				"Olive;Zuniga;48;Bielefeld;6740;F;Mac,Arlo,Rambo\r\n" + 
				"Morgan;Gilmore;63;Iași;5981;M;Winston,Blue,Oreo,Arlo,Wally,Henry\r\n" + 
				"Alexandria;Beard;102;Las Palmas;0;F;\r\n" + 
				"Fernanda;Villarreal;121;Aarhus;3387;F;Walter,Romeo\r\n" + 
				"Queen;Bennett;41;Duisburg;5299;F;\r\n" + 
				"Amy;Benitez;67;Bielefeld;0;F;Gizmo,Tucker,Zeus,Peanut\r\n" + 
				"Paulina;Shaffer;64;Constanța;4138;F;Bubba,Oscar,Bubba,Hank\r\n" + 
				"Xander;Medrano;103;Hamburg;0;M;Leo\r\n" + 
				"Dr. Adan;Juarez;136;Warsaw;4764;M;Benji,Blaze,Jax,Bear,Bruce,Apollo\r\n" + 
				"Brielle;Guerra;118;Malmö;7878;F;Ryder,Otis,Odin,Bentley,Ziggy,Oliver\r\n" + 
				"Dr. Emory;Chandler;108;The Hague;5489;M;\r\n" + 
				"Abraham;Dorsey;126;Dortmund;9911;M;Ozzy,Finn,Rambo,Apollo,Arlo,Miles\r\n" + 
				"Lauren;Guerra;99;Kraków;8965;F;Rudy,Harley,Walter\r\n" + 
				"Nolan;Wu;86;Nuremberg;347;M;George\r\n" + 
				"Remi;Estrada;70;Stockholm;6518;F;Murphy,Simba,Gus,Odin\r\n" + 
				"Dr. Keenan;Moss;101;Sintra;0;M;Harley,Winston,Ryder,Dexter\r\n" + 
				"Kenna;Russell;26;Kraków;0;F;Wally,Cash,Cooper,Rocket,Charlie\r\n" + 
				"Samara;Perkins;83;Seville;9905;F;Cash,Levi,Archie\r\n" + 
				"Dr. Kellen;Wood;27;Iași;9167;M;Miles,Scout,Gus,Odin\r\n" + 
				"Luna;Fitzpatrick;88;Sintra;0;F;Loki,Jasper,Moose\r\n" + 
				"Dr. Guillermo;Dodson;79;Rotterdam;0;M;Blaze,Teddy,Arlo,Rudy,Teddy,Rambo\r\n" + 
				"Samuel;Mcbride;88;Constanța;6900;M;Echo,Tyson,Kylo,Odin,Bubba\r\n" + 
				"Sutton;Ellison;51;Marseille;0;M;\r\n" + 
				"Louie;Lamb;19;Zaragoza;8637;M;Echo\r\n" + 
				"Deacon;Merritt;125;Sintra;5861;M;Gizmo,Rusty,Sarge\r\n" + 
				"Blaze;Cruz;64;Gothenburg;321;M;Lucky,Baxter\r\n" + 
				"Houston;Martin;102;Prague;4950;M;Shadow,Theo,Marley\r\n" + 
				"Theodora;Morgan;72;Palermo;3303;F;Beau,Archie,Ruger\r\n" + 
				"Alma;Acevedo;102;Bochum;118;F;Jasper,Jasper,Ryder,Boomer,Otis\r\n" + 
				"Alfredo;Rivers;50;Zagreb;2548;M;Sam,Chase,Rocky,Luke,Oscar\r\n" + 
				"Zahra;Smith;132;Valencia;0;F;\r\n" + 
				"Corbin;Small;63;Düsseldorf;8480;M;Boomer,Duke,Zeke,Charlie,Gus\r\n" + 
				"Brooklyn;Quintana;88;Duisburg;596;F;Milo,Blaze,Harley,Ranger\r\n" + 
				"Laney;Mahoney;32;Rotterdam;0;F;Titan,Riley\r\n" + 
				"Dustin;Parrish;104;Mannheim;0;M;\r\n" + 
				"Penelope;Stevens;109;Antwerp;1853;F;Wally,Miles\r\n" + 
				"Moises;Blackburn;134;Vienna;2292;M;Coco,Walter,Oakley,Boomer\r\n" + 
				"Dayana;Decker;34;Szczecin;0;F;Riley\r\n" + 
				"Jaylin;Clements;90;Rotterdam;9036;F;George\r\n" + 
				"Kaisley;Snow;135;Bielefeld;9309;F;Porter,Watson,Ace,Jackson,Chase\r\n" + 
				"Gregory;Huff;58;Bydgoszcz;0;M;Tank,Finn\r\n" + 
				"Scarlett;Rodgers;25;Bucharest;0;F;Benny,Toby,Rusty\r\n" + 
				"Janiyah;Glass;119;Naples;0;F;Echo,Peanut,Maverick,George,Romeo\r\n" + 
				"Jacqueline;Ashley;117;Dortmund;5005;F;Romeo,Porter,Whiskey,Ziggy\r\n" + 
				"Sutton;Reeves;46;Nantes;1128;F;Zeke,Archie,Bruce,Bruno\r\n" + 
				"Jeremiah;Hayes;57;Malmö;9588;M;Benji,Scout,Coco,Rudy\r\n" + 
				"Aya;Mcdonald;36;Valmiera;2719;F;Rocco,Shadow,Bowie,Maverick\r\n" + 
				"Shepard;Mcclure;46;Frankfurt am Main;2853;M;Ziggy,Oscar\r\n" + 
				"Sabrina;Cohen;127;Bielefeld;0;F;Remi\r\n" + 
				"Lucy;Higgins;139;Hanover;9844;F;Riley,King,Lucky,Leo\r\n" + 
				"Tommy;Portillo;22;Dublin;0;M;Coco,Romeo,Charlie,Max,Remi,Watson\r\n" + 
				"Kate;Koch;138;Aarhus;8203;F;Gunner,Chase\r\n" + 
				"Tristen;Hansen;38;Leipzig;6135;M;Odie,Odie,Teddy\r\n" + 
				"Alaric;Wang;101;Szczecin;8504;M;Zeke,Duke,Arlo,Oakley,Fluffy,Ziggy\r\n" + 
				"Lucas;Richardson;138;Seville;8242;M;\r\n" + 
				"Princeton;Benitez;71;Rotterdam;6309;M;\r\n" + 
				"Duncan;Cox;104;Madrid;0;M;Odie,Louie,Lucky,Bruce,Marley\r\n" + 
				"Gabrielle;Magana;130;Utrecht;1899;F;Wally,Walter,Echo,Mac,Odin,Boomer\r\n" + 
				"Blaine;Acosta;18;Vila Nova de Gaia;3634;M;Mac,Echo,Joey,Ozzy\r\n" + 
				"Marceline;Montes;79;Zaragoza;2257;F;Gizmo\r\n" + 
				"Jolie;Roth;34;Toulouse;2876;F;\r\n" + 
				"Julio;Sims;94;Marseille;8057;M;Arlo,Toby,Benny\r\n" + 
				"Dr. Amoura;Porter;16;Bari;7228;F;Arlo,Peanut,Rocket,Sarge\r\n" + 
				"Katie;Reilly;125;Gdańsk;2879;F;Harley,Copper,Shadow,Coco,Wally\r\n" + 
				"Brennan;Lee;72;Gothenburg;2177;M;Remy,Cooper,Romeo,Bruce,Leo,Marley\r\n" + 
				"Mac;Guerra;21;Turin;0;M;Cash,Cody,Gucci,Bear,Ranger,Bear\r\n" + 
				"Dr. Tommy;Mullins;39;Zaragoza;6755;M;Jax,Mac\r\n" + 
				"Kenji;Mora;30;Bielefeld;0;M;Benny,Rambo,Samson,Maverick\r\n" + 
				"River;Sharp;66;Seville;0;M;Scout,Jack,Tucker,Dexter,Atlas\r\n" + 
				"Aniya;Hutchinson;92;Riga;5006;F;Scout,Levi\r\n" + 
				"Valentino;Sampson;127;Karlsruhe;5467;M;Mac,Tyson,Atlas,Charlie,Harley,Bowie\r\n" + 
				"Crystal;Conrad;17;Utrecht;4823;F;Zeus,Ranger,Ranger\r\n" + 
				"Kyra;Guevara;50;Bochum;6142;F;\r\n" + 
				"Dr. Alistair;Hendricks;47;Malmö;7262;M;Louie\r\n" + 
				"Gabriela;Garrison;89;Bremen;9997;F;\r\n" + 
				"Liam;Poole;82;Wrocław;2490;M;Coco,Fluffy,Axel,Maverick,Tucker,Lincoln\r\n" + 
				"Aileen;Estes;77;Mannheim;1753;F;Samson,Harry,Charlie,Gizmo\r\n" + 
				"Wrenley;Boone;63;Nantes;9366;F;Whiskey,Chase,Chase\r\n" + 
				"Dr. Izabella;Reyna;36;Kraków;0;F;Wally,Toby,Zeus,Rambo,Wally\r\n" + 
				"Aubree;Mcdowell;136;Vilnius;1712;F;Romeo\r\n" + 
				"Adley;Dominguez;59;Gdańsk;0;F;Theo,Simba\r\n" + 
				"Gia;Hudson;90;Cluj-Napoca;5822;F;\r\n" + 
				"Milan;Simon;11;Gdańsk;2523;M;Remy,Luke,Jake,Rudy\r\n" + 
				"Anne;Peterson;98;Mannheim;9884;F;Gucci,Bo\r\n" + 
				"Jaxtyn;Bravo;98;Hanover;5617;M;Oscar,Ruger,Jasper,Gunner\r\n" + 
				"Dr. Lilith;Porter;30;Varna;5923;F;Bowie,Koda,Walter\r\n" + 
				"Alonso;Gonzalez;98;Poznań;0;M;Dozer\r\n" + 
				"Elise;Williamson;93;Budapest;9782;F;\r\n" + 
				"Brinley;Duncan;104;Dresden;8462;F;Axel,Odie\r\n" + 
				"Mohammed;Benton;71;Gdańsk;1540;M;Blaze,Oreo\r\n" + 
				"Liana;Schmitt;49;Bologna;0;F;\r\n" + 
				"Zoie;Franklin;118;Frankfurt am Main;8328;F;Oreo\r\n" + 
				"Sylas;Morse;61;Athens;9088;M;Porter\r\n" + 
				"Tiffany;Graham;34;Lublin;7884;F;Sarge,Levi\r\n" + 
				"Muhammad;Mosley;102;Bremen;0;M;Rusty,Rex,Louie\r\n" + 
				"Dr. Penny;Crawford;60;Hanover;2597;F;Rex,Moose\r\n" + 
				"Sawyer;Conrad;137;Bydgoszcz;1263;M;\r\n" + 
				"Dr. Jade;Shaffer;131;Frankfurt am Main;7940;F;Wally,Boomer,Prince,Lucky,Archie\r\n" + 
				"Virginia;Reilly;128;Duisburg;5616;F;Ace,Porter,Wally,Bentley,Jack,Charlie\r\n" + 
				"Dayton;Gilmore;37;Nuremberg;8757;M;Scout,Benji,Ace,Cody,Chip,Shadow\r\n" + 
				"Kade;Hurley;123;Łódź;9462;M;Winston,Samson,Benji,Murphy\r\n" + 
				"Heaven;Ayers;42;The Hague;0;F;Jax,Cooper,Marley\r\n" + 
				"Hank;Kennedy;128;Munich;0;M;Echo,Leo,Hank,Leo,Charlie,Bear\r\n" + 
				"Madelynn;Dorsey;132;Stockholm;7712;F;Sam,Bentley\r\n" + 
				"Silas;Fitzgerald;43;Berlin;7603;M;Rex,Lucky,Ziggy,Samson,Rudy,Beau\r\n" + 
				"Mario;Knight;44;Dortmund;0;M;Ollie,Duke\r\n" + 
				"Nora;Lara;45;Bielefeld;1380;F;\r\n" + 
				"Creed;Bowman;32;Munich;0;M;Marley,Finn\r\n" + 
				"Landry;Hansen;51;Turin;5706;F;Winston,Rocket,Cody,Cash\r\n" + 
				"Shawn;Brewer;77;Prague;8719;M;\r\n" + 
				"Madalynn;Howard;127;Paris;1121;F;\r\n" + 
				"Vivienne;Lam;87;Budapest;1359;F;Zeus,Thor,Samson,Winston\r\n" + 
				"Dr. Brixton;Brewer;100;Sofia;2768;M;Tucker,Leo\r\n" + 
				"Sunny;Barron;132;Lisbon;2136;F;Milo,Harley\r\n" + 
				"Karter;Mcdonald;104;Valencia;0;F;Apollo\r\n" + 
				"Paisley;Fry;96;Stockholm;1421;F;Joey,George,Oreo,George,Bruno,Loki\r\n" + 
				"Arlo;Hayden;21;Athens;2744;M;Jack,Ziggy,Bruce,Otis,Oreo\r\n" + 
				"Lyanna;Lewis;122;Munich;250;F;Titan,Rocco,Shadow\r\n" + 
				"Adeline;Fuller;79;Timișoara;0;F;Arlo,Theo,Maverick,Winston,Rocco\r\n" + 
				"Marceline;Burgess;36;Sintra;0;F;\r\n" + 
				"Randy;Ramsey;90;Brno;8799;M;Bruce\r\n" + 
				"Estelle;Michael;58;Rīga;9027;F;Otis,Bentley,Dexter,Jax\r\n" + 
				"Charles;Houston;79;Bremen;0;M;Oliver,Odie,Rex\r\n" + 
				"Alberto;Clark;38;Athens;2587;M;Porter,Apollo,Peanut,Tucker,Bruce\r\n" + 
				"Jazmine;Benitez;87;Warsaw;8825;F;Bo,Gunner\r\n" + 
				"Amoura;Cummings;63;Hamburg;7698;F;Kylo,Hank,Titan,Walter,Gizmo,Rusty\r\n" + 
				"Dr. Kataleya;Salas;23;Bremen;0;F;Watson,Sarge\r\n" + 
				"Adler;Lara;117;Genoa;0;M;Bo,Arlo,Buddy,Koda,Chester,Beau\r\n" + 
				"Rodrigo;Harmon;52;Nuremberg;1404;M;Porter,George\r\n" + 
				"Leroy;Franklin;87;Dublin;4941;M;Romeo\r\n" + 
				"Julien;Erickson;16;Nice;418;M;Koda,Diesel,Leo,Chase,Bo,Leo\r\n" + 
				"Loretta;Dorsey;137;Palermo;5250;F;Buster\r\n"+
				"Juliet;Carson;102;Malmö;0;F;Jackson,Leo,Cooper,Jack,Oreo,Gizmo\r\n" + 
				"Bridger;Chan;14;Naples;2921;M;Lincoln,Shadow,Apollo\r\n" + 
				"Mario;Garrison;87;Constanța;0;M;Scout,Jasper,Koda,Gunner,Finn\r\n" + 
				"Savanna;Cochran;94;Vilnius;0;F;King,Simba,Leo";
	}
	
	
}


