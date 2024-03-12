package behavior.templatemethod;
// TemplateMethodPattern : 공통메서드를 상위클래스에서 정의, 세부사하은 하위 클래스에서 구현
public class TemplateMethodPattern {

	public static void main(String[] args) {
		HouseTemplate house1 = new WoodenHouse();
		house1.buildHouse();
		System.out.println();
		
		HouseTemplate house2 = new GlassHouse();
		house2.buildHouse();

	}

}
