package sec1;
//Failure(고장) : 시스템  이상으로, 정상적으로 하드웨어나 소프트웨어가 동작하지 못하는 현상
//error(오류) : 프로그램 작업 시 코드의 문법적 구문 오류 등으로 인해 정상적인 작동이 되지 않는 경우
//		ㄴ 구문오류(Syntax Error), 논리 오류(Logical Error), 실행 오류(Run-time Error)
//Mismatch(불일치) : 정상적인 결과가 아닌 결과가 나타나는 것 / 프로그램 코딩 상에 해당 기능이나 구조에 적절한 명령을 하지 않는 경우 발생

//Exception (예외) : failure나 error와 다르게, 개발자의 잘못된 코딩으로 인해 정상적으로 처리되지 못하는 현상 / 정상적인 상태로 돌아갈 수 있음을 의미
//  ==> 프로그래밍 로직 상 에러가 발생하면, 그 다음 문장은 처리되지 못하고 실행이 중지됨
//	==> 다음 문장까지 실행될 수 있도록 처리하는 것이 예외 처리
//   ㄴ  IOException, RuntimeException, SQLException, ...
public class ExceptionExam1 {

	public static void main(String[] args) {
		String name = null;
		//실행한 try문에서 예외가 발생하면 예외처리 문장 catch문을 실행
		try { //실행할 문장
			System.out.println(name.toString());
		} catch( Exception e) {
			//예외처리 문장
			System.out.println("예외 발생");
		}

	}

}
