import java.util.Scanner;

public class CC_Final {

	public static void main(String[] args) {
		
//Scanners' goal is to fill the four different variable strings for the two animals.
// We start by prompting the user to input each animal's name and a single characteristic.		
		
		Scanner keyboard = new Scanner(System.in);
		
		//Animal Name 1
		System.out.println("-----------  Animal 1  -----------");
		System.out.println("Please type the name of an animal.");
		System.out.println("Example: flamingo");

		String animalName1 = keyboard.next();
		keyboard.nextLine(); // consumes newline 
		
		//Animal Characteristic 1
		System.out.println("---------------  Animal 1  ---------------");
		System.out.println("Now type one characteristic of the animal.");
		System.out.println("Example: it has pink feathers");
		
		String animalChar1 = keyboard.nextLine();		
		
		//Animal Name 2
		System.out.println("-----------  Animal 2  -----------");
		System.out.println("Please type the name of an animal.");
		System.out.println("Example: penguin");

		String animalName2 = keyboard.next();
		keyboard.nextLine(); // consumes newline 	
		
		//Animal Characteristic 2
		System.out.println("---------------  Animal 2  ---------------");
		System.out.println("Now type one characteristic of the animal.");
		System.out.println("Example: it can't fly");

		String animalChar2 = keyboard.nextLine();	
	       
		keyboard.close();
		
		
// A simple loop to clear the console screen 		
		
		int i;
		
		for(i = 0; i < 30; ++i) {
			System.out.println();
		}
		
// We now have the four user inputs saved as strings in unique variables, which we will use as input in our "Randomizer" method 
	
// Now, I will split the animal names for our random output		
		
		//Split Animal Name 1
		int splitLen1 = animalName1.length() / 2 ;		
		
		String animalName1Rand1 = animalName1.substring(0, splitLen1);
		String animalName1Rand2 = animalName1.substring(splitLen1);
		
		//Split Animal Name 2
		int splitLen2 = animalName2.length() / 2 ;		
		
		String animalName2Rand1 = animalName2.substring(0, splitLen2);
		String animalName2Rand2 = animalName2.substring(splitLen2);
		
// Next, we will create our possible animal characteristic outputs 
		
		//Generates Random Characteristic 1
		String animalChar1Gen = animalChar1 + " and " + animalChar2;
		
		//Generates Random Characteristic 2
		String animalChar2Gen= animalChar2 + " and " + animalChar1;
		
		//Generates Random Name 1
		String animalName1Gen = animalName2Rand1 + animalName1Rand2;
		
		//Generates Random Name 2
		String animalName2Gen = animalName1Rand1 + animalName2Rand2;
		
		
				
// Finally, we will output a random selection and display a graphic to the user confirming its generation
		

		System.out.print("\r\n"
				+ " ####                  #                #       #              \r\n"
				+ " #   #                 #                                       \r\n"
				+ " #   # ####  ####   ####  ###   ### ##  #  #### #  ####   #### \r\n"
				+ " ####      # #   # #   # #   #  #  #  # #    #  #  #   # #   # \r\n"
				+ " #  #   #### #   # #   # #   #  #  #  # #   #   #  #   # #   # \r\n"
				+ " #  #  #   # #   # #   # #   #  #  #  # #  #    #  #   # #   # \r\n"
				+ " #   #  #### #   #  ####  ###   #  #  # #  #### #  #   #  #### \r\n"
				+ "                                                         #   # \r\n"
				+ "                                                          ###  \r\n"
				+ "");
		
		System.out.print("\r\n"
				+ "	  ###                       #        #            # 	  \r\n"
				+ "	 #   #                      #        #            #  	  \r\n"
				+ "	 #      ###   ### ##  ####  #   ### ###  ###   ####  	  \r\n"
				+ "	 #     #   #  #  #  # #   # #  #   # #  #   # #   #  	  \r\n"
				+ "	 #     #   #  #  #  # #   # #  ##### #  ##### #   #  	  \r\n"
				+ "	 #   # #   #  #  #  # #   # #  #     #  #     #   #  	  \r\n"
				+ "	  ###   ###   #  #  # ####  #   #### ##  ####  ####  	  \r\n"
				+ "	                      #                              	  \r\n"
				+ "	                      #                              	  \r\n"
				+ "\r\n"
				+ "");
// Another simple loop to create space on the console screen 		
				
		for(i = 0; i < 5; ++i) {
			System.out.println();
		}
		
//Random int generated to decide which animal to output, depending on what random outputs (1 or 2) an if statement determines what generated animal to print 
		int random = (int) Math.floor(Math.random()*(3));

//Capitalizing first character in the characteristics & name string and ensuring the rest is lower-case.	
		String finalAnimalChar1 = animalChar1Gen.substring(0,1).toUpperCase() + animalChar1Gen.substring(1).toLowerCase();
		String finalAnimalChar2 = animalChar2Gen.substring(0,1).toUpperCase() + animalChar2Gen.substring(1).toLowerCase();
		
		String finalAnimalName1 = animalName1Gen.substring(0,1).toUpperCase() + animalName1Gen.substring(1).toLowerCase();
		String finalAnimalName2 = animalName2Gen.substring(0,1).toUpperCase() + animalName2Gen.substring(1).toLowerCase();
		
		if(random == 1) {
			System.out.println("The " + finalAnimalName1 + ".");
			System.out.println(finalAnimalChar1 + ".");
		} else {
			System.out.println("The " + finalAnimalName2 + ".");
			System.out.println(finalAnimalChar2 + ".");
		}
		
	}

}

