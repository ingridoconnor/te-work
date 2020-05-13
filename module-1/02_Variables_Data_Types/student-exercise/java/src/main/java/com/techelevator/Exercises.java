package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /*
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */

		// ### EXAMPLE:
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;
		System.out.println(remainingNumberOfBirds);

        /*
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */

		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;
		System.out.println(numberOfExtraBirds);

        /*
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int raccoonsPlayingInWoods = 3;
		int raccoonsGoHomeForDinner = 2;
		int raccoonsLeftInWoods = raccoonsPlayingInWoods - raccoonsGoHomeForDinner;
		System.out.println(raccoonsLeftInWoods);

        /*
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int numberOfFlowers = 5;
		int numberOfBees = 3;
		int lessBeesThanFlowers = numberOfFlowers - numberOfBees;
		System.out.println(lessBeesThanFlowers);

        /*
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int lonePigeonEating = 1;
		int friendlyHungryPigeonEating = 1;
		int pigeonsEating = lonePigeonEating + friendlyHungryPigeonEating;
		System.out.println(pigeonsEating);

        /*
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int owlFenceClique = 3;
		int owlFenceCliqueLateJoiners = 2;
		int totalOwlsOnFence = owlFenceClique + owlFenceCliqueLateJoiners;
		System.out.println(totalOwlsOnFence);

        /*
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int busyBeavers = 2;
		int swimmyBeaver = 1;
		int onlyHardworkingBeaverLeft = busyBeavers - swimmyBeaver;
		System.out.println(onlyHardworkingBeaverLeft);

        /*
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int toucansChillinInTheTree = 2;
		int toucanWhoWantsToChill = 1;
		int totalToucansChillinInTheTree = toucansChillinInTheTree + toucanWhoWantsToChill;
		System.out.println(totalToucansChillinInTheTree);

        /*
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int nuttySquirrels = 4;
		int deezNuts = 2; 
		int remainingSquirrels = nuttySquirrels - deezNuts;
		System.out.println(remainingSquirrels);

        /*
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		
		int valueOfQuartersFound = 25;
		int valueOfDimesFound = 10;
		int valueOfNickelsFound = 10;
		int totalAmountHiltFound = valueOfQuartersFound + valueOfDimesFound + valueOfNickelsFound;
		System.out.println(totalAmountHiltFound + " cents");

        /*
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int brieMuffinsBaked = 18;
		int mcAdamsMuffinsBaked = 20;
		int flanneryMuffinsBaked = 17;
		int totalMuffinsBaked = brieMuffinsBaked + mcAdamsMuffinsBaked + flanneryMuffinsBaked;
		System.out.println(totalMuffinsBaked);

        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		double moneySpentOnYoYo = 0.24;
		double moneySpentOnWhistle = 0.14;
		double totalMoneySpent = moneySpentOnYoYo + moneySpentOnWhistle;
		System.out.println(totalMoneySpent);

        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int largeMarshmallowsUsed = 8;
		int miniMarshmallowsUsed = 10;
		int totalMarshmallowsUsed = largeMarshmallowsUsed + miniMarshmallowsUsed;
		System.out.println(totalMarshmallowsUsed);

        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		double hiltsInchesOfSnow = 29;
		double brecknockInchesOfSnow = 17;
		double amountMoreThatHiltRecieved = hiltsInchesOfSnow - brecknockInchesOfSnow;
		System.out.println(amountMoreThatHiltRecieved + " inches");

        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		double amountOfMoneyHiltHas = 10.00;
		double amountHiltSpentOnTruck = 3.00;
		double amountHiltSpentOnPencilCase = 2.00;
		double amountHiltHasLeft = amountOfMoneyHiltHas - amountHiltSpentOnTruck - amountHiltSpentOnPencilCase;
		System.out.println(amountHiltHasLeft + " dollars");

        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int amountOfMarblesJoshHad = 16;
		int amountOfMarblesJoshLost = 7;
		int amountOfMarblesJoshHasLeft = amountOfMarblesJoshHad - amountOfMarblesJoshLost;
		System.out.println(amountOfMarblesJoshHasLeft);

        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int seashellsMeganHas = 19;
		int totalSeashellsMeganWantsToHave = 25;
		int seashellsMeganNeedsToGetWhatSheWants = totalSeashellsMeganWantsToHave - seashellsMeganHas;
		System.out.println(seashellsMeganNeedsToGetWhatSheWants);

        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int balloonsBradHas = 17;
		int bradsRedBalloons = 8;
		int bradsGreenBalloons = balloonsBradHas - bradsRedBalloons;
		System.out.println(bradsGreenBalloons);

        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		int booksOriginallyOnShelf = 38;
		int booksMartaPutOnShelf = 10;
		int booksNowOnShelf = booksOriginallyOnShelf + booksMartaPutOnShelf;
		System.out.println(booksNowOnShelf);

        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int legsOnBee = 6;
		int beesWhoIAmFriendsWith = 8;
		int legsOnMyBeeFriends = legsOnBee * beesWhoIAmFriendsWith;
		System.out.println(legsOnMyBeeFriends);

        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		double costOfCone = 0.99;
		double conesPurchased = 2;
		double totalCostOfConesPurchased = costOfCone * conesPurchased;
		System.out.println(totalCostOfConesPurchased + " cents");

        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int rocksHiltHas = 64;
		int rocksNeededForGarden = 125;
		int rocksHiltWillPickUpAtTheStore = rocksNeededForGarden - rocksHiltHas;
		System.out.println(rocksHiltWillPickUpAtTheStore);

        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int marblesHiltHad = 38;
		int marblesHiltLost = 15;
		int marblesHiltHasLeft = marblesHiltHad - marblesHiltLost;
		System.out.println(marblesHiltHasLeft);

        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		int milesToConcert = 78;
		int milesDrivenBeforeStoppingForGas = 32;
		int milesToGo = milesToConcert - milesDrivenBeforeStoppingForGas;
		System.out.println(milesToGo + " miles");

        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
		double timeSpentAm = 1.5;
		double timeSpentPm = .75;
		double totalTimeSpent = timeSpentAm + timeSpentPm;
		System.out.println(totalTimeSpent);

        /*
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		double hotDogsPurchased = 6;
		double hotDogCost = .50;
		double totalSpentOnHotDogs = hotDogsPurchased * hotDogCost;
	
		System.out.println(totalSpentOnHotDogs);

        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		double moneyHiltHas = .50;
		double costOfPencil = .07;
		double amountThatCanBePurchased = moneyHiltHas / costOfPencil;
		String v = String.format("%.2f", amountThatCanBePurchased);
		System.out.println(v);

        /*
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int butterfliesHiltSaw = 33;
		int butterfliesThatWereOrange = 20;
		int redButterflies = butterfliesHiltSaw - butterfliesThatWereOrange;
		System.out.println(redButterflies);

        /*
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		double moneyGiven = 1;
		double costOfCandy = .54;
		double katiesChange = moneyGiven - costOfCandy;
		String t = String.format("%.2f", katiesChange);
		System.out.println(t);

        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		int treesInYard = 13;
		int treesToPlant = 12;
		int totalTreesInYard = treesInYard + treesToPlant;
		System.out.println(totalTreesInYard);

        /*
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		double whenJoySeesGma = 2;
		double hoursInDay = 24;
		double hoursToGrandma = whenJoySeesGma * hoursInDay;
		System.out.println(hoursToGrandma);

        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int kimsCousins = 4;
		int gumToGiveEach = 5;
		int totalGumNeeded = kimsCousins * gumToGiveEach;
		System.out.println(totalGumNeeded);

        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		double moneyDanHas = 3.00;
		double costOfCandyBar = 1.00;
		double moneyLeft = moneyDanHas - costOfCandyBar;
		System.out.println(moneyLeft);

        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int boatsInLake = 5;
		int peopleInEachBoat = 3;
		int peopleInBoatsOnLake = boatsInLake * peopleInEachBoat;
		System.out.println(peopleInBoatsOnLake);

        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int ellensLegos = 380;
		int ellensLostLegos = 57;
		int legosLeft = ellensLegos - ellensLostLegos;
		System.out.println(legosLeft);

        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int muffinsNeeded = 83;
		int muffinsBaked = 35;
		int muffinsArthurMustBake = muffinsNeeded - muffinsBaked;
		System.out.println(muffinsArthurMustBake);

        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		int crayonsWillyHas = 1400;
		int crayonsLucyHas = 290;
		int amountOfCrayonPowerWillyHasOverLucy = crayonsWillyHas - crayonsLucyHas;
		System.out.println(amountOfCrayonPowerWillyHasOverLucy);

        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int pagesOfStickers = 22;
		int stickersPerPage = 10;
		int totalStickers = pagesOfStickers * stickersPerPage;
		System.out.println(totalStickers);

        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		int cupcakesToShare = 96;
		int childrenWhoWantCupcakes = 8;
		int equalShareOfCupcakesPerChild = cupcakesToShare / childrenWhoWantCupcakes;
		System.out.println(equalShareOfCupcakesPerChild);

        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
		int gingerCookies = 47;
		int jarCapacity = 6;
		int cookieRemainder = gingerCookies % jarCapacity;
		System.out.println(cookieRemainder);

        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
		int herCroissants = 59;
		int theOnesSheWillGiveAway = 8;
		int whatSheHasLeftForHerself = herCroissants % theOnesSheWillGiveAway;
		System.out.println(whatSheHasLeftForHerself);

        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		int cookiesOnTrayAtOneTime = 12;
		int totalCookies = 276;
		int traysNeeded = totalCookies / cookiesOnTrayAtOneTime;
		System.out.println(traysNeeded);

        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		int biteSizedPretzels = 480;
		int servingSize = 12;
		int servingsPrepped = biteSizedPretzels / servingSize;
		System.out.println(servingsPrepped);

        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		double lemonCupcakesBakedForChildren = 53;
		double cupcakesLeftAtHome = 2;
		double cupcakesPerBox = 3;
		double boxesGivenAway = (lemonCupcakesBakedForChildren - cupcakesLeftAtHome) / cupcakesPerBox;
		System.out.println(boxesGivenAway);

        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		int carrotSticksPrepped = 74;
		int carrotEaters = 12;
		int carrotsPerPerson = carrotSticksPrepped / carrotEaters;
		System.out.println(carrotsPerPerson);

        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		int teddyBears = 98;
		int maxBearCapacityPerShelf = 7;
		int shelvesFullOfTeddys = teddyBears / maxBearCapacityPerShelf;
		System.out.println(shelvesFullOfTeddys);
		

        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		int allFamPics = 480;
		int albumCapacity = 20;
		int albumsNeeded = allFamPics / albumCapacity;
		System.out.println(albumsNeeded);

        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		int totalTradingCards = 94;
		int boxCapacity = 8; 
		int  whatsLeftUnfilled = totalTradingCards % boxCapacity;
		System.out.println(whatsLeftUnfilled);
		

        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		int dadsBooks = 210;
		int shelvesHeRepaired = 10;
		int booksPerShelf = dadsBooks / shelvesHeRepaired;
		System.out.println(booksPerShelf);

        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		double christinasCroissants = 17;
		double christinasGuests = 7;
		double croissantsPerGuest = christinasCroissants % christinasGuests;
		System.out.println(croissantsPerGuest);

        /*
            CHALLENGE PROBLEMS
        */

        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */

        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B."
        */

        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */


	}

}
