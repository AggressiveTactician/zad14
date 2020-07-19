public class Main {

    public static void main(String[] args) {
        // Napisz program, który pobierze od użytkownika dwie małe litery alfabetu łacińskiego (typ char)  i  wyliczy,  ile  znaków  stoi  w  alfabecie  pomiędzy  podanymi  literami.
        // Podpowiedź – skorzystaj z tablicy kodów ASCII i traktuj znaki jak liczby int

        Zadanie14 zadanie14 = new Zadanie14();
        Zadanie14.Chars aChar = zadanie14.getChar();
        System.out.println(zadanie14.getResult(aChar));
    }
}