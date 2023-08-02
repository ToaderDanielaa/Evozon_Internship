import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Package> storagePackages = WarehouseGenerator.generateStoragePackages();

        // Save the warehouse data to disk
        WarehouseIO.saveWarehouseToDisk(storagePackages);

        // Read the warehouse from disk
        List<Package> loadedWarehouse = WarehouseIO.readWarehouseFromDisk();

        // Print the summary for the current date
        Date currentDate = new Date(2023 - 1900, 7, 1); // Note: Month is zero-based (0 = January, 7 = August)
        WarehouseAnalyzer.calculateCurrentPrices(loadedWarehouse, currentDate);
        WarehouseAnalyzer.printWarehouseSummary(loadedWarehouse);
    }
}
