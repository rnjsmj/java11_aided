package behavior.templatemethod;

public class WoodenHouse extends HouseTemplate{

	@Override
	public void buildWalls() {
		System.out.println("나무벽체를 만듦");
	}

	@Override
	public void buildPillars() {
		System.out.println("나무기둥을 만듦");
	}
	

}
