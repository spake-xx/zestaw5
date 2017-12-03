import java.util.Scanner;

public class zad2 {
    private static int fibb(int n){
        if(n==0) return 1;
        if(n==1) return 2;
        return fibb(n-2)+fibb(n-1);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int x = reader.nextInt();
        System.out.println(fibb(x));

        int poprzedni = 0;
        int fibb = 0;
        int poprzedni2 = 0;
        for(int i=0; i<=x; i++){
            poprzedni2 = poprzedni;
            poprzedni = fibb;
            if(i==0) fibb = 1;
            if(i==1) fibb = 2;
            if(i>1) fibb = poprzedni+poprzedni2;
        }

        System.out.println(fibb);
    }
}
