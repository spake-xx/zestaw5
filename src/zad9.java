import java.util.Scanner;

public class zad9 {
    private static String[] podzielNaSlowa(String text){
        String[] slowa = text.split(" ");

        return slowa;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Podaj łańcuch znaków:");
        String text = reader.nextLine();

        System.out.println(podzielNaSlowa(text).length);
    }
}
