/**
 * Created by danieljordan on 02/10/2017.
 */

import java.util.ArrayList;

public abstract class Property {
    private int registerNumber;
    private String ownerName;
    private String postalAddress;
    private int costPerDay;
    private int totalRentalDays = 0;

    // Stores number of properties, to help each property get given a unique register number.
    private static int propertyCount = 0;

    public Property(String ownerName, String postalAddress, int costPerDay) {

        // Give new registerNumber to object, increment propertyCount
        this.registerNumber = propertyCount++;

        this.registerNumber = registerNumber;
        this.ownerName = ownerName;
        this.postalAddress = postalAddress;
        this.costPerDay = costPerDay;
    }

    public int getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(int registerNumber) {
        this.registerNumber = registerNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    public int getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(int costPerDay) {
        this.costPerDay = costPerDay;
    }

    public int getTotalRentalDays() {
        return totalRentalDays;
    }

    public void setTotalRentalDays(int totalRentalDays) {
        this.totalRentalDays = totalRentalDays;
    }

    public void rentProperty(int rentalDays) {
        this.totalRentalDays += rentalDays;
    }

    public int calculateIncome() {
        int rentalIncome = this.costPerDay * this.totalRentalDays;
        return rentalIncome;
    }
}
