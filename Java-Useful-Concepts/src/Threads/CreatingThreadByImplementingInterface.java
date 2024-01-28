package Threads;

public class CreatingThreadByImplementingInterface implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreatingThreadByImplementingInterface threadObject = new CreatingThreadByImplementingInterface();
		Thread thread = new Thread(threadObject);
		thread.setName("Thread Crteated By Implementing Runnable Interface");
		thread.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread started : "+Thread.currentThread().getName());
	}

}
