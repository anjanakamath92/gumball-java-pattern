package gumballjavapattern;

public interface State {
 
	public void insert_coin(GumballMachine.COIN_VALUE coin_inserted);
	public void ejectQuarter();
	public void turnCrank();
	public void dispense();
}
