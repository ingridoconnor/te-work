package com.techelevator.couplingExample;

public class ManagerTightCoupling {

	SmartWorkerTightCoupling smartWorker;
	LazyWorkerTightCoupling lazyWorker;
<<<<<<< HEAD
	ExtraordinaryWorkerTightCoupling extraWorker;
	
	public ManagerTightCoupling(SmartWorkerTightCoupling smartWorker,
			    LazyWorkerTightCoupling lazyWorker, ExtraordinaryWorkerTightCoupling extraWorker) {
		this.smartWorker = smartWorker;
		this.lazyWorker = lazyWorker;
		this.extraWorker = extraWorker;
=======
	
	public ManagerTightCoupling(SmartWorkerTightCoupling smartWorker,
			    LazyWorkerTightCoupling lazyWorker) {
		this.smartWorker = smartWorker;
		this.lazyWorker = lazyWorker;
>>>>>>> eff88e8d7ea6e05d0421b749f84e4e4b51ba45cd
	}
	
	public void manageWork() {
		smartWorker.work();
		lazyWorker.work();
	}

}
