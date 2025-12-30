import java.util.Scanner;
class Spotify
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to spotify");
		System.out.println("1.A.R Rahman");
		System.out.println("2.Anirudh");
		System.out.println("3.Haris jeyaraj");
		System.out.println("4.Illariyaraja");
		System.out.println("5.U1");
		System.out.print("Choose your music director:");
		int choice=sc.nextInt();
		if(choice==1)
		{
		System.out.println("Welcome to A.R Rahman hits");
		System.out.println("1.melody");
		System.out.println("2.Kuthu");
		System.out.println("3.motivational");
		System.out.println("4.sad");
		System.out.println("Select your option:");
		int option=sc.nextInt();
		if(option==1)
		{
		System.out.println("1.Netru illadha matram");
		System.out.println("2.Enna solla pogirai");
		System.out.println("3.Ennavale adi ennavale");
		System.out.println("4.Malargale Malargale");
		int song=sc.nextInt();
		if(song==1)
		{
		System.out.println("Netru illadha matram ennadhu katru en kaathil etho");
		}
		else if(song==2)
		{
		System.out.println("illai illai solla oru kanam podhum");
		}
		else if(song==3)
		{
		System.out.println("Ennavale adi ennavale endhan idhayathai");
		}
		else if(song==4)
		{
		System.out.println("Malargale malargale ithu enna kanavaa");
		}
		else
		{
		System.out.println("No melody songs avalilable");
		}
		}
		else if(option==2)
		{
		System.out.println("1.Thaiya Thaiya");
		System.out.println("2.Mukkala mukkabala");
		System.out.println("3.Urvashi urvashi");
		System.out.println("4.Aathichudi");
		int song=sc.nextInt();
		if(song==1)
		{
		System.out.println("Thaiya Thaiya thaiya thaka thaiya");
		}
		else if(song==2)
		{
		System.out.println("Mukkala mukkabala oo lailaaya");
		}
		else if(song==3)
		{
		System.out.println("urvashi urvashi take it easy urvashi");
		}
		else if(song==4)
		{
		System.out.println("Aathichudi ithu new age aathichudi");
		}
		else
		{
		System.out.println("No kuthu songs available");
		}
		}
		else if(option==3)
		{
		System.out.println("1.Vande Mataram");
		System.out.println("2.Oruvan oruvan mudhalli");
		System.out.println("3.shakthi kodu");
		System.out.println("4.Kappal yeari poyachu");
		int song=sc.nextInt();
		if(song==1)
		{
		System.out.println("Vande mataram yahan vahan saara jahan");
		}
		else if(song==2)
		{
		System.out.println("oru oruvan mudhali ulagil matravan thozhilali");
		}
		else if(song==3)
		{
		System.out.println("Nam nadai kandu ahangaaram Thoolaagha");
		}
		else if(song==4)
		{
		System.out.println("Kappaleri poyaachu suththamanna oorachu");
		}
		else
		{
		System.out.println("No motivational songs available");
		}
		}
		else if(option==4)
		{
		System.out.println("1.Poongatrile");
		System.out.println("2.Marudaani");
		System.out.println("3.Minnalea en Vahvin");
		System.out.println("4.Rasathi");
		System.out.println("5.oru poiyavathu sol");
		int song=sc.nextInt();
		if(song==1)
		{
		System.out.println("poogatrile un swasathai thaniyaaga thedi parthen");
		}
		else if(song==2)
		{
		System.out.println("Maruthani vizhiyil enn adi podi deepali");
		}
		else if(song==3)
		{
		System.out.println("Minnalae nee vandhadhenadi en kannilae");
		}
		else if(song==4)
		{
		System.out.println("Raasathi en usiru ennathilla");
		}
		else if(song==5)
		{
		System.out.println("oru poiyavathu sol kanne un kaathal naan than endru");
		}
		else
		{
		System.out.println("No sad songs available");
		}
		}
		}
		else if(choice==2)
		{
		System.out.println("Welcome to Anirudh hits");
		System.out.println("1.melody");
		System.out.println("2.Kuthu");
		System.out.println("3.motivational");
		System.out.println("4.sad");
		System.out.println("Select your option:");
		int option=sc.nextInt();
		if(option==1)
		{
		System.out.println("1.Neeyum nanum anbe");
		System.out.println("2.velicha poove");
		System.out.println("3.Po indru neeyaga");
		System.out.println("4.Nee partha vizhigal");
		int song=sc.nextInt();
		if(song==1)
		{
		System.out.println("Neeyum nanum anbe kangal korthukondu");
		}
		else if(song==2)
		{
		System.out.println("Minvedu naaliil endru minsaara poovai vandhayae");
		}
		else if(song==3)
		{
		System.out.println("Po indru neeyaga va nalai namaaga");
		}
		else if(song==4)
		{
		System.out.println("Nee partha vizhigal nee partha nodigal");
		}
		else
		{
		System.out.println("No melody songs avalilable");
		}
		}
		else if(option==2)
		{
		System.out.println("1.Vaathi Raid");
		System.out.println("2.Naa Ready");
		System.out.println("3.Badass");
		System.out.println("4.Vandha Edam");
		int song=sc.nextInt();
		if(song==1)
		{
		System.out.println("Aana aavanna apna time na");
		}
		else if(song==2)
		{
		System.out.println("Anna nee vaa naa anoove nee vaa");
		}
		else if(song==3)
		{
		System.out.println("Badass ma orasama odidu");
		}
		else if(song==4)
		{
		System.out.println("Rendu padum kaadu rendu padumey");
		}
		else
		{
		System.out.println("No kuthu songs available");
		}
		}
		else if(option==3)
		{
		System.out.println("1.Velai Illa pattathari");
		System.out.println("2.Boomi enna suthudhe");
		System.out.println("3.ethir neechal");
		System.out.println("4.Surviva");
		int song=sc.nextInt();
		if(song==1)
		{
		System.out.println("Velai Illa pattathari thottupaartha schock");
		}
		else if(song==2)
		{
		System.out.println("Boomai enna suthudhe umai nenju kathude");
		}
		else if(song==3)
		{
		System.out.println("yoyo Honey singh hey anirudh");
		}
		else if(song==4)
		{
		System.out.println("La la la la surviva");
		}
		else
		{
		System.out.println("No motivational songs available");
		}
		}
		else if(option==4)
		{
		System.out.println("1.Porkanda singam");
		System.out.println("2.kanave kanave");
		System.out.println("3.kannanna kanne");
		System.out.println("4.jodi Nilave");
		int song=sc.nextInt();
		if(song==1)
		{
		System.out.println("uyirum nadungude unnaiyum yenthidave");
		}
		else if(song==2)
		{
		System.out.println("kanave kanave karangal ranamai ninaive");
		}
		else if(song==3)
		{
		System.out.println("kannaana kannaey kannana kannaey");
		}
		else if(song==4)
		{
		System.out.println("jodi milavae paadhi uyirae sogam yenada");
		}
		else
		{
		System.out.println("No sad songs available");
		}
		}
		}
		
	  else if(choice==3)
		{
		System.out.println("Welcome to Harris jeyaraj hits");
		System.out.println("1.melody");
		System.out.println("2.Kuthu");
		System.out.println("3.sad");
		System.out.println("Select your option:");
		int option=sc.nextInt();
		if(option==1)
		{
		System.out.println("1.Unnale");
		System.out.println("2.Annul maele");
		System.out.println("3.Yedho ondru");
		System.out.println("4.vaseegara");
		System.out.println("5.paartha mudhal");
		int song=sc.nextInt();
		if(song==1)
		{
		System.out.println("Unnale kangal thalladi");
		}
		else if(song==2)
		{
		System.out.println("Anal mele panithuli aalipayum oru kizhi");
		}
		else if(song==3)
		{
		System.out.println("yetho ondru yedho ondru unnai ketpen");
		}
		else if(song==4)
		{
		System.out.println("vaseegara en nenjinikka");
		}
		else if(song==5)
		{
		System.out.println("paartha mudhal nale");
		}
		else
		{
		System.out.println("No melody songs avalilable");
		}
		}
		else if(option==2)
		{
		System.out.println("1.Tirunelveli halwa da");
		System.out.println("2.Aradi katre");
		System.out.println("3.soda Bottle");
		System.out.println("4.Aruva meesai");
		int song=sc.nextInt();
		if(song==1)
		{
		System.out.println("Tirunelveli halwa da trichy mala kotta da");
		}
		else if(song==2)
		{
		System.out.println("Ivan udaiyum kandu nadaiyum kandu");
		}
		else if(song==3)
		{
		System.out.println("Anju kilo arusi vaangi panju panja");
		}
		else if(song==4)
		{
		System.out.println("Ayzha ayzha ayzha mundi ayzha");
		}
		else
		{
		System.out.println("No kuthu songs available");
		}
		}
		else if(option==3)
		{
		System.out.println("1.Venmathiye");
		System.out.println("2.oh maname");
		System.out.println("3.yamma yamma");
		System.out.println("4.othayile");
		int song=sc.nextInt();
		if(song==1)
		{
		System.out.println("Venmathi venmathiyae nillu");
		}
		else if(song==2)
		{
		System.out.println("oh manamae oh manamae");
		}
		else if(song==3)
		{
		System.out.println("yamma yamma kaatal");
		}
		else if(song==4)
		{
		System.out.println("othaiyila ulagham maranthu pochu");
		}
		else
		{
		System.out.println("No sad songs available");
		}
		}
		}
	     else if(choice==4)
		{
		System.out.println("Welcome to illaraja hits");
		System.out.println("1.melody");
		System.out.println("2.Kuthu");
		System.out.println("3.sad");
		System.out.println("Select your option:");
		int option=sc.nextInt();
		if(option==1)
		{
		System.out.println("1.oru killi uruguthu");
		System.out.println("2.kuzhaloodhum kannanukku");
		System.out.println("3.ennai thottu");
		System.out.println("4.raja raja cholan");
		int song=sc.nextInt();
		if(song==1)
		{
		System.out.println("oru kili uruguthu omaina omaina");
		}
		else if(song==2)
		{
		System.out.println("kuzhal oodhum kannanukku kuyil padal kekutha");
		}
		else if(song==3)
		{
		System.out.println("ennai thootu allikonda mannan");
		}
		else if(song==4)
		{
		System.out.println("raja raja chozhan naan");
		}
		else
		{
		System.out.println("No melody songs avalilable");
		}
		}
		else if(option==2)
		{
		System.out.println("1.ooruvittu ooruvanthu");
		System.out.println("2.nooru varusham");
		System.out.println("3.aasai nooruvagai");
		System.out.println("4.aasai athigam vachu");
		int song=sc.nextInt();
		if(song==1)
		{
		System.out.println("ooruvittu ooruvanthu kadhal kethal panathings");
		}
		else if(song==2)
		{
		System.out.println("nooru varusham intha mapillaiyum ponnuyum");
		}
		else if(song==3)
		{
		System.out.println("aasai nooruvagai vaazhvil");
		}
		else if(song==4)
		{
		System.out.println("aasa adhigam vechu manasa");
		}
		else
		{
		System.out.println("No kuthu songs available");
		}
		}
		else if(option==3)
		{
		System.out.println("1.kanne kalaimane");
		System.out.println("2.thene thenpaandi neeye");
		System.out.println("3.paadi parantha killi");
		System.out.println("4.nilave vaa");
		int song=sc.nextInt();
		if(song==1)
		{
		System.out.println("ksnne kalaimane kanni mayilena");
		}
		else if(song==2)
		{
		System.out.println("thaenae thenpaandi meenae");
		}
		else if(song==3)
		{
		System.out.println("paadi parantha killi patha");
		}
		else if(song==4)
		{
		System.out.println("nilavae vaa nilmal vaa");
		}
		else
		{
		System.out.println("No sad songs available");
		}
		}
		}
		else if(choice==5)
		{
		System.out.println("Welcome to U1 hits");
		System.out.println("1.melody");
		System.out.println("2.Kuthu");
		System.out.println("3.motivational");
		System.out.println("4.sad");
		System.out.println("Select your option:");
		int option=sc.nextInt();
		if(option==1)
		{
		System.out.println("1.aathadi manasudhan");
		System.out.println("2.chinna sirisu");
		System.out.println("3.venmeggam");
		System.out.println("4.iayyayyo");
		int song=sc.nextInt();
		if(song==1)
		{
		System.out.println("aathadi manasudhan regakati parkathu");
		}
		else if(song==2)
		{
		System.out.println("thaanana nanan nana nananaa");
		}
		else if(song==3)
		{
		System.out.println("venmeggan penaga uruvanatho");
		}
		else if(song==4)
		{
		System.out.println("iayyayo en usurukulla theeyar");
		}
		else
		{
		System.out.println("No melody songs avalilable");
		}
		}
		else if(option==2)
		{
		System.out.println("1.machi open the bottle");
		System.out.println("2.saroja saman nikalo");
		System.out.println("3.no money no honey");
		System.out.println("4.villaiyadu mankatha");
		int song=sc.nextInt();
		if(song==1)
		{
		System.out.println("machi open the bottle adama jeichomatta");
		}
		else if(song==2)
		{
		System.out.println("mele yeri vaarom ini othingi nillu");
		}
		else if(song==3)
		{
		System.out.println("no money no honey da");
		}
		else if(song==4)
		{
		System.out.println("villaiyadu mankatha vidamata enkatha");
		}
		else
		{
		System.out.println("No kuthu songs available");
		}
		}
		else if(option==3)
		{
		System.out.println("1.edhirthu nil");
		System.out.println("2.oru nalil");
		System.out.println("3.nimirnthu nil");
		System.out.println("4.ungakkule mirugam");
		int song=sc.nextInt();
		if(song==1)
		{
		System.out.println("thirumbi povum dhisai");
		}
		else if(song==2)
		{
		System.out.println("oru naalil vaazhkkai ingae");
		}
		else if(song==3)
		{
		System.out.println("nimirundhu nil thunidu sel");
		}
		else if(song==4)
		{
		System.out.println("unakkullae mirugam thoongivida");
		}
		else
		{
		System.out.println("No motivational songs available");
		}
		}
		else if(option==4)
		{
		System.out.println("1.kadhal valarthen");
		System.out.println("2.yedho ondru ennai");
		System.out.println("3.pogadhe");
		System.out.println("4.ninaithu ninaithu");
		int song=sc.nextInt();
		if(song==1)
		{
		System.out.println("kadhal valarthen kadhal valarthen");
		}
		else if(song==2)
		{
		System.out.println("yedho ondru ennai thaakka");
		}
		else if(song==3)
		{
		System.out.println("pogadhe nee piranthil naan erapen");
		}
		else if(song==4)
		{
		System.out.println("ninaithu ninaithu paarpen nerungi nerungi varuven");
		}
		else
		{
		System.out.println("No sad songs available");
		}
		}
		}
		else
		{
			System.out.println("thanks for visiting");
		}	
		
		}
}