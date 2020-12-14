
package Clases;

import Interfaz.Mapa;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Elias
 */
public class Servidor {

    //listas que van a almacenar los buses y las paradas
    public static List<Parada> paradas = new ArrayList<Parada>();
    public static List<Bus> buses = new ArrayList<Bus>();

    //buses que correrán en el mapa
    public static Bus bus1 = new Bus("Marcopolo", 2020, 1);
    public static Bus bus2 = new Bus("Marcopolo", 2020, 2);
    public static Bus bus3 = new Bus("Marcopolo", 2020, 3);
    public static Bus bus4 = new Bus("Marcopolo", 2020, 4);
    public static Bus bus5 = new Bus("Marcopolo", 2020, 5);
    public static Bus bus6 = new Bus("Marcopolo", 2020, 6);
    public static Bus bus7 = new Bus("Marcopolo", 2020, 7);
    public static Bus bus8 = new Bus("Marcopolo", 2020, 8);
    public static Bus bus9 = new Bus("Marcopolo", 2020, 9);
    public static Bus bus10 = new Bus("Marcopolo", 2020, 10);

    private int bus;//este entero va a referenciar el numero del bus que vamos a controlar
    private ServerSocket conexion;//Este objeto nos permite establecer la conexión con el usuario
    private Socket cliente;//Cuando la conexión se estable vamos a tener los datos del cliente
    private ObjectInputStream lecturaDatos;//Este permite leer los datos que envía el cliente
    private ObjectOutputStream escrituraDatos;//Este permite escribir los datos que queremos enviar

    public Servidor() {
        try {
            //Se crea el objeto para escuchar por el puerto 8765
            conexion = new ServerSocket(8765);
            realizarConexion();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public int getBus() {
        return bus;
    }

    public void setBus(int bus) {
        this.bus = bus;
    }

    //Debemos esperar que un cliente quiera conectarse al servidor
    private void realizarConexion() {
        charge();
        Icon icono = new ImageIcon(getClass().getResource("imgmensaje.jpg"));
        JOptionPane.showMessageDialog(null, "", "Mensaje", JOptionPane.PLAIN_MESSAGE, icono);
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
    public void enviarDato(final String dato) {
        try {
            //Para poder enviar los datos usamos el outputStream y escribimos lo que necesitamos
            escrituraDatos.writeUTF(dato);
            escrituraDatos.flush();//Debemos usar el método flush para enviar los datos
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    //Los datos que envía el cliente pueden ser leídos por medio de este método.
    public void recibirDatos() {
        try {
            //Leemos los datos y los almacenamos en una variable String
            String info = lecturaDatos.readUTF();
            bus = Integer.parseInt(info) - 1;
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    private void startBuses() {
        try {
            for (int i = 0; i < buses.size(); i++) {
                buses.get(i).start();
            }
        } catch (IllegalThreadStateException e) {

        }
    }

    private void sendBusData() {
        Mapa mapa = new Mapa();
        mapa.setVisible(true);
        startBuses();
        while (cliente.isConnected()) {
            
            if (buses.get(bus).getLastParada() != null) {
                String lastparada = buses.get(bus).getLastParada();
                enviarDato(lastparada);
            }
//           
        }
        mapa.dispose();
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

    public void charge() {

        buses.add(bus1);
        buses.add(bus2);
        buses.add(bus3);
        buses.add(bus4);
        buses.add(bus5);
        buses.add(bus6);
        buses.add(bus7);
        buses.add(bus8);
        buses.add(bus9);
        buses.add(bus10);

        //Se crean todas las paradas 
        Parada parada1 = new Parada("Ciudad Deportiva Rafael Ángel Pérez");
        Parada parada2 = new Parada("Super Lian, Hatillo");
        Parada parada3 = new Parada("Plasticos Tosso");
        Parada parada4 = new Parada("Parqueo de Yamuni");
        Parada parada5 = new Parada("Colegio María Auxiliadora");
        Parada parada6 = new Parada("Escuela Juan Rafael Mora,");
        Parada parada7 = new Parada("Hotel Caribbean, Amón");
        Parada parada8 = new Parada("Parque San Francisco");
        Parada parada9 = new Parada("Liceo Nocturno José Joaquín Jiménez Nuñez");
        Parada parada10 = new Parada("Acueductos Y Alcantarillados Guadalupe");
        Parada parada11 = new Parada("Rotonda De Betania");
        Parada parada12 = new Parada("Colegio Salesiano Don Bosco");
        Parada parada13 = new Parada("Escuela Republica Dominicana");
        Parada parada14 = new Parada("Abastecedor Los Sauces");
        Parada parada15 = new Parada("Parque De Monte Azul");
        Parada parada16 = new Parada("Cevichería Costa Azul");
        Parada parada17 = new Parada("Taller Gernon");
        Parada parada18 = new Parada("Plaza América");
        Parada parada19 = new Parada("Rest. La Fortuna, Hatillo 4");
        Parada parada20 = new Parada("Terminal Hatillo");

        //agregamos las paradas a la lista de paradas
        paradas.add(parada1);
        paradas.add(parada2);
        paradas.add(parada3);
        paradas.add(parada4);
        paradas.add(parada5);
        paradas.add(parada6);
        paradas.add(parada7);
        paradas.add(parada8);
        paradas.add(parada9);
        paradas.add(parada10);
        paradas.add(parada11);
        paradas.add(parada12);
        paradas.add(parada13);
        paradas.add(parada14);
        paradas.add(parada15);
        paradas.add(parada16);
        paradas.add(parada17);
        paradas.add(parada18);
        paradas.add(parada19);
        paradas.add(parada20);
    }

    public static void main(String[] args) {

        Servidor server = new Servidor();
        server.charge();
        server.recibirDatos();
        server.sendBusData();
        server.cerrar();
    }

}
