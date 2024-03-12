package behavior.interpreter;
//추상체(Expression)로서 공통 메서드 정의
//AND/OR 연산 => 논리값 결과
public interface Expression {
	public boolean interpreter(String context);
	
}
