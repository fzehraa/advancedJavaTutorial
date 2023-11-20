package springIntro2;

public class CustomerManager {
	private ICustomerDal mycustomerdal;
	CustomerManager(ICustomerDal mycustomerdal){
		this.mycustomerdal = mycustomerdal;
	}
	void add() {
		mycustomerdal.add();
	}
}
