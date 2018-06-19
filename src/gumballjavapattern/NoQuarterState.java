package gumballjavapattern;

public class NoQuarterState implements State {
    GumballMachine gumballMachine;
 
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insert_coin(GumballMachine.COIN_VALUE coin_inserted) {
		System.out.println("Inserting " + coin_inserted);
		if(coin_inserted != GumballMachine.COIN_VALUE.QUARTER && gumballMachine.getMachineType().acceptQuarterOnly()){
		   System.out.println( "Accepts only quarter values, Insert quarter" ) ;
                   return;
    
        }
        gumballMachine.setCurrency(gumballMachine.getCurrency() + coin_inserted.acceptValue());
        if(gumballMachine.getCurrency() >= gumballMachine.getMachineType().acceptCost()) {
            gumballMachine.setState(gumballMachine.getHasQuarterState());
        }
	}
 
	public void ejectQuarter() {
        if(gumballMachine.getCurrency() == 0) {
            System.out.println("You haven't inserted coins");
            return;
        }
        gumballMachine.setCurrency(0);
        System.out.println(gumballMachine.getCurrency() + " returned");
    }
 
	public void turnCrank() {
		System.out.println("You turned, but not sufficient coins inserted.");
	 }
 
	public void dispense() {
		System.out.println("You need to pay first");
	} 
 
	public String toString() {
		return "waiting for coins";
	}
}

