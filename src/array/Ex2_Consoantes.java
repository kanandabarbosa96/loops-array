package array;

import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantConsoantes = 0;

        int count = 0;

        System.out.println();
        do{
            System.out.println("Letra");
            String letra = scan.next();

            if(!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))) {
                consoantes[count] = letra;
                quantConsoantes++;
            }
            count++;
        }while(count < consoantes.length);

        System.out.println("consoantes:");
        for (String consoante: consoantes) {
            if ( consoante != null)
            System.out.println(consoante +" ");
        }
        System.out.println("Quantidade de consoantes: " + quantConsoantes);
    }
}
