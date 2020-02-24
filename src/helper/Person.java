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

    //Getter for Email ID
    public String getEmailID() {
        return emailID;
    }

    //Setter for EmailID
    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    //Getter for fetching all phone numbers
    public StringBuffer getPhoneNumber() {
        return this.phoneNumbers;
    }

    //Setter for inserting new phone numbers
    public void setPhoneNumbers(String phoneNumber) {
        if (phoneNumbers == null) {
            this.phoneNumbers = new StringBuffer(phoneNumber);
        } else {
            this.phoneNumbers.append(", " + phoneNumber);
        }
    }


}
