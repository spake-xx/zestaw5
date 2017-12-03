import java.util.Scanner;

public class zad1 {
    private static int silnia(int n){
        if(n==1) return 1;
        return n*silnia(n-1);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int x = reader.nextInt();
        System.out.println(silnia(x));

        int silnia = 1;
        for(int i=x; i>0; i--){
            silnia*=i;
        }

        System.out.println(silnia);
    }
}
