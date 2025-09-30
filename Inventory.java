import java.util.Scanner;

public class Inventory{
	
	private int cups;
	private int iceCubes;
	private int sugarCubes;
	private int lemons;
	private double money=20;
	
	public String updateInventory(){
	
		Scanner scan = new Scanner(System.in);
		System.out.println("How many cups would you like to buy: ");
		int buyCups=scan.nextInt();
		cups+=buyCups;
		money-= buyCups*0.1;
		String temp = scan.nextLine();
		
		System.out.println("How many ice cubes would you like to buy: ");
		int buyIce=scan.nextInt();
		iceCubes+=buyIce;
		money-= buyIce*0.01;
		temp = scan.nextLine();
		
		System.out.println("How many sugar cubes would you like to buy: ");
		int buySugar=scan.nextInt();
		sugarCubes+=buySugar;
		money-= buySugar*0.01;
		temp = scan.nextLine();
		
		System.out.println("How many lemons would you like to buy: ");
		int buyLemons=scan.nextInt();
		lemons+=buyLemons;
		money-= buyLemons*0.2;
		temp = scan.nextLine();
		
		scan.close();
		
		String inventory = ("Inventory\nCups: "+cups+"\nIce Cubes:"+iceCubes+"\nSugar Cubes: "+sugarCubes+"\nLemons: "+lemons+"\nMoney: "+money);
		return inventory;
	}
	
	
	

}
