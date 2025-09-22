import java.util.Scanner;

public class Inventory {
		private int money = 20;
		private int lemons;
		private int cups;
		private int sugarCubes;
		private int iceCubes;
		System.out.println("You have "+ money + " dollars");
		
		System.out.println("How many lemons do you want to purchase: "); 
		Scanner scan = new Scanner(system.in);
		int buy_lemons = scan.nextInt();
		String temp = scan.nextLine();
		System.out.println("How many cups do you want to purchase: ");
		int buy_cups = scan.nextInt();
		String temp = scan.nextLine();
		System.out.println("How many sugar cubes do you want to purchase: ");
		int buy_sugar = scan.nextInt();
		String temp = scan.nextLine();
		System.out.println("How many ice cubes do you want to purchase: ");
		int buy_ice = scan.nextInt();
		String temp = scan.nextLine();
		scan.close();
		System.out.println("Your current inventory: ");
		
		public void updateInventory(){
			lemons += buy_lemons;
			cups += buy_cups;
			sugarCubes += buy_sugar;
			iceCubes += buy_ice;
		}
		

	}
