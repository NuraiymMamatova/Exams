package Exam2;

public class StarHouse extends House{

    StarHouse(int houseId, String houseName, String houseAddress, int housePrice, int houseYear,Person[] person ) {
        super(houseId, houseName, houseAddress, housePrice, houseYear,person);
    }

    @Override
    void city() {
getHouseAddress();
    }

    @Override
    public String toString() {
        return "StarHouse{}";
    }

    @Override
    void electricity(int electricity) {
        System.out.println(electricity);
    }

    @Override
    void house() {
        System.out.println("This house is so older");
    }

}
