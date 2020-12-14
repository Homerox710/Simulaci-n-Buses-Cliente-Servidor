package Prueba;
// correr esta clase para probar el funcionamiento del envío de datos al cliete

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JOptionPane;

/**
 *
 * @author Elias
 */
public class ServidorPrueba {

    public ServerSocket conexion;//Este objeto nos permite establecer la conexión con el usuario
    public Socket cliente;//Cuando la conexión se estable vamos a tener los datos del cliente
    public ObjectInputStream lecturaDatos;//Este permite leer los datos que envía el cliente
    public ObjectOutputStream escrituraDatos;//Este permite escribir los datos que queremos enviar

    public ServidorPrueba() {
        try {
            //Se crea el objeto para escuchar por el puerto 8765
            conexion = new ServerSocket(8765);
            realizarConexion();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    //Debemos esperar que un cliente quiera conectarse al servidor
    private void realizarConexion() {
        try {
            cliente = conexion.accept();//El método accept espera la conexión del cliente
            //Con la información de la conexión podemos crear los objetos de lectura y escritura
            lecturaDatos = new ObjectInputStream(cliente.getInputStream());
            escrituraDatos = new ObjectOutputStream(cliente.getOutputStream());
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    //Este método puede enviar los datos desde el server a los clientes
    public void enviarRespuesta(final String dato) {
        try {

            escrituraDatos.writeUTF(dato);
            escrituraDatos.flush();//Debemos usar el método flush para enviar los datos
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    //Los datos que envía el cliente pueden ser leídos por medio de este método.
    public String recibirDatos() {
        try {

            //Leemos los datos y los almacenamos en una variable String
            String info = lecturaDatos.readUTF();
            return info;
//            enviarRespuesta("Hola servidor vio tu mensaje");
//            cerrar();
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return null;
    }

    //Después de recibir los datos podemos cerrar la conexión y todos los objetos relacionados a este chat.
    private void cerrar() {
        try {
            lecturaDatos.close();
            escrituraDatos.close();
            cliente.close();
            conexion.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) {
        ServidorPrueba servidor = new ServidorPrueba();

        String mensaje;
        JOptionPane.showMessageDialog(null,"Esperando el cliente");
        while (servidor.cliente.isConnected()) {
            mensaje = JOptionPane.showInputDialog("Escriba algo");
            servidor.enviarRespuesta(mensaje);
        }
        JOptionPane.showMessageDialog(null, "Cliente desconectado");
        servidor.cerrar();
    }
}
