import java.util.Scanner;

public class zad10 {
    private static int strfindandcount(String text, String co){
        char[] text_arr = text.toCharArray();
        char[] co_arr = co.toCharArray();

        int wystapienia = 0;

        for(int i=0; i<text_arr.length; i++){
            if(text_arr[i]==co_arr[0]){
                int k=0;
                int ilosc_zgodnych=0;
                while(k<co_arr.length && (k+i)<text_arr.length && co_arr[k]==text_arr[k+i]){
                    ilosc_zgodnych++;
                    k++;
                }

                if(ilosc_zgodnych==co_arr.length) wystapienia++;
            }
        }

        return wystapienia;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Podaj łańcuch znaków:");
        String text = reader.nextLine();
        System.out.println("Podaj co chcesz znalezc:");
        String co = reader.nextLine();

        System.out.println(strfindandcount(text, co));
    }
}
