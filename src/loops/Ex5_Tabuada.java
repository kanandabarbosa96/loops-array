package loops;

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("tabuada: ");
        int tabuada = scan.nextInt();


        System.out.println("Tabuada" + tabuada);

        for(int i = 1 ;i <= 10 ;i = i + 1 ){
            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
        }
    }
}