package sec3;

class PwFormatException extends Exception {
	public PwFormatException(String msg) {
		System.out.println("msg : " + msg);
		System.out.println("암호 형식 불일치");
//		super(msg);
	}
}

class Member {
	private String id;
	private String pw;
	Member() {}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) throws PwFormatException{
		if(pw == null) {
			//예외처리 호출 => throw
			throw new PwFormatException("암호가 비어있습니다.");
		} else if (pw.length() < 8 || pw.length() > 20) {
			throw new PwFormatException("글자 수가 8~20이 아닙니다.");
		}
		this.pw = pw;
	};
	
}

public class UserExceptionExam2 {

	public static void main(String[] args) throws PwFormatException {
		Member mem1 = new Member();
		mem1.setId("admin");
		mem1.setPw("123456789123456789123");
		
		//Add throws declaration or try~catch 
	}

}
