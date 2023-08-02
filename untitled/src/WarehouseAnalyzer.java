import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WarehouseAnalyzer {
    public static void calculateCurrentPrices(List<Package> warehouseData, Date currentDate) {
        for (Package storagePackage : warehouseData) {
            storagePackage.calculateCurrentPrice(currentDate);
        }
    }

    public static void printWarehouseSummary(List<Package> warehouseData) {
        List<CategorySummary> categorySummaries = new ArrayList<>();

        double totalPrice = 0;

        for (Package storagePackage : warehouseData) {
            String productCategory = storagePackage.getProductCategory();
            double currentPrice = storagePackage.getCurrentPrice();
            totalPrice += currentPrice;

            boolean categoryExists = false;

            for (CategorySummary summary : categorySummaries) {
                if (summary.getCategory().equals(productCategory)) {
                    summary.addToTotalMeasurableValue(storagePackage.getMeasurableValue());
                    summary.addToTotalPrice(currentPrice);
                    categoryExists = true;
                    break;
                }
            }

            if (!categoryExists) {
                categorySummaries.add(new CategorySummary(productCategory, storagePackage.getMeasurableValue(), currentPrice));
            }
        }

        System.out.println("Warehouse Summary:");
        for (CategorySummary summary : categorySummaries) {
            String category = summary.getCategory();
            double total = summary.getTotalMeasurableValue();
            double totalCategoryPrice = summary.getTotalPrice();
            System.out.printf("%15s: Total: %.2f %s, Total Price: %.2f\n", category, total, productCategories[category], totalCategoryPrice);
        }

        System.out.printf("Total Price of the Warehouse: %.2f\n", totalPrice);
    }
}
