package portugues;

import java.util.Scanner;

public class Verificar {

    public static void main(String[] args) {
        Portugues c = new Portugues();
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o texto:   ");
        c.texto = ler.nextLine();
        c.brancos();
        c.vogais();
        c.letras();
        System.out.println("O Texto tem " + c.totalvogais + " Vogais " + " e " + c.caracteres + " Caracteres " + " e " + c.totalbrancos + " Espacos em branco!!" );

    }

}
