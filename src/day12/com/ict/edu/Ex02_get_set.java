package day12.com.ict.edu;

public class Ex02_get_set {
	
	//직접 접근을 막기 위해서 접근제한자(private)를 사용한다.
	private String name = "홍길동";
	private int age = 24;
	private double weight = 72.6;
	private boolean gender  = true;
	
	
	public boolean isGender() {
		//boolean형만 is로나옴(is = getter)
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	//get()/set()을 이용
	public String getName() {
		return name;
	}
	//지역변수와 전역변수의 이름이 같으면 전역변수에 해당하는 놈한테 this붙임
	//지역변수가 전역변수보다 우선순위가 높음
		public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	

	
}
