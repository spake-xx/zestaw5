import java.util.Scanner;

public class zad11 {
    private static String strcut(String text, int from, int chars){
        char[] text_arr = text.toCharArray();
        int dlugosc = from+from+chars;
        char[] new_text = new char[dlugosc];

        int k=0;
        for(int i=0; i<text_arr.length; i++){
            if(i<from || i>dlugosc){
                new_text[k] = text_arr[i];
                k++;
            }
        }

        return new String(new_text);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Podaj łańcuch znaków:");
        String text = reader.nextLine();
        System.out.println("Podaj od ktorej pozycji");
        int from = reader.nextInt();
        System.out.println("Podaj ile znakow");
        int chars = reader.nextInt();

        System.out.println(strcut(text, from, chars));
    }
}
