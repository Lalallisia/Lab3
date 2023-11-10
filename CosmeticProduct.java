class CosmeticProduct {
    private String name;
    private double price;
    private String brand;

    CosmeticProduct(String name, double price, String brand) {
        this.name = name;
        this.price = price;
        this.brand = brand;
    }

    CosmeticProduct(String name, double price) {
        this.name = name;
        this.price = price;
        this.brand = "Невідомий бренд";
    }

    CosmeticProduct(String name) {
        this.name = name;
        this.price = 0.0;
        this.brand = "Невідомий бренд";
    }

    CosmeticProduct() {
        this.name = "Без назви";
        this.price = 0.0;
        this.brand = "Невідомий бренд";
    }

    // Геттер для поля name
    String getName() {
        return name;
    }

    // Сеттер для поля name
    void setName(String name) {
        this.name = name;
    }

    // Геттер для поля price
    double getPrice() {
        return price;
    }

    // Сеттер для поля price
    void setPrice(double price) {
        this.price = price;
    }

    // Геттер для поля brand
    String getBrand() {
        return brand;
    }

    // Сеттер для поля brand
    void setBrand(String brand) {
        this.brand = brand;
    }

    String getProductInfo() {
        return "Назва: " + name + ", Бренд: " + brand + ", Ціна: " + price + " грн";
    }

    void use(int times) {
        System.out.println("Ви використали товар " + name + " " + times + " разів.");
    }

    static void processProductInfo(CosmeticProduct product) {
        System.out.println("Інформація про товар: " + product.getName() + ", Бренд: " + product.getBrand());
    }

    void useAnotherProduct(CosmeticProduct anotherProduct) {
        System.out.println("Ціна іншого продукту: " + anotherProduct.getPrice());
        System.out.println("Бренд іншого продукту: " + anotherProduct.getBrand());
    }

    CosmeticProduct withNewPrice(double newPrice) {
        return new CosmeticProduct(name, newPrice, brand);
    }

    void printStringRecursively(String str, int count) {
        if (count <= 0) {
            return;
        }

        System.out.println(str);
        printStringRecursively(str, count - 1);
    }

    void reducePriceRecursively() {
        if (price > 10.0) {
            System.out.println("Зменшення ціни товару " + name + " до " + price + " грн");
            price -= 5.0;
            reducePriceRecursively();
        } else {
            System.out.println("Ціна товару " + name + " вже не може бути зменшена.");
        }
    }

    private void privateMethod() {
        System.out.println("Це приватний метод.");
    }

    // Публічний метод, який викликає приватний метод і повертає результат
    public String callPrivateMethod() {
        privateMethod();
        return "Результат роботи публічного методу.";
    }
}