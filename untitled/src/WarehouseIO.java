import java.io.*;
import java.util.List;

public class WarehouseIO {
    private static final String FILENAME = "warehouse_data.txt";

    public static void saveWarehouseToDisk(List<Package> warehouseData) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(FILENAME);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(warehouseData);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Warehouse data saved to disk.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Package> readWarehouseFromDisk() {
        List<Package> warehouseData = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(FILENAME);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            warehouseData = (List<Package>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            System.out.println("Warehouse data loaded from disk.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return warehouseData;
    }
}
