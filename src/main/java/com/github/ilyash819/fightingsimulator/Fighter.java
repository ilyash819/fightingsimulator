package com.github.ilyash819.fightingsimulator;

//Phoebe P and Illia S 5/21/2025
//On our honor, we have not given nor received unauthorized help on this assignment.
import java.util.*;
public class Fighter
{
   private String name;       //name in all caps
   private int armorClass;    //between 1 and 20
   private long health;
   private Weapon defaultWeapon;
   private Weapon weapon;
   private int size;
   private int sizeMinimum;
   private int sizeMaximum;
   public Fighter(String n, long hp, int ac, int sizeMin, int sizeMax, Weapon def){
      name = n;
      health = hp;
      armorClass = ac;
      defaultWeapon = def;
      weapon = def;
      size = (int)(Math.random() * (sizeMax - sizeMin + 1) + sizeMin);
      sizeMinimum = sizeMin;
      sizeMaximum = sizeMax;
   }
   public String getName(){ //the superior way to do brackets
      return name;
   }
   public Weapon getWeapon(){
      return weapon;
   }
   public Weapon getDefaultWeapon(){
      return defaultWeapon;
   }
   public int getArmorClass(){
      return armorClass;
   }
   public long getHealth(){
      return health;
   }
   
   public long attack(Fighter f){
      return weapon.dealDamage(f);
   }
   
   public boolean changeWeapon(Weapon w){ //changes weapon only if the new weapon does more damage
      if(weapon.getDamage() < w.getDamage())
      {
         weapon = w;
         return true;
      } else {
         return false;
      }
   }
   
   public void checkDurability(){
      if(weapon.getDurability() == 0) {
         weapon = defaultWeapon;        //if the weapon's durability runs out, the character switches to unarmed strike
      }
   }
   
   public void damage(long d)
   {
      if(health >= d)
      {
         health -= d;
      }
      else
      {
         health = 0;
      }
   }
   
   public int getSize()
   {
      return size;
   }
   
   public String toString()
   {
      
      return "**************************\n" + name + "\n**************************\nHealth: " + health + "\nArmor class: " + armorClass + "\nWeapon wielded: " + weapon.getName() + "\nHeight: " + size + " Zolofts (" + (size/100.0) + " meters, " + ((size/100.0)*3.28084) + " feet)\n" + "**************************";
   }
   
   public int getSizeMinimum()
   {
      return sizeMinimum;
   }
   
   public int getSizeMaximum()
   {
      return sizeMaximum;
   }
   
}
