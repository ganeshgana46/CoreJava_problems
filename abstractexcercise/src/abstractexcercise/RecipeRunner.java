package abstractexcercise;

public class RecipeRunner {

	public static void main(String[] args) {
		CurryRecipe curryRecipe = new CurryRecipe();
		curryRecipe.curryReady();
		
		MicrowaveCurryRecipe microwaveCurryRecipe = new MicrowaveCurryRecipe();
		microwaveCurryRecipe.curryReady();

	}

}
