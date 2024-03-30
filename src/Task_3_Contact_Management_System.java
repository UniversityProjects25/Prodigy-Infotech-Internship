import java.util.Scanner;
import java.util.ArrayList;


class Contact{
    private String name;
    private String phoneNumber;
    private String email;
    private String flush;

    public Contact(String name, String phoneNumber, String email){
        this.name = name;
        this.phoneNumber= phoneNumber;
        this.email = email;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }
    @Override
    public String toString(){
        return "Name: " + name + " | Phone Number: " + phoneNumber + " | Email: " + email;
    }
}


public class Task_3_Contact_Management_System {
    private static  ArrayList<Contact> contacts = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while(true ){
            System.out.println("Welcome to Contact Management System Menu: ");
            System.out.println("1. Add a new Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Edit a Contact");
            System.out.println("4. Delete a Contact");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    addContact();
                    break;
                case 2:
                    viewContacts();
                    break;
                case 3:
                    editContact();
                    break;
                case 4:
                    deleteContact();
                    break;
                case 5:

                    System.out.println("Exiting the Contact Management System.......");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");


            }


        }
    }

    public static void addContact() {
        System.out.println("Enter name of the person: ");
        String name = sc.nextLine();
        System.out.println("Enter Phone Number of the person: ");
        String phoneNumber = sc.nextLine();
        System.out.println("Enter Email Id of the person: ");
        String email = sc.nextLine();

        Contact contact = new Contact(name,phoneNumber,email);
        contacts.add(contact);
        System.out.println("New Contact is added Successfully! ");

    }

    public static void viewContacts(){
        if(contacts.isEmpty()){
            System.out.println("No Contacts found");
        }
        else{
            System.out.println("Contacts: ");
            for(Contact contact:contacts){
                System.out.println(contact);
            }
        }
    }

    public static void editContact(){
        System.out.println("Enter the name of the contact to edit: ");
        String name = sc.nextLine();
        boolean found = false;
        for (Contact contact:contacts){
            if(contact.getName().equalsIgnoreCase(name)){
                System.out.println("Enter new Phone Number: ");
                String phoneNumber = sc.nextLine();
                System.out.println("Enter new Email Id: ");
                String email = sc.nextLine();
                contact.setPhoneNumber(phoneNumber);
                contact.setEmail(email);
                System.out.println("Contact details updated Successfully ");
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Contact not found.");
        }
    }

    public static void deleteContact(){
        System.out.println("Enter the name of the Contact to delete:");
        String name = sc.nextLine();
        for(int i=0; i<contacts.size();i++){
            if(contacts.get(i).getName().equalsIgnoreCase(name)){
                contacts.remove(i);
                System.out.println("Contact deleted Successfully!");
                return;
            }
        }
        System.out.println("Contact not Found.");

    }

}

























