
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.Naming;

public class CalculatorServer {
    public static void main(String[] args) {
        try {
            CalculatorImpl obj = new CalculatorImpl();

            LocateRegistry.createRegistry(1099);
            Naming.rebind("rmi://localhost/Calculator", obj);

            System.out.println("Calculator Server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
