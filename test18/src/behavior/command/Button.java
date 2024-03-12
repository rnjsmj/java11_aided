package behavior.command;
//Button(수동체) : Alarm과 Lamp의 기능을 합쳐 전달할 수 있게 구현
public class Button {
	private Command theCommand; //추상체 Command를 멤버로

	public Button(Command theCommand) {
		setCommand(theCommand);
	}

	public void setCommand(Command theCommand) {
		this.theCommand = theCommand;
	}
	
	public void pressed(boolean sw) {
		theCommand.execute(sw);
	}
	
	

}
