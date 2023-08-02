import java.util.Date;

public class Package {
    private String productCategory;
    private String measurableUnit;
    private double measurableValue;
    private double pricePerUnit;
    private Date entryDate;
    private Date expirationDate;
    private double currentPrice;

    // Constructor
    public Package(String productCategory, String measurableUnit, double measurableValue,
                          double pricePerUnit, Date entryDate, Date expirationDate) {
        this.productCategory = productCategory;
        this.measurableUnit = measurableUnit;
        this.measurableValue = measurableValue;
        this.pricePerUnit = pricePerUnit;
        this.entryDate = entryDate;
        this.expirationDate = expirationDate;
    }

    // Getters
    public String getProductCategory() {
        return productCategory;
    }

    public String getMeasurableUnit() {
        return measurableUnit;
    }

    public double getMeasurableValue() {
        return measurableValue;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    // Calculate the current price based on the current date
    public void calculateCurrentPrice(Date currentDate) {
        if (currentDate.before(expirationDate)) {
            long remainingMillis = expirationDate.getTime() - currentDate.getTime();
            long remainingWeeks = remainingMillis / (7 * 24 * 60 * 60 * 1000);

            double discountWeeks = productCategory.equals("Fruits") ? 5 : 4;
            double discountPercentage = productCategory.equals("Fruits") ? 0.1 : 0.05;

            if (remainingWeeks <= discountWeeks) {
                currentPrice = pricePerUnit * measurableValue - (discountPercentage * remainingWeeks * pricePerUnit);
            } else {
                currentPrice = pricePerUnit * measurableValue - (discountPercentage * discountWeeks * pricePerUnit);
            }
        } else {
            currentPrice = 0;
        }
    }
}
