package sec1;

public class Generic1<T> {
	//제네릭 : 데이터타입과 관계 없이 모든 타입을 받아 처리하는 클래스 (범용 클래스)
	//primitive type은 받을 수 없음
	
	private T field1;
	
	public Generic1() {}
	
	public Generic1(T field1) {
		super();
		this.field1 = field1;
	}

	public T getField1() {
		return field1;
	}

	public void setField1(T field1) {
		this.field1 = field1;
	}
	
	
}
