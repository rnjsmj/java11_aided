package behavior.templatemethod;

public class GlassHouse extends HouseTemplate{

	@Override
	public void buildWalls() {
		System.out.println("유리벽체를 만듦");
	}

	@Override
	public void buildPillars() {
		System.out.println("유리기둥을 만듦");
	}
	

}
