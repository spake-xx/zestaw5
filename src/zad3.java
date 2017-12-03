import java.util.Scanner;

public class zad3 {
    private static int strpos(String text, char z){
        char[] text_arr = text.toCharArray();
        for(int i=0; i<text_arr.length; i++){
            if(text_arr[i]==z) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Podaj lancuch:");
        String text = reader.nextLine();
        System.out.println("Podaj szukany znak:");
        char z = reader.nextLine().charAt(0);

        System.out.println(strpos(text, z));
    }
}
