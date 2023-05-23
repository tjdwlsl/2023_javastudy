package day20.com.ict.edu;

//동기화 처리할 때 현재 실행 중인 스레드를 강제로 대기상태로 변경
//변경시키는 메서드 wait()
//한번 wait()된 스레드를 풀어주지 않으면 그대로 대기상태로 끝남
//wait()된 스레드를 풀어주는 예약어가 notify(), notifyAll() 임
public class Ex03 implements Runnable{
	int x = 0;
	@Override
	public synchronized void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(++x + " : " + Thread.currentThread().getName());
			if(x == 11){
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else {
				notify();
			}
		
		}
		
	}

}
