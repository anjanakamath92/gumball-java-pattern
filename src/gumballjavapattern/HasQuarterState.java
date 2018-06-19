package gumballjavapattern;

public class HasQuarterState implements State {
	GumballMachine gumballMachine;
 
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public void insert_coin(GumballMachine.COIN_VALUE coin_inserted) {
		System.out.println("You can't insert another coin.");
	}
 
	public void ejectQuarter() {
		gumballMachine.setCurrency(0);
        gumballMachine.setState(gumballMachine.getNoQuarterState());
        System.out.println(gumballMachine.getCurrency() + " returned");
	}
 
	public void turnCrank() {
		System.out.println("You turned...");
		gumballMachine.setState(gumballMachine.getSoldState());
	}

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
	public String toString() {
		return "waiting for turn of crank";
	}
}
