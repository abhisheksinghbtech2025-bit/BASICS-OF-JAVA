
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class TemperatureServer {
    public static void main(String[] args) {
        try {
            TemperatureConverterImpl obj =
                    new TemperatureConverterImpl();

            LocateRegistry.createRegistry(1099);
            Naming.rebind(
                "rmi://localhost/TemperatureService", obj);

            System.out.println(
                "Temperature Server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
