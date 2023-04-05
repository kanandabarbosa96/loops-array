package loops;

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantImpares = 0;
        int quantPares = 0;

        int count = 0;

        System.out.println("Quantidade de numeros: ");
        quantNumeros = scan.nextInt();

        do{
            System.out.println("numero: ");
            numero = scan.nextInt();
            if(numero % 2 == 0 ) quantPares++;
            else quantImpares++;

            count++;
        } while(count < quantNumeros);

        System.out.println("Quantidade par:" + quantPares);
        System.out.println("Quantidade impar: " +quantImpares);

    }
}
