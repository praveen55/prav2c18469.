package mutithreading;

public class Mainthread1 extends Thread {
	public void run()
	{
		System.out.println(Thread.currentThread().getPriority());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(5000);
		}
		catch(Exception e) 
		{
			System.out.println(e);
			}
		Mainthread1 p = new Mainthread1();
		p.setPriority(MIN_PRIORITY);
		System.out.println("Minimum Priority : "+p.getPriority());
		p.start();
		{
			Mainthread1 K = new Mainthread1();
			K.setPriority(NORM_PRIORITY);
			System.out.println("Normal Priority : "+K.getPriority());
			K.start();
		{
			Mainthread1 s = new Mainthread1();
			s.setPriority(MAX_PRIORITY);
			System.out.println("Maximum Priority : "+s.getPriority());
			s.start();
		}
		}
	}
}
