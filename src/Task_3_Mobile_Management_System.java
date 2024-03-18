import java.io.*;
import java.util.*;

class Contact implements Serializable{
    private String name;
    private String phone;
    private String email;

    public Contact(String name, String phone, String email){
        this.name = name;
        this.phone = phone;
        this.email = email;

    }
    public String getName(){
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString(){
        return "Name:" + name + "Phone:" + phone + "Email" + email;
    }
}
//public class ContactManager {
//    private static final String FILE_NAME  = "contacts.dat";
//    private List<Contact> contacts;
//
//    public ContactManager(){
//        contacts = new ArrayList<>();
//        loadContacts();
//
//    }
//    private void loadContacts(){
//
//    }
//}

public class Task_3_Mobile_Management_System {
}
