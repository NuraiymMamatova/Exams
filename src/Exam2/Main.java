package Exam2;


import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {


  Person person1  = new Person(111111,"Jack "," Ripper","the0@gmail",25,"+996152487234","World","I don't know maybe constantly or not constantly");
  Person person2  = new Person(222222,"Jecks","W","sWag3@gmail",30,"+996789456213","Theatre","monday-friday 6-7");
  Person person3  = new Person(333333,"Chloi","Decker","iDech5@gmail",35,"+996123456789","It company","monday-friday 9-4");
  Person person4  = new Person(444444,"Uluk","Uluk","ul7@gmail",42,"+996784512369","Theatre","saturday-wednesday 6-7");
  Person person5  = new Person(555555,"Tunuk","Tunuk","uT9@gmail",21,"+996784512954","Restaurant","thursday-monday 5-6");
  Person person6  = new Person(666666,"Asan","Asan","aska4@gmail",52,"+996326514875","Mine","thursday-monday 5-6");
  Person person7  = new Person(777777,"Uson","Uson","un5@gmail",52,"+996789546213","University","thursday-monday 5-6");
  Person person8  = new Person(888888,"Adyl","Adyl","ad0@gmail",13,"+99612450873","Store","thursday-monday 5-6");
  Person person9  = new Person(999999,"Alladin","Alladin","all1@gmail",102,"+99603154834","Restaurant","thursday-monday 5-6");
  Person person10 = new Person(101010,"Sherlock","Holmes","sheraton@gmail",35,"+645584796482","On himself","Sunday-friday 6-4");
  Person person11 = new Person(111111,"John","Watson","jhoni@gmail",34,"+645784512183","Hospital","Monday - Thursday");
  Person person12 = new Person(121212,"Winston","Churchill","double-barrelled@gmail",46,"+996784512165","British Army","Thursday-monday, 5-8");
  Person person13 = new Person(131313,"Stan","Marsh","Randall",10,"+996123485794","Sought park","Thursday-Saturday,9-5 ");
  Person person14 = new Person(141414,"Gibby","Fly","flyLifespan@gmail",1,"+996021548796","School","only sunday");
  Person person15 = new Person(151515,"Nora","Nor","aroN@gmail",65,"+785879531859","Bakery","not always");


  Person[]people1 = {person15,person9,person3,person10,person11};
  Person[]people2 = {person4,person5,person12,person13};
  Person[]people3 = {person6,person7,person14};
  Person[]people4 = {person8,person2,person1};


  House house1 = new CrazyHouse(111222,"CrazyHouse","Baker street 221b ",70005,2016, people1);
  House house2 = new FashTeamHouse(333444,"FashTeamHouse","58 Avenue",70055,2046,people2);
  House house3 = new StarHouse(555666,"StarHouse"," StarFours street ",70555,2061,people3);
  House house4 = new VipHouse(777888,"VipHouse","3 Avenue ",84415,2042,people4);



        House [] houses ={house1,house2,house3,house4};
        for (House i:houses) {
            out.println(i.getHouseName());
            out.println("House ID: "+i.getHouseId());
            out.println("Name: "+i.getHouseName());
            out.println("Address: "+i.getHouseAddress());
            out.println("Price: "+i.getHousePrice());
            out.println("House Year: "+i.getHouseYear());

            if(i.getClass().getSimpleName().equals("CrazyHouse")){
                out.println(people1.length + " person lives in house");
                for (Person j:people1) {
                    out.println("Person ID: " + j.getPersonId());
                    out.println("Person first name: " + j.getFirstName() + "\nPerson last name: " + j.getPersonLastName());
                    out.println("Person email: " + j.getPersonEmail());
                    out.println("Person age: " + j.getPersonAge());
                    out.println("Person phone number: " + j.getPersonPhonNumber());
                    out.println("Person work: " + j.getWork());
                    out.println("Time table: ");
                    j.timeTable();
                    System.out.print("pay for electricity:");
                    i.electricity(people1.length * 150);

                    house1.city();
                    house1.house();

                    out.println("-------------------------------------------------------------");
                }
            }
            if(i.getClass().getSimpleName().equals("FashTeamHouse")){
                out.println(people2.length+" person lives in house");
                for (Person j:people2) {
                    out.println("Person ID: "+j.getPersonId());
                    out.println("Person first name: "+j.getFirstName()+"\nPerson last name: "+j.getPersonLastName());
                    out.println("Person email: "+j.getPersonEmail());
                    out.println("Person age: "+j.getPersonAge());
                    out.println("Person phone number: "+j.getPersonPhonNumber());
                    out.println("Person work: "+j.getWork());

                System.out.print("pay for electricity:" );
                i.electricity(people2.length*150);

                house2.city();
                house2.house();

                    out.println("-------------------------------------------------------------");
                }
            }
            if(i.getClass().getSimpleName().equals("StarHouse")){
                out.println(people3.length+" person lives in house");
                for (Person j:people3) {
                    out.println("Person ID: "+j.getPersonId());
                    out.println("Person first name: "+j.getFirstName()+"\nPerson last name: "+j.getPersonLastName());
                    out.println("Person email: "+j.getPersonEmail());
                    out.println("Person age: "+j.getPersonAge());
                    out.println("Person phone number: "+j.getPersonPhonNumber());
                    out.println("Person work: "+j.getWork());

                System.out.print("pay for electricity:" );
                i.electricity(people3.length*150);

                house3.city();
                house3.house();

                    out.println("-------------------------------------------------------------");
                }
            }
            if(i.getClass().getSimpleName().equals("VipHouse")){
                out.println(people4.length+" person lives in house");
                for (Person j:people4) {
                    out.println("Person ID: "+j.getPersonId());
                    out.println("Person first name: "+j.getFirstName()+"\nPerson last name: "+j.getPersonLastName());
                    out.println("Person email: "+j.getPersonEmail());
                    out.println("Person age: "+j.getPersonAge());
                    out.println("Person phone number: "+j.getPersonPhonNumber());
                    out.println("Person work: "+j.getWork());

                System.out.print("pay for electricity:" );
                i.electricity(people4.length*150);

                house4.city();
                house4.house();

                    out.println("-------------------------------------------------------------");
                }
            }
            out.println("---------------------------------------------------------------------");


        }
    }
}