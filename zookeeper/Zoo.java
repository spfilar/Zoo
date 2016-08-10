package com.zookeeper;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {

	public static void main(String[] args) {
		
		ArrayList<BoaConstrictors> boaConstrictors = new ArrayList<>();
		BoaConstrictors boa1 = new BoaConstrictors("Harold", 13, "male", "white and yellow speckled", true, true, true, "tropical Americas", true, false, true, 0, 0, false);
		BoaConstrictors boa2 = new BoaConstrictors("Jenny", 5, "female", "yellow and brown speckled", true, true, true, "tropical Americas", true, false, true, 0, 5, false);
		boaConstrictors.add(boa1);
		boaConstrictors.add(boa2);
		
		ArrayList<GiantTortoises> giantTortoises = new ArrayList<>();
		GiantTortoises tort1 = new GiantTortoises("Speedy", 95, "female", "green and tan", true, true, false, "arid desert", false, true, true, 4, 3, false);
		GiantTortoises tort2 = new GiantTortoises("Half pint", 132, "male", "green", true, true, false, "arid desert", false, true, true, 4, 0, false);
		GiantTortoises tort3 = new GiantTortoises("Jingles", 12, "male", "tan", false, false, false, "arid desert", false, true, true, 4, 0, false);
		giantTortoises.add(tort1);
		giantTortoises.add(tort2);
		giantTortoises.add(tort3);
		
		ArrayList<SnappingTurtles> snappingTurtles = new ArrayList<>();
		SnappingTurtles turt1 = new SnappingTurtles("Lazy", 6, "male", "green and black", false, true, true, "la ocean", false, true, false, 4, 0, false);
		SnappingTurtles turt2 = new SnappingTurtles("Mary", 13, "female", "black with a little bit of green", true, true, true, "das ocean", false, true, false, 4, 50, false);
		snappingTurtles.add(turt1);
		snappingTurtles.add(turt2);
		
		ArrayList<Cobras> cobras = new ArrayList<>();
		Cobras cobr1 = new Cobras("Sneaky", 1, "male", "yellow", false, true, true, "all the deserts", true, false, true, 0, 0, true);
		Cobras cobr2 = new Cobras("Medusa", 5, "female", "black and yellow", true, true, true, "in your soul", true, false, true, 0, 8, true);
		cobras.add(cobr1);
		cobras.add(cobr2);
		
		ArrayList<Chimpanzees> chimpanzees = new ArrayList<>();
		Chimpanzees chimp1 = new Chimpanzees("Bobo", 4, "female", "brown", true, true, true, "forest", 1, true, true, false, "groups");
		Chimpanzees chimp2 = new Chimpanzees("Cornelius", 8, "male", "brown", true, true, true, "forest", 0, true, true, false, "groups");
		Chimpanzees chimp3 = new Chimpanzees("George", 1, "male", "brown", false, true, true, "forest", 0, true, true, false, "groups");
		Chimpanzees chimp4 = new Chimpanzees("Howard", 3, "male", "brown", true, true, true, "forest", 0, true, true, false, "groups");
		Chimpanzees chimp5 = new Chimpanzees("Beth", 1, "female", "brown", false, true, true, "forest", 1, true, true, false, "groups");
		Chimpanzees chimp6 = new Chimpanzees("Vafa", 6, "male", "brown", true, true, true, "forest", 0, true, true, false, "groups");
		chimpanzees.add(chimp1);
		chimpanzees.add(chimp2);
		chimpanzees.add(chimp3);
		chimpanzees.add(chimp4);
		chimpanzees.add(chimp5);
		chimpanzees.add(chimp6);
		
		ArrayList<Orangutans> orangutans = new ArrayList<>();
		Orangutans orang1 = new Orangutans("Chief", 21, "male", "orange", true, true, true, "forests", 0, false, true, false, "solitary");
		Orangutans orang2 = new Orangutans("Ami", 3, "female", "orange", false, true, true, "forest", 1, false, true, false, "solitary");
		orangutans.add(orang1);
		orangutans.add(orang2);
		
		ArrayList<SpiderMonkeys> spiderMonkeys = new ArrayList<>();
		SpiderMonkeys spid1 = new SpiderMonkeys("Crazy", 1, "male", "black and white", false, true, false, "rainforest", 0, true, false, true, "group living");
		SpiderMonkeys spid2 = new SpiderMonkeys("Kavita", 4, "female", "black and white", true, true, false, "rainforest", 2, true, false, true, "group living");
		SpiderMonkeys spid3 = new SpiderMonkeys("Terry", 11, "female", "black and white", true, true, false, "rainforest", 2, true, false, true, "group living");
		SpiderMonkeys spid4 = new SpiderMonkeys("Becca", 3, "female", "black and white", false, true, false, "rainforest", 2, true, false, true, "group living");
		SpiderMonkeys spid5 = new SpiderMonkeys("Chris", 13, "male", "black and white", true, true, false, "rainforest", 0, true, false, true, "group living");
		spiderMonkeys.add(spid1);
		spiderMonkeys.add(spid2);
		spiderMonkeys.add(spid3);
		spiderMonkeys.add(spid4);
		spiderMonkeys.add(spid5);
		
		ArrayList<LionTailedMacaques> lionTailedMacaques = new ArrayList<>();
		LionTailedMacaques mac1 = new LionTailedMacaques("Joe", 12, "male", "brown", true, true, false, "forest", 0, true, false, true, "group living");
		LionTailedMacaques mac2 = new LionTailedMacaques("Missy", 12, "female", "brown", true, true, false, "forest", 2, true, false, true, "group living");
		LionTailedMacaques mac3 = new LionTailedMacaques("Megan", 2, "female", "brown", false, true, false, "forest", 2, true, false, true, "group living");
		LionTailedMacaques mac4 = new LionTailedMacaques("Caleb", 12, "male", "brown", true, true, false, "forest", 0, true, false, true, "group living");
		LionTailedMacaques mac5 = new LionTailedMacaques("Harrison", 1, "male", "brown", false, true, false, "forest", 0, true, false, true, "group living");
		lionTailedMacaques.add(mac1);
		lionTailedMacaques.add(mac2);
		lionTailedMacaques.add(mac3);
		lionTailedMacaques.add(mac4);
		lionTailedMacaques.add(mac5);
		
		ArrayList<Fangtooth> fangtooth = new ArrayList<>();
		Fangtooth fang1 = new Fangtooth("Handsome", 2, "male", "red and black", true, true, true, "deep in the ocean", 0, 4, true, true);
		Fangtooth fang2 = new Fangtooth("Beautiful", 1, "female", "red and black", false, true, true, "deep in the ocean", 500, 4, true, true);
		Fangtooth fang3 = new Fangtooth("Cutey pie", 1, "female", "red and black", false, true, true, "deep in the ocean", 500, 4, true, true);
		Fangtooth fang4 = new Fangtooth("Ugly", 4, "male", "red and black", true, true, true, "deep in the ocean", 0, 4, true, true);
		Fangtooth fang5 = new Fangtooth("Best in Show", 8, "female", "red and black", true, true, true, "deep in the ocean", 0, 4, true, true);
		fangtooth.add(fang1);
		fangtooth.add(fang2);
		fangtooth.add(fang3);
		fangtooth.add(fang4);
		fangtooth.add(fang5);
		
		ArrayList<FantailGuppy> fantailGuppy = new ArrayList<>();
		FantailGuppy fantail1 = new FantailGuppy("Charlie", 3, "male", "orange, blue, black", true, true, true, "tropical waters", 0, 4, true, true);
		FantailGuppy fantail2 = new FantailGuppy("Betsy", 13, "female", "orange, blue, black", true, true, true, "tropical waters", 400, 4, true, true);
		FantailGuppy fantail3 = new FantailGuppy("Dory", 1, "female", "orange, blue, black", false, true, true, "tropical waters", 400, 4, true, true);
		FantailGuppy fantail4 = new FantailGuppy("Marlin", 8, "male", "orange, blue, black", true, true, true, "tropical waters", 0, 4, true, true);		
		fantailGuppy.add(fantail1);
		fantailGuppy.add(fantail2);
		fantailGuppy.add(fantail3);
		fantailGuppy.add(fantail4);
		
		ArrayList<BettaFish> bettaFish = new ArrayList<>();
		BettaFish betta1 = new BettaFish("Dolores", 1, "female", "red", false, true, true, "tropical waters", 300, 4, true, true);
		BettaFish betta2 = new BettaFish("Daniel", 7, "male", "red", true, true, true, "tropical waters", 0, 4, true, true);
		bettaFish.add(betta1);
		bettaFish.add(betta2);
		
		ArrayList<BlowFish> blowFish = new ArrayList<>();
		BlowFish blow1 = new BlowFish("Cuddly", 11, "male", "black and white", true, true, true, "cold waters", 0, 3, true, true);
		BlowFish blow2 = new BlowFish("Josephine", 6, "female", "black and white", true, true, true, "cold waters", 550, 3, true, true);
		BlowFish blow3 = new BlowFish("Forrest", 3, "male", "black and white", false, true, true, "cold waters", 0, 3, true, true);
		BlowFish blow4 = new BlowFish("Donald", 1, "male", "black and white", false, true, true, "cold waters", 0, 3, true, true);
		blowFish.add(blow1);
		blowFish.add(blow2);
		blowFish.add(blow3);
		blowFish.add(blow4);
		
		ArrayList<Ocelots> ocelots = new ArrayList<>();
		Ocelots oce1 = new Ocelots("Joey", 4, "male", "spotted black and gold", false, true, true, "savannah", 4, true, true, 0, false, true);
		ocelots.add(oce1);
		
		ArrayList<Leopards> leopards = new ArrayList<>();
		Leopards leop1 = new Leopards("Lenny", 2, "male", "spotted black and gold", false, true, true, "grasslands", 4, true, true, 0, false, false);
		Leopards leop2 = new Leopards("Cecilia", 7, "female", "spotted black and gold", true, true, true, "grasslands", 4, true, true, 1, false, false);
		leopards.add(leop1);
		leopards.add(leop2);
		
		ArrayList<SnowLeopards> snowLeopards = new ArrayList<>();
		SnowLeopards snow1 = new SnowLeopards("Fluffy", 6, "female", "spotted black and silver", true, true, true, "cold mountain", 4, true, true, 2, true, true);
		SnowLeopards snow2 = new SnowLeopards("Jeffrey", 5, "male", "spotted black and silver", true, true, true, "cold mountain", 4, true, true, 0, true, true);
		SnowLeopards snow3 = new SnowLeopards("Jamal", 1, "male", "spotted black and silver", false, true, true, "cold mountain", 4, true, true, 0, true, true);
		snowLeopards.add(snow1);
		snowLeopards.add(snow2);
		snowLeopards.add(snow3);
		
		ArrayList<BengalTigers> bengalTigers = new ArrayList<>();
		BengalTigers beng1 = new BengalTigers("Jimothy", 8, "male", "orange and black", true, true, true, "savannah", 4, true, true, 0, true, false);
		BengalTigers beng2 = new BengalTigers("Pamela", 2, "female", "orange and black", false, true, true, "savannah", 4, true, true, 2, true, false);
		bengalTigers.add(beng1);
		bengalTigers.add(beng2);
		
		System.out.println(boaConstrictors.get(0));
		System.out.println(boaConstrictors.get(1));
		System.out.println(giantTortoises.get(0));
		System.out.println(giantTortoises.get(1));
		System.out.println(giantTortoises.get(2));
		System.out.println(snappingTurtles.get(0));
		System.out.println(snappingTurtles.get(1));
		System.out.println(cobras.get(0));
		System.out.println(cobras.get(1));
//		System.out.println(boaConstrictors.get(1));
//		System.out.println(boaConstrictors.get(1));
//		System.out.println(boaConstrictors.get(1));
//		System.out.println(boaConstrictors.get(1));
//		System.out.println(boaConstrictors.get(1));
//		System.out.println(boaConstrictors.get(1));
//		System.out.println(boaConstrictors.get(1));
//		System.out.println(boaConstrictors.get(1));
//		System.out.println(boaConstrictors.get(1));
//		System.out.println(boaConstrictors.get(1));
//		System.out.println(boaConstrictors.get(1));
//		System.out.println(boaConstrictors.get(1));
//		System.out.println(boaConstrictors.get(1));
//		System.out.println(boaConstrictors.get(1));
//		
	}
	
//	private String[] zooStory = new String[20];
//	private int intro = 0;
//	private int optionCats = 1;
//	private int optionFish = 2;
//	private int optionPrimates = 3;
//	private int optionRepAmp = 4;
//	Scanner zo = new Scanner(System.in);
//	
//	public Zoo () {
//		
//		zooStory[intro] = "Welcome to a very small and sad zoo!"
//				+ "Which animals would you like to see?"
//				+ "Choose from the options below:"
//				+ "'C' to see the Cats"
//				+ "'F' to see the Fish"
//				+ "'P' to see the Primates"
//				+ "'R' to see the Reptiles and Amphibians"
//				+ "(type 'r' at any time to return to the beginning)";
//		zooStory[optionCats] = null;
//		zooStory[optionFish] = null;
//		zooStory[optionPrimates] = null;
//		zooStory[optionRepAmp] = null;
//		
//		
//	}
//		public void startStory()
//		{	
//			boolean dontRestart = true;
//			while (dontRestart)
//			{
//				System.out.println(zooStory[0]);
//				String firstStep = zo.nextLine();
//				dontRestart = !firstStep.equalsIgnoreCase("r");
//				if (dontRestart)
//				{
//					switch (firstStep)
//					{
//						case "C": optionCats();
//							break;
//						case "F": optionFish();
//							break;
//						case "P": optionPrimates();
//							break;
//						case "R": optionRepAmp();
//					}
//				}
//			}
//		}
		
}
