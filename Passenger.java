// Kelas Passenger
class Passenger {
    String name;
    Passenger next;

    // Konstruktor untuk Passenger
    public Passenger(String name) {
        this.name = name;
        this.next = null;
    }
}

// Kelas Flight
class Flight {
    private Passenger head; // Pointer ke penumpang pertama

    // Metode untuk menambah penumpang di akhir daftar
    public void addPassenger(String name) {
        Passenger newPassenger = new Passenger(name);

        // Jika daftar kosong, set sebagai penumpang pertama
        if (head == null) {
            head = newPassenger;
        } else {
            Passenger current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newPassenger;
        }
    }

    // Metode untuk menghapus penumpang berdasarkan nama
    public void removePassenger(String name) {
        if (head == null) {
            System.out.println("Daftar penumpang kosong.");
            return;
        }

        // Jika penumpang yang ingin dihapus adalah yang pertama
        if (head.name.equals(name)) {
            head = head.next;
            System.out.println(name + " telah dihapus dari daftar.");
            return;
        }

        Passenger current = head;
        while (current.next != null && !current.next.name.equals(name)) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Penumpang dengan nama " + name + " tidak ditemukan.");
        } else {
            current.next = current.next.next;
            System.out.println(name + " telah dihapus dari daftar.");
        }
    }

    // Metode untuk menampilkan semua penumpang
    public void displayPassengers() {
        if (head == null) {
            System.out.println("Tidak ada penumpang dalam daftar.");
            return;
        }

        Passenger current = head;
        System.out.println("Daftar Penumpang:");
        while (current != null) {
            System.out.println(current.name);
            current = current.next;
        }
    }
}
