package day11.com.ict.edu;

public class Ex03_main {
	public static void main(String[] args) {
		Ex03_Method t1 = new Ex03_Method();
		System.out.println();
		/*
		t1.getSum();
		t1.getAvg();
		t1.getHak();
		System.out.println(t1.sum);
		System.out.println(t1.avg);
		System.out.println(t1.hak); 
		System.out.println("위에가 비정상이래요 우연히 나온거라네요 근데 틀린방법은 아님");
		*/
		
		System.out.println("========================");
		//위에보단 정상적인방법
		//retrun있으면 밑에처럼 저장하는 곳이 있어야
		int k1 = t1.getSum(); 
		double k2 = t1.getAvg();
		String k3 = t1.getHak();
		
		System.out.println(k1);
		System.out.println(k2);
		System.out.println(k3);
			
	}
}
