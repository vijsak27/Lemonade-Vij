import java.util.Scanner
public class Recipe{
    //vars
    
    public Recipe{

    }

    public int[] makeRecipe(){
        
        Scanner scan1 = new Scanner (System.in); 
        
        System.out.println("How many lemons per cup: ");
        int lemCup = scan1.nextInt();
        String temp = scan.nextLine();
        
        System.out.println("How many ice cubes per cup: ");
        int iceCup = scan1.nextInt();
        temp = scan.nextLine();

        System.out.println("How many sugar cubes per cup: ");
        int sugarCup = scan1.nextInt();
        temp = scan.nextLine();

        return {lemCup,iceCup, sugarCup}


           
        }

    public double calcRecipeEfficacy(double weather, int lemPerCup, int icePerCup, int sugarPerCup){
        int idealLemons = 4;
        int idealIce = Math.round(5*weather);
        int idealSugar = 4;
        double efficacyVal = 1-((((Math.abs(lemPerCup+icePerCup+sugarPerCup)-(idealIce+idealLemons+idealSugar)))/(idealIce+idealLemons+idealSugar))/2);
        return efficacyVal
    }

}