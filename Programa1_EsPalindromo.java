import java.util.Scanner;

public class Programa1_EsPalindromo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String frase;

        //Para evitar cadenas de longitud cero
        do{
            System.out.println("Introduce la frase o palabra a verificar si es palindromo:");
            frase = sc.nextLine();
        }while(frase.isBlank());
        
        //Convertimos la frase a minusculas y eliminamos los espacios
        if(verificarPalindromo(frase.toLowerCase().replaceAll("\\s", ""))){
            System.out.println("La frase introducida si es palindromo!");
        }else{
            System.out.println("La frase introduca no es palindromo!");
        }

        sc.close();
    }

    public static boolean verificarPalindromo(String frase){
        //Si es palindromo, basta con verificar hasta la mitad de la cadena
        for(int i=0; i<frase.length()/2; i++){
            if(frase.charAt(i) != frase.charAt(frase.length()-i-1)){
                return false;
            }
        }

        return true;
    }
}