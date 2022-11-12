import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("""
                        Please enter your command.
                        1- contacts -a <contact firstName> <contact lastName>
                        2- contacts -r <contact firstName> <contact lastName>
                        3- show -g <group name>
                        4- show -c <contact firstName> <contact lastName>
                        5- show
                        6- exit""");
                String[] line = input.nextLine().split(" ");
                switch (line[0]) {
                    case "contacts" -> {
                        if (line[1].equals("-a")) {
                            System.out.println("Please enter contact's group: ");
                            String group = input.nextLine();
                            System.out.println("Please enter contact's email: ");
                            String email = input.nextLine();
                            System.out.println("Please enter contact's country code: ");
                            String countryCode = input.nextLine();
                            System.out.println("Please enter contact's phone number: ");
                            String phoneNumber = input.nextLine();
                            System.out.println("Please enter contact's zip code: ");
                            String zipCode = input.nextLine();
                            System.out.println("Please enter contact's country: ");
                            String country = input.nextLine();
                            System.out.println("Please enter contact's city: ");
                            String city = input.nextLine();
                            phoneBook.addContact(new Contact(group, email, line[2], line[3], zipCode, country, city, countryCode, phoneNumber));
                        } else if (line[1].equals("-r")) {
                            if (phoneBook.deleteContact(line[2], line[3])) {
                                System.out.println("OK");
                            } else {
                                System.out.println("Not found.");
                            }
                        } else {
                            System.out.println("Wrong input.");
                        }
                    }
                    case "show" -> {
                        if (line.length > 1) {
                            if (line[1].equals("-g") && line.length == 3)
                                phoneBook.printContacts(phoneBook.findContacts(line[2]));
                            else if (line[1].equals("-c") && line.length == 4)
                                System.out.println(phoneBook.findContact(line[2], line[3]).toString());
                            else {
                                System.out.println("Wrong input.");
                            }
                        } else phoneBook.printContacts();
                    }
                    case "exit" -> System.exit(0);
                }
            }catch(Exception ignored){}
        }
    }
}