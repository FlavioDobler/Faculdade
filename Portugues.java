package portugues;

public class Portugues {

    String texto;
    int totalbrancos = 0;
    int totalvogais = 0;
    int caracteres;
  
    int vogais() {
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                totalvogais++;
            }
        }
        return totalvogais;

    }

    int brancos() {
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == ' ') {
                totalbrancos++;
            }
        }
        return totalbrancos;
    }

    int letras() {
        caracteres = texto.length();
        return caracteres;
    }

}
