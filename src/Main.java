/**
 * Created by danieljordan on 02/10/2017.
 */
public class Main {
    public static void main(String args[]) {

        PropertyManager manager = new PropertyManager();
        manager.fillInProperties();

        manager.printAllProperties();

        int income = manager.calculateTotalIncome();

        System.out.println("Total income is " + income);

    }
}
