# Fighting Simulator

---
# Overview

This fighting simulator, whose official name is still in the works, was made as a final project for a high school AP Computer Science A class by me and a classmate.

This console-based simulator allows the user to select a fighter out of 13 preset fighters, or create a custom fighter type with custom stats, for each of the two teams. Then, the user gets to watch the two species battle in a randomized fight to the death.

As the fight progresses, the program outputs each of the rounds one by one into the console (the delays are there intentionally). It takes inspiration from Dungeons and Dragons, in that it's turn-based combat, and that every single action, from deciding who goes first, to how much damage one of the teams does per round, to what weapons they find while scavenging, is randomized.

Below is an example of the program's execution.

<details>

```shell
Select a species to represent the Red Team:
1) HUMAN                2) GORILLA              3) PIG          4) RABID DOG            
5) BEE          6) ANT          7) STITCH               8) ALLIGATOR            
9) HATSUNE MIKU         10) GIANT BEE           11) TRAIN               12) GOKU                
13) HATSUNE BEEKU               14) CREATE NEW
1
**************************
HUMAN
**************************
Health: 100
Armor class: 10
Weapon wielded: UNARMED STRIKE
Height: 168 Zolofts (1.68 meters, 5.5118111999999995 feet)
**************************
Select a species to represent the Blue Team:
1) HUMAN                2) GORILLA              3) PIG          4) RABID DOG            
5) BEE          6) ANT          7) STITCH               8) ALLIGATOR            
9) HATSUNE MIKU         10) GIANT BEE           11) TRAIN               12) GOKU                
13) HATSUNE BEEKU               14) CREATE NEW
2
**************************
GORILLA
**************************
Health: 1000
Armor class: 12
Weapon wielded: UNARMED STRIKE
Height: 155 Zolofts (1.55 meters, 5.085302 feet)
**************************
How many HUMANS would you like have on the Red Team?
10 
How many GORILLAS would you like have on the Red Team?
1
Red team rolls 2 on initiative
Blue team rolls 14 on initiative
Blue team goes first!

**************************
ROUND 1
**************************
1/1 GORILLA (on 1000 health) vs 10/10 HUMANS

The GORILLA decided to scavenge!
The GORILLA found DIAMOND SWORD but decided not to keep it.

The HUMANS decided to attack!
HUMANS used UNARMED STRIKE
The second team hit 6 times and dealt 55 total damage, eliminating 0 GORILLAS!

1/1 GORILLA (on 1000 health) vs 10/10 HUMANS
**************************
ROUND 2
**************************
1/1 GORILLA (on 945 health) vs 10/10 HUMANS

The GORILLA (on 945 health) decided to attack!
GORILLA (on 945 health) used UNARMED STRIKE
The first team hit 0 times and dealt 0 total damage, eliminating 0 HUMANS!

The HUMANS decided to attack!
HUMANS used UNARMED STRIKE
The second team hit 4 times and dealt 56 total damage, eliminating 0 GORILLAS!

1/1 GORILLA (on 945 health) vs 10/10 HUMANS
**************************
ROUND 3
**************************
1/1 GORILLA (on 889 health) vs 10/10 HUMANS

The GORILLA (on 889 health) decided to attack!
GORILLA (on 889 health) used UNARMED STRIKE
The first team hit 0 times and dealt 0 total damage, eliminating 0 HUMANS!

The HUMANS decided to attack!
HUMANS used UNARMED STRIKE
The second team hit 3 times and dealt 43 total damage, eliminating 0 GORILLAS!

1/1 GORILLA (on 889 health) vs 10/10 HUMANS
**************************
ROUND 4
**************************
1/1 GORILLA (on 846 health) vs 10/10 HUMANS

The GORILLA (on 846 health) decided to attack!
GORILLA (on 846 health) used UNARMED STRIKE
The first team hit 0 times and dealt 0 total damage, eliminating 0 HUMANS!

The HUMANS decided to attack!
HUMANS used UNARMED STRIKE
The second team hit 6 times and dealt 65 total damage, eliminating 0 GORILLAS!

1/1 GORILLA (on 846 health) vs 10/10 HUMANS
**************************
ROUND 5
**************************
1/1 GORILLA (on 781 health) vs 10/10 HUMANS

The GORILLA decided to scavenge!
The GORILLA found nothing of note.

The HUMANS decided to attack!
HUMANS used UNARMED STRIKE
The second team hit 6 times and dealt 49 total damage, eliminating 0 GORILLAS!

1/1 GORILLA (on 781 health) vs 10/10 HUMANS
**************************
ROUND 6
**************************
1/1 GORILLA (on 732 health) vs 10/10 HUMANS

The GORILLA (on 732 health) decided to attack!
GORILLA (on 732 health) used UNARMED STRIKE
The first team hit 1 times and dealt 48 total damage, eliminating 0 HUMANS!

The HUMANS decided to attack!
HUMANS used UNARMED STRIKE
The second team hit 5 times and dealt 56 total damage, eliminating 0 GORILLAS!

1/1 GORILLA (on 732 health) vs 10/10 HUMANS
**************************
ROUND 7
**************************
1/1 GORILLA (on 676 health) vs 10/10 HUMANS

The GORILLA (on 676 health) decided to attack!
GORILLA (on 676 health) used UNARMED STRIKE
The first team hit 1 times and dealt 21 total damage, eliminating 0 HUMANS!

The HUMANS decided to attack!
HUMANS used UNARMED STRIKE
The second team hit 4 times and dealt 60 total damage, eliminating 0 GORILLAS!

1/1 GORILLA (on 676 health) vs 10/10 HUMANS
**************************
ROUND 8
**************************
1/1 GORILLA (on 616 health) vs 10/10 HUMANS

The GORILLA (on 616 health) decided to attack!
GORILLA (on 616 health) used UNARMED STRIKE
The first team hit 1 times and dealt 73 total damage, eliminating 1 HUMANS!

The HUMANS decided to attack!
HUMANS used UNARMED STRIKE
The second team hit 5 times and dealt 40 total damage, eliminating 0 GORILLAS!

1/1 GORILLA (on 616 health) vs 9/10 HUMANS
**************************
ROUND 9
**************************
1/1 GORILLA (on 576 health) vs 9/10 HUMANS

The GORILLA decided to scavenge!
The GORILLA found nothing of note.

The HUMANS decided to attack!
HUMANS used UNARMED STRIKE
The second team hit 4 times and dealt 48 total damage, eliminating 0 GORILLAS!

1/1 GORILLA (on 576 health) vs 9/10 HUMANS
**************************
ROUND 10
**************************
1/1 GORILLA (on 528 health) vs 9/10 HUMANS

The GORILLA (on 528 health) decided to attack!
GORILLA (on 528 health) used UNARMED STRIKE
The first team hit 1 times and dealt 76 total damage, eliminating 1 HUMANS!

The HUMANS decided to attack!
HUMANS used UNARMED STRIKE
The second team hit 2 times and dealt 10 total damage, eliminating 0 GORILLAS!

1/1 GORILLA (on 528 health) vs 8/10 HUMANS
**************************
ROUND 11
**************************
1/1 GORILLA (on 518 health) vs 8/10 HUMANS

The GORILLA (on 518 health) decided to attack!
GORILLA (on 518 health) used UNARMED STRIKE
The first team hit 1 times and dealt 127 total damage, eliminating 1 HUMANS!

The HUMANS decided to scavenge!
The HUMANS found nothing of note.

1/1 GORILLA (on 518 health) vs 7/10 HUMANS
**************************
ROUND 12
**************************
1/1 GORILLA (on 518 health) vs 7/10 HUMANS

The GORILLA (on 518 health) decided to attack!
GORILLA (on 518 health) used UNARMED STRIKE
The first team hit 1 times and dealt 5 total damage, eliminating 0 HUMANS!

The HUMANS decided to attack!
HUMANS used UNARMED STRIKE
The second team hit 3 times and dealt 42 total damage, eliminating 0 GORILLAS!

1/1 GORILLA (on 518 health) vs 7/10 HUMANS
**************************
ROUND 13
**************************
1/1 GORILLA (on 476 health) vs 7/10 HUMANS

The GORILLA (on 476 health) decided to attack!
GORILLA (on 476 health) used UNARMED STRIKE
The first team hit 1 times and dealt 67 total damage, eliminating 1 HUMANS!

The HUMANS decided to attack!
HUMANS used UNARMED STRIKE
The second team hit 3 times and dealt 25 total damage, eliminating 0 GORILLAS!

1/1 GORILLA (on 476 health) vs 6/10 HUMANS
**************************
ROUND 14
**************************
1/1 GORILLA (on 451 health) vs 6/10 HUMANS

The GORILLA (on 451 health) decided to attack!
GORILLA (on 451 health) used UNARMED STRIKE
The first team hit 1 times and dealt 60 total damage, eliminating 0 HUMANS!

The HUMANS decided to attack!
HUMANS used UNARMED STRIKE
The second team hit 2 times and dealt 31 total damage, eliminating 0 GORILLAS!

1/1 GORILLA (on 451 health) vs 6/10 HUMANS
**************************
ROUND 15
**************************
1/1 GORILLA (on 420 health) vs 6/10 HUMANS

The GORILLA (on 420 health) decided to attack!
GORILLA (on 420 health) used UNARMED STRIKE
The first team hit 1 times and dealt 128 total damage, eliminating 2 HUMANS!

The HUMANS decided to attack!
HUMANS used UNARMED STRIKE
The second team hit 2 times and dealt 27 total damage, eliminating 0 GORILLAS!

1/1 GORILLA (on 420 health) vs 4/10 HUMANS
**************************
ROUND 16
**************************
1/1 GORILLA (on 393 health) vs 4/10 HUMANS

The GORILLA (on 393 health) decided to attack!
GORILLA (on 393 health) used UNARMED STRIKE
The first team hit 1 times and dealt 26 total damage, eliminating 0 HUMANS!

The HUMANS decided to attack!
HUMANS used UNARMED STRIKE
The second team hit 1 times and dealt 4 total damage, eliminating 0 GORILLAS!

1/1 GORILLA (on 393 health) vs 4/10 HUMANS
**************************
ROUND 17
**************************
1/1 GORILLA (on 389 health) vs 4/10 HUMANS

The GORILLA (on 389 health) decided to attack!
GORILLA (on 389 health) used UNARMED STRIKE
The first team hit 0 times and dealt 0 total damage, eliminating 0 HUMANS!

The HUMANS decided to attack!
HUMANS used UNARMED STRIKE
The second team hit 2 times and dealt 11 total damage, eliminating 0 GORILLAS!

1/1 GORILLA (on 389 health) vs 4/10 HUMANS
**************************
ROUND 18
**************************
1/1 GORILLA (on 378 health) vs 4/10 HUMANS

The GORILLA (on 378 health) decided to attack!
GORILLA (on 378 health) used UNARMED STRIKE
The first team hit 1 times and dealt 40 total damage, eliminating 0 HUMANS!

The HUMANS decided to attack!
HUMANS used UNARMED STRIKE
The second team hit 1 times and dealt 14 total damage, eliminating 0 GORILLAS!

1/1 GORILLA (on 378 health) vs 4/10 HUMANS
**************************
ROUND 19
**************************
1/1 GORILLA (on 364 health) vs 4/10 HUMANS

The GORILLA decided to scavenge!
The GORILLA found nothing of note.

The HUMANS decided to attack!
HUMANS used UNARMED STRIKE
The second team hit 2 times and dealt 31 total damage, eliminating 0 GORILLAS!

1/1 GORILLA (on 364 health) vs 4/10 HUMANS
**************************
ROUND 20
**************************
1/1 GORILLA (on 333 health) vs 4/10 HUMANS

The GORILLA (on 333 health) decided to attack!
GORILLA (on 333 health) used UNARMED STRIKE
The first team hit 1 times and dealt 37 total damage, eliminating 1 HUMANS!

The HUMANS decided to attack!
HUMANS used UNARMED STRIKE
The second team hit 2 times and dealt 29 total damage, eliminating 0 GORILLAS!

1/1 GORILLA (on 333 health) vs 3/10 HUMANS
**************************
ROUND 21
**************************
1/1 GORILLA (on 304 health) vs 3/10 HUMANS

The GORILLA (on 304 health) decided to attack!
GORILLA (on 304 health) used UNARMED STRIKE
The first team hit 0 times and dealt 0 total damage, eliminating 0 HUMANS!

The HUMANS decided to scavenge!
The HUMANS found WOODEN SWORD! This will turn the tide.
**************************
WOODEN SWORD
**************************
Durability: 20
Can deal up to 35 damage
**************************

1/1 GORILLA (on 304 health) vs 3/10 HUMANS
**************************
ROUND 22
**************************
1/1 GORILLA (on 304 health) vs 3/10 HUMANS

The GORILLA (on 304 health) decided to attack!
GORILLA (on 304 health) used UNARMED STRIKE
The first team hit 1 times and dealt 115 total damage, eliminating 1 HUMANS!

The HUMANS decided to attack!
HUMANS used WOODEN SWORD
The second team hit 1 times and dealt 18 total damage, eliminating 0 GORILLAS!

1/1 GORILLA (on 304 health) vs 2/10 HUMANS
**************************
ROUND 23
**************************
1/1 GORILLA (on 286 health) vs 2/10 HUMANS

The GORILLA (on 286 health) decided to attack!
GORILLA (on 286 health) used UNARMED STRIKE
The first team hit 0 times and dealt 0 total damage, eliminating 0 HUMANS!

The HUMANS decided to attack!
HUMANS used WOODEN SWORD
The second team hit 1 times and dealt 15 total damage, eliminating 0 GORILLAS!

1/1 GORILLA (on 286 health) vs 2/10 HUMANS
**************************
ROUND 24
**************************
1/1 GORILLA (on 271 health) vs 2/10 HUMANS

The GORILLA decided to scavenge!
The GORILLA found IRON SWORD but decided not to keep it.

The HUMANS decided to attack!
HUMANS used WOODEN SWORD
The second team hit 0 times and dealt 0 total damage, eliminating 0 GORILLAS!

1/1 GORILLA (on 271 health) vs 2/10 HUMANS
**************************
ROUND 25
**************************
1/1 GORILLA (on 271 health) vs 2/10 HUMANS

The GORILLA (on 271 health) decided to attack!
GORILLA (on 271 health) used UNARMED STRIKE
The first team hit 0 times and dealt 0 total damage, eliminating 0 HUMANS!

The HUMANS decided to attack!
HUMANS used WOODEN SWORD
The second team hit 0 times and dealt 0 total damage, eliminating 0 GORILLAS!

1/1 GORILLA (on 271 health) vs 2/10 HUMANS
**************************
ROUND 26
**************************
1/1 GORILLA (on 271 health) vs 2/10 HUMANS

The GORILLA (on 271 health) decided to attack!
GORILLA (on 271 health) used UNARMED STRIKE
The first team hit 1 times and dealt 99 total damage, eliminating 1 HUMANS!

The HUMAN decided to attack!
HUMAN used WOODEN SWORD
The second team hit 0 times and dealt 0 total damage, eliminating 0 GORILLAS!

1/1 GORILLA (on 271 health) vs 1/10 HUMAN
**************************
ROUND 27
**************************
1/1 GORILLA (on 271 health) vs 1/10 HUMAN (on 78 health)

The GORILLA decided to scavenge!
The GORILLA found nothing of note.

The HUMAN decided to attack!
HUMAN used WOODEN SWORD
The second team hit 1 times and dealt 23 total damage, eliminating 0 GORILLAS!

1/1 GORILLA (on 271 health) vs 1/10 HUMAN
**************************
ROUND 28
**************************
1/1 GORILLA (on 248 health) vs 1/10 HUMAN (on 78 health)

The GORILLA (on 248 health) decided to attack!
GORILLA (on 248 health) used UNARMED STRIKE
The first team hit 1 times and dealt 116 total damage, eliminating 1 HUMANS!

1/1 GORILLA (on 248 health) vs 0/10 HUMANS
The GORILLAS have won!
Would you like to go again?
1) YES  2) NO
2
```
</details>

# Use

The fighting simulator can be run as a .jar file in a terminal or in any IDE.
In either case, make sure Java is installed.

## Build and Run Locally

```shell
mvn clean install
java -jar target/fightingsimulator-1.0-SNAPSHOT.jar
```

Then, simply follow the directions the program gives you.
If the program asks you to select something, answer with the corresponding number.
To quit, press Ctrl+C, or press "2" if you want to quit when it asks you to play again.

## Run in an IDE

Start main method in com.github.ilyash819.fightingsimulator.Driver class

Then, simply follow the directions the program gives you.
If the program asks you to select something, answer with the corresponding number.
To quit, simply end the program, or press "2" if you want to quit when it asks you to play again.
