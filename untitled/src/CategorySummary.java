class CategorySummary {
    private String category;
    private double totalMeasurableValue;
    private double totalPrice;

    public CategorySummary(String category, double totalMeasurableValue, double totalPrice) {
        this.category = category;
        this.totalMeasurableValue = totalMeasurableValue;
        this.totalPrice = totalPrice;
    }

    public String getCategory() {
        return category;
    }

    public double getTotalMeasurableValue() {
        return totalMeasurableValue;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void addToTotalMeasurableValue(double value) {
        totalMeasurableValue += value;
    }

    public void addToTotalPrice(double price) {
        totalPrice += price;
    }
}
