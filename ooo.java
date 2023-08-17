public class ooo {
    public static void main(String[] args) {
        product a = new product("chair", 500.0);
        Electronics s = new Electronics("Television", 20000.0, "Samsung", "Neo QLED");
        Smartphone w = new Smartphone("Iphone", 40000.0, "Apple", "Iphone 99", "ios");
        Book d = new Book("OOP Programming", 250.0, "John", 300);

        a.display();
        System.out.println("*******************");
        s.display();
        System.out.println("*******************");
        w.display();
        System.out.println("*******************");
        d.display();

    }
}

class product {
    private String name;
    private Double price;

    public product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public Double getprice() {
        return price;
    }

    public void setName(Double price) {
        this.price = price;
    }

    public void display() {
        System.out.println("Product Name : " + name);
        System.out.println("Product Price : " + price);
    }
}

class Electronics extends product {
    private String brand;
    private String model;

    public Electronics(String name, Double price, String brand, String model) {
        super(name, price);
        this.brand = brand;
        this.model = model;
    }

    public String getbrand() {
        return brand;
    }

    public void setbrand(String brand) {
        this.brand = brand;
    }

    public String getmodel() {
        return model;
    }

    public void setprice(String model) {
        this.model = model;
    }

    public void display() {
        super.display();
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
    }
}

class Smartphone extends Electronics {
    private String OperatingSystem;

    public Smartphone(String name, Double price, String brand, String model, String OperatingSystem) {
        super(name, price, brand, model);
        this.OperatingSystem = OperatingSystem;

    }

    public String getOperatingSystem() {
        return OperatingSystem;
    }

    public void setOperatingSystem(String OperatingSystem) {
        this.OperatingSystem = OperatingSystem;
    }

    public void display() {
        super.display();
        System.out.println("Operating System : " + OperatingSystem);
    }
}

class Book extends product {

    private String author;
    private int pages;

    public Book(String name, Double price, String author, int pages) {
        super(name, price);
        this.author = author;
        this.pages = pages;
    }

    public String getauthor() {
        return author;
    }

    public void setpauthor(String author) {
        this.author = author;
    }

    public int getpages() {
        return pages;
    }

    public void setpages(int pages) {
        this.pages = pages;
    }

    public void display() {
        super.display();
        System.out.println("Author : " + author);
        System.out.println("Number of Pages : " + pages);
    }

}
