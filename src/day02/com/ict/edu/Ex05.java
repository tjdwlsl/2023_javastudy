package day02.com.ict.edu;
//������ ����, ��� ���ϱ�
// ����� ���� ���� ����ȯ�� �ʿ���
//����
class Ex05{
	public static void main(String[] args){
	int kor = 90;
	int eng = 80;
	int math = 80;
	
	//����
	int sum = kor + eng + math;
	System.out.println(sum);

	//���
	//int avg = sum/3; //�Ҽ��� ����
	//double avg2 = sum/3; // �Ҽ��� ���� ������ �ȳ���
	//System.out.println(avg2);

	//double avg3 = (double)(sum/3); // �Ҽ��� ���� ������ �ȳ���
	//System.out.println(avg3);
	
	double avg4 = (double)(sum)/3;
	System.out.println(avg4);

	double avg5 = sum/3.0;	
	System.out.println(avg5);

	// avg5������ �Ҽ���2�ڸ����� ���ϱ�
	//double avg6 = (int)(avg5*100); 
	//8333.333333332 ->int�� ����ȯ <-�̷��� ���� ������;
	
	double avg6 = (int)(avg5*100)/100.0; //<- .0���� ������ �Ǽ��� �ٲ�
	System.out.println(avg6);

	// 1472�� ������ �����ؼ� 1470���� �����
	int num1 = 1472;
	int num2 = (num1/10)*10; //int ����ȯ �ʾ� -> int/int�� ����
	System.out.println(num2);
	
	}
}