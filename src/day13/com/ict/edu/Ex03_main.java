package day13.com.ict.edu;

public class Ex03_main {
	public static void main(String[] args) {
		//static 접근제한
		//k1 = public = 누구나 다 접근
		//k3 = private = 외부에서 접근 못함
		//k2 = default(생략) = 같은 패키지는 접근 가능 다른패키지는 접근 불가
		
		System.out.println(Ex03_Static.k1);
		System.out.println(Ex03_Static.k2); 
		//System.out.println(Ex03_Static.k3);
		System.out.println();
		
		System.out.println("s2 = " + Ex03_Static.s2);
		System.out.println("k2 = " + Ex03_Static.k2);
		System.out.println();
		
		Ex03_Static p = new Ex03_Static();
		System.out.println("s1 = " + p.s1);
		System.out.println("s2 = " + p.s2);
		System.out.println();
		
		System.out.println("m1 = " + Ex03_Static.m1);
		System.out.println("m2 = " + Ex03_Static.m2);
		System.out.println("s3 = " + p.s3);
		System.out.println();
		
		
		
		
	}
}
