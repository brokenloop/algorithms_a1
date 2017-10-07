/**
 * Created by danieljordan on 02/10/2017.
 *
 * This class deals with creating properties, storing them in arraylists,
 * and performing operations on all of the properties
 * (calculateTotalIncome, printAllProperties etc)
 */

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PropertyManager {

    private ArrayList<Apartment> apartmentList = new ArrayList<Apartment>();
    private ArrayList<House> houseList = new ArrayList<House>();
    private ArrayList<Villa> villaList = new ArrayList<Villa>();


    public Apartment createApartment() {
        String ownerName = JOptionPane.showInputDialog(null,
                "Please enter owner name");
        String postalAddress = JOptionPane.showInputDialog(null,
                "Please enter postal address");
        int costPerDay = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Please enter cost per day"));
        int storeyNumber = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Please enter storey number"));

        Apartment apartment = new Apartment(ownerName, postalAddress, costPerDay, storeyNumber);

        return apartment;
    }

    public House createHouse() {
        String ownerName = JOptionPane.showInputDialog(null,
                "Please enter owner name");
        String postalAddress = JOptionPane.showInputDialog(null,
                "Please enter postal address");
        int costPerDay = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Please enter cost per day"));
        int numberOfStoreys = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Please enter number of storeys"));
        int clearingFee = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Please enter clearing fee"));


        House house = new House(ownerName, postalAddress, costPerDay, numberOfStoreys, clearingFee);

        return house;
    }

    public Villa createVilla() {
        String ownerName = JOptionPane.showInputDialog(null,
                "Please enter owner name");
        String postalAddress = JOptionPane.showInputDialog(null,
                "Please enter postal address");
        int costPerDay = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Please enter cost per day"));
        int numberOfRooms = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Please enter number of rooms"));
        int roomServiceCostPerDay = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Please enter room service cost per day"));
        int luxuryTaxPerDay = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Please enter luxury tax per day"));

        Villa villa = new Villa(ownerName, postalAddress, costPerDay, numberOfRooms, roomServiceCostPerDay,
                luxuryTaxPerDay);

        return villa;
    }

    public void fillInProperties2() {

        // Create Apartments
        Apartment apartment1 = new Apartment("Daniel Jordan", "1 Fake Street", 50,
                1);
        Apartment apartment2 = new Apartment("Eoghan Jordan", "2 Fake Street", 100,
                2);
        Apartment apartment3 = new Apartment("Michael Jordan", "3 Fake Street", 150,
                3);

        //Create Houses
        House house1 = new House("Daniel Jordan", "11 Fake Street", 100,
                1, 20);
        House house2 = new House("Eoghan Jordan", "12 Fake Street", 150,
                2, 30);
        House house3 = new House("Michael Jordan", "13 Fake Street", 200,
                3, 40);

        //Create Villas
        Villa villa1 = new Villa("Daniel Jordan", "111 Fake Street", 500,
                10, 100,50);
        Villa villa2 = new Villa("Eoghan Jordan", "112 Fake Street", 550,
                11, 100, 50);
        Villa villa3 = new Villa("Michael Jordan", "113 Fake Street", 600,
                12, 100, 50);

        // Add properties to arraylists
        apartmentList.add(apartment1);
        apartmentList.add(apartment2);
        apartmentList.add(apartment3);
        houseList.add(house1);
        houseList.add(house2);
        houseList.add(house3);
        villaList.add(villa1);
        villaList.add(villa2);
        villaList.add(villa3);
    }

    public void fillInProperties() {

        int propertyNum = 1;

        // Creating properties
        for (int i = 0; i < propertyNum; i++) {
            Apartment apartment = createApartment();
            apartmentList.add(apartment);
        }

        for (int i = 0; i < propertyNum; i++) {
            House house = createHouse();
            houseList.add(house);
        }

        for (int i = 0; i < propertyNum; i++) {
            Villa villa = createVilla();
            villaList.add(villa);
        }


        // Filling properties with rental days
        for (Property property : this.apartmentList) {
            for (int i = 0; i < propertyNum; i++) {
                int rentalDays = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "How many days would you like to rent the property for?"));
                property.rentProperty(rentalDays);
            }
        }

        for (Property property : this.houseList) {
            for (int i = 0; i < propertyNum; i++) {
                int rentalDays = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "How many days would you like to rent the property for?"));
                property.rentProperty(rentalDays);
            }
        }

        for (Property property : this.villaList) {
            for (int i = 0; i < propertyNum; i++) {
                int rentalDays = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "How many days would you like to rent the property for?"));
                property.rentProperty(rentalDays);
            }
        }
    }

    public int calculateTotalIncome() {
        int totalIncome = 0;

        for (Property property : this.apartmentList) {
            totalIncome += property.calculateIncome();
        }

        for (Property property : this.houseList) {
            totalIncome += property.calculateIncome();
        }

        for (Property property : this.villaList) {
            totalIncome += property.calculateIncome();
        }

        return totalIncome;
    }

}
