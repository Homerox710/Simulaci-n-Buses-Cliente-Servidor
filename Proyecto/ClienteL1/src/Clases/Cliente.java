
package Clases;

import Interfaz.EstadoBus;
import Interfaz.SeleccionBus;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import javax.swing.JOptionPane;

public final class Cliente {

    public Socket cliente;//Cuando la conexión se estable vamos a tener los datos del cliente
    public ObjectInputStream in;//Este permite leer los datos que envía el cliente
    public ObjectOutputStream out;//Este permite escribir los datos que queremos enviar
    public String bus;
    public static Reloj reloj = new Reloj("5", "00", "00", "AM");//reloj, va a empezar a las 5:00 am

    public Cliente() {

        try {
            //Aquí hacemos la conexión con el servidor. Si trabajamos en la misma
            //maquina podemos usar la dirección 127.0.0.1 y 
            //debemos usar el mismo puerto que seleccionamos en el servidor
            cliente = new Socket(InetAddress.getByName("127.0.0.1"), 8765);
            inicializarFlujosDatos();
            iniciar();

        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    private void inicializarFlujosDatos() {
        try {
            //Creamos los flujos de datos con la información de la conexión del servidor
            out = new ObjectOutputStream(cliente.getOutputStream());
            in = new ObjectInputStream(cliente.getInputStream());
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public void iniciar() {

        SeleccionBus selec = new SeleccionBus();//ventana donde se escoje el bus que se quiere monitorear
        selec.setVisible(true);
        while (selec.isActive()) {
            //esta ventana estará activa hasta que se elija el bus
            if (selec.getBus() != null) {
                bus = selec.getBus();
                selec.dispose();
                enviarDatos(bus);//enviamos al servidor el dato del bus que queremos monitorear 
                startRastreo();
            }

        }

    }

    public void enviarDatos(String numbus) {
        try {
            out.writeUTF(numbus);//Escribimos la información que deseamos pasar
            out.flush();//Debemos usar el método flush para enviar los datos
            bus = numbus;
//            recibirDatos();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public String recibirDatos() {
        try {
            String info = in.readUTF();//Vamos a leer los datos que nos envía el server
            return info;
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return null;
    }
    //Después de recibir los datos podemos cerrar la conexión y todos los objetos relacionados a este chat.

    private void cerrar() {
        try {
            in.close();
            out.close();
            cliente.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    private void startRastreo() {

        EstadoBus estadob = new EstadoBus(bus);//ventana que nos mostrará las paradas por las que pasa el bus
        estadob.setVisible(true);
        reloj.start();//iniciamos el reloj
        while (!reloj.isFin()) {//mientras el reloj no haya llegado al final del día

            String lastParada = recibirDatos();//recibimos la ultima parada del bus que escogimos
            estadob.recorrido(lastParada);// el metodo recorrido imprime las paradas por donde se pasa
        }
        JOptionPane.showMessageDialog(null, "La ejecución ha terminado");
        estadob.dispose();
        cerrar();

    }

    public static void main(String[] args) {

        Cliente cliente = new Cliente();

    }
}
