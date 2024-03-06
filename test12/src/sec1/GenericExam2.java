package sec1;

class StudentMap<K, V>{
	private K key;
	private V value;
	
	public StudentMap() {}
	
	public StudentMap(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
	
	
	
	
}

public class GenericExam2 {

	public static void main(String[] args) {
		StudentMap<Integer, String> s1 = new StudentMap<>(1,"학생1");
		StudentMap<Integer, String> s2 = new StudentMap<>(2,"학생2");
		StudentMap<Integer, String> s3 = new StudentMap<>(3,"학생3");
		StudentMap<Integer, String> s4 = new StudentMap<>(4,"학생4");
		
		StudentMap<String, Integer> s5 = new StudentMap<>("학생5", 90);
		StudentMap<String, Integer> s6 = new StudentMap<>("학생6", 100);

		Student st1 = new Student("학생7", 21);
		StudentMap<Student, Integer> s7 = new StudentMap<>(st1, 100);
	}

}
