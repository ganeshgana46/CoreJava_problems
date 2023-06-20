package abstractexcercise;

public abstract class AbstractRecipe {
	public void curryReady() {
		prepareIngredients();
		cookRecipe();
		cleanup();
	}
	abstract void prepareIngredients();
	abstract void cookRecipe();
	abstract void cleanup();

}
