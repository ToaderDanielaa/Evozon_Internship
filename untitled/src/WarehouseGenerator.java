import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class WarehouseGenerator {
    public static List<Package> generateStoragePackages() {
        List<Package> storagePackages = new ArrayList<>();
        String[] productCategories = {"Fruits", "Vegetables", "Other"};
        String[] measurableUnits = {"Kg", "Bag", "Box", "Pack"};
        Random random = new Random();

        for (int i = 0; i < 200; i++) {
            String productCategory = productCategories[random.nextInt(productCategories.length)];
            String measurableUnit = measurableUnits[random.nextInt(measurableUnits.length)];

            double measurableValue = 0;
            double pricePerUnit = 0;

            switch (measurableUnit) {
                case "Kg":
                    measurableValue = 50 + random.nextDouble() * 200; // Random value between 50 and 250
                    pricePerUnit = 6;
                    break;
                case "Bag":
                    measurableValue = 15 + random.nextInt(11); // Random value between 15 and 25
                    pricePerUnit = 15;
                    break;
                case "Box":
                    measurableValue = 30 + random.nextInt(31); // Random value between 30 and 60
                    pricePerUnit = 2;
                    break;
                case "Pack":
                    measurableValue = 100 + random.nextInt(401); // Random value between 100 and 500
                    pricePerUnit = 30;
                    break;
            }

            Calendar calendar = Calendar.getInstance();
            Date entryDate = new Date(calendar.getTimeInMillis() - random.nextInt(180 * 24 * 60 * 60 * 1000)); // Up to 180 days old
            calendar.add(Calendar.MONTH, 6);
            Date expirationDate = new Date(calendar.getTimeInMillis());

            storagePackages.add(new Package(productCategory, measurableUnit, measurableValue, pricePerUnit, entryDate, expirationDate));
        }

        return storagePackages;
    }
}
