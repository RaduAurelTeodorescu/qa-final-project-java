public class Main {
    public static void main(String[] args) {
        UserRepository repo = new UserRepository();

        try {
            User user1 = new User("testuser", 25);
            repo.addUser(user1);
            System.out.println("Utilizator adăugat: " + user1);
        } catch (InvalidUserDataException e) {
            System.out.println("Eroare: " + e.getMessage());
        }

        try {
            AdminUser admin = new AdminUser("admin", 30, "full_access");
            repo.addUser(admin);
            System.out.println("Utilizator adăugat: " + admin);
        } catch (InvalidUserDataException e) {
            System.out.println("Eroare: " + e.getMessage());
        }

        try {
            User badUser1 = new User("ab", 22);
            repo.addUser(badUser1);
            System.out.println("Utilizator adăugat: " + badUser1);
        } catch (InvalidUserDataException e) {
            System.out.println("Eroare: " + e.getMessage());
        }

        try {
            User badUser2 = new User("baduser", -5);
            repo.addUser(badUser2);
            System.out.println("Utilizator adăugat: " + badUser2);
        } catch (InvalidUserDataException e) {
            System.out.println("Eroare: " + e.getMessage());
        }

        System.out.println("\n--- Utilizatori valizi înregistrați ---");
        for (User u : repo.getUsers()) {
            System.out.println(u);
        }
    }
}
