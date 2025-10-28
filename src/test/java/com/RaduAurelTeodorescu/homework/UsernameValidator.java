import java.util.Scanner;

public class UsernameValidator {
    public static void main(String[] args) {

        String username;
        int i;
        boolean validare1;
        boolean validare2;
        boolean validareFinala;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Introdu username-ul:");
            username = scanner.nextLine();
            validareFinala = true;

            if (username.length() > 6 && username.length() < 12) {

            }
            else {
                System.out.println("Username-ul are sub 6 caractere sau peste 12. Introdu altul.");
                validareFinala=false;
            }
                    validare1=false;
                    validare2=false;
                    for (i = 0; i < username.length(); i++) {
                        char element = username.charAt(i);

                        if (Character.isLetter(element)) {
                            validare1=true;
                            }
                        if (Character.isDigit(element)) {
                            validare2=true;
                                }
                        if (Character.isWhitespace(element)) {
                            System.out.println("Username-ul contine spatii. Introdu un nou username.");
                            validareFinala=false;
                            break;
                                    }
                    }
                    if (!validare1){
                        System.out.println("Username-ul nu contine litere. Reintrodu username-ul.");
                        validareFinala=false;
                    }

            if (!validare2) {
                System.out.println("Username-ul nu contine cifre. Reintrodu username-ul.");
                validareFinala=false;
            }



        } while (!validareFinala) ;
            System.out.println("Username acceptat: " + username);
            scanner.close();
    }
}