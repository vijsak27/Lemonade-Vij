import java.util.Scanner;

public class Inventory {
		private double money = 20.0;
		private int lemons;
		private int cups;
		private int sugarCubes;
		private int iceCubes;
		private double lemonPrice = 0.2;
		private double icePrice = 0.05;
		private double sugarPrice = 0.01;
		private double cupPrice =0.04;
		
		public void buyInventory(){
			
			
			System.out.println("Your current inventory: \n\nLemons: "+lemons"\nCups: "+cups+"\nSugar: "+sugarCubes+"\nIce Cubes"+iceCubes+"\nMoney"+money+"\n\n\n\n");
			
			System.out.println("Prices: \n\n"+"Lemons Cost: " +lemonPrice+"\nIce Cubs Cost: "+icePrice+"\nSugar Cubes Cost: "+sugarPrice+"\nCups Cost: "+cupPrice+"\n\n\n");
			
			
			
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
			
			money-=(lemonPrice*buy_lemons);
			money-=(icePrice*buy_ice);
			money-=(sugarPrice*buy_sugar);
			money-=(cupPrice*buy_cups);
		
			
			
			lemons += buy_lemons;
			cups += buy_cups;
			sugarCubes += buy_sugar;
			iceCubes += buy_ice;
			
			
			System.out.println("Your current inventory: \n\nLemons: "+lemons"\nCups: "+cups+"\nSugar: "+sugarCubes+"\nIce Cubes"+iceCubes+"\nMoney"+money+"\n\n\n\n");
			
		}
		

	}
