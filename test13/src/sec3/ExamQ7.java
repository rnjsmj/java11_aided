package sec3;

import java.util.ArrayList;
import java.util.List;

class Book {
	private String name;
	private int price;
	
	public Book() {}
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + "]";
	}
	
	
}

public class ExamQ7 {
	
	public static void main(String[] args) {
		
		List<Book> bookList = new ArrayList<>();
		
		bookList.add(new Book("자바", 25000));
		bookList.add(new Book("파이썬", 15000));
		bookList.add(new Book("안드로이드", 30000));
		
		int sum = (int)bookList.stream().mapToInt(b -> b.getPrice()).sum();
		System.out.println("책 가격 합 : " + sum);
		
		System.out.println("가격 20000원 이상인 책");
		bookList.stream().filter(b -> b.getPrice() >= 20000).map(p -> p.getName()).sorted().forEach(b -> System.out.println(b));;

	}

}
