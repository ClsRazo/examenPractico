public class Programa3_Cuenta {
    //Constante para los segundos
    private static final int SEGUNDOS = 60;

    public static void main(String[] args){
        //Definimos el hilo
        Thread hilo = new Thread(()->{
            for(int i=SEGUNDOS; i>0; i--){
                System.out.println(i);

                try{
                    //Esperamos un segundo antes de imprimir de nuevo
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    //Salimos del ciclo si el hilo es interrumpido
                    Thread.currentThread().interrupt();
                    System.out.println("Cuenta regresiva interrumpida");
                    return;
                }
            }
            System.out.println("\nTiempo terminado\n");
        }, "cuenta-regresiva");

        //Iniciamos el hilo
        hilo.start();

        try{
            hilo.join();
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }

        System.out.println("Programa terminado");
    }
}
