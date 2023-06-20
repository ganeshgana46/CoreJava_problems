package abstractexcercise;

public class CurryRecipe extends AbstractRecipe {
	public void CurryRecipe() {
		System.out.println("curry preparation method");
	}
	
	void prepareIngredients() {
		System.out.println("Get ready vegetables and ready");
		System.out.println("get spices ready");
	}
	
	void cookRecipe() {
		System.out.println("steam and fry vegetables");
		System.out.println("cook with spices");
		System.out.println("add seasoning");
	}
	
	void cleanup() {
		System.out.println("Discard unused vegetables");
		System.out.println("discard unudes spices");
	}

}
