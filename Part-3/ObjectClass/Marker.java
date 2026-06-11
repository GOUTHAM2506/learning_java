class Marker {
    String brand;
    double price;
    String color;

    Marker(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Brand : " + this.brand + "\nPrice : " + this.price + "\nColor : " + this.color
                + "\n------------------------";
    }

    @Override
    public boolean equals(Object obj) {
        Marker m = (Marker) obj;
        return (this.brand.equals(m.brand)) && this.price == m.price && (this.color.equals(m.color));
    }

    public static void main(String[] args) {
        Marker m1 = new Marker("Camlin", 50, "Blue");
        Marker m2 = new Marker("Ohuhu", 60, "Black");
        Marker m3 = new Marker("Camlin", 50, "Blue");
        //Marker m4 = new Marker("Apsara", 40, "Red");

        System.out.println(m1.toString());

        System.out.println(m1 == m2);
        System.out.println(m1 == m3);

        if (m1.equals(m3))
            System.out.println("Both brand are same!!");
        else
            System.out.println("Both brand are not same!!");
    }
}
