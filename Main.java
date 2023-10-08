public class Main {

    public static void main(String[] args) {

        MyPhoneBook phoneBook = new MyPhoneBook();

        phoneBook.addContact("Петров", "79478473");
        phoneBook.addContact("Петров", "79362374");
        phoneBook.addContact("Васильев", "79374629");
        phoneBook.addContact("Васильев", "79217563");
        phoneBook.addContact("Петров", "79472957");
        phoneBook.addContact("Гаврилов", "79658204");
        phoneBook.addContact("Федоров", "791745720");

        phoneBook.printPhoneBook();

    }
}