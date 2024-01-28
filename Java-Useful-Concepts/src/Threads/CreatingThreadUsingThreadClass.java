package Threads;

public class CreatingThreadUsingThreadClass extends Thread {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CreatingThreadUsingThreadClass thread = new CreatingThreadUsingThreadClass();
		thread.setName("Thread Created Using Thread Class");
		thread.start();
	}

	public void run() {
		System.out.println("Thread started = "+Thread.currentThread().getName());
	}
	
}
