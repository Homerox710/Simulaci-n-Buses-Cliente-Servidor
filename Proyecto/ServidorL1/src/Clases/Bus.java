package Clases;

import static Clases.Servidor.buses;
import static Clases.Servidor.paradas;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Bus extends Thread {

    private String marca;//marca del bus
    private int placa, modelo;
    private String lastParada;// última parada donde estuvo el bus
    private JLabel location; //pocicion del bus en el mapa
    private int parada; //parada en la que se encuentra
    private boolean parar = false;

    public Bus(String marca, int modelo, int placa) {

        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;

    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public boolean getParar() {
        return parar;
    }

    public void setParar(boolean parar) {
        this.parar = parar;
    }

    public int getParada() {
        return parada;
    }

    public void setParada(int parada) {
        this.parada = parada;
    }

    public String getLastParada() {
        return lastParada;
    }

    public void setLastParada(String lastParada) {
        this.lastParada = lastParada;
    }

//    public Parada getLastParada() {
//        return lastParada;
//    }
//
//    public void setLastParada(Parada lastParada) {
//        this.lastParada = lastParada;
//    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getNumero() {
        return placa;
    }

    public void setNumero(int placa) {
        this.placa = placa;
    }

    public JLabel getLocation() {
        return location;
    }

    public void setLocation(JLabel location) {
        this.location = location;
    }

    public boolean ocupada(int parada) {// verifica si la parada está ocupada por otro bus

        for (int i = 0; i < buses.size(); i++) {
            if (buses.get(i).getParada() == parada) {
                return true;
            }
        }
        return false;

    }

    public Bus sentar(int paradaa) {//buscamos el bus que está en la parada indicada 
        for (Bus bus : buses) {
            if (bus.parada == paradaa) {
                return bus;
            }
        }
        return null;
    }

    public void dormir() {//hacemos dormir el hilo
        try {
            Bus.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Bus.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //verifica si está en una parada 
    public void inParada() {

        Parada paradax;// creamos un objeto parada para poder devolver el nombre de la parada por donde pasó el bus
        Bus bus;
        try {
            //Paradas que se encuentran sobre y=50
            if (location.getY() == 50) {

                //primera parada, se encuentra en (100,50)
                if (location.getX() == 100) {

                    paradax = Servidor.paradas.get(0);
                    if (!ocupada(1)) {
                        parada = 1;
                        Bus.sleep(2000); // hacemos que el bus se detenga en la parada 
                    } else {
                        location.setLocation(location.getLocation().x + 100, location.getLocation().y);//Adelantamos el bus a la siguiente parada
                        bus = sentar(1);
                        bus.dormir();//buscamos el bus que está ocupando la parada y lo sentamos en la parada por unos segundos
                        JOptionPane.showMessageDialog(null, "Parada " + paradax.getNombre() + " ocupada, se le adelantará una parada al bus " + this.placa);

                    }

                    lastParada = paradas.get(0).getNombre();
                }
                //segunda parada, se encuentra en (200,50)
                if (location.getX() == 200) {
                    paradax = Servidor.paradas.get(1);
                    if (!ocupada(2)) {
                        parada = 2;
                        Bus.sleep(2000); // hacemos que el bus se detenga en la parada 
                    } else {

                        location.setLocation(location.getLocation().x + 100, location.getLocation().y);//Adelantamos el bus a la siguiente parada
                        bus = sentar(2);
                        bus.dormir();//buscamos el bus que está ocupando la parada y lo sentamos en la parada por unos segundos
                        JOptionPane.showMessageDialog(null, "Parada " + paradax.getNombre() + " ocupada, se le adelantará una parada al bus " + this.placa);

                    }

                    lastParada = paradas.get(1).getNombre();
                }
                //tercera parada, se encuentra en (300,50)
                if (location.getX() == 300) {
                    paradax = Servidor.paradas.get(2);
                    if (!ocupada(3)) {
                        parada = 3;
                        Bus.sleep(2000); // hacemos que el bus se detenga en la parada 
                    } else {
                        location.setLocation(location.getLocation().x + 100, location.getLocation().y);//Adelantamos el bus a la siguiente parada
                        bus = sentar(3);
                        bus.dormir();//buscamos el bus que está ocupando la parada y lo sentamos en la parada por unos segundos
                        JOptionPane.showMessageDialog(null, "Parada " + paradax.getNombre() + " ocupada, se le adelantará una parada al bus " + this.placa);

                    }

                    lastParada = paradas.get(2).getNombre();
                }
                //cuarta parada, se encuentra en (400,50)
                if (location.getX() == 400) {
                    paradax = Servidor.paradas.get(3);
                    if (!ocupada(4)) {
                        parada = 4;
                        Bus.sleep(2000); // hacemos que el bus se detenga en la parada 
                    } else {
                        location.setLocation(location.getLocation().x + 100, location.getLocation().y);//Adelantamos el bus a la siguiente parada
                        bus = sentar(4);
                        bus.dormir();//buscamos el bus que está ocupando la parada y lo sentamos en la parada por unos segundos
                        JOptionPane.showMessageDialog(null, "Parada " + paradax.getNombre() + " ocupada, se le adelantará una parada al bus " + this.placa);

                    }

                    lastParada = paradas.get(3).getNombre();
                }
                //quinta parada, se encuentra en (500,50)
                if (location.getX() == 500) {
                    paradax = Servidor.paradas.get(4);
                    if (!ocupada(5)) {
                        parada = 5;
                        Bus.sleep(2000); // hacemos que el bus se detenga en la parada
                    } else {
                        location.setLocation(location.getLocation().x + 100, location.getLocation().y);//Adelantamos el bus a la siguiente parada
                        bus = sentar(5);
                        bus.dormir();//buscamos el bus que está ocupando la parada y lo sentamos en la parada por unos segundos
                        JOptionPane.showMessageDialog(null, "Parada " + paradax.getNombre() + " ocupada, se le adelantará una parada al bus " + this.placa);

                    }

                    lastParada = paradas.get(4).getNombre();
                }
                //sexta parada, se encuentra en (600,50)
                if (location.getX() == 600) {
                    paradax = Servidor.paradas.get(5);
                    if (!ocupada(6)) {
                        parada = 6;
                        Bus.sleep(2000); // hacemos que el bus se detenga en la parada 
                    } else {
                        location.setLocation(location.getLocation().x + 100, location.getLocation().y);//Adelantamos el bus a la siguiente parada
                        bus = sentar(6);
                        bus.dormir();//buscamos el bus que está ocupando la parada y lo sentamos en la parada por unos segundos
                        JOptionPane.showMessageDialog(null, "Parada " + paradax.getNombre() + " ocupada, se le adelantará una parada al bus " + this.placa);

                    }

                    lastParada = paradas.get(5).getNombre();
                }
                //septima parada, se encuentra en (700,50)
                if (location.getX() == 700) {
                    paradax = Servidor.paradas.get(6);
                    if (!ocupada(7)) {
                        parada = 7;
                        Bus.sleep(2000); // hacemos que el bus se detenga en la parada 
                    } else {
                        location.setLocation(location.getLocation().x + 30, location.getLocation().y + 50);//Adelantamos el bus a la siguiente parada
                        bus = sentar(7);
                        bus.dormir();//buscamos el bus que está ocupando la parada y lo sentamos en la parada por unos segundos
                        JOptionPane.showMessageDialog(null, "Parada " + paradax.getNombre() + " ocupada, se le adelantará una parada al bus " + this.placa);

                    }

                    lastParada = paradas.get(6).getNombre();
                }
            }
            //Paradas que se encuentran sobre x=730
            if (location.getX() == 730) {
                //octava parada, se encuentra en (730,100)
                if (location.getY() == 100) {
                    paradax = Servidor.paradas.get(7);
                    if (!ocupada(8)) {
                        parada = 8;
                        Bus.sleep(2000); // hacemos que el bus se detenga en la parada /
                    } else {
                        location.setLocation(location.getLocation().x, location.getLocation().y + 100);//Adelantamos el bus a la siguiente parada
                        bus = sentar(8);
                        bus.dormir();//buscamos el bus que está ocupando la parada y lo sentamos en la parada por unos segundos
                        JOptionPane.showMessageDialog(null, "Parada " + paradax.getNombre() + " ocupada, se le adelantará una parada al bus " + this.placa);

                    }

                    lastParada = paradas.get(7).getNombre();
                }
                //novena parada, se encuentra en (730,200)
                if (location.getY() == 200) {
                    paradax = Servidor.paradas.get(8);
                    if (!ocupada(9)) {
                        parada = 9;
                        Bus.sleep(2000); // hacemos que el bus se detenga en la parada 
                    } else {
                        location.setLocation(location.getLocation().x, location.getLocation().y + 100);//Adelantamos el bus a la siguiente parada
                        bus = sentar(9);
                        bus.dormir();//buscamos el bus que está ocupando la parada y lo sentamos en la parada por unos segundos
                        JOptionPane.showMessageDialog(null, "Parada " + paradax.getNombre() + " ocupada, se le adelantará una parada al bus " + this.placa);

                    }

                    lastParada = paradas.get(8).getNombre();
                }
                //decima parada, se encuentra en (730,300)
                if (location.getY() == 300) {
                    paradax = Servidor.paradas.get(9);
                    if (!ocupada(10)) {
                        parada = 10;
                        Bus.sleep(2000); // hacemos que el bus se detenga en la parada
                    } else {
                        location.setLocation(location.getLocation().x - 30, location.getLocation().y + 60);//Adelantamos el bus a la siguiente parada
                        bus = sentar(10);
                        bus.dormir();//buscamos el bus que está ocupando la parada y lo sentamos en la parada por unos segundos
                        JOptionPane.showMessageDialog(null, "Parada " + paradax.getNombre() + " ocupada, se le adelantará una parada al bus " + this.placa);

                    }
                    lastParada = paradas.get(9).getNombre();
                }
            }
            //Paradas que se encuentran sobre x=360
            if (location.getY() == 360) {
                //parada once, se encuentra en (100,360)
                if (location.getX() == 100) {
                    paradax = Servidor.paradas.get(10);
                    if (!ocupada(11)) {
                        parada = 11;
                        Bus.sleep(2000); // hacemos que el bus se detenga en la parada 
                    } else {
                        location.setLocation(location.getLocation().x - 20, location.getLocation().y - 60);//Adelantamos el bus a la siguiente parada
                        bus = sentar(11);
                        bus.dormir();//buscamos el bus que está ocupando la parada y lo sentamos en la parada por unos segundos
                        JOptionPane.showMessageDialog(null, "Parada " + paradax.getNombre() + " ocupada, se le adelantará una parada al bus " + this.placa);

                    }
                    lastParada = paradas.get(10).getNombre();
                }
                //parada doce, se encuentra en (200,360)
                if (location.getX() == 200) {
                    paradax = Servidor.paradas.get(11);
                    if (!ocupada(12)) {
                        parada = 12;
                        Bus.sleep(2000); // hacemos que el bus se detenga en la parada 
                    } else {
                        location.setLocation(location.getLocation().x - 100, location.getLocation().y);//Adelantamos el bus a la siguiente parada
                        bus = sentar(12);
                        bus.dormir();//buscamos el bus que está ocupando la parada y lo sentamos en la parada por unos segundos
                        JOptionPane.showMessageDialog(null, "Parada " + paradax.getNombre() + " ocupada, se le adelantará una parada al bus " + this.placa);

                    }
                    lastParada = paradas.get(11).getNombre();
                }
                //parada trece, se encuentra en (300,360)
                if (location.getX() == 300) {
                    paradax = Servidor.paradas.get(12);
                    if (!ocupada(13)) {
                        parada = 13;
                        Bus.sleep(2000); // hacemos que el bus se detenga en la parada 
                    } else {
                        location.setLocation(location.getLocation().x - 100, location.getLocation().y);//Adelantamos el bus a la siguiente parada
                        bus = sentar(13);
                        bus.dormir();//buscamos el bus que está ocupando la parada y lo sentamos en la parada por unos segundos
                        JOptionPane.showMessageDialog(null, "Parada " + paradax.getNombre() + " ocupada, se le adelantará una parada al bus " + this.placa);

                    }
                    lastParada = paradas.get(12).getNombre();
                }
                //parada catorce, se encuentra en (400,360)
                if (location.getX() == 400) {
                    paradax = Servidor.paradas.get(13);
                    if (!ocupada(14)) {
                        parada = 14;
                        Bus.sleep(2000); // hacemos que el bus se detenga en la parada 
                    } else {
                        location.setLocation(location.getLocation().x - 100, location.getLocation().y);//Adelantamos el bus a la siguiente parada
                        bus = sentar(14);
                        bus.dormir();//buscamos el bus que está ocupando la parada y lo sentamos en la parada por unos segundos
                        JOptionPane.showMessageDialog(null, "Parada " + paradax.getNombre() + " ocupada, se le adelantará una parada al bus " + this.placa);

                    }
                    lastParada = paradas.get(13).getNombre();
                }
                //parada quince, se encuentra en (500,360)
                if (location.getX() == 500) {
                    paradax = Servidor.paradas.get(14);
                    if (!ocupada(15)) {
                        parada = 15;
                        Bus.sleep(2000); // hacemos que el bus se detenga en la parada 
                    } else {
                        location.setLocation(location.getLocation().x - 100, location.getLocation().y);//Adelantamos el bus a la siguiente parada
                        bus = sentar(15);
                        bus.dormir();//buscamos el bus que está ocupando la parada y lo sentamos en la parada por unos segundos
                        JOptionPane.showMessageDialog(null, "Parada " + paradax.getNombre() + " ocupada, se le adelantará una parada al bus " + this.placa);

                    }
                    lastParada = paradas.get(14).getNombre();
                }
                //parada diesciseis, se encuentra en (600,360)
                if (location.getX() == 600) {
                    paradax = Servidor.paradas.get(15);
                    if (!ocupada(16)) {
                        parada = 16;
                        Bus.sleep(2000); // hacemos que el bus se detenga en la parada 
                    } else {
                        location.setLocation(location.getLocation().x - 100, location.getLocation().y);//Adelantamos el bus a la siguiente parada
                        bus = sentar(16);
                        bus.dormir();//buscamos el bus que está ocupando la parada y lo sentamos en la parada por unos segundos
                        JOptionPane.showMessageDialog(null, "Parada " + paradax.getNombre() + " ocupada, se le adelantará una parada al bus " + this.placa);

                    }
                    lastParada = paradas.get(15).getNombre();
                }
                //parada diescisiete, se encuentra en (700,360)
                if (location.getX() == 700) {
                    paradax = Servidor.paradas.get(16);
                    if (!ocupada(17)) {
                        parada = 17;
                        Bus.sleep(2000); // hacemos que el bus se detenga en la parada
                    } else {
                        location.setLocation(location.getLocation().x - 100, location.getLocation().y);//Adelantamos el bus a la siguiente parada
                        bus = sentar(17);
                        bus.dormir();//buscamos el bus que está ocupando la parada y lo sentamos en la parada por unos segundos
                        JOptionPane.showMessageDialog(null, "Parada " + paradax.getNombre() + " ocupada, se le adelantará una parada al bus " + this.placa);

                    }
                    lastParada = paradas.get(16).getNombre();
                }

            }

            //Paradas que se encuentran sobre x=80
            if (location.getX() == 80) {
                //parada diesciocho, se encuentra en (80,100)
                if (location.getY() == 100) {
                    paradax = Servidor.paradas.get(17);
                    if (!ocupada(18)) {
                        parada = 18;
                        Bus.sleep(2000); // hacemos que el bus se detenga en la parada 
                    } else {
                        location.setLocation(location.getLocation().x + 20, location.getLocation().y - 50);//Adelantamos el bus a la siguiente parada
                        bus = sentar(18);
                        bus.dormir();//buscamos el bus que está ocupando la parada y lo sentamos en la parada por unos segundos
                        JOptionPane.showMessageDialog(null, "Parada " + paradax.getNombre() + " ocupada, se le adelantará una parada al bus " + this.placa);

                    }
                    lastParada = paradas.get(17).getNombre();
                }
                //parada diescinueve, se encuentra en (80,200)
                if (location.getY() == 200) {
                    paradax = Servidor.paradas.get(18);
                    if (!ocupada(19)) {
                        parada = 19;
                        Bus.sleep(2000); // hacemos que el bus se detenga en la parada
                    } else {
                        location.setLocation(location.getLocation().x, location.getLocation().y - 100);//Adelantamos el bus a la siguiente parada
                        bus = sentar(19);
                        bus.dormir();//buscamos el bus que está ocupando la parada y lo sentamos en la parada por unos segundos
                        JOptionPane.showMessageDialog(null, "Parada " + paradax.getNombre() + " ocupada, se le adelantará una parada al bus " + this.placa);

                    }
                    lastParada = paradas.get(18).getNombre();
                }
                //parada veinte, se encuentra en (80,300)
                if (location.getY() == 300) {
                    paradax = Servidor.paradas.get(19);
                    if (!ocupada(20)) {// verifica si la parada no está ocupada
                        parada = 20;
                        Bus.sleep(2000); // hacemos que el bus se detenga en la parada 
                    } else {
                        location.setLocation(location.getLocation().x, location.getLocation().y - 100);//Adelantamos el bus a la siguiente parada
                        bus = sentar(20);
                        bus.dormir();//buscamos el bus que está ocupando la parada y lo sentamos en la parada por unos segundos
                        JOptionPane.showMessageDialog(null, "Parada " + paradax.getNombre() + " ocupada, se le adelantará una parada al bus " + this.placa);

                    }
                    lastParada = paradas.get(19).getNombre();
                }
            }
        } catch (InterruptedException | NullPointerException e) {
        }
    }

    @Override
    public void run() {

        while (!parar) {

            this.inParada();
            parada = 0;
            //Borde izq
            if (location.getX() == 80) {

                //Si el bus llega al borde superior izq aumenta Y
                if (location.getY() == 50) {

                    location.setLocation(location.getLocation().x + 10, location.getLocation().y);

                }

                //Si el bus llega al bode inferior Izq aumenta  X
                if (location.getY() == 360) {

                    location.setLocation(location.getLocation().x, location.getLocation().y - 10);
                }

                location.setLocation(location.getLocation().x, location.getLocation().y - 10);

            }

            //borde derecho
            if (location.getX() == 730) {

                //Si el bus llega al maximo del borde derecho inferior
                if (location.getY() == 360) {
                    location.setLocation(location.getLocation().x - 10, location.getLocation().y);
                }
                //Si el bus llega al borde superior disminuye x
                if (location.getY() == 50) {
                    location.setLocation(location.getLocation().x, location.getLocation().y + 10);

                }

                location.setLocation(location.getLocation().x, location.getLocation().y + 10);

            }

            //Borde superior
            if (location.getY() == 50) {

                //Si el bus está en el borde derecho disminuye x
                if (location.getX() == 730) {
                    location.setLocation(location.getLocation().x, location.getLocation().y + 10);
                }

                if (location.getX() == 80) {
                    location.setLocation(location.getLocation().x + 10, location.getLocation().y);
                }
                location.setLocation(location.getLocation().x + 10, location.getLocation().y);

            }

            //Borde inferior
            if (location.getY() == 360) {

                if (location.getX() == 80) {
                    location.setLocation(location.getLocation().x + 10, location.getLocation().y);
                }
                //Si el bus está en el borde derecho aumenta y
                if (location.getX() == 730) {
                    location.setLocation(location.getLocation().x - 10, location.getLocation().y);
                }

                location.setLocation(location.getLocation().x - 10, location.getLocation().y);

            }
            try {

                Bus.sleep((int) (Math.random() * 500));
            } catch (InterruptedException | NullPointerException e) {
            }
        }

    }
}
