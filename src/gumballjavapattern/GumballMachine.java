package gumballjavapattern;

public class GumballMachine {
 
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
 
	State state = soldOutState;
	int count = 0;

	private MACHINE_TYPE machine_type;
	private int currency;

    public GumballMachine(int numberGumballs, MACHINE_TYPE t) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);

		this.count = numberGumballs;
		this.machine_type = t;
 		if (numberGumballs > 0) {
			state = noQuarterState;
		} 
	}
 
	public void insert_coin(GumballMachine.COIN_VALUE coin_inserted) {
		state.insert_coin(coin_inserted);
	}
 
	public void ejectQuarter() {
		state.ejectQuarter();
	}
 
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	void setState(State state) {
		this.state = state;
	}

	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
	}
 
	int getCount() {
		return count;
	}
 
	void refill(int count) {
		this.count = count;
		state = noQuarterState;
	}

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}

    public int getCurrency() {
        return currency;
    }

    public void setCurrency(int currency) {
        this.currency = currency;
    }

    public MACHINE_TYPE getMachineType() {
        return machine_type;
    }

    public void setMachineType(MACHINE_TYPE machine_type) {
        this.machine_type = machine_type;
    }

    enum COIN_VALUE{

        NICKLE(1),
        DIME(10),
        QUARTER(25);

        COIN_VALUE(int value) {
            this.value = value;
        }

        int value;

        public int acceptValue() {
            return value;
        }
    }

    enum MACHINE_TYPE{
        MACHINE_A(25, true),
        MACHINE_B(50, true),
        MACHINE_C(50, false);

        MACHINE_TYPE(int cost, boolean quarterOnly) {
            this.cost = cost;
            this.quarterOnly = quarterOnly;
        }

        int cost;
        boolean quarterOnly;

        public int acceptCost() {
            return cost;
        }

        public boolean acceptQuarterOnly() {
            return quarterOnly;
        }
    }
}