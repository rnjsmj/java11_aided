package sec1;
//Object 클래스는 모든 클래스의 시조(최상위) 클래스
public class Student { //extends Object (생략) 
	private int sno;
	String name;
	public Student(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}
	public Student() {
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	//객체 복제 시 clone() 오버라이딩 필요
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//객체를 생성하고 모든 필드값을 넘겨야 함
		Student clone = new Student(); 
		clone.name = this.name;
		clone.sno = this.sno;
		return clone;
	}
	
	//기존 equals() >>> 주소 비교
	//모든 멤버 필드(변수)에 대해 비교하는 오버라이딩 >>> 값 비교
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student su1 = (Student) obj;
			if(su1.name == this.name && su1.sno == this.sno) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	
	
	
	
	
}
