
class A extends Thread{
	public void run()
	{
		for(int i=0;i<=10;i++)
			System.out.println("From A:i="+i);
		}
	}
	class B extends Thread{
		public void run()
		{
			for(int i=0;i<=10;i++)
				System.out.println("From B:i="+i);
			
			}
		}

	public class Multithreadingex{
	public void main(String[] args) {
  A thread1=new A();
  B thread2=new B(); 
thread1.run();
thread2.run();
     }
	}	
	
	