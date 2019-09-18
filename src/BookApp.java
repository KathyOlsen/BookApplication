public class BookApp {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("Jumping Java Jellybeans");
        book.setAuthor("Java Joe");
        book.setDescription("All you ever wanted to know about Java but were afraid to ask.");
        book.setPrice(59.95);
        book.setInStock(true);

        System.out.println("Title:\t\t\t" + book.getTitle());
        System.out.println("Author:\t\t\t" + book.getAuthor());
        System.out.println("Description:\t" + book.getDescription());
    }
}
