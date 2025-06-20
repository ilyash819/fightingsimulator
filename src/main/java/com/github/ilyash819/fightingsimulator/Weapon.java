package com.github.ilyash819.fightingsimulator;

//Phoebe P and Illia S 5/21/2025
//On our honor, we have not given nor received unauthorized help on this assignment.
import java.util.*;
public class Weapon
{
   private String name;    //name in all caps
   private long damage;
   private int durability;
   public Weapon(String n, long d, int dur){
      name = n;
      damage = d;
      durability = dur;    //-1 durability means it won't run out of durability
   }
   public String getName(){
      return name;
   }
   public long getDamage(){
      return damage;
   }
   public int getDurability(){
      return durability;
   }
   public long dealDamage(Fighter f)
   {
      int roll1 = (int)(Math.random() * 20) + 1;      //rolls d20
      long roll2 = 0L;
      if(roll1 >= f.getArmorClass()){                 //if roll1 exceeds the fighter's armor class, deal a certain amount of damage determined by roll2
         roll2 = (long)(Math.random() * damage) + 1L;
      }
      if(durability > 0)
      {
         durability--;
      }
      return roll2;
   }
   public String toString(){
      return "**************************\n" + name + "\n**************************\nDurability: " + durability + "\nCan deal up to " + damage + " damage\n**************************";
   }
}
