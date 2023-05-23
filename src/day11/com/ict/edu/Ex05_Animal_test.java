package day11.com.ict.edu;

public class Ex05_Animal_test {
	public static void main(String[] args) {
		//객체 생성
		Ex05_Animal t1 = new Ex05_Animal(); 
		//이름 : 큰뿔소
		
		t1.setName("큰뿔소");
		String str = t1.getName();
		System.out.println(str);
		
		//나이 : 3
		t1.setAge(3);
		//int = ti.getAge();
		
		//생존여부 : 살아있음
		t1.setLive(true);
		
		//결과 출력
		
		
		
		
		
		//이름을 펭귄, 나이를 1살, 생존여부는 살아있음 으로 변경
		t1.setName("펭귄");
		t1.setAge(1);
		t1.setLive(true);
		str = t1.getName();
		System.out.println(str);
		//결과 출력
		
		System.out.println("===========");
		t1.play("엄지", 14, false);
		t1.prn();
		System.out.println("===========");
		
		System.out.println("===========");
		t1.play("까치", 14, true);
		t1.prn();
		
	}
}


