import java.io.*;
import java.util.*;

public class ScattergoriesGenerator {
	final static String[] categories1 = {"4-letter words", "a boy's name", "a girl's name", "acronyms", "album titles", "animals", "appliances", "apps", "articles of clothing", "athletes", "authors", "awards/ceremonies", "bad habits", "beers", "birds", "board games", "bodies of water", "body parts", "book titles", "breakfast foods", "capitals", "car parts", "card games", "cars", "cartoon characters", "celebrities", "cereals", "chain stores", "children's books", "coastal cities", "college majors", "colleges/universities", "colours", "companies", "computer parts", "computer programs", "cooking terms", "cooking utensils", "cosmetics/toiletries", "countries", "crimes", "dairy products", "desserts", "diet foods", "diseases", "electronic gadgets", "ethnic foods", "excuses for being late", "fads", "famous duos and trios", "famous females", "famous sayings", "famous singers", "fictional characters", "fish", "flowers", "food/drink that is green", "foods that kids hate", "foods you eat on holidays", "foods you eat raw", "footwear", "foreign cities", "foreign words used in english", "fruits", "funny movies", "furniture", "game terms", "gender neutral first names", "gifts/presents", "halloween costumes", "heroes", "historic events", "historical figures", "hobbies", "holiday activities", "holidays", "honeymoon spots", "hot places", "household chores", "ice cream flavours", "insects", "internet lingo", "items in a catalog", "items in a kitchen", "items in a refrigerator", "items in a suitcase", "items in a vending machine", "items in an office", "items in this room", "items in your purse/wallet", "items you take on a trip", "junk food", "kinds of candy", "kinds of dances", "kinds of soup", "languages", "leisure activities", "loud things", "machines", "magazines", "magical objects", "math terms", "medicine/drugs", "menu items", "movie titles", "musical groups", "musical instruments", "names used in songs", "names used in the bible", "nicknames", "notorious people", "obsolete items", "occupations", "parks", "parts of the body", "people in uniform", "personality traits", "physics terms", "pizza toppings", "places in europe", "places to hang out", "presidents", "pro sports teams", "product names", "reasons to call 911", "reasons to make a phone call", "reasons to quit your job", "reasons to take out a loan", "reptiles/amphibians", "restaurants", "sandwiches", "school subjects", "school supplies", "science things", "seafood", "software", "something you keep hidden", "something you're afraid of", "song titles", "spices/herbs", "spicy foods", "sports", "sports equipment", "sports played indoors", "stones/gems", "store names", "tech companies", "television stars", "terms of measurement", "things at a carnival", "things at a circus", "things at a football game", "things at a gas station", "things at a wedding", "things at an amusement park", "things found at a bar", "things found in a gym/health club", "things found in a hospital", "things found in new york", "things found on a map", "things in a coffee bar", "things in a grocery store", "things in a hotel", "things in a medicine cabinet", "things in a park", "things in a pet store", "things in a sci-fi movie", "things in a souvenir shop", "things in an airport", "things in an arcade", "things in fairy tales", "things in las vegas", "things in outer space", "things in pairs or sets", "things in the backyard", "things in the ocean", "things in the sky", "things in the wild west", "things made of metal", "things on a beach", "things people are allergic to", "things people gossip about", "things people use to decorate their house", "things that are black", "things that are bright", "things that are cold", "things that are round", "things that are soft", "things that are sticky", "things that can get you fired", "things that can kill you", "things that fly", "things that go well with chocolate", "things that grow", "things that have buttons", "things that have numbers", "things that have spots", "things that have stripes", "things that have wheels", "things that jump/bounce", "things that kids play with", "things that make you smile", "things that need to be cleaned", "things that smell bad", "things that take less than five minutes", "things that use a remote", "things that weigh less than one pound", "things that you fold", "things that you wear", "things to do at a party", "things to do on a date", "things to do on a rainy day", "things with claws", "things with tails", "things with windows", "things worn above the waist", "things you buy for kids", "things you can do with your feet", "things you can tie in a knot", "things you can't buy on amazon", "things you do at work", "things you do every day", "things you don't want in the house", "things you eat with a spoon", "things you get in the mail", "things you get tickets for", "things you make", "things you mix up", "things you plug in", "things you replace", "things you save up to buy", "things you shouldn't touch", "things you shout", "things you sit in/on", "things you store items in", "things you throw away", "titles people can have", "tools", "tourist attractions", "toys", "trees", "tropical locations", "tv shows", "types of drinks", "types of weather", "underground things", "us cities", "vacation spots", "vegetables", "vehicles", "video games", "villains/monsters", "ways to get from here to there", "ways to kill time", "weapons", "websites", "weekend activities", "wireless things", "words associated with exercise", "words associated with money", "words associated with winter", "words ending in -ly", "words ending in -n", "words to describe food", "words with double letters", "words with four different vowels", "words with four syllables", "world leaders/politicians"};
	final static String[] categories2 = {
			"a boy's name", "us cities", "things that are cold", "school supplies", "pro sports teams", "insects", "breakfast foods", "furniture", "TV shows", "things found in the ocean", "presidents", "product names",
			"vegetables", "states", "things you throw away", "occupations", "appliances", "cartoon characters", "types of drink", "musical groups", "store names", "things at a football game", "trees", "personality traits",
			"articles of clothing", "desserts", "car parts", "things found on a map", "athletes", "4-letter words", "items in a refrigerator", "farm animals", "street names", "things at the beach", "colours", "tools",
			"sports", "song titles", "parts of the body", "ethnic foods", "things you shout", "birds", "a girl's name", "ways to get there from here", "items in a kitchen", "villains/monsters", "flowers", "things you replace",
			"sandwiches", "items in a catalog", "world leaders/politicians", "school subjects", "excuses for being late", "ice cream flavours", "things that jump/bounce", "television stars", "things in a park", "foreign cities", "stones/gems", "musical instruments",
			"things that are sticky", "awards/ceremonies", "cars", "spices/herbs", "bad habits", "cosmetics/toiletries", "celebrities", "cooking utensils", "reptiles/amphibians", "parks", "leisure activities", "things you are allergic to",
			"fictional characters", "menu items", "magazines", "capitals", "kinds of candy", "items you save up to buy", "footwear", "something you keep hidden", "items in a suitcase", "things with tails", "sports equipment", "crimes",
			"nicknames", "things in the sky", "pizza toppings", "colleges/universities", "fish", "countries", "things that have spots", "historical figures", "something you're afraid of", "terms of measurement", "items in this room", "book titles",
			"restaurants", "notorious people", "fruits", "things in the medicine cabinet", "toys", "household chores", "bodies of water", "authors", "halloween costumes", "weapons", "things that are round", "words associated with exercise",
			"heroes", "gifts/presents", "terms of endearment", "kinds of dances", "things that are black", "vehicles", "tropical locations", "college majors", "dairy products", "things in a souvenir shop", "items in a purse/wallet", "world records",
			"baby foods", "famous duos and trios", "things found in a desk", "vacation spots", "diseases", "words associated with money", "items in a vending machine", "movie titles", "games", "things that you wear", "beverages", "things at a circus",
			"famous females", "medicine", "things made of metal", "hobbies", "people in uniform", "things you plug in", "animals", "languages", "names", "junk food", "things that grow", "companies",
	};
	
	private static String ans = "";
	private static int points = 0;
	private static int failed = 0;
	private static double secondsToAnswer = 0;
	private static boolean succeeded = true;
	
	public void runRound(BufferedReader in) throws IOException {
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				if(ans.equals("")) {
					System.out.println("out of time. press enter to continue.");
					failed++;
					succeeded = false;
					return;
				}
			}
		}, (int)(secondsToAnswer*1000));
		
		ans = in.readLine();
		timer.cancel();
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		String[] categories;
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String pick = "pick a list of categories:\ntype 1 to use categories from really.boring.website\ntype 2 to use categories from allegedly the official scattergories (I found the list online)";
		System.out.println(pick);
		String pickInp = in.readLine();
		while(!pickInp.equals("1") && !pickInp.equals("2")) {
			System.out.println("try again. "+pick);
			pickInp = in.readLine();
		}
		
		if(pickInp.equals("1")) {
			categories = categories1;
		} else {
			categories = categories2;
		}
		
		String timePick = "enter your desired time limit (in seconds)";
		System.out.println(timePick);
		pickInp = in.readLine();
		while(!isNumeric(pickInp)) {
			System.out.println("try again. "+timePick);
			pickInp = in.readLine();
		}
		
		secondsToAnswer = Double.parseDouble(pickInp);
		
		
		printLine();
		System.out.println("instructions: type your answer and press enter before time runs out.");
		System.out.println("press enter to continue");
		in.readLine();
		printLine();
		System.out.println("training is starting. press enter to begin or type \"QUIT\" to quit at any time.");
		String inp = in.readLine();
		printLine();
		
		while(!inp.equals("QUIT")){
			String category = categories[(int)(Math.round(Math.random()*(categories.length-1)))];
			char letter = (char)(int)(Math.floor(Math.random()*26)+65);
			System.out.println("current points: "+points);
			System.out.println("current failures: "+failed);
			System.out.println("category: "+category);
			System.out.println("letter: "+letter);
			
			try {
				(new ScattergoriesGenerator()).runRound(in);
				if(succeeded) points++;
			} catch(Exception e) {
				System.out.println(e);
			}
			
			inp = ans;
			ans = "";
			succeeded = true;
			printLine();
		}
		
		System.out.println("thanks for training!");
	}
	
	public static void printLine() {
		System.out.println("-----");
	}
	
	public static boolean isNumeric(String line) {
		try {
			Double.parseDouble(line);
			return true;
		} catch(Exception e) {
			return false;
		}
	}
}
