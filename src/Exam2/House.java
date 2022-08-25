package Exam2;

import java.util.Arrays;

public abstract class House {
       private int houseId;
       private String houseName;
       private String houseAddress;
       private int housePrice;
       private int houseYear;
       private Person[] person;
       private String electricity;

       House(int houseId,String houseName,String houseAddress,int housePrice,int houseYear,Person[] person){
              this.houseId = houseId;
              this.houseName = houseName;
              this.houseAddress = houseAddress;
              this.housePrice = housePrice;
              this.houseYear = houseYear;
              this.person = person;

       }
       abstract void city();

       abstract void electricity(int electricity);

       int getHouseId(){
           return houseId;
       }
       void setHouseId(int houseId){
              this.houseId = houseId;
       }
       abstract void house ();

       String getHouseName(){
              if(houseName.contains("r")|| houseName.contains("o")||
               houseName.contains("b")|| houseName.contains("m")||
               houseName.contains("w")|| houseName.contains("h")){

              System.out.println();
       }
       else{
              System.out.println("Уй кабыл алынбайт биздин шарт боюнча болсун");
       }
              return houseName;
       }
       void setHouseName(String houseName){
              this.houseName = houseName;
       }

       String  getHouseAddress() {
              return houseAddress;
       }
       void setHouseAddress(String houseAddress){
              this.houseAddress = houseAddress;
       }

       int getHousePrice(){
              if(housePrice<70000){
              System.out.println("Баасы туура келбейт");
       }
        return housePrice;
       }

       void setHousePrice(int housePrice){
              this.housePrice = housePrice;
       }

       int getHouseYear(){
              if(houseYear<2015){
                     System.out.println("Сиздиин уйунуз абдан эски");
              }
              return houseYear;
       }
       void setHouseYear(int houseYear){
              this.houseYear = houseYear;
       }

       Person[] getPerson (){
              return person;
       }
       void setPerson(Person[] person){
              this.person = person;
       }
       String getElectricity(){
              return electricity;
       }
       void setElectricity(String electricity){
              this.electricity = electricity;
       }

       @Override
       public String toString() {
              return "House{" +
                      "houseId=" + houseId +
                      ", houseName='" + houseName + '\'' +
                      ", houseAddress='" + houseAddress + '\'' +
                      ", housePrice=" + housePrice +
                      ", houseYear=" + houseYear +
                      ", person=" + Arrays.toString(person) +
                      ", electricity='" + electricity + '\'' +
                      '}';
       }
}
