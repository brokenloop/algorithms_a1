/**
 * Created by danieljordan on 02/10/2017.
 *
 * This class deals with creating properties, storing them in arraylists,
 * and performing operations on all of the properties
 * (calculateTotalIncome, printAllProperties etc)
 */

import java.util.ArrayList;

public class PropertyManager {

    private ArrayList<Apartment> apartmentList = new ArrayList<Apartment>();
    private ArrayList<House> houseList = new ArrayList<House>();
    private ArrayList<Villa> villaList = new ArrayList<Villa>();


    // Populates arraylists with properties.
    // Initially implemented with JOptionPane, but rewritten to allow for easier testing.
    public void fillInProperties() {

        // Create Apartments
        Apartment apartment1 = new Apartment("Daniel Jordan", "1 Fake Street", 50,
                1, 2);
        Apartment apartment2 = new Apartment("Eoghan Jordan", "2 Fake Street", 50,
                2, 2);
        Apartment apartment3 = new Apartment("Michael Jordan", "3 Fake Street", 50,
                3, 2);

        //Create Houses
        House house1 = new House("Daniel Jordan", "11 Fake Street", 100,
                1, 20);
        House house2 = new House("Eoghan Jordan", "12 Fake Street", 100,
                2, 20);
        House house3 = new House("Michael Jordan", "13 Fake Street", 100,
                3, 20);

        //Create Villas
        Villa villa1 = new Villa("Daniel Jordan", "111 Fake Street", 500,
                10, 100,50);
        Villa villa2 = new Villa("Eoghan Jordan", "112 Fake Street", 500,
                11, 100, 50);
        Villa villa3 = new Villa("Michael Jordan", "113 Fake Street", 500,
                12, 100, 50);

        // Add apartments to arraylists
        apartmentList.add(apartment1);
        apartmentList.add(apartment2);
        apartmentList.add(apartment3);

        // Add houses to arraylists
        houseList.add(house1);
        houseList.add(house2);
        houseList.add(house3);

        // Add villas to arraylists
        villaList.add(villa1);
        villaList.add(villa2);
        villaList.add(villa3);


        // Add rental days to each property
        int rentalDaysNumber = 1;

        for (Property property : this.apartmentList) {
            for (int i = 0; i < 3; i++) {
                property.rentProperty(rentalDaysNumber);
            }
        }

        for (Property property : this.houseList) {
            for (int i = 0; i < 3; i++) {
                property.rentProperty(rentalDaysNumber);
            }
        }

        for (Property property : this.villaList) {
            for (int i = 0; i < 3; i++) {
                property.rentProperty(rentalDaysNumber);
            }
        }
    }


    // Calculates income from all properties
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

    // Prints contents of each array list
    public void printAllProperties() {
        for (Property property : this.apartmentList) {
            System.out.println(property);
        }

        for (Property property : this.houseList) {
            System.out.println(property);
        }

        for (Property property : this.villaList) {
            System.out.println(property);
        }
    }

}
