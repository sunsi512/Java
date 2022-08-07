package day14;

public class Sync2 {
	public static void main(String[] args) {
		DressRoom dressroom = new DressRoom();
		Thread human1 = new Thread(dressroom, "사람 1");
		Thread human2 = new Thread(dressroom, "사람 2");
		Thread human3 = new Thread(dressroom, "사람 3");
		
		human1.start();
		human2.start();
		human3.start();
		
	}
}

class DressRoom implements Runnable{
	private int time;
	@Override
	public void run() {
		synchronized (this) {
			time = 0;
			System.out.println("드레스룸 들어감");
			while(time < 5) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				time++;
				System.out.println(Thread.currentThread().getName()+" 드레스룸 사용 중.."+time+"초");
			}
			System.out.println("드레스룸 비움");
		}
	}
	
}