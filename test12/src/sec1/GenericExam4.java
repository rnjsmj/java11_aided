package sec1;

class Point<T, V> {
	T x;
	V y;
	
	//public Point() {}
	public Point(T x, V y) {
		super();
		this.x = x;
		this.y = y;
	}

	public T getX() {
		return x;
	}

	public V getY() {
		return y;
	}
}


public class GenericExam4 {
	//Generic Method : 해당 클래스의 메서드로 반환타입에 관계 없이 활용 가능한 메서드
	//제네릭 클래스가 아니라도 내부에 제네릭 메서드 구현 가능
	//public <Generics> datatype methodName(parameter) { ...}
	public static <T, V> double makeRectangle(Point<T, V> p1, Point<T, V> p2) {
		 double left = ((Number) p1.getX()).doubleValue();
		 double right = ((Number)p2.getY()).doubleValue();
		 double top = ((Number)p1.getX()).doubleValue();
		 double bottom = ((Number)p2.getY()).doubleValue();
		 
		 double width = right - left;
		 double height = bottom - top;
		 
		 return width*height;
		 
	}
	public static void main(String[] args) {
		Point<Integer, Double> p1 = new Point<>(0, 0.0);
		Point<Integer, Double> p2 = new Point<>(20, 20.0);
		
		double area = makeRectangle(p1, p2);
		System.out.println(area);

	}

}
