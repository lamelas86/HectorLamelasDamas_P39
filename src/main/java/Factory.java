public class Factory {
    public static void main(String[] args) {

        Car car1 = new Car("1234-DF", "Seat", "Toledo",
                "blue", false, 200, 3, 5);
        Car car2 = new Car("5678-AG", "Fiat", "Uno",
                "red", true, 300, 3, 2);
        Car car3 = new Car("9012-HH", "BMW", "850",
                "grey", false, 400, 5, 5);
        Car car4 = new Car("3456-XS", "VW", "Caddy",
                "white", true, 500, 5, 7);
    }
}
