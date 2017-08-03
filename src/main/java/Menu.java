import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);

    public void start() {

        Person person = new Person();

        while (true) {
            System.out.println("1 - add persor");
            System.out.println("2- print");
            System.out.println("3- сhange");
            System.out.println();
            switch (PrintScanner.getIntNumber()) {

                case 1:
                    addPerson(person);
                    break;

                case 2:
                    print(person);
                    break;

                case 3:
                    change(person);
                    break;
            }
        }

    }

    private void addPerson(Person person) {
        System.out.println("Enter first name");
        String firstName = sc.next();
        System.out.println("enter last name");
        String lastName = sc.next();
        System.out.println("Enter mail");
        String mail = sc.next();
        System.out.println("enter date of born");
        int date;
        while (true) {
            try {
                date = Integer.parseInt(sc.next());
                break;
            } catch (InputMismatchException e) {
                System.out.println("wrong someting");
            } catch (NumberFormatException e) {
                System.out.println("Enter int");
                e.printStackTrace();
            }catch (Exception e) {
                System.out.println("Enter int");
                continue;
            }
        }
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setMail(mail);
        person.setDate(date);
    }

    private void change(Person person) {
        System.out.println("Enter new name");
        String newName = sc.next();
        System.out.println("Enter last name");
        String lastName = sc.next();
        System.out.println("enter new email");
        String newEmail = sc.next();
        System.out.println("enter date of born");
        int date = 0;
        while (true) {
            try {
                date = Integer.parseInt(sc.next());
                break;
            } catch (InputMismatchException e) {
                System.out.println("hello ");
            } catch (NumberFormatException e) {
                System.out.println("Enter int");
                e.printStackTrace();
            }catch (Exception e) {
                System.out.println("Enter int");
                continue;
            }
        }
        person.setFirstName(newName);
        person.setLastName(lastName);
        person.setMail(newEmail);
        person.setDate(date);
    }

    private void print(Person person) {
        System.out.println(person.getFirstName() + " " + person.getLastName() + " " + person.getMail() + " " + person.getDate());
    }
}