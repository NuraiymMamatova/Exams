package Exam2;

public class CrazyHouse extends House{

    CrazyHouse(int houseId, String houseName, String houseAddress, int housePrice, int houseYear,Person []person ) {
        super(houseId, houseName, houseAddress, housePrice, houseYear,person);

        }

    @Override
    void city() {
getHouseAddress();
    }

    @Override
    void electricity(int electricity) {
System.out.println(electricity);
    }

    @Override
    void house() {
        System.out.println("Is in house lives a monster!");

    }



    @Override
    public String toString() {
        return "CrazyHouse{}";
    }
}
