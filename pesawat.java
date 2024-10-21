public class pesawat {
    public static void pesawat(String[] args) {
        Flight flight = new Flight();

        flight.addPassenger("John Doe");
        flight.addPassenger("Jane Smith");
        flight.addPassenger("Alice Johnson");

        flight.displayPassengers();  // Menampilkan semua penumpang

        flight.removePassenger("Jane Smith");
        flight.displayPassengers();  // Menampilkan daftar penumpang setelah penghapusan
    }
}    