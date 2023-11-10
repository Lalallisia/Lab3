class Customer {
    private String name;
    private int age;
    private String email;

    Customer(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    String getEmail() {
        return email;
    }

    void setEmail(String email) {
        this.email = email;
    }

    void purchaseProduct(CosmeticProduct product) {
        System.out.println(name + " придбав товар " + product.getName() + " від бренду " + product.getBrand() + " за " + product.getPrice() + " грн");
    }

    void returnProduct(CosmeticProduct product) {
        System.out.println(name + " повернув товар " + product.getName() + " до магазину");
    }

    void purchaseProduct(double amount) {
        System.out.println(name + " придбав товар на суму " + amount + " грн.");
    }

    static void processProductInfo(Customer customer) {
        System.out.println("Покупець " + customer.getName() + " обробив інформацію про товар.");
    }
}