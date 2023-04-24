public class ATM {
    float amount = 2000000;

    public void withdraw(float inputAmount) throws AmountGreaterThan {
        if (inputAmount > 2000000) {
            throw new AmountGreaterThan("Input Amount Must be less than amount in account");
        }

    }
}
