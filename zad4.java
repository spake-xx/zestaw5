package jakub.ciszewski;

import java.util.Scanner;

public class zad4 {
    private static String flipCase(String text){
        char[] text_arr = text.toCharArray();

        for(int i=0; i<text_arr.length; i++){
            if(text_arr[i]>=97){
                text_arr[i] = (char)(text_arr[i]-32);
            }else{
                text_arr[i] = (char)(text_arr[i] + 32);
            }
        }

        return String.valueOf(text_arr);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Podaj lancuch:");
        String text = reader.nextLine();

        System.out.println(flipCase(text));
    }
}
