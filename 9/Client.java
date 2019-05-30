
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numberthread thread1 = new Numberthread();
		Vowelthread thread2 = new Vowelthread();
		
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		
		t1.start();
		try {
			t1.join();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		}

	}


