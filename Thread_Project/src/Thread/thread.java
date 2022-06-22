package Thread;

public class thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=Thread.currentThread();
		System.out.println(t);
		System.out.println("the thread name is "+t.getName());
        t .setName("problem");
        System.out.println("new thread name is="+t.getName());
      		
		

	}

}
