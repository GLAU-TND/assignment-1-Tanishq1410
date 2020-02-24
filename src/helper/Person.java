package helper;

public class Person implements Comparable<Person> {

    private String firstName;                   //First name of person
    private String lastName;                    //Last name of person
    private String emailID;                     //EmailId of person
    private StringBuffer phoneNumbers;          //Phone numbers of person

    //Getter for first name
    public String getFirstName() {
        return firstName;
    }

    //Setter for first name
    public void setFirstName(String firstName) {
        System.out.println(firstName);
        this.firstName = firstName;
    }

    //Getter for last name
    public String getLastName() {
        return lastName;
    }

    //Setter for last name
    public void setLastName(String lastName) {
        System.out.println(lastName);
        this.lastName = lastName;
    }
}
