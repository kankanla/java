

/*
http://download.oracle.com/technetwork/java/javase/6/docs/zh/api/java/util/concurrent/Semaphore.html
*/

import java.util.concurrent.Semaphore;
import java.lang.System;

class  M180717_Semaphore {
	public static void main(String[] args) {
		Semaphore semaphore = new Semaphore(2);
		A a = new A(semaphore);
		a.start();
		System.out.println(semaphore.getQueueLength());
		B b = new B(semaphore);
		b.start();
		System.out.println(semaphore.getQueueLength());
		B b2 = new B(semaphore);
		b2.start();

		// C c = new C(semaphore);
		// c.start();
	}
}


class A extends Thread {
	private Semaphore semaphore;
	public A(Semaphore semaphore) {
		this.semaphore = semaphore;
	}

	@Override
	public void run() {
		try {
			// System.out.println(semaphore.getQueueLength());
			semaphore.acquire();
			System.out.println("------------------------------");
			System.out.println(Thread.currentThread().getName());
			for (int i = 0 ; i < 1000 ; i++) {
				System.out.print("a");
			}
			semaphore.release();
		} catch (Exception e) {
			System.out.println(semaphore.getQueueLength());
		}

	}
}

class B extends Thread {
	private Semaphore semaphore;

	public B(Semaphore semaphore) {
		this.semaphore = semaphore;
	}

	@Override
	public void run() {
		try {
			// System.out.println(semaphore.getQueueLength());
			semaphore.acquire();
			System.out.println("------------------------------");
			System.out.println(Thread.currentThread().getName());
			for (int i = 0 ; i < 1000 ; i++) {
				System.out.print("b");
			}
			semaphore.release();
		} catch (Exception e) {
			System.out.println(semaphore.getQueueLength());
		}

	}
}

class C extends Thread {
	private Semaphore semaphore;

	public C(Semaphore semaphore) {
		this.semaphore = semaphore;
	}

	@Override
	public void run() {
		System.out.println("------------------------------");
		System.out.println(Thread.currentThread().getName());
		for (int i = 0 ; i < 1000 ; i++) {
			System.out.print("c");
		}
	}
}
