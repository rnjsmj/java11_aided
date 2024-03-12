package behavior.command;
//CommandPattern : 요청을 캡슐화하여 여러 기능을 실행할 수 있는 패턴
public class CommandPattern {

	public static void main(String[] args) {
		Command com1 = new AlarmCommand(new Alarm());
		Button btn1 = new Button(com1); 
		btn1.pressed(true);
		btn1.pressed(false);
		System.out.println();
		
		Command com2 = new LampCommand(new Lamp());
		Button btn2 = new Button(com2);
		btn2.pressed(true);
		btn2.pressed(false);
		System.out.println();
		
		
	}

}
