import java.util.*;

public class MyPhoneBook {
    private Map<String, List<String>> phoneBook;

    public MyPhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        if (phoneBook.containsKey(name)) {
            List<String> phoneNumbers = phoneBook.get(name);
            phoneNumbers.add(phoneNumber);
        } else {
            List<String> phoneNumbers = new ArrayList<>();
            phoneNumbers.add(phoneNumber);
            phoneBook.put(name, phoneNumbers);
        }
    }

    public void printPhoneBook() {

        List<Map.Entry<String, List<String>>> list = new ArrayList<>(phoneBook.entrySet());

        list.sort(Comparator.comparingInt(entry -> entry.getValue().size()));
        Collections.reverse(list);

        for (Map.Entry<String, List<String>> el : list) {
            String name = el.getKey();
            List<String> phoneNumbers = el.getValue();
            System.out.printf("name: %s; phones: %s\n", name, phoneNumbers);
        }
    }
}

