package Homework_6.ControlPanel;

/**
 * Клаас - Acceptor - может работать с монетами или купюрами.
 */
public class Acceptor {
    private float deposit = 0;

    public float getDeposit() {
        return deposit;
    }

    public void resetDeposit() {
        this.deposit = 0;
    }

    public void getCoin(int coin) {
        deposit += (float)coin / 100;
    }

    public void getBill(int bill) {
        deposit += (float)bill;
    }

    @Override
    public String toString() {
        return String.format("Acceptor{deposit='%.2f'}", this.deposit);
    }
}
