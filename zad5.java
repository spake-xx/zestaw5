package jakub.ciszewski;

import java.util.Scanner;

public class zad5 {
    private static boolean startsWith(String text, String prefix){
        char[] text_arr = text.toCharArray();
        char[] prefix_arr = prefix.toCharArray();

        boolean startsWith = true;
        for(int i=0; i<prefix_arr.length; i++){
            if(prefix_arr[i]!=text_arr[i]) startsWith = false;
        }

        return startsWith;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Podaj lancuch:");
        String text = reader.nextLine();
        System.out.println("Podaj prefix:");
        String prefix = reader.nextLine();

        System.out.println(startsWith(text, prefix)?"Jest prefiksem":"Nie jest prefiksem");
    }
}
