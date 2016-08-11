package com.zookeeper;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the zoo!");
		Zoo zooStory = new Zoo();
		zooStory.startStory();
	}
	
	BoaConstrictors boa1 = new BoaConstrictors("Harold", 13, "male", "white and yellow speckled", true, true, true, "tropical Americas", true, false, true, 0, 0, false);
	BoaConstrictors boa2 = new BoaConstrictors("Jenny", 5, "female", "yellow and brown speckled", true, true, true, "tropical Americas", true, false, true, 0, 5, false);
	GiantTortoises tort1 = new GiantTortoises("Speedy", 95, "female", "green and tan", true, true, false, "arid desert", false, true, true, 4, 3, false);
	GiantTortoises tort2 = new GiantTortoises("Half pint", 132, "male", "green", true, true, false, "arid desert", false, true, true, 4, 0, false);
	GiantTortoises tort3 = new GiantTortoises("Jingles", 12, "male", "tan", false, false, false, "arid desert", false, true, true, 4, 0, false);
	SnappingTurtles turt1 = new SnappingTurtles("Lazy", 6, "male", "green and black", false, true, true, "la ocean", false, true, false, 4, 0, false);
	SnappingTurtles turt2 = new SnappingTurtles("Mary", 13, "female", "black with a little bit of green", true, true, true, "das ocean", false, true, false, 4, 50, false);
	Cobras cobr1 = new Cobras("Sneaky", 1, "male", "yellow", false, true, true, "all the deserts", true, false, true, 0, 0, true);
	Cobras cobr2 = new Cobras("Medusa", 5, "female", "black and yellow", true, true, true, "in your soul", true, false, true, 0, 8, true);
	Chimpanzees chimp1 = new Chimpanzees("Bobo", 4, "female", "brown", true, true, true, "forest", 1, true, true, false, "groups");
	Chimpanzees chimp2 = new Chimpanzees("Cornelius", 8, "male", "brown", true, true, true, "forest", 0, true, true, false, "groups");
	Chimpanzees chimp3 = new Chimpanzees("George", 1, "male", "brown", false, true, true, "forest", 0, true, true, false, "groups");
	Chimpanzees chimp4 = new Chimpanzees("Howard", 3, "male", "brown", true, true, true, "forest", 0, true, true, false, "groups");
	Chimpanzees chimp5 = new Chimpanzees("Beth", 1, "female", "brown", false, true, true, "forest", 1, true, true, false, "groups");
	Chimpanzees chimp6 = new Chimpanzees("Vafa", 6, "male", "brown", true, true, true, "forest", 0, true, true, false, "groups");
	Orangutans orang1 = new Orangutans("Chief", 21, "male", "orange", true, true, true, "forests", 0, false, true, false, "solitary");
	Orangutans orang2 = new Orangutans("Ami", 3, "female", "orange", false, true, true, "forest", 1, false, true, false, "solitary");
	SpiderMonkeys spid1 = new SpiderMonkeys("Crazy", 1, "male", "black and white", false, true, false, "rainforest", 0, true, false, true, "group living");
	SpiderMonkeys spid2 = new SpiderMonkeys("Kavita", 4, "female", "black and white", true, true, false, "rainforest", 2, true, false, true, "group living");
	SpiderMonkeys spid3 = new SpiderMonkeys("Terry", 11, "female", "black and white", true, true, false, "rainforest", 2, true, false, true, "group living");
	SpiderMonkeys spid4 = new SpiderMonkeys("Becca", 3, "female", "black and white", false, true, false, "rainforest", 2, true, false, true, "group living");
	SpiderMonkeys spid5 = new SpiderMonkeys("Chris", 13, "male", "black and white", true, true, false, "rainforest", 0, true, false, true, "group living");
	LionTailedMacaques mac1 = new LionTailedMacaques("Joe", 12, "male", "brown", true, true, false, "forest", 0, true, false, true, "group living");
	LionTailedMacaques mac2 = new LionTailedMacaques("Missy", 12, "female", "brown", true, true, false, "forest", 2, true, false, true, "group living");
	LionTailedMacaques mac3 = new LionTailedMacaques("Megan", 2, "female", "brown", false, true, false, "forest", 2, true, false, true, "group living");
	LionTailedMacaques mac4 = new LionTailedMacaques("Caleb", 12, "male", "brown", true, true, false, "forest", 0, true, false, true, "group living");
	LionTailedMacaques mac5 = new LionTailedMacaques("Harrison", 1, "male", "brown", false, true, false, "forest", 0, true, false, true, "group living");
	Fangtooth fang1 = new Fangtooth("Handsome", 2, "male", "red and black", true, true, true, "deep in the ocean", 0, 4, true, true);
	Fangtooth fang2 = new Fangtooth("Beautiful", 1, "female", "red and black", false, true, true, "deep in the ocean", 500, 4, true, true);
	Fangtooth fang3 = new Fangtooth("Cutey pie", 1, "female", "red and black", false, true, true, "deep in the ocean", 500, 4, true, true);
	Fangtooth fang4 = new Fangtooth("Ugly", 4, "male", "red and black", true, true, true, "deep in the ocean", 0, 4, true, true);
	Fangtooth fang5 = new Fangtooth("Best in Show", 8, "female", "red and black", true, true, true, "deep in the ocean", 0, 4, true, true);
	FantailGuppy fantail1 = new FantailGuppy("Charlie", 3, "male", "orange, blue, black", true, true, true, "tropical waters", 0, 4, true, true);
	FantailGuppy fantail2 = new FantailGuppy("Betsy", 13, "female", "orange, blue, black", true, true, true, "tropical waters", 400, 4, true, true);
	FantailGuppy fantail3 = new FantailGuppy("Dory", 1, "female", "orange, blue, black", false, true, true, "tropical waters", 400, 4, true, true);
	FantailGuppy fantail4 = new FantailGuppy("Marlin", 8, "male", "orange, blue, black", true, true, true, "tropical waters", 0, 4, true, true);		
	BettaFish betta1 = new BettaFish("Dolores", 1, "female", "red", false, true, true, "tropical waters", 300, 4, true, true);
	BettaFish betta2 = new BettaFish("Daniel", 7, "male", "red", true, true, true, "tropical waters", 0, 4, true, true);
	BlowFish blow1 = new BlowFish("Cuddly", 11, "male", "black and white", true, true, true, "cold waters", 0, 3, true, true);
	BlowFish blow2 = new BlowFish("Josephine", 6, "female", "black and white", true, true, true, "cold waters", 550, 3, true, true);
	BlowFish blow3 = new BlowFish("Forrest", 3, "male", "black and white", false, true, true, "cold waters", 0, 3, true, true);
	BlowFish blow4 = new BlowFish("Donald", 1, "male", "black and white", false, true, true, "cold waters", 0, 3, true, true);
	Ocelots oce1 = new Ocelots("Joey", 4, "male", "spotted black and gold", false, true, true, "savannah", 4, true, true, 0, false, true);
	Leopards leop1 = new Leopards("Lenny", 2, "male", "spotted black and gold", false, true, true, "grasslands", 4, true, true, 0, false, false);
	Leopards leop2 = new Leopards("Cecilia", 7, "female", "spotted black and gold", true, true, true, "grasslands", 4, true, true, 1, false, false);
	SnowLeopards snow1 = new SnowLeopards("Fluffy", 6, "female", "spotted black and silver", true, true, true, "cold mountain", 4, true, true, 2, true, true);
	SnowLeopards snow2 = new SnowLeopards("Jeffrey", 5, "male", "spotted black and silver", true, true, true, "cold mountain", 4, true, true, 0, true, true);
	SnowLeopards snow3 = new SnowLeopards("Jamal", 1, "male", "spotted black and silver", false, true, true, "cold mountain", 4, true, true, 0, true, true);
	BengalTigers beng1 = new BengalTigers("Jimothy", 8, "male", "orange and black", true, true, true, "savannah", 4, true, true, 0, true, false);
	BengalTigers beng2 = new BengalTigers("Pamela", 2, "female", "orange and black", false, true, true, "savannah", 4, true, true, 2, true, false);
	
	ArrayList<Animal> myZoo = new ArrayList<>();
	private String[] zooStory = new String[20];
	private int intro = 0;
	private int optionCats = 1;
	private int optionFish = 2;
	private int optionPrimates = 3;
	private int optionRepAmp = 4;
	private int optionTigers = 5;
	Scanner zo = new Scanner(System.in);
	
	public Zoo () {
		
		zooStory[intro] = "You are at the entrance\n"
				+ "Which type of animals would you like to see?\n"
				+ "Choose from the options below:\n"
				+ "'C' to go to the cat house\n"
				+ "'F' to go see the fishies\n"
				+ "'P' to go see the primates\n"
				+ "'R' to go to the reptiles and amphibian house\n"
				+ "(type 'x' at any time to return to the beginning)";
		zooStory[optionCats] = "You are in the Cat house\n"
				+ "There are many kinds of cats here\n"
				+ "Which kind of cat would you like to see?\n"
				+ "'T' to see the bengal tigers\n"
				+ "'S' to see the snow leopards\n"
				+ "'L' to see the leopards\n"
				+ "'O' to see the ocelots\n"
				+ "Or press 'x' to return";
		zooStory[optionFish] = "You are in the aquarium\n"
				+ "There are lots of fishies here\n"
				+ "Which fishy would you like to see?\n"
				+ "'B' to see the blow fish\n"
				+ "'T' to see the betta fish\n"
				+ "'F' to see the fangtooth\n"
				+ "'G' to see the fantail guppy\n"
				+ "Or press 'x' to return";
		zooStory[optionPrimates] = "You are where the primates live\n"
				+ "There are a few different kinds of primates here\n"
				+ "Which primate would you like to see?\n"
				+ "'C' to see the chimpanzees\n"
				+ "'M' to see the lion tailed macaques\n"
				+ "'S' to see the spider monkeys\n"
				+ "'O' to see the orangutans\n"
				+ "Or press 'x' to return";
		zooStory[optionRepAmp] = "You are at reptile and amphibian house\n"
				+ "You can see many different reptiles and amphibians\n"
				+ "Which one would you like to see?\n"
				+ "'B' to see the boa constrictors\n"
				+ "'C' to see the cobras\n"
				+ "'G' to see the giant tortoises\n"
				+ "'S' to see the snapping turtles\n"
				+ "Or press 'x' to return";
		zooStory[optionTigers] = myZoo.toString();
	}
		public void startStory() {	
			boolean dontRestart = true;
			myZoo.add(beng1); // 0
			myZoo.add(beng2); // 1
			myZoo.add(snow1); // 2
			myZoo.add(snow2); // 3
			myZoo.add(snow3); // 4
			myZoo.add(leop1); // 5
			myZoo.add(leop2); // 6
			myZoo.add(oce1); // 7
			myZoo.add(blow1); // 8
			myZoo.add(blow2); // 9
			myZoo.add(blow3); // 10
			myZoo.add(blow4); // 11
			myZoo.add(betta1); // 12
			myZoo.add(betta2); // 13
			myZoo.add(fang1); // 14
			myZoo.add(fang2); // 15
			myZoo.add(fang3); // 16
			myZoo.add(fang4); // 17
			myZoo.add(fang5); // 18
			myZoo.add(fantail1); // 19
			myZoo.add(fantail2); // 20
			myZoo.add(fantail3); // 21
			myZoo.add(fantail4); // 22
			myZoo.add(chimp1); // 23
			myZoo.add(chimp2); // 24
			myZoo.add(chimp3); // 25
			myZoo.add(chimp4); // 26
			myZoo.add(chimp5); // 27
			myZoo.add(chimp6); // 28
			myZoo.add(mac1); // 29
			myZoo.add(mac2); // 30
			myZoo.add(mac3);  // 31
			myZoo.add(mac4); // 32
			myZoo.add(mac5); // 33
			myZoo.add(spid1); // 34
			myZoo.add(spid2); // 35
			myZoo.add(spid3); // 36
			myZoo.add(spid4); // 37
			myZoo.add(spid5); // 38
			myZoo.add(orang1); // 39
			myZoo.add(orang2); // 40
			myZoo.add(boa1); // 41
			myZoo.add(boa2); // 42
			myZoo.add(cobr1); // 43
			myZoo.add(cobr2); // 44
			myZoo.add(tort1); // 45
			myZoo.add(tort2); // 46
			myZoo.add(tort3); // 47
			myZoo.add(turt1); // 48
			myZoo.add(turt2); // 49
			
			while (dontRestart) {
				System.out.println(zooStory[0]);
				String firstStep = zo.nextLine();
				dontRestart = !firstStep.equalsIgnoreCase("x");
				if (dontRestart) {
					switch (firstStep) {
						case "C": optionCats();
							break;
						case "F": optionFish();
							break;
						case "P": optionPrimates();
							break;
						case "R": optionRepAmp();
					}
				}
			}
		}
		public void optionCats() {
			boolean dontRestart = true;
			while (dontRestart) {
				System.out.println(zooStory[1]);
				String nextStep = zo.nextLine();
				dontRestart = !nextStep.equalsIgnoreCase("x");
				if (dontRestart) {
					switch (nextStep) {
						case "T": optionTigers();
							break;
						case "S": optionSnowLeopards();
							break;
						case "L": optionLeopards();
							break;
						case "O": optionOcelots();
					}
				}	
			}			
		}
		private void optionOcelots() {
			boolean dontRestart = true;
			while (dontRestart) {
				System.out.println(myZoo.get(7));
				System.out.println("Hit enter to return to the cat house");
				String nextStep = zo.nextLine();
				dontRestart = !nextStep.equalsIgnoreCase("x");
				if (dontRestart) {
					optionCats();
				}
			}				
		}
		private void optionLeopards() {
			boolean dontRestart = true;
			while (dontRestart) {
				System.out.println(myZoo.get(5));
				System.out.println(myZoo.get(6));
				System.out.println("Hit enter to return to the cat house");
				String nextStep = zo.nextLine();
				dontRestart = !nextStep.equalsIgnoreCase("x");
				if (dontRestart) {
					optionCats();
				}
			}				
		}
		private void optionSnowLeopards() {
			boolean dontRestart = true;
			while (dontRestart) {
				System.out.println(myZoo.get(2));
				System.out.println(myZoo.get(3));
				System.out.println(myZoo.get(4));
				System.out.println("Hit enter to return to the cat house");
				String nextStep = zo.nextLine();
				dontRestart = !nextStep.equalsIgnoreCase("x");
				if (dontRestart) {
					optionCats();
				}
			}			
		}
		private void optionTigers() {
			boolean dontRestart = true;
			while (dontRestart) {
				System.out.println(myZoo.get(0));
				System.out.println(myZoo.get(1));
				System.out.println("Hit enter to return to the cat house");
				String nextStep = zo.nextLine();
				dontRestart = !nextStep.equalsIgnoreCase("x");
				if (dontRestart) {
					optionCats();
				}
			}
		}
		public void optionFish() {
			boolean dontRestart = true;
			while (dontRestart) {
				System.out.println(zooStory[2]);
				String nextStep = zo.nextLine();
				dontRestart = !nextStep.equalsIgnoreCase("x");
				if (dontRestart) {
					switch (nextStep) {
						case "B": optionBlowFish();
							break;
						case "T": optionBettaFish();
							break;
						case "F": optionFangtooth();
							break;
						case "G": optionFantail();
					}
				}	
			}
		}
		private void optionBlowFish() {
			boolean dontRestart = true;
			while (dontRestart) {
				System.out.println(myZoo.get(8));
				System.out.println(myZoo.get(9));
				System.out.println(myZoo.get(10));
				System.out.println(myZoo.get(11));
				System.out.println("Hit enter to return to the aquarium");
				String nextStep = zo.nextLine();
				dontRestart = !nextStep.equalsIgnoreCase("x");
				if (dontRestart) {
					optionFish();
				}
			}			
		}
		private void optionBettaFish() {
			boolean dontRestart = true;
			while (dontRestart) {
				System.out.println(myZoo.get(12));
				System.out.println(myZoo.get(13));
				System.out.println("Hit enter to return to the aquarium");
				String nextStep = zo.nextLine();
				dontRestart = !nextStep.equalsIgnoreCase("x");
				if (dontRestart) {
					optionFish();
				}
			}				
		}
		private void optionFangtooth() {
			boolean dontRestart = true;
			while (dontRestart) {
				System.out.println(myZoo.get(14));
				System.out.println(myZoo.get(15));
				System.out.println(myZoo.get(16));
				System.out.println(myZoo.get(17));
				System.out.println(myZoo.get(18));
				System.out.println("Hit enter to return to the aquarium");
				String nextStep = zo.nextLine();
				dontRestart = !nextStep.equalsIgnoreCase("x");
				if (dontRestart) {
					optionFish();
				}
			}				
		}
		private void optionFantail() {
			boolean dontRestart = true;
			while (dontRestart) {
				System.out.println(myZoo.get(19));
				System.out.println(myZoo.get(20));
				System.out.println(myZoo.get(21));
				System.out.println(myZoo.get(22));
				System.out.println("Hit enter to return to the aquarium");
				String nextStep = zo.nextLine();
				dontRestart = !nextStep.equalsIgnoreCase("x");
				if (dontRestart) {
					optionFish();
				}
			}				
		}
		public void optionPrimates() {
			boolean dontRestart = true;
			while (dontRestart) {
				System.out.println(zooStory[3]);
				String nextStep = zo.nextLine();
				dontRestart = !nextStep.equalsIgnoreCase("x");
				if (dontRestart) {
					switch (nextStep) {
						case "C": optionChimpanzees();
							break;
						case "M": optionMacaques();
							break;
						case "S": optionSpiderMonkeys();
							break;
						case "O": optionOrangutan();
					}
				}	
			}
		}
		private void optionChimpanzees() {
			boolean dontRestart = true;
			while (dontRestart) {
				System.out.println(myZoo.get(23));
				System.out.println(myZoo.get(24));
				System.out.println(myZoo.get(25));
				System.out.println(myZoo.get(26));
				System.out.println(myZoo.get(27));
				System.out.println(myZoo.get(28));
				System.out.println("Hit enter to return to see all the primates");
				String nextStep = zo.nextLine();
				dontRestart = !nextStep.equalsIgnoreCase("x");
				if (dontRestart) {
					optionPrimates();
				}
			}			
		}
		private void optionMacaques() {
			boolean dontRestart = true;
			while (dontRestart) {
				System.out.println(myZoo.get(29));
				System.out.println(myZoo.get(30));
				System.out.println(myZoo.get(31));
				System.out.println(myZoo.get(32));
				System.out.println(myZoo.get(33));
				System.out.println("Hit enter to return to see all the primates");
				String nextStep = zo.nextLine();
				dontRestart = !nextStep.equalsIgnoreCase("x");
				if (dontRestart) {
					optionPrimates();
				}
			}						
		}
		private void optionSpiderMonkeys() {
			boolean dontRestart = true;
			while (dontRestart) {
				System.out.println(myZoo.get(34));
				System.out.println(myZoo.get(35));
				System.out.println(myZoo.get(36));
				System.out.println(myZoo.get(37));
				System.out.println(myZoo.get(38));
				System.out.println("Hit enter to return to see all the primates");
				String nextStep = zo.nextLine();
				dontRestart = !nextStep.equalsIgnoreCase("x");
				if (dontRestart) {
					optionPrimates();
				}
			}						
		}
		private void optionOrangutan() {
			boolean dontRestart = true;
			while (dontRestart) {
				System.out.println(myZoo.get(39));
				System.out.println(myZoo.get(40));
				System.out.println("Hit enter to return to see all the primates");
				String nextStep = zo.nextLine();
				dontRestart = !nextStep.equalsIgnoreCase("x");
				if (dontRestart) {
					optionPrimates();
				}
			}						
		}
		public void optionRepAmp() {
			boolean dontRestart = true;
			while (dontRestart) {
				System.out.println(zooStory[4]);
				String nextStep = zo.nextLine();
				dontRestart = !nextStep.equalsIgnoreCase("x");
				if (dontRestart) {
					switch (nextStep) {
						case "B": optionBoaConstrictors();
							break;
						case "C": optionCobras();
							break;
						case "G": optionGiantTortoises();
							break;
						case "S": optionSnappingTurtles();
					}
				}	
			}
		}
		private void optionBoaConstrictors() {
			boolean dontRestart = true;
			while (dontRestart) {
				System.out.println(myZoo.get(41));
				System.out.println(myZoo.get(42));
				System.out.println("Hit enter to return to the reptile house");
				String nextStep = zo.nextLine();
				dontRestart = !nextStep.equalsIgnoreCase("r");
				if (dontRestart) {
					optionRepAmp();
				}
			}				
		}
		private void optionCobras() {
			boolean dontRestart = true;
			while (dontRestart) {
				System.out.println(myZoo.get(43));
				System.out.println(myZoo.get(44));
				System.out.println("Hit enter to return to the reptile house");
				String nextStep = zo.nextLine();
				dontRestart = !nextStep.equalsIgnoreCase("x");
				if (dontRestart) {
					optionRepAmp();
				}
			}			
		}
		private void optionGiantTortoises() {
			boolean dontRestart = true;
			while (dontRestart) {
				System.out.println(myZoo.get(45));
				System.out.println(myZoo.get(46));
				System.out.println(myZoo.get(47));
				System.out.println("Hit enter to return to the reptile house");
				String nextStep = zo.nextLine();
				dontRestart = !nextStep.equalsIgnoreCase("x");
				if (dontRestart) {
					optionRepAmp();
				}
			}			
		}
		private void optionSnappingTurtles() {
			boolean dontRestart = true;
			while (dontRestart) {
				System.out.println(myZoo.get(48));
				System.out.println(myZoo.get(49));
				System.out.println("Hit enter to return to the reptile house");
				String nextStep = zo.nextLine();
				dontRestart = !nextStep.equalsIgnoreCase("x");
				if (dontRestart) {
					optionRepAmp();
				}
			}			
		}
		
}
