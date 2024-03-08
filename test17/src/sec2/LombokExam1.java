package sec2;

public class LombokExam1 {

	public static void main(String[] args) {
		
		Member mem1 = new Member();
		mem1.setId("rnjs");
		mem1.setPw("pass");
		mem1.setPoint(30);
		
		System.out.println(mem1.toString()); // >>> 출력 안됨
		
		Board b1 = new Board();
		b1.setPno(1);
		b1.setTitle("글제목");
		b1.setContent("글 내용");
		b1.setViewCnt(0);
	}

}
