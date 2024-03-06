package sec1;

interface Material {
	void doPrinting();
}

class Powder implements Material {

	@Override
	public void doPrinting() {
		System.out.println("파우더 재료로 출력");
		
	}
	
	public String toString() {
		return "Powder";
	}
	
}


class Plastic implements Material {
	@Override
	public void doPrinting() {
		System.out.println("플라스틱 재료로 출력");
		
	}
	
	public String toString() {
		return "Plastic";
	}
}

//***제네릭 한정자 <T extends Material>***
class GenericPrint<T extends Material> {
	private T material;

	public GenericPrint() {}
	public GenericPrint(T material) {
		super();
		this.material = material;
	}
	
	public T getMaterial() {
		return material;
	}
	public void setMaterial(T material) {
		this.material = material;
	}
	
	
	
}

public class GenericExam3 {
	public static void main(String[] args) {
		Plastic p1 = new Plastic();
		p1.doPrinting();
		Powder p2 = new Powder();
		p2.doPrinting();
		
		//Generic으로 Meterial의 자식클래스만 허용 *
		GenericPrint<Plastic> g1 = new GenericPrint<>(p1);
		GenericPrint<Powder> g2 = new GenericPrint<>(p2);
		//GenericPrint<Student> g3 = new GenericPrint<>();
		
	}
}
