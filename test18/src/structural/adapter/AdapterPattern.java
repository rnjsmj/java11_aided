package structural.adapter;
//AdapterPattern : 특정 클래스의 인터페이스를 개발자가 원하는 인터페이스의 형태로 변환시키는 패턴
//Structural Pattern  : 사용하던 클래스를 확장하여 더 큰 구조로 만드는 패턴
public class AdapterPattern {

	public static void main(String[] args) {
		System.out.println("ObjectAdapter");
		testObjectAdapter();
		System.out.println("ClassAdapter");
		testClassAdapter();
		
	}
	public static void testObjectAdapter() {
		SocketAdapter sockAdapter = new SocketObjectAdapterImpl();
		Volt v6 = getVolt(sockAdapter, 6);
		Volt v9 = getVolt(sockAdapter, 9);
		Volt v12 = getVolt(sockAdapter,12);
		Volt v110 = getVolt(sockAdapter,110);
		System.out.println("V6 Volts using Object Adapter => " + v6.getAmount());
		System.out.println("V9 Volts using Object Adapter => " + v9.getAmount());
		System.out.println("V12 Volts using Object Adapter => " + v12.getAmount());
		System.out.println("V110 Volts using Object Adapter => " + v110.getAmount());
	}
	
	public static Volt getVolt(SocketAdapter sockAdapter, int i) {
		switch(i) {
		case 6 : return sockAdapter.get6Volt(); 
		case 9 : return sockAdapter.get9Volt(); 
		case 12 : return sockAdapter.get12Volt();   
		default : return sockAdapter.get110Volt(); 
		}
	}
	
	public static void testClassAdapter() {
		SocketAdapter sockAdapter = new SocketClassAdapterImpl();
		Volt v6 = getVolt(sockAdapter, 6);
		Volt v9 = getVolt(sockAdapter, 9);
		Volt v12 = getVolt(sockAdapter,12);
		Volt v110 = getVolt(sockAdapter,110);
		System.out.println("V6 Volts using Object Adapter => " + v6.getAmount());
		System.out.println("V9 Volts using Object Adapter => " + v9.getAmount());
		System.out.println("V12 Volts using Object Adapter => " + v12.getAmount());
		System.out.println("V110 Volts using Object Adapter => " + v110.getAmount());
	}
	
}
