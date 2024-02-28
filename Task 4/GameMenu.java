import java.util.ArrayList;

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
}