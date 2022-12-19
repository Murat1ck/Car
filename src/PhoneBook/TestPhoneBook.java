package PhoneBook;

public class TestPhoneBook {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("Alexandr", "+79113817454");
        phoneBook.addContact("Andrey", "+79123817454");
        phoneBook.addContact("Oleg", "+79133817454");
        phoneBook.addContact("Anna", "+79113837454");
        phoneBook.addContact("Dmitriy", "+79114817454");
        phoneBook.addContact("Pavel", "+79113817464");
        phoneBook.addContact("Artem", "+79513817454");
        phoneBook.addContact("Zachem", "+79113517454");
        phoneBook.addContact("Tak", "+79113917454");
        phoneBook.addContact("Mnogo", "+79110817454");
        phoneBook.addContact("Kontactov", "+79313817454");
        phoneBook.addContact("Ustal", "+79113813454");
        phoneBook.addContact("Copy", "+79113867454");
        phoneBook.addContact("Paste", "+79113417454");
        phoneBook.addContact("Odin", "+79113317454");
        phoneBook.addContact("Dva", "+79113117454");
        phoneBook.addContact("Tri", "+79112817454");
        phoneBook.addContact("Che", "+79113817459");
        phoneBook.addContact("Five", "+79113811454");
        phoneBook.addContact("Alexandr", "+79116817454");

        System.out.println(phoneBook);

        phoneBook.removeContact("Che");
        System.out.println(phoneBook);
    }
}

