import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Programa2_Cliente{
    public static void main(String[] args){
        String host = "localhost";
        int puerto = 5000;

        try(
            Socket socket = new Socket(host, puerto);
            PrintWriter salida = new PrintWriter(socket.getOutputStream(), true)
        ){
            salida.println("Hola mundo");
            System.out.println("Mensaje enviado al servidor!");
        }catch(IOException e){
            System.err.println("Error en el cliente: " + e.getMessage());
        }
    }
}
