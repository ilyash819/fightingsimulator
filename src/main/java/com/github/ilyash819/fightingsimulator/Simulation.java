package com.github.ilyash819.fightingsimulator;

//Phoebe P and Illia S 5/21/2025
//On our honor, we have not given nor received unauthorized help on this assignment.
import java.util.*;
public class Simulation{
   private ArrayList<Fighter> team1, team2;
   private int team1init, team2init;            //initial sizes
   public Simulation(ArrayList<Fighter> f, ArrayList<Fighter> s){
      team1 = f;
      team2 = s;
      team1init = f.size();
      team2init = s.size();
   }
   public void simulateTurn() throws InterruptedException{
      long totalDamage = 0;
      int numEliminations = 0;
      int numHits = 0;
      String team1Name = team1.get(0).getName();
      String team2Name = team2.get(0).getName();
      String team1Plural = "";
      String team2Plural = "";
      if(team1.size()!=1){
         team1Plural = "S";
      } else {
         team1Plural += " (on " + team1.get(0).getHealth() + " health)";
      }
      if(team2.size()!=1){
         team2Plural = "S";
      } else {
         team2Plural += " (on " + team2.get(0).getHealth() + " health)";
      }
      System.out.println(team1.size() + "/" + team1init + " " + team1Name + team1Plural + " vs " + team2.size() + "/" + team2init + " " + team2Name + team2Plural + "\n");
      double roll = Math.random();
      Thread.sleep(2000);
      if(roll > 0.1) {
         if (team1.size() > 0) {
            System.out.println("The " + team1Name + team1Plural + " decided to attack!");
            System.out.println(team1Name + team1Plural + " used " + team1.get(0).getWeapon().getName());
            for (int i = 0; i < team1.size(); i++) {
               long damageDealt = team1.get(i).attack(team2.get(0));
               totalDamage += damageDealt;
               if (damageDealt != 0) {
                  numHits++;
               }
            }
            System.out.print("The first team hit " + numHits + " times and dealt " + totalDamage + " total damage, eliminating ");
            while (totalDamage > 0 && team2.size() > 0) {
               if (totalDamage > team2.get(0).getHealth()) {
                  totalDamage -= team2.get(0).getHealth();
                  team2.remove(0);
                  numEliminations++;
               } else {
                  team2.get(0).damage(totalDamage);
                  totalDamage = 0;
               }
            }
            System.out.println(numEliminations + " " + team2Name + "S!");
            if(team1.size()>0) {
               if (team1.get(0).getWeapon().getDurability() == 0) {
                  System.out.println("The first team's " + team1.get(0).getWeapon().getName() + " is no longer usable.");
                  for (int i = 0; i < team1.size(); i++) {
                     team1.get(i).checkDurability();
                  }
               }
            }
            System.out.println();
         }
      } else {
         if(team1.size()>0) {
            scavenge(team1);
         }
      }
      numHits = 0;
      numEliminations = 0;
      roll = Math.random();
      if(team2.size()!=1){
         team2Plural = "S";
      } else {
         team2Plural = "";
      }
      Thread.sleep(2000);
      if(roll>0.1) {
         if (team2.size() > 0) {
            System.out.println("The " + team2Name + team2Plural + " decided to attack!");
            System.out.println(team2Name + team2Plural + " used " + team2.get(0).getWeapon().getName());
            for (int i = 0; i < team2.size(); i++) {
               long damageDealt = team2.get(i).attack(team1.get(0));
               totalDamage += damageDealt;
               if (damageDealt != 0) {
                  numHits++;
               }
            }
            System.out.print("The second team hit " + numHits + " times and dealt " + totalDamage + " total damage, eliminating ");
            while (totalDamage > 0 && team1.size() > 0) {
               if (totalDamage > team1.get(0).getHealth()) {
                  totalDamage -= team1.get(0).getHealth();
                  team1.remove(0);
                  numEliminations++;
               } else {
                  team1.get(0).damage(totalDamage);
                  totalDamage = 0;
               }
            }
            System.out.println(numEliminations + " " + team1Name + "S!");
            if(team2.size()>0) {
               if (team2.get(0).getWeapon().getDurability() == 0) {
                  System.out.println("The second team's " + team2.get(0).getWeapon().getName() + " is no longer usable.");
                  for (int i = 0; i < team2.size(); i++) {
                     team2.get(i).checkDurability();
                  }
               }
            }
            System.out.println();
         }
      } else {
         if(team2.size()>0){
            scavenge(team2);
         }
      }
      if(team1.size()!=1){
         team1Plural = "S";
      }
      if(team2.size()!=1){
         team2Plural = "S";
      }
      Thread.sleep(2000);
      System.out.print(team1.size() + "/" + team1init + " " + team1Name + team1Plural + " vs " + team2.size() + "/" + team2init + " " + team2Name + team2Plural + "\n");
   }
   
   public void scavenge(ArrayList<Fighter> team){
      String teamName = team.get(0).getName();
      String teamPlural = "";
      if(team.size()!=1){
         teamPlural = "S";
      }
      System.out.println("The " + teamName + teamPlural + " decided to scavenge!");
      double roll = Math.random();
      if(roll>0.4) {
         System.out.println("The " + teamName + teamPlural + " found nothing of note.");
      } else if(roll>0.2) {
         if(team.get(0).changeWeapon(new Weapon("SPEAR", 45L, 15))){
            System.out.println("The " + teamName + teamPlural + " found " + (new Weapon("SPEAR", 45L, 15)).getName() +  "! This will turn the tide.");
            for(int i = 0; i < team.size(); i++){
               team.get(i).changeWeapon(new Weapon("SPEAR", 45L, 15));
            }
            System.out.println(team.get(0).getWeapon());
         } else {
            System.out.println("The " + teamName + teamPlural + " found " + (new Weapon("SPEAR", 45L, 15)).getName() +  " but decided not to keep it.");
         }
      } else if(roll>0.1) {
         if(team.get(0).changeWeapon(new Weapon("WOODEN SWORD", 35L, 20))){
            System.out.println("The " + teamName + teamPlural + " found " + (new Weapon("WOODEN SWORD", 35L, 20)).getName() +  "! This will turn the tide.");
            for(int i = 0; i < team.size(); i++){
               team.get(i).changeWeapon(new Weapon("WOODEN SWORD", 35L, 20));
            }
            System.out.println(team.get(0).getWeapon());
         } else {
            System.out.println("The " + teamName + teamPlural + " found " + (new Weapon("WOODEN SWORD", 35L, 20)).getName() +  " but decided not to keep it.");
         }
      } else if(roll>0.05) {
         if(team.get(0).changeWeapon(new Weapon("IRON SWORD", 60L, 30))){
            System.out.println("The " + teamName + teamPlural + " found " + (new Weapon("IRON SWORD", 60L, 30)).getName() +  "! This will turn the tide.");
            for(int i = 0; i < team.size(); i++){
               team.get(i).changeWeapon(new Weapon("IRON SWORD", 60L, 30));
            }
            System.out.println(team.get(0).getWeapon());
         } else {
            System.out.println("The " + teamName + teamPlural + " found " + (new Weapon("IRON SWORD", 60L, 30)).getName() +  " but decided not to keep it.");
         }
      } else if(roll>0.02) {
         if(team.get(0).changeWeapon(new Weapon("DIAMOND SWORD", 90L, 40))){
            System.out.println("The " + teamName + teamPlural + " found " + (new Weapon("DIAMOND SWORD", 90L, 40)).getName() +  "! This will turn the tide.");
            for(int i = 0; i < team.size(); i++){
               team.get(i).changeWeapon(new Weapon("DIAMOND SWORD", 90L, 40));
            }
            System.out.println(team.get(0).getWeapon());
         } else {
            System.out.println("The " + teamName + teamPlural + " found " + (new Weapon("DIAMOND SWORD", 90L, 40)).getName() +  " but decided not to keep it.");
         }
      } else if(roll>0.01) {
         if(team.get(0).changeWeapon(new Weapon("MACE", 120L, 50))){
            System.out.println("The " + teamName + teamPlural + " found " + (new Weapon("MACE", 120L, 50)).getName() +  "! This will turn the tide.");
            for(int i = 0; i < team.size(); i++){
               team.get(i).changeWeapon(new Weapon("MACE", 120L, 50));
            }
            System.out.println(team.get(0).getWeapon());
         } else {
            System.out.println("The " + teamName + teamPlural + " found " + (new Weapon("MACE", 120L, 50)).getName() +  " but decided not to keep it.");
         }
      } else if(roll>0.005) {
         if(team.get(0).changeWeapon(new Weapon("STICK OF DYNAMITE", 1000L, 1))){
            System.out.println("The " + teamName + teamPlural + " found " + (new Weapon("STICK OF DYNAMITE", 1000L, 1)).getName() +  "! This will turn the tide.");
            for(int i = 0; i < team.size(); i++){
               team.get(i).changeWeapon(new Weapon("STICK OF DYNAMITE", 1000L, 1));
            }
            System.out.println(team.get(0).getWeapon());
         } else {
            System.out.println("The " + teamName + teamPlural + " found " + (new Weapon("STICK OF DYNAMITE", 1000L, 1)).getName() +  " but decided not to keep it.");
         }
      } else if(roll>0.003) {
         if(team.get(0).changeWeapon(new Weapon("HOLY HAND GRENADE", 3000L, 1))){
            System.out.println("The " + teamName + teamPlural + " found " + (new Weapon("HOLY HAND GRENADE", 3000L, 1)).getName() +  "! This will turn the tide.");
            for(int i = 0; i < team.size(); i++){
               team.get(i).changeWeapon(new Weapon("HOLY HAND GRENADE", 3000L, 1));
            }
            System.out.println(team.get(0).getWeapon());
         } else {
            System.out.println("The " + teamName + teamPlural + " found " + (new Weapon("HOLY HAND GRENADE", 3000L, 1)).getName() +  " but decided not to keep it.");
         }
      } else {
         if(team.get(0).changeWeapon(new Weapon("NUKE", 100000L, 1))){
            System.out.println("The " + teamName + teamPlural + " found " + (new Weapon("NUKE", 100000L, 1)).getName() +  "! This will turn the tide.");
            for(int i = 0; i < team.size(); i++){
               team.get(i).changeWeapon(new Weapon("NUKE", 100000L, 1));
            }
            System.out.println(team.get(0).getWeapon());
         } else {
            System.out.println("The " + teamName + teamPlural + " found " + (new Weapon("NUKE", 100000L, 1)).getName() +  " but decided not to keep it.");
         }
      }
      System.out.println();
   }
}//end class
