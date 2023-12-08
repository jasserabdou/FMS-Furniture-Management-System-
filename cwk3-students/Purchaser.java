

/**
 * A Purchaser is a vital entity in the FurnitureStore system. Each Purchaser has an ID, 
 * a name, contact information including phone number, email, and a physical address. 
 * Purchasers are the customers or clients who make orders or procure furniture items 
 * from the store. The system keeps track of each Purchaser to maintain order histories, 
 * shipping details, and other transaction-related records. Detailed information about 
 * every Purchaser is essential for the store's customer relationship management, 
 * facilitating personalized services, promotions, and streamlined communication.
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Purchaser {
    // attributes
    private String id;
    private String name;
    private String furnitureType;
    private String contactDetails;
    private Date purchaseDate;
    private List<String> purchaseHistory;

    // Constructor
    public Purchaser(String id, String name, String furnitureType) {
        this(id, name, furnitureType, "", new Date());
    }

    public Purchaser(String id, String name, String furnitureType, String contactDetails, Date purchaseDate) {
        this.id = id;
        this.name = name;
        this.furnitureType = furnitureType;
        this.contactDetails = contactDetails;
        this.purchaseDate = purchaseDate;
        this.purchaseHistory = new ArrayList<>();
    }

    // methods
    public String getName() {
        return name;
    }

    public String getID() {
        return id;
    }

    public String getFurnitureType() {
        return furnitureType;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(String contact) {
        this.contactDetails = contact;
    }

    public void addToPurchaseHistory(String item) {
        purchaseHistory.add(item);
    }

    public List<String> getPurchaseHistory() {
        return purchaseHistory;
    }

    public boolean isPurchaseValid(int thresholdValue) {
        return purchaseHistory.size() < thresholdValue;
    }

    public void displayDetails() {
        System.out.println("Purchaser ID: " + id);
        System.out.println("Purchaser Name: " + name);
        System.out.println("Preferred Furniture Type: " + furnitureType);
        System.out.println("Contact Details: " + contactDetails);
        System.out.println("Purchase Date: " + purchaseDate);
        System.out.println("Purchase History:");
        for (String item : purchaseHistory) {
            System.out.println("- " + item);
        }
    }

    public String getPreferredFurnitureType() {
        return null;
    }
}