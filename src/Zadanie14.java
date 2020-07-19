import java.util.Scanner;

public class Zadanie14 {
    public static class Chars {
        public Chars(char sign1, char sign2) {
            this.sign1 = sign1;
            this.sign2 = sign2;
        }

        private char sign1;
        private char sign2;

        public char getSign1() {
            return sign1;
        }

        public char getSign2() {
            return sign2;
        }
    }

    Scanner scanner = new Scanner(System.in);

    public Chars getChar() {
        System.out.println("Podaj pierwszą z małych liter: ");
        char sign1 = scanner.next().charAt(0);
        System.out.println("Podaj drugą z małych liter: ");
        char sign2 = scanner.next().charAt(0);
        Chars chars = new Chars(sign1, sign2);
        return chars;
    }

    public int getResult(Chars chars) {
        return Math.abs(chars.getSign2() - chars.getSign1());
    }
}