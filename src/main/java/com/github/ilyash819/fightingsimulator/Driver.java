package com.github.ilyash819.fightingsimulator;

//Phoebe P and Illia S 5/21/2025
//On our honor, we have not given nor received unauthorized help on this assignment.
import java.util.*;
public class Driver{
   private static Scanner input = new Scanner(System.in);
   private static ArrayList<Fighter> species = new ArrayList<Fighter>();
   private static ArrayList<Fighter> redTeam, blueTeam;
   public static void main(String[] bob) throws InterruptedException{
      boolean continueRun = true;
      initializeSpecies();
      Simulation sim;
      while(continueRun){
         int i, j;
         System.out.println("Select a species to represent the Red Team:");
         for(i = 0; i < species.size(); i++){
            System.out.print((i + 1) + ") " + species.get(i).getName() + "\t\t");
            if(i % 4 == 3){
               System.out.println();
            }
         }
         System.out.println((i + 1) + ") " + "CREATE NEW");
         int redTeamInt = input.nextInt();
         while(!(redTeamInt > 0 && redTeamInt < species.size() + 2)){
            System.out.println("Invalid number. Try again.\n\nSelect a species to represent the Red Team:");
            for(j = 0; j < species.size(); j++){
               System.out.print((j + 1) + ") " + species.get(j).getName() + "\t\t");
               if(j % 4 == 3){
                  System.out.println();
               }
            }
            System.out.println((j + 1) + ") " + "CREATE NEW");
            redTeamInt = input.nextInt();
         }
         String redTeamSpecies;
         if(redTeamInt == species.size() + 1){
            createSpecies();
         }
         redTeamSpecies = species.get(redTeamInt - 1).getName();
         System.out.println(species.get(redTeamInt-1));
         
         System.out.println("Select a species to represent the Blue Team:");
         for(i = 0; i < species.size(); i++){
            System.out.print((i+1) + ") " + species.get(i).getName() + "\t\t");
            if(i % 4 == 3){
               System.out.println();
            }
         }
         System.out.println((i+1) + ") " + "CREATE NEW");
         int blueTeamInt = input.nextInt();
         while(!(blueTeamInt>0 && blueTeamInt<species.size()+2)){
            System.out.println("Invalid number. Try again.\n\nSelect a species to represent the Blue Team:");
            for( j = 0; j < species.size(); j++){
               System.out.print((j+1) + ") " + species.get(j).getName() + "\t\t");
               if(j%4==3){
                  System.out.println();
               }
            }
            System.out.println((j + 1) + ") " + "CREATE NEW");
            blueTeamInt = input.nextInt();
         }
         String blueTeamSpecies;
         if(blueTeamInt == species.size() + 1)
         {
            createSpecies();
         }
         blueTeamSpecies = species.get(blueTeamInt - 1).getName();
         System.out.println(species.get(blueTeamInt-1));
         System.out.println("How many " + redTeamSpecies + "S would you like have on the Red Team?");
         int numRed = input.nextInt();
         while(numRed <= 0)
         {
            System.out.println("Invalid quantity: Quantity must be greater than 0\nHow many " + redTeamSpecies + "S would you like have on the Red Team?");
            numRed = input.nextInt();
         }
         System.out.println("How many " + blueTeamSpecies + "S would you like have on the Red Team?");
         int numBlue = input.nextInt();
         while(numBlue <= 0)
         {
            System.out.println("Invalid quantity: Quantity must be greater than 0\nHow many " + blueTeamSpecies + "S would you like have on the Red Team?");
            numBlue = input.nextInt();
         }
         
         redTeam = new ArrayList<Fighter>();
         blueTeam = new ArrayList<Fighter>();
         
         for(int x = 0; x < numRed; x++){
            redTeam.add(new Fighter(species.get(redTeamInt - 1).getName(), species.get(redTeamInt - 1).getHealth(), species.get(redTeamInt - 1).getArmorClass(), species.get(redTeamInt - 1).getSizeMinimum(), species.get(redTeamInt - 1).getSizeMaximum(), species.get(redTeamInt-1).getWeapon()));
         }//initializes Red Team members
         for(int x = 0; x < numBlue; x++){
            blueTeam.add(new Fighter(species.get(blueTeamInt - 1).getName(), species.get(blueTeamInt - 1).getHealth(), species.get(blueTeamInt - 1).getArmorClass(), species.get(blueTeamInt - 1).getSizeMinimum(), species.get(blueTeamInt - 1).getSizeMaximum(), species.get(blueTeamInt-1).getWeapon()));
         }//initializes Blue Team members

         sim = rollInitiative();
         
         int turn = 1;
         while(redTeam.size() > 0 && blueTeam.size() > 0)
         {
            Thread.sleep(1500);
            System.out.println("**************************\nROUND " + turn + "\n**************************");
            sim.simulateTurn();
            turn++;
         }
         Thread.sleep(3000);
         if(redTeam.size()==0){
            System.out.println("The " + blueTeam.get(0).getName() + "S have won!");
         } else {
            System.out.println("The " + redTeam.get(0).getName() + "S have won!");
         }
         System.out.println("Would you like to go again?\n1) YES\t2) NO");          //should happen at the end of the simulation
         input.nextLine();
         String again = input.nextLine();
         while(!(again.equals("1") || again.equals("2"))){
            System.out.println("Invalid choice. Try again.");
            System.out.println("Would you like to go again?\n1) YES\t2) NO");
            again = input.nextLine();
         }
         if(again.equals("2"))
         {
            continueRun = false;
         }
         else
         {
            while(redTeam.size() > 0)
            {
               redTeam.remove(0);
            }
            while(blueTeam.size() > 0)
            {
               blueTeam.remove(0);
            }
         }
      }
   }//end main
   public static void initializeSpecies(){
      species.add(new Fighter("HUMAN", 100L, 10, 160, 185, new Weapon("UNARMED STRIKE", 20L, -1)));
      species.add(new Fighter("GORILLA", 1000L, 12, 145, 155, new Weapon("UNARMED STRIKE", 150L, -1)));
      species.add(new Fighter("PIG", 120L, 10, 70, 100, new Weapon("UNARMED STRIKE", 30L, -1)));
      species.add(new Fighter("RABID DOG", 80L, 10, 100, 120, new Weapon("UNARMED STRIKE", 40L, -1)));
      species.add(new Fighter("BEE", 3L, 14, 1, 3, new Weapon("STING", 10L, -1)));
      species.add(new Fighter("ANT", 2L, 8, 1, 3, new Weapon("UNARMED STRIKE", 1L, -1)));
      species.add(new Fighter("STITCH", 100L, 13, 160, 162, new Weapon("UNARMED STRIKE", 50L, -1)));
      species.add(new Fighter("ALLIGATOR", 600L, 12, 300, 460, new Weapon("UNARMED STRIKE", 90L, -1)));
      species.add(new Fighter("HATSUNE MIKU", 100, 15, 155, 160, new Weapon("MIKU MIKU BEAAAAAAAM", 5000L, -1)));
      species.add(new Fighter("GIANT BEE", 81000000000000L, 14, 30000, 100000, new Weapon("STING", 40000L, -1)));       //had to make the bees smaller because the numbers were really big
      species.add(new Fighter("TRAIN", 100000L, 12, 30000, 50000, new Weapon("I HAVE NO IDEA HOW TRAINS CAN ATTACK SOMEONE", 2000L, -1)));
      species.add(new Fighter("GOKU", 100000L, 17, 160, 162, new Weapon("UNARMED STRIKE", 5000L, -1)));
      species.add(new Fighter("HATSUNE BEEKU", 100, 15, 155, 160, new Weapon("BEEKU BEEKU BEEEEEEEEEEM", 6000L, -1)));
   }

   public static void createSpecies(){
      System.out.println("What is the name of this species?");
      input.nextLine();
      String name = input.nextLine();
      long hp = 0L;
      while(hp<1L){
         System.out.println("What is the hit point average for this species?");
         hp = input.nextLong();
         if(hp>0L) break;
         System.out.println("Hit point average must be above 0. Try again.");
      }
      int ac = 0;
      while(ac<1 || ac>20){
         System.out.println("What is this species' armor class?");
         ac = input.nextInt();
         if(ac>0 && ac<21) break;
         System.out.println("Armor class must be between 1 and 20. Try again.");
      }
      long damage = 0L;
      while(damage<1L){
         System.out.println("How many hitpoints of damage can this species do unarmed?");
         damage = input.nextLong();
         if(damage>0L) break;
         System.out.println("Damage must be above 0. Try again.");
      }
      int minSize = 0;
      while(minSize<1){
         System.out.println("What is the minimum size of this species in Zolofts?");
         minSize = input.nextInt();
         if(minSize>0) break;
         System.out.println("Minimum size must be above 0. Try again.");
      }
      int maxSize = 0;
      while(maxSize<minSize){
         System.out.println("What is the maximum size of this species in Zolofts?");
         int maxSize = input.nextInt();
         if(maxSize>=minSize) break;
         System.out.println("Maximum size cannot be below minimum size. Try again.");
      }
      
      species.add(new Fighter(name.toUpperCase(), hp, ac, minSize, maxSize, new Weapon("UNARMED STRIKE", damage, -1)));
   }
   

   public static Simulation rollInitiative() throws InterruptedException{           //rolls initiative and sets up simulation depending on who is going first
      int redRoll = (int)(Math.random()*20)+1;
      int blueRoll = (int)(Math.random()*20)+1;
      Thread.sleep(1500);
      System.out.println("Red team rolls " + redRoll + " on initiative");
      Thread.sleep(1500);
      System.out.println("Blue team rolls " + blueRoll + " on initiative");
      while(redRoll==blueRoll){
         System.out.println("Same initiative, rolling again");
         redRoll = (int)(Math.random()*20)+1;
         blueRoll = (int)(Math.random()*20)+1;
         Thread.sleep(1500);
         System.out.println("Red team rolls " + redRoll + " on initiative");
         Thread.sleep(1500);
         System.out.println("Blue team rolls " + blueRoll + " on initiative");
      }
      Thread.sleep(1500);
      if(redRoll>blueRoll){
         System.out.println("Red team goes first!\n");
         return new Simulation(redTeam, blueTeam);
      } else {
         System.out.println("Blue team goes first!\n");
         return new Simulation(blueTeam, redTeam);
      }
   }
}//end class
