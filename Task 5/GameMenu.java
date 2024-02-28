import java.util.ArrayList;
import java.util.Scanner;

class GameMenu{
	
	private ArrayList<String> actions= new ArrayList<>();


	GameMenu(ArrayList<String> actions){

		this.actions= actions;
	}

	public void displayMenu(){

		for(int i=0;i<actions.size();i++){
			System.out.println(actions.get(i));
		}
	}

	public String getAction(){
		Scanner scan= new Scanner(System.in);
		System.out.println("Type a number to choose an action");
		displayMenu();
		return scan.nextLine();
	}
}