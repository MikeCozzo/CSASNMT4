import java.util.ArrayList;
public class ProblemSet1 {
	String[] ary;
	String[] typeray;
	int[] keyray;
	double[] priceray;
	final static int max = 10;

	
	
	
	
	public static void main(String[] args) {
	
		
		

		MusicalInstrument Value = new MusicalInstrument();
		String firstname = Value.getName();
		String firsttype = Value.getType();
		System.out.println(firsttype);
		System.out.println(firstname);
		int firstkeyorstring = Value.getNumberofKeysorStrings();
		double firstprice = Value.getprices();
		System.out.println(firstkeyorstring);
		System.out.println(firstprice);
		Value.setName("Snare Drum");
		String name = Value.getName();
		System.out.println(name.toLowerCase());
		Value.setType("Percussion");
		String type = Value.getType();
		System.out.println(type.toLowerCase());
		Value.setnumberOfKeysorStrings(0);
		int NumberOfKeysorStrings = Value.getNumberofKeysorStrings();
		System.out.println(NumberOfKeysorStrings);
		Value.setprice(100);
		double pricenum = Value.getprices();
		System.out.println(pricenum);
		
		
		///MusicalInstrument instrument2 = new MusicalInstrument("CLARINET", "Wooodwid", 10, 89.99);

		MusicalInstrument instrument1 = new MusicalInstrument("sakjn", "lfkd", 7);
		String Fname = instrument1.getName();
		String Ftype = instrument1.getType();
		instrument1.setType(Ftype);
		System.out.println(Fname.toLowerCase());
		System.out.println(Ftype.toLowerCase());
		
		int Fkeys = instrument1.getNumberofKeysorStrings();
		double Fprice = instrument1.getprices();
		System.out.println(Fkeys);
		System.out.println(Fprice);
		
		// verify default constructor sets all attributes correctly
		
		MusicalInstrument instrument2 = new MusicalInstrument("GuiTar", "STRIng", 6);
		// verify this constructor sets all attributes correctly
		String secName = instrument2.getName();
		String secType = instrument2.getType();
		System.out.println(secName.toLowerCase());
		System.out.println(secType.toLowerCase());
		int secKeys = instrument2.getNumberofKeysorStrings();
		double secPrice = instrument2.getprices();
		System.out.println(secKeys);
		System.out.println(secPrice);
		
		MusicalInstrument instrument3 = new MusicalInstrument("Trumpet", "brass", 3, 109.99);
		String Thname = instrument3.getName();
		String Thtype = instrument3.getType();
		System.out.println(Thname.toLowerCase());
		System.out.println(Thtype.toLowerCase());
		int Thkeys = instrument3.getNumberofKeysorStrings();
		double Thprice = instrument3.getprices();
		System.out.println(Thkeys);
		System.out.println(Thprice);
		
		// verify this constructor sets all attributes correctly
		
		MusicalInstrument instrument4 = new MusicalInstrument("", "BRAss", -14, 109.99);
		String Foname = instrument4.getName();
		String Fotype = instrument4.getType();
		System.out.println(Foname.toLowerCase());
		System.out.println(Fotype.toLowerCase());
		int Fokeys = instrument4.getNumberofKeysorStrings();
		double Foprice = instrument4.getprices();
		System.out.println(Fokeys);
		System.out.println(Foprice);
		
		// verify this constructor sets all attributes correctly
		
		MusicalInstrument instrument5 = new MusicalInstrument("CLARINET", "Wooodwid", 10, 89.99);
		String Finame = instrument5.getName();
		String Fitype = instrument5.getType();
		System.out.println(Finame.toLowerCase());
		System.out.println(Fitype.toLowerCase());
		int Fikeys = instrument5.getNumberofKeysorStrings();
		double Fiprice = instrument5.getprices();

		System.out.println(Fikeys);
		System.out.println(Fiprice);
		
		String astring = Finame.toLowerCase();
		char[] ary = astring.toCharArray();
		String atype = Fitype.toLowerCase();
		char[] typeray  = atype.toCharArray();
		
		int akey = Fikeys;
		int keyray = akey;
		
		double aprice = Fiprice;
		double priceray = aprice;
		

		
		
		
		
		


		
		// verify this constructor sets all attributes correctly
		
		MusicalInstrument instrument6 = new MusicalInstrument("Oboe", "Woodwind", 12, 79.99);
		String Siname = instrument6.getName();
		String Sitype = instrument6.getType();
		System.out.println(Siname.toLowerCase());
		System.out.println(Sitype.toLowerCase());
		int Sikeys = instrument6.getNumberofKeysorStrings();
		double Siprice = instrument6.getprices();
		System.out.println(Sikeys);
		System.out.println(Siprice);
		
		
		
		// verify this constructor sets all attributes correctly
		
		MusicalInstrument instrument7 = new MusicalInstrument("tuba", "Brass", 3, 189.99);
		String sevname = instrument7.getName();
		String sevtype = instrument7.getType();
		System.out.println(sevname.toLowerCase());
		System.out.println(sevtype.toLowerCase());
		int sevkeys = instrument7.getNumberofKeysorStrings();
		double sevprice = instrument7.getprices();
		System.out.println(sevkeys);
		System.out.println(sevprice);
		
		// verify this constructor sets all attributes correctly
		
		MusicalInstrument instrument8 = new MusicalInstrument("trianGle", "percussion", 0, 49.99);
		String einame = instrument8.getName();
		String eitype = instrument8.getType();
		System.out.println(einame.toLowerCase());
		System.out.println(eitype.toLowerCase());
		int eikeys = instrument8.getNumberofKeysorStrings();
		double eiprice = instrument8.getprices();
		System.out.println(eikeys);
		System.out.println(eiprice);
		
		System.out.println(" ");
	
		
		ArrayList<MusicalInstrument>mia = new ArrayList<MusicalInstrument>();	
		
		int fewest = Integer.MAX_VALUE;{
			MusicalInstrument mi1 = new MusicalInstrument("guitar", "string", 6, 49.00);
			MusicalInstrument mi2 = new MusicalInstrument ("piano", "keys", 26, 100.00);
			MusicalInstrument mi3 = new MusicalInstrument ("flute", "woodwind", 0, 20.00);
			MusicalInstrument mi4 = new MusicalInstrument ("drums", "percussion", 0, 50.00);
			MusicalInstrument mi5 = new MusicalInstrument ("tuba", "brass", 0, 75.00);
			MusicalInstrument mi6 = new MusicalInstrument ("flute", "woodwind", 0, 20.00);
			MusicalInstrument mi7 = new MusicalInstrument ("flute", "brass", 0, 20.00);
			MusicalInstrument mi8 = new MusicalInstrument ("flute", "woodwind", 0, 101.00);
			MusicalInstrument mi9 = new MusicalInstrument ("flute", "woodwind", 0, 20.00);
			MusicalInstrument mi10 = new MusicalInstrument ("flute", "woodwind", 0, 20.00);
			mia.add(mi1);
			mia.add(mi2);
			mia.add(mi3);
			mia.add(mi4);
			mia.add(mi5);
			mia.add(mi6);
			mia.add(mi7);
			mia.add(mi8);
			mia.add(mi9);
			mia.add(mi10);
			
			System.out.println(mia.size());
			//System.out.println(retrievedmia);
			
			//mia[0] = mi1;
			//mia[1] = mi2;
			//mia[2] = mi3;
			//mia[3] = mi4;
			//mia[4] = mi5;
			//mia[5] = mi6;
		//	mia[6] = mi7;
		//	mia[7] = mi8;
		//	mia[8] = mi9;
		//	mia[9] = mi10;

			
			MusicalInstrument retrievedmia = mia.get(4);
			for (MusicalInstrument mi : mia) {
				String nama = mi.getName();
				String typea = mi.getType();
				int Keysa = mi.getNumberofKeysorStrings();
				double pricea = mi.getprices();
				System.out.println(nama);
				System.out.println(typea);
				System.out.println(Keysa);
				System.out.println(pricea);
				System.out.println(" ");
			}
			for (MusicalInstrument mi : mia) {
				int keysorstrings = mi.getNumberofKeysorStrings();
				if (keysorstrings < fewest);
				fewest = keysorstrings;
			}
			System.out.println("the fewest number of keys or strings is " + fewest);
			System.out.println(" ");

		System.out.println("instruments with type brass");
		for (MusicalInstrument I : mia) {
			String GetMIT = I.getType();
			if (GetMIT.equals("brass")){
				System.out.println(I.getName());
				System.out.println(GetMIT);
				System.out.println(I.getNumberofKeysorStrings());
				System.out.println(I.getprices());
				System.out.println(" ");
			}
		}
		
		double highest = 0;
		for (MusicalInstrument price : mia) {
			double GetMIP = price.getprices();
			if (GetMIP > highest){
				highest = GetMIP;
				}
		}
		
		System.out.println("Instrument with the highest price");
		for (MusicalInstrument pricecheck : mia) {
			double chkr = pricecheck.getprices();
			if (chkr == highest) {
				System.out.println(pricecheck.getName());
				System.out.println(pricecheck.getType());
				System.out.println(pricecheck.getNumberofKeysorStrings());
				System.out.println(pricecheck.getprices());
				System.out.println(" ");
			}
		}

		ArrayList<MusicalInstrument> mia2 = new ArrayList<MusicalInstrument>();

		

		for (MusicalInstrument TCHKR : mia) {
			String typechk = TCHKR.getType();
			if (typechk.contains("brass")) {
				String N1 = TCHKR.getName();
				int KOS = TCHKR.getNumberofKeysorStrings();
				double PRI = TCHKR.getprices();
				MusicalInstrument X = new MusicalInstrument(N1,  typechk, KOS, PRI);
				mia2.add(X);
				
				
			}
		}
		System.out.println(mia2);
	
		
		
		
		// verify this constructor sets all attributes correctly
		
		// for objects instrument5-8, determine the most expensive
		
		// for objects instrument5-8, determine which are woodwind instruments
		
		// for objects instrument5-8, determine which have keys or strings > 6
	//	MusicalInstrument Next = new MusicalInstrument();
	//	Next.setType("WoodWind");
	//	String nameN = Next.getType();
	//	System.out.println(nameN);

	
	}}}


