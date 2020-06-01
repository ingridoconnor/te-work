package com.techelevator.couplingExample;

public class TestTightCoupling {


	public static void main(String[] args) {
		SmartWorkerTightCoupling smartWorker =
				new SmartWorkerTightCoupling();
		LazyWorkerTightCoupling lazyWorker = 
				new LazyWorkerTightCoupling();
<<<<<<< HEAD
		ExtraordinaryWorkerTightCoupling extraWorker =
				new ExtraordinaryWorkerTightCoupling();
		ManagerTightCoupling manager = 
				new ManagerTightCoupling(smartWorker, lazyWorker, extraWorker);
=======
		ManagerTightCoupling manager = 
				new ManagerTightCoupling(smartWorker, lazyWorker);
>>>>>>> eff88e8d7ea6e05d0421b749f84e4e4b51ba45cd
		
		manager.manageWork();
		

	}

}
