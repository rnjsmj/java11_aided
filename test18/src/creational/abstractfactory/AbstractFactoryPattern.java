package creational.abstractfactory;

//AbstractFactoryPattern 
// : 추상클래스에서 자식 추상클래스로, 자식 추상클래스는 구현 클래스로 상속받아 처리되게 하고
//	 final 모드의 객체를 구조적으로 생성하여 활용된다는 측면에서  Abstract Factory라고 함

public class AbstractFactoryPattern {

	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("전달된 환경변수가 존재하지 않습니다.");
			System.out.println("Class Name Not Found");
			System.out.println("Main Class 실행 오류");
		}
		
		
		final Factory factory = Factory.getFactory(args[0]); //null
		
		Link googleLink = factory.createLink("구글", "https://www.google.com");
		Link naverLink = factory.createLink("네이버", " https://www.naver.com");
		Link daumLink = factory.createLink("다음", " https://www.daum.net");
		
		
		final Tray searchTray = factory.createTray("검색엔진");
		searchTray.add(googleLink);
		searchTray.add(naverLink);
		searchTray.add(daumLink);
		
		
		final Page page = factory.createPage("검색엔진 리스트","작성자");		
		page.add(searchTray);
		page.output();
		
		/* 정상 실행 결과 
		 >>> ListPage의 makeHTML() 메서드 내용이 출력
		 */
		
		
	}

}
