package gumballjavapattern;

public class Main {
    public static void main(String[] args) {
        testMachineA();
        testMachineB();
        testMachineC();
    }

    private static void testMachineA(){
        System.out.println("Testing Machine A");

        gumballjavapattern.GumballMachine gumballMachine = new gumballjavapattern.GumballMachine(10, gumballjavapattern.GumballMachine.MACHINE_TYPE.MACHINE_A);

        System.out.println(gumballMachine);
        gumballMachine.insert_coin(gumballjavapattern.GumballMachine.COIN_VALUE.DIME);
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insert_coin(gumballjavapattern.GumballMachine.COIN_VALUE.QUARTER);
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
    }

    private static void testMachineB(){
        System.out.println("Testing Machine B");

        gumballjavapattern.GumballMachine gumballMachine = new gumballjavapattern.GumballMachine(10, gumballjavapattern.GumballMachine.MACHINE_TYPE.MACHINE_B);

        System.out.println(gumballMachine);

        gumballMachine.insert_coin(gumballjavapattern.GumballMachine.COIN_VALUE.DIME);

        gumballMachine.insert_coin(gumballjavapattern.GumballMachine.COIN_VALUE.QUARTER);
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insert_coin(gumballjavapattern.GumballMachine.COIN_VALUE.QUARTER);
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);
    }

    private static void testMachineC(){
        System.out.println("Testing Machine C");

        gumballjavapattern.GumballMachine gumballMachine = new gumballjavapattern.GumballMachine(10, gumballjavapattern.GumballMachine.MACHINE_TYPE.MACHINE_C);

        System.out.println(gumballMachine);

        gumballMachine.insert_coin(gumballjavapattern.GumballMachine.COIN_VALUE.QUARTER);
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insert_coin(gumballjavapattern.GumballMachine.COIN_VALUE.DIME);
        gumballMachine.insert_coin(gumballjavapattern.GumballMachine.COIN_VALUE.DIME);
        gumballMachine.insert_coin(gumballjavapattern.GumballMachine.COIN_VALUE.QUARTER);
	    gumballMachine.insert_coin(gumballjavapattern.GumballMachine.COIN_VALUE.NICKLE);
        gumballMachine.insert_coin(gumballjavapattern.GumballMachine.COIN_VALUE.NICKLE);
        gumballMachine.insert_coin(gumballjavapattern.GumballMachine.COIN_VALUE.NICKLE);
        gumballMachine.insert_coin(gumballjavapattern.GumballMachine.COIN_VALUE.NICKLE);
        gumballMachine.insert_coin(gumballjavapattern.GumballMachine.COIN_VALUE.NICKLE);
        gumballMachine.turnCrank();
        gumballMachine.insert_coin(gumballjavapattern.GumballMachine.COIN_VALUE.QUARTER);
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
    }

}

