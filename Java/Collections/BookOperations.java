import java.util.*;

class Book {
      private String isbn;
      private String name;
      private double price;

      public Book(String isbn, String name, double price) {
            this.isbn = isbn;
            this.name = name;
            this.price = price;
      }

      public String getIsbn() {
            return isbn;
      }
      public String getName() {
            return name;
      }
}

public class BookOperations {
      public static void main(String[] args) {
            Book b1 = new Book("978-0672315829", "Java Programming", 49.99);
            Book b2 = new Book("978-0596009205", "Head First Java", 39.99);
            Book b3 = new Book("978-0132350884", "Effective Java", 54.99);

            List<Book> arrayList = new ArrayList<>();
            arrayList.add(b1);
            arrayList.add(b2);
            arrayList.add(b3);

            List<Book> linkedList = new LinkedList<>(arrayList);

            Deque<Book> arrayDeque = new ArrayDeque<>(arrayList);

            PriorityQueue<Book> priorityQueue = new PriorityQueue<>(arrayList.size(), Comparator.comparing(Book::getName));

            Set<Book> hashSet = new HashSet<>(arrayList);

            Set<Book> treeSet = new TreeSet<>(Comparator.comparing(Book::getName));
            treeSet.addAll(arrayList);

            Map<String, Book> hashMap = new HashMap<>();
            for (Book book : arrayList) {
                  hashMap.put(book.getIsbn(), book);
            }

            Map<String, Book> linkedHashMap = new LinkedHashMap<>();
            for (Book book : arrayList) {
                  linkedHashMap.put(book.getIsbn(), book);
            }

            System.out.println("ArrayList: " + arrayList);
            System.out.println("LinkedList: " + linkedList);
            System.out.println("ArrayDeque: " + arrayDeque);
            System.out.println("PriorityQueue: " + priorityQueue);
            System.out.println("HashSet: " + hashSet);
            System.out.println("TreeSet: " + treeSet);
            System.out.println("HashMap: " + hashMap);
            System.out.println("LinkedHashMap: " + linkedHashMap);
      }
}
