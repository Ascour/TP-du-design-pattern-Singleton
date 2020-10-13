public class ClientParalleles extends Thread {
		  public static void main(String[] args) {
			  ClientParalleles client1 = new ClientParalleles();
			  ClientParalleles client2 = new ClientParalleles();
			  client1.start();
			  client2.start();
		  }
		  
		  public void run() {
			  Terre terre = Terre.getInstance();
			  terre.getAge();
			  terre.getPopulation();
		  }		  
};