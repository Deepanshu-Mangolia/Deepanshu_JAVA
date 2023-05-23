import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner Obj = new Scanner(System.in);
        System.out.println("Enter Number of Thread ");
        int a = Obj.nextInt();
        Runnable R2 = new FileWriting(a);
        
        Thread[] T = new Thread[a];
        for (int i = 0; i < a; i++)
        {
            T[i] = new Thread(R2);
            T[i].start();
        }
    }
}
