package day02.com.ict.edu;
class Ex06{
	public static void main(String[] args){
	//String : ���ڿ��� ó���ϱ� ���ؼ� ���� Ŭ����(�⺻�ڷ��� X)
	//Ŭ������ �ڷ������� ����ϹǷ� �����ڷ��� O
	//�׷��� �⺻�ڷ���ó�� ��밡��?��
	// ' ' ->�� Char�� ��� " " ->String�� ���
	//String �����̸� = "������"; 

	
	String name = "ȫ�浿";
	System.out.println(name);	
	int age = 17;

	// + ������ �� �� ������ ����� ������ String�̴�.
	//String�� +�� ���̸� �ڷ���?
	//����, ���� ������
	//�����ȣ�� ���� ���ڴ� ������ ������ ���ڴ� �׳� ����Ǿ� �پ����
	name = "1000";
	age = 1000;
	System.out.println(name +50);
	System.out.println(age +50);


	int su1 = 20;
	int su2 = 4;
	System.out.println(su1 + su2);
	System.out.println("��� : "+ su1 + su2);

	//�ذ� �� ���� 
	int su3 = su1 + su2;  
	//���� ��������ʰ� �����ؼ� �ҷ��� ����.(�������)
	System.out.println("��� : " + su3);
	//��ȣ������� ���� ���
	System.out.println("��� : "+ (su1 + su2));
	

	}
}