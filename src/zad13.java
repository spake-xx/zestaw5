import java.util.Scanner;

public class zad13 {
    private static String poprzestawiaj(String text, int[] kolejnosc){
        char[] text_arr = text.toCharArray();
        char[] new_text = new char[text_arr.length];
        for(int i=0; i<kolejnosc.length; i++){
            new_text[i] = text_arr[kolejnosc[i]];
        }


        return new String(new_text);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Podaj łańcuch znaków:");
        String text = reader.nextLine();
        int[] kolejnosc = new int[text.length()];
        for(int i=0; i<text.length(); i++) {
            System.out.println("Podaj kolejnosc");
            kolejnosc[i] = reader.nextInt();
        }
        System.out.println(poprzestawiaj(text, kolejnosc));
    }
}
