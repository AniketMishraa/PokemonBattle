


import  java.util.Scanner;

public class PokemonBattle {

	public static void main(String [] args) {
		System.out.println("Exercise 1");
		battleStart();
		System.out.println("");
		System.out.println("Exercise 2");
		damage();
		System.out.println("");
		System.out.println("Exercise 3");
		statsTable();
	}
	public static String battleStart() {
		Scanner scanInput = new Scanner(System.in);
		System.out.println("Another trainer is issuing a challenge!");
		System.out.println("Zebstrika appeared.");
		System.out.print("Which Pokemon do you choose?");
		String poke = scanInput.next(); 
		System.out.println("You choose " + poke);
		System.out.print("It's a pokemon battle between " + poke + " and zebstrika! Go!");

		return poke;


		
}
	public static double damage() {
		System.out.println("Zebrastrike used Thunderbolt!");
		System.out.println("Trainer, what are are your Arcanine's stats?");
		Scanner scanInput = new Scanner(System.in);
		System.out.print("Level is " );
		int Level = scanInput.nextInt(); 
		System.out.print("Attack is " );
		int Attack = scanInput.nextInt();
		System.out.print("Defense is " );
		int Defense = scanInput.nextInt(); 
		System.out.print("base is " );
		double base = scanInput.nextInt(); 
		System.out.print("STAB is " );
		double STAB = scanInput.nextInt(); 
		System.out.print("HP is " );
		int HP = scanInput.nextInt(); 
		
		double STABfinal = base + 0.85;
		double damage = (2*Level*10)/250 * (Attack/Defense) * base + 2 * STABfinal;
		double HPfinal = HP- damage;
		

		System.out.print("Arcanine sustained " + damage + " points damage." + " Hp is now " + HPfinal);

		return damage;

		

	}
	
	//The directions were not quite clear so I just put a picture of pikachu even though the pokemon name is a parameter
	public static String statsTable() {
		Scanner scanInput = new Scanner(System.in);
		System.out.print("Pokemon name is " );
		String name = scanInput.next(); 
		System.out.print("Level is " );
		int level = scanInput.nextInt();
		System.out.print("Dex NO. is " );
		int DexNO = scanInput.nextInt(); 
		System.out.print("Hp is " );
		int Hp = scanInput.nextInt();
		System.out.print("Attack is " );
		int Attack= scanInput.nextInt(); 
		System.out.print("Defense is " );
		int Defense = scanInput.nextInt(); 
		System.out.print("SP. Attack is " );
		int SPAttack= scanInput.nextInt(); 
		System.out.print("SP. Defense is " );
		int SpDefense = scanInput.nextInt(); 
		System.out.print("Speed is " );
		int Speed = scanInput.nextInt(); 
		System.out.print("Nature is ");
		String Nature = scanInput.next(); 
		System.out.print("Ability ");
		String Ability = scanInput.next(); 
		System.out.print("Item " );
		String Item = scanInput.next(); 
		
		System.out.print("What is your Pokemon's first move " );
		String move1 = scanInput.next(); 
		System.out.print("What is your Pokemon's second move " );
		String move2 = scanInput.next(); 
		System.out.print("What is your Pokemon's third move " );
		String move3 = scanInput.next(); 
		System.out.print("What is your Pokemon's fourth move " );
		String move4 = scanInput.next(); 
		
		
		
		
		System.out.println("Here is your Pokemon");
		System.out.println("    |      |");
		System.out.println("    ________");
		System.out.println("   /        \\");
		System.out.println("   \\        /");
		System.out.println("    |      |");
		System.out.println("    |      |");
		System.out.println("    _______");
		System.out.println("   /       \\");
		System.out.println("  /         \\");
		System.out.println("  -\"-'-\"-'-\"-");
		System.out.println("  \\         /");
		System.out.println("   \\_______/");
		System.out.println("    |      |");
		System.out.println("   /        \\");
		return Nature;
	}
	
}
