import java.util.Scanner;

public class zad15 {
    private static int[] HTMLColor2RGB(String text){
        char[] text_arr = text.toCharArray();
        int[] rgb = new int[3];

        int k=2;
        int first=0;
        int second=0;
        for(int i=text_arr.length-1; i>0 && text_arr[i]!='#'; i=i-2){
            if((int)(text_arr[i])>=65 && (int)(text_arr[i])<=90){
                first=Character.getNumericValue((int)(text_arr[i])-17)+10;
            }else{
                first=Character.getNumericValue((int)(text_arr[i]));
            }
            if((int)(text_arr[i-1])>=65 && (int)(text_arr[i-1])<=90){
                second=Character.getNumericValue((int)(text_arr[i-1])-17)+10;
            }else{
                second=Character.getNumericValue((int)(text_arr[i-1]));
            }

            rgb[k] = (int)(first*Math.pow(16, 0)) + (int)(second*Math.pow(16, 1));
            k--;
        }


        return rgb;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Podaj kolor HTML:");
        String text = reader.nextLine();

        int[] colors = HTMLColor2RGB(text);

        for(int x:colors){
            System.out.println(x);
        }
    }
}
