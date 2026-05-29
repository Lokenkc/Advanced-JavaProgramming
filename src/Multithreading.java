class MyThread extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Thread Class: " + i);
		}
	}
}

class MyRunnable implements Runnable {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Runnable Interface: " + i);
		}
	}
}

public class Multithreading {
	public static void main(String[] args) {
		System.out.println("Lokendra kc");
		// First approach: Extending Thread class
		MyThread t1 = new MyThread();

		// Second approach: Implementing Runnable interface
		MyRunnable r1 = new MyRunnable();
		Thread t2 = new Thread(r1);

		// Start threads
		t1.start();
		t2.start();
	}
}