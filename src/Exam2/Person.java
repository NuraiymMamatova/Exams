package Exam2;


public class Person {
    private  int personId;
    private String personFirstName;
    private String personLastName;
    private String personEmail;
    private int personAge;
    private String personPhonNumber;
    private String work;

    private String timeTable;

    Person (int personId,String personFirstName,String personLastName,String personEmail,int personAge,String personPhonNumber,String work,String timeTable){
        this.timeTable = timeTable;
        this.work = work;
        this.personId = personId;
        this.personFirstName = personFirstName;
        this.personLastName = personLastName;
        this.personEmail = personEmail;
        this.personAge = personAge;
        this.personPhonNumber = personPhonNumber;









    }

    void work(){
System.out.println(personFirstName+" "+ personLastName +work);
    }

    void timeTable(){
        System.out.println(timeTable);
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    int getPersonId(){
        return personId;
    }
    void setPersonId(int personId){
        this.personId = personId;
    }

    String getFirstName(){
        return personFirstName;
    }
    void setFirstName (String personFirstName){
        this.personFirstName = personFirstName;
    }

    String getPersonLastName(){
        return personLastName;
    }
    void setPersonLastName(String personLastName){
        this.personLastName = personLastName;
    }

    String getPersonEmail(){
        if (!personEmail.contains("@")){
            System.out.println("@ Жок кайрадан текшериниз");
        }
        return personEmail;
    }
    void setPersonEmail(String personEmail){
        this.personEmail = personEmail;
    }

    int getPersonAge(){
         if (personAge<0 && personAge>110 ){
            System.out.println("Терс сан берууго жана жок жаш берууго болбойт");
        }
        return personAge;
    }
    void setPersonAge(int personAge){
        this.personAge = personAge;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", personFirstName='" + personFirstName + '\'' +
                ", personLastName='" + personLastName + '\'' +
                ", personEmail='" + personEmail + '\'' +
                ", personAge=" + personAge +
                ", personPhonNumber='" + personPhonNumber + '\'' +
                ", work='" + work + '\'' +
                ", timeTable='" + timeTable + '\'' +
                '}';
    }

    String getPersonPhonNumber(){
        if(!personPhonNumber.startsWith("+996")){
            System.out.println("Кыргыз номер бериниз");
        }
        return personPhonNumber;
    }
    void setPersonPhonNumber(String personPhonNumber){
        this.personPhonNumber = personPhonNumber;
    }

    public String getTimeTable() {
        return timeTable;
    }

    public void setTimeTable(String timeTable) {
        this.timeTable = timeTable;
    }

}
