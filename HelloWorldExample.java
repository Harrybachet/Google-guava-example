
//
//import java.util.Collection;
//// Google Guava, Interface Multimap: https://bit.ly/2qWXeyW
//// Google Guava, Download https://bit.ly/2Hpo2PA
//import com.google.common.collect.ArrayListMultimap;
//import com.google.common.collect.Multimap;
//
///**
// * @author Duc Ta PLUS
// */
//public class Main{
//
//    public static void main(String[] args) {
//        Multimap<String, String> tinyBook = ArrayListMultimap.create();
//
//        // Adding some key/value
//        System.out.println("\nAdding----------------------------------------");
//        tinyBook.put("book", "A set of pages.");
//        tinyBook.put("book", "To arrange something on a particular date.");
//        tinyBook.put("bookable", "Can be ordered.");
//        tinyBook.put("bookbinder", "A person who fastens the pages of books.");
//        tinyBook.put("bookcase", "A piece of furniture with shelves.");
//
//        // Getting the size
//        System.out.println("\nSize------------------------------------------");
//        System.out.println(tinyBook.size());  // 5
//
//        // Getting values
//        System.out.println("\nValues----------------------------------------");
//        Collection<String> book = tinyBook.get("book");
//        System.out.println(book);
//        // [A set of pages., To arrange something on a particular date.]
//
//        Collection<String> bookcase = tinyBook.get("bookcase");
//        System.out.println(bookcase);
//        // [A piece of furniture with shelves.]
//
//        // Iterating over entire Mutlimap
//        System.out.println("\nIterate---------------------------------------");
//        tinyBook.values().forEach((value) -> {
//            System.out.println(value);
//        });
//
//        // Getting hash codes
//        System.out.println("\nHash Codes-------------------------------------");
//        tinyBook.entries().forEach((entry) -> {
//            System.out.println(entry.hashCode() + "\t"
//                    + System.identityHashCode(entry));
//        });
//
//        System.out.println("\nHash Code--------------------------------------");
//        System.out.print(tinyBook.hashCode() + "\t");
//        System.out.println(System.identityHashCode(tinyBook));
//
//        // Removing a single value
//        System.out.println("\nRemove----------------------------------------");
//        tinyBook.remove("bookcase", "A piece of furniture with shelves.");
//        System.out.println(tinyBook.get("bookcase")); // []
//
//        // Remove all values for a key
//        System.out.println("\nRemove All------------------------------------");
//        tinyBook.removeAll("book");
//        System.out.println(tinyBook.get("book")); // []
//    }
//}

// A simple greeting with the enum and google guava library //
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

enum Greeting {
    ENGLISH("Hello, World!"),
    SPANISH("¡Hola, Mundo!"),
    FRENCH("Bonjour, le Monde!");

    private final String message;

    Greeting(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

public class HelloWorldExample {
    public static void main(String[] args) {
        // Create a Guava Multimap to hold Greeting data //
        Multimap<Greeting, String> greetingMultimap = ArrayListMultimap.create();

        // Populate the Multimap using data from Enum //
        for (Greeting greeting : Greeting.values()) {
            greetingMultimap.put(greeting, greeting.getMessage());
        }

        // Output the greetings in the Multimap //
        for (Greeting greeting : greetingMultimap.keySet()) {
            for (String message : greetingMultimap.get(greeting)) {
                System.out.println(message);
            }
        }
    }
}




















