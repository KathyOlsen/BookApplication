public class Book {
    private String title;
    private String author;
    private String description;
    private double price;
    private boolean inStock;

    public Book(){

    }

    public Book(String title, String author, String description, double price, boolean inStock){
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.inStock = inStock;
    }
    public static void getDisplayText(String author, String title, String description){
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean inStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
}
