package day02.com.ict.edu;
class Ex03{
	public static void main(String[] args){
	//���� : �Ҽ����� ���� ����
	//byte(1) < short(2) < int(4) < long(8)
	//�Ǽ� : �Ҽ��� ����(.0�� �Ǽ�)
	//���� < �Ǽ�

	byte su1 = 125;
	System.out.println(su1);

	short su2 = 125;
	System.out.println(su2);
	
	int su3 = 125;
	System.out.println(su3);

	long su4 = 125L;
	System.out.println(su4);

	//���� �ڷ����� ū �ڷ����� ����ϸ� ����� ū �ڷ������� ����
	//���� �ڷ����� ū �ڷ����� ������ �� ����
	long su5 = 125;
	System.out.println(su5);

	char c1 = 'A';
	int su6 = c1;
	System.out.println(su6);

	//���� �ڷ����� ū�ڷ������� �� �� ����
	//int su7 = 97;
	//char c2 = su7;
	
	//float : ���� �ڿ� F�� f�� ���δ� (���� �Ұ���)
	float su7 = 13.3f;
	System.out.println(su7);

	double su8 = 15.3;
	System.out.println(su8);

	su8 = su7;
	System.out.println(su8);

	//char�� double, int�� double�� ���� = ���θ�� 
	char ch3 = 'a';
	int su9 = 37;

	double su10 = ch3;
	System.out.println(su10);

	su10 = su9;
	System.out.println(su10);
	
	}
}