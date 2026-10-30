import java.util.Scanner;

public class Programa4_InvertirTexto {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String texto;

        do{
            System.out.println("Introduce el texto a invertir:");
            texto = sc.nextLine();
        }while(texto.isBlank());

        sc.close();

        System.out.println("Texto invertido: " + invertir(texto));
    }

    public static String invertir(String texto) {
        StringBuilder resultado = new StringBuilder();

        //Recorremos y agregamos los caracteres del texto en orden inverso
        for(int i=texto.length()-1; i>=0; i--){
            resultado.append(texto.charAt(i));
        }
        return resultado.toString();
    }
}
