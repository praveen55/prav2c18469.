package mutithreading;

public class Mainthread extends Thread {
		// TODO Auto-generated method stub
		public void run() {
			for(int i = 1; i<=5; i++) {
				try {
					Thread.sleep(2000);
				}catch(Exception e) {
					System.out.println(e);}
			System.out.println(i);
		}
			}
		public static void main(String args[]) 
		{
			Mainthread p = new Mainthread();
			Mainthread k = new Mainthread();
			Mainthread s = new Mainthread();
			p.start();
			try 
			{
				p.join();
				}catch(Exception e){
					System.out.println(e);
				}
			k.start();
			try {
				k.join();
				}catch(Exception e) {
					System.out.println(e);
					}
			s.start();
			try {
				s.join();
				}catch(Exception e) {
					System.out.println(e);
					}
			}
		}