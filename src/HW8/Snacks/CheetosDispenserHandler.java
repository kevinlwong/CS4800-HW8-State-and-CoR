package HW8.Snacks;
import HW8.Snack;
import HW8.SnackDispenseHandler;
public class CheetosDispenserHandler extends SnackDispenseHandler {
    public CheetosDispenserHandler(SnackDispenseHandler next) {
        super(next);
    }

    // Returns true if successful
    public boolean dispense(Snack snack){
        System.out.println("Vending Machine Mechanical Arm Moving to Cheetos...");
        if (snack.getName().equals("Cheetos")){
            System.out.println("Please wait...Dispensing Cheetos...");
            if (snack.getQuantity() > 0){
                System.out.println("Successfully dispensed Cheetos.");
                snack.setQuantity(snack.getQuantity() - 1);
                return true;
            } else {
                System.out.println("Sorry, Vending Machine Out of Cheetos. Your money will be returned soon...");
                return false;
            }
        } else {
            return super.dispense(snack);
        }
    }
}