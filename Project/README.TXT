This work is licensed under a Creative Commons Attribution 4.0 International License.                   

GAME DESIGN DEVELOPMENT(GDD) 

Chilka Castro – sect. 00003 

Madalina Turcan – sect. 00004 

Jose Samayoa – sect. 00003  

Nicolas Nguyen – sect. 00004 

Tassia Camoes-Araujo 

Game Programming 1 

420-141-VA  

22 November 2020 

 

Executive Summary:  

This game is inspired by the “Crossy Road” mobile game app. Our game consists of three levels, each one harder than the last one. We have a single character known as Toby, the dog. The overall objective of our game is to ensure that the dog makes it back home (located in level 3) safely without losing all his lives (3 initial lives); to ensure he gets back home to his owner alive or not kidnapped. In level one, we have enemies/obstacles which are traffic cones and cars. In level two, we have trains, cactus’, and a dog kidnapper/catcher, someone who catches dogs and sell them. In level three, the enemies/obstacles are cars, trucks, potholes/sewer holes, and bodies of water. The game mechanics to be used are the arrow keys which will allow the player to move Toby around. The win/lose conditions are, he starts off with 10000 points, within the number of lives given he must avoid all obstacles that reduce his points and if he encounters cars, trucks, potholes, trains, and the dog catcher/kidnapper, he loses 1000 pts. When Toby reaches home, he will get a dog treat from his owner which will increase the total score of the player. Throughout the game, the player can increase the points by picking up coins and increase Toby’s available lives by picking up hearts. 

World: 

Level 1: City  

Level 2: Railroad (desert-themed) 

Level 3: Suburban (greener place) 

Main Character: 

Toby, the dog 

Obstacles / Enemies: 

Dog Kidnapper/Catcher 

Vehicles: Cars, Trucks, Trains 

Other objects: Traffic Coins, Cactus, Bodies of water, Potholes/Sewer hole 

 

Allies/ Good objects: 

Toby’s Owner - gives Toby Dog Treat when he returns home 

Dog Treat – given by Toby’s owner 

Coins and Hearts 

Characters Goals: 

Main goal: Toby must return home safely to his owner (found on Level 3). 

Do not get hit by any form of vehicle: cars, trucks, and trains 

Do not get captured by the Dog Catcher/ Dog Kidnapper. 

Avoid cactus, holes, traffic cones and bodies of water. 

Pick up coins, hearts and a dog treat. 

Game Win/Lose Conditions: 

Win: If Toby returns home safely; player only wins if he finishes the three levels. 

Lose: If Toby has no more remaining lives available because of the enemies and obstacles. 

Game Point System: 

Initial Points: 10000 pts. 

Initial Lives: 3 lives (can be increased by picking up hearts) 

Point Deduction (Interaction): 

Vehicles: Cars, Truck and Trains: - 1000 pts  

Dog Kidnapper/Catcher: -1000 pts. 

Potholes/Sewer Holes: -1000 pts. 

 Other deductions: 

Orange traffic cones: -100 pts. 

Bodies of water: - 200 pts. 

Cactus: -150 pts. 

Increase Points: 

Coins: 150 pts. 

Dog Treat: 200 pts. 

Increase Lives:  

Heart: 1 life 

 

 

 

 

User Interface Mock-Ups: 

Level 1: City-style 

Enemies/Obstacles: Cars, Traffic Cones 

 

Using Paint 

A picture containing background pattern

Description automatically generated 

A picture containing text, screenshot, indoor, several

Description automatically generated 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

Level 2: Desert-Style 

Enemies/Obstacles: Cactus, Trains, Dog Catcher/Kidnapper 

Point Boost: Coins 

Life Boost: Heart 

 

Using GIMP 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

Level 3: 

 

Enemies/Obstacles: Bodies of water, Trucks, Cars  

Point Boost: Coins, Toby’s Owner (gives him dog treat), Potholes/Sewer Holes 

Life Boost: Heart 

  
 

Controls: 

Arrow keys (up, down, right, left):  

“Up” Key allows the dog to move forward 

“Down” Key allows the dog to move backward 

“Left” Key allows the dog to move the left 

“Right” Key allows the dog to move to the right 

 

Developer Roles: 

Chilka: Project Manager, Game Developer, Level Designer 

Madalina: Project Manager, Game Developer, Level Designer 

José: Game Developer, Sounds 

Nicolas: Game Developer, Sounds 

 

Schedule of releases:   

Try to list all the tasks involved in the development, each feature you want delivered, and distribute those among the versions:  

11/15: Prototype  

To check if the game works or if our ideas are applicable to the game. 

Using placeholder images/assets as temporary objects on the game, which can be changed later. 

Level 1 Distribution– idea and game mechanics testing 

 

11/22: First playable  

To change the placeholder assets with higher quality images. 

Do Level 1, Level 2 and Level 3. 

 

11/29: Pre-Alpha  

Possible major improvements to change includes code, graphics, objects, sounds, etc. 

Possibility of more objects to include in the game to make it more realistic and appealing.  

 

12/06: Alpha  

To test the game several times and to have others test the game. Also, to get some comments/feedbacks from others so that we could do some mini improvements. 

 

12/10: Gold Master – Game is ready to be presented. 

------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: Toby's Adventure Game
PURPOSE OF PROJECT: To 
                    
VERSION or DATE: December 6, 2020
HOW TO START THIS PROJECT: 
              First,using Greenfoot, click on Scenario, open "RescueGrandma.gfar" file.
              Second,run button to see the objects move. On the other hand,if you 
              only want to see the object move one step, click the act button. 
              Finally, click the reset button to start again from the initial 
              position. 
             
AUTHORS: Chilka Castro, Madalina Turcan, Nicolas Nguyen, Jose Samayoa
USER INSTRUCTIONS:

This game is inspired by the story of "Little Red Riding Hood". However, in this modified
version, there is no wolf hunter and Red Riding Hood is no longer a little girl. 
As a player, you are automatically assigned the role of Red Riding Hood. With no wolf hunter to reach out to,
it is now your main duty as Red Riding Hood to keep Grandma, who is at home, safe and away from the angry wolves. 
People in town are talking about the angry wolves who are going around the forest killing travelers.They are very 
angry because a crow messenger informed them of the news that their friend "Big Bad Wolf" was murdered in the forest 
by someone who was wearing a red cloak with a hood. They are hunting for the person who killed Big Bad Wolf. Alarmingly, 
the forest is close to Grandma's house so go immediately and save the day by eliminating the angry wolves before it is 
too late. Also, on your way, do Grandma a favor and pick some lovely flowers so Grandma would be very pleased with your visitation. 
Some flowers will give gold coins while others won't. You earn points by killing the wolves and by picking flowers. Gold coins for the 
extra flowers that you would sell in the market and for the bounty placed on the wolves' heads.

The player loses if one of the angry wolves goes to visit Grandma and eat her. 
The player wins if Red Riding Hood eliminates all the wolves and reaches Grandma's house. 


Control Keys:
 
Up key   : Toby goes up
Down key : Toby goes down
Left key : Toby goes to the left
Right key: Toby goes to the right

For better game experience, turn on sounds.


Credits:
 www.pngfuel.com
 Wolf Howl Sound - https://freesound.org/people/BrainClaim/sounds/267179/
 Gun Shot Sound- https://freesound.org/people/FilmmakersManual/sounds/522537/
 Pick sound- https://freesound.org/people/Kastenfrosch/sounds/162482/
 Sprite Girl- https://www.deviantart.com/theratiogames
 Sprite Wolves- https://forums.rpgmakerweb.com/index.php?members/whtdragon.8636/

