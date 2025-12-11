
import java.util.ArrayList;
import java.util.List;

public class Purchase_Items {

    private int itemId;
    private int purchaseId;
    private int bookId;

    // Store all items (acts like a table)
    public static List<Purchase_Items> purchaseItemsList = new ArrayList<>();

    // Constructor
    public Purchase_Items(int itemId, int purchaseId, int bookId) {
        this.itemId = itemId;
        this.purchaseId = purchaseId;
        this.bookId = bookId;
    }

    // Getters and Setters
    public int getItemId() {
        return itemId;
    }

    public int getPurchaseId() {
        return purchaseId;
    }

    public int getBookId() {
        return bookId;
    }

    // Static method: return all items for given purchaseId
    public static List<Purchase_Items> getItemsByPurchaseId(int purchaseId) {
        List<Purchase_Items> result = new ArrayList<>();

        for (Purchase_Items item : purchaseItemsList) {
            if (item.getPurchaseId() == purchaseId) {
                result.add(item);
            }
        }
        return result;
    }
}
