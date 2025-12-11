import java.util.Date;

public class Purchase {

    private int purchaseId;
    private int userId;
    private Date purchaseDate;
    private String paymentMethod;
    private String paymentStatus;
    private double totalCost;

    // Constructor
    public Purchase(int purchaseId, int userId, Date purchaseDate, 
                    String paymentMethod, String paymentStatus, double totalCost) {

        this.purchaseId = purchaseId;
        this.userId = userId;
        this.purchaseDate = purchaseDate;
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;
        this.totalCost = totalCost;
    }

    // Getters and Setters
    public int getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(int purchaseId) {
        this.purchaseId = purchaseId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    // Method: return purchase information as String
    public String getPurchaseDetails() {
        return "Purchase ID: " + purchaseId +
               ", User ID: " + userId +
               ", Date: " + purchaseDate +
               ", Payment Method: " + paymentMethod +
               ", Status: " + paymentStatus +
               ", Total Cost: SAR" + totalCost;
    }
}
