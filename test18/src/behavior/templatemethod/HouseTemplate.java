package behavior.templatemethod;
//House를 Build 하는 공통 메서드를 정의하되, 재료가 정해지지 않은 것은 추상메서드로 정의
public abstract class HouseTemplate {
	//final >>> 추상메서드 x / 상수 o
	protected void buildHouse() {
		buildPillars();
		buildWalls();
		buildWindows();
		buildFoundation();
	}
	
	private void buildWindows() {
		System.out.println("유리 창문");
	}
	
	public abstract void buildWalls(); //재료가 정해지지 않아 abstract로 지정
	public abstract void buildPillars(); 
	
	private void buildFoundation() {
		System.out.println("마감재 선택");
	}
}
