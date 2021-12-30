import java.util.Scanner;

class MarsAdventure {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("What is your name?");
		String name = input.nextLine();
		System.out.println("Nice, " + name + " is a strong name.");

		System.out.println("What color is your spacesuit?");
		String spacesuit = input.nextLine().toLowerCase();
		System.out.println("Got it, " + spacesuit + " it is. We shall be able to see you well on Mars.");

		System.out.println("What's your pet's name?");
		String petName = input.nextLine();
		System.out.println("Roger that, marking down pet " + petName + ".");

		System.out.println("And what kind of animal is that?");
		String petType = input.nextLine();
		System.out.println("Ah very well, we look forward to meeting " + petName + " the " + petType + ".");

		System.out.println("What day will you be leaving on your journey?");
		String departDate = input.nextLine();
		System.out.println("I suppose we can make " + departDate + " work for you.");

		System.out.println("It's not certain how long we will be gone... However, how long would you like to stay?");
		String tripLength = input.nextLine();
		System.out.println("Hm, " + tripLength + ". We shall do our best.");

		while (true) {
			System.out.println("How many suitcases will you be bringing?");
			int numSuitcases = input.nextInt();
			if (numSuitcases > 2) {
				System.out.println("Sorry, that's too many. 2 or fewer please.");
			}
			else if (numSuitcases == 2) {
				System.out.println("Perfect.");
				break;
			}
			else {
				System.out.println("Wow, you must have great packing skills!");
				break;
			}
		}
	}
}
	

