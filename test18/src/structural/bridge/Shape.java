package structural.bridge;

public abstract class Shape {
	protected Color color; //Composition (Bridge)
	
	public Shape(Color c) {
		this.color = c;
	}
	
	abstract public void applyColor();
}
