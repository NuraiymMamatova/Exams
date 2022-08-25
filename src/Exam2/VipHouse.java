package Exam2;

public class VipHouse extends House{

    VipHouse(int houseId, String houseName, String houseAddress, int housePrice, int houseYear,Person[] person) {
        super(houseId, houseName, houseAddress, housePrice, houseYear,person);
    }

    @Override
    void city() {
        getHouseAddress();
    }

    @Override
    public String toString() {
        return "VipHouse{}";
    }

    @Override
    void electricity(int electricity) {
        System.out.println(electricity);
    }

    @Override
    void house() {
        System.out.println("This VipHouse number one on all planet!");

    }

}
