import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Morse morse = new Morse();
        Reverse reverse = new Reverse();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input English or Morse to translate.(only a-z, 0-9 and ,.? ):");

        String input = scanner.nextLine();

        String output = null;

        if (input.contains("-") || input.contains("*")) {
            output = reverse.getKey(input);

        } else {
            output = morse.getOther(input.toUpperCase());
        }

        if (output != null) {
            System.out.println(output);
        } else {
            System.out.println("Incorrect input.");

        }
        scanner.close();
    }

}