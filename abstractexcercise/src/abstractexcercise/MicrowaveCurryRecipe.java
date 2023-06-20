package abstractexcercise;

public class MicrowaveCurryRecipe extends AbstractRecipe {
	public void MicrowaveCurryRecipe() {
		System.out.println("curry microwave method");
	}
	
	void prepareIngredients() {
		System.out.println("get vegetables cut and ready");
		System.out.println("switch on microwave");
	}
	
	void cookRecipe() {
		System.out.println("Microwave vegetables");
		System.out.println("add seasoning");
	}
	
	void cleanup() {
		System.out.println("switch off microwave");
		System.out.println("discard unused vegetables");
	}
	

}
