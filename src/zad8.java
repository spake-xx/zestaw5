import java.util.Scanner;

public class zad8 {
    private static int wordCount(String text){
        char[] text_arr = text.toCharArray();
        int liczba_slow = 1;

        for(int i=0; i<text_arr.length; i++){
            if(Character.isWhitespace(text_arr[i])) liczba_slow++;
        }

        return liczba_slow;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Podaj łańcuch znaków:");
        String text = reader.nextLine();

        System.out.println(wordCount(text));
    }
}
