import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Programa2_Servidor{
    public static void main(String[] args){
        int puerto = 5000;

        try (
            ServerSocket servidor = new ServerSocket(puerto)
        ){
            //Esperamos a que un cliente se conecte
            System.out.println("Servidor esperando conexion en el puerto " + puerto + "...");

            try(
                //Aceptamos la conexion del cliente
                Socket cliente = servidor.accept();
                BufferedReader entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()))
            ){
                //Recibimos el mensaje
                System.out.println("Cliente conectado desde: " + cliente.getInetAddress());
                String mensaje = entrada.readLine();
                System.out.println("Mensaje recibido: " + mensaje);
            }
        }catch(IOException e){
            System.err.println("Error en el servidor: " + e.getMessage());
        }
    }
}
