package com.techelevator.couplingExample.looseCoupling;

public class TestLooseCoupling {


	public static void main(String[] args) {
		SmartWorker smartWorker = new SmartWorker();
		Manager manager1 = new Manager(smartWorker);
		manager1.manageWork();
		
		LazyWorker lazyWorker = new LazyWorker();
		Manager manager2 = new Manager(lazyWorker);
		manager2.manageWork();
		
<<<<<<< HEAD
		ExtraordinaryWorker extraWorker = new ExtraordinaryWorker();
		Manager manager3
		= new Manager(extraWorker);
		manager3.manageWork();
		
=======
>>>>>>> eff88e8d7ea6e05d0421b749f84e4e4b51ba45cd

	}

}
